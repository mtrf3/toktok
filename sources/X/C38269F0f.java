package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.F0f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38269F0f {
    public static C38269F0f LIZLLL;
    public final E13<String, C38270F0g> LIZ = new E13<>(16, 16);
    public final C38270F0g LIZIZ = new C38270F0g();
    public List<InterfaceC38275F0l> LIZJ;

    public static C38269F0f LIZIZ() {
        if (LIZLLL == null) {
            synchronized (C38269F0f.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C38269F0f();
                }
            }
        }
        return LIZLLL;
    }

    public static void LIZ(List list, JSONArray jSONArray) {
        if (jSONArray == null || list == null) {
            return;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                ((ArrayList) list).add(optString);
            }
        }
    }
}
