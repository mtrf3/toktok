package X;

import Y.ARunnableS24S0200000_5;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.FluencyMetricSwitchSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CGA implements CG4 {
    public final CG7 LIZ;
    public final CG6 LIZIZ;
    public final QZV LIZJ;
    public final CGN LIZLLL;
    public final CG8 LJ;
    public final CG3 LJFF;
    public final CGR LJI;
    public final CGL[] LJII;
    public final ArrayList<CGK> LJIIIIZZ;
    public boolean LJIIIZ;
    public final C62822Ol8 LJIIJ;

    @Override // X.CG4
    public final synchronized void destroy() {
        stop();
        for (CGL cgl : this.LJII) {
            cgl.destroy();
        }
        if (o.LJ(B4U.LIZ().LLILZ, this.LIZLLL)) {
            B4U.LIZ().LLILZ = null;
        }
        if (o.LJ(C88207Yjb.LJIIIZ, this.LIZLLL)) {
            C88207Yjb.LJIIIZ = null;
        }
        Iterator<CGK> it = this.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(this);
        }
    }

    @Override // X.CG4
    public final synchronized void start() {
        if (this.LJIIIZ) {
            return;
        }
        for (CGL cgl : this.LJII) {
            cgl.start();
        }
        LivePerformanceManager LIZ = B4U.LIZ();
        AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(this, 889);
        LIZ.getClass();
        Handler handler = LIZ.LJLLLLLL;
        if (handler != null) {
            handler.post(new ARunnableS24S0200000_5(LIZ, aqS171S0100000_5, 87));
        }
        LivePerformanceManager LIZ2 = B4U.LIZ();
        CGN cgn = this.LIZLLL;
        LIZ2.LLILZ = cgn;
        C88207Yjb.LJIIIZ = cgn;
        Iterator<CGK> it = this.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(this);
        }
        this.LJIIIZ = true;
    }

    @Override // X.CG4
    public final synchronized void stop() {
        for (CGL cgl : this.LJII) {
            cgl.stop();
        }
        Iterator<CGK> it = this.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(this);
        }
        this.LJIIIZ = false;
    }

    @Override // X.CG4
    public final C123024sE LIZIZ() {
        CGB cgb = (CGB) this.LJI;
        float f = cgb.LIZ;
        if (f <= 0.0f) {
            cgb.LIZ();
            f = cgb.LIZ;
        }
        CGB cgb2 = (CGB) this.LJI;
        float f2 = cgb2.LIZIZ;
        if (f2 <= 0.0f) {
            cgb2.LIZ();
            f2 = cgb2.LIZIZ;
        }
        CGB cgb3 = (CGB) this.LJI;
        float f3 = cgb3.LIZJ;
        if (f3 <= 0.0f) {
            cgb3.LIZ();
            f3 = cgb3.LIZJ;
        }
        return new C123024sE(f, f2, f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<java.util.Map<java.lang.String, java.lang.Float>, java.lang.Float> LJIIIZ() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CGA.LJIIIZ():X.OSZ");
    }

    public CGA() {
        QZV c67213QZl;
        CG7 cg7 = new CG7();
        this.LIZ = cg7;
        CG6 cg6 = new CG6();
        this.LIZIZ = cg6;
        if (FluencyMetricSwitchSetting.disable()) {
            c67213QZl = new CGM();
        } else {
            c67213QZl = new C67213QZl();
        }
        this.LIZJ = c67213QZl;
        CGN cgn = new CGN();
        this.LIZLLL = cgn;
        CG8 cg8 = new CG8();
        this.LJ = cg8;
        CG3 cg3 = new CG3();
        this.LJFF = cg3;
        CG2 cg2 = new CG2();
        this.LJI = ((IHostPerformanceMonitor) CN1.LIZ(IHostPerformanceMonitor.class)).aD();
        this.LJII = new CGL[]{cg7, cg6, c67213QZl, cgn, cg8, cg2, cg3};
        this.LJIIIIZZ = new ArrayList<>();
        this.LJIIJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 435));
    }

    @Override // X.CG4
    public final CGN LIZ() {
        return this.LIZLLL;
    }

    @Override // X.CG4
    public final CG8 LJ() {
        return this.LJ;
    }

    @Override // X.CG4
    public final CG7 LJFF() {
        return this.LIZ;
    }

    @Override // X.CG4
    public final CG6 LJI() {
        return this.LIZIZ;
    }

    @Override // X.CG4
    public final QZV LJII() {
        return this.LIZJ;
    }

    @Override // X.CG4
    public final CG3 LJIIIIZZ() {
        return this.LJFF;
    }

    @Override // X.CG4
    public final void LIZJ(CGK listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIIIIZZ.add(listener);
    }

    @Override // X.CG4
    public final void LIZLLL(CGK listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIIIIZZ.remove(listener);
    }
}
