package X;

import com.bytedance.android.livesdk.model.UserAttr;

/* renamed from: X.BDr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28427BDr {
    public static boolean LIZ(int i) {
        Boolean bool;
        UserAttr LIZ;
        java.util.Map<Integer, Integer> map;
        Integer num;
        UserAttr LIZ2 = C05200Ii.LIZ();
        if (LIZ2 != null) {
            bool = Boolean.valueOf(LIZ2.isAdmin);
        } else {
            bool = null;
        }
        if (!C29306Beo.LJJIFFI(bool) || (LIZ = C05200Ii.LIZ()) == null || (map = LIZ.adminPermissions) == null || (num = map.get(Integer.valueOf(i))) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }
}
