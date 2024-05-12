package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PdpPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuQuantityProperty;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.ReT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70053ReT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Image image) {
        String str;
        o.LJIIIZ(image, "image");
        ArrayList arrayList = new ArrayList();
        List<String> urls = image.getUrls();
        if (urls != null) {
            Iterator<String> it = urls.iterator();
            while (it.hasNext()) {
                arrayList.add(C70657RoD.LJIIJJI(it.next(), EnumC70569Rmn.SKU_SHOP));
            }
        }
        image.setUrls(arrayList);
        ArrayList arrayList2 = new ArrayList();
        try {
        } catch (Exception unused) {
            C78983UzD.LJIILL("self error: sku image resize fail");
        }
        if (C2SF.LIZ()) {
            List<String> thumbUrls = image.getThumbUrls();
            if (thumbUrls == null || (str = (String) ORZ.LJLLLLLL(0, thumbUrls)) == null) {
                str = "";
            }
            if (!o.LJ((String) ORZ.LJLLLLLL(r1.size() - 2, s.LJLJJL(str, new String[]{":"}, 0, 6)), "200")) {
                List<String> urls2 = image.getUrls();
                if (urls2 != null) {
                    Iterator<String> it2 = urls2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(C1E4.LJJIIZ(it2.next(), 200, 200, EnumC70569Rmn.SKU_SHOP));
                    }
                }
                image.setThumbUrls(arrayList2);
            }
        }
        List<String> thumbUrls2 = image.getThumbUrls();
        if (thumbUrls2 != null) {
            Iterator<String> it3 = thumbUrls2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(C70657RoD.LJIIJJI(it3.next(), EnumC70569Rmn.SKU_SHOP));
            }
        }
        image.setThumbUrls(arrayList2);
    }

    public static void LIZIZ(List list) {
        List<String> urls;
        List<String> thumbUrls;
        List<String> urls2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<SalePropValue> list2 = ((SaleProp) it.next()).salePropValueList;
            if (list2 != null) {
                for (SalePropValue salePropValue : list2) {
                    ArrayList arrayList = new ArrayList();
                    Image image = salePropValue.image;
                    if (image != null && (urls2 = image.getUrls()) != null) {
                        Iterator<String> it2 = urls2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(C70657RoD.LJIIJJI(it2.next(), EnumC70569Rmn.SKU_SHOP));
                        }
                    }
                    Image image2 = salePropValue.image;
                    if (image2 != null) {
                        image2.setUrls(arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Image image3 = salePropValue.image;
                    if ((image3 == null || image3.getThumbUrls() == null) && C2SF.LIZ()) {
                        Image image4 = salePropValue.image;
                        if (image4 != null && (urls = image4.getUrls()) != null) {
                            Iterator<String> it3 = urls.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(C1E4.LJJIIZ(it3.next(), 200, 200, EnumC70569Rmn.SKU_SHOP));
                            }
                        }
                    } else {
                        Image image5 = salePropValue.image;
                        if (image5 != null && (thumbUrls = image5.getThumbUrls()) != null) {
                            Iterator<String> it4 = thumbUrls.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(C70657RoD.LJIIJJI(it4.next(), EnumC70569Rmn.SKU_SHOP));
                            }
                        }
                    }
                    Image image6 = salePropValue.image;
                    if (image6 != null) {
                        image6.setThumbUrls(arrayList2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.Map LJI(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HashMap<String, Object> LJII = C27739Aud.LJII(((PromotionItem) it.next()).getLog_extra());
                if (LJII != null) {
                    for (Map.Entry<String, Object> entry : LJII.entrySet()) {
                        if (hashMap2.get(entry.getKey()) == null) {
                            String key = entry.getKey();
                            String[] strArr = new String[1];
                            Object value = entry.getValue();
                            if (!(value instanceof String) || value == null) {
                                value = C27739Aud.LJI(entry.getValue());
                            }
                            strArr[0] = value;
                            hashMap2.put(key, C47261Igj.LJJIJIL(strArr));
                        } else {
                            List list2 = (List) hashMap2.get(entry.getKey());
                            if (list2 != null) {
                                Object value2 = entry.getValue();
                                if (!(value2 instanceof String) || value2 == null) {
                                    value2 = C27739Aud.LJI(entry.getValue());
                                }
                                list2.add(value2);
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                hashMap3.put(entry2.getKey(), ORZ.LLD((Iterable) entry2.getValue(), ",", null, null, null, 62));
            }
            hashMap.putAll(hashMap3);
        }
        return hashMap;
    }

    public static boolean LJIIJJI(String[] strArr) {
        o.LJIIIZ(strArr, "<this>");
        if (strArr.length == 0) {
            return true;
        }
        for (String str : strArr) {
            if (!o.LJ(str, "")) {
                return false;
            }
        }
        return true;
    }

    public static com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc LIZJ(ProductPackStruct productPackStruct, String[] strArr) {
        List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc> list;
        com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc skc;
        if (strArr != null) {
            for (String str : strArr) {
                SkcInfo skcInfo = productPackStruct.skcInfo;
                if (skcInfo != null && (list = skcInfo.skcList) != null) {
                    Iterator<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            skc = it.next();
                            if (o.LJ(skc.skcId, str)) {
                                break;
                            }
                        } else {
                            skc = null;
                            break;
                        }
                    }
                    com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc skc2 = skc;
                    if (skc2 != null) {
                        return skc2;
                    }
                }
            }
        }
        return null;
    }

    public static SkuItem LIZLLL(ProductPackStruct productPackStruct, String str) {
        List<SkuItem> list = productPackStruct.skus;
        SkuItem skuItem = null;
        if (list == null) {
            return null;
        }
        Iterator<SkuItem> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SkuItem next = it.next();
            if (o.LJ(next.skuId, str)) {
                skuItem = next;
                break;
            }
        }
        return skuItem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] LJ(int r4, java.lang.String[] r5) {
        /*
            java.lang.String r3 = ""
            if (r5 == 0) goto L1e
            int r0 = r5.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r0)
            java.lang.String r0 = "copyOf(this, size)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
        L10:
            int r0 = r2.length
            if (r0 >= r4) goto L33
            java.lang.String[] r2 = new java.lang.String[r4]
            r1 = 0
            r0 = 0
        L17:
            r2[r0] = r3
            int r0 = r0 + 1
            if (r0 >= r4) goto L25
            goto L17
        L1e:
            java.lang.String[] r2 = new java.lang.String[]{r3}
            goto L10
        L23:
            if (r1 >= r4) goto L33
        L25:
            if (r5 == 0) goto L2d
            java.lang.Object r0 = X.ORY.LJJJJI(r1, r5)
            if (r0 != 0) goto L2e
        L2d:
            r0 = r3
        L2e:
            r2[r1] = r0
            int r1 = r1 + 1
            goto L23
        L33:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70053ReT.LJ(int, java.lang.String[]):java.lang.String[]");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:6|(1:44)|12|(1:14)(1:43)|(3:16|(1:31)(1:20)|(3:22|(2:26|27)|28))|32|33|(2:37|38)|28) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannableStringBuilder LJFF(android.content.Context r9, java.util.List r10) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "props"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            java.util.Iterator r8 = r10.iterator()
            r3 = 0
            r5 = 0
        L15:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lbd
            java.lang.Object r6 = r8.next()
            int r7 = r5 + 1
            if (r5 < 0) goto Lb8
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r6 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp) r6
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue> r0 = r6.salePropValueList
            java.lang.String r2 = ""
            if (r0 == 0) goto L37
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r3, r0)
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue) r0
            if (r0 == 0) goto L37
            java.lang.String r1 = r0.propValue
            if (r1 != 0) goto L38
        L37:
            r1 = r2
        L38:
            int r0 = r1.length()
            if (r0 != 0) goto Lb6
            r0 = 1
        L3f:
            if (r0 != 0) goto L51
            java.lang.String r0 = r6.propName
            if (r0 == 0) goto L4b
            int r0 = r0.length()
            if (r0 != 0) goto L4f
        L4b:
            r0 = 1
        L4c:
            if (r0 == 0) goto L6b
            goto L51
        L4f:
            r0 = 0
            goto L4c
        L51:
            int r0 = X.C47261Igj.LJJI(r10)     // Catch: java.lang.Exception -> Lb3
            if (r5 != r0) goto Lb3
            int r1 = r4.length()     // Catch: java.lang.Exception -> Lb3
            r0 = 2
            if (r1 <= r0) goto Lb3
            int r1 = r4.length()     // Catch: java.lang.Exception -> Lb3
            int r1 = r1 - r0
            int r0 = r4.length()     // Catch: java.lang.Exception -> Lb3
            r4.replace(r1, r0, r2)     // Catch: java.lang.Exception -> Lb3
            goto Lb3
        L6b:
            java.lang.String r0 = r6.propName
            r4.append(r0)
            java.lang.String r0 = ": "
            r4.append(r0)
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r1)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r0 = 2130968766(0x7f0400be, float:1.7546195E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r9)
            r1.<init>(r0)
            int r0 = r6.length()
            r2 = 33
            r6.setSpan(r1, r3, r0, r2)
            X.T5U r1 = new X.T5U
            r0 = 41
            r1.<init>(r0, r3)
            int r0 = r6.length()
            r6.setSpan(r1, r3, r0, r2)
            r4.append(r6)
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb3
            int r0 = X.C47261Igj.LJJI(r10)
            if (r5 >= r0) goto Lb3
            java.lang.String r0 = ", "
            r4.append(r0)
        Lb3:
            r5 = r7
            goto L15
        Lb6:
            r0 = 0
            goto L3f
        Lb8:
            X.C47261Igj.LJJJJJ()
            r0 = 0
            throw r0
        Lbd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70053ReT.LJFF(android.content.Context, java.util.List):android.text.SpannableStringBuilder");
    }

    public static List LJII(SkuItem skuItem, ProductPackStruct productPackStruct) {
        boolean z;
        java.util.Map<String, PdpPromotion> map;
        List<String> list;
        PdpPromotion pdpPromotion;
        List<PromotionItem> list2;
        PromotionView promotionView;
        if (productPackStruct != null) {
            z = o.LJ(productPackStruct.promotionReform, Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z) {
            if (skuItem == null || (promotionView = skuItem.promotionView) == null) {
                return null;
            }
            return promotionView.promotion_items;
        }
        SkuCommonConfig skuCommonConfig = productPackStruct.skuCommonConfig;
        if (skuCommonConfig == null || (map = skuCommonConfig.pdpPromotionItems) == null || map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (skuItem != null && (list = skuItem.promotionKeyList) != null) {
            for (String str : list) {
                if (map != null && (pdpPromotion = map.get(str)) != null && (list2 = pdpPromotion.promotionItems) != null) {
                    arrayList.addAll(list2);
                }
            }
        }
        return arrayList;
    }

    public static int LJIIIIZZ(SkuPanelState skuPanelState, SkuItem skuItem) {
        int i;
        Integer num;
        int intValue;
        Integer num2;
        Integer productQuantity;
        if (skuPanelState != null && (productQuantity = skuPanelState.getProductQuantity()) != null) {
            i = productQuantity.intValue();
            if (i != 1) {
                if (skuItem == null) {
                    return i;
                }
                num = skuItem.minBuyQuantity;
                if (num == null && (intValue = num.intValue()) > 1 && intValue > i) {
                    return intValue;
                }
                return i;
            }
        } else {
            i = 1;
        }
        if (skuItem != null) {
            SkuQuantityProperty skuQuantityProperty = skuItem.skuQuantityProperty;
            if (skuQuantityProperty != null && (num2 = skuQuantityProperty.defaultAddCartQuantity) != null) {
                i = num2.intValue();
            }
            num = skuItem.minBuyQuantity;
            return num == null ? i : i;
        }
        return i;
    }

    public static boolean LJIIIZ(List list, String[] strArr) {
        if (strArr != null && strArr.length != 0 && list != null && !list.isEmpty() && strArr != null) {
            for (String str : strArr) {
                if (!ujb.o.LJJJJJL(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJIIJ(List list, String[] strArr) {
        if (strArr == null) {
            return false;
        }
        if (RXW.LIZ(list, strArr) <= 0 && (strArr == null || !LJIIJJI(strArr))) {
            return false;
        }
        return true;
    }
}
