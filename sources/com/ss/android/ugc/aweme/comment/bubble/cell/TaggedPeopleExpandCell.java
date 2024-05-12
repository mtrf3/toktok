package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C06490Nh;
import X.C16880lQ;
import X.C78886Uxe;
import X.C7BH;
import X.C88463da;
import X.EnumC1796673i;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TaggedPeopleExpandCell extends PowerCell<C7BH> {
    public TuxTextView LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C7BH c7bh) {
        C7BH avatarItem = c7bh;
        o.LJIIIZ(avatarItem, "avatarItem");
        super.onBindItemView(avatarItem);
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            C78886Uxe.LJJLIIIJJI(tuxTextView);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('+');
        LIZ.append((avatarItem.LJLIL - avatarItem.LJLILLLLZI) + 2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        TuxTextView tuxTextView2 = this.LJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(LIZIZ);
        }
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(avatarItem, 268), this.itemView);
        C88463da.LIZJ(C88463da.LIZ, this.itemView, EnumC1796673i.BUTTON, 0.0f, 12);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.r8, viewGroup, false);
        this.LJLIL = (TuxTextView) LIZIZ.findViewById(R.id.d1f);
        return LIZIZ;
    }
}
