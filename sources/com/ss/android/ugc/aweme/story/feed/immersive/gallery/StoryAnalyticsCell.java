package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C7X8;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryAnalyticsCell extends PowerCell<C7X8> {
    public TuxTextView LJLIL;
    public TuxTextView LJLILLLLZI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.coe;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LJLIL = (TuxTextView) this.itemView.findViewById(R.id.n7);
        this.LJLILLLLZI = (TuxTextView) this.itemView.findViewById(R.id.dl9);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C7X8 c7x8) {
        C7X8 t = c7x8;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(String.valueOf(t.LJLIL));
        }
        TuxTextView tuxTextView2 = this.LJLILLLLZI;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setText(String.valueOf(t.LJLILLLLZI));
    }
}
