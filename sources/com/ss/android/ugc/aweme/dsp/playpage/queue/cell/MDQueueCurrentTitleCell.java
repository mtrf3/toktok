package com.ss.android.ugc.aweme.dsp.playpage.queue.cell;

import X.C91511Zvn;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MDQueueCurrentTitleCell extends PowerCell<C91511Zvn> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ba;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91511Zvn c91511Zvn, List payloads) {
        C91511Zvn t = c91511Zvn;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        View view = this.itemView;
        String string = view.getResources().getString(t.LJLIL);
        o.LJIIIIZZ(string, "resources.getString(t.from)");
        ((TextView) view.findViewById(R.id.j7)).setText(view.getResources().getString(R.string.ihq, string));
    }
}
