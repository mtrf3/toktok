package com.ss.android.ugc.aweme.legoImp.task.anr;

import X.C03880Dg;
import X.C65300Pk0;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class AnrDispatchBoost {
    public static boolean LIZ;
    public static boolean LIZIZ;

    /* loaded from: classes7.dex */
    public static final class DelegateInternalHandler extends Handler {
        public final Handler LIZ;
        public Object LIZIZ;
        public Method LIZJ;
        public Field LIZLLL;
        public Field LJ;
        public Class<?> LJFF;

        public static void LIZ(Object obj, Method method, Object[] objArr) {
            if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "9013329145414858957")).LIZ) {
                return;
            }
            method.invoke(obj, objArr);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public DelegateInternalHandler(android.os.Handler r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L26
                android.os.Looper r0 = r3.getLooper()
            L6:
                r2.<init>(r0)
                r2.LIZ = r3
                if (r3 != 0) goto Le
            Ld:
                return
            Le:
                java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
                java.lang.String r0 = "mCallback"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> Ld
                r0 = 1
                r1.setAccessible(r0)     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r0 = r1.get(r3)     // Catch: java.lang.Throwable -> Ld
                android.os.Handler$Callback r0 = (android.os.Handler.Callback) r0     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto Ld
                r1.set(r2, r0)     // Catch: java.lang.Throwable -> Ld
                goto Ld
            L26:
                android.os.Looper r0 = X.C16880lQ.LLJJJJ()
                goto L6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.anr.AnrDispatchBoost.DelegateInternalHandler.<init>(android.os.Handler):void");
        }

        public final void LIZIZ(Object obj) {
            if (this.LJFF == null) {
                Class<?> cls = obj.getClass();
                this.LJFF = cls;
                LIZJ(cls.getSuperclass());
            }
            if (this.LIZIZ != null && this.LIZLLL != null) {
                LIZLLL(obj);
            }
        }

        public final void LIZJ(Class<?> cls) {
            Method declaredMethod;
            if (this.LIZJ == null) {
                Method method = null;
                try {
                    if (this.LIZIZ == null) {
                        Method declaredMethod2 = Class.forName("android.app.ActivityManagerNative").getDeclaredMethod("getDefault", new Class[0]);
                        declaredMethod2.setAccessible(true);
                        this.LIZIZ = declaredMethod2.invoke(null, new Object[0]);
                    }
                } catch (Throwable unused) {
                }
                try {
                    Class<?> cls2 = Class.forName("android.app.IActivityManager");
                    if (Build.VERSION.SDK_INT >= 23) {
                        Class<?> cls3 = Integer.TYPE;
                        declaredMethod = cls2.getDeclaredMethod("finishReceiver", IBinder.class, cls3, String.class, Bundle.class, Boolean.TYPE, cls3);
                    } else {
                        declaredMethod = cls2.getDeclaredMethod("finishReceiver", IBinder.class, Integer.TYPE, String.class, Bundle.class, Boolean.TYPE);
                    }
                    declaredMethod.setAccessible(true);
                    method = declaredMethod;
                } catch (Throwable unused2) {
                }
                this.LIZJ = method;
                if (cls != null) {
                    try {
                        Field declaredField = cls.getDeclaredField("mToken");
                        this.LIZLLL = declaredField;
                        declaredField.setAccessible(true);
                        Field declaredField2 = cls.getDeclaredField("mFlags");
                        this.LJ = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (Throwable unused3) {
                    }
                }
            }
        }

        public final void LIZLLL(Object obj) {
            int i;
            try {
                IBinder iBinder = (IBinder) this.LIZLLL.get(obj);
                Field field = this.LJ;
                if (field != null) {
                    i = ((Integer) field.get(obj)).intValue();
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT < 23) {
                    LIZ(this.LIZIZ, this.LIZJ, new Object[]{iBinder, 0, null, null, Boolean.FALSE});
                } else {
                    LIZ(this.LIZIZ, this.LIZJ, new Object[]{iBinder, 0, null, null, Boolean.FALSE, Integer.valueOf(i)});
                }
            } catch (Throwable unused) {
            }
        }

        public String codeToString(int i) {
            return String.valueOf(i);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Handler handler = this.LIZ;
            if (handler != null) {
                handler.handleMessage(message);
            } else {
                super.handleMessage(message);
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(1:5))(1:42)|6|(6:8|(3:10|11|(1:17))|21|(2:23|(2:25|(2:27|(2:29|(1:31)(1:32)))(1:33)))|34|(2:36|37)(2:39|40))|20|21|(0)|34|(0)(0)) */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:21:0x003e, B:23:0x0044, B:25:0x0054, B:27:0x005c, B:29:0x0068, B:32:0x0074, B:33:0x0078), top: B:20:0x003e }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean sendMessageAtTime(android.os.Message r6, long r7) {
            /*
                r5 = this;
                java.lang.Object r0 = r6.obj
                r4 = 0
                if (r0 == 0) goto L21
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = X.C16880lQ.LJLLJ(r0)
                boolean r0 = com.ss.android.ugc.aweme.legoImp.task.anr.AnrDispatchBoost.LIZIZ
                if (r0 == 0) goto L14
                r5.codeToString(r4)
            L14:
                java.lang.String r0 = "ReceiverData"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L3e
                java.lang.Object r1 = r6.obj
                if (r1 != 0) goto L24
                goto L3e
            L21:
                java.lang.String r1 = ""
                goto L14
            L24:
                java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L3e
                java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L3e
                r5.LIZJ(r0)     // Catch: java.lang.Throwable -> L3e
                java.lang.Object r0 = r6.obj     // Catch: java.lang.Throwable -> L3e
                if (r0 == 0) goto L3e
                java.lang.Object r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L3e
                if (r0 == 0) goto L3e
                java.lang.reflect.Field r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L3e
                if (r0 == 0) goto L3e
                r5.LIZLLL(r1)     // Catch: java.lang.Throwable -> L3e
            L3e:
                java.lang.Runnable r3 = r6.getCallback()     // Catch: java.lang.Throwable -> L7b
                if (r3 == 0) goto L7b
                java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L7b
                java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> L7b
                java.lang.String r0 = "ReceiverDispatcher$Args"
                boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L7b
                if (r0 == 0) goto L7b
                java.lang.String r0 = "Lambda"
                boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L7b
                if (r0 == 0) goto L78
                java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L7b
                java.lang.reflect.Field[] r2 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L7b
                int r0 = r2.length     // Catch: java.lang.Throwable -> L7b
                r1 = 1
                if (r0 != r1) goto L7b
                r0 = r2[r4]     // Catch: java.lang.Throwable -> L7b
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L7b
                if (r0 != 0) goto L74
                goto L7b
            L74:
                r5.LIZIZ(r0)     // Catch: java.lang.Throwable -> L7b
                goto L7b
            L78:
                r5.LIZIZ(r3)     // Catch: java.lang.Throwable -> L7b
            L7b:
                android.os.Handler r0 = r5.LIZ
                if (r0 == 0) goto L84
                boolean r0 = r0.sendMessageAtTime(r6, r7)
                return r0
            L84:
                boolean r0 = super.sendMessageAtTime(r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.anr.AnrDispatchBoost.DelegateInternalHandler.sendMessageAtTime(android.os.Message, long):boolean");
        }
    }
}
