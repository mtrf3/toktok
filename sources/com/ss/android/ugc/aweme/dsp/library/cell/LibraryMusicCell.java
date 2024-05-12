package com.ss.android.ugc.aweme.dsp.library.cell;

import X.C16880lQ;
import X.C17N;
import X.C78929UyL;
import X.C78939UyV;
import X.C91504Zvg;
import X.KL2;
import X.W5F;
import X.W5U;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class LibraryMusicCell extends PowerCell<C91504Zvg> {
    public static final String LJLIL = C16880lQ.LJLLJ(LibraryMusicCell.class);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b7;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onCreate() {
        View view = this.itemView;
        View findViewById = view.findViewById(R.id.if);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(KL2.LJIIJJI(view.getContext()) - C17N.LJIILL(142.0d), -1);
        layoutParams.setMarginStart(C17N.LJIILL(12.0d));
        findViewById.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91504Zvg t, List payloads) {
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.ie)).setText((CharSequence) null);
        ((TextView) view.findViewById(R.id.ib)).setText((CharSequence) null);
        ((TextView) view.findViewById(R.id.ic)).setText(C78929UyL.LJIIIZ(0));
        W5F LJII = W5U.LJII(C78939UyV.LJ(null));
        LJII.LIZIZ(LJLIL);
        LJII.LJJIIJ = (SmartImageView) view.findViewById(R.id.id);
        C16880lQ.LLJJJ(LJII);
        throw null;
    }
}
