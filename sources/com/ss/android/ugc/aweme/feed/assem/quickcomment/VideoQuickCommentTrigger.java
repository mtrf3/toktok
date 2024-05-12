package com.ss.android.ugc.aweme.feed.assem.quickcomment;

import X.C178726zs;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C79488VHo;
import X.C7DU;
import X.C8T7;
import X.InterfaceC65350Pko;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoQuickCommentTrigger extends BaseCellTriggerComponent<VideoQuickCommentTrigger> implements PriorityProtocol {
    public final C62822Ol8 LLF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<VideoQuickCommentAssem> e4() {
        return C65352Pkq.LIZ(VideoQuickCommentAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_button_quick_comment";
    }

    public VideoQuickCommentTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 358));
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
        if (k4(item) && (priorityAbility = (PriorityAbility) this.LLF.getValue()) != null) {
            priorityAbility.Es(this, null, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if ((C7DU.LIZ() & 8) == 8 && !item.getAweme().isFriendsVideoUnread()) {
            return false;
        }
        if (C79488VHo.LIZIZ()) {
            if (C178726zs.LIZLLL(item.getAweme()) && !C178726zs.LIZIZ(item.getAweme())) {
                return true;
            }
            return false;
        }
        return C178726zs.LIZJ(item.getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean c4(BaseFeedPageParams baseFeedPageParams, int i) {
        if ((o.LJ(baseFeedPageParams.eventType, "homepage_hot") && (C7DU.LIZ() & 1) == 1) || o.LJ(baseFeedPageParams.param.getFrom(), "STORY_ENTRANCE_AVATAR")) {
            return false;
        }
        if ((o.LJ(baseFeedPageParams.eventType, "homepage_friends") && (C7DU.LIZ() & 4) == 4) || i == 2) {
            return true;
        }
        if (!o.LJ(baseFeedPageParams.eventType, "homepage_hot")) {
            return false;
        }
        if (i == 6) {
            if (baseFeedPageParams.pageType == 0) {
                return true;
            }
        } else if (i == 1) {
            return true;
        }
        return false;
    }
}
