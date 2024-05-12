package com.ss.android.ugc.aweme.search.detail.filter.component.cell;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FilterVideoAuthorInfoRelationAssem extends VideoAuthorInfoRelationAssem {
    public FilterVideoAuthorInfoRelationAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.title);
        if ((findViewById instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) findViewById) != null) {
            tuxTextView2.setTuxFont(32);
        }
        View findViewById2 = view.findViewById(R.id.mem);
        if ((findViewById2 instanceof TuxTextView) && (tuxTextView = (TuxTextView) findViewById2) != null) {
            tuxTextView.setTuxFont(52);
        }
    }
}
