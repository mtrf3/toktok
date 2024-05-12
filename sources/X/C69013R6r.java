package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.R6r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69013R6r extends AbstractC66965QPx<C69014R6s> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C69012R6q LJII;

    public static java.util.Map<String, String> LJIIJJI(C69012R6q c69012R6q) {
        String str = "1";
        HashMap LIZ = C45243HpH.LIZ("mix_mode", "1", "fixed_mix_mode", "1");
        LIZ.put("code", C38354F3m.LIZIZ(android.net.Uri.encode(c69012R6q.LJFF)));
        LIZ.put("type", C38354F3m.LIZIZ(String.valueOf(c69012R6q.LJII)));
        if (!c69012R6q.LJI) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.put("need_ticket", str);
        int i = c69012R6q.LJIIIIZZ;
        if (i > 0) {
            LIZ.put(WM7.SCENE_SERVICE, String.valueOf(i));
        }
        if (!TextUtils.isEmpty(c69012R6q.LJIIIZ)) {
            LIZ.put("shark_ticket", c69012R6q.LJIIIZ);
        }
        return LIZ;
    }

    @Override // X.AbstractC66965QPx
    public final void LJ(C69014R6s c69014R6s) {
        C79146V4k.LJJJLZIJ("passport_mobile_validate_code_v1", null, null, c69014R6s, this.LJ);
    }

    @Override // X.AbstractC66965QPx
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        R6V.LIZ(this.LJII, jSONObject);
    }

    @Override // X.AbstractC66965QPx
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            this.LJII.LJ = jSONObject2.optString("ticket", "");
        }
    }

    @Override // X.AbstractC66965QPx
    public final C69014R6s LJIIJ(boolean z, QQ4 qq4) {
        C69014R6s c69014R6s = new C69014R6s(z);
        if (z) {
            c69014R6s.LJIIIZ = this.LJII.LJ;
        } else {
            C69012R6q c69012R6q = this.LJII;
            c69014R6s.LIZLLL = c69012R6q.LIZ;
            c69014R6s.LJFF = c69012R6q.LIZIZ;
        }
        return c69014R6s;
    }

    public C69013R6r(Context context, QQ1 qq1, C69012R6q c69012R6q, AbstractC68940R3w abstractC68940R3w) {
        super(context, qq1, abstractC68940R3w);
        this.LJII = c69012R6q;
    }
}
