package X;

import org.json.JSONObject;

/* renamed from: X.Hqc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45326Hqc extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C45326Hqc LJLIL = new C45326Hqc();

    public C45326Hqc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", 0);
        return jSONObject.toString();
    }
}
