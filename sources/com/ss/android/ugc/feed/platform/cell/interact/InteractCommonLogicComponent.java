package com.ss.android.ugc.feed.platform.cell.interact;

import X.C2K0;
import X.C2L4;
import X.C55096Ljo;
import X.C76965UIn;
import X.InterfaceC55102Lju;
import X.OUP;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractCommonLogicComponent extends BaseCellLogicComponent implements InteractCommonLogicAbility, InterfaceC55102Lju, C2L4 {
    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -193890719) {
            return null;
        }
        return this;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(CellInteractAreaScope.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractCommonLogicAbility
    public final void hz() {
        OUP.LJJJ(this, "event_component_hint_text", null);
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

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractCommonLogicAbility
    public final void yi(boolean z) {
        OUP.LJJJ(this, "event_component_clickable", Boolean.valueOf(z));
    }
}
