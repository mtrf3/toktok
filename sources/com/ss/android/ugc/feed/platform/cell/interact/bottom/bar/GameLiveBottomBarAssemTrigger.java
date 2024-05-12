package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C221108m2;
import X.C3C8;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8T7;
import X.C8T8;
import X.InterfaceC65350Pko;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class GameLiveBottomBarAssemTrigger extends BaseCellTriggerComponent<GameLiveBottomBarAssemTrigger> implements BottomBarPriorityProtocol {
    public static final /* synthetic */ int LLFII = 0;
    public VideoItemParams LLF;
    public String LLFF;
    public final C62822Ol8 LLFFF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(GameLiveBottomBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_banner_game_live";
    }

    public GameLiveBottomBarAssemTrigger() {
        new LinkedHashMap();
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1262));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return new C8T7(new AqS185S0100000_3(this, 127), null);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol
    public final void d1() {
        getContainerView().setVisibility(8);
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
        getContainerView().setVisibility(8);
        if (k4(item)) {
            C8T8.LIZ("game_live_bottom_banner_need_show", item, null);
            PriorityAbility priorityAbility = (PriorityAbility) this.LLFFF.getValue();
            if (priorityAbility != null) {
                priorityAbility.Es(this, null, new AqS169S0100000_3(this, 569));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (C8T8.LIZIZ(item)) {
            this.LLF = item;
            this.LLFF = item.mEventType;
            return true;
        }
        return false;
    }
}
