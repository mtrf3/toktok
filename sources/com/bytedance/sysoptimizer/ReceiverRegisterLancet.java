package com.bytedance.sysoptimizer;

import X.C16880lQ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class ReceiverRegisterLancet {
    public static String TAG = "ReceiverRegisterLancet";
    public static Handler sMainHandler;
    public static volatile Handler sReceiverHandler;
    public static HandlerThread sReceiverHandlerThread;

    public static void initHandler() {
        if (sReceiverHandler == null) {
            synchronized (ReceiverRegisterLancet.class) {
                if (sReceiverHandler == null) {
                    HandlerThread handlerThread = new HandlerThread("ReceiverHandler");
                    sReceiverHandlerThread = handlerThread;
                    handlerThread.start();
                    sMainHandler = new Handler(C16880lQ.LLJJJJ());
                    sReceiverHandler = new Handler(sReceiverHandlerThread.getLooper()) { // from class: com.bytedance.sysoptimizer.ReceiverRegisterLancet.1
                        @Override // android.os.Handler
                        public void dispatchMessage(Message message) {
                            Runnable callback = message.getCallback();
                            if (callback != null) {
                                try {
                                    callback.run();
                                    return;
                                } catch (Exception unused) {
                                    ReceiverRegisterLancet.sMainHandler.post(callback);
                                    return;
                                }
                            }
                            super.dispatchMessage(message);
                        }
                    };
                }
            }
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        loge(broadcastReceiver, false);
    }

    public static int logCat(String str, String str2) {
        return Log.e(str, str2);
    }

    public static void loge(BroadcastReceiver broadcastReceiver, boolean z) {
        String str;
        ReceiverLogInterface receiverLogInterface = ReceiverRegisterCrashOptimizer.sReceiverLogInterface;
        if (receiverLogInterface != null && receiverLogInterface.enable()) {
            if (broadcastReceiver != null) {
                str = broadcastReceiver.toString();
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                Log.e("dy_receiver_monitor", Arrays.toString(C16880lQ.LLLLIIIILLL().getStackTrace()));
            }
            if (z) {
                ReceiverRegisterCrashOptimizer.sReceiverLogInterface.onRegister(str);
            } else {
                ReceiverRegisterCrashOptimizer.sReceiverLogInterface.onUnRegister(str);
            }
        }
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                initHandler();
                return C16880lQ.LJJLIIIJJI((Context) new Object(), broadcastReceiver, intentFilter, sReceiverHandler);
            }
            return (Intent) new Object();
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                initHandler();
                return C16880lQ.LJJLIIIJJI((Context) new Object(), broadcastReceiver, intentFilter, sReceiverHandler);
            }
            return (Intent) new Object();
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, i);
            }
            throw e;
        }
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            return (Intent) new Object();
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            }
            throw e;
        }
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            return (Intent) new Object();
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
            }
            throw e;
        }
    }
}
