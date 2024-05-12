package X;

import org.json.JSONObject;

/* renamed from: X.IGw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46346IGw extends AbstractC65781Prl implements InterfaceC88472Yns<Object, JSONObject> {
    public static final C46346IGw LJLIL = new C46346IGw();

    public C46346IGw() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final JSONObject invoke(Object obj) {
        if (obj != 0) {
            if (obj instanceof JSONObject) {
                return obj;
            }
            return new JSONObject();
        }
        return new JSONObject();
    }
}
