package com.ss.android.ugc.aweme.emoji.sysemoji;

import X.C0A7;
import X.C0AC;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes2.dex */
public class WrapGridLayoutManager extends GridLayoutManager {
    public WrapGridLayoutManager(int i) {
        super(i, 1, false);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
