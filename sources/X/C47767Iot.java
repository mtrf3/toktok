package X;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Iot, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47767Iot {
    public HandlerThread LIZ;
    public HandlerC47753Iof LIZIZ;
    public Lock LIZJ;
    public Parcel LIZLLL;
    public HandlerC47763Iop LJ;
    public Lock LJFF;
    public Parcel LJI;
    public boolean LJII;
    public List<Condition> LJIIIIZZ;
    public final TTVideoEngineImpl LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final /* synthetic */ TTVideoEngineImpl LJIIL;

    public final boolean LIZIZ() {
        Looper LLJJJJ;
        if (this.LIZIZ == null) {
            return false;
        }
        HandlerC47763Iop handlerC47763Iop = this.LJ;
        if (handlerC47763Iop != null && handlerC47763Iop.getLooper() != null && this.LJ.getLooper().getThread() != null && !this.LJ.getLooper().getThread().isAlive()) {
            TTVideoEngineLog.w("TTVideoEngineLooperThread", "main looper thread is not alive, return false");
            return false;
        }
        if (Looper.myLooper() != null) {
            LLJJJJ = Looper.myLooper();
        } else {
            LLJJJJ = C16880lQ.LLJJJJ();
        }
        HandlerC47763Iop handlerC47763Iop2 = this.LJ;
        if (handlerC47763Iop2 != null && handlerC47763Iop2.getLooper() != LLJJJJ) {
            return true;
        }
        if (this.LJ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mainHandler looper:");
            LIZ.append(this.LJ.getLooper());
            TTVideoEngineLog.d("TTVideoEngineLooperThread", X1D.LIZIZ(LIZ));
        }
        return false;
    }

    public final boolean LIZ(boolean z) {
        if (this.LJII && z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mIsHandlingMainMsg return false, thread:");
            LIZ.append(Looper.myLooper().getThread());
            C78253UnR.LJI("TTVideoEngineLooperThread", X1D.LIZIZ(LIZ));
            return false;
        }
        Lock lock = this.LIZJ;
        if (lock != null) {
            ((ReentrantLock) lock).lock();
            if (this.LIZIZ != null && Looper.myLooper() != this.LIZIZ.getLooper()) {
                ((ReentrantLock) this.LIZJ).unlock();
                return true;
            }
            ((ReentrantLock) this.LIZJ).unlock();
        }
        return false;
    }

    public final void LIZJ(int i) {
        LIZLLL(i, 0, 0, null);
    }

    public final void LJIIIIZZ(InterfaceC47616ImS interfaceC47616ImS) {
        if (this.LJ != null) {
            HashMap hashMap = new HashMap();
            Condition newCondition = ((ReentrantLock) this.LJFF).newCondition();
            Message obtainMessage = this.LJ.obtainMessage(411, 0, 0);
            hashMap.put("paramObj", interfaceC47616ImS);
            hashMap.put("msgCond", newCondition);
            try {
                try {
                    ((ReentrantLock) this.LJFF).lock();
                    this.LJII = true;
                    obtainMessage.obj = hashMap;
                    obtainMessage.sendToTarget();
                    newCondition.await();
                    this.LJII = false;
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } finally {
                ((ReentrantLock) this.LJFF).unlock();
            }
        }
    }

    public C47767Iot(TTVideoEngineImpl tTVideoEngineImpl, TTVideoEngineImpl tTVideoEngineImpl2) {
        this.LJIIL = tTVideoEngineImpl;
        this.LJIIIZ = tTVideoEngineImpl2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r8.LJIIIZ.LJIIJJI == 5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r8.LJIIIZ.LJIIJJI != 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(long r9, java.lang.Object r11, int r12) {
        /*
            r8 = this;
            com.ss.ttvideoengine.TTVideoEngineImpl r0 = r8.LJIIIZ
            int r0 = r0.LJIIJJI
            r1 = 0
            r3 = 5
            if (r0 != r3) goto L9
        L8:
            return r1
        L9:
            X.Iof r6 = r8.LIZIZ
            if (r6 == 0) goto L8
            java.util.concurrent.locks.Lock r0 = r8.LIZJ
            if (r0 == 0) goto L8
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.concurrent.locks.Lock r0 = r8.LIZJ
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            java.util.concurrent.locks.Condition r2 = r0.newCondition()
            android.os.Message r4 = r6.obtainMessage(r12, r1, r1)
            java.lang.String r0 = "paramObj"
            r5.put(r0, r11)
            java.lang.String r0 = "msgCond"
            r5.put(r0, r2)
            r7 = 1
            java.util.concurrent.locks.Lock r0 = r8.LIZJ     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            r0.lock()     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            com.ss.ttvideoengine.TTVideoEngineImpl r0 = r8.LJIIIZ     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            int r0 = r0.LJIIJJI     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            if (r0 != r3) goto L3b
            goto L97
        L3b:
            java.util.List<java.util.concurrent.locks.Condition> r0 = r8.LJIIIIZZ     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            r0.add(r2)     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            r4.obj = r5     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            r4.sendToTarget()     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            r4 = 0
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7f
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            boolean r0 = r2.await(r9, r0)     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            if (r0 != 0) goto L91
            boolean r0 = r6.hasMessages(r12)     // Catch: java.lang.InterruptedException -> L7c java.lang.Throwable -> La7
            if (r0 == 0) goto L91
            java.lang.String r5 = "TTVideoEngineLooperThread"
            java.lang.StringBuilder r4 = X.X1D.LIZ()     // Catch: java.lang.InterruptedException -> L7c java.lang.Throwable -> La7
            java.lang.String r0 = "handle message "
            r4.append(r0)     // Catch: java.lang.InterruptedException -> L7c java.lang.Throwable -> La7
            r4.append(r12)     // Catch: java.lang.InterruptedException -> L7c java.lang.Throwable -> La7
            java.lang.String r0 = " timeout "
            r4.append(r0)     // Catch: java.lang.InterruptedException -> L7c java.lang.Throwable -> La7
            r4.append(r9)     // Catch: java.lang.InterruptedException -> L7c java.lang.Throwable -> La7
            java.lang.String r0 = X.X1D.LIZIZ(r4)     // Catch: java.lang.InterruptedException -> L7c java.lang.Throwable -> La7
            X.C78253UnR.LJI(r5, r0)     // Catch: java.lang.InterruptedException -> L7c java.lang.Throwable -> La7
            r6.removeMessages(r12)     // Catch: java.lang.InterruptedException -> L7c java.lang.Throwable -> La7
            goto L90
        L7c:
            r0 = move-exception
            r7 = 0
            goto L84
        L7f:
            r2.await()     // Catch: java.lang.InterruptedException -> L83 java.lang.Throwable -> La7
            goto L91
        L83:
            r0 = move-exception
        L84:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> La7
            com.ss.ttvideoengine.TTVideoEngineImpl r0 = r8.LJIIIZ
            int r0 = r0.LJIIJJI
            if (r0 != r3) goto L8e
            goto L97
        L8e:
            r1 = r7
            goto L97
        L90:
            r7 = 0
        L91:
            com.ss.ttvideoengine.TTVideoEngineImpl r0 = r8.LJIIIZ
            int r0 = r0.LJIIJJI
            if (r0 != r3) goto L8e
        L97:
            java.util.List<java.util.concurrent.locks.Condition> r0 = r8.LJIIIIZZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.remove(r2)
            java.util.concurrent.locks.Lock r0 = r8.LIZJ
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            r0.unlock()
            goto L8
        La7:
            r1 = move-exception
            java.util.List<java.util.concurrent.locks.Condition> r0 = r8.LJIIIIZZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.remove(r2)
            java.util.concurrent.locks.Lock r0 = r8.LIZJ
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47767Iot.LJII(long, java.lang.Object, int):boolean");
    }

    public final void LIZLLL(int i, int i2, int i3, Object obj) {
        LJ(i, i2, i3, obj, null, null);
    }

    public final void LJFF(int i, int i2, int i3, Object obj) {
        LJI(i, i2, i3, obj, null);
    }

    public final void LJI(int i, int i2, int i3, Object obj, Object obj2) {
        if (this.LJ != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paramObj", obj);
            if (obj2 != null) {
                hashMap.put("paramObj1", obj2);
            }
            Message obtainMessage = this.LJ.obtainMessage(i, i2, i3);
            obtainMessage.obj = hashMap;
            obtainMessage.sendToTarget();
        }
    }

    public final void LJ(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        HandlerC47753Iof handlerC47753Iof;
        if (this.LJIIIZ.LJIIJJI != 5 && (handlerC47753Iof = this.LIZIZ) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paramObj", obj);
            if (obj2 != null) {
                hashMap.put("paramObj1", obj2);
            }
            if (obj3 != null) {
                hashMap.put("paramObj2", obj3);
            }
            Message obtainMessage = handlerC47753Iof.obtainMessage(i, i2, i3);
            obtainMessage.obj = hashMap;
            obtainMessage.sendToTarget();
        }
    }
}
