package com.ss.android.ugc.aweme.commercialize.feed.assem.tag;

import X.C3C8;
import X.C55096Ljo;
import X.C63081OpJ;
import X.C65352Pkq;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AdTopInteractInfoAreaTagTrigger extends BaseCellTriggerComponent<AdTopInteractInfoAreaTagTrigger> {
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean b4(BaseFeedPageParams baseFeedPageParams) {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(AdTopInteractInfoAreaTagAssem.class);
    }

    public AdTopInteractInfoAreaTagTrigger() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void F0(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        InteractAreaAttachAbility interactAreaAttachAbility;
        o.LJIIIZ(item, "item");
        super.F0(item);
        getContainerView().setVisibility(8);
        if (k4(item) && (interactAreaAttachAbility = (InteractAreaAttachAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), InteractInfoAreaAttachAbility.class, null)) != null) {
            interactAreaAttachAbility.Sn(this, new AqS153S0100000_3(this, 164));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return C63081OpJ.LJLI(item.getAweme());
    }
}
