package com.ss.android.ugc.aweme.api.component.anole.left;

import X.C2K0;
import X.C3C8;
import X.C55096Ljo;
import X.C65352Pkq;
import X.EnumC2321999j;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AnoleLeftTriggerComponent extends CommerceBaseInteractionComponent {
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(AnoleLeftAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String getLogTag() {
        return "AnoleLeftTriggerComponent";
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final void m4() {
    }

    public AnoleLeftTriggerComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final String l4() {
        return EnumC2321999j.ANOLE_INTERACTIVE_LEFT_SLOT.getSlotName();
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseInteractionComponent
    public final InteractAreaAttachAbility n4() {
        C2K0 LIZ = C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), InteractInfoAreaAttachAbility.class, null);
        o.LJII(LIZ, "null cannot be cast to non-null type com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility");
        return (InteractAreaAttachAbility) LIZ;
    }
}
