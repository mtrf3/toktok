package X;

import com.bytedance.geckox.GeckoGlobalConfig;

/* renamed from: X.ZzG, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91726ZzG {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        GeckoGlobalConfig.ENVType LJFF = O3U.LJFF();
        if (LJFF != null) {
            int i = C91725ZzF.LIZ[LJFF.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "b01ad12d05598203a34287a4d1802c19";
                }
            } else {
                return "6769d15c1fc4ebff20d79aebbe0f0cfa";
            }
        }
        return "225dff975bc950bac45a0effa960e8b8";
    }
}
