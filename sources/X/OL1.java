package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ujb.o;

/* loaded from: classes11.dex */
public final class OL1 {
    public static final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C58240MtQ.LJLIL);
    public static volatile Aweme LIZIZ;
    public static volatile Aweme LIZJ;

    public static OL5 LIZIZ(Aweme aweme) {
        String str;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        return LIZJ(str);
    }

    public static OL5 LIZJ(String str) {
        OL5 ol5;
        if (str != null) {
            try {
                if (!o.LJJJJJL(str) && (ol5 = (OL5) ((ConcurrentHashMap) LIZ.getValue()).get(str)) != null) {
                    Integer adType = ol5.LIZLLL.getAdType();
                    int value = OL7.EC_UG_PRODUCT_CARD.getValue();
                    if (adType != null) {
                        if (adType.intValue() == value) {
                            return ol5;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static OL5 LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        try {
            String aid = aweme.getAid();
            if (aid != null && !o.LJJJJJL(aid)) {
                return (OL5) ((ConcurrentHashMap) LIZ.getValue()).get(aid);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean LJ(Aweme aweme) {
        String aid;
        if (aweme == null || (aid = aweme.getAid()) == null || o.LJJJJJL(aid) || !aweme.isAd()) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(Aweme aweme) {
        ArrayList arrayList;
        VSAProductCardsResponse.ProductCard productCard;
        List<VSAProductCardsResponse.ProductDetail> productDetailList;
        AwemeRawAd awemeRawAd;
        EcUgVSAData ecUgVSAData;
        List<EcUgVSAData.EcUgVSAProductInfo> productInfoList;
        String productId;
        ArrayList arrayList2 = null;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (ecUgVSAData = awemeRawAd.getEcUgVSAData()) != null && (productInfoList = ecUgVSAData.getProductInfoList()) != null) {
            arrayList = new ArrayList();
            for (EcUgVSAData.EcUgVSAProductInfo ecUgVSAProductInfo : productInfoList) {
                if (ecUgVSAProductInfo != null && (productId = ecUgVSAProductInfo.getProductId()) != null) {
                    arrayList.add(productId);
                }
            }
        } else {
            arrayList = null;
        }
        OL5 LIZIZ2 = LIZIZ(aweme);
        if (LIZIZ2 != null && (productCard = LIZIZ2.LJFF) != null && (productDetailList = productCard.getProductDetailList()) != null) {
            arrayList2 = new ArrayList();
            Iterator<VSAProductCardsResponse.ProductDetail> it = productDetailList.iterator();
            while (it.hasNext()) {
                String productId2 = it.next().getProductId();
                if (productId2 != null) {
                    arrayList2.add(productId2);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty() || arrayList2 == null || arrayList2.isEmpty() || arrayList.size() != arrayList2.size()) {
            return false;
        }
        return kotlin.jvm.internal.o.LJ(arrayList, arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r3 != r0.longValue()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            boolean r0 = LJ(r7)
            r6 = 0
            if (r0 == 0) goto L41
            X.OL5 r2 = LIZIZ(r7)
            if (r2 == 0) goto L41
            java.lang.String r1 = r2.LIZIZ
            r0 = 0
            if (r7 == 0) goto L16
            java.lang.String r0 = r7.getUniqueId()
        L16:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r5 = 1
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
            if (r0 == 0) goto L2b
            long r3 = r2.LIZJ
            java.lang.Long r0 = r0.getAdId()
            if (r0 != 0) goto L38
        L2b:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.feed.model.EcUgVSAData r0 = r0.getEcUgVSAData()
            if (r0 != 0) goto L41
        L37:
            return r5
        L38:
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2b
            goto L37
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OL1.LJI(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static boolean LJII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        EcUgVSAData ecUgVSAData;
        if (!LJ(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (ecUgVSAData = awemeRawAd.getEcUgVSAData()) == null) {
            return false;
        }
        Integer adType = ecUgVSAData.getAdType();
        int value = OL7.EC_UG_PRODUCT_CARD.getValue();
        if (adType == null || adType.intValue() != value) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(Aweme aweme) {
        if (LJII(aweme) || LJI(aweme)) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ(Aweme aweme) {
        String str;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = LIZIZ;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        }
        return kotlin.jvm.internal.o.LJ(str2, str);
    }

    public static boolean LJIIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        EcUgVSAData ecUgVSAData;
        if (LJ(aweme) && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (ecUgVSAData = awemeRawAd.getEcUgVSAData()) != null && ecUgVSAData.getAdType() != null) {
            return true;
        }
        return false;
    }

    public static void LJIIJJI(Aweme aweme) {
        OL5 LIZIZ2;
        AwemeRawAd awemeRawAd;
        if (LJIIIIZZ(aweme) && (LIZIZ2 = LIZIZ(aweme)) != null && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            awemeRawAd.setEcUgVSAData(LIZIZ2.LIZLLL);
            awemeRawAd.setOpenUrl(LIZIZ2.LIZLLL.getOpenUrl());
            String str = LIZIZ2.LJ;
            if (str == null || o.LJJJJJL(str)) {
                return;
            }
            awemeRawAd.setLearnMoreBgColor(LIZIZ2.LJ);
        }
    }

    public static void LIZ(Context context, List list) {
        String str;
        String aid;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            if (aweme != null && (aid = aweme.getAid()) != null) {
                arrayList.add(aid);
            }
        }
        try {
            Iterator it2 = ((ConcurrentHashMap) LIZ.getValue()).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!arrayList.contains(entry.getKey())) {
                    OL5 ol5 = (OL5) entry.getValue();
                    String str2 = (String) entry.getKey();
                    Aweme aweme2 = LIZIZ;
                    if (aweme2 != null) {
                        str = aweme2.getAid();
                    } else {
                        str = null;
                    }
                    if (kotlin.jvm.internal.o.LJ(str, str2)) {
                        OL2.LIZJ(context, LIZIZ, true);
                    }
                    ol5.LJIIJ = false;
                    ol5.LJIIJJI = false;
                    ol5.LJIIL = false;
                    ol5.LJIILIIL = false;
                    ol5.LJIILJJIL = false;
                    OLK olk = ol5.LJIIIIZZ;
                    if (olk != null) {
                        olk.LIZ();
                    }
                    ol5.LJIIIIZZ = null;
                    ol5.LJIIIZ = null;
                    it2.remove();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
