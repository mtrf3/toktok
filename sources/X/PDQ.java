package X;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class PDQ implements InterfaceC64016PAm {
    public final /* synthetic */ PDP LIZ;

    @Override // X.InterfaceC64016PAm
    public final String getSessionId() {
        return null;
    }

    @Override // X.InterfaceC64016PAm
    public final java.util.Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("host_aid", this.LIZ.LIZ);
        return hashMap;
    }

    public PDQ(PDP pdp) {
        this.LIZ = pdp;
    }
}
