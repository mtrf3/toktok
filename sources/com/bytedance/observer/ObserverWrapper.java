package com.bytedance.observer;

import X.C0M0;
import X.C0M1;
import X.C16880lQ;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes9.dex */
public class ObserverWrapper extends C0M0 implements Looper.Observer {
    public Looper.Observer mOriginObserver;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
        } else {
            throw new IllegalStateException("load class error");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object messageDispatchStarting() {
        /*
            r3 = this;
            java.lang.Object r0 = X.C0M1.LIZJ
            if (r0 == 0) goto L2f
            android.os.Looper$Observer r0 = r3.mOriginObserver
            if (r0 == 0) goto L1a
            java.lang.Object r2 = r0.messageDispatchStarting()
        Lc:
            java.lang.Thread r1 = X.C0M1.LJI
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            if (r1 != r0) goto L19
            java.lang.String r0 = ">>>>> Dispatching to Handler (com.bytedance.apm.block.LooperObserverMonitor) {57c1969} com.bytedance.apm.block.LooperObserverMonitor@5caffee: 0"
            r3.messageDispatchStarting(r0)
        L19:
            return r2
        L1a:
            java.lang.reflect.Method r2 = X.C0M1.LIZLLL     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2b
            java.lang.Object r1 = X.C0M1.LIZJ     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2b
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2b
            java.lang.Object r2 = r2.invoke(r1, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2b
            goto Lc
        L26:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L2f
        L2b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L2f:
            r2 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.observer.ObserverWrapper.messageDispatchStarting():java.lang.Object");
    }

    @Override // X.C0M0
    public void setup(Object obj) {
        if (obj != null && (obj instanceof Looper.Observer)) {
            this.mOriginObserver = (Looper.Observer) obj;
        }
    }

    public void messageDispatched(Object obj, Message message) {
        if (C0M1.LIZJ != null) {
            Looper.Observer observer = this.mOriginObserver;
            if (observer != null) {
                observer.messageDispatched(obj, message);
            } else {
                try {
                    C0M1.LJ.invoke(C0M1.LIZJ, obj, message);
                } catch (IllegalAccessException e) {
                    C16880lQ.LLLLIIL(e);
                } catch (InvocationTargetException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        if (C0M1.LJI == C16880lQ.LLLLIIIILLL()) {
            messageDispatched("<<<<< Finished to Handler (com.bytedance.apm.block.LooperObserverMonitor) {57c1969} com.bytedance.apm.block.LooperObserverMonitor@5caffee", message);
        }
    }

    public void dispatchingThrewException(Object obj, Message message, Exception exc) {
        if (C0M1.LIZJ != null) {
            Looper.Observer observer = this.mOriginObserver;
            if (observer != null) {
                observer.dispatchingThrewException(obj, message, exc);
                return;
            }
            try {
                C0M1.LJFF.invoke(C0M1.LIZJ, obj, message, exc);
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
            } catch (InvocationTargetException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }
}
