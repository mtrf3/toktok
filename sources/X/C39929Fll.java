package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.Fll, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39929Fll implements InterfaceC61465OAj {
    public static final C39929Fll LIZ = new C39929Fll();

    @Override // X.InterfaceC61465OAj
    public final void LIZ(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("event:");
            LIZ2.append(str);
            LIZ2.append(",data:");
            LIZ2.append(jSONObject);
            C39930Flm.LJI("GeckoXAdapter", X1D.LIZIZ(LIZ2), false, 4);
        }
    }
}
