package com.lee.robotiumforas;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;


import com.robotium.solo.Solo;

import org.junit.Test;

/**
 * Created by lee on 2017/4/16.
 */

public class TestDemo extends ActivityInstrumentationTestCase2 {

    // 启动Activity
    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.lee.robotiumforas.MainActivity";
    private static Class<?> launcherActivityClass;

    static {
        try {
            // 通过反射的方法找到启动类的Class
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static final String TAG = "TestDemo";
    private Solo solo;

    public TestDemo() {
        super(launcherActivityClass);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation()); //出事哈solo，并启动界面
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    @Test
    public void testClick() {
        solo.clickOnButton("点我一下");
        Log.i(TAG, "testClick: 点我一下");
        assertTrue("Toast is not found",solo.waitForText("别点我啦…"));
    }
}
