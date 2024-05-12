package X;

import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Ioy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47772Ioy implements InterfaceC47787IpD {
    public InterfaceC47787IpD LJLIL;
    public InterfaceC47814Ipe LJLILLLLZI;
    public InterfaceC47277Igz LJLJI;
    public InterfaceC47042IdC LJLJJI;
    public final CopyOnWriteArrayList<InterfaceC47787IpD> LJLJJL = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC47787IpD
    public final void onAVBadInterlaced(java.util.Map map) {
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onAVBadInterlaced(map);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onAVBadInterlaced(map);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferEnd(int i) {
        InterfaceC47277Igz interfaceC47277Igz = this.LJLJI;
        if (interfaceC47277Igz != null) {
            C47276Igy c47276Igy = (C47276Igy) interfaceC47277Igz;
            C47272Igu c47272Igu = c47276Igy.LIZIZ;
            InterfaceC46663ITb interfaceC46663ITb = c47272Igu.LJLJJI;
            if (interfaceC46663ITb != null && i == 1) {
                ((C46662ITa) interfaceC46663ITb).LIZ();
            } else {
                C47282Ih4 c47282Ih4 = c47276Igy.LIZ;
                if (c47282Ih4 != null && c47282Ih4.LJIILIIL && c47272Igu.LJLILLLLZI.u7() != null && i == 0) {
                    c47276Igy.LIZIZ.LJLILLLLZI.u7().onBuffering(false);
                }
            }
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onBufferEnd(i);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onBufferEnd(i);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onCompletion(tTVideoEngine);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onCompletion(tTVideoEngine);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onCompletion(tTVideoEngine);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onError(C47789IpF c47789IpF) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onError(c47789IpF);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onError(c47789IpF);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onError(c47789IpF);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onFirstAVSyncFrame(tTVideoEngine);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onFirstAVSyncFrame(tTVideoEngine);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onFirstAVSyncFrame(tTVideoEngine);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onInfoIdChanged(int i) {
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onInfoIdChanged(i);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onInfoIdChanged(i);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onPrepare(tTVideoEngine);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onPrepare(tTVideoEngine);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onPrepare(tTVideoEngine);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onPrepared(tTVideoEngine);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onPrepared(tTVideoEngine);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onPrepared(tTVideoEngine);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onReadyForDisplay(TTVideoEngine tTVideoEngine) {
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onReadyForDisplay(tTVideoEngine);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onReadyForDisplay(tTVideoEngine);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onRefreshSurface(TTVideoEngine tTVideoEngine) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onRefreshSurface(tTVideoEngine);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onRefreshSurface(tTVideoEngine);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onRefreshSurface(tTVideoEngine);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onRenderStart(tTVideoEngine);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onRenderStart(tTVideoEngine);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onRenderStart(tTVideoEngine);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onVideoSecondFrame(tTVideoEngine);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onVideoSecondFrame(tTVideoEngine);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onVideoSecondFrame(tTVideoEngine);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoStatusException(int i) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onVideoStatusException(i);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onVideoStatusException(i);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onVideoStatusException(i);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onABRPredictBitrate(int i, int i2) {
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onABRPredictBitrate(i, i2);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onABRPredictBitrate(i, i2);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onBufferingUpdate(tTVideoEngine, i);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onBufferingUpdate(tTVideoEngine, i);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onBufferingUpdate(tTVideoEngine, i);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onCurrentPlaybackTimeUpdate(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onCurrentPlaybackTimeUpdate(tTVideoEngine, i);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onCurrentPlaybackTimeUpdate(tTVideoEngine, i);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onFrameDraw(int i, java.util.Map map) {
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onFrameDraw(i, map);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onFrameDraw(i, map);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onLoadStateChanged(tTVideoEngine, i);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onLoadStateChanged(tTVideoEngine, i);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onLoadStateChanged(tTVideoEngine, i);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onPlaybackStateChanged(tTVideoEngine, i);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onPlaybackStateChanged(tTVideoEngine, i);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onPlaybackStateChanged(tTVideoEngine, i);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onSARChanged(int i, int i2) {
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onSARChanged(i, i2);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onSARChanged(i, i2);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onStreamChanged(tTVideoEngine, i);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onStreamChanged(tTVideoEngine, i);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onStreamChanged(tTVideoEngine, i);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i) {
        InterfaceC47042IdC interfaceC47042IdC = this.LJLJJI;
        if (interfaceC47042IdC != null) {
            interfaceC47042IdC.onVideoStreamBitrateChanged(enumC47176IfM, i);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onVideoStreamBitrateChanged(enumC47176IfM, i);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onVideoStreamBitrateChanged(enumC47176IfM, i);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoURLRouteFailed(C47789IpF c47789IpF, String str) {
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onVideoURLRouteFailed(c47789IpF, str);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onVideoURLRouteFailed(c47789IpF, str);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferStart(int i, int i2, int i3) {
        InterfaceC47277Igz interfaceC47277Igz = this.LJLJI;
        if (interfaceC47277Igz != null) {
            C47276Igy c47276Igy = (C47276Igy) interfaceC47277Igz;
            C47272Igu c47272Igu = c47276Igy.LIZIZ;
            InterfaceC46663ITb interfaceC46663ITb = c47272Igu.LJLJJI;
            if (interfaceC46663ITb != null && i == 1) {
                ((C46662ITa) interfaceC46663ITb).LIZIZ();
            } else {
                C47282Ih4 c47282Ih4 = c47276Igy.LIZ;
                if (c47282Ih4 != null && c47282Ih4.LJIILIIL && c47272Igu.LJLILLLLZI.u7() != null && i == 0) {
                    c47276Igy.LIZIZ.LJLILLLLZI.u7().onBuffering(true);
                }
            }
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onBufferStart(i, i2, i3);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onBufferStart(i, i2, i3);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onSetSurface(tTVideoEngine, videoSurface, surface);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            return interfaceC47787IpD.onSetSurface(tTVideoEngine, videoSurface, surface);
        }
        return 0;
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        InterfaceC47814Ipe interfaceC47814Ipe = this.LJLILLLLZI;
        if (interfaceC47814Ipe != null) {
            interfaceC47814Ipe.onVideoSizeChanged(tTVideoEngine, i, i2);
        }
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onVideoSizeChanged(tTVideoEngine, i, i2);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(tTVideoEngine, i, i2);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onFrameAboutToBeRendered(TTVideoEngine tTVideoEngine, int i, long j, long j2, java.util.Map<Integer, String> map) {
        InterfaceC47787IpD interfaceC47787IpD = this.LJLIL;
        if (interfaceC47787IpD != null) {
            interfaceC47787IpD.onFrameAboutToBeRendered(tTVideoEngine, i, j, j2, map);
        }
        Iterator<InterfaceC47787IpD> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onFrameAboutToBeRendered(tTVideoEngine, i, j, j2, map);
        }
    }
}
