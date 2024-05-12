package com.ss.android.ugc.feed.platform.cell;

import X.C3C8;
import X.C8O4;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class DefaultCellConfig extends CellConfig {
    @Override // com.ss.android.ugc.feed.platform.cell.CellConfig
    public void LIZ(BaseCellContentComponent<? extends C3C8> baseCellContentComponent, C8O4 cellCtx) {
        o.LJIIIZ(baseCellContentComponent, "<this>");
        o.LJIIIZ(cellCtx, "cellCtx");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public boolean LJIILL(C8O4 cellCtx) {
        o.LJIIIZ(cellCtx, "cellCtx");
        return true;
    }
}
