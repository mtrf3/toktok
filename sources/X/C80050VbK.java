package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VbK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80050VbK implements InterfaceC80022Vas, InterfaceC80068Vbc, InterfaceC80017Van {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Context LJLJJL;
    public final C79702VPu LJLJJLL;

    public final C80051VbL LIZLLL() {
        return (C80051VbL) this.LJLJI.getValue();
    }

    public final C80060VbU LJFF() {
        return (C80060VbU) this.LJLJJI.getValue();
    }

    public final C80049VbJ LJIIIIZZ() {
        return (C80049VbJ) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC80018Vao
    public final C48651J7n LJIJJ() {
        return ((C80052VbM) this.LJLILLLLZI.getValue()).LJLIL;
    }

    public final long LIZJ() {
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ.LIZJ == null) {
            return 0L;
        }
        return (LJIIIIZZ.LJIIL().getDuration() * LJIIIIZZ.LJIIL().LIZIZ()) / 100;
    }

    @Override // X.InterfaceC80022Vas
    public final EnumC79954VZm LJ() {
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ.LIZJ != null) {
            return LJIIIIZZ.LJIIL().LJIIZILJ();
        }
        return EnumC79954VZm.PLAYBACK_STATE_STOPPED;
    }

    public final long LJIIJ() {
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ.LIZJ != null) {
            return LJIIIIZZ.LJIIL().LJFF();
        }
        return 0L;
    }

    public final void LJIIL() {
        LJFF().LJ();
        LIZLLL().LIZ();
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        LJIIIIZZ.LIZJ = null;
        LJIIIIZZ.LJIIL().release();
    }

    @Override // X.InterfaceC80022Vas
    public final long getCurrentPlaybackTime() {
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ.LIZJ != null) {
            return LJIIIIZZ.LJIIL().getCurrentPlaybackTime();
        }
        return 0L;
    }

    @Override // X.InterfaceC80022Vas
    public final long getDuration() {
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ.LIZJ != null) {
            return LJIIIIZZ.LJIIL().getDuration();
        }
        return 0L;
    }

    public final void LIZ(InterfaceC80047VbH listener) {
        o.LJIIJ(listener, "listener");
        LJFF().LIZIZ(listener);
    }

    @Override // X.InterfaceC80022Vas
    public final void LIZIZ(C48651J7n c48651J7n) {
        if (LIZLLL().LIZIZ(c48651J7n)) {
            return;
        }
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ.LIZJ != null) {
            LJIIIIZZ.LJIIL().pause();
        }
    }

    @Override // X.InterfaceC80022Vas
    public final void LJI(C48651J7n c48651J7n) {
        if (LIZLLL().LJI(c48651J7n)) {
            return;
        }
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ.LIZJ != null) {
            LJIIIIZZ.LJIIL().resume();
        }
    }

    @Override // X.InterfaceC80022Vas
    public final void LJII(C48651J7n c48651J7n) {
        if (LIZLLL().LJII(c48651J7n)) {
            return;
        }
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ.LIZJ != null) {
            LJIIIIZZ.LJIIL().stop();
        }
    }

    @Override // X.InterfaceC80022Vas
    public final void LJIIIZ(C48651J7n c48651J7n) {
        if (LIZLLL().LJIIIZ(c48651J7n)) {
            return;
        }
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        LJIIIIZZ.LJIIL().LIZJ(LJIIIIZZ.LIZLLL);
        LJIIIIZZ.LIZLLL = 0L;
    }

    @Override // X.InterfaceC80017Van
    public final void LJIIJJI(InterfaceC80059VbT interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        LIZLLL().LJIIJJI(interceptor);
    }

    public final void LJIILJJIL(J7O j7o) {
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        LJIIIIZZ.getClass();
        LJIIIIZZ.LJ = j7o;
    }

    @Override // X.InterfaceC80017Van
    public final void LJIILL(InterfaceC80059VbT interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        LIZLLL().LJIILL(interceptor);
    }

    @Override // X.InterfaceC80022Vas
    public final void LJIIZILJ(C73363Sql c73363Sql) {
        C73363Sql LJIJI = LIZLLL().LJIJI(c73363Sql);
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        LJIIIIZZ.LIZJ = LJIJI;
        LJIIIIZZ.LIZIZ = EnumC80054VbO.INIT;
        LJIIIIZZ.LJIILIIL(EnumC48648J7k.INVALIDATE_PLAYER_MODEL);
        LJFF().LIZLLL(LJIJI);
    }

    @Override // X.InterfaceC80068Vbc
    public final void LJIJ(InterfaceC80047VbH listener) {
        o.LJIIJ(listener, "listener");
        LJFF().LJIJ(listener);
    }

    public C80050VbK(Context mAppContext, C79702VPu mAudioErrorMonitor) {
        o.LJIIJ(mAppContext, "mAppContext");
        o.LJIIJ(mAudioErrorMonitor, "mAudioErrorMonitor");
        this.LJLJJL = mAppContext;
        this.LJLJJLL = mAudioErrorMonitor;
        this.LJLIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 391));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 392));
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 389));
        this.LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
    }

    @Override // X.InterfaceC80022Vas
    public final void LJIILIIL(long j, J7Y j7y) {
        if (LIZLLL().LJIJ()) {
            return;
        }
        C80049VbJ LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ.LIZJ == null || LJIIIIZZ.LJIIL().LJIIZILJ() == EnumC79954VZm.PLAYBACK_STATE_STOPPED) {
            LJIIIIZZ.LIZLLL = j;
            if (LJIIIIZZ.LJIIL() instanceof J7W) {
                InterfaceC80053VbN LJIIL = LJIIIIZZ.LJIIL();
                if (LJIIL != null) {
                    ((J7W) LJIIL).LJI = LJIIIIZZ.LIZLLL;
                    return;
                }
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.xelement.defaultimpl.player.engine.impl.player.engine.TTAudioEngineImpl");
            }
            return;
        }
        LJIIIIZZ.LJI.LJIILJJIL(EnumC79999VaV.SEEKING);
        LJIIIIZZ.LJIIL().LJI(j, new C80055VbP(LJIIIIZZ, j7y));
    }
}
