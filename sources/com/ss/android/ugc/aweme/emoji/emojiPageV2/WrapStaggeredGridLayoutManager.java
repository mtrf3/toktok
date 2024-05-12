package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import X.C0A7;
import X.C0AC;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes2.dex */
public class WrapStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public WrapStaggeredGridLayoutManager() {
        super(3, 1);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            LLJ(c0a7, c0ac, true);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return LLJJI(i, c0a7, c0ac);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public WrapStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
