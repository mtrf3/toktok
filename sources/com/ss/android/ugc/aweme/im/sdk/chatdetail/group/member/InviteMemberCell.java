package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.member;

import X.C16880lQ;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77339UWx;
import X.C94523nM;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.YEN;
import X.YEO;
import X.YEP;
import X.YEQ;
import X.YER;
import X.YES;
import Y.ACListenerS21S0100000_1;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions.GroupDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class InviteMemberCell extends PowerCell<C94523nM> {
    public final C214298b3 LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b9k;
    }

    public InviteMemberCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GroupDetailViewModel.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 392);
        YEQ yeq = YEQ.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, YEO.INSTANCE, new AqS165S0100000_15(this, 393), new AqS165S0100000_15(this, 394), YES.INSTANCE, yeq, new AqS165S0100000_15(this, 395), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, YEP.INSTANCE, new AqS165S0100000_15(this, 396), new AqS165S0100000_15(this, 387), YER.INSTANCE, yeq, new AqS165S0100000_15(this, 388), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, YEN.INSTANCE, new AqS165S0100000_15(this, 389), new AqS165S0100000_15(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT), new AqS165S0100000_15(this, 391), yeq, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C94523nM t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 166), this.itemView);
    }
}
