package X;

import Y.ARunnableS21S0300000_10;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import v82.IDdS502S0100000_10;

/* loaded from: classes11.dex */
public final class OL3 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(OLC.LJLIL);
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static C61740OKy LJFF;
    public static ScheduledFuture<?> LJI;

    public static java.util.Map LIZIZ(Context context) {
        OL5 LIZIZ2;
        String str;
        List<VSAProductCardsResponse.ProductDetail> productDetailList;
        VSAProductCardsResponse.ProductDetail productDetail;
        o.LJIIIZ(context, "context");
        if (LUT.LIZJ(context)) {
            return C113554cx.LJJJLIIL();
        }
        Aweme aweme = OL1.LIZIZ;
        if (aweme != null && (LIZIZ2 = OL1.LIZIZ(aweme)) != null && LIZIZ2.LJIILJJIL && !LIZIZ2.LJIIJJI) {
            LIZIZ2.LJIIJJI = true;
            OL1.LJIIJJI(aweme);
            try {
                C38995FSd.LIZJ().execute(new ARunnableS21S0300000_10(context, aweme, LIZIZ2, 15));
            } catch (Throwable unused) {
            }
            VSAProductCardsResponse.ProductCard productCard = LIZIZ2.LJFF;
            if (productCard != null && (productDetailList = productCard.getProductDetailList()) != null && (productDetail = (VSAProductCardsResponse.ProductDetail) ORZ.LJLLLL(productDetailList)) != null) {
                str = productDetail.getProductId();
            } else {
                str = null;
            }
            return E2C.LIZJ("video_shop_guide_schema", OLG.LIZLLL(OLG.LIZ, context, null, aweme, ED2.LIZ(str), OL6.SHOP_TAB_ICON, false, 34));
        }
        return C113554cx.LJJJLIIL();
    }

    public static boolean LIZJ(String str) {
        return o.LJ("homepage_hot", str);
    }

    public static void LJ(String str) {
        OL2.LJ();
        C61503OBv.LIZ(EnumC61504OBw.CARD_SHOW_FAIL);
        OL5 LIZIZ2 = OL1.LIZIZ(OL1.LIZIZ);
        if (LIZIZ2 != null) {
            OLH.LJ(EnumC61741OKz.SHOW.getValue(), false, 0, str, null, LIZIZ2.LJFF, LIZIZ2.LJI, 20);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        OLH.LJ(EnumC61741OKz.SHOW.getValue(), false, 0, str, null, null, null, 116);
    }

    public static void LJFF(OL5 ol5) {
        List<VSAProductCardsResponse.ProductDetail> productDetailList;
        VSAProductCardsResponse.ProductDetail productDetail;
        Image image;
        List<String> urls;
        int i;
        try {
            VSAProductCardsResponse.ProductCard productCard = ol5.LJFF;
            if (productCard != null && (productDetailList = productCard.getProductDetailList()) != null && (productDetail = (VSAProductCardsResponse.ProductDetail) ORZ.LJLLLL(productDetailList)) != null && (image = productDetail.getImage()) != null && (urls = image.getUrls()) != null) {
                String str = (String) ORZ.LJLLLL(urls);
                int i2 = 0;
                if (str != null && !ujb.o.LJJJJJL(str) && !ol5.LJIIJ && ol5.LJII == null) {
                    ol5.LJIIJ = true;
                    W5F LJIIIZ = W5U.LJIIIZ(image.toImageUrlModel());
                    Integer width = image.getWidth();
                    if (width != null) {
                        i = width.intValue();
                    } else {
                        i = 0;
                    }
                    Integer height = image.getHeight();
                    if (height != null) {
                        i2 = height.intValue();
                    }
                    if (i > 0 && i2 > 0) {
                        LJIIIZ.LJIIIZ = i;
                        LJIIIZ.LJIIJ = i2;
                    }
                    LJIIIZ.LJJI = KL0.HIGH;
                    LJIIIZ.LIZIZ("ec_ug_vsa");
                    LJIIIZ.LJIIIZ(new IDdS502S0100000_10(ol5, 2));
                    LJI(ol5);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void LJI(OL5 ol5) {
        List LLILLL;
        String str;
        int i;
        int i2;
        try {
            VSAProductCardsResponse.ProductCard productCard = ol5.LJFF;
            if (productCard != null) {
                OLL.LJLLI.getClass();
                int LIZ2 = OL9.LIZ(productCard);
                List<VSAProductCardsResponse.ProductDetail> productDetailList = productCard.getProductDetailList();
                if (productDetailList != null && (LLILLL = ORZ.LLILLL(productDetailList, LIZ2)) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = LLILLL.iterator();
                    while (it.hasNext()) {
                        Image image = ((VSAProductCardsResponse.ProductDetail) it.next()).getImage();
                        if (image != null) {
                            arrayList.add(image);
                        }
                    }
                    List<Image> LLJILJILJ = ORZ.LLJILJILJ(arrayList);
                    if (LLJILJILJ != null) {
                        if (!LLJILJILJ.isEmpty()) {
                            for (Image image2 : LLJILJILJ) {
                                List<String> urls = image2.getUrls();
                                if (urls != null && (str = (String) ORZ.LJLLLL(urls)) != null && !ujb.o.LJJJJJL(str)) {
                                    W5F LJIIIZ = W5U.LJIIIZ(image2.toImageUrlModel());
                                    Integer width = image2.getWidth();
                                    if (width != null) {
                                        i = width.intValue();
                                    } else {
                                        i = 0;
                                    }
                                    Integer height = image2.getHeight();
                                    if (height != null) {
                                        i2 = height.intValue();
                                    } else {
                                        i2 = 0;
                                    }
                                    if (i > 0 && i2 > 0) {
                                        LJIIIZ.LJIIIZ = i;
                                        LJIIIZ.LJIIJ = i2;
                                    }
                                    LJIIIZ.LIZIZ("ec_ug_vsa");
                                    LJIIIZ.LJI();
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void LJII(Context context) {
        ActivityC45651qj LJJIFFI;
        if (LIZIZ && context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            C61740OKy c61740OKy = new C61740OKy(context);
            LJFF = c61740OKy;
            try {
                com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI).hv0("page_profile", c61740OKy);
            } catch (Throwable unused) {
            }
        }
    }

    public static Aweme LIZ(Aweme aweme, String str) {
        String str2;
        Aweme aweme2 = OL1.LIZIZ;
        if (LIZJ(str) && LIZIZ && OL1.LJIIIIZZ(aweme) && aweme2 != null) {
            String aid = aweme2.getAid();
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            if (o.LJ(aid, str2)) {
                return aweme2;
            }
        }
        return null;
    }

    public static void LJIIIIZZ(Context context, Aweme aweme) {
        OL5 LIZIZ2;
        Bitmap bitmap;
        if (((Boolean) OL2.LIZ(context, aweme).getFirst()).booleanValue() && (LIZIZ2 = OL1.LIZIZ(aweme)) != null) {
            boolean z = LIZIZ2.LJIILIIL;
            if (LIZIZ2.LJIILIIL) {
                bitmap = LIZIZ2.LJII;
            } else {
                bitmap = null;
            }
            OL2.LIZLLL(context, LIZIZ2, z, bitmap);
        }
    }

    public static void LJIIIZ(Context context, C61739OKx c61739OKx) {
        ActivityC45651qj LJJIFFI;
        OL2.LIZJ(context, OL1.LIZIZ, true);
        C61740OKy c61740OKy = LJFF;
        if (c61740OKy != null && context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            try {
                com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI).zv0("page_profile", c61740OKy);
            } catch (Throwable unused) {
            }
        }
        if (c61739OKx != null) {
            try {
                EventBus LIZJ2 = EventBus.LIZJ();
                if (LIZJ2.LJI(c61739OKx)) {
                    LIZJ2.LJIJ(c61739OKx);
                }
            } catch (Throwable unused2) {
            }
        }
        OL5 LIZIZ2 = OL1.LIZIZ(OL1.LIZIZ);
        if (LIZIZ2 != null) {
            try {
                OLK olk = LIZIZ2.LJIIIIZZ;
                if (olk != null) {
                    olk.LIZJ();
                }
                LIZIZ2.LJIIJ = false;
                LIZIZ2.LJIIJJI = false;
                LIZIZ2.LJIIL = false;
                LIZIZ2.LJIILIIL = false;
                LIZIZ2.LJIILJJIL = false;
            } catch (Throwable unused3) {
            }
        }
        OL1.LIZJ = OL1.LIZIZ;
        OL1.LIZIZ = null;
        LIZJ = false;
        LIZLLL = false;
        LJ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.ss.android.ugc.aweme.feed.model.Aweme] */
    public static String LIZLLL(Context context, String str, Aweme aweme, Integer num, String str2, int i) {
        OL6 ol6;
        String str3 = str;
        if ((i & 2) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if (context != null && aweme != null) {
            C68322mC c68322mC = new C68322mC();
            ?? r0 = OL1.LIZIZ;
            c68322mC.element = r0;
            if (r0 == 0 || !o.LJ(r0.getAid(), aweme.getAid())) {
                OL5 LIZIZ2 = OL1.LIZIZ(aweme);
                T t = aweme;
                if (LIZIZ2 != null) {
                    Aweme aweme2 = LIZIZ2.LIZ.get();
                    t = aweme;
                    if (aweme2 != null) {
                        t = aweme2;
                    }
                }
                c68322mC.element = t;
            }
            if (OL1.LJIIJ((Aweme) c68322mC.element)) {
                OL1.LJIIJJI((Aweme) c68322mC.element);
                if (num != null) {
                    OLG olg = OLG.LIZ;
                    int intValue = num.intValue();
                    olg.getClass();
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue != 7 && intValue != 8) {
                                    if (intValue != 33) {
                                        if (intValue != 37) {
                                            switch (intValue) {
                                                default:
                                                    switch (intValue) {
                                                        case 19:
                                                        case 20:
                                                        case 21:
                                                            break;
                                                        default:
                                                            ol6 = OL6.OTHER;
                                                            break;
                                                    }
                                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                case 12:
                                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                                case 14:
                                                case 15:
                                                    ol6 = OL6.VIDEO_MASK;
                                                    break;
                                            }
                                        }
                                    } else {
                                        ol6 = OL6.PRODUCT_CARD;
                                    }
                                }
                                ol6 = OL6.VIDEO_PROFILE;
                            }
                            ol6 = OL6.VIDEO_MASK;
                        } else {
                            ol6 = OL6.VIDEO_CTA;
                        }
                    } else {
                        ol6 = OL6.VIDEO_DESC;
                    }
                } else {
                    OLG olg2 = OLG.LIZ;
                    String LIZ2 = ED2.LIZ(str2);
                    olg2.getClass();
                    ol6 = OL6.PRODUCT_CARD;
                    if (!o.LJ(LIZ2, ol6.getValue())) {
                        ol6 = OL6.SHOP_TAB_ICON;
                        if (!o.LJ(LIZ2, ol6.getValue())) {
                            ol6 = OL6.VIDEO_DESC;
                            if (!o.LJ(LIZ2, ol6.getValue())) {
                                ol6 = OL6.VIDEO_CTA;
                                if (!o.LJ(LIZ2, ol6.getValue())) {
                                    ol6 = OL6.VIDEO_MASK;
                                    if (!o.LJ(LIZ2, ol6.getValue())) {
                                        ol6 = OL6.VIDEO_PROFILE;
                                        if (!o.LJ(LIZ2, ol6.getValue())) {
                                            ol6 = OL6.OTHER;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                try {
                    C38995FSd.LIZJ().execute(new ARunnableS21S0300000_10(context, c68322mC, ol6, 16));
                } catch (Throwable unused) {
                }
                return OLG.LIZLLL(OLG.LIZ, context, str3, (Aweme) c68322mC.element, null, ol6, false, 40);
            }
        }
        return "";
    }
}
