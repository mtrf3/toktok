package com.ss.android.ugc.feed.platform.cell;

import X.C3C8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8O4;
import X.C8VR;
import android.view.View;
import com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class CellConfig implements ICellConfigurationProtocol {
    public InteractAreaComponent LJLIL;

    public abstract void LIZ(BaseCellContentComponent<? extends C3C8> baseCellContentComponent, C8O4 c8o4);

    public C65776Prg LIZJ() {
        return C65352Pkq.LIZ(CellPlayerViewComponent.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final void LJJLIIIJ(BaseCellContentComponent<? extends C3C8> component, C8O4 cellCtx) {
        o.LJIIIZ(component, "component");
        o.LJIIIZ(cellCtx, "cellCtx");
        C8VR.LIZ(component, new AqS49S0400000_3(cellCtx, (C8O4) this, (CellConfig) component.getContainerView(), (View) component, (BaseCellContentComponent<? extends C3C8>) 11));
        LIZ(component, cellCtx);
    }
}
