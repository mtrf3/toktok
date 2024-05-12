package X;

import com.bytedance.android.livesdk.livesetting.watchlive.AddSyncLockSetting;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public final class VCT {
    public static volatile VCT LIZIZ;
    public final java.util.Map<Class<?>, VCU<?>> LIZ = new ConcurrentHashMap();

    public VCT() {
        LIZLLL(InterfaceC28738BPq.class, new VCP());
        LIZLLL(InterfaceC30713C3p.class, new VCW());
        LIZLLL(InterfaceC28605BKn.class, new VCX());
        LIZLLL(C78579Ush.class, new VCQ());
        LIZLLL(InterfaceC30552Byu.class, new VCS());
        LIZLLL(InterfaceC31143CKd.class, new VCR());
    }

    public static <T> T LIZIZ(Class<T> cls) {
        if (LIZIZ == null) {
            synchronized (VCT.class) {
                if (LIZIZ == null) {
                    LIZIZ = new VCT();
                }
            }
        }
        return (T) LIZIZ.LIZ(cls);
    }

    public final <T> T LIZ(Class<T> cls) {
        VCY<T> vcy;
        VCY<T> vcy2;
        VCU vcu = (VCU) ((ConcurrentHashMap) this.LIZ).get(cls);
        if (vcu == null) {
            vcu = LIZJ(cls, new G72(cls));
        }
        if (AddSyncLockSetting.INSTANCE.getValue()) {
            synchronized (this) {
                VCY<T> vcy3 = vcu.LIZIZ;
                if (vcy3 == null || !vcy3.LIZIZ) {
                    VCV<T> vcv = vcu.LIZ;
                    VCY<T> vcy4 = new VCY<>();
                    vcv.LIZIZ(vcy4);
                    vcu.LIZIZ = vcy4;
                }
                VCY<T> vcy5 = vcu.LIZIZ;
                if (vcy5.LIZIZ) {
                    if (vcu.LIZJ == null) {
                        synchronized (VCT.class) {
                            if (vcu.LIZJ == null && (vcy2 = vcu.LIZIZ) != null) {
                                vcu.LIZJ = vcy2.LIZ;
                            }
                        }
                    }
                    return (T) vcu.LIZJ;
                }
                T t = vcy5.LIZ;
                vcu.LIZIZ = null;
                return t;
            }
        }
        VCY<T> vcy6 = vcu.LIZIZ;
        if (vcy6 == null || !vcy6.LIZIZ) {
            VCV<T> vcv2 = vcu.LIZ;
            VCY<T> vcy7 = new VCY<>();
            vcv2.LIZIZ(vcy7);
            vcu.LIZIZ = vcy7;
        }
        VCY<T> vcy8 = vcu.LIZIZ;
        if (vcy8.LIZIZ) {
            if (vcu.LIZJ == null) {
                synchronized (VCT.class) {
                    if (vcu.LIZJ == null && (vcy = vcu.LIZIZ) != null) {
                        vcu.LIZJ = vcy.LIZ;
                    }
                }
            }
            return (T) vcu.LIZJ;
        }
        T t2 = vcy8.LIZ;
        vcu.LIZIZ = null;
        return t2;
    }

    public final VCU LIZJ(Class cls, G72 g72) {
        VCU vcu;
        if (AddSyncLockSetting.INSTANCE.getValue()) {
            synchronized (this) {
                vcu = new VCU(g72);
                VCY vcy = new VCY();
                g72.LIZIZ(vcy);
                vcu.LIZIZ = vcy;
                g72.LIZIZ(vcy);
                vcu.LIZJ = vcy.LIZ;
                ((ConcurrentHashMap) this.LIZ).put(cls, vcu);
            }
            return vcu;
        }
        VCU vcu2 = new VCU(g72);
        VCY vcy2 = new VCY();
        g72.LIZIZ(vcy2);
        vcu2.LIZIZ = vcy2;
        g72.LIZIZ(vcy2);
        vcu2.LIZJ = vcy2.LIZ;
        ((ConcurrentHashMap) this.LIZ).put(cls, vcu2);
        return vcu2;
    }

    public final void LIZLLL(Class cls, VCV vcv) {
        ((ConcurrentHashMap) this.LIZ).put(cls, new VCU(vcv));
    }
}
