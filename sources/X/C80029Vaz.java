package X;

import android.content.Context;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vaz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80029Vaz implements InterfaceC80026Vaw {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C80023Vat LJLJJI;
    public boolean LJLJJL;
    public final Context LJLJJLL;
    public final C79702VPu LJLJL;

    public final C80050VbK LJJIIJ() {
        return (C80050VbK) this.LJLILLLLZI.getValue();
    }

    public final C80032Vb2 LJJIIJZLJL() {
        return (C80032Vb2) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC80025Vav
    public final V1L LIZ() {
        if (!this.LJLJJL) {
            return LJJIIJZLJL().LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC80025Vav
    public final V1L LIZJ() {
        if (!this.LJLJJL) {
            return LJJIIJZLJL().LIZJ();
        }
        return null;
    }

    @Override // X.InterfaceC80025Vav
    public final boolean LIZLLL() {
        if (!this.LJLJJL) {
            return LJJIIJZLJL().LIZLLL();
        }
        return false;
    }

    @Override // X.InterfaceC80022Vas
    public final EnumC79954VZm LJ() {
        if (!this.LJLJJL) {
            return LJJIIJ().LJ();
        }
        return EnumC79954VZm.PLAYBACK_STATE_STOPPED;
    }

    @Override // X.InterfaceC80025Vav
    public final boolean LJFF() {
        if (!this.LJLJJL) {
            return LJJIIJZLJL().LJFF();
        }
        return false;
    }

    @Override // X.InterfaceC80025Vav
    public final V1L LJIIIIZZ() {
        if (!this.LJLJJL) {
            return LJJIIJZLJL().LJIIIIZZ();
        }
        return null;
    }

    @Override // X.InterfaceC80025Vav
    public final boolean LJIJI() {
        if (!this.LJLJJL) {
            return LJJIIJZLJL().LJIJI();
        }
        return false;
    }

    @Override // X.InterfaceC80018Vao
    public final C48651J7n LJIJJ() {
        if (!this.LJLJJL) {
            return LJJIIJ().LJIJJ();
        }
        return null;
    }

    @Override // X.InterfaceC80025Vav
    public final InterfaceC79968Va0 LJIJJLI() {
        if (!this.LJLJJL) {
            return LJJIIJZLJL().LJIJJLI();
        }
        return null;
    }

    public final long LJJIII() {
        if (!this.LJLJJL) {
            return LJJIIJ().LIZJ();
        }
        return 0L;
    }

    public final long LJJIIZ() {
        if (!this.LJLJJL) {
            return LJJIIJ().LJIIJ();
        }
        return 0L;
    }

    public final void LJJIIZI() {
        if (this.LJLJJL) {
            return;
        }
        ((C80045VbF) this.LJLJI.getValue()).LJ();
        LJJIIJZLJL().LJII();
        LJJIIJ().LJIIL();
        this.LJLJJL = true;
    }

    @Override // X.InterfaceC80025Vav
    public final EnumC79963VZv R() {
        if (!this.LJLJJL) {
            return LJJIIJZLJL().R();
        }
        return EnumC79963VZv.SEQUENCE;
    }

    @Override // X.InterfaceC80022Vas
    public final long getCurrentPlaybackTime() {
        if (!this.LJLJJL) {
            return LJJIIJ().getCurrentPlaybackTime();
        }
        return 0L;
    }

    @Override // X.InterfaceC80022Vas
    public final long getDuration() {
        if (!this.LJLJJL) {
            return LJJIIJ().getDuration();
        }
        return 0L;
    }

    @Override // X.InterfaceC80022Vas
    public final void LIZIZ(C48651J7n c48651J7n) {
        if (!this.LJLJJL) {
            LJJIIJ().LIZIZ(c48651J7n);
        }
    }

    @Override // X.InterfaceC80022Vas
    public final void LJI(C48651J7n c48651J7n) {
        if (!this.LJLJJL) {
            LJJIIJ().LJI(c48651J7n);
        }
    }

    @Override // X.InterfaceC80022Vas
    public final void LJII(C48651J7n c48651J7n) {
        if (!this.LJLJJL) {
            LJJIIJ().LJII(c48651J7n);
        }
    }

    @Override // X.InterfaceC80022Vas
    public final void LJIIIZ(C48651J7n c48651J7n) {
        if (!this.LJLJJL) {
            LJJIIJ().LJIIIZ(c48651J7n);
        }
    }

    @Override // X.InterfaceC80017Van
    public final void LJIIJJI(InterfaceC80059VbT interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        if (!this.LJLJJL) {
            LJJIIJ().LJIIJJI(interceptor);
        }
    }

    @Override // X.InterfaceC84737XNl
    public final void LJIIL(C48651J7n c48651J7n) {
        if (!this.LJLJJL) {
            this.LJLJJI.LJIIL(c48651J7n);
        }
    }

    @Override // X.InterfaceC80044VbE
    public final void LJIILJJIL(InterfaceC80038Vb8 listener) {
        o.LJIIJ(listener, "listener");
        if (!this.LJLJJL) {
            LJJIIJZLJL().LJIILJJIL(listener);
        }
    }

    @Override // X.InterfaceC80017Van
    public final void LJIILL(InterfaceC80059VbT interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        if (!this.LJLJJL) {
            LJJIIJ().LJIILL(interceptor);
        }
    }

    @Override // X.InterfaceC80021Var
    public final void LJIILLIIL(InterfaceC80037Vb7 interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        if (!this.LJLJJL) {
            LJJIIJZLJL().LJIILLIIL(interceptor);
        }
    }

    @Override // X.InterfaceC80022Vas
    public final void LJIIZILJ(C73363Sql c73363Sql) {
        if (!this.LJLJJL) {
            LJJIIJ().LJIIZILJ(c73363Sql);
        }
    }

    @Override // X.InterfaceC80068Vbc
    public final void LJIJ(InterfaceC80047VbH listener) {
        o.LJIIJ(listener, "listener");
        if (!this.LJLJJL) {
            LJJIIJ().LJIJ(listener);
        }
    }

    @Override // X.InterfaceC80021Var
    public final void LJIL(InterfaceC80037Vb7 interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        if (!this.LJLJJL) {
            LJJIIJZLJL().LJIL(interceptor);
        }
    }

    @Override // X.InterfaceC84737XNl
    public final void LJJ(C48651J7n c48651J7n) {
        if (!this.LJLJJL) {
            this.LJLJJI.LJJ(c48651J7n);
        }
    }

    public final void LJJI(InterfaceC80047VbH listener) {
        o.LJIIJ(listener, "listener");
        if (!this.LJLJJL) {
            LJJIIJ().LIZ(listener);
        }
    }

    public final void LJJIFFI(InterfaceC80038Vb8 listener) {
        o.LJIIJ(listener, "listener");
        if (!this.LJLJJL) {
            LJJIIJZLJL().LIZIZ(listener);
        }
    }

    public final void LJJII(InterfaceC80013Vaj plugin) {
        o.LJIIJ(plugin, "plugin");
        if (!this.LJLJJL) {
            ((C80045VbF) this.LJLJI.getValue()).LIZIZ(plugin);
        }
    }

    public final void LJJIJ(InterfaceC80013Vaj plugin) {
        o.LJIIJ(plugin, "plugin");
        if (!this.LJLJJL) {
            ((C80045VbF) this.LJLJI.getValue()).LJI(plugin);
        }
    }

    public final void LJJIJIIJI(EnumC79963VZv enumC79963VZv) {
        if (!this.LJLJJL) {
            LJJIIJZLJL().LJIIIZ(enumC79963VZv);
        }
    }

    public final void LJJIJIIJIL(J7O j7o) {
        if (!this.LJLJJL) {
            LJJIIJ().LJIILJJIL(j7o);
        }
    }

    public final void LJJIJIL(InterfaceC79968Va0 interfaceC79968Va0) {
        if (!this.LJLJJL) {
            LJJIIJZLJL().LJIIJJI(interfaceC79968Va0);
        }
    }

    public C80029Vaz(Context mAppContext, C79702VPu mAudioErrorMonitor) {
        o.LJIIJ(mAppContext, "mAppContext");
        o.LJIIJ(mAudioErrorMonitor, "mAudioErrorMonitor");
        this.LJLJJLL = mAppContext;
        this.LJLJL = mAudioErrorMonitor;
        this.LJLIL = C221108m2.LIZIZ(C80031Vb1.LJLIL);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 374));
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 375));
        C80023Vat c80023Vat = new C80023Vat();
        this.LJLJJI = c80023Vat;
        LJJII(c80023Vat);
    }

    @Override // X.InterfaceC80025Vav
    public final void LJIIJ(V1L v1l, C48651J7n c48651J7n) {
        if (!this.LJLJJL) {
            LJJIIJZLJL().LJIIJ(v1l, c48651J7n);
        }
    }

    @Override // X.InterfaceC80022Vas
    public final void LJIILIIL(long j, J7Y j7y) {
        if (!this.LJLJJL) {
            LJJIIJ().LJIILIIL(j, j7y);
        }
    }
}
