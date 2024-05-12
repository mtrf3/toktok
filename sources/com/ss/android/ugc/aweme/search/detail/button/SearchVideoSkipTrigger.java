package com.ss.android.ugc.aweme.search.detail.button;

import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C49099JOt;
import X.C51574KLy;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8T7;
import X.C8W0;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoSkipVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchVideoSkipTrigger extends BaseCellTriggerComponent<SearchVideoSkipTrigger> implements PriorityProtocol {
    public final C62822Ol8 LLF;
    public final C214378bB LLFF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<SearchVideoSkipButtonAssem> e4() {
        return C65352Pkq.LIZ(SearchVideoSkipButtonAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_button_video_skip";
    }

    public SearchVideoSkipTrigger() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 148));
        C65776Prg LIZ = C65352Pkq.LIZ(SearchVideoSkipVM.class);
        C51574KLy c51574KLy = C51574KLy.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS158S0100000_8((C8W0) this, 149);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LLFF = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c51574KLy, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
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
        if (o.LJ(baseFeedPageParams.eventType, "general_search") || o.LJ(baseFeedPageParams.eventType, "search_result")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        PriorityAbility priorityAbility;
        o.LJIIIZ(item, "item");
        super.F0(item);
        getContainerView().setVisibility(8);
        if (k4(item) && (priorityAbility = (PriorityAbility) this.LLF.getValue()) != null) {
            priorityAbility.Es(this, null, new AqS139S0200000_8(this, item, 12));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (!item.getAweme().getVideoSkipEnableSkipButton()) {
            return false;
        }
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (!C49099JOt.LIZ(aweme, false)) {
            return false;
        }
        BaseFeedPageParams baseFeedPageParams = this.LL;
        if (baseFeedPageParams != null) {
            if (!b4(baseFeedPageParams)) {
                return false;
            }
            return true;
        }
        o.LJIJI("pageParams");
        throw null;
    }
}
