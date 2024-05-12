package com.ss.android.ugc.aweme.api.component;

import X.C242549fW;
import X.C3C8;
import X.C8O4;
import X.C8VR;
import X.X1D;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.DefaultCellConfig;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommerceVideoCellConfig extends DefaultCellConfig {
    @Override // com.ss.android.ugc.feed.platform.cell.DefaultCellConfig, com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean LJIILL(C8O4 cellCtx) {
        o.LJIIIZ(cellCtx, "cellCtx");
        return o.LJ("cell_commerce", cellCtx.LIZ());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.DefaultCellConfig, com.ss.android.ugc.feed.platform.cell.CellConfig
    public final void LIZ(BaseCellContentComponent<? extends C3C8> baseCellContentComponent, C8O4 cellCtx) {
        o.LJIIIZ(baseCellContentComponent, "<this>");
        o.LJIIIZ(cellCtx, "cellCtx");
        C8VR.LIZ(baseCellContentComponent, new AqS169S0100000_3((BaseCellContentComponent) baseCellContentComponent, (BaseCellContentComponent<? extends C3C8>) 61));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("applyExtraComponent cellType = ");
        LIZ.append(cellCtx.LIZ());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }
}
