package X;

import org.json.JSONObject;

/* renamed from: X.JtP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50595JtP implements F22 {
    public final JSONObject LJLIL;

    @Override // X.F22
    public final String getName() {
        return "onAlertButtonClickAction";
    }

    @Override // X.F22
    public final /* bridge */ /* synthetic */ Object getParams() {
        return this.LJLIL;
    }

    public C50595JtP(String str, String str2) {
        this.LJLIL = C47135Ieh.LJ("op_args", str, "alert_id", str2);
    }
}
