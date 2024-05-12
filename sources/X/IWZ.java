package X;

import android.os.SystemClock;
import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IWZ implements InterfaceC47787IpD {
    public final /* synthetic */ C46740IWa LJLIL;

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

    public IWZ(C46740IWa c46740IWa) {
        this.LJLIL = c46740IWa;
    }

    @Override // X.InterfaceC47787IpD
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        if (C46740IWa.LJLL) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C46740IWa c46740IWa = this.LJLIL;
            long j = elapsedRealtime - c46740IWa.LJLJJI;
            C46543IOl c46543IOl = c46740IWa.LJLJLLL;
            if (c46543IOl != null) {
                c46543IOl.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", j);
                    C46982IcE.LIZJ().onEvent("nor_on_prepared_time", jSONObject);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        if (C46740IWa.LJLL) {
            C46740IWa.LJLL = false;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C46740IWa c46740IWa = this.LJLIL;
            long j = elapsedRealtime - c46740IWa.LJLJJI;
            C46543IOl c46543IOl = c46740IWa.LJLJLLL;
            if (c46543IOl != null) {
                c46543IOl.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", j);
                    C46982IcE.LIZJ().onEvent("nor_on_render_start_time", jSONObject);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        this.LJLIL.LJLJLJ = true;
    }
}
