package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C221108m2;
import X.C3C8;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78915Uy7;
import X.C8P3;
import X.C8T7;
import X.InterfaceC65350Pko;
import X.QD3;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class PoiReTagBottomBarAssemTrigger extends BaseCellTriggerComponent<PoiReTagBottomBarAssemTrigger> implements BottomBarPriorityProtocol {
    public final C62822Ol8 LLF;
    public VideoItemParams LLFF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(PoiReTagBottomBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_banner_retag_poi";
    }

    public PoiReTagBottomBarAssemTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1269));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol
    public final void d1() {
        getContainerView().setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View m8() {
        return getContainerView();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
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
        this.LLFF = item;
        if (k4(item)) {
            PriorityAbility priorityAbility = (PriorityAbility) this.LLF.getValue();
            if (priorityAbility != null) {
                priorityAbility.Es(this, null, new AqS169S0100000_3(this, 575));
                return;
            }
            return;
        }
        getContainerView().setVisibility(8);
        PriorityAbility priorityAbility2 = (PriorityAbility) this.LLF.getValue();
        if (priorityAbility2 == null) {
            return;
        }
        priorityAbility2.en(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return C78915Uy7.LJJI(item.getAweme());
    }

    @QD3(priority = 2, threadMode = ThreadMode.MAIN)
    public final void onPoiReTagAwemeChangeEvent(C8P3 c8p3) {
        Aweme aweme;
        VideoItemParams videoItemParams;
        PriorityAbility priorityAbility;
        if (c8p3 == null || (aweme = c8p3.LJLIL) == null || (videoItemParams = this.LLFF) == null || !o.LJ(videoItemParams.getAweme().getAid(), aweme.getAid()) || (priorityAbility = (PriorityAbility) this.LLF.getValue()) == null) {
            return;
        }
        priorityAbility.en(this);
    }
}
