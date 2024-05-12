package X;

import android.app.Activity;
import ujb.o;

/* renamed from: X.OBx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61505OBx {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(java.util.Map map) {
        Object obj;
        String obj2;
        if (map == null || (obj = map.get("is_indirectly_pdp")) == null || (obj2 = obj.toString()) == null || o.LJJJJJL(obj2)) {
            return true;
        }
        return false;
    }

    public static void LIZ(EnumC61506OBy status, Activity activity, java.util.Map map) {
        int i;
        String obj;
        Integer LJJIL;
        String obj2;
        Integer LJJIL2;
        kotlin.jvm.internal.o.LJIIIZ(status, "status");
        if (map == null || !OC0.LIZ(map)) {
            return;
        }
        Object obj3 = map.get("need_overlay");
        if (obj3 != null && (obj2 = obj3.toString()) != null && (LJJIL2 = C38350F3i.LJJIL(obj2)) != null) {
            LJJIL2.intValue();
        }
        Object obj4 = map.get("after_landing_draw");
        if (obj4 != null && (obj = obj4.toString()) != null && (LJJIL = C38350F3i.LJJIL(obj)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        int i2 = C61507OBz.LIZ[status.ordinal()];
        if (i2 != 2) {
            if (i2 != 3 || i <= 0) {
                return;
            }
            IK8.LIZIZ(i);
            return;
        }
        if (activity != null) {
            try {
                if (C38580FCe.LIZIZ(activity) && !activity.isFinishing()) {
                    activity.finish();
                }
            } catch (Throwable unused) {
            }
        }
        IK8.LIZ();
    }
}
