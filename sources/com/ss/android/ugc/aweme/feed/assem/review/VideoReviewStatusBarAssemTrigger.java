package com.ss.android.ugc.aweme.feed.assem.review;

import X.C220858ld;
import X.C221108m2;
import X.C3C8;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8ML;
import X.C8T7;
import X.InterfaceC65350Pko;
import X.Z9N;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoReviewStatusBarAssemTrigger extends BaseCellTriggerComponent<VideoReviewStatusBarAssemTrigger> implements BottomBarPriorityProtocol {
    public final C62822Ol8 LLF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean c4(BaseFeedPageParams baseFeedPageParams, int i) {
        return !(i == 4);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol
    public final void d1() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(VideoReviewStatusBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        VideoItemParams item = (VideoItemParams) C51029K0z.LJIILLIIL(this);
        o.LJIIIZ(item, "item");
        if (C220858ld.LJII(item.getAweme())) {
            if (o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "others_homepage") && Z9N.LIZIZ.LLIIIL()) {
                return "bottom_banner_audio_violation_low_priority";
            }
            return "bottom_banner_audio_violation";
        }
        if (C8ML.LIZIZ((VideoItemParams) C51029K0z.LJIILLIIL(this))) {
            return "bottom_banner_take_down";
        }
        return "";
    }

    public VideoReviewStatusBarAssemTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 362));
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
            priorityAbility.Es(this, null, new AqS169S0100000_3(this, 212));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return C8ML.LIZ((VideoItemParams) C51029K0z.LJIILLIIL(this));
    }
}
