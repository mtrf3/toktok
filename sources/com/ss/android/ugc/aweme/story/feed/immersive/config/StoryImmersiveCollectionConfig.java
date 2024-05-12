package com.ss.android.ugc.aweme.story.feed.immersive.config;

import X.C3C8;
import X.C8O4;
import X.C8VR;
import com.ss.android.ugc.aweme.story.feed.common.newarch.config.StoryCommonCellConfig;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryImmersiveCollectionConfig extends StoryCommonCellConfig {
    public final String[] LJLIL = {"STORY_ENTRANCE_INBOX_TOP_LIST", "STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST", "STORY_ENTRANCE_FEED_TOP_LIST", "STORY_ENTRANCE_GUIDE_CARD"};

    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean LJIILL(C8O4 cellCtx) {
        o.LJIIIZ(cellCtx, "cellCtx");
        return o.LJ(cellCtx.LIZ(), "cell_story_immersive_collection");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.config.StoryCommonCellConfig
    public final void LIZ(BaseCellContentComponent<? extends C3C8> baseCellContentComponent, C8O4 cellContext) {
        o.LJIIIZ(baseCellContentComponent, "<this>");
        o.LJIIIZ(cellContext, "cellContext");
        C8VR.LIZ(baseCellContentComponent, new AqS107S0300000_3((BaseCellContentComponent) baseCellContentComponent, (BaseCellContentComponent<? extends C3C8>) this, (StoryImmersiveCollectionConfig) cellContext, (C8O4) 20));
        C8VR.LIZ(baseCellContentComponent, new AqS169S0100000_3((BaseCellContentComponent) baseCellContentComponent, (BaseCellContentComponent<? extends C3C8>) 1000));
    }
}
