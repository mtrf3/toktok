package X;

import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: X.IZe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46822IZe implements InterfaceC47787IpD {
    public final /* synthetic */ IZL LJLIL;

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onABRPredictBitrate(int i, int i2) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onAVBadInterlaced(java.util.Map map) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onBufferEnd(int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onBufferStart(int i, int i2, int i3) {
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
    public final /* synthetic */ void onFrameDraw(int i, java.util.Map map) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onInfoIdChanged(int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
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

    public C46822IZe(IZL izl) {
        this.LJLIL = izl;
    }

    @Override // X.InterfaceC47787IpD
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onCompletion() called with: engine = [");
            LIZ.append(tTVideoEngine);
            LIZ.append("]");
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        this.LJLIL.LJLLLLLL.onCompletion();
    }

    @Override // X.InterfaceC47787IpD
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPrepare() called with: engine = [");
            LIZ.append(tTVideoEngine);
            LIZ.append("]");
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        this.LJLIL.LJLLLLLL.onPrepare();
    }

    @Override // X.InterfaceC47787IpD
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        IZL izl;
        C46882Iac c46882Iac;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPrepared() called with: engine = [");
            LIZ.append(tTVideoEngine);
            LIZ.append("]");
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        this.LJLIL.LJLLLLLL.onPrepared();
        if (TextUtils.isEmpty(this.LJLIL.LJLJL) && (c46882Iac = (izl = this.LJLIL).LJLJJL) != null) {
            izl.LJLJL = c46882Iac.LJIIZILJ();
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onReadyForDisplay(TTVideoEngine tTVideoEngine) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VIDEO@");
        LIZ.append(this.LJLIL.LJLL);
        SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("onPreRenderReady");
        if (IXB.LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onReadyForDisplay() called with: engine = [");
            LIZ2.append(tTVideoEngine);
            LIZ2.append("]");
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ2));
        }
        this.LJLIL.LJLLLLLL.LJFF();
    }

    @Override // X.InterfaceC47787IpD
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRenderStart() called with: engine = [");
            LIZ.append(tTVideoEngine);
            LIZ.append("] mFromResume:");
            LIZ.append(this.LJLIL.LJLJJLL);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        IZL izl = this.LJLIL;
        if (izl.LJLJJLL) {
            izl.LJLLLLLL.LJII();
        } else {
            izl.LJLLLLLL.LJ();
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onBufferingUpdate() called with: engine = [");
            LIZ.append(tTVideoEngine);
            LIZ.append("], percent = [");
            LIZ.append(i);
            LIZ.append("]");
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        long LJJJJIZL = (i / 100.0f) * ((float) this.LJLIL.LJJJJIZL());
        this.LJLIL.LJLLLLLL.LJIIJJI(LJJJJIZL);
        this.LJLIL.LJLLLLLL.LJIILLIIL(i, LJJJJIZL);
    }

    @Override // X.InterfaceC47787IpD
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPlaybackStateChanged() called with: engine = [");
            LIZ.append(tTVideoEngine);
            LIZ.append("], playbackState = [");
            LIZ.append(i);
            LIZ.append("]");
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        if (i == 1) {
            this.LJLIL.LJLLLLLL.LIZIZ();
        } else if (i == 0) {
            this.LJLIL.LJLLLLLL.LJIILIIL();
        } else {
            if (i != 2) {
                return;
            }
            this.LJLIL.LJLLLLLL.LIZLLL();
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamChanged() called with: type = [");
            LIZ.append(i);
            LIZ.append("]");
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onFrameAboutToBeRendered(TTVideoEngine tTVideoEngine, int i, long j, long j2, java.util.Map<Integer, String> map) {
        this.LJLIL.LJLLLLLL.onFrameAboutToBeRendered(i, j, j2, map);
    }
}
