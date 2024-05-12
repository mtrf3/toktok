package X;

import com.ss.android.ugc.aweme.dsp.playerservice.NewDspPlayerService;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Zr6, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91220Zr6 {
    public static C91221Zr7 LIZIZ(String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        java.util.Map<String, C91221Zr7> map = C91221Zr7.LIZJ;
        if (map.isEmpty()) {
            C78983UzD.LJIILL("music dsp map is empty");
            return LIZ(enterMethod, null);
        }
        C91221Zr7 c91221Zr7 = (C91221Zr7) ((LinkedHashMap) map).get(enterMethod);
        if (c91221Zr7 != null) {
            return c91221Zr7;
        }
        C78983UzD.LJIILL("music dsp page is empty");
        return LIZ(enterMethod, null);
    }

    public static C91221Zr7 LIZ(String enterMethod, String str) {
        o.LJIIIZ(enterMethod, "enterMethod");
        java.util.Map<String, C91221Zr7> map = C91221Zr7.LIZJ;
        C91221Zr7 c91221Zr7 = (C91221Zr7) ((LinkedHashMap) map).get(enterMethod);
        if (c91221Zr7 != null && !o.LJ(c91221Zr7.LIZIZ, str)) {
            c91221Zr7.LIZ.detach();
        }
        C91221Zr7 c91221Zr72 = new C91221Zr7(enterMethod, new NewDspPlayerService(), str);
        map.put(enterMethod, c91221Zr72);
        return c91221Zr72;
    }
}
