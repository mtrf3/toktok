package com.ss.android.ugc.aweme.feed.assem.friendeffect;

import X.C16880lQ;
import X.C211348Re;
import X.C212618Wb;
import X.C212628Wc;
import X.C212638Wd;
import X.C212688Wi;
import X.C212698Wj;
import X.C214348b8;
import X.C221108m2;
import X.C47261Igj;
import X.C51029K0z;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8RQ;
import X.C8T7;
import X.C8YN;
import X.InterfaceC65350Pko;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FriendEffectPromptTrigger extends BaseCellTriggerComponent<FriendEffectPromptTrigger> implements PriorityProtocol {
    public final C62822Ol8 LLF;
    public final C5H3 LLFF;
    public final C5H3 LLFFF;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<FriendEffectPromptAssem> e4() {
        return C65352Pkq.LIZ(FriendEffectPromptAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_button_try_same_effect";
    }

    public FriendEffectPromptTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 333));
        this.LLFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C211348Re.INSTANCE);
        this.LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(FriendEffectPromptVM.class), C8RQ.INSTANCE);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
        super.E3();
        l4(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), false);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        if (C212698Wj.LIZJ()) {
            String str = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType;
            if (str == null) {
                str = "";
            }
            C212638Wd.LIZJ.remove(str);
            C212638Wd.LIZIZ.remove(str);
        }
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* renamed from: Z3 */
    public final boolean c2(VideoItemParams item) {
        String LIZJ;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        int i = item.currentPosition;
        String str = item.mEventType;
        o.LJIIIIZZ(str, "item.eventType");
        if (!C212698Wj.LIZIZ() || !C212688Wi.LIZLLL(aweme) || (LIZJ = C212688Wi.LIZJ(aweme)) == null || !C212638Wd.LIZ.LIZ(i, LIZJ, str)) {
            return false;
        }
        if (this.LL != null) {
            return true;
        }
        o.LJIJI("pageParams");
        throw null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean b4(BaseFeedPageParams baseFeedPageParams) {
        return C212698Wj.LIZIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return c2((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        String str;
        o.LJIIIZ(item, "item");
        super.F0(item);
        String str2 = "";
        if (C212698Wj.LIZJ() && item.currentPosition == 0) {
            String str3 = item.mEventType;
            if (str3 == null) {
                str3 = "";
            }
            Aweme aweme = item.getAweme();
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            HashMap<String, String> hashMap = C212638Wd.LIZJ;
            if (!o.LJ(str, hashMap.get(str3))) {
                hashMap.put(str3, str);
                C212638Wd.LIZIZ.remove(str3);
            }
        }
        if (item.storyPosition != 0) {
            l4(item.getAweme(), false);
            return;
        }
        int i = item.currentPosition;
        String str4 = item.mEventType;
        if (str4 != null) {
            str2 = str4;
        }
        C212638Wd.LIZIZ.put(str2, Integer.valueOf(i));
        PriorityAbility priorityAbility = (PriorityAbility) this.LLF.getValue();
        if (priorityAbility != null) {
            priorityAbility.Es(this, null, new AqS134S0200000_3(this, item, 83));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (!C212698Wj.LIZIZ() || !C212688Wi.LIZLLL(aweme) || C212688Wi.LIZ(aweme) == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LLFF.getValue(), new TBT() { // from class: X.8Wf
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C212628Wc.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFF.getValue(), new TBT() { // from class: X.8Wg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C212618Wb.LJLIL, 6);
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 68), getContainerView());
    }

    public final void l4(Aweme aweme, boolean z) {
        int i;
        List<AnchorCommonStruct> anchors;
        View containerView = getContainerView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        containerView.setVisibility(i);
        if (C47261Igj.LJJIJIIJI(4, 6).contains(Integer.valueOf(C212698Wj.LIZ().group))) {
            if (z && aweme != null && (anchors = aweme.getAnchors()) != null && anchors.size() == 1) {
                AssemViewModel assemViewModel = (AssemViewModel) this.LLFFF.getValue();
                assemViewModel.getClass();
                assemViewModel.setState(new AqS8S0010000_3(false, 30));
            } else {
                AssemViewModel assemViewModel2 = (AssemViewModel) this.LLFFF.getValue();
                assemViewModel2.getClass();
                assemViewModel2.setState(new AqS8S0010000_3(true, 30));
            }
        }
    }
}
