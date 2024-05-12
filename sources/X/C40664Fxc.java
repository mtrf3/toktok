package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.util.HashMap;

/* renamed from: X.Fxc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40664Fxc {
    public static final java.util.Map<String, java.util.Map<String, Object>> LIZ = new HashMap();
    public static final Gson LIZIZ = C65358Pkw.LIZ;

    public static SharedPreferences LIZ(String str) {
        Context context;
        InterfaceC32258ClK interfaceC32258ClK = (InterfaceC32258ClK) C32260ClM.LIZ(InterfaceC32258ClK.class);
        if (interfaceC32258ClK != null && (context = interfaceC32258ClK.context()) != null) {
            return F9J.LIZIZ(context, 0, str);
        }
        throw new IllegalStateException("context is nul");
    }
}
