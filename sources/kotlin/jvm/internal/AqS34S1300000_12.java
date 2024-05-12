package kotlin.jvm.internal;

import X.ARI;
import X.ARN;
import X.AbstractC65781Prl;
import X.C70682Roc;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.SV7;
import X.SVA;
import X.SVF;
import X.SVG;
import X.SVH;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.dsp.common.model.DspActionStruct;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.ReviewCellViewHolder;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes13.dex */
public class AqS34S1300000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AqS34S1300000_12 aqS34S1300000_12, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.q63, new AqS53S1200000_12((BnplMiddleActivity) aqS34S1300000_12.l1, (BnplMiddleActivity) aqS34S1300000_12.s0, (String) aqS34S1300000_12.l2, (InterfaceC88472Yns<? super ARN, C76800UCe>) 2));
        actionGroup.LJIIIIZZ(R.string.cg_, new AqS53S1200000_12((BnplMiddleActivity) aqS34S1300000_12.l1, (BnplMiddleActivity) aqS34S1300000_12.s0, (String) aqS34S1300000_12.l3, (InterfaceC88472Yns<? super ARN, C76800UCe>) 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS34S1300000_12 aqS34S1300000_12, Object obj) {
        HashMap hashMap;
        boolean z;
        DspActionStruct recordRequest = (DspActionStruct) obj;
        o.LJIIIZ(recordRequest, "$this$recordRequest");
        SV7 sv7 = SV7.LIZ;
        TTMStoreLink tTMStoreLink = (TTMStoreLink) aqS34S1300000_12.l1;
        sv7.getClass();
        OSZ LJIIIIZZ = SV7.LJIIIIZZ(tTMStoreLink);
        String str = null;
        if (LJIIIIZZ != null) {
            hashMap = (HashMap) LJIIIIZZ.getSecond();
            str = (String) LJIIIIZZ.getFirst();
        } else {
            hashMap = null;
        }
        String str2 = aqS34S1300000_12.s0;
        if (((SVG) aqS34S1300000_12.l2).getActionType() == SVH.DSP_ACTION_CLICK) {
            z = true;
        } else {
            z = false;
        }
        SV7.LJIIIZ(str, hashMap, str2, z, (SVA) aqS34S1300000_12.l3);
        recordRequest.setActionType(Integer.valueOf(((SVG) aqS34S1300000_12.l2).getActionType().getNumber()));
        recordRequest.setScene(Integer.valueOf(((SVG) aqS34S1300000_12.l2).getScene().getNumber()));
        recordRequest.setExtra(GsonProtectorUtils.toJson(SVF.LIZ, hashMap));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS34S1300000_12 aqS34S1300000_12, Object obj) {
        HashMap hashMap;
        boolean z;
        DspActionStruct buildRequest = (DspActionStruct) obj;
        o.LJIIIZ(buildRequest, "$this$buildRequest");
        SV7 sv7 = SV7.LIZ;
        TTMStoreLink tTMStoreLink = (TTMStoreLink) aqS34S1300000_12.l1;
        sv7.getClass();
        OSZ LJIIIIZZ = SV7.LJIIIIZZ(tTMStoreLink);
        String str = null;
        if (LJIIIIZZ != null) {
            hashMap = (HashMap) LJIIIIZZ.getSecond();
            str = (String) LJIIIIZZ.getFirst();
        } else {
            hashMap = null;
        }
        String str2 = aqS34S1300000_12.s0;
        if (((SVG) aqS34S1300000_12.l2).getActionType() == SVH.DSP_ACTION_CLICK) {
            z = true;
        } else {
            z = false;
        }
        SV7.LJIIIZ(str, hashMap, str2, z, (SVA) aqS34S1300000_12.l3);
        buildRequest.setActionType(Integer.valueOf(((SVG) aqS34S1300000_12.l2).getActionType().getNumber()));
        buildRequest.setScene(Integer.valueOf(((SVG) aqS34S1300000_12.l2).getScene().getNumber()));
        buildRequest.setExtra(GsonProtectorUtils.toJson(SVF.LIZ, hashMap));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS34S1300000_12 aqS34S1300000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((ReviewCellViewHolder) aqS34S1300000_12.l1).Q().Pv0(1, aqS34S1300000_12.s0);
            C70682Roc c70682Roc = (C70682Roc) ((View) aqS34S1300000_12.l2).findViewById(R.id.j0h);
            o.LJIIIIZZ(c70682Roc, "it.review_content");
            C70682Roc.LIZJ(c70682Roc, ((ReviewItemStruct.AppendReview) aqS34S1300000_12.l3).text, 0, false, null, 14);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS34S1300000_12(BnplMiddleActivity bnplMiddleActivity, BnplMiddleActivity bnplMiddleActivity2, String str, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns2) {
        super(1);
        this.$t = interfaceC88472Yns2;
        this.l1 = bnplMiddleActivity;
        this.s0 = bnplMiddleActivity2;
        this.l2 = str;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS34S1300000_12(ReviewCellViewHolder reviewCellViewHolder, String str, View view, ReviewItemStruct.AppendReview appendReview, int i) {
        super(1);
        this.$t = i;
        this.l1 = reviewCellViewHolder;
        this.s0 = str;
        this.l2 = view;
        this.l3 = appendReview;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS34S1300000_12(TTMStoreLink tTMStoreLink, String str, SVG svg, SVA sva, int i) {
        super(1);
        this.$t = i;
        this.l1 = tTMStoreLink;
        this.s0 = str;
        this.l2 = svg;
        this.l3 = sva;
    }
}
