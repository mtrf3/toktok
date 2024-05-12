package com.ss.android.ugc.aweme.story.feed.immersive.config;

import X.C3C8;
import X.C59542Vi;
import X.C77123UOp;
import X.C8O4;
import X.C8VV;
import X.M89;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.config.StoryCommonCellConfig;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryImmersiveFeedCellConfig extends StoryCommonCellConfig {
    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean LJIILL(C8O4 cellCtx) {
        BaseFeedPageParams baseFeedPageParams;
        M89 m89;
        String from;
        o.LJIIIZ(cellCtx, "cellCtx");
        if (!o.LJ(cellCtx.LIZ(), "cell_story_immersive_feed") || !C59542Vi.LIZ() || (baseFeedPageParams = cellCtx.LJ) == null || (m89 = baseFeedPageParams.param) == null || (from = m89.getFrom()) == null || !C77123UOp.LJJIJIIJIL(from)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.config.StoryCommonCellConfig
    public final void LIZ(BaseCellContentComponent<? extends C3C8> baseCellContentComponent, C8O4 cellContext) {
        o.LJIIIZ(baseCellContentComponent, "<this>");
        o.LJIIIZ(cellContext, "cellContext");
        C8VV.LIZLLL(baseCellContentComponent, new AqS134S0200000_3(baseCellContentComponent, cellContext, 152));
    }
}
