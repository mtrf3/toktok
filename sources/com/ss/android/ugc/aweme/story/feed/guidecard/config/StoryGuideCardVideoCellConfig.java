package com.ss.android.ugc.aweme.story.feed.guidecard.config;

import X.C3C8;
import X.C8O4;
import X.C8VR;
import com.ss.android.ugc.aweme.story.feed.common.newarch.config.StoryCellConfigurationProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGuideCardVideoCellConfig implements StoryCellConfigurationProtocol {
    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean LJIILL(C8O4 cellCtx) {
        o.LJIIIZ(cellCtx, "cellCtx");
        return o.LJ(cellCtx.LIZ(), "cell_story_guide_card_video");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final void LJJLIIIJ(BaseCellContentComponent<? extends C3C8> component, C8O4 cellCtx) {
        o.LJIIIZ(component, "component");
        o.LJIIIZ(cellCtx, "cellCtx");
        C8VR.LIZ(component, new AqS169S0100000_3((BaseCellContentComponent) component, (BaseCellContentComponent<? extends C3C8>) 850));
        C8VR.LIZ(component, new AqS169S0100000_3((BaseCellContentComponent) component, (BaseCellContentComponent<? extends C3C8>) 447));
    }
}
