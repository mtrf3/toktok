package com.ss.android.ugc.aweme.ad.feed.ad4ad;

import X.C221108m2;
import X.C3C8;
import X.C59111NHv;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8T7;
import X.InterfaceC65350Pko;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.commercialize.model.Ad4adModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class Ad4adBottomBarAssemTrigger extends BaseCellTriggerComponent<Ad4adBottomBarAssemTrigger> implements BottomBarPriorityProtocol {
    public final C62822Ol8 LLF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol
    public final void d1() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(Ad4adBottomBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_banner_promote_ads";
    }

    public Ad4adBottomBarAssemTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS160S0100000_10(this, 60));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View m8() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void F0(Object obj) {
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
            priorityAbility.Es(this, null, new AqS176S0100000_10(this, 24));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        Ad4adModel LIZJ;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (C59111NHv.LIZLLL(aweme) && (LIZJ = C59111NHv.LIZJ(aweme)) != null && LIZJ.getWhyThisAd() != null) {
            return true;
        }
        return false;
    }
}
