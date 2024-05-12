package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment;

import X.AKT;
import X.ASQ;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C00F;
import X.C100723xM;
import X.C101043xs;
import X.C1046648w;
import X.C107794Kx;
import X.C10A;
import X.C110594Vr;
import X.C118274kZ;
import X.C141335gf;
import X.C16880lQ;
import X.C1E4;
import X.C208158Ex;
import X.C221108m2;
import X.C29S;
import X.C2L4;
import X.C31Q;
import X.C3C5;
import X.C3Y4;
import X.C4IC;
import X.C4ID;
import X.C4LO;
import X.C4LW;
import X.C55230Lly;
import X.C61410O8g;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C76965UIn;
import X.C772831o;
import X.C79045V0n;
import X.C84763XOl;
import X.C85323Wm;
import X.C8VV;
import X.C90903hW;
import X.C92993kt;
import X.C98023t0;
import X.C98313tT;
import X.C99033ud;
import X.C99393vD;
import X.C99403vE;
import X.C99413vF;
import X.C99513vP;
import X.C99603vY;
import X.C99843vw;
import X.EnumC99383vC;
import X.IWF;
import X.InterfaceC1032343j;
import X.InterfaceC1032943p;
import X.InterfaceC118454kr;
import X.InterfaceC25830ABu;
import X.InterfaceC45040Hm0;
import X.InterfaceC74236TBo;
import X.O6R;
import X.QD3;
import X.RunnableC99373vB;
import X.TBV;
import X.XKX;
import Y.ACListenerS36S0200000_1;
import Y.AObserverS69S0100000_1;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS20S0200000_1;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar.QuickChatTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.BackPressedProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatProtocol;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public abstract class BaseQuickChatRoomFragment extends BaseFragment implements InterfaceC25830ABu, InterfaceC1032343j, InterfaceC45040Hm0, InterfaceC118454kr, C2L4 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLD;
    public static final boolean LLF;
    public View LJLIL;
    public ChatRoomAlphaVideoComponent LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public QuickChatTitleBarComponent LJLJJL;
    public BaseChatPanel LJLJJLL;
    public AnalysisActivityComponent LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C98313tT LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public ValueAnimator LJZI;
    public boolean LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();

    static {
        TBV tbv = new TBV(BaseQuickChatRoomFragment.class, "activitySoftInputMode", "getActivitySoftInputMode()I", 0);
        C65352Pkq.LIZ.getClass();
        LLD = new InterfaceC74236TBo[]{tbv};
        LLF = C110594Vr.LIZ();
    }

    public abstract BaseQuickChatRoomViewModel Al();

    public abstract C99033ud Dl();

    public abstract void Hl(long j);

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
    }

    public abstract void Il();

    @Override // X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void vl() {
        ASQ.LJIIL(this, false);
        Al().LJLILLLLZI.setValue(Boolean.TRUE);
        if (Build.VERSION.SDK_INT >= 23) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null && AnonymousClass636.LJIILJJIL(LJIIIIZZ)) {
                return;
            }
            View view = this.LJLIL;
            if (view != null) {
                int systemUiVisibility = view.getSystemUiVisibility();
                View view2 = this.LJLIL;
                if (view2 != null) {
                    view2.setSystemUiVisibility(systemUiVisibility | FileUtils.BUFFER_SIZE);
                    return;
                } else {
                    o.LJIJI("rootView");
                    throw null;
                }
            }
            o.LJIJI("rootView");
            throw null;
        }
    }

    public abstract BaseChatPanel wl(View view);

    public abstract C4ID xl();

    public BaseQuickChatRoomFragment() {
        C100723xM.LIZLLL();
        this.LJLJI = C221108m2.LIZIZ(C99403vE.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 105));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 107));
        this.LJLL = C221108m2.LIZIZ(C99413vF.INSTANCE);
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 112));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 110));
        this.LJLLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 111));
        this.LJLLL = C221108m2.LIZIZ(new C4LW(this));
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 109));
        this.LJLLLLLL = new C98313tT(0);
        this.LJLZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 108));
        this.LJZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 106));
    }

    public final RunnableC99373vB Gl() {
        return (RunnableC99373vB) this.LJLLI.getValue();
    }

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        InputView inputView;
        if (LLF) {
            List LJIJ = C62814Ol0.LJIJ(C55230Lly.LIZJ(this, null), BackPressedProtocol.class);
            if (LJIJ == null) {
                return false;
            }
            Iterator it = ((ArrayList) LJIJ).iterator();
            while (true) {
                boolean z = false;
                while (it.hasNext()) {
                    if (((BackPressedProtocol) it.next()).LJJLIIIJLLLLLLLZ() || z) {
                        z = true;
                    }
                }
                return z;
            }
        }
        BaseChatPanel baseChatPanel = this.LJLJJLL;
        if (baseChatPanel == null || (inputView = baseChatPanel.LLILLL) == null || !inputView.AQ()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC118454kr
    public final int findFirstVisibleItemPositionInScreen() {
        BaseChatPanel baseChatPanel = this.LJLJJLL;
        if (baseChatPanel != null) {
            return baseChatPanel.LLILL.LLJJJJLIIL();
        }
        return Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC118454kr
    public final int findLastVisibleItemPositionInScreen() {
        BaseChatPanel baseChatPanel = this.LJLJJLL;
        if (baseChatPanel != null) {
            return baseChatPanel.LLILL.LLJJL();
        }
        return LiveLayoutPreloadThreadPriority.DEFAULT;
    }

    @Override // X.InterfaceC1032343j
    public final C1046648w getActionBarDisplayManager() {
        return (C1046648w) this.LJLJJI.getValue();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(ChatRoomScope.class);
    }

    @Override // X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        String str;
        C99033ud Dl = Dl();
        if (Dl != null && Dl.isSingleChat()) {
            str = "private";
        } else {
            C99033ud Dl2 = Dl();
            if (Dl2 != null && Dl2.isGroupChat()) {
                str = "group";
            } else {
                str = null;
            }
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("chat");
        analysis.setCategory(str);
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(…t\").setCategory(category)");
        return analysis;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C3Y4.LIZJ = "";
        ((ConcurrentHashMap) C3Y4.LIZIZ).clear();
        this.LJLJL = null;
        if (this.LJLJLLL) {
            ((Handler) this.LJLL.getValue()).removeCallbacks(Gl());
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        InputView inputView;
        super.onDestroyView();
        BaseChatPanel baseChatPanel = this.LJLJJLL;
        if (baseChatPanel != null && (inputView = baseChatPanel.LLILLL) != null) {
            inputView.LJIILJJIL();
        }
        ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent = this.LJLILLLLZI;
        if (chatRoomAlphaVideoComponent != null) {
            getLifecycle().removeObserver(chatRoomAlphaVideoComponent);
        }
        BaseChatPanel baseChatPanel2 = this.LJLJJLL;
        if (baseChatPanel2 != null) {
            getLifecycle().removeObserver(baseChatPanel2);
            if (C16880lQ.LLJJIJIL(getLifecycle().getCurrentState(), Lifecycle.State.DESTROYED) > 0) {
                baseChatPanel2.onDestroy();
            }
        }
        QuickChatTitleBarComponent quickChatTitleBarComponent = this.LJLJJL;
        if (quickChatTitleBarComponent != null) {
            getLifecycle().removeObserver(quickChatTitleBarComponent);
        }
        C99603vY c99603vY = (C99603vY) this.LJLLLL.getValue();
        Object listener = this.LJLZ.getValue();
        c99603vY.getClass();
        o.LJIIIZ(listener, "listener");
        c99603vY.LJ.remove(listener);
        C4ID quickChatEventParams = xl();
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(quickChatEventParams, "quickChatEventParams");
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("chat_panel_close", C4IC.LIZ(quickChatEventParams));
        if (this.LJZL) {
            IWF.LJJLIIIIJ().LIZIZ();
        }
        C31Q.LJIIJ(C31Q.LJIILLIIL, "BaseQuickChatRoomFragment", 0);
        EventBus.LIZJ().LJIJ(this);
        this.LJLLLLLL.stop();
        C98313tT c98313tT = this.LJLLLLLL;
        Hl(c98313tT.LIZJ - c98313tT.LIZIZ);
        C92993kt.LIZIZ(getContext());
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AnalysisActivityComponent analysisActivityComponent = this.LJLJL;
        if (analysisActivityComponent != null) {
            analysisActivityComponent.onPause();
        }
        C99603vY c99603vY = (C99603vY) this.LJLLLL.getValue();
        c99603vY.LIZJ.getViewTreeObserver().removeOnGlobalLayoutListener(c99603vY.LJFF);
        c99603vY.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C99603vY c99603vY = (C99603vY) this.LJLLLL.getValue();
        View findViewById = c99603vY.LIZ.findViewById(R.id.content);
        if (findViewById != null) {
            findViewById.post(new ARunnableS20S0200000_1(c99603vY, findViewById, 60));
        }
        AnalysisActivityComponent analysisActivityComponent = this.LJLJL;
        if (analysisActivityComponent != null) {
            analysisActivityComponent.LJLIL = System.currentTimeMillis();
        }
        if (this.LJLJLLL) {
            ((Handler) this.LJLL.getValue()).post(Gl());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        new C99513vP(requireContext, Dl()).LIZ();
    }

    @Override // X.InterfaceC118454kr
    public final void addOnPanelChangeListener(InterfaceC1032943p interfaceC1032943p) {
        BaseChatPanel baseChatPanel = this.LJLJJLL;
        if (baseChatPanel != null) {
            ((ArrayList) baseChatPanel.LLIZLLLIL).add(interfaceC1032943p);
        }
    }

    @Override // X.InterfaceC118454kr
    public final void onAnimatedEmojiCheckCompleted(boolean z) {
        if (!this.LJLJLLL) {
            return;
        }
        Gl().LJLJI = true;
        Gl().LJLILLLLZI = z;
        ((Handler) this.LJLL.getValue()).post(Gl());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJL = new AnalysisActivityComponent(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C107794Kx event) {
        String str;
        int dimensionPixelOffset;
        C99033ud Dl;
        boolean LJ;
        String str2;
        IMConversation iMConversation;
        o.LJIIIZ(event, "event");
        Context context = getContext();
        if (context != null) {
            str = C1E4.LJIJI(context, event);
        } else {
            str = "";
        }
        BaseChatPanel baseChatPanel = this.LJLJJLL;
        ACListenerS36S0200000_1 aCListenerS36S0200000_1 = null;
        if (baseChatPanel != null) {
            InputView inputView = baseChatPanel.LLILLL;
            if (inputView != null) {
                ViewGroup viewGroup = inputView.LLFFF;
                if (viewGroup != null) {
                    dimensionPixelOffset = viewGroup.getHeight();
                } else {
                    o.LJIJI("inputRootLayout");
                    throw null;
                }
            } else {
                dimensionPixelOffset = baseChatPanel.LJLJI.getResources().getDimensionPixelOffset(com.zhiliaoapp.musically.R.dimen.ta);
            }
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.zhiliaoapp.musically.R.dimen.ta);
        }
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        int LIZIZ = C61410O8g.LIZIZ(requireContext) + dimensionPixelOffset;
        AKT akt = new AKT(this);
        akt.LJI(str);
        akt.LJ(com.zhiliaoapp.musically.R.style.ux);
        akt.LIZJ(3000L);
        C208158Ex c208158Ex = akt.LIZ;
        c208158Ex.LJLJL = LIZIZ;
        View view = this.LJLIL;
        if (view != null) {
            c208158Ex.LJLJLLL = view;
            if (!event.LJLJI && (Dl = Dl()) != null) {
                if (Dl.isGroupChat()) {
                    IMContact iMContact = event.LJLIL;
                    if ((iMContact instanceof IMConversation) && (iMConversation = (IMConversation) iMContact) != null) {
                        str2 = iMConversation.getConversationId();
                    } else {
                        str2 = null;
                    }
                    LJ = o.LJ(str2, Dl.getConversationId());
                } else {
                    IMContact iMContact2 = event.LJLIL;
                    if (!(iMContact2 instanceof IMUser)) {
                        iMContact2 = null;
                    }
                    LJ = o.LJ(iMContact2, Dl.getSingleChatFromUser());
                }
                if (LJ) {
                    akt.LIZ.LJLJJI = 3;
                    akt.LJII();
                    return;
                }
            }
            Context context2 = getContext();
            if (context2 != null) {
                aCListenerS36S0200000_1 = new ACListenerS36S0200000_1(context2, event, 20);
            }
            C208158Ex c208158Ex2 = akt.LIZ;
            c208158Ex2.LJLJLJ = aCListenerS36S0200000_1;
            c208158Ex2.LJLJJI = 0;
            akt.LJII();
            return;
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // X.InterfaceC118454kr
    public final void setUpAnimatedEmojiCheck(C118274kZ c118274kZ) {
        BaseChatPanel baseChatPanel = this.LJLJJLL;
        if (baseChatPanel != null) {
            baseChatPanel.LLIIIILZ.LJIIJJI(c118274kZ);
            baseChatPanel.LLJILJIL.LJLLLLLL(c118274kZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C99033ud Dl = Dl();
        if (LLF) {
            C4LO c4lo = (C4LO) this.LJZ.getValue();
            if (c4lo != null) {
                C8VV.LIZ(c4lo.LIZ, false, new AqS167S0100000_1(c4lo, 537));
            }
        } else {
            this.LJLJJLL = wl(view);
            C101043xs titleBar = (C101043xs) view.findViewById(com.zhiliaoapp.musically.R.id.b_5);
            o.LJIIIIZZ(titleBar, "titleBar");
            titleBar.setVisibility(0);
            C99033ud Dl2 = Dl();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            this.LJLJJL = new QuickChatTitleBarComponent(viewLifecycleOwner, titleBar, Al(), Dl2, this);
        }
        C92993kt.LIZ(getContext());
        Il();
        Al().LJLJJL.observe(this, new AObserverS69S0100000_1(this, 74));
        Al().LJLJL.observe(this, new AObserverS77S0100000_9(this, 54));
        Al().LJLJLLL.observe(this, new AObserverS69S0100000_1(this, 75));
        if (Dl == null) {
            return;
        }
        View view2 = this.LJLIL;
        if (view2 != null) {
            ViewStub alphaVideoViewStub = (ViewStub) view2.findViewById(com.zhiliaoapp.musically.R.id.eds);
            if (Dl.isSingleChat()) {
                str = "private";
            } else if (Dl.isGroupChat()) {
                str = "group";
            } else {
                str = "";
            }
            o.LJIIIIZZ(alphaVideoViewStub, "alphaVideoViewStub");
            ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent = new ChatRoomAlphaVideoComponent(this, alphaVideoViewStub, Dl.getConversationId(), Dl.getEnterFromForMob());
            this.LJLILLLLZI = chatRoomAlphaVideoComponent;
            chatRoomAlphaVideoComponent.LJLLL = str;
            getLifecycle().addObserver(chatRoomAlphaVideoComponent);
            BaseChatPanel baseChatPanel = this.LJLJJLL;
            if (baseChatPanel != null) {
                getLifecycle().addObserver(baseChatPanel);
            }
            QuickChatTitleBarComponent quickChatTitleBarComponent = this.LJLJJL;
            if (quickChatTitleBarComponent != null) {
                getLifecycle().addObserver(quickChatTitleBarComponent);
            }
            BaseChatPanel baseChatPanel2 = this.LJLJJLL;
            if (baseChatPanel2 != null) {
                C99843vw c99843vw = baseChatPanel2.LLJILJILJ.LJLLILLLL;
                int LJII = c99843vw.LJLIL.LJII();
                if (c99843vw.LJLILLLLZI != 1) {
                    c99843vw.LJLJI = c99843vw.LJLIL.LJII();
                    c99843vw.LJLIL.LIZIZ(LJII);
                    c99843vw.LJLILLLLZI = 1;
                    c99843vw.LJLIL.LJFF();
                }
            }
            C99603vY c99603vY = (C99603vY) this.LJLLLL.getValue();
            Object listener = this.LJLZ.getValue();
            c99603vY.getClass();
            o.LJIIIZ(listener, "listener");
            c99603vY.LJ.add(listener);
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            Integer LJI = C79045V0n.LJI(((Number) this.LJLJI.getValue()).intValue(), requireContext);
            if (LJI != null) {
                view.setBackgroundColor(LJI.intValue());
            }
            this.LJLJLLL = Dl.getShowKeyBoardByDefault();
            return;
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (LLF) {
            List LJIJ = C62814Ol0.LJIJ(C55230Lly.LIZJ(this, null), GroupChatProtocol.class);
            if (LJIJ != null) {
                Iterator it = LJIJ.iterator();
                while (it.hasNext()) {
                    ((GroupChatProtocol) it.next()).onActivityResult(i, i2, intent);
                }
                return;
            }
            return;
        }
        BaseChatPanel baseChatPanel = this.LJLJJLL;
        if (baseChatPanel != null) {
            baseChatPanel.LJIIIZ(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        EnumC99383vC enumC99383vC;
        o.LJIIIZ(inflater, "inflater");
        LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
        if (LLF) {
            i = com.zhiliaoapp.musically.R.layout.b21;
        } else {
            i = com.zhiliaoapp.musically.R.layout.b20;
        }
        int i2 = 0;
        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, i, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "from(context)\n          …tRes(), container, false)");
        this.LJLIL = LLLLIILL;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_expand_to_fullscreen", false);
        } else {
            z = false;
        }
        C29S c29s = null;
        if (z) {
            View view = this.LJLIL;
            if (view != null) {
                view.setPadding(view.getPaddingLeft(), ((Number) this.LJLLJ.getValue()).intValue(), view.getPaddingRight(), view.getPaddingBottom());
                vl();
            } else {
                o.LJIJI("rootView");
                throw null;
            }
        } else {
            View view2 = this.LJLIL;
            if (view2 != null) {
                if (C00F.LIZ(31744, 0, "tt_im_chat_quick_interaction", true) == 2) {
                    enumC99383vC = EnumC99383vC.NINETY;
                } else {
                    enumC99383vC = EnumC99383vC.NONE;
                }
                if (C99393vD.LIZ[enumC99383vC.ordinal()] == 1) {
                    i2 = O6R.LJJIIJZLJL(enumC99383vC.getRatio() * ((Number) this.LJLLILLLL.getValue()).intValue());
                }
                view2.getLayoutParams().height = i2;
            } else {
                o.LJIJI("rootView");
                throw null;
            }
        }
        this.LJLLLLLL.start();
        C4ID quickChatEventParams = xl();
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(quickChatEventParams, "quickChatEventParams");
        o.LJIIIZ(onEventV3, "onEventV3");
        C3Y4.LJ("enter_from", quickChatEventParams.LIZ);
        C3Y4.LJ("enter_method", "chat_panel");
        onEventV3.LIZIZ("chat_panel_show", C4IC.LIZ(quickChatEventParams));
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C98023t0(this, null), 3);
        if (IWF.LJJLIIIIJ().isPlaying()) {
            IWF.LJJLIIIIJ().LJIILJJIL();
            this.LJZL = true;
        }
        C31Q.LJIIJ(C31Q.LJIILLIIL, "BaseQuickChatRoomFragment", 1);
        EventBus.LIZJ().LJIILJJIL(this);
        View view3 = this.LJLIL;
        if (view3 != null) {
            try {
                ViewTreeLifecycleOwner.set(view3, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view3, this);
                C10A.LIZIZ(view3, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            return view3;
        }
        o.LJIJI("rootView");
        throw null;
    }
}
