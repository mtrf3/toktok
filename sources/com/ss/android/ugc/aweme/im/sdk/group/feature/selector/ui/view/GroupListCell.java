package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import X.C16880lQ;
import X.C1DI;
import X.C221108m2;
import X.C45S;
import X.C62822Ol8;
import X.C78897Uxp;
import X.C78939UyV;
import X.C91713ip;
import X.W5F;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupListCell extends PowerCell<C91713ip> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 650));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 100), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91713ip c91713ip) {
        C91713ip groupListItem = c91713ip;
        o.LJIIIZ(groupListItem, "groupListItem");
        View view = this.itemView;
        view.findViewById(R.id.bs4).setVisibility(8);
        W5F LJ = C45S.LJ((SmartImageView) view.findViewById(R.id.acf), C78939UyV.LJ(groupListItem.LJLIL.getDisplayAvatar()), 0, 0, null, 28);
        LJ.LJJIJIIJIL = true;
        C16880lQ.LLJJJ(LJ);
        ((TextView) view.findViewById(R.id.gw7)).setText(groupListItem.LJLIL.getDisplayName());
        ((TextView) view.findViewById(R.id.c9f)).setText(view.getContext().getResources().getQuantityString(R.plurals.g9, groupListItem.LJLIL.getConversationMemberCount(), Integer.valueOf(groupListItem.LJLIL.getConversationMemberCount())));
        C78897Uxp.LJJJJJL(view, 0.0f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b3_, viewGroup, false, "from(parent.context)\n   …t_contact, parent, false)");
    }
}
