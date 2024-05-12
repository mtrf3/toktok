package com.ss.android.ugc.aweme.dsp.playpage.card.upsell;

import X.C16880lQ;
import X.C78939UyV;
import X.C91249ZrZ;
import X.C91508Zvk;
import X.C91509Zvl;
import X.InterfaceC65784Pro;
import X.W5F;
import X.W5U;
import Y.IDCListenerS84S0200000_29;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class LandingPageArtistCell extends PowerCell<C91508Zvk> {
    public static final String LJLIL = C16880lQ.LJLLJ(C91509Zvl.class);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b5;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onCreate() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91508Zvk c91508Zvk, List payloads) {
        String quantityString;
        C91508Zvk t = c91508Zvk;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.io)).setText(t.LJLJI);
        TextView textView = (TextView) view.findViewById(R.id.iv);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "this.context");
        Long valueOf = Long.valueOf(t.LJLJJI);
        if (valueOf == null) {
            quantityString = "";
        } else {
            quantityString = context.getResources().getQuantityString(R.plurals.j3, (int) valueOf.longValue(), valueOf);
            o.LJIIIIZZ(quantityString, "this.resources.getQuanti…         count,\n        )");
        }
        textView.setText(quantityString);
        W5F LJII = W5U.LJII(C78939UyV.LJ(t.LJLILLLLZI));
        LJII.LIZIZ(LJLIL);
        LJII.LJIIJJI = R.drawable.b7n;
        LJII.LJJIJIIJIL = true;
        LJII.LJJIIJ = (SmartImageView) view.findViewById(R.id.in);
        C16880lQ.LLJJJ(LJII);
        C16880lQ.LJIIJ(new IDCListenerS84S0200000_29(view, t, 7), view);
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = t.LJLJLJ;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            C91249ZrZ.LJ("artist", t.LJLIL);
        }
    }
}
