package X;

import java.util.LinkedHashMap;

/* renamed from: X.Luu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55784Luu {
    public static final java.util.Map<Integer, C238479Xn> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, C238479Xn> LIZIZ = C113554cx.LJJLIIIIJ(new OSZ("_uid_", null));

    public static java.util.Map LIZ(C55773Luj c55773Luj) {
        String str;
        String num;
        OSZ[] oszArr = new OSZ[4];
        String str2 = c55773Luj.LIZLLL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        oszArr[0] = new OSZ("video_link_id", str2);
        String str4 = c55773Luj.LIZIZ;
        if (str4 == null) {
            str4 = "";
        }
        oszArr[1] = new OSZ("video_link_item_id", str4);
        EnumC57171McB enumC57171McB = c55773Luj.LIZ;
        if (enumC57171McB == null || (str = Integer.valueOf(enumC57171McB.getRawValue()).toString()) == null) {
            str = "";
        }
        oszArr[2] = new OSZ("video_link_share_type", str);
        EnumC57171McB enumC57171McB2 = c55773Luj.LIZ;
        if (enumC57171McB2 != null && (num = Integer.valueOf(enumC57171McB2.getFollowFrom()).toString()) != null) {
            str3 = num;
        }
        oszArr[3] = new OSZ("from", str3);
        return C113554cx.LJJL(oszArr);
    }
}
