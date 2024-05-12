package com.ss.android.ugc.aweme.feed.assem.story;

import X.C221108m2;
import X.C3C8;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C73411SrX;
import X.C73969T1h;
import X.C8T7;
import X.C8TC;
import X.InterfaceC65350Pko;
import X.T16;
import Y.AfS55S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
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
public final class QuickDMEntranceTrigger extends BaseCellTriggerComponent<QuickDMEntranceTrigger> implements PriorityProtocol {
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public C73411SrX LLFFF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean b4(BaseFeedPageParams baseFeedPageParams) {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(QuickDMEntranceAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_button_story_message";
    }

    public QuickDMEntranceTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 379));
        this.LLFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 378));
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
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        super.F0(item);
        if (k4(item)) {
            PriorityAbility priorityAbility = (PriorityAbility) this.LLF.getValue();
            if (priorityAbility != null) {
                priorityAbility.Es(this, Boolean.TRUE, new AqS169S0100000_3(this, 215));
            }
            C73411SrX c73411SrX = this.LLFFF;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            this.LLFFF = null;
            this.LLFFF = (C73411SrX) C8TC.LIZIZ.LIZJ(item.getAweme()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3(this, 28), new AfS55S0100000_3(this, 29));
            return;
        }
        getContainerView().setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (o.LJ(item.mEventType, "homepage_hot") || o.LJ(item.mEventType, "homepage_friends") || o.LJ(item.mEventType, "homepage_follow")) {
            return C8TC.LIZIZ.LIZ(item.getAweme());
        }
        return false;
    }
}
