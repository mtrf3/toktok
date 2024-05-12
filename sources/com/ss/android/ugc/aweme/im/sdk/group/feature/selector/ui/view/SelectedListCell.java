package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import X.C0F1;
import X.C1DI;
import X.C214298b3;
import X.C4AS;
import X.C65352Pkq;
import X.C65776Prg;
import X.C86912Y9c;
import X.C86913Y9d;
import X.C86914Y9e;
import X.C86915Y9f;
import X.C86916Y9g;
import X.C86917Y9h;
import X.C91773iv;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.ViewOnClickListenerC13880ga;
import X.W5G;
import X.YE1;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import o3.IDaS88S0000000_1;
import o3.h0;

/* loaded from: classes16.dex */
public final class SelectedListCell extends PowerCell<C91773iv> {
    public final C214298b3 LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ACListenerS21S0100000_1 aCListenerS21S0100000_1 = new ACListenerS21S0100000_1(this, 101);
        if (C0F1.LIZIZ(this.itemView, "itemView.context")) {
            ((W5G) this.itemView.findViewById(R.id.bfv)).setActualImageResource(R.drawable.bie);
        } else {
            ((W5G) this.itemView.findViewById(R.id.bfv)).setActualImageResource(R.drawable.bif);
        }
        this.itemView.findViewById(R.id.bfv).setOnClickListener(new ViewOnClickListenerC13880ga(aCListenerS21S0100000_1));
        this.itemView.findViewById(R.id.abt).setOnClickListener(new ViewOnClickListenerC13880ga(aCListenerS21S0100000_1));
        h0.LJIJI(this.itemView, new IDaS88S0000000_1(6));
    }

    public SelectedListCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ContactListViewModel.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 402);
        C86915Y9f c86915Y9f = C86915Y9f.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86913Y9d.INSTANCE, new AqS165S0100000_15(this, 403), new AqS165S0100000_15(this, 404), C86917Y9h.INSTANCE, c86915Y9f, new AqS165S0100000_15(this, 405), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86914Y9e.INSTANCE, new AqS165S0100000_15(this, 406), new AqS165S0100000_15(this, 397), C86916Y9g.INSTANCE, c86915Y9f, new AqS165S0100000_15(this, 398), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86912Y9c.INSTANCE, new AqS165S0100000_15(this, 399), new AqS165S0100000_15(this, LiveChatShowDelayForHotLiveSetting.DEFAULT), new AqS165S0100000_15(this, 401), c86915Y9f, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91773iv c91773iv) {
        C91773iv contactListItem = c91773iv;
        o.LJIIIZ(contactListItem, "contactListItem");
        View view = this.itemView;
        C4AS.LJII((W5G) view.findViewById(R.id.abt), contactListItem.LJLIL.getDisplayAvatar(), "contactListView:onBindItemView", null, null, 0, 0, 504);
        ((TextView) view.findViewById(R.id.gw7)).setText(contactListItem.LJLIL.getDisplayName());
        this.itemView.setContentDescription(contactListItem.LJLIL.getDisplayName());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b2z, viewGroup, false, "from(parent.context)\n   …_headview, parent, false)");
    }
}
