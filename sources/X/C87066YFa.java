package X;

import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;

/* renamed from: X.YFa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87066YFa {
    public static /* synthetic */ void LIZ(IECommerceShowcaseService iECommerceShowcaseService, String str, String str2, String str3, boolean z, Integer num, String str4, String str5, String str6, String str7, java.util.Map map, int i) {
        String str8 = str6;
        String str9 = str5;
        String str10 = str7;
        java.util.Map map2 = null;
        if ((i & 128) != 0) {
            str9 = null;
        }
        if ((i & 256) != 0) {
            str8 = null;
        }
        if ((i & 512) != 0) {
            str10 = null;
        }
        if ((i & 1024) == 0) {
            map2 = map;
        }
        iECommerceShowcaseService.LJIIIIZZ(str, str2, "showcase_list", str3, z, num, str4, str9, str8, str10, map2);
    }
}
