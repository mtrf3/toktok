package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.util.HashMap;

/* renamed from: X.Fxb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40663Fxb {
    public static SharedPreferences LIZ;
    public static final java.util.Map<String, Object> LIZIZ = new HashMap();
    public static final Gson LIZJ = C65358Pkw.LIZ;

    public static SharedPreferences LIZ() {
        Context context;
        if (LIZ == null) {
            InterfaceC32258ClK interfaceC32258ClK = (InterfaceC32258ClK) C32260ClM.LIZ(InterfaceC32258ClK.class);
            if (interfaceC32258ClK != null && (context = interfaceC32258ClK.context()) != null) {
                LIZ = F9J.LIZIZ(context, 4, "live_sdk_core");
            } else {
                throw new IllegalStateException("context is nul");
            }
        }
        return LIZ;
    }
}
