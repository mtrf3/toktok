package X;

import java.util.HashMap;

/* renamed from: X.VDu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79390VDu implements InterfaceC64016PAm {
    public final /* synthetic */ C79391VDv LIZ;

    @Override // X.InterfaceC64016PAm
    public final String getSessionId() {
        return null;
    }

    @Override // X.InterfaceC64016PAm
    public final java.util.Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("host_aid", String.valueOf(this.LIZ.LIZ.getAid()));
        hashMap.put("oversea", "1");
        return hashMap;
    }

    public C79390VDu(C79391VDv c79391VDv) {
        this.LIZ = c79391VDv;
    }
}
