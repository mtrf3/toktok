package com.ss.android.ugc.aweme.feed.assem.addyours;

import X.C221108m2;
import X.C226388uY;
import X.C30581Hy;
import X.C3C8;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8T7;
import X.HG3;
import X.InterfaceC65350Pko;
import X.RBY;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursEntranceButtonTrigger extends BaseCellTriggerComponent<AddYoursEntranceButtonTrigger> implements PriorityProtocol {
    public final C62822Ol8 LLF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(AddYoursEntranceButtonAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_button_add_yours_entrance";
    }

    public AddYoursEntranceButtonTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 284));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View m8() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean b4(BaseFeedPageParams baseFeedPageParams) {
        return C30581Hy.LJIL(baseFeedPageParams.eventType);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        PriorityAbility priorityAbility;
        o.LJIIIZ(item, "item");
        super.F0(item);
        getContainerView().setVisibility(8);
        if (k4(item) && (priorityAbility = (PriorityAbility) this.LLF.getValue()) != null) {
            priorityAbility.Es(this, null, new AqS169S0100000_3(this, 183));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (!((RBY) HG3.LJIILL()).isChildrenMode() && item.getAweme() != null) {
            Aweme aweme = item.getAweme();
            o.LJIIIIZZ(aweme, "item.aweme");
            if (!C226388uY.LJFF(aweme)) {
                Aweme aweme2 = item.getAweme();
                o.LJIIIIZZ(aweme2, "item.aweme");
                if (C226388uY.LJI(aweme2)) {
                }
            }
            return true;
        }
        return false;
    }
}
