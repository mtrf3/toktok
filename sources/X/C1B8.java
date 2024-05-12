package X;

import androidx.fragment.app.Fragment;
import org.json.JSONObject;

/* renamed from: X.1B8, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1B8 implements InterfaceC46989IcL {
    public static boolean LIZJ() {
        return C60903NvH.LJIIJJI().getAccountService().isLogin();
    }

    public static String LIZ(String str, Fragment fragment, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(fragment);
        LIZ.append(str2);
        return X1D.LIZIZ(LIZ);
    }

    public static JSONObject LIZIZ(String str, String str2, String str3, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, str2);
        jSONObject.put(str3, i);
        return jSONObject;
    }
}
