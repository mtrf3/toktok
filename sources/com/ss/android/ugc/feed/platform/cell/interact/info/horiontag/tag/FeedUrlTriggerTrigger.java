package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C221108m2;
import X.C3C8;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8QV;
import X.C8T7;
import X.InterfaceC65350Pko;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoSocialTagCategoryProtocol;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedUrlTriggerTrigger extends BaseCellTriggerComponent<FeedUrlTriggerTrigger> implements VideoSocialTagCategoryProtocol {
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
        return C65352Pkq.LIZ(FeedUrlTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "high_tag_multilabel";
    }

    public FeedUrlTriggerTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1307));
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

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.VideoSocialTagCategoryProtocol
    public final void LLLIIII(Aweme aweme) {
        m4(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        super.F0(item);
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        m4(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return l4(item.getAweme());
    }

    public final boolean l4(Aweme aweme) {
        boolean z;
        if (aweme == null) {
            return false;
        }
        RelationDynamicLabel relationLabel = aweme.getRelationLabel();
        if (relationLabel != null && relationLabel.isValid()) {
            z = true;
        } else {
            z = false;
        }
        if (C8QV.LIZIZ(aweme)) {
            return false;
        }
        List<AwemeLabelModel> list = aweme.videoLabels;
        if ((list == null || list.isEmpty()) && !z) {
            return false;
        }
        return true;
    }

    public final void m4(Aweme aweme) {
        PriorityAbility priorityAbility;
        getContainerView().setVisibility(8);
        if (l4(aweme) && (priorityAbility = (PriorityAbility) this.LLF.getValue()) != null) {
            priorityAbility.Es(this, null, new AqS169S0100000_3(this, 588));
        }
    }
}
