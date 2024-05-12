package X;

import org.json.JSONObject;

/* renamed from: X.IGx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46347IGx extends AbstractC65781Prl implements InterfaceC88472Yns<Object, JSONObject> {
    public static final C46347IGx LJLIL = new C46347IGx();

    public C46347IGx() {
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
