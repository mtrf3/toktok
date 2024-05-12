package X;

import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.HashMap;

/* renamed from: X.VOl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79667VOl {
    public static final java.util.Map<String, Object> LIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        hashMap.put("animation_type", "");
    }

    public static void LIZ(LynxUI lynxUI, String str, String str2) {
        if (lynxUI.getEvents() != null && lynxUI.getEvents().containsKey(str)) {
            java.util.Map<String, Object> map = LIZ;
            ((HashMap) map).put("animation_type", str2);
            lynxUI.mContext.LJLJJL.LIZIZ(new VNN(lynxUI.getSign(), str, map));
        }
    }
}
