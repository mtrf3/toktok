package X;

import org.json.JSONObject;

/* renamed from: X.NxY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61044NxY implements InterfaceC61050Nxe {
    public final java.util.Map<String, String> LJLIL;

    public final JSONObject LIZ() {
        java.util.Map<String, String> map = this.LJLIL;
        if (map == null || map.isEmpty()) {
            return new JSONObject();
        }
        return new JSONObject(this.LJLIL);
    }

    public AbstractC61044NxY(java.util.Map<String, String> map) {
        this.LJLIL = map;
    }
}
