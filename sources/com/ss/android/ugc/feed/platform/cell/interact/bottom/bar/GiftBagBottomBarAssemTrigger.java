package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C221108m2;
import X.C3C8;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78963Uyt;
import X.C8T7;
import X.InterfaceC65350Pko;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class GiftBagBottomBarAssemTrigger extends BaseCellTriggerComponent<GiftBagBottomBarAssemTrigger> implements BottomBarPriorityProtocol {
    public final C62822Ol8 LLF;
    public final IVideoGiftService LLFF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(GiftBagBottomBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_banner_video_gift_bag";
    }

    public GiftBagBottomBarAssemTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1263));
        IVideoGiftService LJI = VideoGiftService.LJI();
        o.LJIIIIZZ(LJI, "get().getService(IVideoGiftService::class.java)");
        this.LLFF = LJI;
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
        PriorityAbility priorityAbility;
        o.LJIIIZ(item, "item");
        super.F0(item);
        getContainerView().setVisibility(8);
        if (k4(item) && (priorityAbility = (PriorityAbility) this.LLF.getValue()) != null) {
            priorityAbility.Es(this, null, new AqS169S0100000_3(this, 570));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        return C78963Uyt.LJJIZ(aweme, this.LLFF);
    }
}