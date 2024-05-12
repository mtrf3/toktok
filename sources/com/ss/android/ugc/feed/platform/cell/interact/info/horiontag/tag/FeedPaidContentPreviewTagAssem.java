package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C2055284u;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeedPaidContentPreviewTagAssem extends BaseCellSlotComponent<FeedPaidContentPreviewTagAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.adr;
    }

    public FeedPaidContentPreviewTagAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Y3().setVisibility(0);
        getContainerView().setVisibility(0);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.i3s);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.preview_tag)");
        C2055284u.LJFF((TuxTextView) findViewById);
    }
}
