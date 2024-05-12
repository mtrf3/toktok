package com.ss.android.ugc.aweme.feed.assem.duetbutton;

import X.C208858Hp;
import X.C208868Hq;
import X.C214348b8;
import X.C221108m2;
import X.C3C8;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8T7;
import X.InterfaceC115514g7;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.M89;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoDuetButtonTrigger extends BaseCellTriggerComponent<VideoDuetButtonTrigger> implements PriorityProtocol {
    public static final C208868Hq LLFFF;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFII;
    public final InterfaceC115514g7 LLF;
    public final C62822Ol8 LLFF;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.8Hq] */
    static {
        TBT tbt = new TBT(VideoDuetButtonTrigger.class, "duetButtonVM", "getDuetButtonVM()Lcom/ss/android/ugc/aweme/feed/assem/duetbutton/VideoDuetButtonViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFII = new InterfaceC74236TBo[]{tbt};
        LLFFF = new Object() { // from class: X.8Hq
        };
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(VideoDuetButtonAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_button_duet";
    }

    public VideoDuetButtonTrigger() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(VideoDuetButtonViewModel.class);
        this.LLF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 328), null, C208858Hp.INSTANCE, null, null);
        this.LLFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 327));
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
        if (k4(item) && (priorityAbility = (PriorityAbility) this.LLFF.getValue()) != null) {
            priorityAbility.Es(this, null, new AqS169S0100000_3(this, 197));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Object LIZ = this.LLF.LIZ(this, LLFII[0]);
        Aweme aweme = item.getAweme();
        LIZ.getClass();
        return VideoDuetButtonViewModel.kv0(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean c4(BaseFeedPageParams baseFeedPageParams, int i) {
        if (i != 3) {
            return false;
        }
        LLFFF.getClass();
        M89 m89 = baseFeedPageParams.param;
        if (m89 == null || !m89.isFromDuetChain()) {
            return false;
        }
        return true;
    }
}
