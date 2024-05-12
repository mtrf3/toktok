package com.ss.android.ugc.aweme.music.highlight.cell.assem;

import X.C7MY;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightSelectMusicCoverAssem extends DefaultCoverAssem {
    public HighlightSelectMusicCoverAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View Y3 = Y3();
        ViewGroup.LayoutParams layoutParams = Y3.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C7MY.LIZIZ(64);
            layoutParams.height = C7MY.LIZIZ(64);
            Y3.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
