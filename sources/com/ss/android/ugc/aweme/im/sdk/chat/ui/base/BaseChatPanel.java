package com.ss.android.ugc.aweme.im.sdk.chat.ui.base;

import X.AbstractC1036945d;
import X.AbstractC1038245q;
import X.AbstractC1041546x;
import X.AbstractC90763hI;
import X.ActivityC45651qj;
import X.AnonymousClass325;
import X.AnonymousClass419;
import X.AnonymousClass422;
import X.AnonymousClass423;
import X.AnonymousClass427;
import X.AnonymousClass429;
import X.AnonymousClass434;
import X.AnonymousClass435;
import X.AnonymousClass442;
import X.AnonymousClass444;
import X.AnonymousClass462;
import X.AnonymousClass489;
import X.AnonymousClass491;
import X.AnonymousClass636;
import X.C00F;
import X.C0AC;
import X.C100383wo;
import X.C100723xM;
import X.C101043xs;
import X.C101053xt;
import X.C101073xv;
import X.C101353yN;
import X.C101543yg;
import X.C101993zP;
import X.C102293zt;
import X.C1023940d;
import X.C1025140p;
import X.C1027441m;
import X.C1028942b;
import X.C1029242e;
import X.C1030242o;
import X.C1030642s;
import X.C1031242y;
import X.C1034344d;
import X.C1036745b;
import X.C1038845w;
import X.C1042547h;
import X.C1046648w;
import X.C1046848y;
import X.C107834Lb;
import X.C109544Rq;
import X.C110134Tx;
import X.C110584Vq;
import X.C113554cx;
import X.C117294iz;
import X.C15X;
import X.C15Y;
import X.C16880lQ;
import X.C19L;
import X.C1GE;
import X.C221108m2;
import X.C32Y;
import X.C34K;
import X.C36636EZk;
import X.C3AA;
import X.C3BD;
import X.C3BE;
import X.C3FJ;
import X.C3OO;
import X.C3WJ;
import X.C3WV;
import X.C3WX;
import X.C3Y4;
import X.C40171ht;
import X.C40443Fu3;
import X.C41D;
import X.C41I;
import X.C41O;
import X.C41S;
import X.C41X;
import X.C42C;
import X.C42P;
import X.C42U;
import X.C42V;
import X.C43C;
import X.C43E;
import X.C43O;
import X.C43S;
import X.C44E;
import X.C44F;
import X.C44H;
import X.C45L;
import X.C48841JEv;
import X.C4BT;
import X.C4D2;
import X.C4DL;
import X.C4WU;
import X.C57882Oy;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C63089OpR;
import X.C63120Opw;
import X.C64962gm;
import X.C73318Sq2;
import X.C73379Sr1;
import X.C73454SsE;
import X.C73542Ste;
import X.C73969T1h;
import X.C75652y1;
import X.C77266UUc;
import X.C775432o;
import X.C78613UtF;
import X.C78866UxK;
import X.C78897Uxp;
import X.C78999UzT;
import X.C79863Bm;
import X.C80533Eb;
import X.C81273Gx;
import X.C84973Vd;
import X.C85373Wr;
import X.C88233dD;
import X.C88243dE;
import X.C89193el;
import X.C89523fI;
import X.C93063l0;
import X.C93793mB;
import X.C94793nn;
import X.C96963rI;
import X.C97123rY;
import X.C97873sl;
import X.C98523to;
import X.C98583tu;
import X.C99033ud;
import X.C99043ue;
import X.C99113ul;
import X.C99123um;
import X.C99813vt;
import X.C99893w1;
import X.EnumC110124Tw;
import X.EnumC95013o9;
import X.InterfaceC101063xu;
import X.InterfaceC1029942l;
import X.InterfaceC1032343j;
import X.InterfaceC1032943p;
import X.InterfaceC55057LjB;
import X.InterfaceC67352kd;
import X.InterfaceC85393Wt;
import X.InterfaceC99713vj;
import X.OSZ;
import X.QD3;
import X.SJC;
import X.SY4;
import X.SY9;
import X.T2R;
import X.V1M;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import Y.ALAdapterS0S0400000_1;
import Y.AObserverS65S0200000_1;
import Y.AObserverS69S0100000_1;
import Y.ARunnableS17S0101000_13;
import Y.ARunnableS20S0200000_1;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS7S0110000_1;
import Y.IDCListenerS251S0100000_1;
import Y.IDTListenerS87S0200000_1;
import Y.IDeS150S0200000_1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.ActionBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.TakoBingScrollComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.TakoVideoScrollComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.ChatPageNudgeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.SuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.handler.TakoScreenShotHandler$observerScreenShot$1;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.view.TakoInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.scrolltobottomindicator.ScrollToBottomIndicator;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.statemanager.ChatRoomLiveStateManager;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS90S0300000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public abstract class BaseChatPanel extends LifecyclePanel implements C4WU {
    public final View LJLJI;
    public final C99033ud LJLJJI;
    public final boolean LJLJJL;
    public final C99043ue LJLJJLL;
    public final Context LJLJL;
    public final Fragment LJLJLJ;
    public final ActivityC45651qj LJLJLLL;
    public boolean LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public boolean LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public AnonymousClass444 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C101043xs LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public ReadStateViewModel LLIIII;
    public final RecyclerView LLIIIILZ;
    public IMUser LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public long LLIIZ;
    public final C62822Ol8 LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public final BaseChatPanel$linearLayoutManager$1 LLILL;
    public final ChatRoomLiveStateManager LLILLIZIL;
    public final C62822Ol8 LLILLJJLI;
    public InputView LLILLL;
    public int LLILZ;
    public final ARunnableS37S0100000_1 LLILZIL;
    public ARunnableS37S0100000_1 LLILZLL;
    public AnonymousClass429 LLIZ;
    public final List<InterfaceC1032943p> LLIZLLLIL;
    public final C64962gm LLJ;
    public AnonymousClass419 LLJI;
    public final C62822Ol8 LLJIJIL;
    public final AbstractC1038245q LLJILJIL;
    public final ChatRoomViewModel LLJILJILJ;
    public final C62822Ol8 LLJILLL;
    public final C62822Ol8 LLJJ;
    public final C42C LLJJI;
    public final C73318Sq2 LLJJIII;
    public final C62822Ol8 LLJJIJI;
    public final C79863Bm LLJJIJIIJIL;
    public C99113ul LLJJIJIL;
    public final AbstractC90763hI LLJJJ;
    public boolean LLJJJIL;
    public C99123um LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C62822Ol8 LLJJL;

    @Override // X.InterfaceC120024nO
    public final void BH(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void CN(C63120Opw c63120Opw) {
    }

    @Override // X.InterfaceC120024nO
    public final void DH(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final int JG() {
        return 0;
    }

    public Object LIZ(C1036745b c1036745b, InterfaceC67352kd<? super C1036745b> interfaceC67352kd) {
        return LIZIZ(this, c1036745b, interfaceC67352kd);
    }

    public abstract AbstractC1038245q LJFF();

    public void LJIIIZ(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC120024nO
    public final void MO(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void Tu(C63120Opw c63120Opw) {
    }

    @Override // X.InterfaceC120024nO
    public final void f3(C63120Opw c63120Opw) {
    }

    @Override // X.InterfaceC120024nO
    public final void hW(int i, String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0143, code lost:
    
        if (r3 != null) goto L4;
     */
    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel.onDestroy():void");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC120024nO
    public final void tq0(int i, String str, List list) {
    }

    @Override // X.InterfaceC120024nO
    public final void we0(C63120Opw c63120Opw) {
    }

    public final C1036745b LJI() {
        return (C1036745b) this.LLJIJIL.getValue();
    }

    public final SuggestedReplyViewModel LJII() {
        return (SuggestedReplyViewModel) this.LLJILLL.getValue();
    }

    public final C107834Lb LJIIIIZZ() {
        return (C107834Lb) this.LLIIIZ.getValue();
    }

    public final void LJIIJJI() {
        C101043xs c101043xs = this.LLFZ;
        if (this.LJLJJI.isReportPage()) {
            c101043xs.setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3uN
                @Override // X.InterfaceC101063xu
                public final void LIZ() {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC101063xu
                public final void LJ() {
                    if (((Boolean) C98883uO.LIZ.getValue()).booleanValue()) {
                        FragmentManager supportFragmentManager = BaseChatPanel.this.LJLJLLL.getSupportFragmentManager();
                        o.LJIIIIZZ(supportFragmentManager, "mActivity.supportFragmentManager");
                        Fragment LJJJIL = supportFragmentManager.LJJJIL("report_page_sheet");
                        if (LJJJIL instanceof TuxSheet) {
                            ((DialogFragment) LJJJIL).dismiss();
                            return;
                        }
                        return;
                    }
                    BaseChatPanel.this.LJLJLLL.onBackPressed();
                }

                @Override // X.InterfaceC101063xu
                public final void LIZJ(int i) {
                    AbstractC1038245q abstractC1038245q = BaseChatPanel.this.LLJILJIL;
                    abstractC1038245q.getClass();
                    abstractC1038245q.LJZL(OQY.INSTANCE);
                    List currentList = abstractC1038245q.getCurrentList();
                    o.LJIIIIZZ(currentList, "currentList");
                    ArrayList arrayList = new ArrayList(C32I.LJJL(currentList, 10));
                    Iterator it = currentList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((IMMessage) it.next()).getMessage());
                    }
                    abstractC1038245q.LL(arrayList, true, null);
                }
            });
            c101043xs.setRightTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, this.LJLJL));
            c101043xs.setLeftIcon(new C101053xt((SY9) this.LLILLJJLI.getValue(), R.string.dfz));
            c101043xs.setRightText(R.string.h7k);
            if (this.LJLJJI.getChatType() == 3) {
                c101043xs.setLeftTitleVisible(true);
                c101043xs.setRightTuxFont(42);
            }
            LJIJ();
        }
    }

    public final void LJIJ() {
        if (C1GE.LJIILIIL(this.LLJILJIL.LJLILLLLZI.getValue())) {
            this.LLFZ.setRightTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, this.LJLJL));
            SY4 sy4 = (SY4) this.LLI.getValue();
            if (sy4 != null) {
                sy4.setEnabled(true);
            }
            TuxTextView tuxTextView = this.LLFZ.LJLLI;
            if (tuxTextView != null) {
                tuxTextView.setEnabled(true);
            }
            C101073xv.LIZIZ(this.LLFZ.getRightView());
            return;
        }
        this.LLFZ.setRightTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, this.LJLJL));
        SY4 sy42 = (SY4) this.LLI.getValue();
        if (sy42 != null) {
            sy42.setEnabled(false);
        }
        TuxTextView tuxTextView2 = this.LLFZ.LJLLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setEnabled(false);
        }
        this.LLFZ.getRightView().setOnTouchListener(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x002f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LJIILIIL() {
        /*
            r6 = this;
            X.45b r1 = r6.LJI()
            r5 = 0
            if (r1 == 0) goto L64
            X.45Q r2 = X.C45Q.BOTTOM
            java.lang.String r0 = "sceneId"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.util.List<X.45c> r1 = r1.LIZLLL
            int r0 = r2.ordinal()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            X.45c r0 = (X.C1036845c) r0
            X.40d r0 = r0.LIZJ
            if (r0 == 0) goto L64
            X.41X r1 = r0.LIZ
        L20:
            boolean r0 = X.C94793nn.LIZ()
            if (r0 == 0) goto L2f
            if (r1 == 0) goto L30
            boolean r1 = r1.isConflictedWithInputView()
            r0 = 1
            if (r1 != r0) goto L30
        L2f:
            return
        L30:
            X.3ue r0 = r6.LJLJJLL
            boolean r0 = r0.LJLLILLLL
            if (r0 == 0) goto L2f
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView r1 = r6.LLILLL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView
            if (r0 == 0) goto L2f
            if (r1 == 0) goto L2f
            com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel r4 = r1.LLIILZL
            if (r4 == 0) goto L2f
            X.3ud r0 = r1.LJLZ
            java.lang.String r1 = r0.getConversationId()
            java.lang.String r0 = "conversationId"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.3hI r3 = X.C81273Gx.LIZ(r1)
            java.lang.String r0 = "conversationModel"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            X.2pa r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r4)
            X.39W r1 = new X.39W
            r1.<init>(r3, r4, r5)
            r0 = 3
            X.XKX.LIZLLL(r2, r5, r5, r1, r0)
            goto L2f
        L64:
            r1 = r5
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel.LJIILIIL():void");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public void onCreate() {
        super.onCreate();
        XKX.LIZLLL(this.LLJ, null, null, new C41O(this, null), 3);
        C3Y4.LIZLLL = this.LJLJJI;
        LJIIJJI();
        SY4 sy4 = (SY4) this.LLI.getValue();
        if (sy4 != null) {
            if (this.LJLJJI.isReportPage()) {
                sy4.setVisibility(0);
                sy4.setSupportClickWhenDisable(true);
                C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 272));
                LJIJ();
            } else {
                sy4.setVisibility(8);
            }
        }
        C84973Vd.LIZ.getClass();
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        o.LJIIIIZZ(currentUserID, "get().getService(IUserSe…class.java).currentUserID");
        C84973Vd.LIZIZ = currentUserID;
        AnonymousClass489.LIZ.getClass();
        AnonymousClass489.LIZJ = true;
        ChatNoticeViewModel chatNoticeViewModel = (ChatNoticeViewModel) this.LLJJIJI.getValue();
        if (chatNoticeViewModel != null) {
            chatNoticeViewModel.gv0();
        }
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
        Object value = this.LJZI.getValue();
        o.LJIIIIZZ(value, "<get-softInputView>(...)");
        C4BT c4bt = (C4BT) value;
        boolean isTakoChat$im_base_release = this.LJLJJI.isTakoChat$im_base_release();
        c4bt.LJLLLLLL = isTakoChat$im_base_release;
        if (isTakoChat$im_base_release) {
            c4bt.post(new ARunnableS17S0101000_13(2, c4bt, 11));
        }
        SuggestedReplyViewModel LJII = LJII();
        if (LJII != null) {
            LJII.kv0();
        }
        if (C3AA.LIZIZ) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C32Y(null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public final void onPause() {
        super.onPause();
        this.LLJJJIL = true;
        if (!((Boolean) C89523fI.LIZ.getValue()).booleanValue()) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3OO(null), 3);
        }
        this.LLJILJIL.onPause();
        if (this.LJLJJLL.LJLLJ) {
            AnonymousClass325 anonymousClass325 = AnonymousClass325.LIZ;
            String conversationId = this.LJLJJI.getConversationId();
            anonymousClass325.getClass();
            AnonymousClass325.LJII(conversationId);
        }
        if (C94793nn.LIZ() && this.LJLJJLL.LJLLILLLL) {
            InputView inputView = this.LLILLL;
            if ((inputView instanceof InputView) && inputView != null) {
                inputView.LJJJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public final void onResume() {
        C93063l0 value;
        InputView inputView;
        super.onResume();
        this.LLIIL = true;
        LJIIJJI();
        Iterator<AbstractC1041546x> it = this.LLJILJIL.LJLJI.iterator();
        while (it.hasNext()) {
            AnonymousClass462 anonymousClass462 = it.next().LLF;
            if (anonymousClass462 != null) {
                anonymousClass462.LIZ(true);
            }
        }
        if (this.LJLJJLL.LJLLLLLL && (value = this.LLJILJIL.LLD.getValue()) != null && C93793mB.LJIIIIZZ(value.LJLIL) && (inputView = this.LLILLL) != null) {
            inputView.LJJIJLIJ(false);
        }
        LJIILIIL();
        if (this.LJLJJLL.LLF) {
            Object value2 = this.LJZI.getValue();
            o.LJIIIIZZ(value2, "<get-softInputView>(...)");
            ((C4BT) value2).LJLLLL = false;
        }
        if (((Number) C4D2.LIZ.getValue()).intValue() == 2) {
            C78866UxK.LJJLIIIIJ();
        }
        SuggestedReplyViewModel LJII = LJII();
        if (LJII != null) {
            LJII.ov0();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public final void onStop() {
        super.onStop();
        C42C c42c = this.LLJJI;
        if (c42c != null) {
            c42c.LIZIZ.LJ();
            c42c.LIZJ.LJ();
        }
    }

    public final void LIZLLL(InputView inputView) {
        C44F c44f;
        C1034344d c1034344d;
        View view;
        getLifecycle().addObserver(inputView);
        if (this.LJLJJI.isReportPage()) {
            C107834Lb LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                LJIIIIZZ.LJFF(false);
            }
            this.LLJILJIL.LLFF(false);
            this.LLJILJILJ.kv0(EnumC95013o9.DISABLED);
            InputView inputView2 = this.LLILLL;
            if (inputView2 != null) {
                inputView2.LJJIJL(8);
            }
            LJIIZILJ("bottom_banner_not_showing", true);
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        C44E jv0 = this.LLJILJILJ.jv0();
        ReadStateViewModel readStateViewModel = null;
        if (jv0 != null && (c44f = jv0.LJFF) != null && (c1034344d = c44f.LJLIL) != null) {
            if (((ArrayList) inputView.LJLLL).isEmpty() && (view = inputView.LJLJJLL) != null) {
                view.addOnLayoutChangeListener(new IDCListenerS251S0100000_1(inputView, 2));
            }
            ((ArrayList) inputView.LJLLL).add(c1034344d);
        }
        inputView.LJLLI = new InterfaceC1032943p() { // from class: X.42c
            @Override // X.InterfaceC1032943p
            public final void LJIIL(View view2, int i, int i2, boolean z) {
                boolean z2;
                C1036745b LJI;
                C44F c44f2;
                C1034344d c1034344d2;
                linkedHashSet.add(Integer.valueOf(i2));
                InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ("chat_room");
                if (LIZIZ != null) {
                    LIZIZ.LIZ("panel_shown", ORZ.LLD(linkedHashSet, ",", null, null, null, 62));
                }
                BaseChatPanel baseChatPanel = this;
                if (i2 != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                baseChatPanel.LJLL = z2;
                if (z2) {
                    C34B.LIZIZ("IMChatPerfLogger", "openChatroomKeyboard");
                    C40443Fu3.LIZ("chat_room_keyboard").start();
                } else {
                    C34B.LIZIZ("IMChatPerfLogger", "dismissChatroomKeyboard");
                    InterfaceC55057LjB LIZIZ2 = C40443Fu3.LIZIZ("chat_room_keyboard");
                    if (LIZIZ2 != null) {
                        LIZIZ2.stop();
                    }
                }
                this.getClass();
                Iterator it = ((ArrayList) this.LLIZLLLIL).iterator();
                while (it.hasNext()) {
                    ((InterfaceC1032943p) it.next()).LJIIL(view2, i, i2, z);
                }
                C44E jv02 = this.LLJILJILJ.jv0();
                if (jv02 != null && (c44f2 = jv02.LJFF) != null && (c1034344d2 = c44f2.LJLIL) != null) {
                    C1034444e c1034444e = c1034344d2.LJLJI;
                    if (!c1034444e.LJI) {
                        if (i2 == 1 || i2 == -2) {
                            c1034444e.LJI = true;
                            if (!C44H.LIZ()) {
                                C1DH.LJJIJIIJIL(100L, new ARunnableS7S0110000_1(c1034444e, z, 3));
                            } else {
                                C1034344d c1034344d3 = c1034444e.LIZIZ;
                                if (!c1034344d3.LJLJJLL.LIZIZ) {
                                    c1034344d3.LJ(EnumC1035144l.INPUT_PANEL_CHANGE);
                                }
                            }
                        }
                    } else if (i2 == -1) {
                        c1034444e.LJI = false;
                        if (!AnonymousClass449.LJFF) {
                            c1034444e.LJFF(C78555UsJ.LJIJJ(c1034444e.LIZ));
                        }
                    }
                }
                if (i2 != -1 && !this.LJLJJLL.LLF && !C117294iz.LIZ()) {
                    BaseChatPanel baseChatPanel2 = this;
                    baseChatPanel2.LLIIIILZ.post(new ARunnableS37S0100000_1(baseChatPanel2, 32));
                }
                BaseChatPanel baseChatPanel3 = this;
                baseChatPanel3.getClass();
                if (i == -1 && i2 != -1 && (LJI = baseChatPanel3.LJI()) != null) {
                    LJI.LJI(false, new C1028541x(null));
                }
            }
        };
        if (this.LJLJJLL.LJLLI && (this.LJLJJI instanceof C98523to)) {
            this.LLJILJILJ.LJZI = new AqS90S0300000_1(new C34K(), this, inputView, 1);
        }
        if (this.LJLJJLL.LL) {
            Fragment fragment = this.LJLJLJ;
            String conversationId = this.LLJILJILJ.LJLL.getConversationId();
            InterfaceC99713vj messageModel = this.LLJILJILJ.LJLL;
            C99033ud sessionInfo = this.LJLJJI;
            AqS132S0200000_1 aqS132S0200000_1 = new AqS132S0200000_1(this, inputView, 18);
            o.LJIIIZ(fragment, "fragment");
            o.LJIIIZ(conversationId, "conversationId");
            o.LJIIIZ(messageModel, "messageModel");
            o.LJIIIZ(sessionInfo, "sessionInfo");
            readStateViewModel = (ReadStateViewModel) ViewModelProviders.of(fragment).get(ReadStateViewModel.class);
            readStateViewModel.jv0(conversationId, messageModel, sessionInfo);
            aqS132S0200000_1.invoke(readStateViewModel);
        }
        this.LLIIII = readStateViewModel;
        if (this.LJLJJI.isBookMode()) {
            Object value = this.LLII.getValue();
            o.LJIIIIZZ(value, "<get-rootViewProxy>(...)");
            ((View) value).setPadding(0, C63081OpJ.LJJJJLI(this.LJLJL), 0, 0);
            Context context = this.LJLJL;
            Object value2 = this.LLIFFJFJJ.getValue();
            o.LJIIIIZZ(value2, "<get-editText>(...)");
            AnonymousClass435.LIZ(context, (View) value2);
        }
        LJIILIIL();
        if (!inputView.LJJI()) {
            return;
        }
        inputView.LLILL = new C45L(this);
    }

    public final void LJIIJ(IMUser user) {
        ChatNoticeViewModel chatNoticeViewModel;
        AnonymousClass429 anonymousClass429;
        o.LJIIIZ(user, "user");
        if (!this.LJLJJLL.LLD) {
            return;
        }
        this.LLIIIJ = user;
        if (this.LJLJJI instanceof C98523to) {
            ChatPageNudgeViewModel chatPageNudgeViewModel = (ChatPageNudgeViewModel) this.LLF.getValue();
            if (chatPageNudgeViewModel != null) {
                chatPageNudgeViewModel.gv0(user);
            }
            if (C100383wo.LIZ() && (anonymousClass429 = this.LLIZ) != null) {
                anonymousClass429.m0((C98523to) this.LJLJJI, user);
            }
            C101543yg c101543yg = C101543yg.LIZ;
            IMUser iMUser = this.LLIIIJ;
            if (iMUser != null) {
                int followStatus = iMUser.getFollowStatus();
                c101543yg.getClass();
                C101543yg.LIZIZ = followStatus;
                Object obj = this.LLIIIJ;
                if ((obj != null || ((chatNoticeViewModel = (ChatNoticeViewModel) this.LLJJIJI.getValue()) != null && (obj = chatNoticeViewModel.LJLJLLL) != null)) && (!this.LLJJJJJIL)) {
                    this.LLJJJJJIL = true;
                    C77266UUc.LIZIZ.getRelationService().LJFF().observe(this, new AObserverS65S0200000_1(obj, this, 22));
                    return;
                }
                return;
            }
            o.LJIJI("mafUser");
            throw null;
        }
    }

    public final void LJIILJJIL(String str) {
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", "chat"), new OSZ("message_type", "emoji"));
        if (this.LJLJJI.getEnterMethod().length() > 0) {
            LJJLIIIIJ.put("enter_method", "click_dm_invitation");
        }
        IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService().LIZ(this.LJLJL, str, null, false, LJJLIIIIJ, true, null);
    }

    public final void LJIILL(long j) {
        if (this.LLIILZL && !this.LLJJJIL) {
            this.LLIILZL = false;
            long longValue = j - ((Number) this.LLIL.getValue()).longValue();
            if (((Number) this.LLIL.getValue()).longValue() > 0 && longValue > 0) {
                C98583tu.LJFF(longValue, this.LJLJJI, this.LLJILJIL.getCurrentList().size(), false, 56);
            }
            InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ("enter_chat_fps");
            if (LIZIZ != null) {
                LIZIZ.stop();
            }
            C100723xM.LIZ(this.LJLJJI, this.LLJILJIL.getCurrentList().size());
            C100723xM.LJFF(this.LLIIIILZ);
        }
    }

    public final void LJIILLIIL(boolean z) {
        C1036745b LJI = LJI();
        if (LJI != null) {
            if (z) {
                LJI.LIZLLL(C41X.BLOCK);
                return;
            }
            C1036745b.LJII(LJI, new C1027441m(null), 1);
            if (this.LJZ) {
                return;
            }
            LJI.LIZLLL(C41X.STRANGER_CHAT);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void getAgeInfoUpdateEvent(C1046848y event) {
        o.LJIIIZ(event, "event");
        if (!this.LJLJJLL.LLD) {
            return;
        }
        C84973Vd.LIZ.getClass();
        C84973Vd.LIZLLL.evictAll();
        C84973Vd.LJIIIZ(this.LLJILJILJ.LJLL.LJ());
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onReceiveChatTopTipForGuideOutPushEvent(C57882Oy event) {
        o.LJIIIZ(event, "event");
        if (!this.LJLL && this.LJLJJLL.LJLJLJ && o.LJ(event.LJLIL, this.LJLJJI.getConversationId())) {
            this.LLIIL = false;
            C1036745b LJI = LJI();
            if (LJI != null) {
                LJI.LIZLLL(C41X.OUT_PUSH_GUIDE_BOTTOM);
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowChatTopTipEvent(C42P event) {
        String tips;
        C1036745b LJI;
        o.LJIIIZ(event, "event");
        if (!o.LJ(event.LJLILLLLZI, this.LJLJJI.getConversationId()) || (tips = event.LJLIL.getTips()) == null || tips.length() == 0 || (LJI = LJI()) == null) {
            return;
        }
        LJI.LIZJ(new C43E(event.LJLIL, null));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowPermissionReminderDialogEvent(C101993zP event) {
        o.LJIIIZ(event, "event");
        C1036745b LJI = LJI();
        if (LJI != null) {
            LJI.LIZJ(new AnonymousClass434(event.LJLILLLLZI, event.LJLIL));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x01c4, code lost:
    
        if (r0 == null) goto L103;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x0075. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel.LIZJ(com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel, X.2kd):java.lang.Object");
    }

    public void LJIIL(C1036745b c1036745b, final C1028942b c1028942b) {
        C3WX c3wx = (C3WX) this.LJLLLLLL.getValue();
        if (c3wx != null) {
            c1036745b.LJIIJJI(new C41I(c1028942b, c3wx, this.LLJJJ.LJ(), this.LJLJL, this.LLJJIJIIJIL, new C1031242y(this.LLJILJILJ), new AqS167S0100000_1(this, 516)));
        }
        final C97873sl c97873sl = (C97873sl) this.LJLLILLLL.getValue();
        if (c97873sl != null) {
            c1036745b.LJIIJJI(new AbstractC1036945d<C41D>(c1028942b, c97873sl) { // from class: X.40j
                public final C97873sl LIZIZ;
                public final AnonymousClass412 LIZJ;
                public final /* synthetic */ C1028942b LIZLLL;

                @Override // X.AbstractC1036945d, X.AnonymousClass412
                public final void pause() {
                    this.LIZJ.pause();
                }

                @Override // X.AbstractC1036945d, X.AnonymousClass412
                public final void resume() {
                    this.LIZJ.resume();
                }

                @Override // X.AbstractC1036945d
                public final void LIZIZ() {
                    this.LIZIZ.LIZ(true);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(C41X.SAFE_CONVERSATION);
                    AnonymousClass410 anonymousClass410 = new AnonymousClass410(c97873sl);
                    this.LIZIZ = c97873sl;
                    this.LIZJ = anonymousClass410;
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                    C97873sl c97873sl2 = this.LIZIZ;
                    C99033ud c99033ud = this.LIZLLL.LIZJ;
                    String noticeCode = c41d.LIZIZ.getNoticeCode();
                    if (noticeCode == null) {
                        noticeCode = "";
                    }
                    c97873sl2.LIZIZ(c99033ud, noticeCode, this.LIZLLL.LIZJ.getConversationId());
                    return this.LIZIZ;
                }

                @Override // X.AbstractC1036945d
                public final Object LJFF(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                    C4BE invoke;
                    C41D c41d2 = c41d;
                    boolean z = true;
                    if (!this.LIZ.isDebugMode() && ((invoke = this.LIZLLL.LIZIZ.invoke()) == null || invoke.getPanelType() != -1 || C102343zy.LIZ(c41d2.LIZIZ.getNoticeCode()))) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            });
        }
        final C110584Vq c110584Vq = (C110584Vq) this.LLIIJI.getValue();
        if (c110584Vq != null) {
            final AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 1051);
            c1036745b.LJIIJJI(new AbstractC1036945d<C1023940d>(c1028942b, c110584Vq, aqS151S0100000_1) { // from class: X.41P
                public final C110584Vq LIZIZ;
                public final AnonymousClass412 LIZJ;
                public final InterfaceC65784Pro<Boolean> LIZLLL;
                public final /* synthetic */ C1028942b LJ;

                @Override // X.AbstractC1036945d, X.AnonymousClass412
                public final void pause() {
                    this.LIZJ.pause();
                }

                @Override // X.AbstractC1036945d, X.AnonymousClass412
                public final void resume() {
                    this.LIZJ.resume();
                }

                @Override // X.AbstractC1036945d
                public final void LIZIZ() {
                    C110584Vq.LIZ(this.LIZIZ);
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C1023940d c1023940d, InterfaceC67352kd<? super C3WY> interfaceC67352kd) {
                    C110584Vq c110584Vq2 = this.LIZIZ;
                    C110584Vq.LIZJ(c110584Vq2);
                    return c110584Vq2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
                
                    if (X.C42R.LIZ(r3, r2, r4.LIZLLL.invoke().booleanValue(), r4.LJ.LIZJ) != false) goto L8;
                 */
                @Override // X.AbstractC1036945d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LJFF(X.C1023940d r5, X.InterfaceC67352kd<? super java.lang.Boolean> r6) {
                    /*
                        r4 = this;
                        X.41X r0 = r4.LIZ
                        boolean r0 = r0.isDebugMode()
                        if (r0 != 0) goto L39
                        X.Lwa r1 = X.C55888Lwa.LIZIZ
                        X.42b r0 = r4.LJ
                        X.1qj r0 = r0.LIZ
                        boolean r0 = r1.LJJIJL(r0)
                        if (r0 != 0) goto L3f
                        X.42b r0 = r4.LJ
                        boolean r3 = r0.LIZLLL
                        X.4Vq r0 = r4.LIZIZ
                        android.content.Context r2 = r0.getContext()
                        java.lang.String r0 = "outPushGuideBanner.context"
                        kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
                        X.Pro<java.lang.Boolean> r0 = r4.LIZLLL
                        java.lang.Object r0 = r0.invoke()
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r1 = r0.booleanValue()
                        X.42b r0 = r4.LJ
                        X.3ud r0 = r0.LIZJ
                        boolean r0 = X.C42R.LIZ(r3, r2, r1, r0)
                        if (r0 == 0) goto L3f
                    L39:
                        r0 = 1
                    L3a:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    L3f:
                        r0 = 0
                        goto L3a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C41P.LJFF(X.40d, X.2kd):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(C41X.OUT_PUSH_GUIDE_BOTTOM);
                    AnonymousClass410 anonymousClass410 = new AnonymousClass410(c110584Vq);
                    this.LIZIZ = c110584Vq;
                    this.LIZJ = anonymousClass410;
                    this.LIZLLL = aqS151S0100000_1;
                }
            });
        }
        final C102293zt c102293zt = (C102293zt) this.LJLLL.getValue();
        if (c102293zt != null) {
            c1036745b.LJIIJJI(new AbstractC1036945d<C1023940d>(c102293zt) { // from class: X.40Y
                public final C102293zt LIZIZ;
                public final Context LIZJ;

                @Override // X.AbstractC1036945d
                public final void LIZIZ() {
                    this.LIZIZ.LIZIZ();
                }

                {
                    super(C41X.PUSH_PREVIEW);
                    this.LIZIZ = c102293zt;
                    Context context = c102293zt.getContext();
                    o.LJIIIIZZ(context, "chatTopTip.context");
                    this.LIZJ = context;
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C1023940d c1023940d, InterfaceC67352kd<? super C3WY> interfaceC67352kd) {
                    C102293zt c102293zt2 = this.LIZIZ;
                    c102293zt2.LJII();
                    return c102293zt2;
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
            c1036745b.LJIIJJI(new AbstractC1036945d<C43E>(c102293zt) { // from class: X.42T
                public final C102293zt LIZIZ;

                @Override // X.AbstractC1036945d
                public final void LIZIZ() {
                    this.LIZIZ.LIZIZ();
                }

                {
                    super(C41X.PERMISSION_MESSAGE);
                    this.LIZIZ = c102293zt;
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C43E c43e, InterfaceC67352kd interfaceC67352kd) {
                    C102293zt c102293zt2 = this.LIZIZ;
                    c102293zt2.LJIIJ(c43e.LIZIZ);
                    return c102293zt2;
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
            final AnonymousClass422 anonymousClass422 = new AnonymousClass422(this);
            c1036745b.LJIIJJI(new AbstractC1036945d<C41D>(c102293zt, anonymousClass422) { // from class: X.425
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
                    this.LIZIZ = c102293zt;
                    this.LIZJ = anonymousClass422;
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                    C102293zt c102293zt2 = this.LIZIZ;
                    String noticeCode = c41d.LIZIZ.getNoticeCode();
                    if (noticeCode == null) {
                        noticeCode = "";
                    }
                    C102003zQ LJIIIIZZ = c102293zt2.LJIIIIZZ(this.LIZJ, noticeCode);
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
            final AqS151S0100000_1 aqS151S0100000_12 = new AqS151S0100000_1(this, 1052);
            c1036745b.LJIIJJI(new AbstractC1036945d<C41D>(c102293zt, aqS151S0100000_12) { // from class: X.41L
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
                    this.LIZIZ = c102293zt;
                    this.LIZJ = aqS151S0100000_12;
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                    C102293zt c102293zt2 = this.LIZIZ;
                    c102293zt2.LJI(c41d.LIZIZ);
                    return c102293zt2;
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
            c1036745b.LJIIJJI(new AbstractC1036945d<C41D>(c1028942b, c102293zt) { // from class: X.40n
                public final C102293zt LIZIZ;
                public final /* synthetic */ C1028942b LIZJ;

                @Override // X.AbstractC1036945d
                public final void LIZIZ() {
                    this.LIZIZ.LIZIZ();
                }

                {
                    super(C41X.TOP_TIP_FOLLOW);
                    this.LIZIZ = c102293zt;
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                    C98523to c98523to;
                    IMUser fromUser;
                    C41D c41d2 = c41d;
                    C102293zt c102293zt2 = this.LIZIZ;
                    C99033ud c99033ud = this.LIZJ.LIZJ;
                    if ((c99033ud instanceof C98523to) && (c98523to = (C98523to) c99033ud) != null && (fromUser = c98523to.getFromUser()) != null) {
                        c102293zt2.LJIIIZ(c41d2.LIZIZ, fromUser);
                    }
                    return c102293zt2;
                }

                @Override // X.AbstractC1036945d
                public final Object LJFF(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                    boolean z;
                    C98523to c98523to;
                    if (!this.LIZ.isDebugMode()) {
                        C99033ud c99033ud = this.LIZJ.LIZJ;
                        if (!(c99033ud instanceof C98523to) || (c98523to = (C98523to) c99033ud) == null || c98523to.getFromUser() == null) {
                            z = false;
                            return Boolean.valueOf(z);
                        }
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
            });
        }
        final AnonymousClass491 anonymousClass491 = (AnonymousClass491) this.LJLLJ.getValue();
        if (anonymousClass491 != null) {
            c1036745b.LJIIJJI(new AbstractC1036945d<C41D>(c1028942b, anonymousClass491) { // from class: X.41N
                public final AnonymousClass491 LIZIZ;
                public final AnonymousClass412 LIZJ;
                public final /* synthetic */ C1028942b LIZLLL;

                @Override // X.AbstractC1036945d, X.AnonymousClass412
                public final void pause() {
                    this.LIZJ.pause();
                }

                @Override // X.AbstractC1036945d, X.AnonymousClass412
                public final void resume() {
                    this.LIZJ.resume();
                }

                @Override // X.AbstractC1036945d
                public final void LIZIZ() {
                    AnonymousClass491 anonymousClass4912 = this.LIZIZ;
                    if (anonymousClass4912.getVisibility() == 0) {
                        anonymousClass4912.setVisibility(8);
                        anonymousClass4912.LIZ();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(C41X.EC_SELLER);
                    AnonymousClass410 anonymousClass410 = new AnonymousClass410(anonymousClass491);
                    this.LIZIZ = anonymousClass491;
                    this.LIZJ = anonymousClass410;
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                    AnonymousClass491 anonymousClass4912 = this.LIZIZ;
                    anonymousClass4912.LIZIZ();
                    return anonymousClass4912;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
                
                    if (r0 == false) goto L23;
                 */
                @Override // X.AbstractC1036945d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LJFF(X.C41D r9, X.InterfaceC67352kd r10) {
                    /*
                        r8 = this;
                        X.41D r9 = (X.C41D) r9
                        X.41X r0 = r8.LIZ
                        boolean r0 = r0.isDebugMode()
                        r7 = 1
                        if (r0 != 0) goto L6b
                        X.42b r0 = r8.LIZLLL
                        X.3ud r0 = r0.LIZJ
                        int r0 = r0.getChatType()
                        r5 = 3
                        if (r0 == r5) goto L70
                        X.491 r6 = r8.LIZIZ
                        com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct r0 = r9.LIZIZ
                        com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMFromMessageTips r0 = r0.getMsgContent()
                        java.lang.String r1 = r0.getTips()
                        X.42b r0 = r8.LIZLLL
                        X.3ud r0 = r0.LIZJ
                        java.lang.String r4 = r0.getConversationId()
                        X.42b r0 = r8.LIZLLL
                        X.3ud r0 = r0.LIZJ
                        java.lang.String r3 = r0.getSingleChatFromUserId()
                        r6.getClass()
                        java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent> r0 = com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent.class
                        java.lang.Object r2 = X.C62070OXq.LIZ(r0, r1)     // Catch: java.lang.Throwable -> L41
                        com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent r2 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent) r2     // Catch: java.lang.Throwable -> L41
                        X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> L41
                        goto L49
                    L41:
                        r0 = move-exception
                        X.3C4 r2 = X.C141335gf.LIZ(r0)
                        X.C3C5.m7constructorimpl(r2)
                    L49:
                        boolean r0 = X.C3C5.m12isFailureimpl(r2)
                        if (r0 == 0) goto L50
                        r2 = 0
                    L50:
                        com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent r2 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent) r2
                        if (r2 == 0) goto L68
                        java.lang.Long r0 = r2.orderId
                        if (r0 == 0) goto L68
                        long r0 = r0.longValue()
                        r6.LJLL = r2
                        r6.LJLLJ = r4
                        r6.LJLLL = r3
                        int r0 = X.AnonymousClass492.LIZ(r0)
                        if (r0 < r5) goto L72
                    L68:
                        r0 = 0
                    L69:
                        if (r0 == 0) goto L70
                    L6b:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
                        return r0
                    L70:
                        r7 = 0
                        goto L6b
                    L72:
                        r0 = 1
                        goto L69
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C41N.LJFF(X.40d, X.2kd):java.lang.Object");
                }
            });
        }
        final C101353yN c101353yN = (C101353yN) this.LLIIIL.getValue();
        if (c101353yN != null) {
            final C1025140p c1025140p = new C1025140p(this);
            final C1030642s c1030642s = new C1030642s(this.LLJILJIL);
            c1036745b.LJIIJJI(new AbstractC1036945d<C1023940d>(c1028942b, c101353yN, c1025140p, c1030642s) { // from class: X.40g
                public final C101353yN LIZIZ;
                public final InterfaceC65784Pro<IMUser> LIZJ;
                public final InterfaceC65784Pro<Integer> LIZLLL;
                public final AnonymousClass412 LJ;
                public final /* synthetic */ C1028942b LJFF;

                @Override // X.AbstractC1036945d, X.AnonymousClass412
                public final void pause() {
                    this.LJ.pause();
                }

                @Override // X.AbstractC1036945d, X.AnonymousClass412
                public final void resume() {
                    this.LJ.resume();
                }

                @Override // X.AbstractC1036945d
                public final void LIZIZ() {
                    C101353yN c101353yN2 = this.LIZIZ;
                    if (c101353yN2.getVisibility() != 8) {
                        c101353yN2.LJLIL.LIZIZ(c101353yN2);
                        C101353yN.LIZJ(0, c101353yN2.LJLJI);
                    }
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C1023940d c1023940d, InterfaceC67352kd<? super C3WY> interfaceC67352kd) {
                    C4BE invoke = this.LJFF.LIZIZ.invoke();
                    if (invoke != null) {
                        invoke.AQ();
                    }
                    this.LIZIZ.LIZLLL(this.LIZJ.invoke());
                    return this.LIZIZ;
                }

                @Override // X.AbstractC1036945d
                public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
                    boolean z;
                    if (this.LIZ.isDebugMode()) {
                        return Boolean.TRUE;
                    }
                    IMUser invoke = this.LIZJ.invoke();
                    if (invoke == null) {
                        return Boolean.FALSE;
                    }
                    if (C3UE.LIZIZ() && invoke.getFollowStatus() == 0 && this.LJFF.LIZJ.getChatType() == 0) {
                        C101543yg.LIZ.getClass();
                        if (this.LIZLLL.invoke().intValue() > 5 && C92353jr.LIZ.LIZ(invoke.getUid())) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(C41X.MATCHED_FRIEND);
                    AnonymousClass410 anonymousClass410 = new AnonymousClass410(c101353yN);
                    this.LIZIZ = c101353yN;
                    this.LIZJ = c1025140p;
                    this.LIZLLL = c1030642s;
                    this.LJ = anonymousClass410;
                }
            });
        }
        if (this.LJLJJLL.LJLJLJ) {
            c1036745b.LJIIJJI(new C41S(c1028942b, new AnonymousClass423(this)));
            Object value = this.LLFII.getValue();
            o.LJIIIIZZ(value, "<get-sayHelloContainer>(...)");
            AnonymousClass419 anonymousClass419 = new AnonymousClass419(c1028942b, (View) value, new C89193el(this));
            this.LLJI = anonymousClass419;
            c1036745b.LJIIJJI(anonymousClass419);
            c1036745b.LJIIJJI(new AbstractC1036945d<C41D>() { // from class: X.428
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
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                    C101683yu c101683yu = new C101683yu(c1028942b.LIZ);
                    c101683yu.LIZIZ(c1028942b.LJ);
                    this.LIZJ = c101683yu;
                    return c101683yu;
                }

                @Override // X.AbstractC1036945d
                public final Object LJFF(C41D c41d, InterfaceC67352kd interfaceC67352kd) {
                    return Boolean.TRUE;
                }
            });
            c1036745b.LJIIJJI(new AbstractC1036945d<C43S>() { // from class: X.41d
                public Class<?> LIZJ;

                @Override // X.AbstractC1036945d
                public final void LIZIZ() {
                    Class<?> cls = this.LIZJ;
                    if (cls != null) {
                        PopupManager.LIZJ(cls);
                    }
                }

                {
                    super(C41X.OUT_PUSH_GUIDE_POPUP);
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C43S c43s, InterfaceC67352kd interfaceC67352kd) {
                    GuideOutPushParam guideOutPushParam = new GuideOutPushParam("notification_page", (String) null, "dm", (String) null, 21);
                    final C3WQ c3wq = new C3WQ();
                    Class<?> LIZLLL = C55888Lwa.LIZIZ.LIZLLL(c1028942b.LIZ, guideOutPushParam, new MS3() { // from class: X.43d
                        @Override // X.MS3
                        public final void invoke() {
                            C3WQ.this.LIZ();
                        }
                    });
                    this.LIZJ = LIZLLL;
                    if (LIZLLL == null) {
                        return null;
                    }
                    return c3wq;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
                
                    if (r2.LIZJ.getUnreadCount() > 0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
                
                    if (X.C55888Lwa.LIZIZ.LJJIJL(r2.LIZ) != false) goto L18;
                 */
                @Override // X.AbstractC1036945d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LJFF(X.C43S r3, X.InterfaceC67352kd r4) {
                    /*
                        r2 = this;
                        X.43S r3 = (X.C43S) r3
                        boolean r0 = X.C97843si.LIZ()
                        if (r0 == 0) goto L4b
                        X.42b r0 = r2
                        X.1qj r0 = r0.LIZ
                        boolean r1 = X.C40322Fs6.LIZIZ(r0)
                    L10:
                        X.41X r0 = r2.LIZ
                        boolean r0 = r0.isDebugMode()
                        if (r0 != 0) goto L43
                        if (r1 != 0) goto L49
                        X.42b r1 = r2
                        boolean r0 = r1.LIZLLL
                        if (r0 != 0) goto L49
                        boolean r0 = r3.LIZIZ
                        if (r0 != 0) goto L37
                        X.3ud r0 = r1.LIZJ
                        int r1 = r0.getEnterFrom()
                        r0 = 6
                        if (r1 == r0) goto L37
                        X.42b r0 = r2
                        X.3ud r0 = r0.LIZJ
                        int r0 = r0.getUnreadCount()
                        if (r0 <= 0) goto L49
                    L37:
                        X.Lwa r1 = X.C55888Lwa.LIZIZ
                        X.42b r0 = r2
                        X.1qj r0 = r0.LIZ
                        boolean r0 = r1.LJJIJL(r0)
                        if (r0 == 0) goto L49
                    L43:
                        r0 = 1
                    L44:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    L49:
                        r0 = 0
                        goto L44
                    L4b:
                        X.42b r0 = r2
                        X.1qj r0 = r0.LIZ
                        boolean r1 = X.C40322Fs6.LIZJ(r0)
                        goto L10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1026541d.LJFF(X.40d, X.2kd):java.lang.Object");
                }
            });
            final Context context = this.LJLJL;
            c1036745b.LJIIJJI(new AbstractC1036945d<AnonymousClass434>(context) { // from class: X.41o
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(C41X.PERMISSION_REMINDER_DIALOG);
                    o.LJIIIZ(context, "context");
                    this.LIZIZ = context;
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(AnonymousClass434 anonymousClass434, InterfaceC67352kd interfaceC67352kd) {
                    final AnonymousClass434 anonymousClass4342 = anonymousClass434;
                    final C3WQ c3wq = new C3WQ();
                    C101713yx c101713yx = new C101713yx(this.LIZIZ, new C101603ym());
                    this.LIZJ = c101713yx;
                    c101713yx.LIZ(EnumC101493yb.FRIENDS_BEFORE_SEND, anonymousClass4342.LIZJ, new InterfaceC101763z2() { // from class: X.43t
                        @Override // X.InterfaceC101763z2
                        public final void LIZ(EnumC101633yp it) {
                            boolean z;
                            o.LJIIIZ(it, "it");
                            if (it == EnumC101633yp.CLICK_RED_BUTTON && C1043047m.LIZ()) {
                                Looper myLooper = Looper.myLooper();
                                if (myLooper == null) {
                                    myLooper = C16880lQ.LLJJJJ();
                                }
                                new Handler(myLooper).postDelayed(new ARunnableS37S0100000_1(AnonymousClass434.this, 135), ((Number) C45T.LIZ.getValue()).longValue());
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
        }
    }

    public final void LJIIZILJ(String str, boolean z) {
        InterfaceC1032343j interfaceC1032343j;
        C1046648w actionBarDisplayManager;
        boolean z2;
        LifecycleOwner lifecycleOwner = this.LJLIL;
        if ((lifecycleOwner instanceof InterfaceC1032343j) && (interfaceC1032343j = (InterfaceC1032343j) lifecycleOwner) != null && (actionBarDisplayManager = interfaceC1032343j.getActionBarDisplayManager()) != null) {
            ActionBarComponent actionBarComponent = actionBarDisplayManager.LIZJ;
            if (actionBarComponent != null) {
                z2 = actionBarComponent.LIZ();
            } else {
                z2 = true;
            }
            actionBarDisplayManager.LIZ(str, z, z2);
        }
    }

    @Override // X.InterfaceC120024nO
    public final void Mi(String conversationId, List<C63089OpR> list) {
        o.LJIIIZ(conversationId, "conversationId");
    }

    @Override // X.InterfaceC120024nO
    public final void y9(int i, C63120Opw c63120Opw) {
        Boolean bool;
        if (c63120Opw != null) {
            bool = Boolean.valueOf(C78897Uxp.LJJIJ(c63120Opw));
        } else {
            bool = null;
        }
        if (!o.LJ(Boolean.valueOf(this.LJLJJI.isMediaMsgMasking()), bool) && bool != null) {
            this.LJLJJI.setMediaMsgMasking(bool.booleanValue());
            this.LLJILJIL.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZIZ(com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel r7, X.C1036745b r8, X.InterfaceC67352kd<? super X.C1036745b> r9) {
        /*
            boolean r0 = r9 instanceof X.C42M
            if (r0 == 0) goto L6e
            r5 = r9
            X.42M r5 = (X.C42M) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r7 = r5.LJLJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r4 = 3
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 == r1) goto L29
            if (r0 == r3) goto L57
            if (r0 != r4) goto L74
            X.45b r8 = r5.LJLIL
            X.C141335gf.LIZJ(r7)
        L28:
            return r8
        L29:
            X.45b r2 = r5.LJLILLLLZI
            X.45b r8 = r5.LJLIL
            X.C141335gf.LIZJ(r7)
            goto L44
        L31:
            X.C141335gf.LIZJ(r7)
            X.41X r0 = X.C41X.OUT_PUSH_GUIDE_BOTTOM
            r5.LJLIL = r8
            r5.LJLILLLLZI = r8
            r5.LJLJJL = r1
            java.lang.Object r0 = r8.LIZIZ(r0, r5)
            if (r0 != r6) goto L43
            return r6
        L43:
            r2 = r8
        L44:
            X.43S r1 = new X.43S
            r0 = 0
            r1.<init>(r0)
            r5.LJLIL = r8
            r5.LJLILLLLZI = r2
            r5.LJLJJL = r3
            java.lang.Object r0 = r2.LIZ(r1, r5)
            if (r0 != r6) goto L5e
            return r6
        L57:
            X.45b r2 = r5.LJLILLLLZI
            X.45b r8 = r5.LJLIL
            X.C141335gf.LIZJ(r7)
        L5e:
            X.41X r1 = X.C41X.PUSH_PREVIEW
            r5.LJLIL = r8
            r0 = 0
            r5.LJLILLLLZI = r0
            r5.LJLJJL = r4
            java.lang.Object r0 = r2.LIZIZ(r1, r5)
            if (r0 != r6) goto L28
            return r6
        L6e:
            X.42M r5 = new X.42M
            r5.<init>(r7, r9)
            goto L12
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel.LIZIZ(com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel, X.45b, X.2kd):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v208, types: [X.3um] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [X.Yns, X.Pro] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0A2, androidx.recyclerview.widget.LinearLayoutManager, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$linearLayoutManager$1] */
    public BaseChatPanel(LifecycleOwner parent, View rootView, C99033ud c99033ud, boolean z, C99043ue chatRoomConfig) {
        super(parent);
        ChatRoomLiveStateManager chatRoomLiveStateManager;
        C19L c19l;
        ?? r13;
        SuggestedReplyViewModel LJII;
        EnumC110124Tw enumC110124Tw;
        C109544Rq lastShowMessage;
        int i;
        MutableLiveData<ImChatTopTipModel> mutableLiveData;
        C1034344d c1034344d;
        Map<String, String> botQueryRequestExtra;
        int i2;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(chatRoomConfig, "chatRoomConfig");
        this.LJLJI = rootView;
        this.LJLJJI = c99033ud;
        this.LJLJJL = z;
        this.LJLJJLL = chatRoomConfig;
        final Context context = rootView.getContext();
        o.LJIIIIZZ(context, "rootView.context");
        this.LJLJL = context;
        Fragment fragment = (Fragment) parent;
        this.LJLJLJ = fragment;
        ActivityC45651qj requireActivity = fragment.requireActivity();
        o.LJIIIIZZ(requireActivity, "mFragment.requireActivity()");
        this.LJLJLLL = requireActivity;
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 328));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 317));
        this.LJLLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 307));
        this.LJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 305));
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 311));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 325));
        this.LJLZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 323));
        this.LJZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 320));
        this.LJZL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 321));
        this.LL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 329));
        this.LLD = C221108m2.LIZIZ(new AqS151S0100000_1(this, 327));
        this.LLF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 304));
        this.LLFFF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 319));
        this.LLFII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 318));
        View findViewById = rootView.findViewById(R.id.b_5);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.chat_title_layout)");
        this.LLFZ = (C101043xs) findViewById;
        this.LLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 306));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 308));
        this.LLII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 316));
        View findViewById2 = rootView.findViewById(R.id.isd);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.recycle_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.LLIIIILZ = recyclerView;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 313));
        this.LLIIIL = LIZIZ;
        this.LLIIIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 326));
        this.LLIIJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 314));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 322));
        this.LLIIL = true;
        this.LLIILZL = true;
        this.LLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 309));
        ?? r8 = new ChatLinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$linearLayoutManager$1
            @Override // com.ss.android.ugc.aweme.views.WrapLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final void LJLJJL(C0AC state) {
                o.LJIIIZ(state, "state");
                super.LJLJJL(state);
                BaseChatPanel.this.LLIIZ = System.currentTimeMillis();
                if (state.LIZIZ() > 0) {
                    BaseChatPanel.this.LJIILL(System.currentTimeMillis());
                }
            }
        };
        this.LLILL = r8;
        this.LLILLJJLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 312));
        this.LLILZ = -2;
        this.LLIZLLLIL = new ArrayList();
        C64962gm LIZ = C48841JEv.LIZ(C36636EZk.LIZ.plus(T2R.LJIIJJI()));
        this.LLJ = LIZ;
        this.LLJIJIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 330));
        ChatRoomViewModel LIZ2 = C97123rY.LIZ(this.LJLJLJ, this.LJLJJI);
        this.LLJILJILJ = LIZ2;
        this.LLJILLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 324));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS151S0100000_1(this, 310));
        this.LLJJ = LIZIZ2;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LLJJIII = c73318Sq2;
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(new AqS151S0100000_1(this, 303));
        this.LLJJIJI = LIZIZ3;
        IDeS150S0200000_1 iDeS150S0200000_1 = LIZ2.LLFFF;
        C3BD.LIZ.getClass();
        this.LLJJIJIIJIL = V1M.LJJJJLI(iDeS150S0200000_1, LIZ, C3BE.LIZIZ, C3FJ.VISIBLE);
        AbstractC90763hI LIZ3 = C81273Gx.LIZ(this.LJLJJI.getConversationId());
        this.LLJJJ = LIZ3;
        if (this.LJLJJLL.LJLLL) {
            chatRoomLiveStateManager = new ChatRoomLiveStateManager(parent, recyclerView);
        } else {
            chatRoomLiveStateManager = null;
        }
        this.LLILLIZIL = chatRoomLiveStateManager;
        final AbstractC1038245q LJFF = LJFF();
        LJFF.setHasStableIds(false);
        if (this.LJLJJLL.LJZL) {
            LJFF.LJLILLLLZI.observe(parent, new AObserverS69S0100000_1(this, 39));
        }
        if (this.LJLJJLL.LJLJLJ) {
            this.LLILZLL = new ARunnableS37S0100000_1(this, 30);
            this.LLILZIL = new ARunnableS37S0100000_1(this, 31);
        }
        LJFF.LJZL.LJIIJJI = new C1029242e(new C43O() { // from class: X.42L
            @Override // X.C43O
            public final boolean LIZ() {
                Integer num;
                BaseChatPanel baseChatPanel;
                InputView inputView;
                InputView inputView2 = BaseChatPanel.this.LLILLL;
                if (inputView2 != null) {
                    num = Integer.valueOf(inputView2.LJLLILLLL);
                } else {
                    num = null;
                }
                if (num == null || (inputView = (baseChatPanel = BaseChatPanel.this).LLILLL) == null || inputView.LJLLILLLL != -2) {
                    return false;
                }
                MS5.LJFF(new AqS151S0100000_1(baseChatPanel, 1053));
                return true;
            }

            @Override // X.C43O
            public final void LIZIZ() {
                BaseChatPanel baseChatPanel = BaseChatPanel.this;
                baseChatPanel.LLILL.LLIIJI = true;
                InputView inputView = baseChatPanel.LLILLL;
                if (inputView != null) {
                    ViewGroup viewGroup = inputView.LLFFF;
                    if (viewGroup != null) {
                        viewGroup.post(new ARunnableS37S0100000_1(inputView, 86));
                    } else {
                        o.LJIJI("inputRootLayout");
                        throw null;
                    }
                }
            }

            @Override // X.C43O
            public final void onDismiss() {
                BaseChatPanel baseChatPanel = BaseChatPanel.this;
                baseChatPanel.LLILL.LLIIJI = true;
                C1036745b LJI = baseChatPanel.LJI();
                if (LJI != null) {
                    LJI.LJI(false, new C42I(null));
                }
                BaseChatPanel baseChatPanel2 = BaseChatPanel.this;
                if (baseChatPanel2.LLILZ == 0) {
                    InputView inputView = baseChatPanel2.LLILLL;
                    if (inputView != null) {
                        inputView.LJJIJLIJ(false);
                    }
                    BaseChatPanel.this.getClass();
                }
                BaseChatPanel baseChatPanel3 = BaseChatPanel.this;
                baseChatPanel3.LLILZ = -2;
                baseChatPanel3.LJIIZILJ("message_long_pressed", false);
            }

            @Override // X.C43O
            public final void onShow() {
                BaseChatPanel baseChatPanel = BaseChatPanel.this;
                baseChatPanel.LLILL.LLIIJI = false;
                baseChatPanel.LJIIZILJ("message_long_pressed", true);
                InputView inputView = BaseChatPanel.this.LLILLL;
                if (inputView != null) {
                    ViewGroup viewGroup = inputView.LLFFF;
                    if (viewGroup != null) {
                        viewGroup.post(new ARunnableS37S0100000_1(inputView, 87));
                    } else {
                        o.LJIJI("inputRootLayout");
                        throw null;
                    }
                }
                C1036745b LJI = BaseChatPanel.this.LJI();
                if (LJI != null) {
                    LJI.LJI(false, new C42I(null));
                }
            }
        }, LJFF);
        LJFF.LJLLLLLL(new InterfaceC1029942l() { // from class: X.41Q
            @Override // X.InterfaceC1029942l
            public final void Hp() {
            }

            @Override // X.InterfaceC1029942l
            public final void Og() {
            }

            @Override // X.InterfaceC1029942l
            public final void Ah(AbstractC89473fD event) {
                o.LJIIIZ(event, "event");
            }

            @Override // X.InterfaceC1029942l
            public final void IP(AbstractC1041546x viewHolder) {
                o.LJIIIZ(viewHolder, "viewHolder");
                C107834Lb LJIIIIZZ = BaseChatPanel.this.LJIIIIZZ();
                if (LJIIIIZZ != null) {
                    LJIIIIZZ.LIZ(viewHolder);
                }
            }

            @Override // X.InterfaceC1029942l
            public final void QG(AbstractC1041546x viewHolder) {
                o.LJIIIZ(viewHolder, "viewHolder");
                C107834Lb LJIIIIZZ = BaseChatPanel.this.LJIIIIZZ();
                if (LJIIIIZZ != null) {
                    LJIIIIZZ.LIZIZ(viewHolder);
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
                viewHolder.LJZ = (ChatPageNudgeViewModel) BaseChatPanel.this.LLF.getValue();
                if ((viewHolder instanceof C4RQ) && (chatRoomLiveStateManager2 = BaseChatPanel.this.LLILLIZIL) != null) {
                    chatRoomLiveStateManager2.LIZ((C4RQ) viewHolder);
                }
                if (viewHolder instanceof AbstractC779033y) {
                    ((AbstractC779033y) viewHolder).LLIIIILZ = (FakeMessageViewModel) BaseChatPanel.this.LLJJ.getValue();
                }
                if (viewHolder instanceof AnonymousClass429) {
                    BaseChatPanel.this.LLIZ = (AnonymousClass429) viewHolder;
                }
            }

            @Override // X.InterfaceC1029942l
            public final void zG(RecyclerView recyclerView2) {
                o.LJIIIZ(recyclerView2, "recyclerView");
            }

            @Override // X.InterfaceC1029942l
            public final void s50(AbstractC1041546x holder, C109544Rq c109544Rq) {
                o.LJIIIZ(holder, "holder");
            }
        });
        final C44E jv0 = LIZ2.jv0();
        if (jv0 != null) {
            C99033ud sessionInfo = LJFF.LJLJLLL;
            LifecycleOwner owner = LJFF.LJLL;
            o.LJIIIZ(sessionInfo, "sessionInfo");
            o.LJIIIZ(owner, "owner");
            C44F c44f = jv0.LJFF;
            if (c44f != null) {
                ChatRoomViewModel chatRoomViewModel = jv0.LIZ;
                o.LJIIIZ(chatRoomViewModel, "chatRoomViewModel");
                C1034344d c1034344d2 = new C1034344d(sessionInfo, chatRoomViewModel);
                c44f.LJLIL = c1034344d2;
                c44f.LIZIZ().push(c1034344d2);
            }
            C99893w1 c99893w1 = jv0.LIZLLL;
            if (c99893w1 != null) {
                ChatRoomViewModel chatRoomViewModel2 = jv0.LIZ;
                o.LJIIIZ(chatRoomViewModel2, "chatRoomViewModel");
                List<String> autoSendMessageContent = sessionInfo.getAutoSendMessageContent();
                if ((autoSendMessageContent == null || autoSendMessageContent.isEmpty()) && !C44H.LIZ() && (botQueryRequestExtra = sessionInfo.getBotQueryRequestExtra()) != null) {
                    String str = botQueryRequestExtra.get("source");
                    if (o.LJ(str, "feed_chat_sug")) {
                        i2 = 1;
                    } else if (o.LJ(str, "session_list_chat_sug")) {
                        i2 = 4;
                    } else {
                        i2 = 3;
                    }
                    ((C775432o) C96963rI.LIZIZ.getValue()).LIZ(i2, sessionInfo, ViewModelKt.getViewModelScope(chatRoomViewModel2), null, true, new AqS167S0100000_1(c99893w1, 463));
                }
            }
            C99813vt c99813vt = jv0.LJI;
            if (c99813vt != null) {
                c99813vt.LIZ = sessionInfo;
                c99813vt.LIZ().push(sessionInfo);
            }
            C99813vt c99813vt2 = jv0.LJI;
            if (c99813vt2 != null) {
                C44H.LIZIZ(owner, new AObserverS69S0100000_1(c99813vt2, 147));
            }
            if (jv0.LJII != null) {
                owner.getLifecycle().addObserver(new TakoScreenShotHandler$observerScreenShot$1(sessionInfo));
            }
            LJFF.LJLLLLLL(new InterfaceC1029942l() { // from class: X.44A
                @Override // X.InterfaceC1029942l
                public final void Hp() {
                }

                @Override // X.InterfaceC1029942l
                public final void Og() {
                }

                @Override // X.InterfaceC1029942l
                public final void Ah(AbstractC89473fD event) {
                    C109544Rq c109544Rq;
                    Boolean bool;
                    C1034344d c1034344d3;
                    C45I c44b;
                    List<C109544Rq> list;
                    String str2;
                    boolean z2;
                    long j;
                    long j2;
                    o.LJIIIZ(event, "event");
                    if (event instanceof C91613if) {
                        if (!C84523Tk.LJFF()) {
                            C84523Tk.LJIIIZ();
                        }
                        AnonymousClass449 anonymousClass449 = C44E.this.LIZIZ;
                        String str3 = null;
                        if (anonymousClass449 != null && (list = ((C91613if) event).LIZ) != null) {
                            C109544Rq c109544Rq2 = (C109544Rq) ORZ.LJLLLL(list);
                            if (c109544Rq2 != null) {
                                str2 = c109544Rq2.getConversationId();
                            } else {
                                str2 = null;
                            }
                            if (o.LJ(str2, anonymousClass449.LIZJ)) {
                                if (c109544Rq2 == null || !c109544Rq2.isSelf() || (c109544Rq2.getMsgStatus() != 2 && c109544Rq2.getMsgStatus() != 5)) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("lastMsgCanShowTyping: ");
                                LIZ4.append(z2);
                                V1B.LJIIZILJ(X1D.LIZIZ(LIZ4));
                                if (z2) {
                                    long msgId = c109544Rq2.getMsgId();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    Long l = AnonymousClass449.LJI;
                                    if (l != null) {
                                        j = l.longValue();
                                    } else {
                                        j = 0;
                                    }
                                    long j3 = currentTimeMillis - j;
                                    Long l2 = C1036144v.LIZ().typingExceedTime;
                                    if (l2 != null) {
                                        j2 = l2.longValue();
                                    } else {
                                        j2 = 0;
                                    }
                                    long j4 = j2 - j3;
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("showTypingTime: ");
                                    LIZ5.append(AnonymousClass449.LJI);
                                    LIZ5.append(" typingRemainTime: ");
                                    LIZ5.append(j4);
                                    V1B.LJIIZILJ(X1D.LIZIZ(LIZ5));
                                    if (AnonymousClass449.LJI != null && j4 > 0) {
                                        anonymousClass449.LIZJ(msgId, j4, anonymousClass449.LIZJ, true);
                                    } else {
                                        anonymousClass449.LJ(anonymousClass449.LIZJ, false, true);
                                    }
                                } else if (!C1031943f.LIZ(c109544Rq2) && !C93793mB.LJIIIZ(c109544Rq2)) {
                                    anonymousClass449.LJ(anonymousClass449.LIZJ, false, true);
                                }
                            }
                        }
                        C99893w1 c99893w12 = C44E.this.LIZLLL;
                        if (c99893w12 != null) {
                            c99893w12.LIZJ(true);
                        }
                        C44F c44f2 = C44E.this.LJFF;
                        if (c44f2 != null && (c1034344d3 = c44f2.LJLIL) != null) {
                            final C1034144b c1034144b = c1034344d3.LJLILLLLZI;
                            if (c1034144b.LIZIZ.getDisableLocateMsgWhenEnter() && !C93793mB.LJIILLIIL(C78555UsJ.LJIJJ(c1034144b.LIZ)) && !C93793mB.LJIIIZ(C78555UsJ.LJIJJ(c1034144b.LIZ))) {
                                final ChatRoomViewModel chatRoomViewModel3 = c1034144b.LIZ;
                                c44b = new C45I(chatRoomViewModel3, c1034144b) { // from class: X.44M
                                    public final ChatRoomViewModel LIZ;
                                    public final C1034144b LIZIZ;

                                    @Override // X.C45I
                                    public final void execute() {
                                        Long l3;
                                        C109544Rq c109544Rq3;
                                        C1034144b c1034144b2 = this.LIZIZ;
                                        List LJIJJLI = C78555UsJ.LJIJJLI(this.LIZ);
                                        if (LJIJJLI != null && (c109544Rq3 = (C109544Rq) ORZ.LLFII(LJIJJLI)) != null) {
                                            l3 = Long.valueOf(c109544Rq3.getOrderIndex());
                                        } else {
                                            l3 = null;
                                        }
                                        c1034144b2.LIZIZ(l3, false);
                                        C1034144b c1034144b3 = this.LIZIZ;
                                        c1034144b3.LJFF = true;
                                        c1034144b3.LJ = true;
                                    }

                                    {
                                        this.LIZ = chatRoomViewModel3;
                                        this.LIZIZ = c1034144b;
                                    }
                                };
                            } else {
                                c44b = new C44B(c1034144b.LIZ, c1034144b);
                            }
                            AnonymousClass458 anonymousClass458 = (AnonymousClass458) c1034144b.LJI.getValue();
                            anonymousClass458.getClass();
                            anonymousClass458.LIZ = c44b;
                            AnonymousClass458 anonymousClass4582 = (AnonymousClass458) c1034144b.LJI.getValue();
                            anonymousClass4582.getClass();
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("MsgLocateStrategyExecutor execute:");
                            C45I c45i = anonymousClass4582.LIZ;
                            if (c45i != null) {
                                str3 = C16880lQ.LJLLJ(c45i.getClass());
                            }
                            LIZ6.append(str3);
                            V1B.LJIIZILJ(X1D.LIZIZ(LIZ6));
                            C45I c45i2 = anonymousClass4582.LIZ;
                            if (c45i2 != null) {
                                c45i2.execute();
                            }
                        }
                        C1034544f c1034544f = C44E.this.LIZJ;
                        if (c1034544f != null && (c109544Rq = (C109544Rq) ORZ.LJLLLL(((C91613if) event).LIZ)) != null && (((bool = C1036144v.LIZ().enablePullWhenEnter) == null || bool.booleanValue()) && ((c109544Rq.isSelf() && (c109544Rq.getMsgStatus() == 2 || c109544Rq.getMsgStatus() == 5)) || C1031943f.LIZ(c109544Rq)))) {
                            c1034544f.LIZ(EnumC1035444o.ENTER_CHAT);
                        }
                        C99813vt c99813vt3 = C44E.this.LJI;
                        if (c99813vt3 != null) {
                            LifecycleOwner owner2 = LJFF.LJLL;
                            o.LJIIIZ(owner2, "owner");
                            C1DH.LJJIJIIJIL(0L, new ARunnableS20S0200000_1(owner2, c99813vt3, 59));
                        }
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("observe OnQueryMessageEvent list:");
                        LIZ7.append(((C91613if) event).LIZ.size());
                        V1B.LJIIZILJ(X1D.LIZIZ(LIZ7));
                    }
                }

                @Override // X.InterfaceC1029942l
                public final void IP(AbstractC1041546x viewHolder) {
                    o.LJIIIZ(viewHolder, "viewHolder");
                }

                @Override // X.InterfaceC1029942l
                public final void QG(AbstractC1041546x viewHolder) {
                    o.LJIIIZ(viewHolder, "viewHolder");
                }

                @Override // X.InterfaceC1029942l
                public final void Vj(List<? extends C109544Rq> list) {
                    o.LJIIIZ(list, "list");
                }

                @Override // X.InterfaceC1029942l
                public final void ik0(List<? extends C109544Rq> list) {
                    o.LJIIIZ(list, "list");
                }

                @Override // X.InterfaceC1029942l
                public final void rD(AbstractC1041546x viewHolder) {
                    o.LJIIIZ(viewHolder, "viewHolder");
                }

                @Override // X.InterfaceC1029942l
                public final void zG(RecyclerView recyclerView2) {
                    o.LJIIIZ(recyclerView2, "recyclerView");
                }

                @Override // X.InterfaceC1029942l
                public final void s50(AbstractC1041546x holder, C109544Rq c109544Rq) {
                    o.LJIIIZ(holder, "holder");
                }
            });
            C44F c44f2 = jv0.LJFF;
            if (c44f2 != null && (c1034344d = c44f2.LJLIL) != null) {
                LJFF.LJLLLLLL(c1034344d);
            }
        }
        this.LLJILJIL = LJFF;
        if (this.LJLJJLL.LJLJLJ) {
            this.LLJJJJ = new InterfaceC85393Wt() { // from class: X.3um
                @Override // X.InterfaceC85393Wt
                public final void LJIILL() {
                }

                @Override // X.InterfaceC85393Wt
                public final void LJIILIIL() {
                    BaseChatPanel baseChatPanel = BaseChatPanel.this;
                    InputView inputView = baseChatPanel.LLILLL;
                    if (inputView != null) {
                        inputView.LJJIJIL();
                    }
                    C99113ul c99113ul = baseChatPanel.LLJJIJIL;
                    if (c99113ul != null) {
                        c99113ul.LIZ();
                    }
                }

                @Override // X.InterfaceC85393Wt
                public final void LJIILJJIL() {
                    ValueAnimator valueAnimator;
                    BaseChatPanel baseChatPanel = BaseChatPanel.this;
                    InputView inputView = baseChatPanel.LLILLL;
                    if (inputView != null && (valueAnimator = (ValueAnimator) inputView.LLILZLL.getValue()) != null) {
                        valueAnimator.start();
                    }
                    C99113ul c99113ul = baseChatPanel.LLJJIJIL;
                    if (c99113ul != null) {
                        c99113ul.LIZIZ();
                    }
                }
            };
            C97873sl c97873sl = (C97873sl) this.LJLLILLLL.getValue();
            if (c97873sl != null) {
                C99123um c99123um = this.LLJJJJ;
                if (c99123um != null) {
                    C85373Wr c85373Wr = c97873sl.LJLIL;
                    c85373Wr.getClass();
                    ((ArrayList) c85373Wr.LJLILLLLZI).add(c99123um);
                } else {
                    o.LJIJI("popupCallback");
                    throw null;
                }
            }
            C101353yN c101353yN = (C101353yN) LIZIZ.getValue();
            if (c101353yN != null) {
                C99123um c99123um2 = this.LLJJJJ;
                if (c99123um2 != null) {
                    C85373Wr c85373Wr2 = c101353yN.LJLIL;
                    c85373Wr2.getClass();
                    ((ArrayList) c85373Wr2.LJLILLLLZI).add(c99123um2);
                } else {
                    o.LJIJI("popupCallback");
                    throw null;
                }
            }
            C3WV c3wv = (C3WV) this.LJLLI.getValue();
            if (c3wv != null) {
                C99123um c99123um3 = this.LLJJJJ;
                if (c99123um3 != null) {
                    C85373Wr c85373Wr3 = c3wv.LJLIL;
                    c85373Wr3.getClass();
                    ((ArrayList) c85373Wr3.LJLILLLLZI).add(c99123um3);
                } else {
                    o.LJIJI("popupCallback");
                    throw null;
                }
            }
        }
        final WeakReference weakReference = new WeakReference(this.LJLJLJ);
        C15Y c15y = new C15Y(this.LJLJL);
        View view = this.LJLJI;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        c15y.LIZ(R.layout.b7j, (ViewGroup) view, new C15X() { // from class: X.41V
            @Override // X.C15X
            public final void onInflateFinished(View view2, int i3, ViewGroup viewGroup) {
                InputView inputView;
                o.LJIIIZ(view2, "view");
                if (!BaseChatPanel.this.LJLJLJ.isDetached() && BaseChatPanel.this.LJLJLJ.mo49getActivity() != null) {
                    ActivityC45651qj mo49getActivity = BaseChatPanel.this.LJLJLJ.mo49getActivity();
                    if (mo49getActivity != null && mo49getActivity.isFinishing()) {
                        return;
                    }
                    BaseChatPanel baseChatPanel = BaseChatPanel.this;
                    ViewGroup rootView2 = (ViewGroup) baseChatPanel.LJLJI;
                    C99033ud sessionInfo2 = baseChatPanel.LJLJJI;
                    WeakReference<Fragment> fragmentWeakReference = weakReference;
                    LifecycleOwner lifecycleOwner = baseChatPanel.LJLIL;
                    boolean z2 = baseChatPanel.LJLJJL;
                    o.LJIIIZ(rootView2, "rootView");
                    o.LJIIIZ(sessionInfo2, "sessionInfo");
                    o.LJIIIZ(fragmentWeakReference, "fragmentWeakReference");
                    o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
                    if (sessionInfo2.isTakoChat$im_base_release()) {
                        inputView = new TakoInputView(rootView2, sessionInfo2, fragmentWeakReference, lifecycleOwner, z2);
                    } else {
                        inputView = new InputView(rootView2, sessionInfo2, fragmentWeakReference, lifecycleOwner, z2, view2);
                    }
                    baseChatPanel.LLILLL = inputView;
                    BaseChatPanel baseChatPanel2 = BaseChatPanel.this;
                    InputView inputView2 = baseChatPanel2.LLILLL;
                    if (!(inputView2 instanceof InputView)) {
                        return;
                    }
                    o.LJII(inputView2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView");
                    baseChatPanel2.LIZLLL(inputView2);
                }
            }
        });
        C107834Lb LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZJ();
        }
        if (this.LJLJJLL.LJLLLLLL) {
            LJFF.LLD.observe(this.LJLIL, new AObserverS69S0100000_1(this, 156));
        }
        LJFF.LLF.observe(this.LJLIL, new AObserverS69S0100000_1(this, 155));
        ChatNoticeViewModel chatNoticeViewModel = (ChatNoticeViewModel) LIZIZ3.getValue();
        if (chatNoticeViewModel != null && (mutableLiveData = chatNoticeViewModel.LJLJLJ) != null) {
            mutableLiveData.observe(this.LJLIL, new AObserverS69S0100000_1(this, 154));
        }
        if (this.LJLJJLL.LJZ) {
            LIZ3.LJIIL(this);
        }
        if (this.LJLJJLL.LJLLI) {
            c19l = new C19L(this.LJLJJI.getEnterFromForMob(), this.LJLJJI.getEnterMethod());
        } else {
            c19l = null;
        }
        LJFF.LJLLLLLL(LIZ2.LJLLILLLL);
        if (this.LJLJJLL.LJLZ) {
            C99033ud c99033ud2 = this.LJLJJI;
            if (c99033ud2 instanceof C98523to) {
                IMUser LJIIJ = C80533Eb.LJIIJ(c99033ud2.getSingleChatFromUserId(), null);
                if (C100383wo.LIZ() && (LJFF instanceof C3WJ) && !this.LJLJJL && LJIIJ != null && LJIIJ.getUid() != null) {
                    C1042547h.LJIIJ(this.LJLJJI.getEnterFromForMob(), String.valueOf(LJIIJ.getFriendRecType()), String.valueOf(LJIIJ.getFollowStatus()));
                }
                C101543yg c101543yg = C101543yg.LIZ;
                if (LJIIJ != null) {
                    i = LJIIJ.getFollowStatus();
                } else {
                    i = -1;
                }
                c101543yg.getClass();
                C101543yg.LIZIZ = i;
            }
        }
        if (this.LJLJJLL.LJZ) {
            C78999UzT.LJFF(C73542Ste.LJIIIIZZ(LIZ2.LJLLLLLL.LJJJ(C73969T1h.LIZIZ()), C88233dD.LJLIL, null, new AqS167S0100000_1(this, 119), 2), c73318Sq2);
        }
        if (this.LJLJJLL.LJLLI) {
            C73454SsE LJJJ = LIZ2.LJLLLL.LJJJ(C73969T1h.LIZIZ());
            C88243dE c88243dE = C88243dE.LJLIL;
            AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(c19l, LiveTryModeCountDownThresholdSetting.DEFAULT);
            r13 = 0;
            C78999UzT.LJFF(C73542Ste.LJIIIIZZ(LJJJ, c88243dE, null, aqS167S0100000_1, 2), c73318Sq2);
        } else {
            r13 = 0;
        }
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(LIZ2.LJLLLL, r13, r13, new AnonymousClass427(this), 3), c73318Sq2);
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(LIZ2.LJLLLL.LJJJ(C73969T1h.LIZIZ()), C75652y1.LJLIL, r13, new AqS167S0100000_1(this, 515), 2), c73318Sq2);
        if (!this.LJLJJI.isReportPage() && !this.LJLJJLL.LLF && C117294iz.LIZ()) {
            parent.getLifecycle().addObserver(new ScrollToBottomIndicator(this.LJLJI, recyclerView, LIZ2.LJLLL));
        }
        InterfaceC99713vj model = LIZ2.LJLL;
        SuggestedReplyViewModel LJII2 = LJII();
        o.LJIIIZ(model, "model");
        LJFF.LJLLILLLL = model;
        LJFF.LLFII = LJII2;
        LJFF.LJZL.LJIIIZ = LIZ2;
        r8.LLJJIJI(true);
        r8.LLJJIJIIJIL(this.LJLJJI.isTakoChat$im_base_release());
        recyclerView.setLayoutManager(r8);
        if (!this.LJLJJI.isReportPage()) {
            C1038845w c1038845w = new C1038845w();
            recyclerView.setRecycledViewPool(c1038845w);
            C63120Opw LIZLLL = LIZ3.LIZLLL();
            if (LIZLLL != null && (lastShowMessage = LIZLLL.getLastShowMessage()) != null) {
                EnumC110124Tw.Companion.getClass();
                enumC110124Tw = C110134Tx.LJFF(lastShowMessage);
            } else {
                enumC110124Tw = null;
            }
            C1038845w.LIZ(c1038845w, recyclerView, LJFF, enumC110124Tw);
        }
        recyclerView.LJII(new C4DL(), -1);
        recyclerView.setClickable(true);
        if (this.LJLJJI.isTakoChat$im_base_release()) {
            recyclerView.setItemAnimator(new C40171ht() { // from class: X.4j4
                public static TimeInterpolator LJIJJ;
                public final List<RecyclerView.ViewHolder> LJIJI = new ArrayList();

                @Override // X.C40171ht, X.AbstractC030109x
                public final void LJIIZILJ() {
                    AbstractC1041546x abstractC1041546x;
                    super.LJIIZILJ();
                    if (!((ArrayList) this.LJIJI).isEmpty()) {
                        Iterator it = ((ArrayList) this.LJIJI).iterator();
                        while (it.hasNext()) {
                            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
                            C109544Rq c109544Rq = null;
                            if ((viewHolder instanceof AbstractC1041546x) && (abstractC1041546x = (AbstractC1041546x) viewHolder) != null) {
                                c109544Rq = abstractC1041546x.LJZI;
                            }
                            if (C93793mB.LJIIJJI(c109544Rq) || C93793mB.LJIILJJIL(c109544Rq)) {
                                View view2 = viewHolder.itemView;
                                o.LJIIIIZZ(view2, "holder.itemView");
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", C32151Nz.LJIIZILJ(20), 0.0f);
                                ofFloat.setInterpolator(C55953Lxd.LIZLLL());
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "alpha", 1.0f);
                                ofFloat2.setInterpolator(new LinearInterpolator());
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(ofFloat, ofFloat2);
                                animatorSet.setDuration(200L);
                                animatorSet.addListener(new ALAdapterS0S0400000_1(this, viewHolder, view2, animatorSet, 0));
                                animatorSet.start();
                            }
                        }
                        ((ArrayList) this.LJIJI).clear();
                    }
                }

                @Override // X.C40171ht, X.AbstractC030109x
                public final void LJIIJ() {
                    for (int size = ((ArrayList) this.LJIJI).size() - 1; -1 < size; size--) {
                        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LJIJI, size);
                        viewHolder.itemView.setAlpha(1.0f);
                        LJIL(viewHolder);
                        ListProtector.remove(this.LJIJI, size);
                    }
                    if (!LJIILJJIL()) {
                        return;
                    }
                    super.LJIIJ();
                }

                @Override // X.C40171ht, X.AbstractC030109x
                public final boolean LJIILJJIL() {
                    if ((!this.LJIJI.isEmpty()) || super.LJIILJJIL()) {
                        return true;
                    }
                    return false;
                }

                {
                    this.LJI = false;
                }

                @Override // X.C40171ht, X.AbstractC030109x
                public final void LJIIIZ(RecyclerView.ViewHolder item) {
                    o.LJIIIZ(item, "item");
                    View view2 = item.itemView;
                    o.LJIIIIZZ(view2, "item.itemView");
                    view2.animate().cancel();
                    if (((ArrayList) this.LJIJI).remove(item)) {
                        view2.setAlpha(1.0f);
                        LJIL(item);
                    }
                    super.LJIIIZ(item);
                }

                @Override // X.C40171ht, X.AbstractC28931Bp
                public final void LJIJ(RecyclerView.ViewHolder holder) {
                    AbstractC1041546x abstractC1041546x;
                    o.LJIIIZ(holder, "holder");
                    C109544Rq c109544Rq = null;
                    if ((holder instanceof AbstractC1041546x) && (abstractC1041546x = (AbstractC1041546x) holder) != null) {
                        c109544Rq = abstractC1041546x.LJZI;
                    }
                    if (C93793mB.LJIIJJI(c109544Rq) || C93793mB.LJIILJJIL(c109544Rq)) {
                        if (LJIJJ == null) {
                            LJIJJ = new ValueAnimator().getInterpolator();
                        }
                        holder.itemView.animate().setInterpolator(LJIJJ);
                        LJIIIZ(holder);
                        holder.itemView.setAlpha(0.0f);
                        ((ArrayList) this.LJIJI).add(holder);
                        return;
                    }
                    super.LJIJ(holder);
                }
            });
        } else if (C00F.LIZ(31744, 0, "im_chatroom_recycler_view_item_animation", true) == 0) {
            C40171ht c40171ht = new C40171ht() { // from class: X.42Y
                @Override // X.C40171ht, X.AbstractC28931Bp
                public final boolean LJIJI(int i3, int i4, int i5, int i6, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    if (viewHolder == viewHolder2) {
                        return super.LJIJI(i3, i4, i5, i6, viewHolder, viewHolder2);
                    }
                    viewHolder.itemView.animate().cancel();
                    viewHolder2.itemView.animate().cancel();
                    viewHolder.itemView.animate().alpha(0.0f).setDuration(125L).start();
                    return true;
                }
            };
            c40171ht.LJI = false;
            recyclerView.setItemAnimator(c40171ht);
        } else {
            recyclerView.setItemAnimator(null);
        }
        recyclerView.setClipChildren(false);
        recyclerView.setVerticalScrollBarEnabled(true);
        recyclerView.setScrollBarStyle(33554432);
        recyclerView.setAdapter(LJFF);
        recyclerView.requestDisallowInterceptTouchEvent(true);
        recyclerView.setOnTouchListener(new IDTListenerS87S0200000_1(recyclerView, new GestureDetector(recyclerView.getContext(), new SJC() { // from class: X.42r
            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent e) {
                InputView inputView;
                o.LJIIIZ(e, "e");
                if (C117294iz.LIZ() && (inputView = BaseChatPanel.this.LLILLL) != null) {
                    inputView.LJIILJJIL();
                }
                return onSingleTapConfirmed(e);
            }
        }), 1));
        final Context context2 = recyclerView.getContext();
        recyclerView.LJIIJJI(new C73379Sr1(context2) { // from class: X.3lq
            public boolean LJLILLLLZI;

            @Override // X.C73379Sr1, X.C0A6
            public final void LJIILJJIL(int i3, RecyclerView recyclerView2) {
                InputView inputView;
                o.LJIIIZ(recyclerView2, "recyclerView");
                super.LJIILJJIL(i3, recyclerView2);
                if (i3 == 1 && (inputView = BaseChatPanel.this.LLILLL) != null) {
                    inputView.LJIILJJIL();
                }
                if (this.LJLILLLLZI) {
                    C85243We.LIZ(recyclerView2, i3, BaseChatPanel.this.LLJILJIL);
                }
                BaseChatPanel.this.getClass();
            }

            @Override // X.C73379Sr1, X.C0A6
            public final void LJIILL(RecyclerView recyclerView2, int i3, int i4) {
                boolean z2;
                o.LJIIIZ(recyclerView2, "recyclerView");
                super.LJIILL(recyclerView2, i3, i4);
                if (i4 < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LJLILLLLZI = z2;
            }
        });
        C40443Fu3.LIZ("message_list").LJIIIIZZ(recyclerView);
        if (this.LJLJJLL.LJLJLJ) {
            Object value = this.LLFFF.getValue();
            o.LJIIIIZZ(value, "<get-sayHelloPanel>(...)");
            ((View) value).setOnTouchListener(new View.OnTouchListener() { // from class: X.41z
                public final int LJLIL;
                public float LJLILLLLZI;
                public float LJLJI;
                public boolean LJLJJI;

                {
                    this.LJLIL = ViewConfiguration.get(BaseChatPanel.this.LJLJL).getScaledTouchSlop();
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    Integer num;
                    if (motionEvent != null) {
                        num = Integer.valueOf(motionEvent.getActionMasked());
                    } else {
                        num = null;
                    }
                    if (num == null) {
                        return false;
                    }
                    if (num.intValue() == 0) {
                        this.LJLILLLLZI = motionEvent.getX();
                        this.LJLJI = motionEvent.getY();
                        this.LJLJJI = false;
                        return true;
                    }
                    if (num.intValue() != 2) {
                        return false;
                    }
                    if (!this.LJLJJI && (Math.abs(motionEvent.getX() - this.LJLILLLLZI) >= this.LJLIL || Math.abs(motionEvent.getY() - this.LJLJI) >= this.LJLIL)) {
                        this.LJLJJI = true;
                        InputView inputView = BaseChatPanel.this.LLILLL;
                        if (inputView == null) {
                            return false;
                        }
                        inputView.LJIILJJIL();
                        return false;
                    }
                    return true;
                }
            });
        }
        if (this.LJLJJLL.LJLL || this.LJLJJI.getScrollToMsgId() != null) {
            C42C c42c = new C42C(this.LJLJI, recyclerView, LJFF, LIZ2, this.LJLJJI, this.LJLJJI.getConversationId());
            this.LLJJI = c42c;
            if (this.LJLJJLL.LJLL) {
                c42c.LIZ();
            }
        } else {
            this.LLJJI = null;
        }
        this.LJLJLJ.getLifecycle().addObserver(LIZ2);
        FakeMessageViewModel fakeMessageViewModel = (FakeMessageViewModel) LIZIZ2.getValue();
        if (fakeMessageViewModel != null) {
            this.LJLJLJ.getLifecycle().addObserver(fakeMessageViewModel);
        }
        ActionBarComponent actionBarComponent = (ActionBarComponent) this.LJZL.getValue();
        if (actionBarComponent != null) {
            getLifecycle().addObserver(actionBarComponent);
        }
        TakoVideoScrollComponent takoVideoScrollComponent = (TakoVideoScrollComponent) this.LL.getValue();
        if (takoVideoScrollComponent != null) {
            getLifecycle().addObserver(takoVideoScrollComponent);
        }
        TakoBingScrollComponent takoBingScrollComponent = (TakoBingScrollComponent) this.LLD.getValue();
        if (takoBingScrollComponent != null) {
            getLifecycle().addObserver(takoBingScrollComponent);
        }
        ChatPageNudgeViewModel chatPageNudgeViewModel = (ChatPageNudgeViewModel) this.LLF.getValue();
        if (chatPageNudgeViewModel != null) {
            getLifecycle().addObserver(chatPageNudgeViewModel);
        }
        if (SuggestedReplyExperiment.LIZJ() && (LJII = LJII()) != null) {
            AnonymousClass442 anonymousClass442 = new AnonymousClass442(this.LLIIIILZ, new C43C(LJII), new C1030242o(LJII));
            anonymousClass442.LJLJJI = new C42U(LJFF);
            anonymousClass442.LJLJJL = new C42V(LJII);
            LJFF.LJLLLLLL(anonymousClass442);
        }
        this.LLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 315));
    }
}
