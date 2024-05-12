package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.J7l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48649J7l implements InterfaceC80022Vas {
    public IDP LJLIL;

    public final IDP LIZ() {
        IDP idp = this.LJLIL;
        if (idp != null) {
            return idp;
        }
        o.LJIJI("playerController");
        throw null;
    }

    public final boolean LIZJ() {
        if (this.LJLIL != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80018Vao
    public final C48651J7n LJIJJ() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    public final boolean LIZLLL() {
        if (LIZJ() && (LJ() == EnumC79954VZm.PLAYBACK_STATE_PLAYING || LJ() == EnumC79954VZm.PLAYBACK_STATE_START)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80022Vas
    public final EnumC79954VZm LJ() {
        I90 playState = LIZ().LJJJJIZL().LJJIJIL().getPlayState();
        o.LJIIIIZZ(playState, "playerController.playerManager.simPlayer.playState");
        switch (((C46751IWl) playState).LIZ.getState()) {
            case 0:
                return EnumC79954VZm.PLAYBACK_STATE_PAUSED;
            case 1:
                return EnumC79954VZm.PLAYBACK_STATE_START;
            case 2:
                return EnumC79954VZm.PLAYBACK_STATE_START;
            case 3:
                return EnumC79954VZm.PLAYBACK_STATE_START;
            case 4:
                return EnumC79954VZm.PLAYBACK_STATE_PLAYING;
            case 5:
                return EnumC79954VZm.PLAYBACK_STATE_PAUSED;
            case 6:
                return EnumC79954VZm.PLAYBACK_STATE_PAUSED;
            case 7:
                return EnumC79954VZm.PLAYBACK_STATE_STOPPED;
            default:
                return EnumC79954VZm.PLAYBACK_STATE_ERROR;
        }
    }

    public final void LJFF() {
        String str;
        if (LIZJ()) {
            Aweme LJJIIZI = LIZ().LJJIIZI();
            IDR LJJJ = LIZ().LJJJ();
            if (LJJJ != null) {
                str = LJJJ.getEnterFrom(true);
            } else {
                str = null;
            }
            C47541IlF.LIZLLL(LJJIIZI, str);
        }
    }

    @Override // X.InterfaceC80022Vas
    public final long getCurrentPlaybackTime() {
        return LIZ().LJJJJIZL().getCurrentPosition();
    }

    @Override // X.InterfaceC80022Vas
    public final long getDuration() {
        return LIZ().LJJIJ(null);
    }

    @Override // X.InterfaceC80022Vas
    public final void LIZIZ(C48651J7n c48651J7n) {
        String str;
        String str2;
        if (LIZJ()) {
            if (c48651J7n != null && (str = c48651J7n.LIZ) != null) {
                int hashCode = str.hashCode();
                if (hashCode != 270608360) {
                    if (hashCode != 1553123424) {
                        if (hashCode == 1836520147) {
                            str.equals("PAUSE_FROM_LOSS_FOCUS_TRANSIENT");
                        }
                    } else if (str.equals("PAUSE_FROM_NOTIFICATION_CLICK")) {
                        Aweme LJJIIZI = LIZ().LJJIIZI();
                        IDR LJJJ = LIZ().LJJJ();
                        if (LJJJ != null) {
                            str2 = LJJJ.getEnterFrom(true);
                        } else {
                            str2 = null;
                        }
                        if (LJJIIZI != null && str2 != null) {
                            C47541IlF.LJFF(LJJIIZI, str2, "click_audio_pause", null);
                        }
                        LJFF();
                    }
                } else if (str.equals("PAUSE_FROM_LOSS_FOCUS")) {
                    LJFF();
                }
            }
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new JD0(this, null), 3);
        }
    }

    @Override // X.InterfaceC80022Vas
    public final void LJI(C48651J7n c48651J7n) {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new JD2(this, null), 3);
    }

    @Override // X.InterfaceC80022Vas
    public final void LJII(C48651J7n c48651J7n) {
        if (LIZJ()) {
            LIZ();
            if (LIZ().LJJJJIZL() != null) {
                LIZ().LJJJJIZL().LLLLLL();
                LJFF();
            }
        }
    }

    @Override // X.InterfaceC80022Vas
    public final void LJIIIZ(C48651J7n c48651J7n) {
        String str;
        if (LIZJ()) {
            Aweme LJJIIZI = LIZ().LJJIIZI();
            IDR LJJJ = LIZ().LJJJ();
            if (LJJJ != null) {
                str = LJJJ.getEnterFrom(true);
            } else {
                str = null;
            }
            C47541IlF.LJ = Long.valueOf(System.currentTimeMillis());
            C47541IlF.LJI = true;
            C47541IlF.LIZLLL = 0L;
            if (LJJIIZI != null && str != null) {
                C47541IlF.LJFF(LJJIIZI, str, "click_audio_play", null);
            }
            if (C84763XOl.LJIIJJI && !C46416IJo.LIZJ()) {
                C47541IlF.LIZIZ = true;
            }
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new JD1(this, null), 3);
        }
    }

    @Override // X.InterfaceC80022Vas
    public final void LJIIZILJ(C73363Sql c73363Sql) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // X.InterfaceC80022Vas
    public final void LJIILIIL(long j, J7Y j7y) {
        String str;
        if (LIZJ()) {
            LIZ().LJJJJIZL().LJI((((float) j) / ((float) getDuration())) * 100);
            Aweme LJJIIZI = LIZ().LJJIIZI();
            IDR LJJJ = LIZ().LJJJ();
            if (LJJJ != null) {
                str = LJJJ.getEnterFrom(true);
            } else {
                str = null;
            }
            if (LJJIIZI != null && str != null) {
                C47541IlF.LJFF(LJJIIZI, str, "click_progress_bar", null);
            }
        }
    }
}
