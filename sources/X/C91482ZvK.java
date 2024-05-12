package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZvK, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91482ZvK implements InterfaceC91459Zux, InterfaceC91289ZsD, InterfaceC91288ZsC {
    public C91605ZxJ LJLIL;
    public InterfaceC91296ZsK LJLILLLLZI;
    public EnumC91310ZsY LJLJI = EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
    public long LJLJJI;
    public long LJLJJL;

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
    public final boolean interceptStop(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
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

    static {
        C16880lQ.LJLLJ(C47831Ipv.class);
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            c91605ZxJ.LJLJI.LJLIL.LJII(this);
            C91605ZxJ c91605ZxJ2 = this.LJLIL;
            if (c91605ZxJ2 != null) {
                c91605ZxJ2.LJLJI.LJLJI.LJII(this);
                return;
            } else {
                o.LJIJI("mediaPlayerService");
                throw null;
            }
        }
        o.LJIJI("mediaPlayerService");
        throw null;
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            c91605ZxJ.LJLJI.LJLIL.LJIIL(this);
            C91605ZxJ c91605ZxJ2 = this.LJLIL;
            if (c91605ZxJ2 != null) {
                c91605ZxJ2.LJLJI.LJLJI.LJIIL(this);
                return;
            } else {
                o.LJIJI("mediaPlayerService");
                throw null;
            }
        }
        o.LJIJI("mediaPlayerService");
        throw null;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSetStartPlayTime(int i) {
        this.LJLJJI = i;
        return false;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
        this.LJLILLLLZI = interfaceC91296ZsK;
        this.LJLJJL = 0L;
        this.LJLJJI = 0L;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        o.LJIIIZ(currentState, "currentState");
        if (C91081Zor.LIZ[currentState.ordinal()] == 2 && this.LJLJI.isPauseState()) {
            this.LJLJJL = 0L;
        }
        this.LJLJI = currentState;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
        long j2 = j - this.LJLJJI;
        this.LJLJJI = j;
        if (j2 > 0) {
            this.LJLJJL += j2;
        }
    }

    @Override // X.InterfaceC91459Zux
    public final void setMediaPlayerService(C91605ZxJ c91605ZxJ) {
        this.LJLIL = c91605ZxJ;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
        if (seekState == EnumC91311ZsZ.SEEK_SUCCESS) {
            this.LJLJJI = j;
        }
    }
}
