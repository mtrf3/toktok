package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CJx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31137CJx {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C31138CJy.LJLIL);

    public static void LIZJ() {
        if (!C62011OVj.LJI()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (InterfaceC31139CJz interfaceC31139CJz : (InterfaceC31139CJz[]) F7X.LIZ.getValue()) {
                String string = ((Keva) LIZ.getValue()).getString(interfaceC31139CJz.getKey(), "");
                interfaceC31139CJz.getValue();
                if (!o.LJ(string, "true")) {
                    jSONObject.put(interfaceC31139CJz.getKey(), "true");
                }
            }
            if (!jSONObject.keys().hasNext()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("ab_info", jSONObject.toString());
            EF7.LIZIZ().getContentResolver().call(InterfaceC28729BPh.LIZIZ, "update_ab_info", "", bundle);
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "abJsonObject.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                ((Keva) LIZ.getValue()).storeString(next, JSONObjectProtectorUtils.getString(jSONObject, next));
            }
        } catch (Throwable unused) {
        }
    }

    public static String LIZ(LiveWallPaperBean liveWallPaperBean) {
        if (liveWallPaperBean == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", liveWallPaperBean.getWidth());
        jSONObject.put("height", liveWallPaperBean.getHeight());
        jSONObject.put("volume", Float.valueOf(liveWallPaperBean.getVolume()));
        jSONObject.put("should_mute", liveWallPaperBean.isShouldMute());
        jSONObject.put("source", liveWallPaperBean.getSource());
        if (!C62011OVj.LJI()) {
            jSONObject.put("path", liveWallPaperBean.getVideoPath());
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }

    public static LiveWallPaperBean LIZIZ(String str) {
        LiveWallPaperBean liveWallPaperBean = LiveWallPaperBean.buildEmptyBean();
        if (str != null) {
            try {
                if (str.length() != 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    liveWallPaperBean.setVideoPath(jSONObject.optString("path", ""));
                    liveWallPaperBean.setWidth(jSONObject.optInt("width", 0));
                    liveWallPaperBean.setHeight(jSONObject.optInt("height", 0));
                    liveWallPaperBean.setVolume((float) jSONObject.optDouble("volume", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
                    liveWallPaperBean.setShouldMute(jSONObject.optBoolean("should_mute", true));
                    liveWallPaperBean.setSource(jSONObject.optString("source", ""));
                }
            } catch (Throwable unused) {
            }
        }
        o.LJIIIIZZ(liveWallPaperBean, "liveWallPaperBean");
        return liveWallPaperBean;
    }
}
