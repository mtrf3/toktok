package X;

import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IF9 {
    public static void LIZ(final String str, final String str2, final String str3, final JSONObject jSONObject, final Aweme aweme) {
        final String LIZIZ = C38987FRv.LIZIZ();
        final String LIZJ = C38987FRv.LIZJ();
        C10K.LIZIZ(new Callable() { // from class: X.IFk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONObject jSONObject2;
                int i;
                JSONObject jSONObject3 = jSONObject;
                Aweme aweme2 = aweme;
                String str4 = LIZIZ;
                String str5 = LIZJ;
                String str6 = str;
                String str7 = str2;
                String str8 = str3;
                if (jSONObject3 != null) {
                    jSONObject2 = jSONObject3;
                } else {
                    try {
                        jSONObject2 = new JSONObject();
                    } catch (JSONException unused) {
                        return null;
                    }
                }
                jSONObject2.put("has_tts", C86670Xzu.LJJII(aweme2) ? 1 : 0);
                jSONObject2.put("has_cla", C86670Xzu.LJIL(aweme2) ? 1 : 0);
                jSONObject2.put("top_activity", str4);
                jSONObject2.put("feed_tab", str5);
                jSONObject2.put("err_code", str6);
                jSONObject2.put("err_msg", str7);
                if (C2M9.LIZ()) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject2.put("is_audio_mode", String.valueOf(i));
                MobClick obtain = MobClick.obtain();
                obtain.setEventName("video_play_failed");
                obtain.setValue(str8);
                obtain.setJsonObject(jSONObject3);
                FMX.onEvent(obtain);
                return null;
            }
        }, FMX.LIZIZ(), null);
    }
}
