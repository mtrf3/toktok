package com.ugc.effectcreator.foundation.widgets.hook;

import X.C0A7;
import X.C0AC;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public WrapContentLinearLayoutManager(Context context) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        o.LJIIIZ(context, "context");
    }
}
