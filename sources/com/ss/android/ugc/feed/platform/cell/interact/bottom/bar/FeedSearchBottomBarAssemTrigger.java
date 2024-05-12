package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C221108m2;
import X.C223438pn;
import X.C224258r7;
import X.C3C8;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8T7;
import X.InterfaceC65350Pko;
import X.M89;
import X.XI7;
import X.Z9N;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS72S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedSearchBottomBarAssemTrigger extends BaseCellTriggerComponent<FeedSearchBottomBarAssemTrigger> implements BottomBarPriorityProtocol {
    public static final /* synthetic */ int LLFFF = 0;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(FeedSearchBottomBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_banner_search_rs";
    }

    public FeedSearchBottomBarAssemTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1261));
        this.LLFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1260));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        boolean z;
        if (C224258r7.LJII) {
            CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLFF.getValue();
            if (cellAdaptionComponentAbility != null) {
                z = cellAdaptionComponentAbility.yO(true);
            } else {
                z = false;
            }
            return new C8T7(new AqS72S0110000_3(z, this, 0), null);
        }
        return new C8T7(new AqS185S0100000_3(this, 126), null);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol
    public final void d1() {
        getContainerView().setVisibility(8);
    }

    public final void l4() {
        String str;
        M89 m89;
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this);
        if (videoItemParams != null) {
            XI7 LIZIZ = C223438pn.LIZIZ(videoItemParams);
            Z9N z9n = Z9N.LIZIZ;
            Aweme aweme = videoItemParams.getAweme();
            o.LJIIIIZZ(aweme, "it.aweme");
            String str2 = videoItemParams.mEventType;
            o.LJIIIIZZ(str2, "it.eventType");
            String str3 = (String) LIZIZ.LIZIZ;
            String str4 = (String) LIZIZ.LIZ;
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams == null || (m89 = baseFeedPageParams.param) == null || (str = m89.getTabName()) == null) {
                str = "";
            }
            z9n.LLLLLLJ(aweme, str2, str3, str4, str);
        }
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
        PriorityAbility priorityAbility = (PriorityAbility) this.LLF.getValue();
        if (priorityAbility != null) {
            priorityAbility.Es(this, null, new AqS169S0100000_3(this, item, 568));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return C223438pn.LIZ(C223438pn.LIZIZ(item));
    }
}
