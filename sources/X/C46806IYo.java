package X;

import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: X.IYo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46806IYo implements InterfaceC47787IpD {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final /* synthetic */ C47282Ih4 LJLJJI;
    public final /* synthetic */ C47272Igu LJLJJL;

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onABRPredictBitrate(int i, int i2) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onAVBadInterlaced(java.util.Map map) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onCompletion(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onCurrentPlaybackTimeUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onError(C47789IpF c47789IpF) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onFrameAboutToBeRendered(TTVideoEngine tTVideoEngine, int i, long j, long j2, java.util.Map map) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onFrameDraw(int i, java.util.Map map) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onInfoIdChanged(int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onPrepared(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onReadyForDisplay(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onSARChanged(int i, int i2) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        return 0;
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoStatusException(int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoURLRouteFailed(C47789IpF c47789IpF, String str) {
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferEnd(int i) {
        if (!this.LJLIL) {
            return;
        }
        C47272Igu c47272Igu = this.LJLJJL;
        InterfaceC46663ITb interfaceC46663ITb = c47272Igu.LJLJJI;
        if (interfaceC46663ITb != null && i == 1) {
            if (this.LJLILLLLZI) {
                ((C46662ITa) interfaceC46663ITb).LIZ();
                this.LJLILLLLZI = false;
                return;
            }
            return;
        }
        if (!this.LJLJJI.LJIILIIL || i != 0 || !this.LJLJI) {
            return;
        }
        c47272Igu.LJLILLLLZI.u7().onBuffering(false);
        this.LJLJI = false;
    }

    @Override // X.InterfaceC47787IpD
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
        this.LJLIL = false;
        this.LJLJI = false;
        this.LJLILLLLZI = false;
    }

    @Override // X.InterfaceC47787IpD
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        this.LJLIL = true;
    }

    public C46806IYo(C47272Igu c47272Igu, C47282Ih4 c47282Ih4) {
        this.LJLJJL = c47272Igu;
        this.LJLJJI = c47282Ih4;
    }

    @Override // X.InterfaceC47787IpD
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLoadStateChanged() called with: engine = [");
            LIZ.append(tTVideoEngine);
            LIZ.append("], loadState = [");
            LIZ.append(i);
            LIZ.append("]");
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        if (this.LJLIL && !this.LJLJJI.LJIILIIL) {
            if (i == 2) {
                this.LJLJJL.LJLILLLLZI.u7().onBuffering(true);
                this.LJLJI = true;
            } else {
                if (i != 1 || !this.LJLJI) {
                    return;
                }
                this.LJLJJL.LJLILLLLZI.u7().onBuffering(false);
                this.LJLJI = false;
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferStart(int i, int i2, int i3) {
        if (!this.LJLIL) {
            return;
        }
        C47272Igu c47272Igu = this.LJLJJL;
        InterfaceC46663ITb interfaceC46663ITb = c47272Igu.LJLJJI;
        if (interfaceC46663ITb != null && i == 1) {
            this.LJLILLLLZI = true;
            ((C46662ITa) interfaceC46663ITb).LIZIZ();
        } else {
            if (!this.LJLJJI.LJIILIIL || i != 0) {
                return;
            }
            this.LJLJI = true;
            c47272Igu.LJLILLLLZI.u7().onBuffering(true);
        }
    }
}
