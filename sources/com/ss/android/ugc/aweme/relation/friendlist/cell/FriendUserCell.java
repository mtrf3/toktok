package com.ss.android.ugc.aweme.relation.friendlist.cell;

import X.C16880lQ;
import X.C1EU;
import X.C214298b3;
import X.C226668v0;
import X.C32151Nz;
import X.C57434MgQ;
import X.C62724OjY;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77339UWx;
import X.C78939UyV;
import X.C86110Xqs;
import X.C86111Xqt;
import X.C86112Xqu;
import X.C86113Xqv;
import X.C86115Xqx;
import X.C86116Xqy;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC57853MnB;
import X.EnumC62195Ob1;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import X.XMX;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import q03.IDaS491S0100000_15;

/* loaded from: classes16.dex */
public final class FriendUserCell extends PowerCell<XMX> {
    public final C214298b3 LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ay4;
    }

    public FriendUserCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(this, 607);
        C65776Prg LIZ = C65352Pkq.LIZ(FriendListVM.class);
        C86113Xqv c86113Xqv = C86113Xqv.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86111Xqt.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 612), new AqS165S0100000_15((InterfaceC93923mO) this, 613), C86116Xqy.INSTANCE, c86113Xqv, new AqS165S0100000_15((InterfaceC93923mO) this, 614), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86112Xqu.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 615), new AqS165S0100000_15((InterfaceC93923mO) this, 616), C86115Xqx.INSTANCE, c86113Xqv, new AqS165S0100000_15((InterfaceC93923mO) this, 608), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86110Xqs.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 609), new AqS165S0100000_15((InterfaceC93923mO) this, 610), new AqS165S0100000_15((InterfaceC93923mO) this, 611), c86113Xqv, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(XMX xmx, List payloads) {
        XMX t = xmx;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        super.onBindItemView(t, payloads);
        C62724OjY c62724OjY = t.LJLIL;
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.abl);
        if (c62724OjY.getAvatarMedium() == null) {
            smartImageView.setImageResource(R.drawable.b7n);
        } else {
            W5F LJII = W5U.LJII(C78939UyV.LJ(c62724OjY.getAvatarMedium()));
            LJII.LJJIIJ = smartImageView;
            LJII.LJJIII = EnumC62195Ob1.SMALL;
            S3I s3i = new S3I();
            s3i.LIZIZ = C32151Nz.LJIIZILJ(1);
            s3i.LIZJ = C1EU.LIZ(this.itemView, "itemView.context", R.attr.cf);
            s3i.LIZLLL = C32151Nz.LJIIZILJ(48);
            LJII.LJIJJLI = new S3L(s3i);
            LJII.LJIIJJI = R.drawable.b7n;
            LJII.LJIILL = R.drawable.b7n;
            C16880lQ.LLJJJ(LJII);
        }
        ((TextView) this.itemView.findViewById(R.id.h1f)).setText(c62724OjY.getNickname());
        AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(this, 271);
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.iua);
        C226668v0 c226668v0 = new C226668v0();
        c226668v0.LIZJ(EnumC57853MnB.CUSTOM_TT_NOW_NORMAL);
        c226668v0.LIZ = c62724OjY;
        relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
        ((RelationButton) this.itemView.findViewById(R.id.iua)).setDataChangeListener(new AqS181S0100000_15(aqS181S0100000_15, 270));
        aqS181S0100000_15.invoke(C57434MgQ.LIZ(c62724OjY.getFollowStatus()));
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new IDaS491S0100000_15(this, c62724OjY, 5), itemView);
    }
}
