package X;

import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: X.IYe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46796IYe implements InterfaceC47787IpD {
    public final /* synthetic */ C46882Iac LJLIL;
    public final /* synthetic */ C46797IYf LJLILLLLZI;

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
    public final /* synthetic */ void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onPrepare(TTVideoEngine tTVideoEngine) {
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
    public final /* synthetic */ void onVideoStatusException(int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoURLRouteFailed(C47789IpF c47789IpF, String str) {
    }

    @Override // X.InterfaceC47787IpD
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        boolean z;
        boolean z2;
        C46882Iac c46882Iac = this.LJLIL;
        if (c46882Iac != null) {
            this.LJLILLLLZI.LJLJI.LIZ = c46882Iac.LJJII(43);
            this.LJLILLLLZI.LJLJI.LIZIZ = this.LJLIL.LJJII(45);
            this.LJLILLLLZI.LJLJI.LIZJ = this.LJLIL.LJJII(47);
            this.LJLILLLLZI.LJLJI.LJIIIZ = this.LJLIL.LJJII(371);
            C46797IYf c46797IYf = this.LJLILLLLZI;
            ITI iti = c46797IYf.LJLJI;
            C46882Iac player = c46797IYf.LJLILLLLZI.getPlayer();
            int i = 0;
            if (player != null) {
                if (player.LJJII(199) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                VideoSurface videoSurface = player.LIZ.O0;
                if (videoSurface != null && videoSurface.LJI(23, 2) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    i = 1;
                }
            }
            iti.LJIIIIZZ = i;
            C46797IYf c46797IYf2 = this.LJLILLLLZI;
            c46797IYf2.LJLJI.LJIIJ = c46797IYf2.LJLJLLL;
            this.LJLILLLLZI.LJLJI.LJIIJJI = this.LJLIL.LJJII(667);
            if (this.LJLILLLLZI.LJLJI.LIZIZ < 0 || this.LJLILLLLZI.LJLJI.LIZ < 0) {
                this.LJLILLLLZI.LJLJI.LIZIZ = this.LJLIL.LJJII(46);
                this.LJLILLLLZI.LJLJI.LIZ = this.LJLIL.LJJII(44);
            }
            if (this.LJLIL.LIZ.e != null) {
                this.LJLILLLLZI.LJLJI.getClass();
            }
        }
    }

    public C46796IYe(C46797IYf c46797IYf, C46882Iac c46882Iac) {
        this.LJLILLLLZI = c46797IYf;
        this.LJLIL = c46882Iac;
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EngineVideoInfoHelper: onVideoSizeChanged(): ");
            LIZ.append(tTVideoEngine);
            LIZ.append(" -> ");
            LIZ.append(i);
            LIZ.append("X");
            LIZ.append(i2);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        this.LJLILLLLZI.LJLJI.LIZLLL = i;
        this.LJLILLLLZI.LJLJI.LJ = i2;
    }
}
