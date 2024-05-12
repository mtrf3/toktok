package com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui;

import X.AbstractC1036945d;
import X.AbstractC1038245q;
import X.AnonymousClass444;
import X.AnonymousClass446;
import X.AnonymousClass496;
import X.C101043xs;
import X.C102293zt;
import X.C1023940d;
import X.C1028942b;
import X.C1036745b;
import X.C221108m2;
import X.C32O;
import X.C34B;
import X.C39R;
import X.C3F5;
import X.C3F7;
import X.C3Q9;
import X.C3WJ;
import X.C3WT;
import X.C3WV;
import X.C40Z;
import X.C4WC;
import X.C53181Ku1;
import X.C57082Lw;
import X.C62822Ol8;
import X.C75782yE;
import X.C78613UtF;
import X.C794539x;
import X.C81403Hk;
import X.C87687YbD;
import X.C93023kw;
import X.C98523to;
import X.C98693u5;
import X.C99033ud;
import X.C99043ue;
import X.InterfaceC785236i;
import X.InterfaceC93033kx;
import X.InterfaceC98713u7;
import X.ORZ;
import X.QD3;
import X.X1D;
import X.XKX;
import Y.AObserverS69S0100000_1;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageState;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class SingleChatPanel extends BaseChatPanel implements InterfaceC98713u7, InterfaceC93033kx {
    public final C62822Ol8 LLJJLIIIJLLLLLLLZ;
    public final C62822Ol8 LLJL;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel, com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final AbstractC1038245q LJFF() {
        return new C3WJ(LJIJI(), this.LJLJI, this.LJLIL);
    }

    public final C98523to LJIJI() {
        C99033ud c99033ud = this.LJLJJI;
        o.LJII(c99033ud, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.single.data.SingleSessionInfo");
        return (C98523to) c99033ud;
    }

    @Override // X.InterfaceC93033kx
    public final MessageState LLLLLZL() {
        List<IMMessage> currentList = this.LLJILJIL.getCurrentList();
        o.LJIIIIZZ(currentList, "messageAdapter.currentList");
        IMMessage iMMessage = (IMMessage) ORZ.LJLLLL(currentList);
        if (iMMessage != null) {
            return iMMessage.getState();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel, com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public final void onCreate() {
        String LIZIZ;
        C102293zt c102293zt;
        super.onCreate();
        if (this.LJLJJLL.LJLJJL && (c102293zt = (C102293zt) this.LJLLL.getValue()) != null) {
            c102293zt.LIZJ(LJIJI());
        }
        IMUser fromUser = LJIJI().getFromUser();
        if (fromUser == null || (LIZIZ = fromUser.getUid()) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" ext: ");
            LIZ.append(LJIJI().getChatExt());
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        C34B.LIZIZ("SingleChatPanel", LIZIZ);
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZLLL() && this.LJLJJLL.LJLJL) {
            C98693u5.LIZJ(this.LJLJJI.getConversationId(), this);
        }
        if (C87687YbD.LIZ() && this.LJLJJLL.LJLJL) {
            String convId = this.LJLJJI.getConversationId();
            o.LJIIIZ(convId, "convId");
            C93023kw.LIZLLL.put(convId, this);
        }
        if (this.LJLJJLL.LLF) {
            C57082Lw.LIZ.LIZJ("#BOT_RECEIVE_WELCOME_MSG_FINISH").observe(this.LJLJLJ.getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 110));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel, com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public final void onDestroy() {
        super.onDestroy();
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZLLL() && this.LJLJJLL.LJLJL) {
            String convId = this.LJLJJI.getConversationId();
            o.LJIIIZ(convId, "convId");
            C98693u5.LIZLLL.remove(convId);
        }
        if (C87687YbD.LIZ() && this.LJLJJLL.LJLJL) {
            String convId2 = this.LJLJJI.getConversationId();
            o.LJIIIZ(convId2, "convId");
            C93023kw.LIZLLL.remove(convId2);
        }
        if (this.LJLJJLL.LLF) {
            C57082Lw.LIZ.LIZ("#BOT_RECEIVE_WELCOME_MSG_FINISH");
        }
        AnonymousClass444 anonymousClass444 = this.LLFF;
        if (anonymousClass444 != null) {
            anonymousClass444.LIZJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.CharSequence] */
    @Override // X.InterfaceC98713u7
    public final void V1(boolean z) {
        ?? text;
        if (this.LJLJJI.isReportPage()) {
            return;
        }
        C87687YbD.LIZ.getClass();
        if (!C87687YbD.LIZJ()) {
            return;
        }
        String str = "";
        if (z) {
            C101043xs c101043xs = this.LLFZ;
            String conversationId = this.LJLJJI.getConversationId();
            c101043xs.getClass();
            o.LJIIIZ(conversationId, "conversationId");
            if (!C87687YbD.LIZJ() || ((String) c101043xs.LLFFF).length() != 0) {
                return;
            }
            String string = c101043xs.getContext().getString(R.string.ev6);
            o.LJIIIIZZ(string, "context.getString(R.string.dm_typing_indicator)");
            c101043xs.LLFFF = string;
            TuxTextView tuxTextView = c101043xs.LJZL;
            if (tuxTextView != null && (text = tuxTextView.getText()) != 0) {
                str = text;
            }
            c101043xs.LLFII = str;
            TuxTextView tuxTextView2 = c101043xs.LJZL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(c101043xs.LLFFF);
            }
            TuxTextView tuxTextView3 = c101043xs.LJZL;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(0);
            }
            C32O.LIZ(1, conversationId);
            return;
        }
        C101043xs c101043xs2 = this.LLFZ;
        c101043xs2.getClass();
        if (!C87687YbD.LIZJ() || ((String) c101043xs2.LLFFF).length() <= 0) {
            return;
        }
        c101043xs2.LLFFF = "";
        TuxTextView tuxTextView4 = c101043xs2.LJZL;
        if (tuxTextView4 == null) {
            return;
        }
        tuxTextView4.setText(c101043xs2.LLFII);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onStrangerRelationUpdate(C794539x event) {
        String str;
        C98523to c98523to;
        C3WT c3wt;
        o.LJIIIZ(event, "event");
        IMUser fromUser = LJIJI().getFromUser();
        if (fromUser != null) {
            str = fromUser.getUid();
        } else {
            str = null;
        }
        if (o.LJ(str, event.LJLIL) && this.LJLJJI.isStrangerChat()) {
            this.LJZ = true;
            C99033ud c99033ud = this.LJLJJI;
            if ((c99033ud instanceof C98523to) && (c98523to = (C98523to) c99033ud) != null && !c98523to.isFiltered() && (c3wt = (C3WT) this.LJLZ.getValue()) != null) {
                c3wt.setVisibility(8);
                c3wt.LIZJ();
            }
            ChatRoomViewModel chatRoomViewModel = (ChatRoomViewModel) this.LLJL.getValue();
            if (chatRoomViewModel != null) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(chatRoomViewModel), C78613UtF.LIZJ, null, new C3F7(chatRoomViewModel, null), 2);
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUserUpdate(C39R event) {
        String str;
        o.LJIIIZ(event, "event");
        if (!this.LJLJJLL.LLD) {
            return;
        }
        if (this.LJLJJI.isStrangerChat() && event.LJLJI.getFollowStatus() > 0) {
            this.LJZ = true;
        }
        IMUser fromUser = LJIJI().getFromUser();
        if (fromUser != null) {
            str = fromUser.getUid();
        } else {
            str = null;
        }
        if (o.LJ(str, event.LJLIL)) {
            LJIILLIIL(event.LJLJI.isBlock());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1036745b r11, X.InterfaceC67352kd<? super X.C1036745b> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.AnonymousClass406
            if (r0 == 0) goto Lbc
            r4 = r12
            X.406 r4 = (X.AnonymousClass406) r4
            int r2 = r4.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbc
            int r2 = r2 - r1
            r4.LJLJJLL = r2
        L12:
            java.lang.Object r9 = r4.LJLJJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r2 = r4.LJLJJLL
            r5 = 5
            r7 = 4
            r8 = 3
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L3b
            if (r2 == r0) goto L2f
            if (r2 == r1) goto L60
            if (r2 == r8) goto L7c
            if (r2 == r7) goto L98
            if (r2 != r5) goto Lc3
            java.lang.Object r2 = r4.LJLIL
            X.C141335gf.LIZJ(r9)
        L2e:
            return r2
        L2f:
            X.45b r2 = r4.LJLJI
            X.45b r11 = r4.LJLILLLLZI
            java.lang.Object r6 = r4.LJLIL
            com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel r6 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel) r6
            X.C141335gf.LIZJ(r9)
            goto L4f
        L3b:
            X.C141335gf.LIZJ(r9)
            r4.LJLIL = r10
            r4.LJLILLLLZI = r11
            r4.LJLJI = r11
            r4.LJLJJLL = r0
            java.lang.Object r0 = com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel.LIZIZ(r10, r11, r4)
            if (r0 != r3) goto L4d
            return r3
        L4d:
            r6 = r10
            r2 = r11
        L4f:
            X.41X r0 = X.C41X.MEDIA_NUDE_FILTER
            r4.LJLIL = r6
            r4.LJLILLLLZI = r11
            r4.LJLJI = r2
            r4.LJLJJLL = r1
            java.lang.Object r0 = r11.LIZIZ(r0, r4)
            if (r0 != r3) goto L6b
            return r3
        L60:
            X.45b r2 = r4.LJLJI
            X.45b r11 = r4.LJLILLLLZI
            java.lang.Object r6 = r4.LJLIL
            com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel r6 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel) r6
            X.C141335gf.LIZJ(r9)
        L6b:
            X.41X r0 = X.C41X.BLOCK
            r4.LJLIL = r6
            r4.LJLILLLLZI = r11
            r4.LJLJI = r2
            r4.LJLJJLL = r8
            java.lang.Object r0 = r11.LIZIZ(r0, r4)
            if (r0 != r3) goto L87
            return r3
        L7c:
            X.45b r2 = r4.LJLJI
            X.45b r11 = r4.LJLILLLLZI
            java.lang.Object r6 = r4.LJLIL
            com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel r6 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel) r6
            X.C141335gf.LIZJ(r9)
        L87:
            X.41X r0 = X.C41X.STRANGER_CHAT
            r4.LJLIL = r6
            r4.LJLILLLLZI = r11
            r4.LJLJI = r2
            r4.LJLJJLL = r7
            java.lang.Object r0 = r11.LIZIZ(r0, r4)
            if (r0 != r3) goto La3
            return r3
        L98:
            X.45b r2 = r4.LJLJI
            X.45b r11 = r4.LJLILLLLZI
            java.lang.Object r6 = r4.LJLIL
            com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel r6 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel) r6
            X.C141335gf.LIZJ(r9)
        La3:
            X.40c r1 = new X.40c
            X.3to r0 = r6.LJIJI()
            r1.<init>(r0)
            r4.LJLIL = r2
            r0 = 0
            r4.LJLILLLLZI = r0
            r4.LJLJI = r0
            r4.LJLJJLL = r5
            java.lang.Object r0 = r11.LIZ(r1, r4)
            if (r0 != r3) goto L2e
            return r3
        Lbc:
            X.406 r4 = new X.406
            r4.<init>(r10, r12)
            goto L12
        Lc3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel.LIZ(X.45b, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.3sx] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void LJIIL(C1036745b c1036745b, final C1028942b c1028942b) {
        super.LJIIL(c1036745b, c1028942b);
        final C3WT c3wt = (C3WT) this.LJLZ.getValue();
        if (c3wt != null) {
            final C81403Hk c81403Hk = new C81403Hk(new AqS151S0100000_1(this, 904));
            final C98523to LJIJI = LJIJI();
            c1036745b.LJIIJJI(new AbstractC1036945d<C1023940d>(c1028942b, c81403Hk, c3wt, LJIJI) { // from class: X.403
                public final C81403Hk LIZIZ;
                public final C3WT LIZJ;
                public final C98523to LIZLLL;

                @Override // X.AbstractC1036945d
                public final void LIZIZ() {
                    C3WT c3wt2 = this.LIZJ;
                    c3wt2.setVisibility(8);
                    c3wt2.LIZJ();
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C1023940d c1023940d, InterfaceC67352kd<? super C3WY> interfaceC67352kd) {
                    C3WT c3wt2 = this.LIZJ;
                    C98523to sessionInfo = this.LIZLLL;
                    C81403Hk action = this.LIZIZ;
                    c3wt2.getClass();
                    o.LJIIIZ(sessionInfo, "sessionInfo");
                    o.LJIIIZ(action, "action");
                    c3wt2.LJLILLLLZI = action;
                    c3wt2.LJLJI = sessionInfo;
                    this.LIZJ.setVisibility(0);
                    C84643Tw.LJFF(this.LIZLLL);
                    return this.LIZJ;
                }

                @Override // X.AbstractC1036945d
                public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
                    boolean z = true;
                    if (!this.LIZ.isDebugMode()) {
                        C3WT c3wt2 = this.LIZJ;
                        C98523to sessionInfo = this.LIZLLL;
                        c3wt2.getClass();
                        o.LJIIIZ(sessionInfo, "sessionInfo");
                        if (sessionInfo.isReportPage() || (!sessionInfo.isStrangerChat() && !sessionInfo.isFiltered())) {
                            z = false;
                        }
                    }
                    return Boolean.valueOf(z);
                }

                {
                    super(C41X.STRANGER_CHAT);
                    this.LIZIZ = c81403Hk;
                    this.LIZJ = c3wt;
                    this.LIZLLL = LJIJI;
                }
            });
        }
        final C3WV c3wv = (C3WV) this.LJLLI.getValue();
        if (c3wv != null) {
            final ?? r2 = new InterfaceC785236i() { // from class: X.3sx
                @Override // X.InterfaceC785236i
                public final void LIZIZ() {
                    SingleChatPanel singleChatPanel = SingleChatPanel.this;
                    if (singleChatPanel.LJLJJL) {
                        FragmentManager supportFragmentManager = singleChatPanel.LJLJLLL.getSupportFragmentManager();
                        o.LJIIIIZZ(supportFragmentManager, "mActivity.supportFragmentManager");
                        Fragment LJJJIL = supportFragmentManager.LJJJIL("quick_chat_sheet");
                        if (LJJJIL instanceof DialogFragment) {
                            ((DialogFragment) LJJJIL).dismiss();
                            return;
                        }
                        return;
                    }
                    if (singleChatPanel.LJLJJI.isBookMode()) {
                        InterfaceC97983sw LIZ = LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZ();
                        if (LIZ == null) {
                            return;
                        }
                        LIZ.LIZIZ();
                        LIZ.LIZ();
                        return;
                    }
                    if (!C73340SqO.LJJIJ(SingleChatPanel.this.LJLJLLL)) {
                        return;
                    }
                    SingleChatPanel.this.LJLJLLL.finish();
                }
            };
            final C3F5 c3f5 = new C3F5(this.LLJILJILJ);
            c1036745b.LJIIJJI(new AbstractC1036945d<C1023940d>(c1028942b, c3wv, r2, c3f5) { // from class: X.40T
                public final C3WV LIZIZ;
                public final InterfaceC785236i LIZJ;
                public final InterfaceC88472Yns<InterfaceC67352kd<? super IMUser>, Object> LIZLLL;
                public final /* synthetic */ C1028942b LJ;

                @Override // X.AbstractC1036945d
                public final void LIZIZ() {
                    C3WV c3wv2 = this.LIZIZ;
                    if (c3wv2.getVisibility() == 0) {
                        c3wv2.LJLIL.LIZIZ(c3wv2);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
                @Override // X.AbstractC1036945d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LJ(X.C1023940d r8, X.InterfaceC67352kd<? super X.C3WY> r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof X.C40U
                        if (r0 == 0) goto L60
                        r6 = r9
                        X.40U r6 = (X.C40U) r6
                        int r2 = r6.LJLJJLL
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L60
                        int r2 = r2 - r1
                        r6.LJLJJLL = r2
                    L12:
                        java.lang.Object r5 = r6.LJLJJI
                        X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
                        int r0 = r6.LJLJJLL
                        r2 = 1
                        if (r0 == 0) goto L47
                        if (r0 != r2) goto L66
                        X.3WV r1 = r6.LJLJI
                        X.3WV r4 = r6.LJLILLLLZI
                        X.40T r2 = r6.LJLIL
                        X.C141335gf.LIZJ(r5)
                    L26:
                        com.ss.android.ugc.aweme.im.service.model.IMUser r5 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r5
                        if (r5 == 0) goto L43
                        X.42b r0 = r2.LJ
                        X.3ud r3 = r0.LIZJ
                        X.36i r2 = r2.LIZJ
                        r1.getClass()
                        java.lang.String r0 = "sessionInfo"
                        kotlin.jvm.internal.o.LJIIIZ(r3, r0)
                        java.lang.String r0 = "listener"
                        kotlin.jvm.internal.o.LJIIIZ(r2, r0)
                        r1.LJLJJLL = r3
                        r1.LJLJL = r5
                        r1.LJLJLJ = r2
                    L43:
                        r1.LIZ()
                        return r4
                    L47:
                        X.C141335gf.LIZJ(r5)
                        X.3WV r1 = r7.LIZIZ
                        X.Yns<X.2kd<? super com.ss.android.ugc.aweme.im.service.model.IMUser>, java.lang.Object> r0 = r7.LIZLLL
                        r6.LJLIL = r7
                        r6.LJLILLLLZI = r1
                        r6.LJLJI = r1
                        r6.LJLJJLL = r2
                        java.lang.Object r5 = r0.invoke(r6)
                        if (r5 != r3) goto L5d
                        return r3
                    L5d:
                        r4 = r1
                        r2 = r7
                        goto L26
                    L60:
                        X.40U r6 = new X.40U
                        r6.<init>(r7, r9)
                        goto L12
                    L66:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C40T.LJ(X.40d, X.2kd):java.lang.Object");
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
                        boolean r0 = r7 instanceof X.C40V
                        if (r0 == 0) goto L47
                        r4 = r7
                        X.40V r4 = (X.C40V) r4
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
                        X.Yns<X.2kd<? super com.ss.android.ugc.aweme.im.service.model.IMUser>, java.lang.Object> r0 = r5.LIZLLL
                        r4.LJLJI = r1
                        java.lang.Object r3 = r0.invoke(r4)
                        if (r3 != r2) goto L20
                        return r2
                    L47:
                        X.40V r4 = new X.40V
                        r4.<init>(r5, r7)
                        goto L12
                    L4d:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C40T.LJFF(X.40d, X.2kd):java.lang.Object");
                }

                {
                    super(C41X.BLOCK);
                    this.LIZIZ = c3wv;
                    this.LIZJ = r2;
                    this.LIZLLL = c3f5;
                }
            });
        }
        if (C53181Ku1.LIZ() && !this.LJLJJL) {
            c1036745b.LJIIJJI(new AnonymousClass496(this.LJLJL, this.LJLJJI));
        }
        if (this.LJLJJLL.LJLJJLL) {
            Object value = this.LLJJLIIIJLLLLLLLZ.getValue();
            o.LJIIIIZZ(value, "<get-tcmBannerStub>(...)");
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            c1036745b.LJIIJJI(new C40Z((ViewStub) value, C4WC.LIZIZ, C78613UtF.LIZJ));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleChatPanel(LifecycleOwner parent, View view, C98523to c98523to, boolean z, C99043ue chatRoomConfig) {
        super(parent, view, c98523to, z, chatRoomConfig);
        AnonymousClass446 imAdLog;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(chatRoomConfig, "chatRoomConfig");
        this.LLJJLIIIJLLLLLLLZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 151));
        this.LLJL = C221108m2.LIZIZ(new AqS148S0200000_1(parent, c98523to, 13));
        if (c98523to.getEnterFrom() == 8001 && (imAdLog = c98523to.getImAdLog()) != null) {
            String adId = imAdLog.getAdId();
            o.LJIIIIZZ(adId, "it.adId");
            if (adId.length() > 0) {
                AnonymousClass444 anonymousClass444 = new AnonymousClass444(c98523to, imAdLog);
                anonymousClass444.LIZ();
                this.LLFF = anonymousClass444;
            }
        }
    }
}
