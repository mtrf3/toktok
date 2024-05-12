package com.ss.android.ugc.gamora.editor.audioservice.businessui.speechtosong.base;

import X.C0AC;
import X.C78052UkC;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CenterSelectionLayoutManager extends LinearLayoutManager {
    public CenterSelectionLayoutManager() {
        super(0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC state, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(state, "state");
        C78052UkC c78052UkC = new C78052UkC(recyclerView.getContext());
        c78052UkC.LIZ = i;
        LLIIIILZ(c78052UkC);
    }

    public CenterSelectionLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
