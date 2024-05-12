package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C16880lQ;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import q03.IDaS202S0200000_9;

/* loaded from: classes10.dex */
public final class StoryCameraEntranceComponent extends BaseCellSlotComponent<StoryCameraEntranceComponent> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.coj;
    }

    public StoryCameraEntranceComponent() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C16880lQ.LJIIJ(new IDaS202S0200000_9(this, view, 1), view);
    }
}
