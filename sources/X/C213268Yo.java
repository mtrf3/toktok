package X;

import android.content.Context;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.8Yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213268Yo {
    public final Context LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl$WishListFragmentData] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C213298Yr LIZ() {
        /*
            r6 = this;
            X.2mC r3 = new X.2mC
            r3.<init>()
            java.lang.String r0 = "ec_new_wish_list_enable"
            r2 = 0
            int r1 = X.Q7K.LIZIZ(r0, r2)
            r0 = 1
            if (r1 != r0) goto L60
        Lf:
            java.lang.String r4 = "profile"
            r5 = 0
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.ecommerce.service.IECommerceService r2 = com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService.createIECommerceServicebyMonsterPlugin(r2)
            if (r2 == 0) goto L39
            java.lang.String r0 = r6.LIZIZ
            if (r0 == 0) goto L31
            java.lang.Boolean r1 = r6.LIZJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L45
            r1 = r4
        L29:
            java.lang.String r0 = r6.LIZIZ
            com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem r0 = r2.createWishListFragmentData(r1, r0)
            if (r0 != 0) goto L37
        L31:
            java.lang.String r0 = "personal_homepage"
            com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem r0 = r2.createWishListFragmentData(r4, r0)
        L37:
            r3.element = r0
        L39:
            T r1 = r3.element
            com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem r1 = (com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem) r1
            if (r1 == 0) goto L62
            X.8Yr r0 = new X.8Yr
            r0.<init>(r1, r6)
            return r0
        L45:
            r1 = r5
            goto L29
        L47:
            com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService r2 = com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl.LJIIIZ()
            if (r2 == 0) goto L39
            java.lang.Boolean r1 = r6.LIZJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L5e
        L57:
            com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl$WishListFragmentData r0 = r2.LIZLLL(r4)
            r3.element = r0
            goto L39
        L5e:
            r4 = r5
            goto L57
        L60:
            r0 = 0
            goto Lf
        L62:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C213268Yo.LIZ():X.8Yr");
    }

    public final String LIZIZ(int i, String str) {
        String string = this.LIZ.getString(i);
        o.LJIIIIZZ(string, "context.getString(key)");
        if (!o.LJ(string, str)) {
            StringBuilder LIZ = X1D.LIZ();
            String substring = string.substring(0, 1);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Locale ROOT = Locale.ROOT;
            o.LJIIIIZZ(ROOT, "ROOT");
            String upperCase = substring.toUpperCase(ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
            LIZ.append(upperCase);
            String substring2 = string.substring(1);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            String lowerCase = substring2.toLowerCase(ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            LIZ.append(lowerCase);
            return X1D.LIZIZ(LIZ);
        }
        return string;
    }

    public C213268Yo(String str, Boolean bool, ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = str;
        this.LIZJ = bool;
    }
}
