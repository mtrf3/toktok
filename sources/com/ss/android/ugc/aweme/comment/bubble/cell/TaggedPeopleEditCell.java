package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C06490Nh;
import X.C16880lQ;
import X.C7BB;
import X.C88463da;
import X.EnumC1796673i;
import X.W5F;
import X.W5U;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TaggedPeopleEditCell extends PowerCell<C7BB> {
    public SmartImageView LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C7BB c7bb) {
        C7BB avatarItem = c7bb;
        o.LJIIIZ(avatarItem, "avatarItem");
        super.onBindItemView(avatarItem);
        W5F LJ = W5U.LJ(R.drawable.y8);
        LJ.LIZIZ("TaggedPeopleActionCell");
        LJ.LJJIIJ = this.LJLIL;
        C16880lQ.LLJJJ(LJ);
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(avatarItem, 267), this.itemView);
        C88463da.LIZJ(C88463da.LIZ, this.itemView, EnumC1796673i.BUTTON, 0.0f, 12);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.r6, viewGroup, false);
        this.LJLIL = (SmartImageView) LIZIZ.findViewById(R.id.abk);
        return LIZIZ;
    }
}
