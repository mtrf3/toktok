package com.ss.android.ugc.aweme.shortvideo.cut.model;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes15.dex */
public final class ScrollInterceptedLayoutManager extends LinearLayoutManager {
    public boolean LLIIIJ;

    public ScrollInterceptedLayoutManager() {
        super(0, false);
        this.LLIIIJ = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final boolean LJIJJLI() {
        if (super.LJIJJLI() && this.LLIIIJ) {
            return true;
        }
        return false;
    }

    public ScrollInterceptedLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LLIIIJ = true;
    }
}
