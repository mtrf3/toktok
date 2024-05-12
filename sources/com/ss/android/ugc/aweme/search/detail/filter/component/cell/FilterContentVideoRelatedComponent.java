package com.ss.android.ugc.aweme.search.detail.filter.component.cell;

import X.C8VR;
import Y.ARunnableS22S0200000_3;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FilterContentVideoRelatedComponent extends BaseCellSlotComponent<FilterContentVideoRelatedComponent> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cfm;
    }

    public FilterContentVideoRelatedComponent() {
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
        C8VR.LIZ(this, new AqS169S0100000_3(this, 413));
        View findViewById = view.findViewById(R.id.ddd);
        if (findViewById != null) {
            findViewById.post(new ARunnableS22S0200000_3(findViewById, this, 23));
        }
    }
}
