package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jl8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50082Jl8 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(java.util.Map searchDataMap) {
        o.LJIIIZ(searchDataMap, "searchDataMap");
        String LIZ2 = C15190ih.LIZ();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("shoot_way", "hashtag_search");
        c188727au.LJIIIZ("shoot_enter_from", "general_search");
        c188727au.LJIIIZ("enter_from", "general_search");
        c188727au.LJIIIZ("shoot_entrance", "general_search");
        c188727au.LJIIIZ("creation_id", LIZ2);
        c188727au.LJIIIIZZ(searchDataMap);
        FMX.LJIIL("shoot", c188727au.LIZ);
        return LIZ2;
    }

    public static void LIZIZ(EnumC50080Jl6 type, C50321Joz c50321Joz) {
        String str;
        String str2;
        String searchId;
        o.LJIIIZ(type, "type");
        int i = C50081Jl7.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "text";
                } else {
                    throw new C162476Zf();
                }
            } else {
                str = "upload";
            }
        } else {
            str = "shoot";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "general_search");
        c188727au.LJIIIZ("token_type", str);
        String str3 = "";
        if (c50321Joz == null || (str2 = c50321Joz.getSearchKeyword()) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("search_keyword", str2);
        if (c50321Joz != null && (searchId = c50321Joz.getSearchId()) != null) {
            str3 = searchId;
        }
        c188727au.LJIIIZ("search_id", str3);
        FMX.LJIIL("search_result_show_bar", c188727au.LIZ);
    }
}
