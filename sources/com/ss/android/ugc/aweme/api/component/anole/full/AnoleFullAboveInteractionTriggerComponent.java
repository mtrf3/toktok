package com.ss.android.ugc.aweme.api.component.anole.full;

import X.C221108m2;
import X.C242549fW;
import X.C3C8;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78688UuS;
import X.C8T7;
import X.EnumC2321899i;
import X.InterfaceC65350Pko;
import X.X1D;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AnoleFullAboveInteractionTriggerComponent extends BaseCellTriggerComponent<AnoleFullAboveInteractionTriggerComponent> implements ComponentPriorityProtocol {
    public final C62822Ol8 LLF;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(AnoleFullAboveInteractionContentComponent.class);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "full_above_container_anole_slot";
    }

    public AnoleFullAboveInteractionTriggerComponent() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS154S0100000_4(this, 53));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        super.F0(item);
        C242549fW.LIZ(" onBind  before");
        getContainerView().setVisibility(8);
        if (k4(item)) {
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLF.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.U00(this, null, null);
            }
            getContainerView().setVisibility(0);
            C242549fW.LIZ(" onBind  trigger");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        boolean contains;
        o.LJIIIZ(item, "item");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trigger = ");
        Aweme aweme = item.getAweme();
        EnumC2321899i enumC2321899i = EnumC2321899i.ANOLE_ABOVE_INTERACTIVE_SLOT;
        if (ujb.o.LJJJJJL(enumC2321899i.getSlotName())) {
            contains = false;
        } else {
            contains = ((ArrayList) C78688UuS.LJIJJLI(aweme)).contains(enumC2321899i.getSlotName());
        }
        LIZ.append(contains);
        LIZ.append(",slotId = ");
        LIZ.append(enumC2321899i.getSlotName());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        Aweme aweme2 = item.getAweme();
        if (ujb.o.LJJJJJL(enumC2321899i.getSlotName())) {
            return false;
        }
        return ((ArrayList) C78688UuS.LJIJJLI(aweme2)).contains(enumC2321899i.getSlotName());
    }
}
