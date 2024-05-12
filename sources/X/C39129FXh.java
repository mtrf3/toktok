package X;

import java.util.HashMap;

/* renamed from: X.FXh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39129FXh implements InterfaceC64016PAm {
    public final /* synthetic */ String LIZ;

    @Override // X.InterfaceC64016PAm
    public final String getSessionId() {
        return "";
    }

    @Override // X.InterfaceC64016PAm
    public final java.util.Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        String str = this.LIZ;
        if (str != null) {
            hashMap.put("host_aid", str);
        }
        return hashMap;
    }

    public C39129FXh(String str) {
        this.LIZ = str;
    }
}
