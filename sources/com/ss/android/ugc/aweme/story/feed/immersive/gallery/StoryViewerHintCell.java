package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C182067Co;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryViewerHintCell extends PowerCell<C182067Co> {
    public TuxTextView LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cog;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LJLIL = (TuxTextView) this.itemView.findViewById(R.id.e5x);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C182067Co c182067Co) {
        C182067Co t = c182067Co;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(this.itemView.getContext().getString(t.LJLIL));
    }
}
