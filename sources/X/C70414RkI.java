package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpSlowFuncOpt;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS0S1220100_12;
import kotlin.jvm.internal.AqS0S2200100_4;
import kotlin.jvm.internal.AqS0S3110000_12;
import kotlin.jvm.internal.AqS0S3201000_12;
import kotlin.jvm.internal.AqS12S1110000_12;
import kotlin.jvm.internal.AqS12S1201000_12;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS13S2200000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS19S2100000_12;
import kotlin.jvm.internal.AqS1S2400000_12;
import kotlin.jvm.internal.AqS33S0100100_12;
import kotlin.jvm.internal.AqS3S2300000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.AqS4S2101000_4;
import kotlin.jvm.internal.AqS53S1200000_12;
import kotlin.jvm.internal.AqS54S0110000_12;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.AqS8S1201000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.RkI */
/* loaded from: classes13.dex */
public final class C70414RkI {
    public static final ExecutorService LJJJJ = C16880lQ.LLLLZLLIL();
    public static boolean LJJJJI = true;
    public final IPdpStarter.PdpEnterParam LIZ;
    public final ConcurrentHashMap<String, Object> LIZIZ;
    public final LinkedHashMap<String, Object> LIZJ;
    public InterfaceC71003Rtn LIZLLL;
    public long LJ;
    public long LJFF;
    public final HashSet<String> LJI;
    public final HashSet<String> LJII;
    public boolean LJIIIIZZ;
    public final HashSet<String> LJIIIZ;
    public EnumC70104RfI LJIIJ;
    public ProductPackStruct LJIIJJI;
    public boolean LJIIL;
    public Integer LJIILIIL;
    public Long LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public long LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public int LJIJJ;
    public long LJIJJLI;
    public int LJIL;
    public String LJJ;
    public Boolean LJJI;
    public final java.util.Set<String> LJJIFFI;
    public boolean LJJII;
    public final java.util.Set<String> LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public final HashSet<String> LJJIJIL;
    public final HashSet<String> LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public boolean LJJJ;
    public final HashSet<String> LJJJI;
    public final HashSet<String> LJJJIL;

    public final InterfaceC71003Rtn LJIJI() {
        InterfaceC71003Rtn interfaceC71003Rtn = this.LIZLLL;
        if (interfaceC71003Rtn != null) {
            return interfaceC71003Rtn;
        }
        o.LJIJI("node");
        throw null;
    }

