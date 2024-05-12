package com.ss.android.ugc.feed.platform.cell.interact.top.topwarn;

import X.C210018Mb;
import X.C210428Nq;
import X.C3C8;
import X.C65352Pkq;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopWarnTrigger extends BaseCellTriggerComponent<TopWarnTrigger> {
    public static final /* synthetic */ int LLF = 0;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(TopWarnComponent.class);
    }

    public TopWarnTrigger() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean b4(BaseFeedPageParams baseFeedPageParams) {
        return C210428Nq.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        return C210018Mb.LIZIZ(aweme);
    }
}
