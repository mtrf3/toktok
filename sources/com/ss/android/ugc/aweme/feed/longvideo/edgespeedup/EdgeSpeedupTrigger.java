package com.ss.android.ugc.aweme.feed.longvideo.edgespeedup;

import X.C3C8;
import X.C65352Pkq;
import X.C8OB;
import X.IFH;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class EdgeSpeedupTrigger extends BaseCellTriggerComponent<EdgeSpeedupTrigger> {
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(EdgeSpeedupAssem.class);
    }

    public EdgeSpeedupTrigger() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (C8OB.LIZ() && IFH.LIZ(item.getAweme())) {
            return true;
        }
        return false;
    }
}
