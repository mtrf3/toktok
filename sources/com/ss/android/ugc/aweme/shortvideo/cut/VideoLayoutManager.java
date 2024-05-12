package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C0AC;
import X.C78051UkB;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VideoLayoutManager extends LinearLayoutManager {
    public final C78051UkB LLIIIJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoLayoutManager(Context context) {
        super(0, false);
        o.LJIIIZ(context, "context");
        this.LLIIIJ = new C78051UkB(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C78051UkB c78051UkB = this.LLIIIJ;
        c78051UkB.LIZ = i;
        LLIIIILZ(c78051UkB);
    }
}
