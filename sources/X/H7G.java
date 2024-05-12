package X;

import java.util.HashMap;

/* loaded from: classes8.dex */
public final class H7G {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        if (!C41658GWo.LIZLLL().LJ.booleanValue() && C43464H4a.LIZ()) {
            return true;
        }
        return false;
    }

    public static final void LIZ(int i, HashMap hashMap) {
        int i2;
        if (LIZIZ()) {
            if (i >= 61000) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            hashMap.put("is_long_video", String.valueOf(i2));
        }
    }
}
