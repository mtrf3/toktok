package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.common;

import X.C025908h;
import X.C16880lQ;
import X.C2068389v;
import X.C7MY;
import X.C94613nV;
import Y.ACListenerS21S0100000_1;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupDetailSeeMoreFooter extends PowerCell<C94613nV> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b9q;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C94613nV c94613nV) {
        C94613nV t = c94613nV;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        Integer num = t.LJLILLLLZI;
        if (num != null) {
            ((TextView) this.itemView.findViewById(R.id.efr)).setText(this.itemView.getContext().getResources().getQuantityString(t.LJLIL, num.intValue(), num));
        } else {
            ((TextView) this.itemView.findViewById(R.id.efr)).setText(this.itemView.getContext().getString(t.LJLIL));
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_chevron_down_fill;
        c2068389v.LIZIZ = C7MY.LIZIZ(16);
        c2068389v.LIZJ = C7MY.LIZIZ(16);
        c2068389v.LJ = Integer.valueOf(R.attr.gv);
        ((AppCompatTextView) this.itemView.findViewById(R.id.efr)).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C025908h.LIZJ(this.itemView, "itemView.context", c2068389v), (Drawable) null);
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(t, 138), this.itemView);
    }
}
