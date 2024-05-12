package com.ss.android.ugc.aweme.feed.assem.multitag;

import X.AnonymousClass838;
import X.C210888Pk;
import X.C212428Vi;
import X.C221108m2;
import X.C3C8;
import X.C51029K0z;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8MQ;
import X.C8T7;
import X.C8W0;
import X.InterfaceC65350Pko;
import X.M89;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoFeedMultiTagTrigger extends BaseCellTriggerComponent<VideoFeedMultiTagTrigger> implements ComponentPriorityProtocol {
    public final C62822Ol8 LLF;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(VideoFeedMultiTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return C210888Pk.LIZ(C210888Pk.LIZLLL(a1()), ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAnchors());
    }

    public VideoFeedMultiTagTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 338));
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
        InteractAreaAttachAbility interactAreaAttachAbility;
        o.LJIIIZ(item, "item");
        super.F0(item);
        getContainerView().setVisibility(8);
        if (k4(item) && (interactAreaAttachAbility = (InteractAreaAttachAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), InteractInfoAreaAttachAbility.class, null)) != null) {
            interactAreaAttachAbility.Sn(this, new AqS150S0200000_3(this, item, 34));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        Aweme aweme;
        List<AnchorCommonStruct> anchors;
        String str;
        o.LJIIIZ(item, "item");
        BaseFeedPageParams baseFeedPageParams = item.baseFeedPageParams;
        if (baseFeedPageParams == null) {
            return true;
        }
        if (a1().LIZ != 4 && (aweme = item.getAweme()) != null && (anchors = aweme.getAnchors()) != null && !anchors.isEmpty()) {
            M89 m89 = baseFeedPageParams.param;
            if (m89 != null) {
                str = m89.getFrom();
            } else {
                str = null;
            }
            if (!o.LJ("from_publish_add_video", str) && !AnonymousClass838.LIZ(item.getAweme(), baseFeedPageParams) && !C55723Ltv.LIZIZ.LJIJ().LIZJ(baseFeedPageParams.param, a1().LIZLLL)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean c4(BaseFeedPageParams baseFeedPageParams, int i) {
        if (i == 4 || o.LJ("from_publish_add_video", baseFeedPageParams.param.getFrom())) {
            return false;
        }
        if ((o.LJ("POI_VIDEO_LIST_ENTRANCE", baseFeedPageParams.param.getFrom()) && baseFeedPageParams.param.getHidePoiAnchor()) || baseFeedPageParams.param.isFromDuetModeDetail() || baseFeedPageParams.param.isFromEffectDiscover() || o.LJ(baseFeedPageParams.param.getFrom(), "STORY_ENTRANCE_ARCHIVE")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).v0(i, aweme);
            }
        }
    }
}
