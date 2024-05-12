package com.ss.android.ugc.aweme.dsp.playpage.card.upsell;

import X.C16880lQ;
import X.C77123UOp;
import X.C78939UyV;
import X.C91249ZrZ;
import X.C91509Zvl;
import X.InterfaceC65784Pro;
import X.W5F;
import X.W5U;
import Y.IDCListenerS84S0200000_29;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class LandingPageMusicCell extends PowerCell<C91509Zvl> {
    public static final String LJLILLLLZI = C16880lQ.LJLLJ(C91509Zvl.class);
    public final SimpleDateFormat LJLIL = new SimpleDateFormat("MM/dd", Locale.getDefault());

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b6;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onCreate() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91509Zvl c91509Zvl, List payloads) {
        String string;
        C91509Zvl t = c91509Zvl;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.ja)).setText(t.LJLJI);
        ((TextView) view.findViewById(R.id.j_)).setText(t.LJLJJI);
        TextView textView = (TextView) view.findViewById(R.id.iz);
        long j = 0;
        if (t.LJLJL) {
            Resources resources = view.getResources();
            Object[] objArr = new Object[1];
            SimpleDateFormat simpleDateFormat = this.LJLIL;
            Long l = t.LJLJJL;
            if (l != null) {
                j = l.longValue();
            }
            objArr[0] = simpleDateFormat.format(Long.valueOf(j * 1000));
            string = resources.getString(R.string.ihd, objArr);
        } else if (t.LJLJLJ) {
            Resources resources2 = view.getResources();
            Object[] objArr2 = new Object[1];
            Long l2 = t.LJLJJLL;
            if (l2 != null) {
                j = l2.longValue();
            }
            objArr2[0] = C77123UOp.LJJIIJ(j);
            string = resources2.getString(R.string.ih7, objArr2);
        } else {
            Resources resources3 = view.getResources();
            Object[] objArr3 = new Object[1];
            Long l3 = t.LJLJJLL;
            if (l3 != null) {
                j = l3.longValue();
            }
            objArr3[0] = C77123UOp.LJJIIJ(j);
            string = resources3.getString(R.string.ih7, objArr3);
        }
        textView.setText(string);
        W5F LJII = W5U.LJII(C78939UyV.LJ(t.LJLILLLLZI));
        LJII.LIZIZ(LJLILLLLZI);
        LJII.LJJIIJ = (SmartImageView) view.findViewById(R.id.it);
        C16880lQ.LLJJJ(LJII);
        C16880lQ.LJIIJ(new IDCListenerS84S0200000_29(view, t, 8), view);
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = t.LJLLILLLL;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            C91249ZrZ.LJ("track", t.LJLIL);
        }
    }
}
