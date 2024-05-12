package com.ss.android.ugc.aweme.relation.friendlist.cell;

import X.C214298b3;
import X.C223338pd;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77339UWx;
import X.C85211XcN;
import X.C85460XgO;
import X.C85461XgP;
import X.C85489Xgr;
import X.C85490Xgs;
import X.C85491Xgt;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.XMW;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class StretchCell extends PowerCell<XMW> {
    public final C214298b3 LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ay6;
    }

    public StretchCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(this, 617);
        C65776Prg LIZ = C65352Pkq.LIZ(FriendListVM.class);
        C85211XcN c85211XcN = C85211XcN.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85490Xgs.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 622), new AqS165S0100000_15((InterfaceC93923mO) this, 623), C85461XgP.INSTANCE, c85211XcN, new AqS165S0100000_15((InterfaceC93923mO) this, 624), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85491Xgt.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 625), new AqS165S0100000_15((InterfaceC93923mO) this, 626), C85460XgO.INSTANCE, c85211XcN, new AqS165S0100000_15((InterfaceC93923mO) this, 618), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85489Xgr.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 619), new AqS165S0100000_15((InterfaceC93923mO) this, 620), new AqS165S0100000_15((InterfaceC93923mO) this, 621), c85211XcN, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
    }

    public final void L(boolean z) {
        int i;
        View view = this.itemView;
        View stretchContainer = view.findViewById(R.id.kll);
        o.LJIIIIZZ(stretchContainer, "stretchContainer");
        int i2 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        stretchContainer.setVisibility(i);
        C223338pd loadingView = (C223338pd) view.findViewById(R.id.g7z);
        o.LJIIIIZZ(loadingView, "loadingView");
        if (!z) {
            i2 = 8;
        }
        loadingView.setVisibility(i2);
        if (z) {
            ((C223338pd) view.findViewById(R.id.g7z)).LIZIZ();
        } else {
            ((C223338pd) view.findViewById(R.id.g7z)).LIZJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(XMW xmw, List payloads) {
        XMW t = xmw;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        super.onBindItemView(t, payloads);
        t.LJLIL.getClass();
        throw null;
    }
}
