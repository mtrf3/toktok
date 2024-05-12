package com.ss.android.ugc.aweme.dsp.playpage.queue.cell;

import X.C16880lQ;
import X.C17N;
import X.C29701Eo;
import X.C78939UyV;
import X.C91510Zvm;
import X.EnumC91310ZsY;
import X.KL2;
import X.W5F;
import X.W5U;
import Y.IDCListenerS137S0100000_29;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MDQueueCurrentMusicCell extends PowerCell<C91510Zvm> {
    public static final String LJLIL = C16880lQ.LJLLJ(MDQueueCurrentMusicCell.class);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b_;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onCreate() {
        View view = this.itemView;
        View findViewById = view.findViewById(R.id.j8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(KL2.LJIIJJI(view.getContext()) - C17N.LJIILL(142.0d), -1);
        layoutParams.setMarginStart(C17N.LJIILL(12.0d));
        findViewById.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91510Zvm c91510Zvm, List payloads) {
        C91510Zvm t = c91510Zvm;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.j5)).setText(t.LJLJI);
        ((TextView) view.findViewById(R.id.j2)).setText(t.LJLJJI);
        W5F LJII = W5U.LJII(C78939UyV.LJ(t.LJLILLLLZI));
        LJII.LIZIZ(LJLIL);
        LJII.LJJIIJ = (SmartImageView) view.findViewById(R.id.j4);
        C16880lQ.LLJJJ(LJII);
        EnumC91310ZsY enumC91310ZsY = t.LJLJJL;
        View view2 = this.itemView;
        if (enumC91310ZsY.isPlayingState()) {
            C29701Eo c29701Eo = (C29701Eo) view2.findViewById(R.id.j9);
            c29701Eo.setVisibility(0);
            c29701Eo.playAnimation();
            ((TuxIconView) view2.findViewById(R.id.j6)).setIconRes(R.raw.icon_pause_fill);
            ((ImageView) view2.findViewById(R.id.j6)).setVisibility(0);
        } else if (enumC91310ZsY.isPauseState()) {
            C29701Eo c29701Eo2 = (C29701Eo) view2.findViewById(R.id.j9);
            c29701Eo2.setVisibility(0);
            c29701Eo2.setProgress(0.3f);
            c29701Eo2.pauseAnimation();
            ((TuxIconView) view2.findViewById(R.id.j6)).setIconRes(R.raw.icon_play_fill);
            ((ImageView) view2.findViewById(R.id.j6)).setVisibility(0);
        } else {
            ((ImageView) view2.findViewById(R.id.j9)).setVisibility(4);
            ((ImageView) view2.findViewById(R.id.j6)).setVisibility(4);
        }
        C16880lQ.LJJIJLIJ((SmartImageView) view.findViewById(R.id.j4), new IDCListenerS137S0100000_29(t, 11));
    }
}
