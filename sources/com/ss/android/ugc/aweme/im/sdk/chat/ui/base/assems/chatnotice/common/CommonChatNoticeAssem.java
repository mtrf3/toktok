package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common;

import X.AbstractC1036945d;
import X.AbstractC89473fD;
import X.ActivityC45651qj;
import X.AnonymousClass420;
import X.AnonymousClass421;
import X.AnonymousClass434;
import X.AnonymousClass436;
import X.C101993zP;
import X.C102293zt;
import X.C1023940d;
import X.C1026241a;
import X.C1026941h;
import X.C1027841q;
import X.C1031042w;
import X.C1043747t;
import X.C110584Vq;
import X.C17N;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C3BD;
import X.C3BE;
import X.C3FJ;
import X.C41D;
import X.C41E;
import X.C41Y;
import X.C42G;
import X.C42Q;
import X.C43E;
import X.C43F;
import X.C43R;
import X.C43S;
import X.C47704Ins;
import X.C4BH;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73893SzJ;
import X.C73969T1h;
import X.C76800UCe;
import X.C78926UyI;
import X.C78999UzT;
import X.C89333ez;
import X.C8YN;
import X.C97873sl;
import X.C99033ud;
import X.C9BE;
import X.EnumC105154At;
import X.EnumC95013o9;
import X.InterfaceC65350Pko;
import X.InterfaceC71762rk;
import X.InterfaceC85393Wt;
import X.InterfaceC88472Yns;
import X.QD3;
import X.TBR;
import X.TBT;
import X.V1M;
import X.V8H;
import X.XKX;
import Y.AObserverS69S0100000_1;
import Y.ARunnableS37S0100000_1;
import Y.IDeS150S0200000_1;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.ActionBarAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.IMInputViewUIAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS6S0010000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public abstract class CommonChatNoticeAssem extends UIContentAssem implements ChatNoticeAbility, C4BH {
    public final C55749LuL LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C214298b3 LJLJL;
    public final C214298b3 LJLJLJ;
    public final C214298b3 LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public final C73318Sq2 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        C73893SzJ<AbstractC89473fD> c73893SzJ;
        MutableLiveData<ImChatTopTipModel> mutableLiveData;
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, ChatNoticeAbility.class, null);
        }
        C102293zt C3 = C3();
        C99033ud F3 = F3();
        H3();
        C3.LIZJ(F3);
        ChatNoticeViewModel chatNoticeViewModel = (ChatNoticeViewModel) this.LJLJJL.getValue();
        if (chatNoticeViewModel != null && (mutableLiveData = chatNoticeViewModel.LJLJLJ) != null) {
            mutableLiveData.observe(this, new AObserverS69S0100000_1(this, 2));
        }
        C8YN.LJII(this, E3(this), new TBT() { // from class: X.43T
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AnonymousClass432) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 0), 6);
        C8YN.LJII(this, E3(this), new TBT() { // from class: X.43U
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AnonymousClass432) obj).LJLJI;
            }
        }, null, new AqS183S0100000_1(this, 1), 6);
        if (!H3()) {
            C8YN.LJII(this, E3(this), new TBT() { // from class: X.43N
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((AnonymousClass432) obj).LJLIL);
                }
            }, C213688a4.LJ(), new AqS183S0100000_1(this, 2), 4);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        CommonChatNoticeViewModel E3 = E3(this);
        E3.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(E3), null, null, new C41Y(E3, null), 3);
        ChatNoticeViewModel chatNoticeViewModel2 = (ChatNoticeViewModel) this.LJLJJL.getValue();
        if (chatNoticeViewModel2 != null) {
            chatNoticeViewModel2.gv0();
        }
        ChatRoomViewModel A3 = A3(this);
        if (A3 != null && (c73893SzJ = A3.LJLLLL) != null) {
            C78999UzT.LJFF(C73542Ste.LJIIIIZZ(c73893SzJ.LJJJ(C73969T1h.LIZIZ()), null, null, new C1027841q(E3(this)), 3), this.LJLLILLLL);
        }
        C8YN.LJII(this, this.LJLJLLL.getValue(), new TBT() { // from class: X.43P
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C105044Ai) obj).LJLJJL);
            }
        }, C213688a4.LJ(), new AqS183S0100000_1(this, 3), 4);
        SuggestedEmojiViewModel suggestedEmojiViewModel = (SuggestedEmojiViewModel) this.LJLJJLL.getValue();
        LifecycleRegistry lifecycle = getLifecycle();
        o.LJIIIZ(lifecycle, "lifecycle");
        suggestedEmojiViewModel.LJLILLLLZI = this;
        lifecycle.addObserver(suggestedEmojiViewModel.LJLJL);
    }

    public CommonChatNoticeAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = C17N.LJJIJL(new AqS151S0100000_1(this, 340));
        this.LJLJI = C17N.LJJIJL(new AqS151S0100000_1(this, 338));
        this.LJLJJI = C17N.LJJIJL(new AqS151S0100000_1(this, 336));
        this.LJLJJL = C17N.LJJIJL(new AqS151S0100000_1(this, 335));
        this.LJLJJLL = C1043747t.LIZ(this);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MessageListViewModel.class);
        this.LJLJL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 341), C43F.INSTANCE, null);
        this.LJLJLJ = C1031042w.LIZ(this);
        C65776Prg LIZ2 = C65352Pkq.LIZ(ChatRoomInputVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 342), AnonymousClass436.INSTANCE, null);
        this.LJLL = C17N.LJJIJL(new AqS151S0100000_1(this, 337));
        this.LJLLI = C17N.LJJIJL(new AqS151S0100000_1(this, 333));
        this.LJLLILLLL = new C73318Sq2();
        this.LJLLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 332));
        this.LJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 331));
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 334));
    }

    private final boolean H3() {
        return ((Boolean) this.LJLJI.getValue()).booleanValue();
    }

    public final C102293zt C3() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-chatTopTip>(...)");
        return (C102293zt) value;
    }

    public final C99033ud F3() {
        return (C99033ud) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [X.42u] */
    public void I3() {
        InterfaceC71762rk LIZ;
        IDeS150S0200000_1 iDeS150S0200000_1;
        CommonChatNoticeViewModel E3 = E3(this);
        final C99033ud F3 = F3();
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-bottomContainer>(...)");
        final ViewGroup viewGroup = (ViewGroup) value;
        final InterfaceC85393Wt interfaceC85393Wt = (InterfaceC85393Wt) this.LJLLLL.getValue();
        E3.LJLIL.LJIIJJI(new C42Q<C41D, C97873sl>(F3, viewGroup, interfaceC85393Wt) { // from class: X.40i
            public final C99033ud LJ;
            public final ViewGroup LJFF;
            public final InterfaceC85393Wt LJI;
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
                C97873sl c97873sl = (C97873sl) this.LIZLLL;
                if (c97873sl != null) {
                    c97873sl.LIZ(true);
                }
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C1023940d c1023940d, InterfaceC67352kd interfaceC67352kd) {
                C41D c41d = (C41D) c1023940d;
                C97873sl c97873sl = (C97873sl) this.LIZLLL;
                if (c97873sl != null) {
                    InterfaceC85393Wt callback = this.LJI;
                    o.LJIIIZ(callback, "callback");
                    C85373Wr c85373Wr = c97873sl.LJLIL;
                    c85373Wr.getClass();
                    ((ArrayList) c85373Wr.LJLILLLLZI).add(callback);
                    C99033ud c99033ud = this.LJ;
                    String noticeCode = c41d.LIZIZ.getNoticeCode();
                    if (noticeCode == null) {
                        noticeCode = "";
                    }
                    c97873sl.LIZIZ(c99033ud, noticeCode, this.LJ.getConversationId());
                    return c97873sl;
                }
                return null;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd interfaceC67352kd) {
                boolean z;
                C41D c41d = (C41D) c1023940d;
                if (this.LIZ.isDebugMode() || !C102343zy.LIZ(c41d.LIZIZ.getNoticeCode())) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C41X.SAFE_CONVERSATION, viewGroup, R.layout.b9i);
                o.LJIIIZ(F3, "sessionInfo");
                o.LJIIIZ(interfaceC85393Wt, "chatNoticeAnimationCallback");
                this.LJ = F3;
                this.LJFF = viewGroup;
                this.LJI = interfaceC85393Wt;
                this.LJII = new AnonymousClass410(viewGroup);
            }
        });
        Object value2 = this.LJLLI.getValue();
        o.LJIIIIZZ(value2, "<get-bottomContainer>(...)");
        final ViewGroup viewGroup2 = (ViewGroup) value2;
        final C99033ud F32 = F3();
        final boolean H3 = H3();
        E3.LJLIL.LJIIJJI(new C42Q<C43R, C110584Vq>(viewGroup2, F32, H3) { // from class: X.41i
            public final ViewGroup LJ;
            public final C99033ud LJFF;
            public final boolean LJI;
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
                C110584Vq c110584Vq = (C110584Vq) this.LIZLLL;
                if (c110584Vq != null) {
                    C110584Vq.LIZ(c110584Vq);
                }
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C1023940d c1023940d, InterfaceC67352kd interfaceC67352kd) {
                C110584Vq c110584Vq = (C110584Vq) this.LIZLLL;
                if (c110584Vq != null) {
                    C110584Vq.LIZJ(c110584Vq);
                    return c110584Vq;
                }
                return null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
            
                if (r1.LJJIJL(r0) == false) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
            
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
            
                if (X.C42R.LIZ(r3, r2, !r7.LIZIZ, r6.LJFF) != false) goto L10;
             */
            @Override // X.AbstractC1036945d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJFF(X.C1023940d r7, X.InterfaceC67352kd r8) {
                /*
                    r6 = this;
                    X.43R r7 = (X.C43R) r7
                    X.41X r0 = r6.LIZ
                    boolean r0 = r0.isDebugMode()
                    r5 = 1
                    if (r0 != 0) goto L39
                    boolean r0 = r7.LIZIZ
                    java.lang.String r4 = "containerView.context"
                    if (r0 != 0) goto L22
                    X.Lwa r1 = X.C55888Lwa.LIZIZ
                    android.view.ViewGroup r0 = r6.LJ
                    android.content.Context r0 = r0.getContext()
                    kotlin.jvm.internal.o.LJIIIIZZ(r0, r4)
                    boolean r0 = r1.LJJIJL(r0)
                    if (r0 != 0) goto L3e
                L22:
                    boolean r3 = r6.LJI
                    android.view.ViewGroup r0 = r6.LJ
                    android.content.Context r2 = r0.getContext()
                    kotlin.jvm.internal.o.LJIIIIZZ(r2, r4)
                    boolean r0 = r7.LIZIZ
                    r1 = r0 ^ 1
                    X.3ud r0 = r6.LJFF
                    boolean r0 = X.C42R.LIZ(r3, r2, r1, r0)
                    if (r0 == 0) goto L3e
                L39:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                    return r0
                L3e:
                    r5 = 0
                    goto L39
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1027041i.LJFF(X.40d, X.2kd):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C41X.OUT_PUSH_GUIDE_BOTTOM, viewGroup2, R.layout.b9b);
                o.LJIIIZ(F32, "sessionInfo");
                this.LJ = viewGroup2;
                this.LJFF = F32;
                this.LJI = H3;
                this.LJII = new AnonymousClass410(viewGroup2);
            }
        });
        Context context = getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        E3.LJLIL.LJIIJJI(new C1026941h(context, new AnonymousClass420(this)));
        final ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        E3.LJLIL.LJIIJJI(new AbstractC1036945d<C41D>(LIZ2) { // from class: X.426
            public final ActivityC45651qj LIZIZ;
            public C101683yu LIZJ;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                TuxSheet tuxSheet;
                TuxSheet tuxSheet2;
                C101683yu c101683yu = this.LIZJ;
                if (c101683yu != null && (tuxSheet = c101683yu.LJLJI) != null && !tuxSheet.isStateSaved() && (tuxSheet2 = c101683yu.LJLJI) != null) {
                    tuxSheet2.dismiss();
                }
            }

            {
                super(C41X.PERMISSION_REMINDER_POPUP);
                this.LIZIZ = LIZ2;
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                ActivityC45651qj activityC45651qj = this.LIZIZ;
                if (activityC45651qj == null) {
                    return null;
                }
                C101683yu c101683yu = new C101683yu(activityC45651qj);
                FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
                c101683yu.LIZIZ(supportFragmentManager);
                this.LIZJ = c101683yu;
                return c101683yu;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                return Boolean.TRUE;
            }
        });
        final Context context2 = getContainerView().getContext();
        o.LJIIIIZZ(context2, "containerView.context");
        final boolean H32 = H3();
        final C99033ud F33 = F3();
        E3.LJLIL.LJIIJJI(new AbstractC1036945d<C43S>(context2, H32, F33) { // from class: X.41e
            public final Context LIZIZ;
            public final boolean LIZJ;
            public final C99033ud LIZLLL;
            public Class<?> LJ;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                Class<?> cls = this.LJ;
                if (cls != null) {
                    PopupManager.LIZJ(cls);
                }
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C43S c43s, InterfaceC67352kd interfaceC67352kd) {
                GuideOutPushParam guideOutPushParam = new GuideOutPushParam("notification_page", (String) null, "dm", (String) null, 21);
                final C3WQ c3wq = new C3WQ();
                Class<?> LIZLLL = C55888Lwa.LIZIZ.LIZLLL(this.LIZIZ, guideOutPushParam, new MS3() { // from class: X.43c
                    @Override // X.MS3
                    public final void invoke() {
                        C3WQ.this.LIZ();
                    }
                });
                this.LJ = LIZLLL;
                if (LIZLLL == null) {
                    return null;
                }
                return c3wq;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C43S c43s, InterfaceC67352kd interfaceC67352kd) {
                boolean z;
                C43S c43s2 = c43s;
                if (this.LIZ.isDebugMode() || (!C40322Fs6.LIZJ(this.LIZIZ) && !this.LIZJ && ((c43s2.LIZIZ || this.LIZLLL.getEnterFrom() == 6 || this.LIZLLL.getUnreadCount() > 0) && C55888Lwa.LIZIZ.LJJIJL(this.LIZIZ)))) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C41X.OUT_PUSH_GUIDE_POPUP);
                o.LJIIIZ(F33, "sessionInfo");
                this.LIZIZ = context2;
                this.LIZJ = H32;
                this.LIZLLL = F33;
            }
        });
        final Context context3 = getContainerView().getContext();
        o.LJIIIIZZ(context3, "containerView.context");
        E3.LJLIL.LJIIJJI(new AbstractC1036945d<AnonymousClass434>(context3) { // from class: X.41p
            public final Context LIZIZ;
            public C101713yx LIZJ;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                C101713yx c101713yx = this.LIZJ;
                if (c101713yx != null) {
                    C26231ARf c26231ARf = c101713yx.LIZJ;
                    if (c26231ARf != null) {
                        c26231ARf.LIZIZ(null);
                        return;
                    } else {
                        o.LJIJI("dialog");
                        throw null;
                    }
                }
                o.LJIJI("popup");
                throw null;
            }

            {
                super(C41X.PERMISSION_REMINDER_DIALOG);
                this.LIZIZ = context3;
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(AnonymousClass434 anonymousClass434, InterfaceC67352kd interfaceC67352kd) {
                final AnonymousClass434 anonymousClass4342 = anonymousClass434;
                final C3WQ c3wq = new C3WQ();
                C101713yx c101713yx = new C101713yx(this.LIZIZ, new C101603ym());
                this.LIZJ = c101713yx;
                c101713yx.LIZ(EnumC101493yb.FRIENDS_BEFORE_SEND, anonymousClass4342.LIZJ, new InterfaceC101763z2() { // from class: X.43s
                    @Override // X.InterfaceC101763z2
                    public final void LIZ(EnumC101633yp it) {
                        boolean z;
                        o.LJIIIZ(it, "it");
                        if (it == EnumC101633yp.CLICK_RED_BUTTON && C1043047m.LIZ()) {
                            Looper myLooper = Looper.myLooper();
                            if (myLooper == null) {
                                myLooper = C16880lQ.LLJJJJ();
                            }
                            new Handler(myLooper).postDelayed(new ARunnableS37S0100000_1(AnonymousClass434.this, 60), ((Number) C45T.LIZ.getValue()).longValue());
                        } else {
                            if (it == EnumC101633yp.CLICK_LEARN_MORE) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean LJ = o.LJ(AnonymousClass434.this.LIZJ, "not_sent");
                            if (!z && !LJ) {
                                AnonymousClass434.this.LIZIZ.invoke("send_message_with_no_one_permissions_panel");
                            }
                        }
                        c3wq.LIZ();
                    }
                });
                return c3wq;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(AnonymousClass434 anonymousClass434, InterfaceC67352kd interfaceC67352kd) {
                return Boolean.TRUE;
            }
        });
        final C102293zt C3 = C3();
        E3.LJLIL.LJIIJJI(new AbstractC1036945d<C1023940d>(C3) { // from class: X.40X
            public final C102293zt LIZIZ;
            public final Context LIZJ;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                this.LIZIZ.LIZIZ();
            }

            {
                super(C41X.PUSH_PREVIEW);
                this.LIZIZ = C3;
                Context context4 = C3.getContext();
                o.LJIIIIZZ(context4, "chatTopTip.context");
                this.LIZJ = context4;
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C1023940d c1023940d, InterfaceC67352kd<? super C3WY> interfaceC67352kd) {
                C102293zt c102293zt = this.LIZIZ;
                c102293zt.LJII();
                return c102293zt;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
                if (this.LIZ.isDebugMode()) {
                    return Boolean.TRUE;
                }
                if (C102343zy.LIZ("im_push_preview")) {
                    return Boolean.FALSE;
                }
                if (!C83393Pb.LIZ().LIZIZ) {
                    return Boolean.FALSE;
                }
                if (!C83393Pb.LIZ().LIZ) {
                    return Boolean.FALSE;
                }
                if (!C40322Fs6.LIZJ(this.LIZJ)) {
                    return Boolean.FALSE;
                }
                return Boolean.TRUE;
            }
        });
        final C102293zt C32 = C3();
        E3.LJLIL.LJIIJJI(new AbstractC1036945d<C43E>(C32) { // from class: X.42S
            public final C102293zt LIZIZ;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                this.LIZIZ.LIZIZ();
            }

            {
                super(C41X.PERMISSION_MESSAGE);
                this.LIZIZ = C32;
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C43E c43e, InterfaceC67352kd interfaceC67352kd) {
                C102293zt c102293zt = this.LIZIZ;
                c102293zt.LJIIJ(c43e.LIZIZ);
                return c102293zt;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C43E c43e, InterfaceC67352kd interfaceC67352kd) {
                boolean z;
                C43E c43e2 = c43e;
                if (this.LIZ.isDebugMode() || !C102343zy.LIZ(c43e2.LIZJ)) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        final C102293zt C33 = C3();
        final AnonymousClass421 anonymousClass421 = new AnonymousClass421(this);
        E3.LJLIL.LJIIJJI(new AbstractC1036945d<C41D>(C33, anonymousClass421) { // from class: X.424
            public final C102293zt LIZIZ;
            public final InterfaceC102323zw LIZJ;
            public C102003zQ LIZLLL;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                C102003zQ c102003zQ = this.LIZLLL;
                if (c102003zQ != null) {
                    c102003zQ.dismiss();
                }
            }

            {
                super(C41X.READ_RECEIPT_TOP);
                this.LIZIZ = C33;
                this.LIZJ = anonymousClass421;
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                C102293zt c102293zt = this.LIZIZ;
                String noticeCode = c41d.LIZIZ.getNoticeCode();
                if (noticeCode == null) {
                    noticeCode = "";
                }
                C102003zQ LJIIIIZZ = c102293zt.LJIIIIZZ(this.LIZJ, noticeCode);
                this.LIZLLL = LJIIIIZZ;
                return LJIIIIZZ;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                boolean z;
                C41D c41d2 = c41d;
                if (!this.LIZ.isDebugMode()) {
                    String noticeCode = c41d2.LIZIZ.getNoticeCode();
                    if (noticeCode == null) {
                        noticeCode = "";
                    }
                    if (!C32151Nz.LJJIIZ(noticeCode)) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            }
        });
        final C102293zt C34 = C3();
        final CommonChatNoticeViewModel E32 = E3(this);
        final ?? r1 = new TBR(E32) { // from class: X.42u
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                return Boolean.valueOf(((CommonChatNoticeViewModel) this.receiver).LJLJJL);
            }
        };
        E3.LJLIL.LJIIJJI(new AbstractC1036945d<C41D>(C34, r1) { // from class: X.41K
            public final C102293zt LIZIZ;
            public final InterfaceC65784Pro<Boolean> LIZJ;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                this.LIZIZ.LIZIZ();
            }

            @Override // X.AbstractC1036945d
            public final boolean LIZ(C41D c41d) {
                if (C89363f2.LIZIZ() || this.LIZJ.invoke().booleanValue()) {
                    return true;
                }
                return false;
            }

            {
                super(C41X.PERMISSION_REMINDER_BANNER);
                this.LIZIZ = C34;
                this.LIZJ = r1;
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                C102293zt c102293zt = this.LIZIZ;
                c102293zt.LJI(c41d.LIZIZ);
                return c102293zt;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                boolean z;
                if (this.LIZ.isDebugMode() || C89363f2.LIZ()) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        Object value3 = this.LJLLI.getValue();
        o.LJIIIIZZ(value3, "<get-bottomContainer>(...)");
        ViewGroup viewGroup3 = (ViewGroup) value3;
        C99033ud F34 = F3();
        String conversationId = F3().getConversationId();
        ChatRoomViewModel A3 = A3(this);
        if (A3 != null && (iDeS150S0200000_1 = A3.LLFFF) != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C3BD.LIZ.getClass();
            LIZ = V1M.LJJJJLI(iDeS150S0200000_1, lifecycleScope, C3BE.LIZIZ, C3FJ.VISIBLE);
        } else {
            LIZ = V8H.LIZ(C3FJ.HIDDEN_PERMANENTLY);
        }
        E3.LJLIL.LJIIJJI(new C41E(viewGroup3, F34, conversationId, LIZ, new AqS151S0100000_1(this, 339), new AqS167S0100000_1(this, 121)));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.ChatNoticeAbility
    public final void IA() {
        CommonChatNoticeViewModel E3 = E3(this);
        E3.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(E3), null, null, new C42G(E3, null), 3);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), ChatNoticeAbility.class, null);
        }
        EventBus.LIZJ().LJIJ(this);
        this.LJLLILLLL.LIZLLL();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C4BH
    public final void u3() {
        ChatRoomViewModel A3 = A3(this);
        if (A3 != null) {
            A3.LLF.setValue(Boolean.TRUE);
        }
    }

    @Override // X.C4BH
    public final void LLFZ() {
        A3(this);
    }

    public static final ChatRoomViewModel A3(CommonChatNoticeAssem commonChatNoticeAssem) {
        return (ChatRoomViewModel) commonChatNoticeAssem.LJLJJI.getValue();
    }

    public static final CommonChatNoticeViewModel E3(CommonChatNoticeAssem commonChatNoticeAssem) {
        return (CommonChatNoticeViewModel) commonChatNoticeAssem.LJLJLJ.getValue();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowPermissionReminderDialogEvent(C101993zP event) {
        o.LJIIIZ(event, "event");
        CommonChatNoticeViewModel E3 = E3(this);
        InterfaceC88472Yns<String, C76800UCe> sendMessageFunc = event.LJLIL;
        String enterMethod = event.LJLILLLLZI;
        E3.getClass();
        o.LJIIIZ(sendMessageFunc, "sendMessageFunc");
        o.LJIIIZ(enterMethod, "enterMethod");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(E3), null, null, new C1026241a(E3, sendMessageFunc, enterMethod, null), 3);
    }

    public final void K3(boolean z, boolean z2, boolean z3, boolean z4) {
        ChatRoomEditTextAbility chatRoomEditTextAbility;
        this.LJLJL.getValue().setState(new AqS6S0010000_1(!z, 9));
        if (z3) {
            ChatRoomViewModel A3 = A3(this);
            if (A3 != null) {
                A3.kv0(EnumC95013o9.DISABLED);
            }
        } else {
            ChatRoomViewModel A32 = A3(this);
            if (A32 != null) {
                A32.kv0(EnumC95013o9.FULL);
            }
        }
        if (z) {
            IMInputViewUIAbility iMInputViewUIAbility = (IMInputViewUIAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IMInputViewUIAbility.class, null);
            if (iMInputViewUIAbility != null) {
                iMInputViewUIAbility.MH();
            }
        } else {
            IMInputViewUIAbility iMInputViewUIAbility2 = (IMInputViewUIAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IMInputViewUIAbility.class, null);
            if (iMInputViewUIAbility2 != null) {
                iMInputViewUIAbility2.Ws();
            }
        }
        if (z2 && (chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ChatRoomEditTextAbility.class, null)) != null) {
            chatRoomEditTextAbility.tr(EnumC105154At.NONE);
        }
        ActionBarAbility actionBarAbility = (ActionBarAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ActionBarAbility.class, null);
        if (actionBarAbility != null) {
            actionBarAbility.GC("bottom_banner_not_showing", z4);
        }
    }
}
