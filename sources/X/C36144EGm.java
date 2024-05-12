package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.poi.PokerBundle;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EGm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36144EGm extends AbstractC39622Fgo {
    public final String LIZIZ;

    @Override // X.AbstractC39622Fgo
    public final boolean LIZ() {
        return false;
    }

    @Override // X.AbstractC39622Fgo
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    public static boolean LJFF(PokerBundle pokerBundle) {
        if (!TextUtils.isEmpty(pokerBundle.getAdcode()) && !TextUtils.isEmpty(pokerBundle.getDistrict()) && !TextUtils.isEmpty(pokerBundle.getCountry()) && !TextUtils.isEmpty(pokerBundle.getProvince()) && !TextUtils.isEmpty(pokerBundle.getCity())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36144EGm(WRQ cameraApiComponent, Context context) {
        super(cameraApiComponent);
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZIZ = "POKER";
    }

    @Override // X.AbstractC39622Fgo
    public final void LIZJ(int i, String str) {
        if (C2NU.LIZ.LIZIZ()) {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C36142EGk(i, this, str, null), 3);
            return;
        }
        String jSONObject = LJ(2, new PokerBundle(null, null, null, null, null, 31, null)).toString();
        o.LJIIIIZZ(jSONObject, "generateResponse(STATUS_…PokerBundle()).toString()");
        LIZLLL(i, jSONObject);
    }

    public final JSONObject LJ(int i, PokerBundle pokerBundle) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", this.LIZIZ);
        jSONObject.put("status", i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("adcode", pokerBundle.getAdcode());
        jSONObject2.put("district", pokerBundle.getDistrict());
        jSONObject2.put("country", pokerBundle.getCountry());
        jSONObject2.put("province", pokerBundle.getProvince());
        jSONObject2.put("city", pokerBundle.getCity());
        jSONObject.put("body", jSONObject2);
        return jSONObject;
    }
}
