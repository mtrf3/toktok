package com.ss.android.ugc.aweme.dsp.ugcCollect;

import X.C221108m2;
import X.C30581Hy;
import X.C3C8;
import X.C51645KOr;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8T7;
import X.C91131Zpf;
import X.InterfaceC65350Pko;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS417S0100000_29;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MusicDspUGCButtonTrigger extends BaseCellTriggerComponent<MusicDspUGCButtonTrigger> implements PriorityProtocol {
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
        return C65352Pkq.LIZ(MusicDspUGCButtonAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_button_add_favorite";
    }

    public MusicDspUGCButtonTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 53));
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
            priorityAbility.Es(this, null, new IDqS417S0100000_29(this, 19));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (!item.getAweme().isAd()) {
            MusicDspUGCButtonAssem.LLIIL.getClass();
            if (C91131Zpf.LIZ(item)) {
                if (C51645KOr.LIZIZ.LJIIZILJ(item.getAweme())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean c4(BaseFeedPageParams baseFeedPageParams, int i) {
        if (!C30581Hy.LJIL(baseFeedPageParams.eventType) || i == 4 || !C51645KOr.LIZIZ.LJIILJJIL()) {
            return false;
        }
        return true;
    }
}
