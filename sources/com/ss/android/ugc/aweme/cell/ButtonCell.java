package com.ss.android.ugc.aweme.cell;

import X.AEL;
import X.AEM;
import X.C16880lQ;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ButtonCell extends TuxCell<AEL, AEM> {
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final AEM N(Context context) {
        AEM aem = new AEM(context, null);
        aem.LJIIJJI(new ACListenerS24S0100000_4(this, 330));
        return aem;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: Q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onBindItemView(AEL t) {
        String str;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        AEM aem = (AEM) this.LJLIL;
        if (aem != null) {
            if (t.LLIFFJFJJ) {
                str = "";
            } else {
                str = t.LJZI;
            }
            aem.LJIIL(str);
        }
        AEM aem2 = (AEM) this.LJLIL;
        if (aem2 != null) {
            aem2.LIZIZ.setButtonVariant(t.LJZL);
        }
        if (t.LLIIIILZ) {
            C16880lQ.LJIIJ(new ACListenerS39S0200000_4(t, this, 8), this.itemView.findViewById(R.id.b86));
        }
    }
}
