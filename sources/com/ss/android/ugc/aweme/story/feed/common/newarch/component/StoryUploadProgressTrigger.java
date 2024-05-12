package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.C17N;
import X.C221138m5;
import X.C222588oQ;
import X.C3C8;
import X.C65352Pkq;
import X.C8T7;
import X.InterfaceC65350Pko;
import X.KR8;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryUploadProgressTrigger extends BaseCellTriggerComponent<StoryUploadProgressTrigger> implements ComponentPriorityProtocol {
    public final C221138m5 LLF;
    public final C221138m5 LLFF;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(StoryUploadProgressComponent.class);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "bottom_container_story_uploading_bar";
    }

    public StoryUploadProgressTrigger() {
        new LinkedHashMap();
        this.LLF = KR8.LJIIJJI(new AqS153S0100000_3(this, 922));
        this.LLFF = KR8.LJIIJJI(new AqS153S0100000_3(this, 923));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
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
        C17N.LJJIIJZLJL(getContainerView());
        if (k4(item) && (interactAreaAttachAbility = (InteractAreaAttachAbility) this.LLFF.getValue()) != null) {
            interactAreaAttachAbility.Sn(this, new AqS153S0100000_3(this, 924));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        Integer valueOf;
        o.LJIIIZ(item, "item");
        C222588oQ c222588oQ = a1().LIZLLL;
        if (c222588oQ == null || (valueOf = Integer.valueOf(c222588oQ.LJIILJJIL)) == null || valueOf.intValue() != 13) {
            return false;
        }
        return true;
    }
}
