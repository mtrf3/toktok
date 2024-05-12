package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C117114ih;
import X.C118204kS;
import X.C79081V1x;
import X.OUP;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CCDCTipsViewHolder extends PowerCell<C118204kS> {
    public CCDCTipsViewHolder() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C118204kS c118204kS) {
        C118204kS t = c118204kS;
        o.LJIIIZ(t, "t");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.bn_, new C117114ih(C79081V1x.LJII(20), 0, 0, 0, false, 0, true, 254));
        ((TextView) this.itemView.findViewById(R.id.lyb)).setText(t.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return OUP.LJIL(R.layout.zp, parent, false);
    }
}
