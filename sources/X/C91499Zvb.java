package X;

import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Zvb, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91499Zvb implements InterfaceC91459Zux, InterfaceC91289ZsD {
    public C91605ZxJ LJLIL;
    public boolean LJLILLLLZI;
    public InterfaceC91296ZsK LJLJI;

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

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            c91605ZxJ.LJLJI.LJLIL.LJII(this);
        } else {
            o.LJIJI("mediaPlayerService");
            throw null;
        }
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            c91605ZxJ.LJLJI.LJLIL.LJIIL(this);
        } else {
            o.LJIJI("mediaPlayerService");
            throw null;
        }
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
        this.LJLJI = interfaceC91296ZsK;
        this.LJLILLLLZI = false;
        ExpiredPlayableManager.INSTANCE.playableChanged(interfaceC91296ZsK);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        o.LJIIIZ(currentState, "currentState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
        String id;
        boolean z;
        InterfaceC91296ZsK interfaceC91296ZsK = this.LJLJI;
        if (interfaceC91296ZsK == null || (id = interfaceC91296ZsK.getId()) == null) {
            return;
        }
        InterfaceC91296ZsK interfaceC91296ZsK2 = this.LJLJI;
        boolean z2 = false;
        if (interfaceC91296ZsK2 != null) {
            z = interfaceC91296ZsK2.LJIILIIL();
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            if (this.LJLIL != null) {
                if (r0.LJIJJLI() <= 10000) {
                    return;
                }
                YBM.LIZ.getClass();
                if (YBM.LIZ().getDspClipRecordStrategy() != 1 || this.LJLILLLLZI) {
                    return;
                }
                this.LJLILLLLZI = true;
                ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
                InterfaceC91296ZsK interfaceC91296ZsK3 = this.LJLJI;
                if (interfaceC91296ZsK3 != null) {
                    str = interfaceC91296ZsK3.LIZIZ();
                }
                expiredPlayableManager.writeExpiredPreviewPlayable$music_dsp_release(id, str);
                return;
            }
            o.LJIJI("mediaPlayerService");
            throw null;
        }
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            int LJIJJLI = c91605ZxJ.LJIJJLI();
            ExpiredPlayableManager expiredPlayableManager2 = ExpiredPlayableManager.INSTANCE;
            if (LJIJJLI > expiredPlayableManager2.getMinDuration()) {
                z2 = true;
            }
            boolean isPlayableExpiredToday = expiredPlayableManager2.isPlayableExpiredToday(id);
            if (!z2 || this.LJLILLLLZI || isPlayableExpiredToday) {
                return;
            }
            this.LJLILLLLZI = true;
            InterfaceC91296ZsK interfaceC91296ZsK4 = this.LJLJI;
            if (interfaceC91296ZsK4 != null) {
                str = interfaceC91296ZsK4.LIZIZ();
            }
            expiredPlayableManager2.writeExpiredPlayable$music_dsp_release(id, str);
            return;
        }
        o.LJIJI("mediaPlayerService");
        throw null;
    }

    @Override // X.InterfaceC91459Zux
    public final void setMediaPlayerService(C91605ZxJ c91605ZxJ) {
        this.LJLIL = c91605ZxJ;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
