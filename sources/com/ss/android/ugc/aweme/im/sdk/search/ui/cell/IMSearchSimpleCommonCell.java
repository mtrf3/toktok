package com.ss.android.ugc.aweme.im.sdk.search.ui.cell;

import X.C1DI;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C785736n;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.Y9P;
import X.Y9Q;
import X.Y9R;
import X.Y9S;
import X.Y9T;
import X.Y9U;
import X.Y9V;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class IMSearchSimpleCommonCell extends PowerCell<C785736n> {
    public final C214298b3 LJLIL;
    public Y9V LJLILLLLZI;

    public IMSearchSimpleCommonCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(IMSearchDefaultVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 452);
        Y9S y9s = Y9S.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, Y9Q.INSTANCE, new AqS165S0100000_15(this, 453), new AqS165S0100000_15(this, 454), Y9U.INSTANCE, y9s, new AqS165S0100000_15(this, 455), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, Y9R.INSTANCE, new AqS165S0100000_15(this, 456), new AqS165S0100000_15(this, 447), Y9T.INSTANCE, y9s, new AqS165S0100000_15(this, 448), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, Y9P.INSTANCE, new AqS165S0100000_15(this, 449), new AqS165S0100000_15(this, 450), new AqS165S0100000_15(this, 451), y9s, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        InterfaceC65784Pro<C76800UCe> LIZLLL;
        super.onViewAttachedToWindow();
        Y9V y9v = this.LJLILLLLZI;
        if (y9v != null && (LIZLLL = y9v.LIZLLL()) != null) {
            LIZLLL.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
    
        if (r1 != null) goto L9;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C785736n r9) {
        /*
            r8 = this;
            X.36n r9 = (X.C785736n) r9
            java.lang.String r0 = "t"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            android.view.View r3 = r8.itemView
            X.Y9V r7 = r9.LJLIL
            r8.LJLILLLLZI = r7
            X.Pro r0 = r7.LJI()
            r6 = 0
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.invoke()
        L18:
            X.W5F r5 = X.W5U.LJII(r0)
            r4 = 2131362898(0x7f0a0452, float:1.834559E38)
            android.view.View r0 = r3.findViewById(r4)
            com.bytedance.lighten.loader.SmartImageView r0 = (com.bytedance.lighten.loader.SmartImageView) r0
            r5.LJJIIJ = r0
            r2 = 0
            r1 = 6
            java.lang.String r0 = "im_search"
            X.C43659HBn.LJIJ(r5, r0, r2, r6, r1)
            android.view.View r2 = r3.findViewById(r4)
            com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView r2 = (com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView) r2
            Y.ACListenerS49S0200000_15 r1 = new Y.ACListenerS49S0200000_15
            r0 = 24
            r1.<init>(r7, r8, r0)
            X.C16880lQ.LJJJJL(r2, r1)
            Y.ACListenerS49S0200000_15 r1 = new Y.ACListenerS49S0200000_15
            r0 = 25
            r1.<init>(r7, r8, r0)
            X.C16880lQ.LJIIJ(r1, r3)
            X.Yns r2 = r7.LIZJ()
            if (r2 == 0) goto L6c
            android.content.Context r1 = r3.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Object r1 = r2.invoke(r1)
            android.text.SpannableString r1 = (android.text.SpannableString) r1
            if (r1 == 0) goto L6c
        L5f:
            r0 = 2131371854(0x7f0a274e, float:1.8363755E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            return
        L6c:
            java.lang.String r1 = ""
            goto L5f
        L6f:
            r0 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.search.ui.cell.IMSearchSimpleCommonCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b5o, viewGroup, false, "from(parent.context).inf…t_contact, parent, false)");
    }
}
