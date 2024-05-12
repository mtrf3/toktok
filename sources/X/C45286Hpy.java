package X;

import org.json.JSONObject;

/* renamed from: X.Hpy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45286Hpy extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C45286Hpy LJLIL = new C45286Hpy();

    public C45286Hpy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", 0);
        return jSONObject.toString();
    }
}
