package Y;

import X.C16880lQ;
import X.C34K;
import X.C43356Gzw;
import X.C46496IMq;
import X.C47988IsS;
import X.C48262Iws;
import X.C68322mC;
import X.C82158WMg;
import X.C82160WMi;
import X.VE6;
import X.VF8;
import X.VSM;
import X.VSN;
import X.WME;
import X.WMU;
import X.WNH;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import ccb.t;
import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.bytedance.netecho.result.TcpDetectResult;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.texturerender.VideoSurface;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes15.dex */
public class ARunnableS6S0500000_14 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        VideoSurface videoSurface = (VideoSurface) this.l0;
        if (videoSurface != null || (videoSurface = ((t) this.l4).LL.LIZIZ((C48262Iws) this.l1, 1)) != null) {
            t tVar = (t) this.l4;
            if (tVar.LLFFF == 1 && tVar.LLFZ == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("init sr, bundle: ");
                LIZ.append((Bundle) this.l2);
                X1D.LIZIZ(LIZ);
                C46496IMq.LIZJ();
                t tVar2 = (t) this.l4;
                if (tVar2.a4 != 1) {
                    C47988IsS c47988IsS = tVar2.LL;
                    Context context = tVar2.LJLJJL;
                    c47988IsS.getClass();
                    if (context != null) {
                        c47988IsS.LIZLLL = C16880lQ.LLLLL(context);
                    }
                }
                videoSurface.LJIJI((Bundle) this.l2);
                ((t) this.l4).c7 = 7;
            }
            if (((t) this.l4).U4 == 1) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("init sharpen, bundle: ");
                LIZ2.append((Bundle) this.l3);
                X1D.LIZIZ(LIZ2);
                C46496IMq.LIZJ();
                videoSurface.LJIJI((Bundle) this.l3);
                t tVar3 = (t) this.l4;
                tVar3.d7 = 7;
                if (!tVar3.v8) {
                    videoSurface.LJIJJLI(tVar3.b5, 11);
                    videoSurface.LJIJJLI(((t) this.l4).c5, 12);
                    videoSurface.LJIJJLI(((t) this.l4).d5, 13);
                    videoSurface.LJJ(17, ((t) this.l4).e5);
                    videoSurface.LJJ(14, -1);
                }
            }
            VE6 ve6 = ((t) this.l4).f103n8;
            if (ve6 != null) {
                C46496IMq.LIZJ();
                ve6.LIZ(videoSurface, 101, 0, "");
            }
            if (!((t) this.l4).M1((C48262Iws) this.l1) && !((t) this.l4).d4) {
                C46496IMq.LIZJ();
                videoSurface.release();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        try {
            IcmpDetectResult detectIcmp = Netecho.INSTANCE.detectIcmp(((VF8) ((Map.Entry) this.l0).getValue()).LJLIL, ((VSM) this.l1).LIZJ, 3);
            ((ConcurrentHashMap) ((C68322mC) this.l2).element).put(((Map.Entry) this.l0).getKey(), detectIcmp);
            if (detectIcmp.getSuccess()) {
                ((C34K) this.l3).element = true;
            }
        } catch (Throwable unused) {
        }
        ((CountDownLatch) ((C68322mC) this.l4).element).countDown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$2() {
        try {
            TcpDetectResult detectTcp = Netecho.INSTANCE.detectTcp(((VF8) ((Map.Entry) this.l0).getValue()).LJLIL, ((VF8) ((Map.Entry) this.l0).getValue()).LJLILLLLZI, ((VSN) this.l1).LIZJ);
            ((ConcurrentHashMap) ((C68322mC) this.l2).element).put(((Map.Entry) this.l0).getKey(), detectTcp);
            if (detectTcp.getSuccess()) {
                ((C34K) this.l3).element = true;
            }
        } catch (Throwable unused) {
        }
        ((CountDownLatch) ((C68322mC) this.l4).element).countDown();
    }

    public final void LIZ$3() {
        ((C82160WMi) ((NavigationScene) this.l0).mView).setTouchEnabled(true);
        if (((C82158WMg) this.l1).LIZJ.value < WME.VIEW_CREATED.value) {
            ((WMU) this.l4).LIZ.getOverlay().remove((View) this.l2);
        }
        ((Runnable) this.l3).run();
        ARunnableS26S0200000_7 aRunnableS26S0200000_7 = ((WMU) this.l4).LIZIZ;
        if (aRunnableS26S0200000_7 != null) {
            aRunnableS26S0200000_7.run();
        }
    }

    public static final void run$0(ARunnableS6S0500000_14 aRunnableS6S0500000_14) {
        boolean LIZ;
        try {
            aRunnableS6S0500000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S0500000_14 aRunnableS6S0500000_14) {
        boolean LIZ;
        try {
            aRunnableS6S0500000_14.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS6S0500000_14 aRunnableS6S0500000_14) {
        boolean LIZ;
        try {
            aRunnableS6S0500000_14.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS6S0500000_14 aRunnableS6S0500000_14) {
        boolean LIZ;
        try {
            aRunnableS6S0500000_14.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS6S0500000_14 aRunnableS6S0500000_14) {
        boolean LIZ;
        try {
            WNH wnh = (WNH) aRunnableS6S0500000_14.l4;
            WMU wmu = wnh.LJFF;
            wmu.LIZ = wnh.LIZ;
            wmu.LIZIZ((C82158WMg) aRunnableS6S0500000_14.l0, (C82158WMg) aRunnableS6S0500000_14.l1, (Runnable) aRunnableS6S0500000_14.l2, (C43356Gzw) aRunnableS6S0500000_14.l3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS6S0500000_14 aRunnableS6S0500000_14) {
        boolean LIZ;
        try {
            WNH wnh = (WNH) aRunnableS6S0500000_14.l4;
            WMU wmu = wnh.LJFF;
            wmu.LIZ = wnh.LIZ;
            wmu.LIZ((C82158WMg) aRunnableS6S0500000_14.l0, (C82158WMg) aRunnableS6S0500000_14.l1, (Runnable) aRunnableS6S0500000_14.l2, (C43356Gzw) aRunnableS6S0500000_14.l3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS6S0500000_14(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l4 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
        this.l3 = obj5;
    }
}
