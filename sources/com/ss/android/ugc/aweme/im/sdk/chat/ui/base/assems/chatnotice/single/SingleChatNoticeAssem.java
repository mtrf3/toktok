package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single;

import X.AbstractC1036945d;
import X.AbstractC89473fD;
import X.AnonymousClass414;
import X.AnonymousClass415;
import X.AnonymousClass418;
import X.AnonymousClass491;
import X.AnonymousClass496;
import X.C101353yN;
import X.C101543yg;
import X.C101703yw;
import X.C102293zt;
import X.C1023940d;
import X.C1024340h;
import X.C1025040o;
import X.C1025240q;
import X.C1025740v;
import X.C1025840w;
import X.C1026140z;
import X.C1027941r;
import X.C1031042w;
import X.C17N;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C39R;
import X.C3F6;
import X.C3F7;
import X.C3Q9;
import X.C3WT;
import X.C3WV;
import X.C40W;
import X.C41D;
import X.C41X;
import X.C42Q;
import X.C45V;
import X.C47704Ins;
import X.C4WC;
import X.C53181Ku1;
import X.C55749LuL;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73893SzJ;
import X.C73969T1h;
import X.C75782yE;
import X.C78613UtF;
import X.C78926UyI;
import X.C78999UzT;
import X.C794539x;
import X.C81403Hk;
import X.C89203em;
import X.C89333ez;
import X.C8W0;
import X.C8YN;
import X.C98523to;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.InterfaceC785236i;
import X.InterfaceC85393Wt;
import X.QD3;
import X.TBT;
import X.XKX;
import Y.AObserverS69S0100000_1;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.common.LiveEventObserver;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class SingleChatNoticeAssem extends CommonChatNoticeAssem {
    public final C55749LuL LJLLLLLL;
    public final C55749LuL LJLZ;
    public final C62822Ol8 LJZ;
    public final C5H3 LJZI;
    public final C214298b3 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C214298b3 LLFF;
    public final C214298b3 LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;
    public final C5H3 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public LiveEventObserver<RelationStatus> LLII;
    public AnonymousClass418 LLIIII;
    public final C73318Sq2 LLIIIILZ;

    public SingleChatNoticeAssem() {
        new LinkedHashMap();
        this.LJLLLLLL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLZ = new C55749LuL(C47704Ins.LIZJ(this, C40W.class, null), checkSupervisorPrepared());
        this.LJZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 359));
        this.LJZI = C17N.LJJIJL(new AqS151S0100000_1(this, 356));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChatCommonViewModel.class);
        this.LJZL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 360), C1025240q.INSTANCE, null);
        this.LL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 354));
        this.LLD = C221108m2.LIZIZ(new AqS151S0100000_1(this, 355));
        this.LLF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 358));
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((C8W0) this, 362);
        C65776Prg LIZ2 = C65352Pkq.LIZ(SingleChatNoticeViewModel.class);
        this.LLFF = C78926UyI.LJ(this, LIZ2, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 853), C1025740v.INSTANCE, aqS151S0100000_1);
        this.LLFFF = C1031042w.LIZ(this);
        this.LLFII = C17N.LJJIJL(new AqS151S0100000_1(this, 352));
        this.LLFZ = C17N.LJJIJL(new AqS151S0100000_1(this, 361));
        this.LLI = C17N.LJJIJL(new AqS151S0100000_1(this, 357));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 353));
        this.LLIIIILZ = new C73318Sq2();
    }

    public final ViewGroup L3() {
        Object value = this.LLFII.getValue();
        o.LJIIIIZZ(value, "<get-bottomContainerView>(...)");
        return (ViewGroup) value;
    }

    public final IMUser M3() {
        IMUser iMUser = ((C101703yw) ((AssemViewModel) this.LJZL.getValue()).getState()).LJLIL;
        if (iMUser == null) {
            ChatNoticeViewModel chatNoticeViewModel = (ChatNoticeViewModel) this.LL.getValue();
            if (chatNoticeViewModel != null) {
                return chatNoticeViewModel.LJLJLLL;
            }
            return null;
        }
        return iMUser;
    }

    public final SingleChatNoticeViewModel N3() {
        return (SingleChatNoticeViewModel) this.LLFF.getValue();
    }

    public final C98523to O3() {
        return (C98523to) this.LJZ.getValue();
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.3sv] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        C73893SzJ<AbstractC89473fD> c73893SzJ;
        MutableLiveData<ImChatTopTipModel> mutableLiveData;
        Context context;
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        super.I3();
        SingleChatNoticeViewModel N3 = N3();
        final ViewGroup L3 = L3();
        final C98523to O3 = O3();
        N3.LJLIL.LJIIJJI(new C42Q<C41D, AnonymousClass491>(L3, O3) { // from class: X.41M
            public final C99033ud LJ;
            public final /* synthetic */ AnonymousClass410 LJFF;
            public ECBannerContent LJI;

            @Override // X.AbstractC1036945d, X.AnonymousClass412
            public final void pause() {
                this.LJFF.pause();
            }

            @Override // X.AbstractC1036945d, X.AnonymousClass412
            public final void resume() {
                this.LJFF.resume();
            }

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                AnonymousClass491 anonymousClass491 = (AnonymousClass491) this.LIZLLL;
                if (anonymousClass491 != null && anonymousClass491.getVisibility() == 0) {
                    anonymousClass491.setVisibility(8);
                    anonymousClass491.LIZ();
                }
            }

            @Override // X.C42Q, X.AbstractC1036945d
            public final void LIZJ(C1023940d nextTask) {
                o.LJIIIZ(nextTask, "nextTask");
                super.LIZJ(nextTask);
                this.LJI = null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C41X.EC_SELLER, L3, R.layout.b1k);
                o.LJIIIZ(O3, "sessionInfo");
                this.LJ = O3;
                this.LJFF = new AnonymousClass410(L3);
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C1023940d c1023940d, InterfaceC67352kd interfaceC67352kd) {
                AnonymousClass491 anonymousClass491 = (AnonymousClass491) this.LIZLLL;
                if (anonymousClass491 != null) {
                    ECBannerContent eCBannerContent = this.LJI;
                    String conversationId = this.LJ.getConversationId();
                    String singleChatFromUserId = this.LJ.getSingleChatFromUserId();
                    anonymousClass491.LJLL = eCBannerContent;
                    anonymousClass491.LJLLJ = conversationId;
                    anonymousClass491.LJLLL = singleChatFromUserId;
                    anonymousClass491.LIZIZ();
                    return anonymousClass491;
                }
                return null;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd interfaceC67352kd) {
                Object LIZ;
                Long l;
                C41D c41d = (C41D) c1023940d;
                if (this.LIZ.isDebugMode()) {
                    return Boolean.TRUE;
                }
                ECBannerContent eCBannerContent = this.LJI;
                if (eCBannerContent == null) {
                    try {
                        LIZ = (ECBannerContent) C62070OXq.LIZ(ECBannerContent.class, c41d.LIZIZ.getMsgContent().getTips());
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    if (C3C5.m12isFailureimpl(LIZ)) {
                        LIZ = null;
                    }
                    eCBannerContent = (ECBannerContent) LIZ;
                }
                this.LJI = eCBannerContent;
                if (eCBannerContent != null && (l = eCBannerContent.orderId) != null) {
                    if (AnonymousClass492.LIZ(l.longValue()) >= 3) {
                        return Boolean.FALSE;
                    }
                    if (this.LJ.getChatType() == 3) {
                        return Boolean.FALSE;
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        });
        final ViewGroup L32 = L3();
        final InterfaceC85393Wt interfaceC85393Wt = (InterfaceC85393Wt) this.LLIFFJFJJ.getValue();
        final C1025040o c1025040o = new C1025040o(this);
        final AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 852);
        N3.LJLIL.LJIIJJI(new C42Q<C1023940d, C101353yN>(L32, interfaceC85393Wt, c1025040o, aqS151S0100000_1) { // from class: X.40f
            public final InterfaceC85393Wt LJ;
            public final InterfaceC65784Pro<IMUser> LJFF;
            public final InterfaceC65784Pro<Integer> LJI;
            public final /* synthetic */ AnonymousClass410 LJII;

            @Override // X.AbstractC1036945d, X.AnonymousClass412
            public final void pause() {
                this.LJII.pause();
            }

            @Override // X.AbstractC1036945d, X.AnonymousClass412
            public final void resume() {
                this.LJII.resume();
            }

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                C101353yN c101353yN = (C101353yN) this.LIZLLL;
                if (c101353yN != null && c101353yN.getVisibility() != 8) {
                    c101353yN.LJLIL.LIZIZ(c101353yN);
                    C101353yN.LIZJ(0, c101353yN.LJLJI);
                }
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C1023940d c1023940d, InterfaceC67352kd<? super C3WY> interfaceC67352kd) {
                C101353yN c101353yN = (C101353yN) this.LIZLLL;
                if (c101353yN != null) {
                    InterfaceC85393Wt callback = this.LJ;
                    o.LJIIIZ(callback, "callback");
                    C85373Wr c85373Wr = c101353yN.LJLIL;
                    c85373Wr.getClass();
                    ((ArrayList) c85373Wr.LJLILLLLZI).add(callback);
                    c101353yN.LIZLLL(this.LJFF.invoke());
                    return c101353yN;
                }
                return null;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
                boolean z;
                if (this.LIZ.isDebugMode()) {
                    return Boolean.TRUE;
                }
                IMUser invoke = this.LJFF.invoke();
                if (invoke == null) {
                    return Boolean.FALSE;
                }
                if (C3UE.LIZIZ() && invoke.getFollowStatus() == 0 && this.LJI.invoke().intValue() > 5 && C92353jr.LIZ.LIZ(invoke.getUid())) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C41X.MATCHED_FRIEND, L32, R.layout.b94);
                o.LJIIIZ(interfaceC85393Wt, "chatNoticeAnimationCallback");
                this.LJ = interfaceC85393Wt;
                this.LJFF = c1025040o;
                this.LJI = aqS151S0100000_1;
                this.LJII = new AnonymousClass410(L32);
            }
        });
        if (C53181Ku1.LIZ() && !((Boolean) this.LJZI.getValue()).booleanValue() && (context = getContext()) != null) {
            N3.LJLIL.LJIIJJI(new AnonymousClass496(context, O3()));
        }
        AnonymousClass418 anonymousClass418 = new AnonymousClass418(L3(), O3(), new C89203em(this), AnonymousClass414.LJLIL);
        N3.LJLIL.LJIIJJI(anonymousClass418);
        this.LLIIII = anonymousClass418;
        final C98523to O32 = O3();
        Object value = this.LLFZ.getValue();
        o.LJIIIIZZ(value, "<get-topContainerView>(...)");
        final C102293zt c102293zt = (C102293zt) value;
        N3.LJLIL.LJIIJJI(new AbstractC1036945d<C41D>(O32, c102293zt) { // from class: X.40m
            public final C98523to LIZIZ;
            public final C102293zt LIZJ;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                this.LIZJ.LIZIZ();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C41X.TOP_TIP_FOLLOW);
                o.LJIIIZ(O32, "sessionInfo");
                this.LIZIZ = O32;
                this.LIZJ = c102293zt;
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                C41D c41d2 = c41d;
                C102293zt c102293zt2 = this.LIZJ;
                IMUser fromUser = this.LIZIZ.getFromUser();
                if (fromUser != null) {
                    c102293zt2.LJIIIZ(c41d2.LIZIZ, fromUser);
                }
                return c102293zt2;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                boolean z;
                if (this.LIZ.isDebugMode() || this.LIZIZ.getFromUser() != null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        final ViewGroup L33 = L3();
        final C98523to O33 = O3();
        final ?? r9 = new InterfaceC785236i() { // from class: X.3sv
            @Override // X.InterfaceC785236i
            public final void LIZIZ() {
                ActivityC45651qj LJIIIIZZ;
                FragmentManager supportFragmentManager;
                if (((Boolean) SingleChatNoticeAssem.this.LJZI.getValue()).booleanValue()) {
                    ActivityC45651qj LJIIIIZZ2 = C55096Ljo.LJIIIIZZ(SingleChatNoticeAssem.this);
                    if (LJIIIIZZ2 != null && (supportFragmentManager = LJIIIIZZ2.getSupportFragmentManager()) != null) {
                        Fragment LJJJIL = supportFragmentManager.LJJJIL("quick_chat_sheet");
                        if (LJJJIL instanceof DialogFragment) {
                            ((DialogFragment) LJJJIL).dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (SingleChatNoticeAssem.this.O3().isBookMode()) {
                    InterfaceC97983sw LIZ = LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZ();
                    if (LIZ == null) {
                        return;
                    }
                    LIZ.LIZIZ();
                    LIZ.LIZ();
                    return;
                }
                ActivityC45651qj LJIIIIZZ3 = C55096Ljo.LJIIIIZZ(SingleChatNoticeAssem.this);
                if (LJIIIIZZ3 == null || !C73340SqO.LJJIJ(LJIIIIZZ3) || (LJIIIIZZ = C55096Ljo.LJIIIIZZ(SingleChatNoticeAssem.this)) == null) {
                    return;
                }
                LJIIIIZZ.finish();
            }
        };
        final InterfaceC85393Wt interfaceC85393Wt2 = (InterfaceC85393Wt) this.LLIFFJFJJ.getValue();
        final C3F6 c3f6 = new C3F6(this, null);
        N3.LJLIL.LJIIJJI(new C42Q<C1023940d, C3WV>(L33, O33, r9, interfaceC85393Wt2, c3f6) { // from class: X.40e
            public final C98523to LJ;
            public final InterfaceC785236i LJFF;
            public final InterfaceC85393Wt LJI;
            public final InterfaceC88472Yns<InterfaceC67352kd<? super IMUser>, Object> LJII;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                C3WV c3wv = (C3WV) this.LIZLLL;
                if (c3wv != null && c3wv.getVisibility() == 0) {
                    c3wv.LJLIL.LIZIZ(c3wv);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
            @Override // X.AbstractC1036945d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJ(X.C1023940d r8, X.InterfaceC67352kd<? super X.C3WY> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof X.C1024640k
                    if (r0 == 0) goto L77
                    r6 = r9
                    X.40k r6 = (X.C1024640k) r6
                    int r2 = r6.LJLJJLL
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L77
                    int r2 = r2 - r1
                    r6.LJLJJLL = r2
                L12:
                    java.lang.Object r5 = r6.LJLJJI
                    X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
                    int r0 = r6.LJLJJLL
                    r3 = 1
                    if (r0 == 0) goto L45
                    if (r0 != r3) goto L7d
                    X.3WV r2 = r6.LJLJI
                    X.3WV r4 = r6.LJLILLLLZI
                    X.40e r0 = r6.LJLIL
                    X.C141335gf.LIZJ(r5)
                L26:
                    com.ss.android.ugc.aweme.im.service.model.IMUser r5 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r5
                    if (r5 == 0) goto L41
                    X.3to r3 = r0.LJ
                    X.36i r1 = r0.LJFF
                    r2.getClass()
                    java.lang.String r0 = "sessionInfo"
                    kotlin.jvm.internal.o.LJIIIZ(r3, r0)
                    java.lang.String r0 = "listener"
                    kotlin.jvm.internal.o.LJIIIZ(r1, r0)
                    r2.LJLJJLL = r3
                    r2.LJLJL = r5
                    r2.LJLJLJ = r1
                L41:
                    r2.LIZ()
                L44:
                    return r4
                L45:
                    X.C141335gf.LIZJ(r5)
                    V extends android.view.View r2 = r7.LIZLLL
                    X.3WV r2 = (X.C3WV) r2
                    if (r2 == 0) goto L75
                    X.3Wt r1 = r7.LJI
                    java.lang.String r0 = "callback"
                    kotlin.jvm.internal.o.LJIIIZ(r1, r0)
                    X.3Wr r0 = r2.LJLIL
                    r0.getClass()
                    java.util.List<X.3Wt> r0 = r0.LJLILLLLZI
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    r0.add(r1)
                    X.Yns<X.2kd<? super com.ss.android.ugc.aweme.im.service.model.IMUser>, java.lang.Object> r0 = r7.LJII
                    r6.LJLIL = r7
                    r6.LJLILLLLZI = r2
                    r6.LJLJI = r2
                    r6.LJLJJLL = r3
                    java.lang.Object r5 = r0.invoke(r6)
                    if (r5 != r4) goto L72
                    return r4
                L72:
                    r4 = r2
                    r0 = r7
                    goto L26
                L75:
                    r4 = 0
                    goto L44
                L77:
                    X.40k r6 = new X.40k
                    r6.<init>(r7, r9)
                    goto L12
                L7d:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1024040e.LJ(X.40d, X.2kd):java.lang.Object");
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
            @Override // X.AbstractC1036945d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJFF(X.C1023940d r6, X.InterfaceC67352kd<? super java.lang.Boolean> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof X.C1024740l
                    if (r0 == 0) goto L47
                    r4 = r7
                    X.40l r4 = (X.C1024740l) r4
                    int r2 = r4.LJLJI
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L47
                    int r2 = r2 - r1
                    r4.LJLJI = r2
                L12:
                    java.lang.Object r3 = r4.LJLIL
                    X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
                    int r0 = r4.LJLJI
                    r1 = 1
                    if (r0 == 0) goto L31
                    if (r0 != r1) goto L4d
                    X.C141335gf.LIZJ(r3)
                L20:
                    com.ss.android.ugc.aweme.im.service.model.IMUser r3 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r3
                    if (r3 == 0) goto L2f
                    boolean r0 = r3.isBlock()
                    if (r0 != r1) goto L2f
                L2a:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    return r0
                L2f:
                    r1 = 0
                    goto L2a
                L31:
                    X.C141335gf.LIZJ(r3)
                    X.41X r0 = r5.LIZ
                    boolean r0 = r0.isDebugMode()
                    if (r0 != 0) goto L2a
                    X.Yns<X.2kd<? super com.ss.android.ugc.aweme.im.service.model.IMUser>, java.lang.Object> r0 = r5.LJII
                    r4.LJLJI = r1
                    java.lang.Object r3 = r0.invoke(r4)
                    if (r3 != r2) goto L20
                    return r2
                L47:
                    X.40l r4 = new X.40l
                    r4.<init>(r5, r7)
                    goto L12
                L4d:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1024040e.LJFF(X.40d, X.2kd):java.lang.Object");
            }

            {
                o.LJIIIZ(O33, "sessionInfo");
                o.LJIIIZ(interfaceC85393Wt2, "chatNoticeAnimationCallback");
                C41X c41x = C41X.BLOCK;
                this.LJ = O33;
                this.LJFF = r9;
                this.LJI = interfaceC85393Wt2;
                this.LJII = c3f6;
            }
        });
        final ViewGroup L34 = L3();
        final C81403Hk c81403Hk = new C81403Hk(new AqS151S0100000_1(this, 851));
        final C98523to O34 = O3();
        N3.LJLIL.LJIIJJI(new C42Q<C1023940d, C3WT>(L34, c81403Hk, O34) { // from class: X.405
            public final C81403Hk LJ;
            public final C98523to LJFF;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                C3WT c3wt = (C3WT) this.LIZLLL;
                if (c3wt != null) {
                    c3wt.setVisibility(8);
                    c3wt.LIZJ();
                }
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C1023940d c1023940d, InterfaceC67352kd<? super C3WY> interfaceC67352kd) {
                C3WT c3wt = (C3WT) this.LIZLLL;
                if (c3wt != null) {
                    C98523to sessionInfo = this.LJFF;
                    C81403Hk action = this.LJ;
                    o.LJIIIZ(sessionInfo, "sessionInfo");
                    o.LJIIIZ(action, "action");
                    c3wt.LJLILLLLZI = action;
                    c3wt.LJLJI = sessionInfo;
                    c3wt.setVisibility(0);
                    C84643Tw.LJFF(this.LJFF);
                    return c3wt;
                }
                return null;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
                boolean z;
                if (this.LIZ.isDebugMode() || this.LJFF.isStrangerChat() || this.LJFF.isFiltered()) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            {
                o.LJIIIZ(O34, "singleSessionInfo");
                C41X c41x = C41X.STRANGER_CHAT;
                this.LJ = c81403Hk;
                this.LJFF = O34;
            }
        });
        Object value2 = this.LLFZ.getValue();
        o.LJIIIIZZ(value2, "<get-topContainerView>(...)");
        final C102293zt c102293zt2 = (C102293zt) value2;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        final C4WC c4wc = C4WC.LIZIZ;
        final C98523to O35 = O3();
        N3.LJLIL.LJIIJJI(new AbstractC1036945d<C1023940d>(c102293zt2, c4wc, O35) { // from class: X.40b
            public final ViewGroup LIZIZ;
            public final C3Q9 LIZJ;
            public final C98523to LIZLLL;
            public C3WQ LJ;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                this.LIZIZ.removeAllViews();
                C3WQ c3wq = this.LJ;
                if (c3wq != null) {
                    c3wq.LIZ();
                }
            }

            @Override // X.AbstractC1036945d
            public final void LIZJ(C1023940d nextTask) {
                o.LJIIIZ(nextTask, "nextTask");
                this.LJ = null;
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C1023940d c1023940d, InterfaceC67352kd<? super C3WY> interfaceC67352kd) {
                C17N.LJJIIZ(R.layout.b8q, this.LIZIZ);
                this.LIZIZ.setVisibility(0);
                C3WQ c3wq = new C3WQ();
                this.LJ = c3wq;
                return c3wq;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
                String str;
                C63088OpQ coreInfo;
                java.util.Map<String, String> ext;
                if (this.LIZ.isDebugMode()) {
                    return Boolean.TRUE;
                }
                C63120Opw LIZ = this.LIZJ.LIZ(this.LIZLLL.getConversationId());
                boolean z = false;
                if (this.LIZLLL.isTCM() || (LIZ != null && C79004UzY.LJJIIJZLJL(LIZ))) {
                    String str2 = null;
                    if (LIZ != null && (coreInfo = LIZ.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
                        str = ext.get("a:banner_setter");
                    } else {
                        str = null;
                    }
                    User LIZJ = C80763Ey.LIZJ();
                    if (LIZJ != null) {
                        str2 = LIZJ.getUid();
                    }
                    if (!o.LJ(str, str2)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C41X.TCM);
                o.LJIIIZ(c4wc, "conversationListModel");
                o.LJIIIZ(O35, "singleSessionInfo");
                this.LIZIZ = c102293zt2;
                this.LIZJ = c4wc;
                this.LIZLLL = O35;
            }
        });
        SingleChatNoticeViewModel N32 = N3();
        N32.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(N32), null, null, new C1024340h(N32, null), 3);
        ChatNoticeViewModel chatNoticeViewModel = (ChatNoticeViewModel) this.LL.getValue();
        if (chatNoticeViewModel != null && (mutableLiveData = chatNoticeViewModel.LJLJLJ) != null) {
            mutableLiveData.observe(this, new AObserverS69S0100000_1(this, 98));
        }
        C8YN.LJII(this, (AssemViewModel) this.LJZL.getValue(), new TBT() { // from class: X.40r
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C101703yw) obj).LJLIL;
            }
        }, C213688a4.LJ(), new AqS183S0100000_1(this, 88), 4);
        ChatRoomViewModel chatRoomViewModel = (ChatRoomViewModel) this.LLD.getValue();
        if (chatRoomViewModel != null && (c73893SzJ = chatRoomViewModel.LJLLLL) != null) {
            C78999UzT.LJFF(C73542Ste.LJIIIIZZ(c73893SzJ.LJJJ(C73969T1h.LIZIZ()), null, null, new C1027941r(N3()), 3), this.LLIIIILZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        this.LLIIIILZ.LIZLLL();
    }

    public final void P3(RelationStatus relationStatus) {
        ChatNoticeViewModel chatNoticeViewModel;
        AnonymousClass418 anonymousClass418;
        if (relationStatus.getFollowStatus() == 1 || relationStatus.getFollowStatus() == 2) {
            SingleChatNoticeViewModel N3 = N3();
            C41X targetTemplateId = C41X.MATCHED_FRIEND;
            N3.getClass();
            o.LJIIIZ(targetTemplateId, "targetTemplateId");
            XKX.LIZLLL(ViewModelKt.getViewModelScope(N3), null, null, new AnonymousClass415(N3, targetTemplateId, null), 3);
            AnonymousClass418 anonymousClass4182 = this.LLIIII;
            if ((anonymousClass4182 == null || !anonymousClass4182.LJII()) && ((Boolean) C45V.LIZ.getValue()).booleanValue() && relationStatus.getFollowStatus() == 2 && (chatNoticeViewModel = (ChatNoticeViewModel) this.LL.getValue()) != null) {
                chatNoticeViewModel.gv0();
            }
        } else if (relationStatus.getFollowStatus() == 0 && (anonymousClass418 = this.LLIIII) != null) {
            anonymousClass418.LJII();
        }
        C101543yg c101543yg = C101543yg.LIZ;
        int followStatus = relationStatus.getFollowStatus();
        c101543yg.getClass();
        C101543yg.LIZIZ = followStatus;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onStrangerRelationUpdate(C794539x event) {
        String str;
        o.LJIIIZ(event, "event");
        IMUser fromUser = O3().getFromUser();
        if (fromUser != null) {
            str = fromUser.getUid();
        } else {
            str = null;
        }
        if (o.LJ(str, event.LJLIL) && O3().isStrangerChat()) {
            N3().setState(C1026140z.LJLIL);
            if (!O3().isFiltered()) {
                SingleChatNoticeViewModel N3 = N3();
                C41X targetTemplateId = C41X.STRANGER_CHAT;
                N3.getClass();
                o.LJIIIZ(targetTemplateId, "targetTemplateId");
                XKX.LIZLLL(ViewModelKt.getViewModelScope(N3), null, null, new AnonymousClass415(N3, targetTemplateId, null), 3);
            }
        }
        ChatRoomViewModel chatRoomViewModel = (ChatRoomViewModel) this.LLD.getValue();
        if (chatRoomViewModel != null) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(chatRoomViewModel), C78613UtF.LIZJ, null, new C3F7(chatRoomViewModel, null), 2);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUserUpdate(C39R event) {
        String str;
        o.LJIIIZ(event, "event");
        if (O3().isStrangerChat() && event.LJLJI.getFollowStatus() > 0) {
            N3().setState(C1026140z.LJLIL);
        }
        IMUser fromUser = O3().getFromUser();
        if (fromUser != null) {
            str = fromUser.getUid();
        } else {
            str = null;
        }
        if (o.LJ(str, event.LJLIL)) {
            SingleChatNoticeViewModel N3 = N3();
            boolean isBlock = event.LJLJI.isBlock();
            N3.getClass();
            XKX.LIZLLL(ViewModelKt.getViewModelScope(N3), null, null, new C1025840w(isBlock, N3, null), 3);
        }
    }
}
