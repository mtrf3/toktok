package com.bytedance.vmsdk.jsbridge.utils;

import X.C03880Dg;
import X.C65300Pk0;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class SystemMessageHandler extends Handler {
    public final long LIZ;
    public boolean LIZIZ = true;
    public Method LIZJ;
    public boolean LIZLLL;

    public static void LIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-2373567425149090481")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    private native void nativeRunWork(long j);

    private void stop() {
        this.LIZIZ = false;
    }

    private void scheduleWork() {
        Message obtain = Message.obtain();
        obtain.what = 1;
        if (Build.VERSION.SDK_INT >= 22) {
            obtain.setAsynchronous(true);
        } else {
            if (!this.LIZLLL) {
                try {
                    this.LIZJ = Class.forName("android.os.Message").getMethod("setAsynchronous", Boolean.TYPE);
                } catch (ClassNotFoundException | NoSuchMethodException | RuntimeException unused) {
                }
                this.LIZLLL = true;
            }
            Method method = this.LIZJ;
            if (method != null) {
                try {
                    LIZ(obtain, method, new Object[]{Boolean.TRUE});
                } catch (IllegalAccessException unused2) {
                    this.LIZJ = null;
                } catch (IllegalArgumentException unused3) {
                    this.LIZJ = null;
                } catch (RuntimeException unused4) {
                    this.LIZJ = null;
                } catch (InvocationTargetException unused5) {
                    this.LIZJ = null;
                }
            }
        }
        sendMessage(obtain);
    }

    public SystemMessageHandler(long j) {
        this.LIZ = j;
    }

    public static SystemMessageHandler create(long j) {
        return new SystemMessageHandler(j);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.LIZIZ) {
            nativeRunWork(this.LIZ);
        }
    }
}
