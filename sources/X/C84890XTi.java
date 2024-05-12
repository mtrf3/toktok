package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.XTi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84890XTi implements InterfaceC36298EMk {
    @Override // X.InterfaceC36298EMk
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC36298EMk
    public final void LIZIZ(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("aweme_third_party_music_cover");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("aweme_third_party_music_icon");
            if (optJSONObject != null) {
                try {
                    C50891JyB.LIZJ("third_music_cover_info", optJSONObject.toString());
                } catch (Throwable unused) {
                    String jSONObject2 = optJSONObject.toString();
                    o.LJIIIIZZ(jSONObject2, "jsonObjectCover.toString()");
                    C72115SRz.LIZIZ(jSONObject2);
                }
            }
            if (optJSONObject2 != null) {
                try {
                    C72115SRz.LIZ = (ThirdMusicCoverItem) new Gson().LJI(optJSONObject2.toString(), ThirdMusicCoverItem.class);
                    C50891JyB.LIZJ("third_music_icon_info", optJSONObject2.toString());
                } catch (Throwable unused2) {
                    String jSONObject3 = optJSONObject2.toString();
                    o.LJIIIIZZ(jSONObject3, "jsonObjectIcon.toString()");
                    C72115SRz.LIZIZ(jSONObject3);
                }
            }
        }
    }
}
