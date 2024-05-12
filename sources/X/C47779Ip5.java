package X;

import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.List;

/* renamed from: X.Ip5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47779Ip5 extends C0R1 implements InterfaceC47787IpD {
    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onCurrentPlaybackTimeUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final void onAVBadInterlaced(java.util.Map map) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onAVBadInterlaced(map);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferEnd(int i) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onBufferEnd(i);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onCompletion(tTVideoEngine);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onError(C47789IpF c47789IpF) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onError(c47789IpF);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onFirstAVSyncFrame(tTVideoEngine);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onInfoIdChanged(int i) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onInfoIdChanged(i);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onPrepare(tTVideoEngine);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onPrepared(tTVideoEngine);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onReadyForDisplay(TTVideoEngine tTVideoEngine) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onReadyForDisplay(tTVideoEngine);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onRefreshSurface(TTVideoEngine tTVideoEngine) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onRefreshSurface(tTVideoEngine);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onRenderStart(tTVideoEngine);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onVideoSecondFrame(tTVideoEngine);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoStatusException(int i) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onVideoStatusException(i);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onABRPredictBitrate(int i, int i2) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onABRPredictBitrate(i, i2);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onBufferingUpdate(tTVideoEngine, i);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onFrameDraw(int i, java.util.Map map) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onFrameDraw(i, map);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onLoadStateChanged(tTVideoEngine, i);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onPlaybackStateChanged(tTVideoEngine, i);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onSARChanged(int i, int i2) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onSARChanged(i, i2);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onStreamChanged(tTVideoEngine, i);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onVideoStreamBitrateChanged(enumC47176IfM, i);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoURLRouteFailed(C47789IpF c47789IpF, String str) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onVideoURLRouteFailed(c47789IpF, str);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferStart(int i, int i2, int i3) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onBufferStart(i, i2, i3);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        boolean z = false;
        for (InterfaceC47787IpD interfaceC47787IpD : (List) this.LJLIL) {
            if (interfaceC47787IpD != null && interfaceC47787IpD.onSetSurface(tTVideoEngine, videoSurface, surface) > 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        return 1;
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onVideoSizeChanged(tTVideoEngine, i, i2);
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onFrameAboutToBeRendered(TTVideoEngine tTVideoEngine, int i, long j, long j2, java.util.Map<Integer, String> map) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((InterfaceC47787IpD) obj).onFrameAboutToBeRendered(tTVideoEngine, i, j, j2, map);
            }
        }
    }
}
