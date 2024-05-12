package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C3C8;
import X.C65352Pkq;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.assem.contentclassificationmask.ContentClassificationMaskAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ContentClassificationMaskTrigger extends BaseCellTriggerComponent<ContentClassificationMaskTrigger> {
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(ContentClassificationMaskAssem.class);
    }

    public ContentClassificationMaskTrigger() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        VideoMaskInfo contentClassificationMaskInfo = item.getAweme().getContentClassificationMaskInfo();
        if (contentClassificationMaskInfo != null) {
            return o.LJ(contentClassificationMaskInfo.getShowMask(), Boolean.TRUE);
        }
        return false;
    }
}