package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui;

import X.C110444Vc;
import X.C119604mi;
import X.C16880lQ;
import X.C1DI;
import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC62225ObV;
import X.SYL;
import Y.ACListenerS24S1200000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupShareChannelDelegate {
    public final SYL LIZ;

    /* loaded from: classes2.dex */
    public static final class ShareChannelCell extends PowerCell<C110444Vc> {
        public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 636));
        public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 635));

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onBindItemView(C110444Vc c110444Vc) {
            C110444Vc shareGroupItem = c110444Vc;
            o.LJIIIZ(shareGroupItem, "shareGroupItem");
            InterfaceC62225ObV interfaceC62225ObV = shareGroupItem.LJLIL;
            String label = interfaceC62225ObV.label();
            C119604mi c119604mi = (C119604mi) this.itemView.findViewById(R.id.jsx);
            o.LJIIIIZZ(c119604mi, "itemView.share_channel_icon");
            interfaceC62225ObV.LJ(c119604mi, false);
            ((TextView) this.itemView.findViewById(R.id.jsy)).setText(label);
            C16880lQ.LJIIJ(new ACListenerS24S1200000_1(this, interfaceC62225ObV, label, 0), this.itemView);
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup viewGroup) {
            return C1DI.LIZ(viewGroup, "parent", R.layout.b62, viewGroup, false, "from(parent.context)\n   …_bar_item, parent, false)");
        }
    }

    public GroupShareChannelDelegate(SYL syl) {
        this.LIZ = syl;
        syl.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        syl.setLayoutManager(linearLayoutManager);
        syl.LLLF.LJZL(ShareChannelCell.class);
    }
}
