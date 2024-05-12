package com.ss.android.ugc.aweme.feed.assem.sharer;

import X.C211308Ra;
import X.C214348b8;
import X.C221108m2;
import X.C240999d1;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8RZ;
import X.C8T7;
import X.C8YN;
import X.HG3;
import X.InterfaceC115514g7;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.TBT;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoExposeSharerInformationTrigger extends BaseCellTriggerComponent<VideoExposeSharerInformationTrigger> implements PriorityProtocol {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public final C62822Ol8 LLF;
    public final InterfaceC115514g7 LLFF;

    static {
        TBT tbt = new TBT(VideoExposeSharerInformationTrigger.class, "sharerInfoVM", "getSharerInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/sharer/VideoExposeSharerInformationVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, (AssemViewModel) this.LLFF.LIZ(this, LLFFF[0]), new TBT() { // from class: X.8Rb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C221298mL) obj).LJLLILLLL;
            }
        }, null, C8RZ.LJLIL, 6);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean b4(BaseFeedPageParams baseFeedPageParams) {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<VideoExposeSharerInformationAssem> e4() {
        return C65352Pkq.LIZ(VideoExposeSharerInformationAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_button_share_info";
    }

    public VideoExposeSharerInformationTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 369));
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoExposeSharerInformationVM.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, c240999d1, new AqS153S0100000_3(LIZ, 370), null, C211308Ra.INSTANCE, null, null);
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
        if (k4((VideoItemParams) C51029K0z.LJIILLIIL(this)) && (priorityAbility = (PriorityAbility) this.LLF.getValue()) != null) {
            priorityAbility.Es(this, null, new AqS169S0100000_3(this, 685));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        User sharer;
        String uid;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        String str = null;
        if (aweme != null && (sharer = aweme.getSharer()) != null && (uid = sharer.getUid()) != null) {
            IAccountUserService LJIILL = HG3.LJIILL();
            if (LJIILL != null) {
                str = LJIILL.getCurUserId();
            }
            if ((!o.LJ(uid, str)) && TextUtils.equals(item.mEventType, "homepage_hot") && !TextUtils.equals(item.mEventType, "chat")) {
                return true;
            }
        }
        return false;
    }
}
