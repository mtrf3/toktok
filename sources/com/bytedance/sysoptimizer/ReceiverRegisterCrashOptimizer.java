package com.bytedance.sysoptimizer;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes11.dex */
public class ReceiverRegisterCrashOptimizer {
    public static Application sApplication;
    public static DoRegisterHandlerCallback sDoRegisterHandlerCallback;
    public static ReceiverLogInterface sReceiverLogInterface;

    /* loaded from: classes11.dex */
    public interface DoRegisterHandlerCallback {
        boolean shouldDoRegisterHandler();
    }

    public static void doHWReceiverFix() {
        Application application = sApplication;
        if (application == null) {
            return;
        }
        HWReceiverCrashOptimizer.fix(application);
    }

    public static boolean doRegisterHandler() {
        DoRegisterHandlerCallback doRegisterHandlerCallback = sDoRegisterHandlerCallback;
        if (doRegisterHandlerCallback == null) {
            return false;
        }
        return doRegisterHandlerCallback.shouldDoRegisterHandler();
    }

    public static boolean fixedOpen() {
        if (sApplication != null) {
            return true;
        }
        return false;
    }

    public static void fix(Application application) {
        sApplication = application;
    }

    public static void setDoRegisterHandlerCallback(DoRegisterHandlerCallback doRegisterHandlerCallback) {
        sDoRegisterHandlerCallback = doRegisterHandlerCallback;
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return application.getBaseContext().registerReceiver(broadcastReceiver, intentFilter);
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return application.getBaseContext().registerReceiver(broadcastReceiver, intentFilter, i);
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return application.getBaseContext().registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return application.getBaseContext().registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
    }
}
