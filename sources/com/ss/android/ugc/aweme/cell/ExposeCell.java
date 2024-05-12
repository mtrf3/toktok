package com.ss.android.ugc.aweme.cell;

import X.AEP;
import X.AEQ;
import X.AIF;
import X.C13930gf;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ExposeCell extends TuxCell<AEP, AIF> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C13930gf.LIZ(itemView, new AEQ(this));
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final AIF N(Context context) {
        AIF aif = new AIF(context, null);
        aif.LJIILJJIL(new ACListenerS24S0100000_4(this, 332));
        return aif;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L13;
     */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.AEP r5) {
        /*
            r4 = this;
            java.lang.String r0 = "t"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            super.onBindItemView(r5)
            android.view.View r3 = r5.LLFF
            r2 = 0
            if (r3 == 0) goto L29
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L1c
            X.C16880lQ.LJLLL(r3, r1)
        L1c:
            S extends X.AI9 r0 = r4.LJLIL
            X.AIF r0 = (X.AIF) r0
            if (r0 == 0) goto L29
            r0.LJIIL(r3)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L38
        L29:
            S extends X.AI9 r1 = r4.LJLIL
            X.AIF r1 = (X.AIF) r1
            if (r1 != 0) goto L86
        L2f:
            S extends X.AI9 r0 = r4.LJLIL
            X.AIF r0 = (X.AIF) r0
            if (r0 == 0) goto L38
            r0.LJIIL(r2)
        L38:
            S extends X.AI9 r1 = r4.LJLIL
            X.AIF r1 = (X.AIF) r1
            if (r1 == 0) goto L43
            boolean r0 = r5.LLFII
            r1.LJIILL(r0)
        L43:
            android.view.View r0 = r4.itemView
            r2 = 2131364070(0x7f0a08e6, float:1.8347967E38)
            android.view.View r1 = r0.findViewById(r2)
            X.AI8 r1 = (X.AI8) r1
            boolean r0 = r5.LLFZ
            r1.setShowAlertBadge(r0)
            android.graphics.drawable.Drawable r1 = r5.LLIIIILZ
            if (r1 == 0) goto L60
            android.view.View r0 = r4.itemView
            android.view.View r0 = r0.findViewById(r2)
            r0.setBackground(r1)
        L60:
            java.lang.Object r0 = r5.LLD
            if (r0 == 0) goto L6f
            android.view.View r0 = r4.itemView
            android.view.View r1 = r0.findViewById(r2)
            java.lang.Object r0 = r5.LLD
            r1.setTag(r0)
        L6f:
            java.lang.String r3 = r5.LLIIZ
            if (r3 == 0) goto L85
            android.view.View r0 = r4.itemView
            android.view.View r2 = r0.findViewById(r2)
            X.AI8 r2 = (X.AI8) r2
            kotlin.jvm.internal.AqS29S1000000_4 r1 = new kotlin.jvm.internal.AqS29S1000000_4
            r0 = 8
            r1.<init>(r3, r0)
            r2.setIcon(r1)
        L85:
            return
        L86:
            java.lang.String r0 = r5.LLFFF
            r1.LJIILIIL(r0)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cell.ExposeCell.onBindItemView(X.AEP):void");
    }
}
