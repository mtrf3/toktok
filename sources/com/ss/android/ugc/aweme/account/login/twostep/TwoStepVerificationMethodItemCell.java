package com.ss.android.ugc.aweme.account.login.twostep;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77339UWx;
import X.C85165Xbd;
import X.C85196Xc8;
import X.C85448XgC;
import X.C85449XgD;
import X.C85471XgZ;
import X.C85472Xga;
import X.C85473Xgb;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoStepVerificationMethodItemCell extends PowerCell<C85165Xbd> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 159));
    public final C214298b3 LJLILLLLZI;

    public TwoStepVerificationMethodItemCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TwoStepVerificationActivityViewModel.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 154);
        C85196Xc8 c85196Xc8 = C85196Xc8.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85472Xga.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 155), new AqS165S0100000_15((InterfaceC93923mO) this, 156), C85449XgD.INSTANCE, c85196Xc8, new AqS165S0100000_15((InterfaceC93923mO) this, 157), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85473Xgb.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 158), new AqS165S0100000_15((InterfaceC93923mO) this, 149), C85448XgC.INSTANCE, c85196Xc8, new AqS165S0100000_15((InterfaceC93923mO) this, 150), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85471XgZ.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 151), new AqS165S0100000_15((InterfaceC93923mO) this, 152), new AqS165S0100000_15((InterfaceC93923mO) this, 153), c85196Xc8, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLILLLLZI = c214298b3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x015c, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View, X.96D] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C85165Xbd r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationMethodItemCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.lu, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return LLLLIILL;
    }
}
