package com.ss.android.ugc.aweme.setting.ui.cell;

import X.AES;
import X.C16880lQ;
import X.C1DI;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.cell.BaseCell;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class SettingUnLoginCell extends BaseCell<AES> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 181), this.itemView);
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View L(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cl7, viewGroup, false, "from(parent.context).inf…           parent, false)");
    }
}
