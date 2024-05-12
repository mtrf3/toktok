package com.ss.android.ugc.aweme.cell;

import X.AD3;
import X.AD5;
import X.AI8;
import X.C16880lQ;
import X.C2068389v;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LabelCell extends TuxCell<AD3, AD5> {
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final AD5 N(Context context) {
        AD5 ad5 = new AD5(context, null);
        C16880lQ.LJJJJI(ad5.LIZIZ, new ACListenerS24S0100000_4(this, 333));
        return ad5;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(AD3 t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        AD5 ad5 = (AD5) this.LJLIL;
        if (ad5 != null) {
            ad5.LIZIZ.setText(t.LJZI);
        }
        String str = t.LL;
        if (str != null) {
            ((AI8) this.itemView.findViewById(R.id.b85)).setIcon(new AqS29S1000000_4(str, 9));
        }
        C2068389v c2068389v = t.LLD;
        if (c2068389v != null) {
            ((AI8) this.itemView.findViewById(R.id.b85)).setIcon(new AqS170S0100000_4(c2068389v, 150));
        }
        ((AI8) this.itemView.findViewById(R.id.b85)).setShowAlertBadge(t.LJZL);
    }
}
