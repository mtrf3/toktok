package X;

import Y.IDBReceiverS12S0100000_29;
import Y.IDRunnableS88S0100000_29;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.media.session.MediaSessionCompat;
import kotlin.jvm.internal.IDqS417S0100000_29;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zve, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91502Zve implements InterfaceC91459Zux, InterfaceC91291ZsF, InterfaceC91289ZsD, InterfaceC91288ZsC, InterfaceC91286ZsA {
    public final Context LJLIL;
    public final C91229ZrF LJLILLLLZI;
    public C91605ZxJ LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public C91437Zub LJLJJLL;
    public C91443Zuh LJLJL;
    public volatile boolean LJLJLJ;

    public C91502Zve() {
        this(0);
    }

    @Override // X.InterfaceC91291ZsF
    public final void Kj(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
    }

    public final synchronized void LJIIL() {
        if (this.LJLJLJ) {
            return;
        }
        C91443Zuh c91443Zuh = new C91443Zuh(this.LJLIL, LJII(), (ComponentName) this.LJLJJL.getValue());
        Context context = this.LJLIL;
        C91229ZrF c91229ZrF = this.LJLILLLLZI;
        C91419ZuJ c91419ZuJ = c91229ZrF.LIZJ;
        InterfaceC91227ZrD interfaceC91227ZrD = c91229ZrF.LIZIZ;
        C91605ZxJ LJII = LJII();
        MediaSessionCompat.Token token = c91443Zuh.LIZLLL.LIZ.LIZIZ;
        o.LJIIIIZZ(token, "mMediaSessionCompat.sessionToken");
        this.LJLJJLL = new C91437Zub(context, c91419ZuJ, interfaceC91227ZrD, LJII, token, (ComponentName) this.LJLJJL.getValue());
        this.LJLJL = c91443Zuh;
        C10760bY.LIZ(this.LJLIL).LIZIZ((IDBReceiverS12S0100000_29) this.LJLJJI.getValue(), new IntentFilter("player.plugin.mediasession.common.intent.filter.AWE_MEDIA_SESSION_BROADCAST"));
        this.LJLJLJ = true;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPause(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPlay(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptResume(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSeek(long j) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSetStartPlayTime(int i) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptStop(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        Object LIZ;
        LJIILJJIL(false);
        LJII().bK(this);
        LJII().LJLJI.LJLIL.LJIIL(this);
        LJII().LJLJI.LJLJI.LJIIL(this);
        InterfaceC91418ZuI interfaceC91418ZuI = this.LJLILLLLZI.LIZ;
        if (interfaceC91418ZuI != null) {
            interfaceC91418ZuI.release();
        }
        try {
            C10760bY.LIZ(this.LJLIL).LIZLLL((IDBReceiverS12S0100000_29) this.LJLJJI.getValue());
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        C91437Zub c91437Zub = this.LJLJJLL;
        if (c91437Zub != null) {
            c91437Zub.release();
        }
        this.LJLJJLL = null;
        C91443Zuh c91443Zuh = this.LJLJL;
        if (c91443Zuh != null) {
            c91443Zuh.release();
        }
        this.LJLJL = null;
        this.LJLJLJ = false;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
    }

    @Override // X.InterfaceC91288ZsC
    public final InterfaceC91296ZsK processPlayable(InterfaceC91296ZsK interfaceC91296ZsK) {
        return interfaceC91296ZsK;
    }

    public final C91605ZxJ LJII() {
        C91605ZxJ c91605ZxJ = this.LJLJI;
        if (c91605ZxJ != null) {
            return c91605ZxJ;
        }
        o.LJIJI("mediaPlayerService");
        throw null;
    }

    public final void LJIJI() {
        C91437Zub c91437Zub;
        C91443Zuh c91443Zuh = this.LJLJL;
        if (c91443Zuh != null) {
            c91443Zuh.LIZLLL();
        }
        if (this.LJLJI != null && (c91437Zub = this.LJLJJLL) != null) {
            EnumC91310ZsY currentPlaybackState = LJII().LJIJI();
            o.LJIIIZ(currentPlaybackState, "currentPlaybackState");
            boolean isPauseState = currentPlaybackState.isPauseState();
            C91263Zrn c91263Zrn = c91437Zub.LJI;
            boolean z = true;
            c91263Zrn.LIZ = Boolean.valueOf(!isPauseState);
            c91263Zrn.LIZJ = Boolean.valueOf(c91437Zub.LIZLLL.LJFF());
            if (c91437Zub.LIZLLL.LJIIIIZZ() == null) {
                z = false;
            }
            c91263Zrn.LIZIZ = Boolean.valueOf(z);
            c91437Zub.LJFF(false);
        }
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
        int i;
        C91443Zuh c91443Zuh = this.LJLJL;
        if (c91443Zuh != null) {
            C01P LIZJ = c91443Zuh.LIZJ();
            InterfaceC91296ZsK LIZ = c91443Zuh.LIZIZ.LIZ();
            if (LIZ != null) {
                i = LIZ.getDuration();
            } else {
                i = 0;
            }
            long j = i;
            long LJIJJ = c91443Zuh.LIZIZ.LJIJJ();
            if (LJIJJ > 0) {
                j = LJIJJ;
            }
            LIZJ.LIZJ(j);
            c91443Zuh.LIZLLL.LJI(c91443Zuh.LIZJ().LIZ());
        }
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        LJII().Mu(this);
        LJII().LJLJI.LJLIL.LJII(this);
        LJII().LJLJI.LJLJI.LJII(this);
        InterfaceC91459Zux interfaceC91459Zux = LJII().LJLJJI.LJLILLLLZI.get(C91498Zva.class);
        if (!(interfaceC91459Zux instanceof C91498Zva)) {
            interfaceC91459Zux = null;
        }
        C91498Zva c91498Zva = (C91498Zva) interfaceC91459Zux;
        if (c91498Zva != null) {
            c91498Zva.LJLIL.LIZ(this);
        }
        YXW.LIZ.getClass();
        if (YXW.LJIIIIZZ) {
            C38995FSd.LIZJ().execute(new IDRunnableS88S0100000_29(this, 16));
        }
    }

    public C91502Zve(int i) {
        Context LIZIZ = EF7.LIZIZ();
        C91229ZrF c91229ZrF = new C91229ZrF(new C91501Zvd(), new C91434ZuY(), new C91419ZuJ());
        this.LJLIL = LIZIZ;
        this.LJLILLLLZI = c91229ZrF;
        this.LJLJJI = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 74));
        this.LJLJJL = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 75));
    }

    @Override // X.InterfaceC91291ZsF
    public final void Hz(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
    }

    public final void LJIILJJIL(boolean z) {
        C91443Zuh c91443Zuh = this.LJLJL;
        if (c91443Zuh != null) {
            c91443Zuh.LIZLLL.LJ(z);
        }
        C91437Zub c91437Zub = this.LJLJJLL;
        if (c91437Zub != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("notification, updateActivity = ");
            LIZ.append(z);
            X1D.LIZIZ(LIZ);
            c91437Zub.LJII = z;
            if (z) {
                c91437Zub.LJFF(true);
            } else {
                c91437Zub.LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC91291ZsF
    public final void Y50(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
        LJIILJJIL(false);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        o.LJIIIZ(currentState, "currentState");
        LJIJI();
        int i = C91231ZrH.LIZ[currentState.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            LJIILJJIL(false);
            return;
        }
        LJIILJJIL(true);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
        C91443Zuh c91443Zuh = this.LJLJL;
        if (c91443Zuh != null) {
            c91443Zuh.LIZLLL();
        }
    }

    @Override // X.InterfaceC91459Zux
    public final void setMediaPlayerService(C91605ZxJ c91605ZxJ) {
        this.LJLJI = c91605ZxJ;
    }

    @Override // X.InterfaceC91286ZsA
    public final void B8(C91299ZsN c91299ZsN, boolean z) {
        String str;
        if (z && this.LJLJI != null) {
            if (C91222Zr8.LIZ(c91299ZsN, LJII().LIZ())) {
                LJIILJJIL(true);
            }
        } else {
            if (c91299ZsN != null) {
                str = c91299ZsN.LIZ;
            } else {
                str = null;
            }
            if (o.LJ(str, "PAUSE_FROM_ON_BACKGROUND")) {
                L41.LIZ.getClass();
                if (L41.LIZ()) {
                    return;
                }
            }
            LJIILJJIL(false);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onActiveChange ");
        LIZ.append(z);
        LIZ.append(' ');
        LIZ.append(c91299ZsN);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC91291ZsF
    public final void a50(C91299ZsN c91299ZsN, InterfaceC91296ZsK playable) {
        boolean z;
        o.LJIIIZ(playable, "playable");
        LJIIL();
        C91443Zuh c91443Zuh = this.LJLJL;
        if (c91443Zuh != null) {
            C01P LIZJ = c91443Zuh.LIZJ();
            LIZJ.LIZLLL("android.media.metadata.TITLE", playable.getSongName());
            LIZJ.LIZLLL("android.media.metadata.ALBUM", playable.getAlbumName());
            LIZJ.LIZLLL("android.media.metadata.ARTIST", playable.getArtistName());
            long duration = playable.getDuration();
            long LJIJJ = c91443Zuh.LIZIZ.LJIJJ();
            if (LJIJJ > 0) {
                duration = LJIJJ;
            }
            LIZJ.LIZJ(duration);
            LIZJ.LIZIZ(null, "android.media.metadata.ART");
            c91443Zuh.LIZLLL.LJ(true);
            c91443Zuh.LIZLLL.LJI(c91443Zuh.LIZJ().LIZ());
        }
        C91437Zub c91437Zub = this.LJLJJLL;
        if (c91437Zub != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateData:");
            LIZ.append(playable.getId());
            X1D.LIZIZ(LIZ);
            C91263Zrn c91263Zrn = c91437Zub.LJI;
            c91263Zrn.LIZ = Boolean.TRUE;
            c91263Zrn.LIZJ = Boolean.valueOf(c91437Zub.LIZLLL.LJFF());
            if (c91437Zub.LIZLLL.LJIIIIZZ() != null) {
                z = true;
            } else {
                z = false;
            }
            c91263Zrn.LIZIZ = Boolean.valueOf(z);
            c91263Zrn.LIZLLL = playable.getSongName();
            c91263Zrn.LJ = playable.getArtistName();
            c91263Zrn.LJFF = playable.getAlbumName();
            c91263Zrn.LJI = null;
            c91437Zub.LJFF(true);
        }
        InterfaceC91418ZuI interfaceC91418ZuI = this.LJLILLLLZI.LIZ;
        if (interfaceC91418ZuI != null) {
            interfaceC91418ZuI.LIZ(playable.LJFF(), new IDqS417S0100000_29(this, 24));
        }
        LJIJI();
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
