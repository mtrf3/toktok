package com.ss.android.ugc.aweme.tag;

import X.C7GV;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeedTextModeVideoTagAssem extends BaseCellSlotComponent<FeedTextModeVideoTagAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cq9;
    }

    public FeedTextModeVideoTagAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        getContainerView().setVisibility(0);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C7GV.LIZ(4, view.findViewById(R.id.l4t));
    }
}
