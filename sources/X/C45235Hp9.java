package X;

import org.json.JSONObject;

/* renamed from: X.Hp9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45235Hp9 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C45235Hp9 LJLIL = new C45235Hp9();

    public C45235Hp9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", 0);
        return jSONObject.toString();
    }
}
