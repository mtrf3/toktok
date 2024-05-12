package com.ss.android.ugc.aweme.search.detail.shoot.ui;

import X.C221108m2;
import X.C51575KLz;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8T7;
import X.InterfaceC65350Pko;
import X.KMA;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchInflowMusicShootButtonTrigger extends BaseCellTriggerComponent<SearchInflowMusicShootButtonTrigger> implements PriorityProtocol {
    public final C62822Ol8 LLF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<SearchInflowMusicShootButtonAssem> e4() {
        return C65352Pkq.LIZ(SearchInflowMusicShootButtonAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_button_music_shoot";
    }

    public SearchInflowMusicShootButtonTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 168));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return new C8T7(C51575KLz.LJLIL, null);
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
    public final boolean b4(BaseFeedPageParams baseFeedPageParams) {
        if (!o.LJ(baseFeedPageParams.eventType, "general_search") || !KMA.LJJJ() || KMA.LJJIZ() != 3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        PriorityAbility priorityAbility;
        o.LJIIIZ(item, "item");
        super.F0(item);
        getContainerView().setVisibility(8);
        if (k4(item) && (priorityAbility = (PriorityAbility) this.LLF.getValue()) != null) {
            priorityAbility.Es(this, null, new AqS174S0100000_8(this, 72));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        BaseFeedPageParams baseFeedPageParams = this.LL;
        if (baseFeedPageParams != null) {
            if (b4(baseFeedPageParams) && item.getAweme().hasCreationIntention() && KMA.LJJJI(item.getAweme())) {
                return true;
            }
            return false;
        }
        o.LJIJI("pageParams");
        throw null;
    }
}
