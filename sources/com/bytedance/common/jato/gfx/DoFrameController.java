package com.bytedance.common.jato.gfx;

import X.C16880lQ;
import X.C2XQ;
import X.C36514EUs;
import X.C9QG;
import X.X1D;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Printer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class DoFrameController {
    public static Handler LIZLLL;
    public static long[] LJFF;
    public static Printer LJI;
    public static ArrayList<C9QG> LJII;
    public static C2XQ LJIIIIZZ;
    public static final ProxyFrameHandler LIZ = new ProxyFrameHandler(C16880lQ.LLJJJJ());
    public static volatile int LIZIZ = 0;
    public static volatile boolean LIZJ = false;
    public static Object LJ = null;

    /* loaded from: classes7.dex */
    public static class ProxyFrameHandler extends Handler {
        public String beginStr;
        public String endStr;

        public ProxyFrameHandler(Looper looper) {
            super(looper);
            this.beginStr = "<";
            this.endStr = ">";
        }

        public void fillStr(Object obj) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(">>>>> Dispatching to ");
            LIZ.append(toString());
            LIZ.append(" ");
            LIZ.append(obj);
            LIZ.append(": 0");
            this.beginStr = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("<<<<< Finished to ");
            LIZ2.append(toString());
            LIZ2.append(" ");
            LIZ2.append(obj);
            this.endStr = X1D.LIZIZ(LIZ2);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Handler handler = DoFrameController.LIZLLL;
            if (handler != null) {
                handler.handleMessage(message);
            }
        }

        private boolean dispatchDoframe(Message message, long j) {
            if (DoFrameController.LJII != null) {
                for (int i = 0; i < DoFrameController.LJII.size(); i++) {
                    ((C9QG) ListProtector.get(DoFrameController.LJII, i)).LIZ();
                }
            }
            return false;
        }

        private void dispatchMessageNow(Message message, boolean z) {
            message.setTarget(this);
            Printer printer = DoFrameController.LJI;
            if (printer != null) {
                if (z) {
                    ProxyFrameHandler proxyFrameHandler = DoFrameController.LIZ;
                    printer.println(proxyFrameHandler.beginStr);
                    dispatchMessage(message);
                    DoFrameController.LJI.println(proxyFrameHandler.endStr);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(">>>>> Dispatching to ");
                    LIZ.append(message.getTarget());
                    LIZ.append(" ");
                    LIZ.append(message.getCallback());
                    LIZ.append(": ");
                    LIZ.append(message.what);
                    printer.println(X1D.LIZIZ(LIZ));
                    dispatchMessage(message);
                    Printer printer2 = DoFrameController.LJI;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("<<<<< Finished to ");
                    LIZ2.append(message.getTarget());
                    LIZ2.append(" ");
                    LIZ2.append(message.getCallback());
                    printer2.println(X1D.LIZIZ(LIZ2));
                }
            } else {
                dispatchMessage(message);
            }
            message.recycle();
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Message message2;
            boolean LIZ;
            if (message.getCallback() == DoFrameController.LJ) {
                if (dispatchDoframe(message, j)) {
                    return true;
                }
                switch (DoFrameController.LIZIZ) {
                    case 1:
                        return super.sendMessageAtTime(message, 0L);
                    case 2:
                        DoFrameController.LIZIZ = 0;
                        return super.sendMessageAtTime(message, 0L);
                    case 3:
                        if (C36514EUs.LIZ == null && C16880lQ.LLJJJJ() != null) {
                            Looper LLJJJJ = C16880lQ.LLJJJJ();
                            if (LLJJJJ == Looper.myLooper()) {
                                C36514EUs.LIZ = Looper.myQueue();
                            } else if (Build.VERSION.SDK_INT >= 23) {
                                C36514EUs.LIZ = LLJJJJ.getQueue();
                            } else {
                                try {
                                    Field declaredField = LLJJJJ.getClass().getDeclaredField("mQueue");
                                    declaredField.setAccessible(true);
                                    C36514EUs.LIZ = (MessageQueue) declaredField.get(LLJJJJ);
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        MessageQueue messageQueue = C36514EUs.LIZ;
                        Field field = C36514EUs.LIZIZ;
                        Message message3 = null;
                        try {
                            if (field == null) {
                                Field declaredField2 = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                                C36514EUs.LIZIZ = declaredField2;
                                declaredField2.setAccessible(true);
                                message2 = (Message) C36514EUs.LIZIZ.get(messageQueue);
                            } else {
                                message2 = (Message) field.get(messageQueue);
                            }
                            message3 = message2;
                        } catch (Exception unused2) {
                        }
                        if (message3 == null) {
                            return super.sendMessageAtTime(message, 0L);
                        }
                        return super.sendMessageAtTime(message, Math.min(message3.getWhen(), j));
                    case 4:
                        dispatchMessageNow(message, false);
                        return true;
                    case 5:
                        dispatchMessageNow(message, true);
                        return true;
                    case 6:
                        return super.sendMessageAtTime(message, j + 500);
                    case 7:
                        C2XQ c2xq = DoFrameController.LJIIIIZZ;
                        if (c2xq == null || !(LIZ = c2xq.LIZ(this, message, j))) {
                            return super.sendMessageAtTime(message, j);
                        }
                        return LIZ;
                    default:
                        return super.sendMessageAtTime(message, j);
                }
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[Catch: all -> 0x00a6, TryCatch #0 {all -> 0x00a6, blocks: (B:10:0x0009, B:14:0x0017, B:31:0x004d, B:34:0x005e, B:17:0x0064, B:19:0x0076, B:21:0x007e, B:22:0x0088, B:24:0x008c, B:26:0x009b, B:27:0x0096, B:37:0x0055, B:38:0x005a), top: B:9:0x0009, outer: #2, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void LIZ(android.view.Choreographer r7, X.C36513EUr r8) {
        /*
            java.lang.Class<com.bytedance.common.jato.gfx.DoFrameController> r6 = com.bytedance.common.jato.gfx.DoFrameController.class
            monitor-enter(r6)
            boolean r0 = com.bytedance.common.jato.gfx.DoFrameController.LIZJ     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto L9
            monitor-exit(r6)
            return
        L9:
            java.lang.String r0 = "mHandler"
            java.lang.Object r0 = X.C36512EUq.LJFF(r7, r0)     // Catch: java.lang.Throwable -> La6
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.Throwable -> La6
            com.bytedance.common.jato.gfx.DoFrameController.LIZLLL = r0     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto L17
            monitor-exit(r6)
            return
        L17:
            java.lang.String r0 = "mDisplayEventReceiver"
            java.lang.Object r0 = X.C36512EUq.LJFF(r7, r0)     // Catch: java.lang.Throwable -> La6
            com.bytedance.common.jato.gfx.DoFrameController.LJ = r0     // Catch: java.lang.Throwable -> La6
            android.os.Looper r1 = X.C16880lQ.LLJJJJ()     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = "mLogging"
            java.lang.Object r0 = X.C36512EUq.LJFF(r1, r0)     // Catch: java.lang.Throwable -> La6
            android.util.Printer r0 = (android.util.Printer) r0     // Catch: java.lang.Throwable -> La6
            com.bytedance.common.jato.gfx.DoFrameController.LJI = r0     // Catch: java.lang.Throwable -> La6
            java.lang.Class<android.view.Choreographer> r1 = android.view.Choreographer.class
            java.lang.String r0 = "mHandler"
            java.lang.reflect.Field r5 = X.C36512EUq.LIZLLL(r1, r0)     // Catch: java.lang.Throwable -> La6
            java.lang.Class r2 = X.C36503EUh.LIZ     // Catch: java.lang.Throwable -> La6
            r4 = 1
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> La6
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r3 = 0
            r1[r3] = r0     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = "objectFieldOffset"
            java.lang.reflect.Method r2 = X.C36503EUh.LIZIZ(r2, r0, r1)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r1 = X.C36503EUh.LIZIZ     // Catch: java.lang.Throwable -> La6
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> La6
            r0[r3] = r5     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L5b
            java.lang.Object r0 = X.C36503EUh.LIZ(r1, r2, r0)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> La6
            if (r0 != 0) goto L5e
            goto L5b
        L54:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> La6
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La6
            throw r0     // Catch: java.lang.Throwable -> La6
        L5b:
            r2 = 0
            goto L64
        L5e:
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> La6
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> La6
        L64:
            com.bytedance.common.jato.gfx.DoFrameController$ProxyFrameHandler r1 = com.bytedance.common.jato.gfx.DoFrameController.LIZ     // Catch: java.lang.Throwable -> La6
            X.C36503EUh.LIZJ(r2, r7, r1)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r0 = com.bytedance.common.jato.gfx.DoFrameController.LJ     // Catch: java.lang.Throwable -> La6
            r1.fillStr(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = "mFrameInfo"
            java.lang.Object r3 = X.C36512EUq.LJFF(r7, r0)     // Catch: java.lang.Throwable -> La6
            if (r3 == 0) goto L96
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La6
            r1 = 29
            r0 = 23
            if (r2 < r1) goto L99
            java.lang.String r0 = "frameInfo"
            java.lang.Object r0 = X.C36512EUq.LJFF(r3, r0)     // Catch: java.lang.Throwable -> La6
            long[] r0 = (long[]) r0     // Catch: java.lang.Throwable -> La6
            com.bytedance.common.jato.gfx.DoFrameController.LJFF = r0     // Catch: java.lang.Throwable -> La6
        L88:
            long[] r0 = com.bytedance.common.jato.gfx.DoFrameController.LJFF     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto L96
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = "frameArray"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La6
            X.C36513EUr.LIZ(r1)     // Catch: java.lang.Throwable -> La6
        L96:
            com.bytedance.common.jato.gfx.DoFrameController.LIZJ = r4     // Catch: java.lang.Throwable -> La6
            goto Laa
        L99:
            if (r2 < r0) goto L96
            java.lang.String r0 = "mFrameInfo"
            java.lang.Object r0 = X.C36512EUq.LJFF(r3, r0)     // Catch: java.lang.Throwable -> La6
            long[] r0 = (long[]) r0     // Catch: java.lang.Throwable -> La6
            com.bytedance.common.jato.gfx.DoFrameController.LJFF = r0     // Catch: java.lang.Throwable -> La6
            goto L88
        La6:
            r0 = move-exception
            X.C36513EUr.LIZ(r0)     // Catch: java.lang.Throwable -> Lac
        Laa:
            monitor-exit(r6)
            return
        Lac:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.gfx.DoFrameController.LIZ(android.view.Choreographer, X.EUr):void");
    }
}
