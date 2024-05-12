package X;

import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: X.IbZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46941IbZ implements InterfaceC47787IpD {
    public boolean LJLIL;
    public final /* synthetic */ C46938IbW LJLILLLLZI;

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

    public C46941IbZ(C46938IbW c46938IbW) {
        this.LJLILLLLZI = c46938IbW;
    }

    @Override // X.InterfaceC47787IpD
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        this.LJLIL = true;
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferStart(int i, int i2, int i3) {
        if (i == 0) {
            C46938IbW c46938IbW = this.LJLILLLLZI;
            c46938IbW.LJLJI++;
            if (!this.LJLIL) {
                c46938IbW.LJLJJI++;
            }
            if (c46938IbW.LJLJJLL) {
                c46938IbW.LJLJJL++;
            }
        }
    }
}
