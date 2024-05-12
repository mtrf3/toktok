package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.QIp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66775QIp implements QJA {
    public final /* synthetic */ QJ8 LIZ;

    @Override // X.QJA
    public final void LIZJ(JSONObject jSONObject, boolean z) {
    }

    public C66775QIp(QJ8 qj8) {
        this.LIZ = qj8;
    }

    @Override // X.QJA
    public final void LIZIZ(String str, String str2, String str3) {
        this.LIZ.LIZ(!TextUtils.isEmpty(str));
    }

    @Override // X.QJA
    public final void LIZ(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        this.LIZ.LIZIZ(str2, str4);
        this.LIZ.LIZJ(!TextUtils.isEmpty(str2), TextUtils.isEmpty(str));
    }
}
