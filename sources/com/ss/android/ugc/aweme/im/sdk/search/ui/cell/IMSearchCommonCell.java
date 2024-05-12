package com.ss.android.ugc.aweme.im.sdk.search.ui.cell;

import X.C1DI;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C785736n;
import X.C86910Y9a;
import X.C86911Y9b;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.Y9V;
import X.Y9W;
import X.Y9X;
import X.Y9Y;
import X.Y9Z;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class IMSearchCommonCell extends PowerCell<C785736n> {
    public final C214298b3 LJLIL;
    public Y9V LJLILLLLZI;

    public IMSearchCommonCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(IMSearchDefaultVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 422);
        Y9Z y9z = Y9Z.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, Y9X.INSTANCE, new AqS165S0100000_15(this, 423), new AqS165S0100000_15(this, 424), C86911Y9b.INSTANCE, y9z, new AqS165S0100000_15(this, 425), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, Y9Y.INSTANCE, new AqS165S0100000_15(this, 426), new AqS165S0100000_15(this, 417), C86910Y9a.INSTANCE, y9z, new AqS165S0100000_15(this, 418), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, Y9W.INSTANCE, new AqS165S0100000_15(this, 419), new AqS165S0100000_15(this, 420), new AqS165S0100000_15(this, 421), y9z, (InterfaceC65784Pro) null, 384);
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0178  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C785736n r16) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.search.ui.cell.IMSearchCommonCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b5k, viewGroup, false, "from(parent.context)\n   …n_contact, parent, false)");
    }
}
