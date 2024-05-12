package com.ss.android.ugc.aweme.story.feed.common.newarch.config;

import X.C3C8;
import X.C8NA;
import X.C8O4;
import X.C8VV;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class StoryCommonCellConfig implements StoryCellConfigurationProtocol {
    public void LIZ(BaseCellContentComponent<? extends C3C8> baseCellContentComponent, C8O4 cellContext) {
        o.LJIIIZ(baseCellContentComponent, "<this>");
        o.LJIIIZ(cellContext, "cellContext");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final void LJJLIIIJ(BaseCellContentComponent<? extends C3C8> component, C8O4 cellCtx) {
        o.LJIIIZ(component, "component");
        o.LJIIIZ(cellCtx, "cellCtx");
        C8VV.LIZLLL(component, C8NA.LJLIL);
        LIZ(component, cellCtx);
    }
}
