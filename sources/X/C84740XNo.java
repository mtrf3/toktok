package X;

import Y.IDBReceiverS10S0100000_14;
import Y.IDBReceiverS11S0100000_15;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XNo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84740XNo extends AbstractC80014Vak {
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public XO6 LJLJJL;
    public C84743XNr LJLJJLL;
    public boolean LJLJL;
    public final Context LJLJLJ;
    public final XOK LJLJLLL;
    public final InterfaceC80020Vaq LJLL;
    public final int LJLLI;

    public final void LJIJJ() {
        XOK xok = this.LJLJLLL;
        if (xok != null) {
            xok.cancel();
        }
        try {
            C10760bY.LIZ(this.LJLJLJ).LIZLLL((IDBReceiverS11S0100000_15) this.LJLILLLLZI.getValue());
            C16880lQ.LJJLIIIJL(this.LJLJLJ, (IDBReceiverS10S0100000_14) this.LJLJI.getValue());
        } catch (Throwable unused) {
        }
        XO6 xo6 = this.LJLJJL;
        if (xo6 != null) {
            xo6.LJ();
        }
        this.LJLJJL = null;
        C84743XNr c84743XNr = this.LJLJJLL;
        if (c84743XNr != null) {
            c84743XNr.LIZIZ();
        }
        this.LJLJJLL = null;
        this.LJLJL = false;
    }

    public final void LJIJJLI() {
        EnumC79954VZm currentPlaybackState;
        InterfaceC80022Vas interfaceC80022Vas;
        C84743XNr c84743XNr = this.LJLJJLL;
        if (c84743XNr != null) {
            c84743XNr.LIZJ();
        }
        XO6 xo6 = this.LJLJJL;
        if (xo6 != null) {
            C80024Vau c80024Vau = this.LJLIL;
            if (c80024Vau == null || (interfaceC80022Vas = c80024Vau.LJLJJL) == null || (currentPlaybackState = interfaceC80022Vas.LJ()) == null) {
                currentPlaybackState = EnumC79954VZm.PLAYBACK_STATE_STOPPED;
            }
            o.LJIIJ(currentPlaybackState, "currentPlaybackState");
            if (C79956VZo.LIZ[currentPlaybackState.ordinal()] != 1) {
                C84747XNv c84747XNv = xo6.LJ;
                if (c84747XNv != null) {
                    c84747XNv.LIZ = Boolean.valueOf(currentPlaybackState.isPlayingState());
                    c84747XNv.LIZIZ = Boolean.valueOf(xo6.LJIIIZ.LIZLLL());
                    c84747XNv.LIZJ = Boolean.valueOf(xo6.LJIIIZ.LJFF());
                    xo6.LJFF(c84747XNv);
                    return;
                }
                return;
            }
            if (!xo6.LIZJ().LIZIZ) {
                return;
            }
            xo6.LIZIZ().removeMessages(1);
            xo6.LIZIZ().removeMessages(2);
            xo6.LIZIZ().sendMessageDelayed(Message.obtain(xo6.LIZIZ(), 2), 300L);
        }
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80047VbH
    public final void onPrepared() {
        long j;
        C84743XNr c84743XNr = this.LJLJJLL;
        if (c84743XNr != null) {
            C01P LIZ = c84743XNr.LIZ();
            V1L LIZ2 = c84743XNr.LJ.LIZ();
            if (LIZ2 != null) {
                j = LIZ2.getDuration();
            } else {
                j = 0;
            }
            long duration = c84743XNr.LIZLLL.getDuration();
            if (duration > 0) {
                j = duration;
            }
            LIZ.LIZJ(j);
            c84743XNr.LIZ.LJI(c84743XNr.LIZ().LIZ());
        }
    }

    @Override // X.InterfaceC80013Vaj
    public final void onDetach() {
        LJIJJ();
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80038Vb8
    public final void LJIILIIL(V1L v1l) {
        if (v1l == null) {
            LJIJJ();
            return;
        }
        if (!this.LJLJL) {
            C80024Vau c80024Vau = this.LJLIL;
            if (c80024Vau != null) {
                C84743XNr c84743XNr = new C84743XNr(this.LJLJLJ, c80024Vau.LJLJJL, c80024Vau.LJLJJLL, c80024Vau.LJLJL, (ComponentName) this.LJLJJI.getValue());
                Context context = this.LJLJLJ;
                MediaSessionCompat.Token token = c84743XNr.LIZ.LIZ.LIZIZ;
                o.LJFF(token, "mMediaSessionCompat.sessionToken");
                this.LJLJJL = new XO6(context, token, c80024Vau.LJLJJLL, (ComponentName) this.LJLJJI.getValue(), this.LJLL, this.LJLLI);
                this.LJLJJLL = c84743XNr;
            }
            C10760bY.LIZ(this.LJLJLJ).LIZIZ((BroadcastReceiver) this.LJLILLLLZI.getValue(), new IntentFilter("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST"));
            C16880lQ.LJJLIIIJILLIZJL((BroadcastReceiver) this.LJLJI.getValue(), this.LJLJLJ, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.LJLJL = true;
        }
        C84743XNr c84743XNr2 = this.LJLJJLL;
        if (c84743XNr2 != null) {
            C01P LIZ = c84743XNr2.LIZ();
            LIZ.LIZLLL("android.media.metadata.TITLE", v1l.getSongName());
            LIZ.LIZLLL("android.media.metadata.ALBUM", v1l.getAlbumName());
            LIZ.LIZLLL("android.media.metadata.ARTIST", v1l.getArtistName());
            long duration = v1l.getDuration();
            long duration2 = c84743XNr2.LIZLLL.getDuration();
            if (duration2 > 0) {
                duration = duration2;
            }
            LIZ.LIZJ(duration);
            LIZ.LIZIZ(null, "android.media.metadata.ART");
            c84743XNr2.LIZ.LJ(true);
            c84743XNr2.LIZ.LJI(c84743XNr2.LIZ().LIZ());
        }
        XO6 xo6 = this.LJLJJL;
        if (xo6 != null) {
            C84747XNv c84747XNv = new C84747XNv(0);
            c84747XNv.LIZ = Boolean.FALSE;
            c84747XNv.LIZIZ = Boolean.valueOf(xo6.LJIIIZ.LIZLLL());
            c84747XNv.LIZJ = Boolean.valueOf(xo6.LJIIIZ.LJFF());
            c84747XNv.LIZLLL = v1l.getSongName();
            c84747XNv.LJ = v1l.getArtistName();
            c84747XNv.LJFF = v1l.getAlbumName();
            c84747XNv.LJI = null;
            xo6.LJFF(c84747XNv);
            xo6.LJ = c84747XNv;
        }
        XOK xok = this.LJLJLLL;
        if (xok != null) {
            xok.LIZ(v1l.getCoverUrl(), new AqS181S0100000_15(this, 298));
        }
        LJIJJLI();
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80047VbH
    public final void LJIILJJIL(EnumC79999VaV seekState) {
        o.LJIIJ(seekState, "seekState");
        LJIJJLI();
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80047VbH
    public final void LJIILLIIL(EnumC79954VZm currentState) {
        boolean z;
        o.LJIIJ(currentState, "currentState");
        if (currentState != EnumC79954VZm.PLAYBACK_STATE_STOPPED) {
            z = true;
        } else {
            z = false;
        }
        C84743XNr c84743XNr = this.LJLJJLL;
        if (c84743XNr != null) {
            c84743XNr.LIZ.LJ(z);
        }
        XO6 xo6 = this.LJLJJL;
        if (xo6 != null) {
            xo6.LIZJ().LIZ = z;
        }
        LJIJJLI();
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80047VbH
    public final void onPlaybackTimeChanged(long j) {
        C84743XNr c84743XNr = this.LJLJJLL;
        if (c84743XNr != null) {
            c84743XNr.LIZJ();
        }
    }

    public C84740XNo(Context mContext, XOK xok, InterfaceC80020Vaq interfaceC80020Vaq, int i) {
        o.LJIIJ(mContext, "mContext");
        this.LJLJLJ = mContext;
        this.LJLJLLL = xok;
        this.LJLL = interfaceC80020Vaq;
        this.LJLLI = i;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 914));
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 518));
        this.LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 913));
    }
}
