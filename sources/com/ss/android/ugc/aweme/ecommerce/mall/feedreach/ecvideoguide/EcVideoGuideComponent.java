package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide;

import X.C3C8;
import X.C52933Kq1;
import X.C65352Pkq;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class EcVideoGuideComponent extends BaseCellTriggerComponent<EcVideoGuideComponent> {
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(EcVideoGuideAssem.class);
    }

    public EcVideoGuideComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (!aweme.isAd() && !aweme.isSelfSee() && (aweme.productRecallType > 0 || (ECommerceAnchorService.LJJJJI().LJJJ(aweme) && C52933Kq1.LIZ()))) {
            return true;
        }
        return false;
    }
}
