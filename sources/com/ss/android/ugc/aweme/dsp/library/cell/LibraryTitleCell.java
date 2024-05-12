package com.ss.android.ugc.aweme.dsp.library.cell;

import X.C16880lQ;
import X.C79045V0n;
import X.C91505Zvh;
import X.SY4;
import X.T5R;
import Y.IDCListenerS84S0200000_29;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class LibraryTitleCell extends PowerCell<C91505Zvh> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b8;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91505Zvh c91505Zvh, List payloads) {
        int i;
        C91505Zvh t = c91505Zvh;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        View view = this.itemView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        T5R t5r = new T5R(view.getResources().getString(0));
        t5r.LIZ(33);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.go, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        t5r.setSpan(new ForegroundColorSpan(i), 0, t5r.length(), 17);
        spannableStringBuilder.append((CharSequence) t5r);
        ((TextView) view.findViewById(R.id.fqo)).setText(spannableStringBuilder);
        C16880lQ.LJJIZ((SY4) view.findViewById(R.id.ig), new IDCListenerS84S0200000_29(t, view, 5));
        throw null;
    }
}
