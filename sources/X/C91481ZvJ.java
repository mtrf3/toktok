package X;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvJ, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91481ZvJ implements InterfaceC91459Zux, InterfaceC91289ZsD, InterfaceC91288ZsC {
    public static final /* synthetic */ int LJLJJLL = 0;
    public C91605ZxJ LJLIL;
    public final AudioManager LJLILLLLZI;
    public final AudioManager.OnAudioFocusChangeListener LJLJI;
    public boolean LJLJJI;
    public long LJLJJL;

    public final void LJII() {
        this.LJLJJI = false;
        try {
            this.LJLILLLLZI.abandonAudioFocus(this.LJLJI);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("abandonFocus(): -> ");
            LIZ.append(th.getMessage());
            X1D.LIZIZ(LIZ);
        }
        C1DG.LIZ().setAutoAudioFocus(true);
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSeek(long j) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSetStartPlayTime(int i) {
        return false;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
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
        C16880lQ.LJLLJ(C91481ZvJ.class);
    }

    public final C91605ZxJ LJIIL() {
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            return c91605ZxJ;
        }
        o.LJIJI("mediaPlayerService");
        throw null;
    }

    public C91481ZvJ() {
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "audio");
        o.LJII(LLILL, "null cannot be cast to non-null type android.media.AudioManager");
        this.LJLILLLLZI = (AudioManager) LLILL;
        this.LJLJI = new C91079Zop(this, new WeakReference(this));
    }

    public final boolean LJIILJJIL() {
        C1DG.LIZ().setAutoAudioFocus(false);
        if (C16880lQ.LLJJJJLIIL(this.LJLILLLLZI, this.LJLJI, 3, 1) != 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        LJIIL().LJLJI.LJLIL.LJII(this);
        LJIIL().LJLJI.LJLJI.LJII(this);
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        LJII();
        LJIIL().LJLJI.LJLIL.LJIIL(this);
        LJIIL().LJLJI.LJLJI.LJIIL(this);
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPause(C91299ZsN c91299ZsN) {
        String str;
        if (c91299ZsN != null) {
            str = c91299ZsN.LIZ;
        } else {
            str = null;
        }
        if (!o.LJ(str, "PAUSE_FROM_LOSS_FOCUS")) {
            LJII();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptResume(C91299ZsN c91299ZsN) {
        YBK.LIZ.getClass();
        if ((YBK.LIZ().fixAudioPlayBug && LJIIL().LIZ() == null) || LJIILJJIL()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptStop(C91299ZsN c91299ZsN) {
        LJII();
        return false;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
        LJII();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("abandon focus because of onError : ");
        LIZ.append(errorCode);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        o.LJIIIZ(currentState, "currentState");
        if (currentState == EnumC91310ZsY.PLAYBACK_STATE_ERROR || currentState == EnumC91310ZsY.PLAYBACK_STATE_STOPPED) {
            LJII();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("abandon focus because of: ");
            LIZ.append(currentState);
            X1D.LIZIZ(LIZ);
        }
    }

    @Override // X.InterfaceC91459Zux
    public final void setMediaPlayerService(C91605ZxJ c91605ZxJ) {
        this.LJLIL = c91605ZxJ;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPlay(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK) {
        YBK.LIZ.getClass();
        if ((YBK.LIZ().fixAudioPlayBug && LJIIL().LIZ() == null) || LJIILJJIL()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
