package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* renamed from: X.NMd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59223NMd {
    public boolean LIZ;
    public WebKitView LIZIZ;

    public final void LIZ(boolean z, boolean z2, C59222NMc c59222NMc) {
        AwemeRawAd awemeRawAd;
        if (this.LIZIZ != null && c59222NMc != null && (awemeRawAd = c59222NMc.LIZ) != null && awemeRawAd.getWebType() == 1) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_mute", z);
                jSONObject.put("endcard_show", z2);
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
            WebKitView webKitView = this.LIZIZ;
            if (webKitView != null) {
                webKitView.LJIIIZ("endcard_control_event", jSONObject);
            }
        }
    }
}
