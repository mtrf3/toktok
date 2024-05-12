package X;

import Y.ARunnableS14S0101000_10;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class NQM implements InterfaceC61396O7s {
    public NQN LIZ;
    public final Context LIZIZ;
    public final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());
    public boolean LIZLLL = false;
    public boolean LJ = false;
    public boolean LJFF = true;

    @Override // X.InterfaceC61396O7s
    public final void LIZ() {
        C59753Ncj c59753Ncj;
        NQN nqn = this.LIZ;
        if (nqn == null || nqn.LIZIZ == null || (c59753Ncj = nqn.LIZJ) == null) {
            return;
        }
        C38891fp.LJIIIIZZ(c59753Ncj.LIZ);
        c59753Ncj.LIZ.LJ.LIZIZ("midpoint");
    }

    @Override // X.InterfaceC61396O7s
    public final void LIZIZ() {
        C59753Ncj c59753Ncj;
        NQN nqn = this.LIZ;
        if (nqn == null || nqn.LIZIZ == null || (c59753Ncj = nqn.LIZJ) == null) {
            return;
        }
        C38891fp.LJIIIIZZ(c59753Ncj.LIZ);
        c59753Ncj.LIZ.LJ.LIZIZ("thirdQuartile");
    }

    @Override // X.InterfaceC61396O7s
    public final void LIZJ() {
        C59753Ncj c59753Ncj;
        NQN nqn = this.LIZ;
        if (nqn == null) {
            return;
        }
        if (nqn.LIZIZ != null && (c59753Ncj = nqn.LIZJ) != null) {
            C38891fp.LJIIIIZZ(c59753Ncj.LIZ);
            c59753Ncj.LIZ.LJ.LIZIZ("complete");
        }
        this.LIZLLL = true;
    }

    @Override // X.InterfaceC61396O7s
    public final void LJFF() {
        if (this.LIZ == null) {
            return;
        }
        int i = 0;
        try {
            SettingsManager.LIZLLL().getClass();
            int LJ = SettingsManager.LJ("omsdk_session_delay_second", 0);
            if (LJ > 0) {
                if (!this.LIZLLL) {
                    LJII();
                }
                if (this.LJFF) {
                    i = LJ;
                }
                this.LIZJ.postDelayed(new ARunnableS14S0101000_10(1, this, 0), i * 1000);
                return;
            }
        } catch (Throwable unused) {
        }
        NQN nqn = this.LIZ;
        C60014Ngw c60014Ngw = nqn.LIZIZ;
        if (c60014Ngw != null) {
            c60014Ngw.LIZJ();
            nqn.LIZIZ = null;
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC61396O7s
    public final void LJI() {
        C59753Ncj c59753Ncj;
        NQN nqn = this.LIZ;
        if (nqn == null || nqn.LIZIZ == null || (c59753Ncj = nqn.LIZJ) == null) {
            return;
        }
        C38891fp.LJIIIIZZ(c59753Ncj.LIZ);
        c59753Ncj.LIZ.LJ.LIZIZ("firstQuartile");
    }

    @Override // X.InterfaceC61396O7s
    public final void LJII() {
        C59753Ncj c59753Ncj;
        NQN nqn = this.LIZ;
        if (nqn != null && !this.LJ) {
            if (nqn.LIZIZ != null && (c59753Ncj = nqn.LIZJ) != null) {
                C38891fp.LJIIIIZZ(c59753Ncj.LIZ);
                c59753Ncj.LIZ.LJ.LIZIZ("skipped");
            }
            this.LJ = true;
        }
    }

    @Override // X.InterfaceC61396O7s
    public final void LJIIIZ() {
        C59753Ncj c59753Ncj;
        NQN nqn = this.LIZ;
        if (nqn == null) {
            return;
        }
        this.LIZLLL = true;
        if (nqn.LIZIZ == null || (c59753Ncj = nqn.LIZJ) == null) {
            return;
        }
        c59753Ncj.LIZ(C99J.CLICK);
    }

    public NQM(Context context) {
        if (context != null) {
            this.LIZIZ = C16880lQ.LLLLL(context);
        }
    }

    @Override // X.InterfaceC61396O7s
    public final void LIZLLL(O7E o7e) {
        Context context = this.LIZIZ;
        C59390NSo c59390NSo = C59997Ngf.LIZ;
        if (!c59390NSo.LIZ) {
            C59997Ngf.LIZ(context);
        }
        if (!c59390NSo.LIZ) {
            return;
        }
        if (this.LIZ != null) {
            LJFF();
        }
        this.LIZ = new NQN(o7e);
        this.LJFF = o7e.LJIILJJIL();
        this.LIZLLL = false;
        this.LJ = false;
    }

    @Override // X.InterfaceC61396O7s
    public final void LJIIIIZZ(long j) {
        C59753Ncj c59753Ncj;
        NQN nqn = this.LIZ;
        if (nqn == null || nqn.LIZIZ == null || (c59753Ncj = nqn.LIZJ) == null) {
            return;
        }
        c59753Ncj.LIZJ((float) j, 0.0f);
    }

    @Override // X.InterfaceC61396O7s
    public final void LJ(View view, List<View> list) {
        C60014Ngw c60014Ngw;
        NQN nqn = this.LIZ;
        if (nqn == null || (c60014Ngw = nqn.LIZIZ) == null) {
            return;
        }
        c60014Ngw.LIZLLL(view);
        if (list != null) {
            Iterator<View> it = list.iterator();
            while (it.hasNext()) {
                nqn.LIZIZ.LIZ(it.next());
            }
        }
        if (nqn.LIZ) {
            nqn.LIZJ = C59753Ncj.LIZIZ(nqn.LIZIZ);
        }
        nqn.LIZIZ.LJI();
        C60016Ngy LIZIZ = C60016Ngy.LIZIZ(nqn.LIZIZ);
        EnumC62222cM enumC62222cM = EnumC62222cM.STANDALONE;
        C38891fp.LJFF(enumC62222cM, "Position is null");
        LIZIZ.LIZLLL(new NSV(enumC62222cM));
        LIZIZ.LIZJ();
    }
}
