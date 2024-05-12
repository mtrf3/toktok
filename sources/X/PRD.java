package X;

import Y.AObjectS22S0001000_6;
import Y.AObjectS23S0000000_6;
import Y.ARunnableS47S0100000_11;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PRD implements InterfaceC55057LjB {
    public final String LIZ;
    public final boolean LIZIZ;
    public final PH4 LIZJ;
    public final PQU LIZLLL;
    public boolean LJ;
    public long LJFF;
    public PRT LJI;
    public PRT LJII;

    @Override // X.InterfaceC55057LjB
    public final void LIZIZ() {
        this.LJI = null;
    }

    @Override // X.InterfaceC55057LjB
    public final void LJIIIZ() {
        C1DH.LJJIJIIJIL(3000L, new ARunnableS47S0100000_11(this, 56));
    }

    @Override // X.InterfaceC55057LjB
    public final void start() {
        InterfaceC64427PQh LIZ;
        PH4 ph4;
        C06140Ly.LIZ(this.LIZ);
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        this.LJFF = SystemClock.uptimeMillis();
        PH4 ph42 = this.LIZJ;
        if (ph42 != null) {
            ph42.LIZLLL();
        }
        PQU pqu = this.LIZLLL;
        if (pqu != null) {
            if (((Boolean) C34903Dmt.LIZ.getValue()).booleanValue()) {
                try {
                    System.currentTimeMillis();
                    pqu.LJLJI = Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
                    pqu.LJLJJI = C39687Fhr.LJI(EF7.LIZIZ());
                } catch (Throwable unused) {
                }
            }
            C57022Lq.LIZ.LJLIL.removeCallbacks(pqu.LJLL);
        }
        if (C34015DWp.LIZ && (C35810E3q.LJIIIIZZ() || ((ph4 = this.LIZJ) != null && ph4.LIZIZ()))) {
            C37179EiV.LJFF.post(new ARunnableS47S0100000_11(this, 55));
        }
        if (C53240Kuy.LIZIZ(this.LIZ)) {
            C64453PRh.LIZ(this.LIZ).LJ();
        }
        PRT prt = this.LJI;
        if (prt != null) {
            prt.LIZIZ(this.LIZ);
        }
        PRT prt2 = this.LJII;
        if (prt2 != null) {
            prt2.LIZIZ(this.LIZ);
        }
        if (FN1.LIZ && (LIZ = C38861FMz.LIZ(this.LIZ)) != null) {
            LIZ.start();
        }
        if (!C60792a3.LIZ()) {
            return;
        }
        if (!C64448PRc.LIZIZ) {
            C64448PRc.LIZ(new C48863JFr(), new C72085SQv(), new C47261Igj(), new C66851QLn());
        }
        C64448PRc.LIZIZ(this.LIZ);
    }

    @Override // X.InterfaceC55057LjB
    public final void stop() {
        PH4 ph4;
        InterfaceC64427PQh LIZ;
        C06140Ly.LIZJ(this.LIZ);
        if (!this.LJ) {
            return;
        }
        this.LJ = false;
        long uptimeMillis = SystemClock.uptimeMillis();
        PQU pqu = this.LIZLLL;
        if (pqu != null) {
            pqu.LJLILLLLZI = uptimeMillis - this.LJFF;
            C57022Lq.LIZ.LJLIL.postDelayed(pqu.LJLL, 2000L);
        }
        PH4 ph42 = this.LIZJ;
        if (ph42 != null) {
            ph42.LJ();
        }
        if (FN1.LIZ && (LIZ = C38861FMz.LIZ(this.LIZ)) != null) {
            LIZ.stop();
        }
        if (C34015DWp.LIZ && (C35810E3q.LJIIIIZZ() || ((ph4 = this.LIZJ) != null && ph4.LIZIZ()))) {
            Handler handler = C37179EiV.LJFF;
            handler.post(new ARunnableS47S0100000_11(this, 53));
            handler.postDelayed(new ARunnableS47S0100000_11(this, 54), 500L);
        }
        if (C53240Kuy.LIZIZ(this.LIZ)) {
            C64453PRh.LIZ(this.LIZ).LIZ = false;
        }
        PRT prt = this.LJI;
        if (prt != null) {
            prt.onStop(this.LIZ);
        }
        PRT prt2 = this.LJII;
        if (prt2 != null) {
            prt2.onStop(this.LIZ);
        }
        this.LJFF = 0L;
        if (C60792a3.LIZ()) {
            C64448PRc.LIZJ(this.LIZ);
        }
    }

    public PRD(String type) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = false;
        PH4 ph4 = new PH4(type, C40444Fu4.LIZ(type) || o.LJ(type, "dsp_sub_player_launch") || o.LJ(type, "dsp_launch"));
        this.LIZJ = ph4;
        this.LIZLLL = new PQU(type);
        ph4.LIZJ(new PRF(this));
        PRG prg = new PRG(this);
        PH3 ph3 = ph4.LJ;
        if (ph3 != null) {
            ph3.LJ = prg;
        }
        ph4.LIZLLL = prg;
    }

    @Override // X.InterfaceC55057LjB
    public final void LIZLLL(AbstractC55114Lk6 abstractC55114Lk6) {
        C222248ns.LIZ(this.LIZ);
        if (abstractC55114Lk6 != null) {
            abstractC55114Lk6.LJI(new PRL(this));
        }
    }

    @Override // X.InterfaceC55057LjB
    public final InterfaceC55057LjB LJ(C78588Usq listener) {
        o.LJIIIZ(listener, "listener");
        this.LJII = listener;
        return this;
    }

    @Override // X.InterfaceC55057LjB
    public final void LJFF(ViewPager viewPager) {
        C222248ns.LIZ(this.LIZ);
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new PRH(this));
        }
    }

    @Override // X.InterfaceC55057LjB
    public final InterfaceC55057LjB LJI(PRT listener) {
        o.LJIIIZ(listener, "listener");
        this.LJI = listener;
        return this;
    }

    @Override // X.InterfaceC55057LjB
    public final void LJIIIIZZ(RecyclerView recyclerView) {
        if (!TextUtils.equals(this.LIZ, "user_profile")) {
            C222248ns.LIZ(this.LIZ);
        }
        if (recyclerView != null) {
            recyclerView.LJIIJJI(new PRM(this));
        }
    }

    @Override // X.InterfaceC55057LjB
    public final InterfaceC55057LjB LIZ(String str, String value) {
        o.LJIIIZ(value, "value");
        PQU pqu = this.LIZLLL;
        if (pqu != null) {
            pqu.LJLJL.put(str, value);
        }
        return this;
    }

    @Override // X.InterfaceC55057LjB
    public final InterfaceC55057LjB LJII(Object value, String str) {
        PQU pqu;
        o.LJIIIZ(value, "value");
        if ((value instanceof String) && (pqu = this.LIZLLL) != null) {
            pqu.LJLJL.put(str, value);
        }
        return this;
    }

    @Override // X.InterfaceC55057LjB
    public final void LIZJ(C80796VnM c80796VnM, AObjectS23S0000000_6 aObjectS23S0000000_6, AObjectS22S0001000_6 aObjectS22S0001000_6, AObjectS22S0001000_6 aObjectS22S0001000_62) {
        C222248ns.LIZ(this.LIZ);
        if (c80796VnM != null) {
            c80796VnM.LJI(new PRI(aObjectS22S0001000_62, aObjectS22S0001000_6, c80796VnM, aObjectS23S0000000_6, this));
        }
    }
}
