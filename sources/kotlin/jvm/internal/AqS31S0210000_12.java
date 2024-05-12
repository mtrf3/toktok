package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C15Y;
import X.C16880lQ;
import X.C47261Igj;
import X.C61878OQg;
import X.C70058ReY;
import X.C70123Rfb;
import X.C72713SgH;
import X.C72715SgJ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.ORY;
import X.ORZ;
import X.RTP;
import X.RWJ;
import X.RXV;
import X.X1D;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.TtfSkuVH;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewState;
import java.util.Iterator;
import java.util.List;
import ujb.s;

/* loaded from: classes13.dex */
public class AqS31S0210000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(ViewGroup it) {
        o.LJIIJ(it, "it");
        if (this.z2) {
            ((C15Y) ((C72713SgH) this.l0).LIZ.getValue()).LIZ(((Widget) this.l1).getLayoutId(), it, new C72715SgJ(this, it));
            return;
        }
        C72713SgH c72713SgH = (C72713SgH) this.l0;
        Widget widget = (Widget) this.l1;
        View LLLLIILL = C16880lQ.LLLLIILL((LayoutInflater) c72713SgH.LIZIZ.getValue(), ((Widget) this.l1).getLayoutId(), it, false);
        o.LJFF(LLLLIILL, "syncLayoutInflater.infla…dget.layoutId, it, false)");
        c72713SgH.LIZ(widget, it, LLLLIILL);
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS31S0210000_12 aqS31S0210000_12, Object obj) {
        aqS31S0210000_12.invoke$0((ViewGroup) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS31S0210000_12 aqS31S0210000_12, Object obj) {
        SkcInfo skcInfo;
        Object obj2;
        List<Skc> list;
        Skc skc;
        Skc skc2;
        List<Skc> list2;
        List list3;
        List<Image> list4;
        Image image;
        String str;
        Image image2;
        List<Skc> list5;
        Skc skc3;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        String[] strArr = ((MiniPdpSkcWidget) aqS31S0210000_12.l0).defaultCheckedIds;
        if ((strArr == null || (obj2 = ORY.LJJJ(strArr)) == null) && ((skcInfo = ((RXV) aqS31S0210000_12.l1).LIZJ) == null || (list = skcInfo.skcList) == null || (skc = (Skc) ORZ.LJLLLL(list)) == null || (obj2 = skc.skcId) == null)) {
            obj2 = "";
        }
        SkcInfo skcInfo2 = ((RXV) aqS31S0210000_12.l1).LIZJ;
        Object obj3 = null;
        if (skcInfo2 != null && (list5 = skcInfo2.skcList) != null) {
            Iterator<Skc> it = list5.iterator();
            while (true) {
                if (it.hasNext()) {
                    skc3 = it.next();
                    if (o.LJ(skc3.skcId, obj2)) {
                        break;
                    }
                } else {
                    skc3 = null;
                    break;
                }
            }
            skc2 = skc3;
        } else {
            skc2 = null;
        }
        StringBuilder sb = new StringBuilder();
        SkcInfo skcInfo3 = ((RXV) aqS31S0210000_12.l1).LIZJ;
        if (skcInfo3 == null || (list2 = skcInfo3.skcList) == null) {
            list2 = C61878OQg.INSTANCE;
        }
        for (Skc skc4 : list2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(skc4.skcId);
            LIZ.append(',');
            sb.append(X1D.LIZIZ(LIZ));
        }
        logWhenShow.plusAssign("skc_id", sb.toString());
        logWhenShow.plusAssign("first_skc_id", obj2);
        logWhenShow.plusAssign("module_name", "skc_selection");
        logWhenShow.plusAssign("sale_prop_status", Integer.valueOf(aqS31S0210000_12.z2 ? 1 : 0));
        StringBuilder sb2 = new StringBuilder();
        SkcInfo skcInfo4 = ((RXV) aqS31S0210000_12.l1).LIZJ;
        if (skcInfo4 == null || (list3 = skcInfo4.skcList) == null) {
            list3 = C61878OQg.INSTANCE;
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            List<Image> list6 = ((Skc) it2.next()).skcImages;
            if (list6 != null && (image2 = (Image) ORZ.LJLLLL(list6)) != null) {
                str = image2.getUri();
            } else {
                str = null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(',');
            sb2.append(X1D.LIZIZ(LIZ2));
        }
        logWhenShow.plusAssign("photo_id", sb2.toString());
        if (skc2 != null && (list4 = skc2.skcImages) != null && (image = (Image) ORZ.LJLLLL(list4)) != null) {
            obj3 = image.getUri();
        }
        logWhenShow.plusAssign("first_photo_id", obj3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (r1 != null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AqS31S0210000_12 r38, java.lang.Object r39) {
        /*
            r6 = r39
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState r6 = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) r6
            java.lang.String r0 = "$this$setState"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r5 = r38
            java.lang.Object r4 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel r4 = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel) r4
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r1 = r4.LJLLL
            r8 = 0
            if (r1 == 0) goto L75
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea r0 = r1.bottomArea
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText r3 = r0.protectionProgramText
        L1a:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r1.baseInfo
            if (r0 == 0) goto L79
            java.lang.String r2 = r0.title
        L20:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem r37 = r4.Nv0()
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r1 = r0.LJLLL
            java.util.List r0 = r6.getCheckedSkuArray()
            if (r0 == 0) goto L34
            java.util.List r8 = X.ORZ.LLJI(r0)
        L34:
            java.lang.Object r7 = r5.l1
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo r7 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo) r7
            r9 = 0
            r22 = 0
            boolean r0 = r5.z2
            r38 = 167772156(0x9fffffc, float:6.1629744E-33)
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            r21 = r9
            r23 = r9
            r24 = r9
            r25 = r22
            r26 = r9
            r27 = r9
            r28 = r9
            r29 = r22
            r30 = r9
            r31 = r9
            r32 = r1
            r33 = r0
            r34 = r9
            r35 = r3
            r36 = r2
            r39 = r9
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState r0 = com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r0
        L75:
            r3 = r8
            if (r1 == 0) goto L79
            goto L1a
        L79:
            r2 = r8
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS31S0210000_12.invoke$2(kotlin.jvm.internal.AqS31S0210000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AqS31S0210000_12 aqS31S0210000_12, Object obj) {
        SkcInfo skcInfo;
        Object obj2;
        List<Skc> list;
        Skc skc;
        Skc skc2;
        List<Skc> list2;
        List list3;
        List<Image> list4;
        Image image;
        String str;
        Image image2;
        List<Skc> list5;
        Skc skc3;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        String[] strArr = ((TtfSkuVH) aqS31S0210000_12.l0).defaultCheckedIds;
        if ((strArr == null || (obj2 = ORY.LJJJ(strArr)) == null) && ((skcInfo = ((RXV) aqS31S0210000_12.l1).LIZJ) == null || (list = skcInfo.skcList) == null || (skc = (Skc) ORZ.LJLLLL(list)) == null || (obj2 = skc.skcId) == null)) {
            obj2 = "";
        }
        SkcInfo skcInfo2 = ((RXV) aqS31S0210000_12.l1).LIZJ;
        Object obj3 = null;
        if (skcInfo2 != null && (list5 = skcInfo2.skcList) != null) {
            Iterator<Skc> it = list5.iterator();
            while (true) {
                if (it.hasNext()) {
                    skc3 = it.next();
                    if (o.LJ(skc3.skcId, obj2)) {
                        break;
                    }
                } else {
                    skc3 = null;
                    break;
                }
            }
            skc2 = skc3;
        } else {
            skc2 = null;
        }
        StringBuilder sb = new StringBuilder();
        SkcInfo skcInfo3 = ((RXV) aqS31S0210000_12.l1).LIZJ;
        if (skcInfo3 == null || (list2 = skcInfo3.skcList) == null) {
            list2 = C61878OQg.INSTANCE;
        }
        for (Skc skc4 : list2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(skc4.skcId);
            LIZ.append(',');
            sb.append(X1D.LIZIZ(LIZ));
        }
        logWhenShow.plusAssign("skc_id", sb.toString());
        logWhenShow.plusAssign("first_skc_id", obj2);
        logWhenShow.plusAssign("module_name", "skc_selection");
        logWhenShow.plusAssign("sale_prop_status", Integer.valueOf(aqS31S0210000_12.z2 ? 1 : 0));
        StringBuilder sb2 = new StringBuilder();
        SkcInfo skcInfo4 = ((RXV) aqS31S0210000_12.l1).LIZJ;
        if (skcInfo4 == null || (list3 = skcInfo4.skcList) == null) {
            list3 = C61878OQg.INSTANCE;
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            List<Image> list6 = ((Skc) it2.next()).skcImages;
            if (list6 != null && (image2 = (Image) ORZ.LJLLLL(list6)) != null) {
                str = image2.getUri();
            } else {
                str = null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(',');
            sb2.append(X1D.LIZIZ(LIZ2));
        }
        logWhenShow.plusAssign("photo_id", sb2.toString());
        if (skc2 != null && (list4 = skc2.skcImages) != null && (image = (Image) ORZ.LJLLLL(list4)) != null) {
            obj3 = image.getUri();
        }
        logWhenShow.plusAssign("first_photo_id", obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS31S0210000_12 aqS31S0210000_12, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70123Rfb) aqS31S0210000_12.l0).LIZIZ(logNode, (BundleInfo) aqS31S0210000_12.l1);
        C70123Rfb c70123Rfb = (C70123Rfb) aqS31S0210000_12.l0;
        BundleInfo bundleInfo = (BundleInfo) aqS31S0210000_12.l1;
        c70123Rfb.getClass();
        C70123Rfb.LIZ(logNode, bundleInfo);
        logNode.plusAssign("button_name", "bundle_add_to_cart");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<BundleProduct> list = ((BundleInfo) aqS31S0210000_12.l1).productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                sb.append(bundleProduct.productId);
                sb.append(",");
                sb2.append(bundleProduct.productSource);
                sb2.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(s.LJJLIIIJ(sb));
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(s.LJJLIIIJ(sb2));
        }
        logNode.plusAssign("product_id", sb.toString());
        logNode.plusAssign("product_source", sb2.toString());
        if (aqS31S0210000_12.z2) {
            str = "able_to_cart";
        } else {
            str = "unable_to_cart";
        }
        logNode.plusAssign("button_type", str);
        logNode.plusAssign("source_page_type", "bundle_deal");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS31S0210000_12 aqS31S0210000_12, Object obj) {
        SkcInfo skcInfo;
        Object obj2;
        List<Skc> list;
        Skc skc;
        Skc skc2;
        List<Skc> list2;
        List list3;
        List<Image> list4;
        Image image;
        String str;
        Image image2;
        List<Skc> list5;
        Skc skc3;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        String[] strArr = ((C70058ReY) aqS31S0210000_12.l0).LJLILLLLZI;
        if ((strArr == null || (obj2 = ORY.LJJJ(strArr)) == null) && ((skcInfo = ((RWJ) aqS31S0210000_12.l1).LIZIZ) == null || (list = skcInfo.skcList) == null || (skc = (Skc) ORZ.LJLLLL(list)) == null || (obj2 = skc.skcId) == null)) {
            obj2 = "";
        }
        SkcInfo skcInfo2 = ((RWJ) aqS31S0210000_12.l1).LIZIZ;
        Object obj3 = null;
        if (skcInfo2 != null && (list5 = skcInfo2.skcList) != null) {
            Iterator<Skc> it = list5.iterator();
            while (true) {
                if (it.hasNext()) {
                    skc3 = it.next();
                    if (o.LJ(skc3.skcId, obj2)) {
                        break;
                    }
                } else {
                    skc3 = null;
                    break;
                }
            }
            skc2 = skc3;
        } else {
            skc2 = null;
        }
        StringBuilder sb = new StringBuilder();
        SkcInfo skcInfo3 = ((RWJ) aqS31S0210000_12.l1).LIZIZ;
        if (skcInfo3 == null || (list2 = skcInfo3.skcList) == null) {
            list2 = C61878OQg.INSTANCE;
        }
        for (Skc skc4 : list2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(skc4.skcId);
            LIZ.append(',');
            sb.append(X1D.LIZIZ(LIZ));
        }
        logWhenShow.plusAssign("skc_id", sb.toString());
        logWhenShow.plusAssign("first_skc_id", obj2);
        logWhenShow.plusAssign("module_name", "skc_selection");
        logWhenShow.plusAssign("sale_prop_status", Integer.valueOf(aqS31S0210000_12.z2 ? 1 : 0));
        StringBuilder sb2 = new StringBuilder();
        SkcInfo skcInfo4 = ((RWJ) aqS31S0210000_12.l1).LIZIZ;
        if (skcInfo4 == null || (list3 = skcInfo4.skcList) == null) {
            list3 = C61878OQg.INSTANCE;
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            List<Image> list6 = ((Skc) it2.next()).skcImages;
            if (list6 != null && (image2 = (Image) ORZ.LJLLLL(list6)) != null) {
                str = image2.getUri();
            } else {
                str = null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(',');
            sb2.append(X1D.LIZIZ(LIZ2));
        }
        logWhenShow.plusAssign("photo_id", sb2.toString());
        if (skc2 != null && (list4 = skc2.skcImages) != null && (image = (Image) ORZ.LJLLLL(list4)) != null) {
            obj3 = image.getUri();
        }
        logWhenShow.plusAssign("first_photo_id", obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS31S0210000_12 aqS31S0210000_12, Object obj) {
        int i;
        int i2;
        int i3;
        NaviAvatarListViewState setState = (NaviAvatarListViewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        if (aqS31S0210000_12.z2) {
            i = ((NaviAvatarListViewState) aqS31S0210000_12.l0).getSelectedIndex();
        } else {
            i = 0;
        }
        List avatarList = (List) aqS31S0210000_12.l1;
        o.LJIIIIZZ(avatarList, "avatarList");
        if (avatarList.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = avatarList.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((RTP) it.next()).LIZ != null && (i2 = i2 + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        List avatarList2 = (List) aqS31S0210000_12.l1;
        o.LJIIIIZZ(avatarList2, "avatarList");
        if (avatarList2.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it2 = avatarList2.iterator();
            i3 = 0;
            while (it2.hasNext()) {
                if (((RTP) it2.next()).LIZIZ != null && (i3 = i3 + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        return NaviAvatarListViewState.copy$default(setState, (List) aqS31S0210000_12.l1, i2, i3, null, i, false, 40, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0210000_12(C70058ReY c70058ReY, RWJ rwj, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c70058ReY;
        this.l1 = rwj;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0210000_12(C70123Rfb c70123Rfb, BundleInfo bundleInfo, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c70123Rfb;
        this.l1 = bundleInfo;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0210000_12(C72713SgH c72713SgH, boolean z, Widget widget, int i) {
        super(1);
        this.$t = i;
        this.l0 = c72713SgH;
        this.z2 = z;
        this.l1 = widget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0210000_12(MiniPdpSkcWidget miniPdpSkcWidget, RXV rxv, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = miniPdpSkcWidget;
        this.l1 = rxv;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0210000_12(SkuPanelViewModel skuPanelViewModel, SkuInfo skuInfo, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = skuPanelViewModel;
        this.l1 = skuInfo;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0210000_12(TtfSkuVH ttfSkuVH, RXV rxv, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = ttfSkuVH;
        this.l1 = rxv;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS31S0210000_12(boolean z, boolean z2, NaviAvatarListViewState naviAvatarListViewState, List<RTP> list) {
        super(1);
        this.$t = list;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = naviAvatarListViewState;
    }
}
