package X;

import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import org.json.JSONObject;

/* renamed from: X.GwQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43138GwQ {
    public final int LIZ = 1;
    public long LIZIZ;

    public final void LIZ() {
        String str;
        long currentTimeMillis = (System.currentTimeMillis() - this.LIZIZ) / this.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", (int) currentTimeMillis);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("pictureCount", Integer.valueOf(this.LIZ));
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        if (C43119Gw7.LIZ()) {
            str = "lightening";
        } else {
            str = "main";
        }
        c6bk.LIZ.put("business", str);
        C43882HKc.LIZ.LJIILIIL("aweme_photo_canvas_generate_duration", jSONObject, c6bk.LJ());
    }
}
