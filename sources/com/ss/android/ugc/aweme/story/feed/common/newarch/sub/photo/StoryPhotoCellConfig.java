package com.ss.android.ugc.aweme.story.feed.common.newarch.sub.photo;

import X.C3C8;
import X.C8O4;
import X.C8VV;
import com.ss.android.ugc.aweme.story.feed.common.newarch.config.StoryCommonCellConfig;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryPhotoCellConfig extends StoryCommonCellConfig {
    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean LJIILL(C8O4 cellCtx) {
        o.LJIIIZ(cellCtx, "cellCtx");
        return o.LJ(cellCtx.LIZ(), "cell_story_photo");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.config.StoryCommonCellConfig
    public final void LIZ(BaseCellContentComponent<? extends C3C8> baseCellContentComponent, C8O4 cellContext) {
        o.LJIIIZ(baseCellContentComponent, "<this>");
        o.LJIIIZ(cellContext, "cellContext");
        C8VV.LIZLLL(baseCellContentComponent, new AqS169S0100000_3((BaseCellContentComponent) baseCellContentComponent, (BaseCellContentComponent<? extends C3C8>) 442));
    }
}
