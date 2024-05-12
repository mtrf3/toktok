package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C70058ReY;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.ORY;
import X.ORZ;
import X.RWJ;
import X.RXV;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.TtfSkuVH;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class AqS2S1211000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS2S1211000_12 aqS2S1211000_12, Object obj) {
        Skc skc;
        SkcInfo skcInfo;
        Object obj2;
        List<Skc> list;
        Skc skc2;
        Skc skc3;
        Object obj3;
        List<Image> list2;
        Image image;
        List<Image> list3;
        Image image2;
        List<Skc> list4;
        Skc skc4;
        List<Skc> list5;
        Skc skc5;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        SkcInfo skcInfo2 = ((RXV) aqS2S1211000_12.l1).LIZJ;
        Object obj4 = null;
        if (skcInfo2 != null && (list5 = skcInfo2.skcList) != null) {
            String str = aqS2S1211000_12.s0;
            Iterator<Skc> it = list5.iterator();
            while (true) {
                if (it.hasNext()) {
                    skc5 = it.next();
                    if (o.LJ(skc5.skcId, str)) {
                        break;
                    }
                } else {
                    skc5 = null;
                    break;
                }
            }
            skc = skc5;
        } else {
            skc = null;
        }
        String[] strArr = ((MiniPdpSkcWidget) aqS2S1211000_12.l2).defaultCheckedIds;
        if ((strArr == null || (obj2 = ORY.LJJJ(strArr)) == null) && ((skcInfo = ((RXV) aqS2S1211000_12.l1).LIZJ) == null || (list = skcInfo.skcList) == null || (skc2 = (Skc) ORZ.LJLLLL(list)) == null || (obj2 = skc2.skcId) == null)) {
            obj2 = "";
        }
        SkcInfo skcInfo3 = ((RXV) aqS2S1211000_12.l1).LIZJ;
        if (skcInfo3 != null && (list4 = skcInfo3.skcList) != null) {
            Iterator<Skc> it2 = list4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    skc4 = it2.next();
                    if (o.LJ(skc4.skcId, obj2)) {
                        break;
                    }
                } else {
                    skc4 = null;
                    break;
                }
            }
            skc3 = skc4;
        } else {
            skc3 = null;
        }
        Object obj5 = aqS2S1211000_12.s0;
        if (obj5 == null) {
            obj5 = "";
        }
        logView.plusAssign("skc_id", obj5);
        logView.plusAssign("first_skc_id", obj2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(aqS2S1211000_12.i4 + 1);
        logView.plusAssign("rank", X1D.LIZIZ(LIZ));
        logView.plusAssign("module_name", "skc_selection");
        logView.plusAssign("sale_prop_status", Integer.valueOf(aqS2S1211000_12.z3 ? 1 : 0));
        if (skc != null && (list3 = skc.skcImages) != null && (image2 = (Image) ORZ.LJLLLL(list3)) != null) {
            obj3 = image2.getUri();
        } else {
            obj3 = null;
        }
        logView.plusAssign("photo_id", obj3);
        if (skc3 != null && (list2 = skc3.skcImages) != null && (image = (Image) ORZ.LJLLLL(list2)) != null) {
            obj4 = image.getUri();
        }
        logView.plusAssign("first_photo_id", obj4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S1211000_12 aqS2S1211000_12, Object obj) {
        Skc skc;
        SkcInfo skcInfo;
        Object obj2;
        List<Skc> list;
        Skc skc2;
        Skc skc3;
        Object obj3;
        List<Image> list2;
        Image image;
        List<Image> list3;
        Image image2;
        List<Skc> list4;
        Skc skc4;
        List<Skc> list5;
        Skc skc5;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        SkcInfo skcInfo2 = ((RXV) aqS2S1211000_12.l1).LIZJ;
        Object obj4 = null;
        if (skcInfo2 != null && (list5 = skcInfo2.skcList) != null) {
            String str = aqS2S1211000_12.s0;
            Iterator<Skc> it = list5.iterator();
            while (true) {
                if (it.hasNext()) {
                    skc5 = it.next();
                    if (o.LJ(skc5.skcId, str)) {
                        break;
                    }
                } else {
                    skc5 = null;
                    break;
                }
            }
            skc = skc5;
        } else {
            skc = null;
        }
        String[] strArr = ((TtfSkuVH) aqS2S1211000_12.l2).defaultCheckedIds;
        if ((strArr == null || (obj2 = ORY.LJJJ(strArr)) == null) && ((skcInfo = ((RXV) aqS2S1211000_12.l1).LIZJ) == null || (list = skcInfo.skcList) == null || (skc2 = (Skc) ORZ.LJLLLL(list)) == null || (obj2 = skc2.skcId) == null)) {
            obj2 = "";
        }
        SkcInfo skcInfo3 = ((RXV) aqS2S1211000_12.l1).LIZJ;
        if (skcInfo3 != null && (list4 = skcInfo3.skcList) != null) {
            Iterator<Skc> it2 = list4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    skc4 = it2.next();
                    if (o.LJ(skc4.skcId, obj2)) {
                        break;
                    }
                } else {
                    skc4 = null;
                    break;
                }
            }
            skc3 = skc4;
        } else {
            skc3 = null;
        }
        Object obj5 = aqS2S1211000_12.s0;
        if (obj5 == null) {
            obj5 = "";
        }
        logView.plusAssign("skc_id", obj5);
        logView.plusAssign("first_skc_id", obj2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(aqS2S1211000_12.i4 + 1);
        logView.plusAssign("rank", X1D.LIZIZ(LIZ));
        logView.plusAssign("module_name", "skc_selection");
        logView.plusAssign("sale_prop_status", Integer.valueOf(aqS2S1211000_12.z3 ? 1 : 0));
        if (skc != null && (list3 = skc.skcImages) != null && (image2 = (Image) ORZ.LJLLLL(list3)) != null) {
            obj3 = image2.getUri();
        } else {
            obj3 = null;
        }
        logView.plusAssign("photo_id", obj3);
        if (skc3 != null && (list2 = skc3.skcImages) != null && (image = (Image) ORZ.LJLLLL(list2)) != null) {
            obj4 = image.getUri();
        }
        logView.plusAssign("first_photo_id", obj4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS2S1211000_12 aqS2S1211000_12, Object obj) {
        Skc skc;
        SkcInfo skcInfo;
        Object obj2;
        List<Skc> list;
        Skc skc2;
        Skc skc3;
        Object obj3;
        List<Image> list2;
        Image image;
        List<Image> list3;
        Image image2;
        List<Skc> list4;
        Skc skc4;
        List<Skc> list5;
        Skc skc5;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        SkcInfo skcInfo2 = ((RWJ) aqS2S1211000_12.l1).LIZIZ;
        Object obj4 = null;
        if (skcInfo2 != null && (list5 = skcInfo2.skcList) != null) {
            String str = aqS2S1211000_12.s0;
            Iterator<Skc> it = list5.iterator();
            while (true) {
                if (it.hasNext()) {
                    skc5 = it.next();
                    if (o.LJ(skc5.skcId, str)) {
                        break;
                    }
                } else {
                    skc5 = null;
                    break;
                }
            }
            skc = skc5;
        } else {
            skc = null;
        }
        String[] strArr = ((C70058ReY) aqS2S1211000_12.l2).LJLILLLLZI;
        if ((strArr == null || (obj2 = ORY.LJJJ(strArr)) == null) && ((skcInfo = ((RWJ) aqS2S1211000_12.l1).LIZIZ) == null || (list = skcInfo.skcList) == null || (skc2 = (Skc) ORZ.LJLLLL(list)) == null || (obj2 = skc2.skcId) == null)) {
            obj2 = "";
        }
        SkcInfo skcInfo3 = ((RWJ) aqS2S1211000_12.l1).LIZIZ;
        if (skcInfo3 != null && (list4 = skcInfo3.skcList) != null) {
            Iterator<Skc> it2 = list4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    skc4 = it2.next();
                    if (o.LJ(skc4.skcId, obj2)) {
                        break;
                    }
                } else {
                    skc4 = null;
                    break;
                }
            }
            skc3 = skc4;
        } else {
            skc3 = null;
        }
        Object obj5 = aqS2S1211000_12.s0;
        if (obj5 == null) {
            obj5 = "";
        }
        logView.plusAssign("skc_id", obj5);
        logView.plusAssign("first_skc_id", obj2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(aqS2S1211000_12.i4 + 1);
        logView.plusAssign("rank", X1D.LIZIZ(LIZ));
        logView.plusAssign("module_name", "skc_selection");
        logView.plusAssign("sale_prop_status", Integer.valueOf(aqS2S1211000_12.z3 ? 1 : 0));
        if (skc != null && (list3 = skc.skcImages) != null && (image2 = (Image) ORZ.LJLLLL(list3)) != null) {
            obj3 = image2.getUri();
        } else {
            obj3 = null;
        }
        logView.plusAssign("photo_id", obj3);
        if (skc3 != null && (list2 = skc3.skcImages) != null && (image = (Image) ORZ.LJLLLL(list2)) != null) {
            obj4 = image.getUri();
        }
        logView.plusAssign("first_photo_id", obj4);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S1211000_12(RWJ rwj, C70058ReY c70058ReY, String str, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = rwj;
        this.l2 = c70058ReY;
        this.s0 = str;
        this.i4 = i;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S1211000_12(RXV rxv, MiniPdpSkcWidget miniPdpSkcWidget, String str, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = rxv;
        this.l2 = miniPdpSkcWidget;
        this.s0 = str;
        this.i4 = i;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S1211000_12(RXV rxv, TtfSkuVH ttfSkuVH, String str, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = rxv;
        this.l2 = ttfSkuVH;
        this.s0 = str;
        this.i4 = i;
        this.z3 = z;
    }
}
