package X;

import org.json.JSONObject;

/* renamed from: X.Wom, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83432Wom extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C83432Wom LJLIL = new C83432Wom();

    public C83432Wom() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", 0);
        return jSONObject.toString();
    }
}
