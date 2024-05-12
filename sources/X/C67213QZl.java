package X;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.QZl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67213QZl extends QZV {
    public static final /* synthetic */ int LJFF = 0;
    public volatile boolean LIZJ;
    public final String LIZ = "com.ss.android.ugc.aweme.live.LivePlayActivity";
    public final CGS LIZIZ = ((IHostPerformanceMonitor) CN1.LIZ(IHostPerformanceMonitor.class)).dt0();
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS161S0100000_11(this, 112));
    public final java.util.Set<InterfaceC88472Yns<Float, C76800UCe>> LJ = new LinkedHashSet();

    @Override // X.QZV, X.CGL
    public final synchronized void LJFF() {
        if (!this.LJ.isEmpty() && this.LIZJ) {
            float LIZLLL = LIZLLL(15);
            Iterator<InterfaceC88472Yns<Float, C76800UCe>> it = this.LJ.iterator();
            while (it.hasNext()) {
                it.next().invoke(Float.valueOf(LIZLLL));
            }
        }
    }

    @Override // X.QZV, X.CGL
    public final synchronized void destroy() {
        stop();
        this.LJ.clear();
    }

    @Override // X.QZV, X.CGL
    public final void stop() {
        this.LIZJ = false;
        PMR pmr = (PMR) this.LIZIZ;
        if (pmr.LJLILLLLZI) {
            C36381bm.LJIL.LJIIL(pmr);
        }
        pmr.LJLILLLLZI = false;
    }

    @Override // X.QZV, X.CGL
    public final void start() {
        ((PMR) this.LIZIZ).LJLJI = new C67214QZm(this);
        C67215QZn c67215QZn = (C67215QZn) this.LIZLLL.getValue();
        for (C67216QZo c67216QZo : c67215QZn.LIZJ) {
            c67216QZo.LIZ = 0L;
            c67216QZo.LIZIZ = 0;
            c67215QZn.LIZLLL = 0;
            c67215QZn.LJ = 0L;
        }
        PMR pmr = (PMR) this.LIZIZ;
        if (!pmr.LJLILLLLZI) {
            C36381bm.LJIL.LIZLLL(pmr);
            pmr.LJLILLLLZI = true;
        }
        this.LIZJ = true;
    }

    @Override // X.QZV, X.InterfaceC30127Bs3
    public final synchronized void LIZIZ(CGF notifyFilter) {
        o.LJIIIZ(notifyFilter, "notifyFilter");
        this.LJ.add(notifyFilter);
    }

    @Override // X.QZV, X.InterfaceC30127Bs3
    public final float LIZLLL(int i) {
        if (!this.LIZJ) {
            return 0.0f;
        }
        C67215QZn c67215QZn = (C67215QZn) this.LIZLLL.getValue();
        c67215QZn.getClass();
        long elapsedRealtime = (SystemClock.elapsedRealtime() / 1000) - 1;
        int i2 = 60;
        if (60 >= i) {
            i2 = i;
        }
        float f = 0.0f;
        int i3 = 0;
        for (C67216QZo c67216QZo : c67215QZn.LIZJ) {
            long j = c67216QZo.LIZ;
            if (j >= elapsedRealtime - i2 && j <= elapsedRealtime) {
                f += c67216QZo.LIZJ;
                i3++;
            }
        }
        if (f == 0.0f) {
            return c67215QZn.LIZIZ;
        }
        return f / i3;
    }
}
