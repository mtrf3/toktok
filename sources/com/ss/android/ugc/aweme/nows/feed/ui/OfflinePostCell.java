package com.ss.android.ugc.aweme.nows.feed.ui;

import X.C110614Vt;
import X.C16880lQ;
import X.C1DI;
import X.C61328O5c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import q03.IDaS481S0100000_1;

/* loaded from: classes2.dex */
public final class OfflinePostCell extends PowerCell<Object> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View findViewById = this.itemView.findViewById(R.id.axz);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
        c110614Vt.LIZJ = C61328O5c.LIZJ(98);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        findViewById.setBackground(c110614Vt.LIZ(context));
        View findViewById2 = this.itemView.findViewById(R.id.axz);
        o.LJIIIIZZ(findViewById2, "itemView.btn_post");
        C16880lQ.LJIIJ(new IDaS481S0100000_1(this, 1), findViewById2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bxu, viewGroup, false, "from(parent.context)\n   …line_post, parent, false)");
    }
}
