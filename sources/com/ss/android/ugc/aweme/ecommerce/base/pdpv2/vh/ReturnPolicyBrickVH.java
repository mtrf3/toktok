package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh;

import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBrickVO;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class ReturnPolicyBrickVH extends BaseBrickVH<ReturnPolicyBrickVO> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final String getModuleName() {
        return "return_policy";
    }

    public ReturnPolicyBrickVH() {
        super(R.layout.a3z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((!ujb.o.LJJJJJL(r0)) == true) goto L12;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBrickVO r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBrickVO r6 = (com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBrickVO) r6
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            android.view.View r1 = r5.itemView
            r0 = 2131374736(0x7f0a3290, float:1.83696E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r0 = r6.LIZ()
            com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBizData r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBizData) r0
            if (r0 == 0) goto L84
            java.lang.String r0 = r0.title
            if (r0 == 0) goto L84
        L1e:
            r2.setText(r0)
            java.lang.Object r0 = r6.LIZ()
            com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBizData r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBizData) r0
            r4 = 0
            if (r0 == 0) goto L82
            java.lang.String r0 = r0.desc
            if (r0 == 0) goto L82
            boolean r0 = ujb.o.LJJJJJL(r0)
            r3 = 1
            r0 = r0 ^ 1
            if (r0 != r3) goto L82
        L37:
            java.lang.String r2 = "itemView.return_policies_desc"
            r1 = 2131374737(0x7f0a3291, float:1.8369602E38)
            if (r3 == 0) goto L73
            android.view.View r0 = r5.itemView
            android.view.View r0 = r0.findViewById(r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            r0.setVisibility(r4)
            android.view.View r0 = r5.itemView
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r0 = r6.LIZ()
            com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBizData r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBizData) r0
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.desc
        L5c:
            r1.setText(r0)
        L5f:
            android.view.View r2 = r5.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            com.ss.android.ugc.aweme.utils.Au2S14S0200000_4 r1 = new com.ss.android.ugc.aweme.utils.Au2S14S0200000_4
            r0 = 31
            r1.<init>(r5, r6, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            return
        L71:
            r0 = 0
            goto L5c
        L73:
            android.view.View r0 = r5.itemView
            android.view.View r1 = r0.findViewById(r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r2)
            r0 = 8
            r1.setVisibility(r0)
            goto L5f
        L82:
            r3 = 0
            goto L37
        L84:
            android.view.View r0 = r5.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131847178(0x7f11680a, float:1.9327826E38)
            java.lang.String r0 = r1.getString(r0)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.ReturnPolicyBrickVH.T(X.AtQ):void");
    }
}
