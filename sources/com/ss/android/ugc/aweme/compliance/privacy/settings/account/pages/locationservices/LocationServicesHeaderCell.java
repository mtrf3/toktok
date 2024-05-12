package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.C1DI;
import X.C78W;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LocationServicesHeaderCell extends PowerCell<C78W> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C78W c78w) {
        C78W t = c78w;
        o.LJIIIZ(t, "t");
        ((TextView) this.itemView.findViewById(R.id.mau)).setText(t.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.ah4, viewGroup, false, "from(parent.context)\n   …es_header, parent, false)");
    }
}
