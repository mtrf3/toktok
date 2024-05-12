package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C71361RzZ;
import X.C71366Rze;
import X.C71367Rzf;
import X.C71376Rzo;
import X.C76800UCe;
import X.InterfaceC72840SiK;
import X.InterfaceC88472Yns;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.PdpHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class AqS16S1101000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS16S1101000_12 aqS16S1101000_12, Object obj) {
        List list;
        Map map;
        C71367Rzf it = (C71367Rzf) obj;
        o.LJIIIZ(it, "it");
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        AnchorPanelAdapter anchorPanelAdapter = (AnchorPanelAdapter) aqS16S1101000_12.l1;
        String str = aqS16S1101000_12.s0;
        int i = aqS16S1101000_12.i2;
        Map<String, Map<String, Object>> map2 = anchorPanelAdapter.LJLZ;
        if (map2 != null && (map = (Map) ((LinkedHashMap) map2).get(str)) != null) {
            c71361RzZ.getClass();
            C71361RzZ.LJFF(it, map);
        }
        Map<String, List<PromotionLogo>> map3 = anchorPanelAdapter.LJLLILLLL;
        if (map3 != null && (list = (List) ((LinkedHashMap) map3).get(str)) != null) {
            c71361RzZ.getClass();
            C71361RzZ.LJ(it, list);
        }
        ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) ListProtector.get(anchorPanelAdapter.LJLJLLL, i);
        Map<String, PromotionView> map4 = anchorPanelAdapter.LJLLL;
        c71361RzZ.getClass();
        C71361RzZ.LIZLLL(it, shopWindowAnchorModel, map4);
        C71361RzZ.LIZJ(anchorPanelAdapter.LLFZ, it, str);
        C71366Rze.LIZIZ(str, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS16S1101000_12 aqS16S1101000_12, Object obj) {
        List list;
        Map map;
        C71367Rzf it = (C71367Rzf) obj;
        o.LJIIIZ(it, "it");
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        AnchorPanelAdapter anchorPanelAdapter = (AnchorPanelAdapter) aqS16S1101000_12.l1;
        String str = aqS16S1101000_12.s0;
        int i = aqS16S1101000_12.i2;
        Map<String, C71376Rzo> map2 = anchorPanelAdapter.LLFZ;
        c71361RzZ.getClass();
        C71361RzZ.LIZJ(map2, it, str);
        Map<String, Map<String, Object>> map3 = anchorPanelAdapter.LJLZ;
        if (map3 != null && (map = (Map) ((LinkedHashMap) map3).get(str)) != null) {
            C71361RzZ.LJFF(it, map);
        }
        Map<String, List<PromotionLogo>> map4 = anchorPanelAdapter.LJLLILLLL;
        if (map4 != null && (list = (List) ((LinkedHashMap) map4).get(str)) != null) {
            C71361RzZ.LJ(it, list);
        }
        C71361RzZ.LIZLLL(it, (ShopWindowAnchorModel) ListProtector.get(anchorPanelAdapter.LJLJLLL, i), anchorPanelAdapter.LJLLL);
        C71366Rze.LIZIZ(aqS16S1101000_12.s0, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS16S1101000_12 aqS16S1101000_12, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("log_id", ((InterfaceC72840SiK) aqS16S1101000_12.l1).getSearchlogId());
        sendLog.LIZLLL("search_entrance", ((InterfaceC72840SiK) aqS16S1101000_12.l1).getSearchEntrance());
        sendLog.LIZLLL("search_position", ((InterfaceC72840SiK) aqS16S1101000_12.l1).getSearchPosition());
        sendLog.LIZLLL("action_type", "long_press_feedback");
        sendLog.LIZLLL("text_type", "recom_search_feedback");
        sendLog.LIZLLL("answer_id", Integer.valueOf(aqS16S1101000_12.i2));
        sendLog.LIZLLL("group_id", ((InterfaceC72840SiK) aqS16S1101000_12.l1).getWordGroupId());
        sendLog.LIZLLL("words_content", ((InterfaceC72840SiK) aqS16S1101000_12.l1).getWordContent());
        sendLog.LIZLLL("impr_id", aqS16S1101000_12.s0);
        String productId = ((InterfaceC72840SiK) aqS16S1101000_12.l1).getProductId();
        if (productId != null) {
            sendLog.LIZLLL("product_id", productId);
        }
        String userId = ((InterfaceC72840SiK) aqS16S1101000_12.l1).getUserId();
        if (userId != null) {
            sendLog.LIZLLL("user_id", userId);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS16S1101000_12 aqS16S1101000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("photo_id", aqS16S1101000_12.s0);
        logNode.plusAssign("photo_type", ((PdpHeadViewHolder) aqS16S1101000_12.l1).N(aqS16S1101000_12.i2));
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS16S1101000_12(int r3, com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r5
            r1.l1 = r4
            r1.i2 = r3
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r5
            r1.i2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS16S1101000_12.<init>(int, com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S1101000_12(InterfaceC72840SiK interfaceC72840SiK, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = interfaceC72840SiK;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S1101000_12(String str, PdpHeadViewHolder pdpHeadViewHolder, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = pdpHeadViewHolder;
        this.i2 = i;
    }
}
