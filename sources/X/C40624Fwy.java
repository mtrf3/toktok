package X;

import Y.ARunnableS10S0101000_6;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.common.utility.reflect.Reflect;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.Fwy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40624Fwy {
    public static volatile C40624Fwy LJJII;
    public MessageQueue LIZIZ;
    public Method LIZJ;
    public Method LIZLLL;
    public Field LJ;
    public Field LJFF;
    public Field LJI;
    public Object LJII;
    public C40626Fx0 LJIIIZ;
    public final RunnableC51615KNn LJJI;
    public final RunnableC51614KNm LJJIFFI;
    public final C40623Fwx LIZ = new C40623Fwx();
    public volatile boolean LJIIIIZZ = false;
    public volatile long LJIIJ = -1;
    public volatile long LJIIJJI = 0;
    public volatile long LJIIL = 0;
    public long LJIILIIL = 10;
    public long LJIILJJIL = 0;
    public long LJIILL = 0;
    public double LJIILLIIL = 1.0d;
    public long LJIIZILJ = 2000000000;
    public volatile int LJIJ = -1;
    public volatile long LJIJI = -1;
    public volatile long LJIJJ = -1;
    public volatile boolean LJIJJLI = false;
    public final ChoreographerFrameCallbackC40628Fx2 LJIL = new ChoreographerFrameCallbackC40628Fx2(this);
    public final ARunnableS10S0101000_6 LJJ = new ARunnableS10S0101000_6(0, this, 8);

    public static Object LIZIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "9013780029872217026"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static C40624Fwy LIZJ() {
        if (LJJII == null) {
            synchronized (C40624Fwy.class) {
                if (LJJII == null) {
                    LJJII = new C40624Fwy();
                }
            }
        }
        return LJJII;
    }

    public final MessageQueue LIZLLL() {
        if (this.LIZIZ == null) {
            try {
                this.LIZIZ = (MessageQueue) Reflect.on(C16880lQ.LLJJJJ()).field("mQueue", new Class[0]).get();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return this.LIZIZ;
    }

    public C40624Fwy() {
        int i = 0;
        this.LJJI = new RunnableC51615KNn(i, this);
        this.LJJIFFI = new RunnableC51614KNm(i, this);
    }

    public final void LIZ() {
        try {
            MessageQueue LIZLLL = LIZLLL();
            if (LIZLLL != null) {
                if (this.LJFF == null) {
                    this.LJFF = Reflect.on(LIZLLL).exactField("mMessages", new Class[0]);
                }
                Message message = (Message) Reflect.on(this.LJFF.get(LIZLLL)).get();
                if (this.LJI == null) {
                    this.LJI = Reflect.on(message).exactField("next", new Class[0]);
                }
                while (message != null) {
                    if (message.getWhen() <= 1) {
                        if (message.getTarget() == null) {
                            LJ(message.arg1);
                        }
                        message = (Message) Reflect.on(this.LJI.get(message)).get();
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJFF() {
        if (Looper.myLooper() != C16880lQ.LLJJJJ() || !this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = false;
        try {
            C40626Fx0 c40626Fx0 = this.LJIIIZ;
            if (c40626Fx0 != null) {
                c40626Fx0.LJLILLLLZI = true;
                this.LJIIIZ.interrupt();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C16880lQ.LLIIIJ().removeFrameCallback(this.LJIL);
        C15610jN.LIZ().removeCallbacks(this.LJJ);
        C15610jN.LIZ().removeCallbacks(this.LJJI);
        C15610jN.LIZ().removeCallbacks(this.LJJIFFI);
        LJ(this.LJIJ);
        LIZ();
        this.LJIIJ = -1L;
        this.LJIILL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILIIL = 10L;
        this.LJIJI = -1L;
        this.LJIJ = -1;
        this.LJIJJ = -1L;
        this.LJIJJLI = false;
        this.LJIIIZ = null;
    }

    public final boolean LJ(int i) {
        MessageQueue messageQueue;
        if (i >= 0) {
            try {
                messageQueue = LIZLLL();
                if (messageQueue == null) {
                    return true;
                }
                try {
                    if (this.LIZJ == null) {
                        Method exactMethod = Reflect.on(messageQueue).exactMethod("removeSyncBarrier", new Class[]{Integer.TYPE}, Integer.valueOf(i));
                        this.LIZJ = exactMethod;
                        Reflect.accessible(exactMethod);
                    }
                    LIZIZ(messageQueue, this.LIZJ, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception unused) {
                    try {
                        C40623Fwx c40623Fwx = this.LIZ;
                        if (((Method) c40623Fwx.LJLJJLL) == null) {
                            c40623Fwx.LJLJJLL = c40623Fwx.LJ(MessageQueue.class, "removeSyncBarrier", Integer.class);
                        }
                        Method method = (Method) c40623Fwx.LJLJJLL;
                        if (method != null && messageQueue != null) {
                            LIZIZ(messageQueue, method, new Object[]{Integer.valueOf(i)});
                            return true;
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    return false;
                }
            } catch (Exception unused2) {
                messageQueue = null;
            }
        }
        return false;
    }
}
