package com.ss.android.ugc.aweme.dsp.playpage.queue.cell;

import X.C16880lQ;
import X.C78939UyV;
import X.C79045V0n;
import X.C91513Zvp;
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
public final class MDQueueNextMusicCell extends PowerCell<C91513Zvp> {
    public static final String LJLIL = C16880lQ.LJLLJ(MDQueueNextMusicCell.class);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bc;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91513Zvp c91513Zvp, List payloads) {
        float f;
        int i;
        int i2;
        C91513Zvp t = c91513Zvp;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.j5)).setText(t.LJLJI);
        ((TextView) view.findViewById(R.id.j2)).setText(t.LJLJJI);
        W5F LJII = W5U.LJII(C78939UyV.LJ(t.LJLILLLLZI));
        LJII.LIZIZ(LJLIL);
        LJII.LJJIIJ = (SmartImageView) view.findViewById(R.id.j4);
        C16880lQ.LLJJJ(LJII);
        boolean z = t.LJLJJL;
        View view2 = this.itemView;
        View findViewById = view2.findViewById(R.id.j4);
        if (z) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        findViewById.setAlpha(f);
        TextView textView = (TextView) view2.findViewById(R.id.j5);
        Context context = view2.getContext();
        o.LJIIIIZZ(context, "context");
        int i3 = R.attr.gv;
        if (z) {
            i = R.attr.gv;
        } else {
            i = R.attr.go;
        }
        Integer LJI = C79045V0n.LJI(i, context);
        int i4 = 0;
        if (LJI != null) {
            i2 = LJI.intValue();
        } else {
            i2 = 0;
        }
        textView.setTextColor(i2);
        TextView textView2 = (TextView) view2.findViewById(R.id.j2);
        Context context2 = view2.getContext();
        o.LJIIIIZZ(context2, "context");
        if (z) {
            i3 = R.attr.gp;
        }
        Integer LJI2 = C79045V0n.LJI(i3, context2);
        if (LJI2 != null) {
            i4 = LJI2.intValue();
        }
        textView2.setTextColor(i4);
        C16880lQ.LJIIJ(new IDCListenerS84S0200000_29(t, view, 4), view);
    }
}
