package X;

import Y.ARunnableS15S0101000_11;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.IbR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46933IbR implements InterfaceC47787IpD {
    public final /* synthetic */ C46882Iac LJLIL;
    public final /* synthetic */ C46932IbQ LJLILLLLZI;

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
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        if (IZ8.LJJJJL() && this.LJLILLLLZI.LJLJJI) {
            boolean z = true;
            if (this.LJLIL.LJJII(1071) != 1) {
                z = false;
            }
            if (IXB.LIZ) {
                StringBuilder LJI = JBR.LJI("onRenderStart() isUseNativeRender = ", z, ", surface = ");
                LJI.append(this.LJLILLLLZI.LJLJI);
                LJI.append(", rendertype = ");
                LJI.append(this.LJLIL.LJJII(1071));
                IXB.LIZIZ("EngineRefreshSurfaceHelper", X1D.LIZIZ(LJI));
            }
            Surface surface = this.LJLILLLLZI.LJLJI;
            if (surface != null) {
                o.LJIIIZ(surface, "surface");
                C46936IbU.LIZIZ.put(surface, Boolean.valueOf(z));
            }
        }
    }

    public C46933IbR(C46932IbQ c46932IbQ, C46882Iac c46882Iac) {
        this.LJLILLLLZI = c46932IbQ;
        this.LJLIL = c46882Iac;
    }

    @Override // X.InterfaceC47787IpD
    public final int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        Surface surface2;
        if (videoSurface != null && surface != null) {
            C46932IbQ c46932IbQ = this.LJLILLLLZI;
            c46932IbQ.getClass();
            if (IZ8.LJJJJL() && c46932IbQ.LJLJJI && c46932IbQ.LJLILLLLZI.getPlayer() != null && (surface2 = c46932IbQ.LJLJI) != null) {
                WeakHashMap<Surface, Boolean> weakHashMap = C46936IbU.LIZIZ;
                Boolean bool = weakHashMap.get(surface2);
                if (IXB.LIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onTextureRenderSetSurface. last use native render = ");
                    LIZ.append(bool);
                    LIZ.append(", curSurface = ");
                    LIZ.append(c46932IbQ.LJLJI);
                    IXB.LIZIZ("EngineRefreshSurfaceHelper", X1D.LIZIZ(LIZ));
                }
                if (bool != null && bool.booleanValue()) {
                    if (IXB.LIZ) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onTextureRenderSetSurface. this time texture render use the surface = ");
                        LIZ2.append(surface);
                        IXB.LIZIZ("EngineRefreshSurfaceHelper", X1D.LIZIZ(LIZ2));
                    }
                    Surface surface3 = c46932IbQ.LJLJI;
                    if (surface == surface3) {
                        SurfaceHolder LIZ3 = C46936IbU.LIZ(surface3);
                        Surface surface4 = c46932IbQ.LJLJI;
                        o.LJIIIZ(surface4, "surface");
                        InterfaceC46937IbV interfaceC46937IbV = C46936IbU.LIZJ.get(surface4);
                        if (LIZ3 != null && interfaceC46937IbV != null) {
                            if (IXB.LIZ) {
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("onTextureRenderSetSurface. will dorefreshSurface, surface = ");
                                LIZ4.append(c46932IbQ.LJLJI);
                                IXB.LIZIZ("EngineRefreshSurfaceHelper", X1D.LIZIZ(LIZ4));
                            }
                            c46932IbQ.LJLIL.post(new ARunnableS15S0101000_11(4, interfaceC46937IbV, 15));
                            Surface surface5 = c46932IbQ.LJLJI;
                            o.LJIIIZ(surface5, "surface");
                            weakHashMap.remove(surface5);
                        }
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
