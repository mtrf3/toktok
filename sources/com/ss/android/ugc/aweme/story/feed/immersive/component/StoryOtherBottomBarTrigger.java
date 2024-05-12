package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.AV1;
import X.C3C8;
import X.C65352Pkq;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryOtherBottomBarTrigger extends BaseStoryBottomBarTrigger<StoryOtherBottomBarTrigger> {
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(StoryOtherBottomBarComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.config.StoryBottomBarProtocol
    public final int priority() {
        return 11;
    }

    public StoryOtherBottomBarTrigger() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return !AV1.LJIJ(item.getAweme().getAuthor());
    }
}
