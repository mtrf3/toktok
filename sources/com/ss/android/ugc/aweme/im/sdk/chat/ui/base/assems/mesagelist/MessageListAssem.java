package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist;

import X.AbstractC1038245q;
import X.AbstractC1041546x;
import X.AbstractC89473fD;
import X.ActivityC45651qj;
import X.AnonymousClass429;
import X.AnonymousClass433;
import X.AnonymousClass437;
import X.AnonymousClass438;
import X.AnonymousClass442;
import X.AnonymousClass462;
import X.AnonymousClass489;
import X.C1029242e;
import X.C1029342f;
import X.C1031342z;
import X.C1032443k;
import X.C1038845w;
import X.C1046848y;
import X.C107834Lb;
import X.C107844Lc;
import X.C108044Lw;
import X.C109544Rq;
import X.C110134Tx;
import X.C117294iz;
import X.C17N;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C2K0;
import X.C34B;
import X.C40171ht;
import X.C40443Fu3;
import X.C40M;
import X.C41U;
import X.C42C;
import X.C42W;
import X.C42X;
import X.C42Z;
import X.C43D;
import X.C43G;
import X.C43H;
import X.C43O;
import X.C44N;
import X.C46W;
import X.C47261Igj;
import X.C47704Ins;
import X.C48841JEv;
import X.C4DL;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C5H3;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C63120Opw;
import X.C64962gm;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C73379Sr1;
import X.C73542Ste;
import X.C73893SzJ;
import X.C73969T1h;
import X.C78613UtF;
import X.C78926UyI;
import X.C78999UzT;
import X.C84973Vd;
import X.C87687YbD;
import X.C89333ez;
import X.C89463fC;
import X.C8YN;
import X.C91233i3;
import X.C91563ia;
import X.C91583ic;
import X.C91593id;
import X.C91603ie;
import X.C91613if;
import X.C93023kw;
import X.C98523to;
import X.C98583tu;
import X.C99033ud;
import X.C99843vw;
import X.C99963w8;
import X.C9BE;
import X.EnumC110124Tw;
import X.InterfaceC1029942l;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import X.InterfaceC88472Yns;
import X.InterfaceC93033kx;
import X.InterfaceC99713vj;
import X.ORZ;
import X.QD3;
import X.SJC;
import X.TBT;
import X.XKX;
import Y.AObserverS69S0100000_1;
import Y.ARunnableS37S0100000_1;
import Y.IDTListenerS87S0200000_1;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.common.LiveEventObserver;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageState;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.ChatPageNudgeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.SuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.ActionBarAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.ChatNoticeAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.IMInputViewUIAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.report.ChatReportPageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.scrolltobottomindicator.ScrollToBottomIndicator;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.statemanager.ChatRoomLiveStateManager;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class MessageListAssem extends UIContentAssem implements MessageListProtocol, ProfileItemUpdater, InterfaceC93033kx, InterfaceC55102Lju {
    public final C55749LuL LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C214298b3 LJLJJI;
    public final C214298b3 LJLJJL;
    public final C64962gm LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C214298b3 LJLLI;
    public final C5H3 LJLLILLLL;
    public final C73318Sq2 LJLLJ;
    public final C5H3 LJLLL;
    public final C5H3 LJLLLL;
    public ChatRoomLiveStateManager LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C5H3 LJZI;
    public final C5H3 LJZL;
    public final C5H3 LL;
    public int LLD;
    public boolean LLF;
    public final C5H3 LLFF;
    public final C5H3 LLFFF;
    public final C62822Ol8 LLFII;
    public LiveEventObserver<RelationStatus> LLFZ;
    public AnonymousClass429 LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public long LLIIII;
    public boolean LLIIIILZ;
    public final C62822Ol8 LLIIIJ;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol
    public final void LLLILZ() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -603997068) {
            return null;
        }
        return this;
    }

    public MessageListAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = C17N.LJJIJL(new AqS151S0100000_1(this, 415));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MessageListViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 416), C43G.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(ChatReportPageViewModel.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ2, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 417), C43H.INSTANCE, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(ChatRoomInputVM.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ3, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ3, 418), AnonymousClass437.INSTANCE, null);
        this.LJLJJLL = C48841JEv.LIZ(C78613UtF.LIZ);
        this.LJLJL = C17N.LJJIJL(new AqS151S0100000_1(this, 412));
        this.LJLJLJ = C17N.LJJIJL(new AqS151S0100000_1(this, 404));
        this.LJLJLLL = C17N.LJJIJL(new AqS151S0100000_1(this, 411));
        this.LJLL = C17N.LJJIJL(new AqS151S0100000_1(this, 408));
        C65776Prg LIZ4 = C65352Pkq.LIZ(ChatCommonViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ4, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ4, 419), AnonymousClass438.INSTANCE, null);
        this.LJLLILLLL = C17N.LJJIJL(new AqS151S0100000_1(this, 405));
        this.LJLLJ = new C73318Sq2();
        this.LJLLL = C17N.LJJIJL(new AqS151S0100000_1(this, 403));
        this.LJLLLL = C17N.LJJIJL(new AqS151S0100000_1(this, 407));
        this.LJLZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 421));
        this.LJZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 402));
        this.LJZI = C17N.LJJIJL(new AqS151S0100000_1(this, 413));
        this.LJZL = C17N.LJJIJL(new AqS151S0100000_1(this, 414));
        this.LL = C17N.LJJIJL(new AqS151S0100000_1(this, 409));
        this.LLD = -2;
        this.LLFF = C17N.LJJIJL(new AqS151S0100000_1(this, 410));
        this.LLFFF = C17N.LJJIJL(new AqS151S0100000_1(this, 422));
        this.LLFII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 420));
        this.LLIIIILZ = true;
        this.LLIIIJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 406));
    }

    public final ChatLinearLayoutManager A3() {
        return (ChatLinearLayoutManager) this.LJLJLLL.getValue();
    }

    public final RecyclerView E3() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-messageRecyclerView>(...)");
        return (RecyclerView) value;
    }

    public final C99033ud F3() {
        return (C99033ud) this.LJLILLLLZI.getValue();
    }

    public final SuggestedReplyViewModel H3() {
        return (SuggestedReplyViewModel) this.LJLZ.getValue();
    }

    public final C107834Lb I3() {
        return (C107834Lb) this.LLFFF.getValue();
    }

    public final ChatRoomViewModel v3() {
        return (ChatRoomViewModel) this.LJLLILLLL.getValue();
    }

    public final AbstractC1038245q x3() {
        return (AbstractC1038245q) this.LJLL.getValue();
    }

    public final InterfaceC88472Yns<List<? extends C109544Rq>, List<IMMessage>> C3() {
        if (F3().isReportPage()) {
            return new AqS167S0100000_1((ChatReportPageViewModel) this.LJLJJI.getValue(), 453);
        }
        this.LJLJI.getValue();
        return C41U.LJLIL;
    }

    @Override // X.InterfaceC93033kx
    public final MessageState LLLLLZL() {
        List<IMMessage> currentList = x3().getCurrentList();
        o.LJIIIIZZ(currentList, "messageAdapter.currentList");
        IMMessage iMMessage = (IMMessage) ORZ.LJLLLL(currentList);
        if (iMMessage != null) {
            return iMMessage.getState();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol
    public final int findFirstVisibleItemPositionInScreen() {
        return A3().LLJJJJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol
    public final int findLastVisibleItemPositionInScreen() {
        return A3().LLJJL();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
        C84973Vd.LIZ.getClass();
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        o.LJIIIIZZ(currentUserID, "get().getService(IUserSe…class.java).currentUserID");
        C84973Vd.LIZIZ = currentUserID;
        AnonymousClass489.LIZ.getClass();
        AnonymousClass489.LIZJ = true;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            InterfaceC55235Lm3 LIZLLL = C55230Lly.LIZLLL(LIZ, null);
            C55096Ljo.LJIIJJI(LIZLLL, (C2K0) this.LJZL.getValue(), MessageSelectionAbility.class, null);
            C55096Ljo.LJIIJJI(LIZLLL, (C2K0) this.LL.getValue(), MessageCountAbility.class, null);
            C55096Ljo.LJIIJJI(LIZLLL, (MessageReplyAbility) this.LJZI.getValue(), MessageReplyAbility.class, null);
            C55096Ljo.LJIIJJI(LIZLLL, (C2K0) this.LLFF.getValue(), MessageListAbility.class, null);
        }
        SuggestedReplyViewModel H3 = H3();
        if (H3 != null) {
            H3.kv0();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        SuggestedReplyViewModel H3;
        C109544Rq c109544Rq;
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        x3().onDestroy();
        this.LJLLJ.LIZLLL();
        C84973Vd.LIZ.getClass();
        C84973Vd.LJII();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            InterfaceC55235Lm3 LIZLLL = C55230Lly.LIZLLL(LIZ, null);
            C55096Ljo.LJIILL(LIZLLL, MessageSelectionAbility.class, null);
            C55096Ljo.LJIILL(LIZLLL, MessageCountAbility.class, null);
            C55096Ljo.LJIILL(LIZLLL, MessageReplyAbility.class, null);
        }
        if (SuggestedReplyExperiment.LIZLLL() && (H3 = H3()) != null && (c109544Rq = H3.LJLJJL) != null) {
            C46W.LIZLLL(C46W.LIZ, C98583tu.LIZJ(F3()), c109544Rq, "action_bar", "leave_chat", null, 48);
        }
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZ()) {
            String convId = F3().getConversationId();
            o.LJIIIZ(convId, "convId");
            C93023kw.LIZLLL.remove(convId);
        }
        C107834Lb I3 = I3();
        if (I3 != null) {
            C34B.LIZIZ("SwipeForReplyIntroductionHelper", "exit chat room");
            C107844Lc c107844Lc = I3.LJFF;
            if (c107844Lc == null) {
                return;
            }
            ((ArrayList) C108044Lw.LIZ).remove(c107844Lc);
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        x3().onPause();
        this.LLII = true;
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        Iterator<AbstractC1041546x> it = x3().LJLJI.iterator();
        while (it.hasNext()) {
            AnonymousClass462 anonymousClass462 = it.next().LLF;
            if (anonymousClass462 != null) {
                anonymousClass462.LIZ(true);
            }
        }
        SuggestedReplyViewModel H3 = H3();
        if (H3 != null) {
            H3.ov0();
        }
    }

    public final void K3(AbstractC89473fD abstractC89473fD) {
        XKX.LIZLLL(this.LJLJJLL, null, null, new C1029342f(this, abstractC89473fD, null), 3);
    }

    public final void L3(long j) {
        if (this.LLIIIILZ && !this.LLII) {
            this.LLIIIILZ = false;
            long longValue = j - ((Number) this.LLIIIJ.getValue()).longValue();
            if (((Number) this.LLIIIJ.getValue()).longValue() > 0 && longValue > 0) {
                C98583tu.LJFF(longValue, F3(), x3().getCurrentList().size(), false, 56);
            }
        }
    }

    public final void M3(AbstractC89473fD abstractC89473fD) {
        if ((abstractC89473fD instanceof C91233i3) || (abstractC89473fD instanceof C91603ie) || (abstractC89473fD instanceof C89463fC) || (abstractC89473fD instanceof C91563ia) || (abstractC89473fD instanceof C91613if) || (abstractC89473fD instanceof C91593id) || (abstractC89473fD instanceof C40M) || (abstractC89473fD instanceof C1032443k) || (abstractC89473fD instanceof C99963w8)) {
            K3(abstractC89473fD);
        } else {
            if (!(abstractC89473fD instanceof C91583ic) || !((C91583ic) abstractC89473fD).LIZIZ) {
                return;
            }
            K3(abstractC89473fD);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void getAgeInfoUpdateEvent(C1046848y event) {
        InterfaceC99713vj interfaceC99713vj;
        List<C109544Rq> LJ;
        o.LJIIIZ(event, "event");
        C84973Vd.LIZ.getClass();
        C84973Vd.LIZLLL.evictAll();
        ChatRoomViewModel v3 = v3();
        if (v3 != null && (interfaceC99713vj = v3.LJLL) != null && (LJ = interfaceC99713vj.LJ()) != null) {
            C84973Vd.LJIIIZ(LJ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ChatRoomLiveStateManager chatRoomLiveStateManager;
        EnumC110124Tw enumC110124Tw;
        C99843vw c99843vw;
        C44N c44n;
        SuggestedReplyViewModel H3;
        C73893SzJ<AbstractC89473fD> c73893SzJ;
        C73893SzJ<AbstractC89473fD> c73893SzJ2;
        C109544Rq lastShowMessage;
        ChatRoomViewModel v3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (F3().isTakoChat$im_base_release()) {
            chatRoomLiveStateManager = null;
        } else {
            chatRoomLiveStateManager = new ChatRoomLiveStateManager(this, E3());
        }
        this.LJLLLLLL = chatRoomLiveStateManager;
        ChatRoomViewModel v32 = v3();
        if (v32 != null) {
            getLifecycle().addObserver(v32);
        }
        AbstractC1038245q x3 = x3();
        x3.setHasStableIds(false);
        FakeMessageViewModel fakeMessageViewModel = (FakeMessageViewModel) this.LJLLLL.getValue();
        if (fakeMessageViewModel != null) {
            getLifecycle().addObserver(fakeMessageViewModel);
        }
        ChatRoomViewModel v33 = v3();
        if (v33 != null) {
            InterfaceC99713vj model = v33.LJLL;
            SuggestedReplyViewModel H32 = H3();
            o.LJIIIZ(model, "model");
            x3.LJLLILLLL = model;
            x3.LLFII = H32;
            x3.LJZL.LJIIIZ = v33;
        }
        if (((C89333ez) this.LJLIL.getValue()).LJLILLLLZI && (v3 = v3()) != null) {
            C99843vw c99843vw2 = v3.LJLLILLLL;
            int LJII = c99843vw2.LJLIL.LJII();
            if (c99843vw2.LJLILLLLZI != 1) {
                c99843vw2.LJLJI = c99843vw2.LJLIL.LJII();
                c99843vw2.LJLIL.LIZIZ(LJII);
                c99843vw2.LJLILLLLZI = 1;
                c99843vw2.LJLIL.LJFF();
            }
        }
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZ()) {
            String convId = x3.LJLJLLL.getConversationId();
            o.LJIIIZ(convId, "convId");
            C93023kw.LIZLLL.put(convId, this);
        }
        x3.LJLLLLLL(new InterfaceC1029942l() { // from class: X.41R
            @Override // X.InterfaceC1029942l
            public final void Hp() {
            }

            @Override // X.InterfaceC1029942l
            public final void Og() {
            }

            @Override // X.InterfaceC1029942l
            public final void s50(AbstractC1041546x holder, C109544Rq c109544Rq) {
                o.LJIIIZ(holder, "holder");
            }

            @Override // X.InterfaceC1029942l
            public final void Ah(AbstractC89473fD event) {
                o.LJIIIZ(event, "event");
            }

            @Override // X.InterfaceC1029942l
            public final void IP(AbstractC1041546x viewHolder) {
                o.LJIIIZ(viewHolder, "viewHolder");
                C107834Lb I3 = MessageListAssem.this.I3();
                if (I3 != null) {
                    I3.LIZ(viewHolder);
                }
            }

            @Override // X.InterfaceC1029942l
            public final void QG(AbstractC1041546x viewHolder) {
                o.LJIIIZ(viewHolder, "viewHolder");
                C107834Lb I3 = MessageListAssem.this.I3();
                if (I3 != null) {
                    I3.LIZIZ(viewHolder);
                }
            }

            @Override // X.InterfaceC1029942l
            public final void Vj(List<? extends C109544Rq> list) {
                o.LJIIIZ(list, "list");
            }

            @Override // X.InterfaceC1029942l
            public final void ik0(List<? extends C109544Rq> list) {
                o.LJIIIZ(list, "list");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1029942l
            public final void rD(AbstractC1041546x viewHolder) {
                ChatRoomLiveStateManager chatRoomLiveStateManager2;
                o.LJIIIZ(viewHolder, "viewHolder");
                viewHolder.LJZ = (ChatPageNudgeViewModel) MessageListAssem.this.LJLLL.getValue();
                if ((viewHolder instanceof C4RQ) && (chatRoomLiveStateManager2 = MessageListAssem.this.LJLLLLLL) != null) {
                    chatRoomLiveStateManager2.LIZ((C4RQ) viewHolder);
                }
                if (viewHolder instanceof AbstractC779033y) {
                    ((AbstractC779033y) viewHolder).LLIIIILZ = (FakeMessageViewModel) MessageListAssem.this.LJLLLL.getValue();
                }
                if (viewHolder instanceof AnonymousClass429) {
                    MessageListAssem.this.LLI = (AnonymousClass429) viewHolder;
                }
            }

            @Override // X.InterfaceC1029942l
            public final void zG(RecyclerView recyclerView) {
                o.LJIIIZ(recyclerView, "recyclerView");
            }
        });
        RecyclerView E3 = E3();
        E3.setClickable(true);
        C40171ht c40171ht = new C40171ht() { // from class: X.42n
            @Override // X.C40171ht, X.AbstractC28931Bp
            public final boolean LJIJI(int i, int i2, int i3, int i4, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                if (viewHolder == viewHolder2) {
                    return super.LJIJI(i, i2, i3, i4, viewHolder, viewHolder2);
                }
                viewHolder.itemView.animate().cancel();
                viewHolder2.itemView.animate().cancel();
                viewHolder.itemView.animate().alpha(0.0f).setDuration(125L).start();
                return true;
            }
        };
        c40171ht.LJI = false;
        E3.setItemAnimator(c40171ht);
        ChatLinearLayoutManager A3 = A3();
        A3.LLJJIJI(true);
        A3.LLJJIJIIJIL(F3().isTakoChat$im_base_release());
        E3.setLayoutManager(A3);
        E3.setClipChildren(false);
        E3.setVerticalScrollBarEnabled(true);
        E3.setScrollBarStyle(33554432);
        E3.setAdapter(x3());
        E3.LJII(new C4DL(), -1);
        E3.requestDisallowInterceptTouchEvent(true);
        E3.setOnTouchListener(new IDTListenerS87S0200000_1(E3, new GestureDetector(E3.getContext(), new SJC() { // from class: X.42q
            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (C117294iz.LIZ()) {
                    ((ChatRoomInputVM) MessageListAssem.this.LJLJJL.getValue()).tr(EnumC105154At.NONE);
                }
                return super.onSingleTapUp(motionEvent);
            }
        }), 5));
        final Context context = E3.getContext();
        E3.LJIIJJI(new C73379Sr1(context) { // from class: X.3lp
            public boolean LJLILLLLZI;

            @Override // X.C73379Sr1, X.C0A6
            public final void LJIILJJIL(int i, RecyclerView recyclerView) {
                o.LJIIIZ(recyclerView, "recyclerView");
                super.LJIILJJIL(i, recyclerView);
                if (i == 1) {
                    ((ChatRoomInputVM) MessageListAssem.this.LJLJJL.getValue()).tr(EnumC105154At.NONE);
                }
                if (this.LJLILLLLZI) {
                    C85243We.LIZ(recyclerView, i, MessageListAssem.this.x3());
                }
            }

            @Override // X.C73379Sr1, X.C0A6
            public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
                boolean z;
                o.LJIIIZ(recyclerView, "recyclerView");
                super.LJIILL(recyclerView, i, i2);
                if (i2 < 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJLILLLLZI = z;
            }
        });
        C40443Fu3.LIZ("message_list").LJIIIIZZ(E3);
        C1038845w c1038845w = new C1038845w();
        E3().setRecycledViewPool(c1038845w);
        C63120Opw c63120Opw = (C63120Opw) ((MessageListViewModel) this.LJLJI.getValue()).LJLJJLL.getValue();
        if (c63120Opw != null && (lastShowMessage = c63120Opw.getLastShowMessage()) != null) {
            EnumC110124Tw.Companion.getClass();
            enumC110124Tw = C110134Tx.LJFF(lastShowMessage);
        } else {
            enumC110124Tw = null;
        }
        C1038845w.LIZ(c1038845w, E3(), x3(), enumC110124Tw);
        ChatRoomViewModel v34 = v3();
        if (v34 != null && (c73893SzJ2 = v34.LJLLLL) != null) {
            C78999UzT.LJFF(C73542Ste.LJIIIIZZ(c73893SzJ2, null, null, new C1031342z(this), 3), this.LJLLJ);
        }
        ChatRoomViewModel v35 = v3();
        if (v35 != null && (c73893SzJ = v35.LJLLLL) != null) {
            C78999UzT.LJFF(C73542Ste.LJIIIIZZ(c73893SzJ.LJJJ(C73969T1h.LIZIZ()), null, null, new AqS167S0100000_1(this, 447), 3), this.LJLLJ);
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.43W
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C43Y) obj).LJLIL);
            }
        }, C213688a4.LJ(), new AqS183S0100000_1(this, 100), 4);
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.43Z
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C43Y) obj).LJLILLLLZI);
            }
        }, C213688a4.LJ(), new AqS183S0100000_1(this, 101), 4);
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.43a
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C43Y) obj).LJLJI);
            }
        }, null, new AqS183S0100000_1(this, 102), 6);
        if (SuggestedReplyExperiment.LIZJ() && (H3 = H3()) != null) {
            AbstractC1038245q x32 = x3();
            AnonymousClass442 anonymousClass442 = new AnonymousClass442(E3(), new C43D(H3), new AnonymousClass433(H3));
            anonymousClass442.LJLJJI = new C42X(x3());
            anonymousClass442.LJLJJL = new C42Z(H3);
            x32.LJLLLLLL(anonymousClass442);
        }
        AbstractC1038245q x33 = x3();
        x33.LJZL.LJIIJJI = new C1029242e(new C43O() { // from class: X.41g
            @Override // X.C43O
            public final boolean LIZ() {
                ChatRoomPanelAbility chatRoomPanelAbility = (ChatRoomPanelAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(MessageListAssem.this), ChatRoomPanelAbility.class, null);
                if (chatRoomPanelAbility == null || !chatRoomPanelAbility.c30()) {
                    return false;
                }
                ((ChatRoomInputVM) MessageListAssem.this.LJLJJL.getValue()).tr(EnumC105154At.NONE);
                return true;
            }

            @Override // X.C43O
            public final void LIZIZ() {
                MessageListAssem.this.A3().LLIIJI = true;
                IMInputViewUIAbility iMInputViewUIAbility = (IMInputViewUIAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(MessageListAssem.this), IMInputViewUIAbility.class, null);
                if (iMInputViewUIAbility != null) {
                    iMInputViewUIAbility.d70();
                }
            }

            @Override // X.C43O
            public final void onDismiss() {
                ChatNoticeAbility chatNoticeAbility = (ChatNoticeAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(MessageListAssem.this), ChatNoticeAbility.class, null);
                if (chatNoticeAbility != null) {
                    chatNoticeAbility.IA();
                }
                MessageListAssem messageListAssem = MessageListAssem.this;
                if (messageListAssem.LLD == 0) {
                    ((ChatRoomInputVM) messageListAssem.LJLJJL.getValue()).tr(EnumC105154At.KEYBOARD);
                }
                MessageListAssem messageListAssem2 = MessageListAssem.this;
                messageListAssem2.LLD = -2;
                ActionBarAbility actionBarAbility = (ActionBarAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(messageListAssem2), ActionBarAbility.class, null);
                if (actionBarAbility != null) {
                    actionBarAbility.GC("message_long_pressed", false);
                }
                MessageListAssem messageListAssem3 = MessageListAssem.this;
                if (messageListAssem3.LLF) {
                    messageListAssem3.LLF = false;
                    messageListAssem3.K3(new C89463fC(C61878OQg.INSTANCE, -1, new C107074Id()));
                }
            }

            @Override // X.C43O
            public final void onShow() {
                MessageListAssem.this.A3().LLIIJI = false;
                ActionBarAbility actionBarAbility = (ActionBarAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(MessageListAssem.this), ActionBarAbility.class, null);
                if (actionBarAbility != null) {
                    actionBarAbility.GC("message_long_pressed", true);
                }
                IMInputViewUIAbility iMInputViewUIAbility = (IMInputViewUIAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(MessageListAssem.this), IMInputViewUIAbility.class, null);
                if (iMInputViewUIAbility != null) {
                    iMInputViewUIAbility.Fo0();
                }
                ChatNoticeAbility chatNoticeAbility = (ChatNoticeAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(MessageListAssem.this), ChatNoticeAbility.class, null);
                if (chatNoticeAbility != null) {
                    chatNoticeAbility.IA();
                }
            }
        }, x33);
        x3().LLF.observe(getParent(), new AObserverS69S0100000_1(this, 145));
        C107834Lb I3 = I3();
        if (I3 != null) {
            I3.LIZJ();
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.40t
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C101703yw) obj).LJLIL;
            }
        }, C213688a4.LJ(), new AqS183S0100000_1(this, 103), 4);
        final InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, MessageListProtocol.class, C47261Igj.LJJIJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAssem$registerProtocol$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C62814Ol0.LJJIJL(InterfaceC55235Lm3.this, MessageListProtocol.class, this);
                    }
                }
            });
        }
        ChatPageNudgeViewModel chatPageNudgeViewModel = (ChatPageNudgeViewModel) this.LJLLL.getValue();
        if (chatPageNudgeViewModel != null) {
            getLifecycle().addObserver(chatPageNudgeViewModel);
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.40s
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C101703yw) obj).LJLIL;
            }
        }, C213688a4.LJ(), new AqS183S0100000_1(this, 99), 4);
        C42C c42c = (C42C) this.LJZ.getValue();
        if (c42c != null) {
            c42c.LIZ();
        }
        if (!F3().isTakoChat$im_base_release() && !F3().isReportPage() && C117294iz.LIZ()) {
            View containerView = getContainerView();
            RecyclerView E32 = E3();
            ChatRoomViewModel v36 = v3();
            if (v36 != null && (c44n = v36.LJLLL) != null) {
                getParent().getLifecycle().addObserver(new ScrollToBottomIndicator(containerView, E32, c44n));
            }
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.43Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C105044Ai) obj).LJLJJI);
            }
        }, null, C42W.LJLIL, 6);
        ChatRoomViewModel v37 = v3();
        if (v37 != null && (c99843vw = v37.LJLLILLLL) != null) {
            x3().LJLLLLLL(c99843vw);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.ProfileItemUpdater
    public final void UV(C98523to singleSessionInfo, IMUser user) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(singleSessionInfo, "singleSessionInfo");
        AnonymousClass429 anonymousClass429 = this.LLI;
        if (anonymousClass429 != null) {
            anonymousClass429.m0(singleSessionInfo, user);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol
    public final void LJIIL(View view, int i, int i2, boolean z) {
        if (i2 != -1 && !F3().isTakoChat$im_base_release() && !C117294iz.LIZ()) {
            E3().post(new ARunnableS37S0100000_1(this, 136));
        }
    }
}
