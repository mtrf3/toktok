package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.CouponCache;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Iwn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48257Iwn {
    public static final java.util.Map<String, CouponCache> LIZ = new LinkedHashMap();

    public static List LIZ(SkuVoucher skuVoucher) {
        List<String> list;
        Integer valueOf;
        ArrayList arrayList = null;
        if (skuVoucher != null && (list = skuVoucher.bestVoucherTypeIds) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : list) {
                if (C78857UxB.LJJJIL(str)) {
                    arrayList2.add(str);
                }
            }
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                CouponCache couponCache = (CouponCache) ((LinkedHashMap) LIZ).get(next);
                if (couponCache == null || (valueOf = Integer.valueOf(couponCache.getClaimStatus())) == null || (valueOf.intValue() != 3 && valueOf.intValue() != 4)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }
}
