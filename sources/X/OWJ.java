package X;

import android.view.Surface;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import java.text.Format;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OWJ implements InterfaceC47787IpD {
    public final OWM LJLIL;

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onABRPredictBitrate(int i, int i2) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onAVBadInterlaced(java.util.Map map) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onCurrentPlaybackTimeUpdate(TTVideoEngine tTVideoEngine, int i) {
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
    public final /* synthetic */ void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoURLRouteFailed(C47789IpF c47789IpF, String str) {
    }

    public OWJ(OWK owk) {
        this.LJLIL = owk;
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferEnd(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBufferEnd ");
        LIZ.append(i);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC47787IpD
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCompletion ");
        LIZ.append(tTVideoEngine);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC47787IpD
    public final void onError(C47789IpF c47789IpF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError ");
        LIZ.append(c47789IpF.LIZLLL);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        OWK owk = (OWK) this.LJLIL;
        owk.getClass();
        int i = c47789IpF.LIZ;
        String errorExtra = c47789IpF.toString();
        o.LJIIIZ(errorExtra, "errorExtra");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("player_type", 2);
        jSONObject.put("error_code", i);
        jSONObject.put("error_extra", errorExtra);
        jSONObject.put("date", ((Format) C62020OVs.LIZ.getValue()).format(Long.valueOf(System.currentTimeMillis())));
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …()))\n        }.toString()");
        java.util.Set<String> stringSet = C62016OVo.LIZ().getStringSet("keva_key_wallpaper_player_error_events", null);
        if (stringSet == null || stringSet.isEmpty()) {
            C62016OVo.LIZIZ(C77275UUl.LJ(jSONObject2));
        } else {
            stringSet.add(jSONObject2);
            C62016OVo.LIZIZ(stringSet);
        }
        OWI owi = owk.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("media play error what = ");
        LIZ2.append(c47789IpF.LIZ);
        LIZ2.append(" extra = ");
        LIZ2.append(c47789IpF.LIZLLL);
        owi.LIZIZ(X1D.LIZIZ(LIZ2), false);
    }

    @Override // X.InterfaceC47787IpD
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPrepare ");
        LIZ.append(tTVideoEngine);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC47787IpD
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPrepared ");
        LIZ.append(tTVideoEngine);
        LIZ.append(" isSystem ");
        LIZ.append(tTVideoEngine.LJJJLIIL());
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC47787IpD
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRenderStart ");
        LIZ.append(tTVideoEngine);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoStatusException(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoStatusException ");
        LIZ.append(i);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBufferingUpdate ");
        LIZ.append(tTVideoEngine);
        LIZ.append(" ");
        LIZ.append(i);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC47787IpD
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadStateChanged ");
        LIZ.append(tTVideoEngine);
        LIZ.append(" ");
        LIZ.append(i);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC47787IpD
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        TTVideoEngine tTVideoEngine2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlaybackStateChanged ");
        LIZ.append(tTVideoEngine);
        LIZ.append(" ");
        LIZ.append(i);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        if (i == 1) {
            OWK owk = (OWK) this.LJLIL;
            owk.LIZ.LIZIZ("", true);
            OWI owi = owk.LIZ;
            if (!owi.LJFF && (tTVideoEngine2 = owi.LIZJ) != null) {
                tTVideoEngine2.LJJL();
            }
        }
    }

    @Override // X.InterfaceC47787IpD
    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStreamChanged ");
        LIZ.append(tTVideoEngine);
        LIZ.append(" ");
        LIZ.append(i);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC47787IpD
    public final void onBufferStart(int i, int i2, int i3) {
        StringBuilder LIZJ = C06460Ne.LIZJ("onBufferStart ", i, ", ", i2, ", ");
        LIZJ.append(i3);
        String msg = X1D.LIZIZ(LIZJ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoSizeChanged ");
        LIZ.append(tTVideoEngine);
        LIZ.append(" ");
        LIZ.append(i);
        LIZ.append(" ");
        LIZ.append(i2);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }
}
