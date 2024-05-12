package com.bytedance.sysoptimizer.java;

import X.C16880lQ;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes7.dex */
public class AndroidNWindowManagerProtector {
    public static GuardListener guardListener;
    public static int retryCount;

    /* loaded from: classes7.dex */
    public interface GuardListener {
        void onGuardFailed();

        void onGuardSuccess();
    }

    public static void resetRetryCount() {
        if (retryCount > 0) {
            retryCount = 0;
        }
        GuardListener guardListener2 = guardListener;
        if (guardListener2 != null) {
            guardListener2.onGuardSuccess();
        }
    }

    public static void takeOverSystemCallback() {
        Handler handler;
        Object invokeStaticMethod = ReflectionUtils.invokeStaticMethod("android.app.ActivityThread", "currentActivityThread");
        if (invokeStaticMethod != null && (handler = (Handler) ReflectionUtils.getFieldObject("android.app.ActivityThread", "mH", invokeStaticMethod)) != null) {
            ReflectionUtils.setFieldObject(handler, "mCallback", new CrashGuardCallback(handler, (Handler.Callback) ReflectionUtils.getFieldObject("android.app.ActivityThread$H", "mCallback", handler)));
        }
    }

    /* loaded from: classes7.dex */
    public static class CrashGuardCallback implements Handler.Callback {
        public Handler.Callback originCallBack;
        public Handler systemHandler;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                Handler.Callback callback = this.originCallBack;
                if (callback != null && callback.handleMessage(message)) {
                    AndroidNWindowManagerProtector.resetRetryCount();
                    return true;
                }
                Handler handler = this.systemHandler;
                if (handler != null) {
                    handler.handleMessage(message);
                    AndroidNWindowManagerProtector.resetRetryCount();
                }
                return true;
            } catch (Throwable th) {
                if (th instanceof StackOverflowError) {
                    if (message != null && message.what == 100 && !AndroidNWindowManagerProtector.retryWhenWindowManagerStackOverFlow(message, this.systemHandler)) {
                        GuardListener guardListener = AndroidNWindowManagerProtector.guardListener;
                        if (guardListener != null) {
                            guardListener.onGuardFailed();
                        }
                        throw th;
                    }
                    return false;
                }
                throw th;
            }
        }

        public CrashGuardCallback(Handler handler, Handler.Callback callback) {
            this.systemHandler = handler;
            this.originCallBack = callback;
        }
    }

    public static void install(GuardListener guardListener2) {
        int i = Build.VERSION.SDK_INT;
        if (i == 24 || i == 25) {
            takeOverSystemCallback();
            guardListener = guardListener2;
        }
    }

    public static boolean retryWhenWindowManagerStackOverFlow(Message message, Handler handler) {
        if (retryCount <= 3) {
            try {
                Thread.sleep(20L);
                Message message2 = new Message();
                message2.copyFrom(message);
                handler.sendMessage(message2);
                retryCount++;
                return true;
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        }
        return false;
    }
}