    public final boolean LJIJJ() {
        boolean z;
        ProductDetailReview productDetailReview;
        List<ReviewImageItem> list;
        C70669RoP.LIZ.getClass();
        boolean z2 = C70669RoP.LIZ().pdpSeparateDisplay;
        ProductPackStruct productPackStruct = this.LJIIJJI;
        if (productPackStruct != null && (productDetailReview = productPackStruct.review) != null && (list = productDetailReview.reviewImageItems) != null && (!list.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    public final void LJJLIIIIJ() {
        if (!this.LJJIJIIJIL) {
            this.LJJIJIIJIL = true;
            if (C26847AgF.LIZ()) {
                C78946Uyc.LJJII(LJIJI(), new C70920RsS(), new AqS170S0100000_4(this, 1552));
            } else {
                C76542zS.LJ("tiktokec_module_show", new AqS170S0100000_4(this, 1553));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r11 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJIJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance r11) {
        /*
            java.lang.String r4 = "|||"
            if (r11 == 0) goto L40
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct> r5 = r11.relateProducts
            if (r5 == 0) goto L40
            java.lang.String r6 = "|"
            r7 = 0
            X.ArB r9 = X.C27525ArB.LJLIL
            r10 = 30
            r8 = r7
            java.lang.String r3 = X.ORZ.LLD(r5, r6, r7, r8, r9, r10)
        L14:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct> r5 = r11.relateProducts
            if (r5 == 0) goto L24
            java.lang.String r6 = "|"
            r7 = 0
            X.ArC r9 = X.C27526ArC.LJLIL
            r10 = 30
            r8 = r7
            java.lang.String r4 = X.ORZ.LLD(r5, r6, r7, r8, r9, r10)
        L24:
            r0 = 2
            X.OSZ[] r2 = new X.OSZ[r0]
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "product_id"
            r1.<init>(r0, r3)
            r0 = 0
            r2[r0] = r1
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "sale_price"
            r1.<init>(r0, r4)
            r0 = 1
            r2[r0] = r1
            java.util.Map r0 = X.C113554cx.LJJL(r2)
            return r0
        L40:
            r3 = r4
            if (r11 == 0) goto L24
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70414RkI.LJIJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance):java.util.Map");
    }

    public static void LJJLJLI(InterfaceC65784Pro interfaceC65784Pro) {
        if (EcPdpSlowFuncOpt.LIZIZ()) {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C64692gL(interfaceC65784Pro, null), 3);
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    public final void LIZ(LaneParams laneParams) {
        List<StaticSellingPoint> list;
        ProductBase productBase;
        DynamicSellingPointsBase dynamicSellingPointsBase;
        List<DynamicSellingPoint> list2;
        StringBuilder sb = new StringBuilder();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ProductPackStruct productPackStruct = this.LJIIJJI;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (dynamicSellingPointsBase = productBase.dynamicSellingPointsBase) != null && (list2 = dynamicSellingPointsBase.dynamicSellingPoints) != null) {
            Iterator<DynamicSellingPoint> it = list2.iterator();
            while (it.hasNext()) {
                String str = it.next().bubbleTextType;
                if (str != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                String str2 = (String) next;
                if (i2 == 0) {
                    sb.append(str2);
                } else {
                    sb.append(",");
                    sb.append(str2);
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (linkedHashSet.size() > 0) {
            sb.append(",");
        }
        ProductPackStruct productPackStruct2 = this.LJIIJJI;
        if (productPackStruct2 != null && (list = productPackStruct2.staticSellingPoints) != null) {
            for (StaticSellingPoint staticSellingPoint : list) {
                int i4 = i + 1;
                if (i >= 0) {
                    StaticSellingPoint staticSellingPoint2 = staticSellingPoint;
                    if (i == 0) {
                        String str3 = staticSellingPoint2.buttonType;
                        if (str3 != null) {
                            sb.append(str3);
                        }
                    } else {
                        String str4 = staticSellingPoint2.buttonType;
                        if (str4 != null) {
                            sb.append(",");
                            sb.append(str4);
                        }
                    }
                    i = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        laneParams.plusAssign("selling_points", sb.toString());
    }

    public final void LIZIZ(C27943Axv c27943Axv) {
        List<StaticSellingPoint> list;
        ProductBase productBase;
        DynamicSellingPointsBase dynamicSellingPointsBase;
        List<DynamicSellingPoint> list2;
        StringBuilder sb = new StringBuilder();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ProductPackStruct productPackStruct = this.LJIIJJI;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (dynamicSellingPointsBase = productBase.dynamicSellingPointsBase) != null && (list2 = dynamicSellingPointsBase.dynamicSellingPoints) != null) {
            Iterator<DynamicSellingPoint> it = list2.iterator();
            while (it.hasNext()) {
                String str = it.next().bubbleTextType;
                if (str != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                String str2 = (String) next;
                if (i2 == 0) {
                    sb.append(str2);
                } else {
                    sb.append(",");
                    sb.append(str2);
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (linkedHashSet.size() > 0) {
            sb.append(",");
        }
        ProductPackStruct productPackStruct2 = this.LJIIJJI;
        if (productPackStruct2 != null && (list = productPackStruct2.staticSellingPoints) != null) {
            for (StaticSellingPoint staticSellingPoint : list) {
                int i4 = i + 1;
                if (i >= 0) {
                    StaticSellingPoint staticSellingPoint2 = staticSellingPoint;
                    if (i == 0) {
                        String str3 = staticSellingPoint2.buttonType;
                        if (str3 != null) {
                            sb.append(str3);
                        }
                    } else {
                        String str4 = staticSellingPoint2.buttonType;
                        if (str4 != null) {
                            sb.append(",");
                            sb.append(str4);
                        }
                    }
                    i = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        c27943Axv.LIZJ("selling_points", sb.toString());
    }

    public final void LIZJ(LaneParams laneParams) {
        Object obj;
        String str;
        FlashSale flashSale;
        Integer num = this.LJIILIIL;
        String str2 = null;
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            obj = "warm_up";
        } else if (num.intValue() == 2) {
            obj = "on_sale";
        } else {
            return;
        }
        laneParams.minus("flashsale_status", obj);
        ProductPackStruct productPackStruct = this.LJIIJJI;
        if (productPackStruct != null && (flashSale = productPackStruct.flashSale) != null) {
            str = flashSale.price;
        } else {
            str = null;
        }
        laneParams.minus("flashsale_price", str);
        if (o.LJ(obj, "warm_up")) {
            Long l = this.LJIILJJIL;
            if (l != null && l.longValue() >= 3600000) {
                Long l2 = this.LJIILJJIL;
                if (l2 != null && l2.longValue() >= 86400000) {
                    str2 = "no_countdown";
                }
                str2 = "in_24";
            }
            str2 = "in_1";
        } else if (o.LJ(obj, "on_sale")) {
            Long l3 = this.LJIILJJIL;
            if (l3 != null && l3.longValue() >= 3600000) {
                Long l4 = this.LJIILJJIL;
                if (l4 != null && l4.longValue() >= 86400000) {
                    str2 = "gt_24";
                }
                str2 = "in_24";
            }
            str2 = "in_1";
        }
        laneParams.minus("countdown_type", str2);
    }

    public final void LIZLLL(C27943Axv c27943Axv) {
        Object obj;
        String str;
        FlashSale flashSale;
        Integer num = this.LJIILIIL;
        String str2 = null;
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            obj = "warm_up";
        } else if (num.intValue() == 2) {
            obj = "on_sale";
        } else {
            return;
        }
        c27943Axv.LIZIZ("flashsale_status", obj);
        ProductPackStruct productPackStruct = this.LJIIJJI;
        if (productPackStruct != null && (flashSale = productPackStruct.flashSale) != null) {
            str = flashSale.price;
        } else {
            str = null;
        }
        c27943Axv.LIZIZ("flashsale_price", str);
        if (o.LJ(obj, "warm_up")) {
            Long l = this.LJIILJJIL;
            if (l != null && l.longValue() >= 3600000) {
                Long l2 = this.LJIILJJIL;
                if (l2 != null && l2.longValue() >= 86400000) {
                    str2 = "no_countdown";
                }
                str2 = "in_24";
            }
            str2 = "in_1";
        } else if (o.LJ(obj, "on_sale")) {
            Long l3 = this.LJIILJJIL;
            if (l3 != null && l3.longValue() >= 3600000) {
                Long l4 = this.LJIILJJIL;
                if (l4 != null && l4.longValue() >= 86400000) {
                    str2 = "gt_24";
                }
                str2 = "in_24";
            }
            str2 = "in_1";
        }
        c27943Axv.LIZIZ("countdown_type", str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0043, code lost:
    
        if (r1.length() == 0) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r5.LJIIJJI
            r4 = 0
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r0.baseInfo
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice r0 = r0.priceInfo
            if (r0 == 0) goto L65
            java.lang.String r3 = r0.originPrice
        Lf:
            if (r3 == 0) goto L18
            int r0 = r3.length()
            if (r0 != 0) goto L18
            r3 = r4
        L18:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r5.LJIIJJI
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r0.baseInfo
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice r0 = r0.priceInfo
            if (r0 == 0) goto L63
            java.lang.String r2 = r0.realPrice
            if (r2 == 0) goto L2f
            int r0 = r2.length()
            if (r0 != 0) goto L2f
            r2 = r4
        L2f:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r5.LJIIJJI
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r0.baseInfo
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice r0 = r0.priceInfo
            if (r0 == 0) goto L60
            java.lang.String r1 = r0.discount
            if (r1 == 0) goto L61
            int r0 = r1.length()
            if (r0 != 0) goto L61
        L45:
            java.lang.String r1 = ""
            if (r3 != 0) goto L4e
            if (r4 != 0) goto L4d
            if (r2 != 0) goto L5e
        L4d:
            r3 = r1
        L4e:
            java.lang.String r0 = "original_price"
            r6.plusAssign(r0, r3)
            if (r4 == 0) goto L5d
            if (r2 != 0) goto L58
            r2 = r1
        L58:
            java.lang.String r0 = "sale_price"
            r6.plusAssign(r0, r2)
        L5d:
            return
        L5e:
            r3 = r2
            goto L4e
        L60:
            r1 = r4
        L61:
            r4 = r1
            goto L45
        L63:
            r2 = r4
            goto L2f
        L65:
            r3 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70414RkI.LJII(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0043, code lost:
    
        if (r1.length() == 0) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C27943Axv r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r5.LJIIJJI
            r4 = 0
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r0.baseInfo
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice r0 = r0.priceInfo
            if (r0 == 0) goto L65
            java.lang.String r3 = r0.originPrice
        Lf:
            if (r3 == 0) goto L18
            int r0 = r3.length()
            if (r0 != 0) goto L18
            r3 = r4
        L18:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r5.LJIIJJI
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r0.baseInfo
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice r0 = r0.priceInfo
            if (r0 == 0) goto L63
            java.lang.String r2 = r0.realPrice
            if (r2 == 0) goto L2f
            int r0 = r2.length()
            if (r0 != 0) goto L2f
            r2 = r4
        L2f:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r5.LJIIJJI
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r0.baseInfo
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice r0 = r0.priceInfo
            if (r0 == 0) goto L60
            java.lang.String r1 = r0.discount
            if (r1 == 0) goto L61
            int r0 = r1.length()
            if (r0 != 0) goto L61
        L45:
            java.lang.String r1 = ""
            if (r3 != 0) goto L4e
            if (r4 != 0) goto L4d
            if (r2 != 0) goto L5e
        L4d:
            r3 = r1
        L4e:
            java.lang.String r0 = "original_price"
            r6.LIZJ(r0, r3)
            if (r4 == 0) goto L5d
            if (r2 != 0) goto L58
            r2 = r1
        L58:
            java.lang.String r0 = "sale_price"
            r6.LIZJ(r0, r2)
        L5d:
            return
        L5e:
            r3 = r2
            goto L4e
        L60:
            r1 = r4
        L61:
            r4 = r1
            goto L45
        L63:
            r2 = r4
            goto L2f
        L65:
            r3 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70414RkI.LJIIIIZZ(X.Axv):void");
    }

    public final void LJIIJJI(LaneParams laneParams) {
        int i;
        ProductDetailReview productDetailReview;
        ProductPackStruct productPackStruct;
        ProductDetailReview productDetailReview2;
        C70669RoP.LIZ.getClass();
        Float f = null;
        if (C70669RoP.LIZ().showRating && (productPackStruct = this.LJIIJJI) != null && (productDetailReview2 = productPackStruct.review) != null && productDetailReview2.rating != null) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("has_rate", Integer.valueOf(i));
        ProductPackStruct productPackStruct2 = this.LJIIJJI;
        if (productPackStruct2 != null && (productDetailReview = productPackStruct2.review) != null) {
            f = productDetailReview.rating;
        }
        if (i != 0 && f != null) {
            laneParams.plusAssign("rate", f);
        }
    }

    public final void LJIIL(C27943Axv c27943Axv) {
        int i;
        ProductDetailReview productDetailReview;
        ProductPackStruct productPackStruct;
        ProductDetailReview productDetailReview2;
        C70669RoP.LIZ.getClass();
        Float f = null;
        if (C70669RoP.LIZ().showRating && (productPackStruct = this.LJIIJJI) != null && (productDetailReview2 = productPackStruct.review) != null && productDetailReview2.rating != null) {
            i = 1;
        } else {
            i = 0;
        }
        c27943Axv.LIZJ("has_rate", Integer.valueOf(i));
        ProductPackStruct productPackStruct2 = this.LJIIJJI;
        if (productPackStruct2 != null && (productDetailReview = productPackStruct2.review) != null) {
            f = productDetailReview.rating;
        }
        if (i != 0 && f != null) {
            c27943Axv.LIZJ("rate", f);
        }
    }

    public final void LJIILIIL(LaneParams laneParams) {
        String str;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        ProductPackStruct productPackStruct = this.LJIIJJI;
        String str3 = null;
        if (productPackStruct != null) {
            str = productPackStruct.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        if (LJII != null && (obj3 = LJII.get("volume")) != null) {
            laneParams.plusAssign("volume", obj3);
        }
        ProductPackStruct productPackStruct2 = this.LJIIJJI;
        if (productPackStruct2 != null) {
            str2 = productPackStruct2.daInfo;
        } else {
            str2 = null;
        }
        HashMap<String, Object> LJII2 = C27739Aud.LJII(str2);
        if (LJII2 != null && (obj2 = LJII2.get("inherited_volume")) != null) {
            laneParams.plusAssign("inherited_volume", obj2);
        }
        ProductPackStruct productPackStruct3 = this.LJIIJJI;
        if (productPackStruct3 != null) {
            str3 = productPackStruct3.daInfo;
        }
        HashMap<String, Object> LJII3 = C27739Aud.LJII(str3);
        if (LJII3 != null && (obj = LJII3.get("volume_type")) != null) {
            laneParams.plusAssign("volume_type", obj);
        }
    }

    public final void LJIILJJIL(C27943Axv c27943Axv) {
        String str;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        ProductPackStruct productPackStruct = this.LJIIJJI;
        String str3 = null;
        if (productPackStruct != null) {
            str = productPackStruct.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        if (LJII != null && (obj3 = LJII.get("volume")) != null) {
            c27943Axv.LIZJ("volume", obj3);
        }
        ProductPackStruct productPackStruct2 = this.LJIIJJI;
        if (productPackStruct2 != null) {
            str2 = productPackStruct2.daInfo;
        } else {
            str2 = null;
        }
        HashMap<String, Object> LJII2 = C27739Aud.LJII(str2);
        if (LJII2 != null && (obj2 = LJII2.get("inherited_volume")) != null) {
            c27943Axv.LIZJ("inherited_volume", obj2);
        }
        ProductPackStruct productPackStruct3 = this.LJIIJJI;
        if (productPackStruct3 != null) {
            str3 = productPackStruct3.daInfo;
        }
        HashMap<String, Object> LJII3 = C27739Aud.LJII(str3);
        if (LJII3 != null && (obj = LJII3.get("volume_type")) != null) {
            c27943Axv.LIZJ("volume_type", obj);
        }
    }

    public final void LJIJJLI(java.util.Map<String, ? extends Object> map) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70935Rsh(1), new AqS135S0200000_4(this, (C70414RkI) map, (java.util.Map<String, ? extends Object>) 299));
        } else {
            C76542zS.LJ("tiktokec_add_on_entrance_click", new AqS135S0200000_4(this, (C70414RkI) map, (java.util.Map<String, ? extends Object>) 301));
        }
    }

    public final void LJIL(java.util.Map<String, ? extends Object> map) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70918RsQ(1), new AqS135S0200000_4(this, (C70414RkI) map, (java.util.Map<String, ? extends Object>) 302));
        } else {
            C76542zS.LJ("tiktokec_add_on_entrance_show", new AqS135S0200000_4(this, (C70414RkI) map, (java.util.Map<String, ? extends Object>) 303));
        }
    }

    public final void LJJII(boolean z) {
        String str;
        if (C26847AgF.LIZ()) {
            C70015Rdr c70015Rdr = new C70015Rdr("tiktokec_popup_click");
            if (z) {
                str = "to_affiliate_product";
            } else {
                str = "close";
            }
            c70015Rdr.LIZIZ.put("action_type", str);
            ConcurrentHashMap<String, Object> commonParams = this.LIZIZ;
            o.LJIIIZ(commonParams, "commonParams");
            c70015Rdr.LIZIZ.putAll(commonParams);
            c70015Rdr.LIZIZ();
            return;
        }
        C78946Uyc.LJJII(LJIJI(), new C70886Rru(), new AqS54S0110000_12(z, this, 19));
    }

    public final void LJJIIZI(List<Voucher> list) {
        C70438Rkg LIZLLL = C70437Rkf.LIZLLL(Boolean.FALSE, list);
        C70424RkS c70424RkS = new C70424RkS();
        c70424RkS.LIZLLL(this.LIZIZ);
        String str = LIZLLL.LJLILLLLZI;
        if (str == null || str.length() == 0) {
            c70424RkS.LJ(0);
        } else {
            Integer num = null;
            C70437Rkf.LJ(LIZLLL, c70424RkS, null);
            if (list != null) {
                num = Integer.valueOf(list.size());
            }
            c70424RkS.LJ(num);
        }
        c70424RkS.LIZIZ();
    }

    public final void LJJIJIL(HashMap hashMap) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70917RsP(), new AqS53S1200000_12(this, hashMap, 23));
        } else {
            C76542zS.LJ("tiktokec_button_click", new AqS53S1200000_12(this, hashMap, 24));
        }
    }

    public final void LJJIJL(HashMap hashMap) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70918RsQ(0), new AqS53S1200000_12(this, hashMap, 25));
        } else {
            C76542zS.LJ("tiktokec_button_show", new AqS53S1200000_12(this, hashMap, 26));
        }
    }

    public final void LJJIZ(String str) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70986RtW(), new AqS65S1100000_12(this, str, 20));
        } else {
            new C70420RkO(str).LIZJ(this.LIZIZ);
        }
    }

    public final void LJJJ(ProductDetailReview productDetailReview) {
        if (!this.LJJIIZ) {
            this.LJJIIZ = true;
            if (C26847AgF.LIZ()) {
                C78946Uyc.LJJII(LJIJI(), new C70920RsS(), new AqS135S0200000_4(this, productDetailReview, 304));
            } else {
                C76542zS.LJ("tiktokec_module_show", new AqS135S0200000_4(this, productDetailReview, 305));
            }
        }
    }

    public final void LJJJJJL(EnumC61929OSf type) {
        o.LJIIIZ(type, "type");
        C78946Uyc.LJJII(LJIJI(), new C70906RsE(), new AqS143S0200000_12(this, type, 157));
    }

    public final void LJJJJLL(java.util.Map<String, ? extends Object> map) {
        if (!this.LJJIIJZLJL) {
            this.LJJIIJZLJL = true;
            if (C26847AgF.LIZ()) {
                C78946Uyc.LJJII(LJIJI(), new C70920RsS(), new AqS135S0200000_4(this, (C70414RkI) map, (java.util.Map<String, ? extends Object>) 306));
            } else {
                C76542zS.LJ("tiktokec_module_show", new AqS135S0200000_4(this, (C70414RkI) map, (java.util.Map<String, ? extends Object>) 307));
            }
        }
    }

    public final void LJJJLL(java.util.Map<String, ? extends Object> map) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70886Rru(), new AqS176S0100000_10(map, (java.util.Map<String, ? extends Object>) 254));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "product_detail");
        linkedHashMap.put("popup_name", "server");
        linkedHashMap.put("action_type", "retry");
        linkedHashMap.put("error_code", "10007209");
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C76542zS.LIZLLL("tiktokec_popup_click", linkedHashMap);
    }

    public final void LJJJLZIJ(java.util.Map<String, ? extends Object> map) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70891Rrz(), new AqS176S0100000_10(map, (java.util.Map<String, ? extends Object>) 255));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "product_detail");
        linkedHashMap.put("popup_name", "server");
        linkedHashMap.put("error_code", "10007209");
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C76542zS.LIZLLL("tiktokec_popup_show", linkedHashMap);
    }

    public final void LJJJZ(int i) {
        C78946Uyc.LJJII(LJIJI(), new C70898Rs6(), new C27537ArN(this.LIZIZ.get("click_product_start_time"), SystemClock.elapsedRealtime(), i, this));
    }

    public final void LJJLI(Object any) {
        o.LJIIIZ(any, "any");
        if (!this.LJJIJIIJI) {
            this.LJJIJIIJI = true;
            if (C26847AgF.LIZ()) {
                C78946Uyc.LJJII(LJIJI(), new C70920RsS(), new AqS135S0200000_4(this, any, 298));
            } else {
                C76542zS.LJ("tiktokec_module_show", new AqS135S0200000_4(this, any, 300));
            }
        }
    }

    public final void LJJLIIIJ(long j) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70979RtP(), new AqS33S0100100_12(this, j, 5));
        } else {
            new C70111RfP(j).LIZJ(this.LIZIZ);
        }
    }

    public final void LJJLIIIJILLIZJL(long j) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70977RtN(), new AqS33S0100100_12(this, j, 6));
        } else {
            new C70110RfO(j).LIZJ(this.LIZIZ);
        }
    }

    public final void LJJLIIIJJI(PdpViewModel vm) {
        VoucherInfo voucherInfo;
        List<Voucher> vouchers;
        boolean z;
        Object obj;
        Boolean bool;
        o.LJIIIZ(vm, "vm");
        ProductPackStruct productPackStruct = vm.LJLJLLL;
        if (productPackStruct != null && o.LJ(productPackStruct.promotionReform, Boolean.TRUE)) {
            ProductPackStruct productPackStruct2 = vm.LJLJLLL;
            if (productPackStruct2 != null && (bool = productPackStruct2.withCoupon) != null) {
                z = bool.booleanValue();
            }
            z = false;
        } else {
            ProductPackStruct productPackStruct3 = vm.LJLJLLL;
            if (productPackStruct3 != null && (voucherInfo = productPackStruct3.voucherInfo) != null && (vouchers = voucherInfo.getVouchers()) != null && vouchers.size() > 0) {
                z = true;
            }
            z = false;
        }
        boolean z2 = vm.LJLJL;
        if (this.LJIJI) {
            Object obj2 = this.LIZIZ.get("click_product_start_time");
            if (obj2 == null) {
                obj2 = -1L;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String LIZIZ = PII.LIZIZ();
            this.LJIIJ = EnumC70104RfI.LOG_SHOW;
            if (C26847AgF.LIZ()) {
                C78946Uyc.LJJII(LJIJI(), new C70915RsN(), new AqS0S1220100_12(this, z2, obj2, elapsedRealtime, LIZIZ, z, 0));
            } else {
                C76542zS.LJ("tiktokec_enter_product_detail", new AqS0S1220100_12(this, z2, obj2, elapsedRealtime, LIZIZ, z, 1));
            }
        }
        C76542zS.LIZJ("ViewContent", new AqS170S0100000_4(this, 1556));
        HashMap<String, Object> trackParams = this.LIZ.getTrackParams();
        if (trackParams != null) {
            obj = trackParams.get("entrance_form");
        } else {
            obj = null;
        }
        this.LIZJ.put("entrance_form", String.valueOf(obj));
        this.LIZJ.put("total_duration", Long.valueOf(SystemClock.elapsedRealtime() - this.LJIIZILJ));
        new AbstractC69312nn(this.LIZJ) { // from class: X.2np
            public final LinkedHashMap<String, Object> LIZJ;

            @Override // X.AbstractC69312nn
            public final HashMap<String, Object> LIZ() {
                return this.LIZJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("rd_tiktokec_pdp_link_event");
                o.LJIIIZ(link, "link");
                this.LIZJ = link;
            }
        }.LIZIZ();
    }

    public final void LJJLIIIJLJLI(LaneParams laneParams) {
        LogisticDTO logisticDTO;
        Integer num;
        o.LJIIIZ(laneParams, "<this>");
        laneParams.plusAssign("previous_page", "product_detail");
        int i = 0;
        laneParams.plusAssign("is_fullscreen", 0);
        Boolean bool = this.LJJI;
        if (bool != null) {
            laneParams.plusAssign("is_address_deliverable", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ProductPackStruct productPackStruct = this.LJIIJJI;
        if (productPackStruct != null && (logisticDTO = productPackStruct.logistic) != null && (num = logisticDTO.deliveryOption) != null) {
            i = num.intValue();
        }
        laneParams.plusAssign("delivery_option", Integer.valueOf(i));
    }

    public final void LJJLIIIJLLLLLLLZ(String str) {
        if (str == null) {
            this.LJIJJ = 0;
        } else {
            this.LJIJJ = 1;
            this.LJI.add(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIL(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r15) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70414RkI.LJJLIL(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct):void");
    }

    public final void LJJLJ(boolean z) {
        String str;
        this.LJIILL = z;
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LIZIZ;
        if (z) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        concurrentHashMap.put("page_show_type", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C70414RkI(android.content.Context r10, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r11) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70414RkI.<init>(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam):void");
    }

    public static void LJ(C27943Axv c27943Axv, ProductDetailReview productDetailReview) {
        List<ReviewFilterStruct> list;
        if (productDetailReview != null && (list = productDetailReview.reviewFilters) != null) {
            if (C26694Adm.LIZ()) {
                int size = list.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    Integer num = ((ReviewFilterStruct) ListProtector.get(list, i2)).type;
                    if (num != null && num.intValue() == 3) {
                        i++;
                    }
                }
                c27943Axv.LIZJ("impression_tag_cnt", Integer.valueOf(i));
                return;
            }
            c27943Axv.LIZJ("impression_tag_cnt", 0);
        }
    }

    public static void LJIIIZ(LaneParams laneParams, PromotionEntrance promotionEntrance) {
        String str;
        HashMap<String, Object> LJII;
        LinkedHashMap LIZ = C0JU.LIZ("module_name", "promotion");
        if (promotionEntrance != null && (str = promotionEntrance.daInfo) != null && (LJII = C27739Aud.LJII(str)) != null) {
            Object obj = LJII.get("campaign_id");
            if (obj != null) {
                LIZ.put("campaign_id", obj);
            }
            Object obj2 = LJII.get("campaign_type");
            if (obj2 != null) {
                LIZ.put("campaign_type", obj2);
            }
            Object obj3 = LJII.get("campaign_user_tag");
            if (obj3 != null) {
                LIZ.put("campaign_user_tag", obj3);
            }
            Object obj4 = LJII.get("campaign_channel");
            if (obj4 != null) {
                LIZ.put("campaign_channel", obj4);
            }
            Object obj5 = LJII.get("campaign_cost_role");
            if (obj5 != null) {
                LIZ.put("campaign_cost_role", obj5);
            }
        }
        laneParams.compareTo(laneParams, LIZ);
    }

    public static void LJIILL(C27943Axv c27943Axv, ShopReviewEntry shopReviewEntry) {
        List<ReviewFilterStruct> list;
        Integer num;
        if (shopReviewEntry != null && (list = shopReviewEntry.reviewFilters) != null) {
            if (C26694Adm.LIZ()) {
                int size = list.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) ListProtector.get(list, i2);
                    if (reviewFilterStruct != null && (num = reviewFilterStruct.type) != null && num.intValue() == 3) {
                        i++;
                    }
                }
                c27943Axv.LIZJ("impression_tag_cnt", Integer.valueOf(i));
                return;
            }
            c27943Axv.LIZJ("impression_tag_cnt", 0);
        }
    }

    public static void LJIILLIIL(LaneParams laneParams, ProductDetailReview productDetailReview) {
        Float f;
        int i;
        int i2;
        int i3;
        Integer num;
        int i4;
        int i5;
        int i6;
        int i7;
        ReviewItemStruct.AppendReview appendReview;
        List<ReviewMedia> list;
        List<ReviewMedia> list2;
        ReviewItemStruct.AppendReview appendReview2;
        List<ReviewMedia> list3;
        List<ReviewMedia> list4;
        if (productDetailReview != null) {
            f = productDetailReview.rating;
        } else {
            f = null;
        }
        int i8 = 0;
        if (f == null) {
            i = 0;
        } else {
            i = 1;
        }
        laneParams.plusAssign("has_rate", Integer.valueOf(i));
        if (productDetailReview != null) {
            Float f2 = productDetailReview.rating;
            if (f2 != null) {
                laneParams.plusAssign("rate", Float.valueOf(f2.floatValue()));
            }
            List<ReviewItemStruct> list5 = productDetailReview.reviewItems;
            if (list5 != null) {
                i2 = 0;
                i3 = 0;
                for (ReviewItemStruct reviewItemStruct : list5) {
                    ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
                    if (mainReview != null && (list4 = mainReview.media) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ReviewMedia reviewMedia : list4) {
                            Integer num2 = reviewMedia.mediaType;
                            if (num2 != null && num2.intValue() == 1) {
                                arrayList.add(reviewMedia);
                            }
                        }
                        i4 = arrayList.size();
                    } else {
                        i4 = 0;
                    }
                    int i9 = i2 + i4;
                    ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
                    if (mainReview2 != null && (appendReview2 = mainReview2.appendReview) != null && (list3 = appendReview2.media) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (ReviewMedia reviewMedia2 : list3) {
                            Integer num3 = reviewMedia2.mediaType;
                            if (num3 != null && num3.intValue() == 1) {
                                arrayList2.add(reviewMedia2);
                            }
                        }
                        i5 = arrayList2.size();
                    } else {
                        i5 = 0;
                    }
                    i2 = i9 + i5;
                    ReviewItemStruct.MainReview mainReview3 = reviewItemStruct.review;
                    if (mainReview3 != null && (list2 = mainReview3.media) != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (ReviewMedia reviewMedia3 : list2) {
                            Integer num4 = reviewMedia3.mediaType;
                            if (num4 != null && num4.intValue() == 2) {
                                arrayList3.add(reviewMedia3);
                            }
                        }
                        i6 = arrayList3.size();
                    } else {
                        i6 = 0;
                    }
                    int i10 = i3 + i6;
                    ReviewItemStruct.MainReview mainReview4 = reviewItemStruct.review;
                    if (mainReview4 != null && (appendReview = mainReview4.appendReview) != null && (list = appendReview.media) != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (ReviewMedia reviewMedia4 : list) {
                            Integer num5 = reviewMedia4.mediaType;
                            if (num5 != null && num5.intValue() == 2) {
                                arrayList4.add(reviewMedia4);
                            }
                        }
                        i7 = arrayList4.size();
                    } else {
                        i7 = 0;
                    }
                    i3 = i10 + i7;
                }
                laneParams.plusAssign("photo_cnt", Integer.valueOf(i2));
                laneParams.plusAssign("video_cnt", Integer.valueOf(i3));
                if (productDetailReview != null && (num = productDetailReview.reviewCount) != null) {
                    i8 = num.intValue();
                }
                laneParams.plusAssign("review_cnt", Integer.valueOf(i8));
            }
        }
        i2 = 0;
        i3 = 0;
        laneParams.plusAssign("photo_cnt", Integer.valueOf(i2));
        laneParams.plusAssign("video_cnt", Integer.valueOf(i3));
        if (productDetailReview != null) {
            i8 = num.intValue();
        }
        laneParams.plusAssign("review_cnt", Integer.valueOf(i8));
    }

    public static void LJIIZILJ(C27943Axv c27943Axv, ProductDetailReview productDetailReview) {
        Float f;
        int i;
        int i2;
        int i3;
        Integer num;
        int i4;
        int i5;
        int i6;
        int i7;
        ReviewItemStruct.AppendReview appendReview;
        List<ReviewMedia> list;
        List<ReviewMedia> list2;
        ReviewItemStruct.AppendReview appendReview2;
        List<ReviewMedia> list3;
        List<ReviewMedia> list4;
        if (productDetailReview != null) {
            f = productDetailReview.rating;
        } else {
            f = null;
        }
        int i8 = 0;
        if (f == null) {
            i = 0;
        } else {
            i = 1;
        }
        c27943Axv.LIZJ("has_rate", Integer.valueOf(i));
        if (productDetailReview != null) {
            Float f2 = productDetailReview.rating;
            if (f2 != null) {
                c27943Axv.LIZJ("rate", Float.valueOf(f2.floatValue()));
            }
            List<ReviewItemStruct> list5 = productDetailReview.reviewItems;
            if (list5 != null) {
                i2 = 0;
                i3 = 0;
                for (ReviewItemStruct reviewItemStruct : list5) {
                    ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
                    if (mainReview != null && (list4 = mainReview.media) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ReviewMedia reviewMedia : list4) {
                            Integer num2 = reviewMedia.mediaType;
                            if (num2 != null && num2.intValue() == 1) {
                                arrayList.add(reviewMedia);
                            }
                        }
                        i4 = arrayList.size();
                    } else {
                        i4 = 0;
                    }
                    int i9 = i2 + i4;
                    ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
                    if (mainReview2 != null && (appendReview2 = mainReview2.appendReview) != null && (list3 = appendReview2.media) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (ReviewMedia reviewMedia2 : list3) {
                            Integer num3 = reviewMedia2.mediaType;
                            if (num3 != null && num3.intValue() == 1) {
                                arrayList2.add(reviewMedia2);
                            }
                        }
                        i5 = arrayList2.size();
                    } else {
                        i5 = 0;
                    }
                    i2 = i9 + i5;
                    ReviewItemStruct.MainReview mainReview3 = reviewItemStruct.review;
                    if (mainReview3 != null && (list2 = mainReview3.media) != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (ReviewMedia reviewMedia3 : list2) {
                            Integer num4 = reviewMedia3.mediaType;
                            if (num4 != null && num4.intValue() == 2) {
                                arrayList3.add(reviewMedia3);
                            }
                        }
                        i6 = arrayList3.size();
                    } else {
                        i6 = 0;
                    }
                    int i10 = i3 + i6;
                    ReviewItemStruct.MainReview mainReview4 = reviewItemStruct.review;
                    if (mainReview4 != null && (appendReview = mainReview4.appendReview) != null && (list = appendReview.media) != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (ReviewMedia reviewMedia4 : list) {
                            Integer num5 = reviewMedia4.mediaType;
                            if (num5 != null && num5.intValue() == 2) {
                                arrayList4.add(reviewMedia4);
                            }
                        }
                        i7 = arrayList4.size();
                    } else {
                        i7 = 0;
                    }
                    i3 = i10 + i7;
                }
                c27943Axv.LIZJ("photo_cnt", Integer.valueOf(i2));
                c27943Axv.LIZJ("video_cnt", Integer.valueOf(i3));
                if (productDetailReview != null && (num = productDetailReview.reviewCount) != null) {
                    i8 = num.intValue();
                }
                c27943Axv.LIZJ("review_cnt", Integer.valueOf(i8));
            }
        }
        i2 = 0;
        i3 = 0;
        c27943Axv.LIZJ("photo_cnt", Integer.valueOf(i2));
        c27943Axv.LIZJ("video_cnt", Integer.valueOf(i3));
        if (productDetailReview != null) {
            i8 = num.intValue();
        }
        c27943Axv.LIZJ("review_cnt", Integer.valueOf(i8));
    }

    public final void LJFF(LaneParams laneParams, ProductDetailReview productDetailReview) {
        int i;
        List<ReviewItemStruct> list;
        int i2;
        List<ReviewMedia> list2;
        ReviewMedia reviewMedia;
        Integer num;
        List<ReviewMedia> list3;
        ReviewMedia reviewMedia2;
        Integer num2;
        List<ReviewMedia> list4;
        if (LJIJJ()) {
            laneParams.plusAssign("photo_cnt", 4);
            return;
        }
        int i3 = 0;
        if (productDetailReview != null && (list = productDetailReview.reviewItems) != null) {
            i3 = 0;
            i = 0;
            for (ReviewItemStruct reviewItemStruct : list) {
                ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
                if (mainReview != null && (list4 = mainReview.media) != null) {
                    i2 = list4.size();
                } else {
                    i2 = 0;
                }
                int min = Math.min(i2, 4);
                for (int i4 = 0; i4 < min; i4++) {
                    ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
                    if (mainReview2 == null || (list3 = mainReview2.media) == null || (reviewMedia2 = (ReviewMedia) ListProtector.get(list3, i4)) == null || (num2 = reviewMedia2.mediaType) == null || num2.intValue() != 2) {
                        ReviewItemStruct.MainReview mainReview3 = reviewItemStruct.review;
                        if (mainReview3 != null && (list2 = mainReview3.media) != null && (reviewMedia = (ReviewMedia) ListProtector.get(list2, i4)) != null && (num = reviewMedia.mediaType) != null && num.intValue() == 1) {
                            i3++;
                        }
                    } else {
                        i++;
                    }
                }
            }
        } else {
            i = 0;
        }
        laneParams.plusAssign("photo_cnt", Integer.valueOf(i3));
        laneParams.plusAssign("video_cnt", Integer.valueOf(i));
    }

    public final void LJI(C27943Axv c27943Axv, ProductDetailReview productDetailReview) {
        int i;
        List<ReviewItemStruct> list;
        int i2;
        List<ReviewMedia> list2;
        ReviewMedia reviewMedia;
        Integer num;
        List<ReviewMedia> list3;
        ReviewMedia reviewMedia2;
        Integer num2;
        List<ReviewMedia> list4;
        if (LJIJJ()) {
            c27943Axv.LIZJ("photo_cnt", 4);
            return;
        }
        int i3 = 0;
        if (productDetailReview != null && (list = productDetailReview.reviewItems) != null) {
            i3 = 0;
            i = 0;
            for (ReviewItemStruct reviewItemStruct : list) {
                ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
                if (mainReview != null && (list4 = mainReview.media) != null) {
                    i2 = list4.size();
                } else {
                    i2 = 0;
                }
                int min = Math.min(i2, 4);
                for (int i4 = 0; i4 < min; i4++) {
                    ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
                    if (mainReview2 == null || (list3 = mainReview2.media) == null || (reviewMedia2 = (ReviewMedia) ListProtector.get(list3, i4)) == null || (num2 = reviewMedia2.mediaType) == null || num2.intValue() != 2) {
                        ReviewItemStruct.MainReview mainReview3 = reviewItemStruct.review;
                        if (mainReview3 != null && (list2 = mainReview3.media) != null && (reviewMedia = (ReviewMedia) ListProtector.get(list2, i4)) != null && (num = reviewMedia.mediaType) != null && num.intValue() == 1) {
                            i3++;
                        }
                    } else {
                        i++;
                    }
                }
            }
        } else {
            i = 0;
        }
        c27943Axv.LIZJ("photo_cnt", Integer.valueOf(i3));
        c27943Axv.LIZJ("video_cnt", Integer.valueOf(i));
    }

    public final void LJIIJ(C27943Axv c27943Axv, PromotionEntrance promotionEntrance) {
        String str;
        HashMap<String, Object> LJII;
        LinkedHashMap LIZ = C0JU.LIZ("module_name", "promotion");
        LIZ.putAll(this.LIZIZ);
        if (promotionEntrance != null && (str = promotionEntrance.daInfo) != null && (LJII = C27739Aud.LJII(str)) != null) {
            Object obj = LJII.get("campaign_id");
            if (obj != null) {
                LIZ.put("campaign_id", obj);
            }
            Object obj2 = LJII.get("campaign_type");
            if (obj2 != null) {
                LIZ.put("campaign_type", obj2);
            }
            Object obj3 = LJII.get("campaign_user_tag");
            if (obj3 != null) {
                LIZ.put("campaign_user_tag", obj3);
            }
            Object obj4 = LJII.get("campaign_channel");
            if (obj4 != null) {
                LIZ.put("campaign_channel", obj4);
            }
            Object obj5 = LJII.get("campaign_cost_role");
            if (obj5 != null) {
                LIZ.put("campaign_cost_role", obj5);
            }
        }
        c27943Axv.getClass();
        C27943Axv.LIZ(c27943Axv, LIZ);
    }

    public final void LJJI(String name, HashMap<String, Object> hashMap) {
        o.LJIIIZ(name, "name");
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70917RsP(), new AqS47S1200000_4(this, (C70414RkI) name, (String) hashMap, (HashMap<String, Object>) 34));
        } else {
            C76542zS.LJ("tiktokec_button_click", new AqS47S1200000_4(this, (C70414RkI) name, (String) hashMap, (HashMap<String, Object>) 35));
        }
    }

    public final void LJJIFFI(String name, HashMap<String, Object> hashMap) {
        o.LJIIIZ(name, "name");
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70918RsQ(0), new AqS47S1200000_4(this, (C70414RkI) name, (String) hashMap, (HashMap<String, Object>) 36));
        } else {
            C76542zS.LJ("tiktokec_button_show", new AqS47S1200000_4(this, (C70414RkI) name, (String) hashMap, (HashMap<String, Object>) 37));
        }
    }

    public final void LJJIII(Voucher voucher, int i) {
        o.LJIIIZ(voucher, "voucher");
        HashSet<String> hashSet = this.LJJJIL;
        String voucherTypeID = voucher.getVoucherTypeID();
        String str = "";
        if (voucherTypeID == null) {
            voucherTypeID = "";
        }
        if (!hashSet.contains(voucherTypeID)) {
            HashSet<String> hashSet2 = this.LJJJIL;
            String voucherTypeID2 = voucher.getVoucherTypeID();
            if (voucherTypeID2 != null) {
                str = voucherTypeID2;
            }
            hashSet2.add(str);
            C70434Rkc c70434Rkc = new C70434Rkc();
            C70437Rkf.LJ(C70437Rkf.LIZJ(voucher, Boolean.FALSE), c70434Rkc, this.LIZIZ);
            c70434Rkc.LIZIZ.put("coupon_zone", "discounts_module");
            c70434Rkc.LIZIZ.put("button_type", "use_coupon");
            c70434Rkc.LIZIZ.put("button_name", "use");
            c70434Rkc.LJFF(Integer.valueOf(i));
            c70434Rkc.LIZIZ();
        }
    }

    public final void LJJIJLIJ(String str, boolean z) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70974RtK(), new AqS12S1110000_12(this, z, str, 4));
        } else {
            C76542zS.LJ("tiktokec_remind_result", new AqS12S1110000_12(this, z, str, 5));
        }
    }

    public final void LJJJJIZL(String str, String photoType) {
        o.LJIIIZ(photoType, "photoType");
        if (str == null) {
            return;
        }
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70978RtO(), new AqS19S2100000_12(this, str, photoType, 8));
        } else {
            new C70417RkL(str, photoType).LIZJ(this.LIZIZ);
        }
        this.LJIIIIZZ = true;
    }

    public final void LJJJJL(Boolean bool, String str) {
        new C70017Rdt(str, bool).LIZJ(this.LIZIZ);
        if (o.LJ(str, "logistics")) {
            return;
        }
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70922RsU(), new AqS58S1100000_4(this, str, 50));
        } else {
            C76542zS.LJ("tiktokec_enter_page", new AqS58S1100000_4(this, str, 51));
        }
    }

    public final void LJJL(ReviewItemStruct reviewItemStruct, String str) {
        o.LJIIIZ(reviewItemStruct, "reviewItemStruct");
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70946Rss(), new AqS53S1200000_12(this, reviewItemStruct, str, 27));
        } else {
            C76542zS.LJ("tiktokec_review_click", new AqS53S1200000_12(this, reviewItemStruct, str, 28));
        }
    }

    public final void LJJLIIJ(int i, String str) {
        this.LIZJ.put(str, Integer.valueOf(i));
    }

    public static void LJJ(PdpFragment fragment, C69643RUx platformPromotion, String str) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(platformPromotion, "platformPromotion");
        C78946Uyc.LJJII(fragment, new C70919RsR(), new AqS65S1100000_12(platformPromotion, str, 19));
    }

    public final void LJJIIJ(int i, Voucher voucher, String str) {
        o.LJIIIZ(voucher, "voucher");
        C78946Uyc.LJJII(LJIJI(), new C70967RtD(), new AqS12S1201000_12(this, voucher, str, i, 4));
    }

    public final void LJJIIZ(int i, Voucher voucher, String isCouponUse) {
        o.LJIIIZ(voucher, "voucher");
        o.LJIIIZ(isCouponUse, "isCouponUse");
        HashSet<String> hashSet = this.LJJJI;
        String voucherTypeID = voucher.getVoucherTypeID();
        String str = "";
        if (voucherTypeID == null) {
            voucherTypeID = "";
        }
        if (!hashSet.contains(voucherTypeID)) {
            HashSet<String> hashSet2 = this.LJJJI;
            String voucherTypeID2 = voucher.getVoucherTypeID();
            if (voucherTypeID2 != null) {
                str = voucherTypeID2;
            }
            hashSet2.add(str);
            C70427RkV c70427RkV = new C70427RkV();
            C70437Rkf.LJ(C70437Rkf.LIZJ(voucher, Boolean.FALSE), c70427RkV, this.LIZIZ);
            c70427RkV.LIZIZ.put("is_coupon_available", isCouponUse);
            c70427RkV.LIZIZ.put("coupon_zone", "discounts_module");
            c70427RkV.LJFF(Integer.valueOf(i));
            c70427RkV.LIZIZ();
        }
    }

    public final void LJJIJIIJI(int i, ReviewFilterStruct reviewFilterStruct, String str) {
        C78946Uyc.LJJII(LJIJI(), new C70938Rsk(), new AqS8S1201000_4(this, i, reviewFilterStruct, str, 1));
    }

    public final void LJJIJIIJIL(int i, ReviewFilterStruct reviewFilterStruct, String str) {
        String str2;
        String str3;
        java.util.Set<String> set = this.LJJIFFI;
        if (reviewFilterStruct != null) {
            str2 = reviewFilterStruct.filterId;
        } else {
            str2 = null;
        }
        if (!ORZ.LJLJJI(str2, set)) {
            if (reviewFilterStruct != null && (str3 = reviewFilterStruct.filterId) != null) {
                this.LJJIFFI.add(str3);
            }
            C76542zS.LJ("tiktokec_filter_name_show", new AqS8S1201000_4(this, i, reviewFilterStruct, str, 2));
        }
    }

    public final void LJJJJZ(int i, String str, String str2) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70945Rsr(1), new C70418RkM(this, str2, str, i));
            return;
        }
        if (str == null) {
            str = "";
        }
        new C70419RkN(str, i, str2).LIZJ(this.LIZIZ);
    }

    public final void LJJJJZI(int i, String str, String str2) {
        C78946Uyc.LJJII(LJIJI(), new C70985RtV(), new AqS4S2101000_4(this, str2, str, i, 1));
    }

    public final void LJJLIIIJL(PdpViewModel vm, boolean z, boolean z2) {
        String str;
        o.LJIIIZ(vm, "vm");
        if (!this.LJIJI) {
            this.LJIJI = true;
            this.LJIIJ = EnumC70104RfI.LOG_SHOW;
            SystemClock.elapsedRealtime();
            boolean z3 = vm.LJLJL;
            int i = vm.LLFFF;
            int i2 = vm.LJLLLLLL;
            Object obj = this.LIZIZ.get("click_product_start_time");
            long j = -1;
            Object obj2 = -1L;
            if (obj == null) {
                obj = obj2;
            }
            Object obj3 = this.LIZIZ.get("click_scene_start_time");
            if (obj3 != null) {
                obj2 = obj3;
            }
            AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(obj, 1554);
            AqS170S0100000_4 aqS170S0100000_42 = new AqS170S0100000_4(obj2, 1555);
            boolean z4 = this.LJIJ;
            Object obj4 = this.LIZ.getRequestParams().get("template");
            if (!(obj4 instanceof String) || (str = (String) obj4) == null) {
                str = "tt_pdp_full";
            }
            long longValue = ((Number) aqS170S0100000_4.invoke(Long.valueOf(SystemClock.elapsedRealtime()))).longValue();
            long j2 = this.LJIJJLI;
            if (j2 != -1) {
                j = SystemClock.elapsedRealtime() - j2;
            }
            int i3 = this.LJIJJ;
            boolean z5 = LJJJJI;
            LJJJJI = false;
            new KSY(z3, z4, i, str, i2, longValue, j, i3, z5, ((Number) aqS170S0100000_42.invoke(Long.valueOf(SystemClock.elapsedRealtime()))).longValue(), z2, z, this.LJJII).LIZJ(this.LIZIZ);
            LJJJZ(1);
        }
    }

    public final void LJJJJJ(String str, String str2, String str3, boolean z) {
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(LJIJI(), new C70976RtM(), new AqS0S3110000_12(this, str, z, str2, str3, 1));
        } else {
            new C70416RkK(str, str2, str3, z).LIZJ(this.LIZIZ);
        }
    }

    public final void LJJJJLI(String pageName, long j, String quitType, java.util.Map<String, ? extends Object> map) {
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(quitType, "quitType");
        C78946Uyc.LJJII(LJIJI(), new C70921RsT(), new AqS0S2200100_4(this, (C70414RkI) map, (java.util.Map<String, ? extends Object>) pageName, (String) j, (long) quitType, (String) 2));
    }

    public static void LJJIJ(C70414RkI c70414RkI, String str, Boolean bool, String str2, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70981RtR(), new AqS13S2200000_12(c70414RkI, str, bool, str2, 2));
    }

    public final void LJJIIJZLJL(Voucher voucher, int i, String reason, int i2, Boolean bool) {
        o.LJIIIZ(voucher, "voucher");
        o.LJIIIZ(reason, "reason");
        C70426RkU c70426RkU = new C70426RkU();
        C70437Rkf.LJ(C70437Rkf.LIZJ(voucher, bool), c70426RkU, this.LIZIZ);
        c70426RkU.LIZIZ.put("coupon_zone", "discounts_module");
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            valueOf.intValue();
            c70426RkU.LIZIZ.put("is_success", valueOf);
        }
        c70426RkU.LIZIZ.put("fail_reason", reason);
        c70426RkU.LJFF(Integer.valueOf(i2));
        c70426RkU.LIZIZ();
    }

    public final void LJJJI(String moduleName, InterfaceC26837Ag5 interfaceC26837Ag5, String str, java.util.Map<String, ? extends Object> params, String str2) {
        o.LJIIIZ(moduleName, "moduleName");
        o.LJIIIZ(params, "params");
        C76542zS.LJ("tiktokec_module_click", new C27126Akk(this, params, moduleName, interfaceC26837Ag5, str2, str));
    }

    public final void LJJJJ(String moduleName, boolean z, InterfaceC26837Ag5 interfaceC26837Ag5, java.util.Map params, String str) {
        o.LJIIIZ(moduleName, "moduleName");
        o.LJIIIZ(params, "params");
        if (o.LJ(moduleName, "user_rights")) {
            return;
        }
        if (z || !this.LJJIII.contains(moduleName)) {
            C76542zS.LJ("tiktokec_module_show", new AqS3S2300000_4(this, (C70414RkI) params, (java.util.Map<String, ? extends Object>) moduleName, (String) interfaceC26837Ag5, (InterfaceC26837Ag5) str, (String) 2));
        }
        this.LJJIII.add(moduleName);
    }

    public final void LJJJLIIL(int i, Boolean bool, String str, String str2, String str3) {
        if (!this.LJJIJL.contains(str2)) {
            this.LJJIJL.add(str2);
            if (C26847AgF.LIZ()) {
                C78946Uyc.LJJII(LJIJI(), new C70940Rsm(), new AqS0S3201000_12(this, str2, i, str, bool, str3, 2));
            } else {
                C76542zS.LJ("tiktokec_photo_show", new AqS0S3201000_12(this, str2, i, str, bool, str3, 3));
            }
        }
    }

    public static /* synthetic */ void LJJJIL(C70414RkI c70414RkI, String str, InterfaceC26837Ag5 interfaceC26837Ag5, String str2, java.util.Map map, int i) {
        java.util.Map map2 = map;
        InterfaceC26837Ag5 interfaceC26837Ag52 = interfaceC26837Ag5;
        String str3 = str2;
        if ((i & 2) != 0) {
            interfaceC26837Ag52 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map2 = C113554cx.LJJJLIIL();
        }
        c70414RkI.LJJJI(str, interfaceC26837Ag52, str3, map2, null);
    }

    public static void LJJIL(C70414RkI c70414RkI, String str, Boolean bool, Boolean bool2, String str2, Integer num, int i) {
        Integer num2 = num;
        String str3 = str2;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        if ((i & 2) != 0) {
            bool3 = null;
        }
        if ((i & 4) != 0) {
            bool4 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if (C26847AgF.LIZ()) {
            C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70973RtJ(), new AqS1S2400000_12(c70414RkI, str, bool3, bool4, str3, num2, 2));
        } else {
            new C70415RkJ(bool3, bool4, num2, str, str3).LIZJ(c70414RkI.LIZIZ);
        }
        c70414RkI.LJIIIZ.add(str);
    }

    public static /* synthetic */ void LJJJJI(C70414RkI c70414RkI, String str, boolean z, boolean z2, C27127Akl c27127Akl, java.util.Map map, int i) {
        java.util.Map map2 = map;
        boolean z3 = z2;
        C27127Akl c27127Akl2 = c27127Akl;
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            c27127Akl2 = null;
        }
        if ((i & 16) != 0) {
            map2 = C113554cx.LJJJLIIL();
        }
        c70414RkI.LJJJJ(str, z3, c27127Akl2, map2, null);
    }

    public final void LJJLIIIJJIZ(float f, float f2, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        long j3;
        this.LJIL = i;
        if (j2 == 0) {
            j3 = SystemClock.elapsedRealtime() - this.LJIIZILJ;
        } else {
            j3 = j2 - this.LJIIZILJ;
        }
        new JIV(f, f2, this.LJIL, j3, j, z, z2, z3, z4, z5).LIZJ(this.LIZIZ);
    }
}
