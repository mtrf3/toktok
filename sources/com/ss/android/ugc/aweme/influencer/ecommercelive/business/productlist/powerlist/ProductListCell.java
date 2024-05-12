package com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.powerlist;

import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71271Ry7;
import X.C71521S5d;
import X.C71522S5e;
import X.C71523S5f;
import X.C71524S5g;
import X.C77339UWx;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.S40;
import X.S4I;
import X.S4N;
import X.S4O;
import X.S4P;
import X.S4Q;
import X.S4R;
import X.S4S;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.viewmodel.ProductListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductListCell extends PowerCell<C71271Ry7> {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public ProductListCell() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 736);
        S4I s4i = S4I.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, S4N.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 726), new AqS162S0100000_12((InterfaceC93923mO) this, 728), C71522S5e.INSTANCE, s4i, new AqS162S0100000_12((InterfaceC93923mO) this, 730), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, S4P.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 732), new AqS162S0100000_12((InterfaceC93923mO) this, 727), C71521S5d.INSTANCE, s4i, new AqS162S0100000_12((InterfaceC93923mO) this, 729), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, S4O.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 731), new AqS162S0100000_12((InterfaceC93923mO) this, 733), new AqS162S0100000_12((InterfaceC93923mO) this, 734), s4i, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(ProductListViewModel.class);
        AqS162S0100000_12 aqS162S0100000_122 = new AqS162S0100000_12(LIZ2, 735);
        S40 s40 = S40.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(LIZ2, aqS162S0100000_122, S4Q.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 737), new AqS162S0100000_12((InterfaceC93923mO) this, 738), C71523S5f.INSTANCE, s40, new AqS162S0100000_12((InterfaceC93923mO) this, 739), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(LIZ2, aqS162S0100000_122, S4R.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 740), new AqS162S0100000_12((InterfaceC93923mO) this, 741), C71524S5g.INSTANCE, s40, new AqS162S0100000_12((InterfaceC93923mO) this, 742), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b32 = new C214298b3(LIZ2, aqS162S0100000_122, S4S.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 719), new AqS162S0100000_12((InterfaceC93923mO) this, 721), new AqS162S0100000_12((InterfaceC93923mO) this, 723), s40, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLILLLLZI = c214298b32;
        this.LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 725));
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 722));
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 724));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 720));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[SYNTHETIC] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C71271Ry7 r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.powerlist.ProductListCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.aql);
    }
}
