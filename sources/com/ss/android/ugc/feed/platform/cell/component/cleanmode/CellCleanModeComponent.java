package com.ss.android.ugc.feed.platform.cell.component.cleanmode;

import X.C221108m2;
import X.C2K0;
import X.C55096Ljo;
import X.InterfaceC55102Lju;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CellCleanModeComponent extends BaseCellLogicComponent implements CellCleanModeAbility, InterfaceC55102Lju {
    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -83257801) {
            return null;
        }
        return this;
    }

    public CellCleanModeComponent() {
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 1241));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }
}
