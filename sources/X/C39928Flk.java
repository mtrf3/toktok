package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.Flk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39928Flk implements InterfaceC61465OAj {
    public static final C39928Flk LIZ = new C39928Flk();

    @Override // X.InterfaceC61465OAj
    public final void LIZ(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("event:");
            LIZ2.append(str);
            LIZ2.append(",data:");
            LIZ2.append(jSONObject);
            c39048FUe.LIZ(X1D.LIZIZ(LIZ2), EnumC39866Fkk.D, "GeckoXDepender");
        }
    }
}
