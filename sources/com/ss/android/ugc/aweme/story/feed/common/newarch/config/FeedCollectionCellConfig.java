package com.ss.android.ugc.aweme.story.feed.common.newarch.config;

import X.C3C8;
import X.C59542Vi;
import X.C8O4;
import X.C8VV;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.DefaultCellConfig;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedCollectionCellConfig extends DefaultCellConfig {
    @Override // com.ss.android.ugc.feed.platform.cell.DefaultCellConfig, com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean LJIILL(C8O4 cellCtx) {
        o.LJIIIZ(cellCtx, "cellCtx");
        if (o.LJ(cellCtx.LIZ(), "cell_story") && C59542Vi.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.DefaultCellConfig, com.ss.android.ugc.feed.platform.cell.CellConfig
    public final void LIZ(BaseCellContentComponent<? extends C3C8> baseCellContentComponent, C8O4 cellCtx) {
        o.LJIIIZ(baseCellContentComponent, "<this>");
        o.LJIIIZ(cellCtx, "cellCtx");
        C8VV.LIZLLL(baseCellContentComponent, new AqS169S0100000_3((BaseCellContentComponent) baseCellContentComponent, (BaseCellContentComponent<? extends C3C8>) 439));
    }
}
