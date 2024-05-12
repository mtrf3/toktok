package X;

import com.bytedance.keva.KevaImpl;

/* renamed from: X.EwG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38032EwG implements InterfaceC38068Ewq {
    public final String LIZJ() {
        return KevaImpl.getRepo("jsbridge2-permission", 1).getString("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", "");
    }

    @Override // X.InterfaceC38068Ewq
    public final void LIZ(String str, String str2) {
        KevaImpl.getRepo("jsbridge2-permission", 1).storeString(str, str2);
    }

    @Override // X.InterfaceC38068Ewq
    public final void LIZIZ(String str, InterfaceC38034EwI interfaceC38034EwI) {
        interfaceC38034EwI.LIZ(KevaImpl.getRepo("jsbridge2-permission", 1).getString(str, ""));
    }
}
