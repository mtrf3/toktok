package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.AnonymousClass897;
import X.C1DI;
import X.C89P;
import X.C89Q;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LocationServicesFooterCell extends PowerCell<C89P> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C89P c89p) {
        C89P t = c89p;
        o.LJIIIZ(t, "t");
        TextView textView = (TextView) this.itemView.findViewById(R.id.mat);
        textView.setMovementMethod(new AnonymousClass897(C89Q.LJLIL));
        textView.setText(t.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.ah2, viewGroup, false, "from(parent.context)\n   …es_footer, parent, false)");
    }
}
