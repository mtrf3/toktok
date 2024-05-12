package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import org.json.JSONObject;

/* renamed from: X.EwF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38031EwF implements InterfaceC38068Ewq {
    @Override // X.InterfaceC38068Ewq
    public final void LIZ(String str, String str2) {
        Keva repo = KevaImpl.getRepo("jsbridge2-permission", 1);
        if (str == "com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response") {
            repo.storeBoolean("jsb_permission_write", false);
            repo.storeInt("jsb_permission_string_length", str2.length());
        }
        repo.storeString(str, str2);
        if (str == "com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response") {
            repo.storeBoolean("jsb_permission_write", true);
        }
        try {
            C37876Etk.LIZJ("jsb_auth_jsb2_write", new JSONObject().put("key", str));
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC38068Ewq
    public final void LIZIZ(String str, InterfaceC38034EwI interfaceC38034EwI) {
        interfaceC38034EwI.LIZ(KevaImpl.getRepo("jsbridge2-permission", 1).getString(str, ""));
        try {
            C37876Etk.LIZJ("jsb_auth_jsb2_read", new JSONObject().put("key", str));
        } catch (Exception unused) {
        }
    }
}
