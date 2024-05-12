package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C78857UxB;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrendingBottomBarAssem extends BaseCellSlotComponent<TrendingBottomBarAssem> {
    public ViewGroup LLFII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aez;
    }

    public TrendingBottomBarAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C78857UxB.LJJJJL(item);
        ViewGroup viewGroup = this.LLFII;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = (ViewGroup) view.findViewById(R.id.aqo);
    }
}
