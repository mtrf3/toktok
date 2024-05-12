package com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage;

import X.ASL;
import X.AbstractC029409q;
import X.AbstractC030309z;
import X.ActivityC45651qj;
import X.C100723xM;
import X.C101043xs;
import X.C1046648w;
import X.C107064Ic;
import X.C107454Jp;
import X.C107954Ln;
import X.C107994Lr;
import X.C108054Lx;
import X.C10A;
import X.C110594Vr;
import X.C111074Xn;
import X.C118274kZ;
import X.C141335gf;
import X.C16300kU;
import X.C16880lQ;
import X.C16970lZ;
import X.C17N;
import X.C1DH;
import X.C1GE;
import X.C1HQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C2L4;
import X.C32151Nz;
import X.C34B;
import X.C3C5;
import X.C3EU;
import X.C3UE;
import X.C3UX;
import X.C3Y4;
import X.C40443Fu3;
import X.C46B;
import X.C47261Igj;
import X.C48841JEv;
import X.C49R;
import X.C4DR;
import X.C4LO;
import X.C4LS;
import X.C4Z2;
import X.C53946LFe;
import X.C55230Lly;
import X.C5H3;
import X.C61712OJw;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C76732zl;
import X.C76800UCe;
import X.C76965UIn;
import X.C772831o;
import X.C78555UsJ;
import X.C78613UtF;
import X.C79045V0n;
import X.C7MY;
import X.C80533Eb;
import X.C84503Ti;
import X.C84523Tk;
import X.C84683Ua;
import X.C85323Wm;
import X.C89163ei;
import X.C8VV;
import X.C90193gN;
import X.C90903hW;
import X.C92993kt;
import X.C93843mG;
import X.C96423qQ;
import X.C96963rI;
import X.C97273rn;
import X.C97293rp;
import X.C98523to;
import X.C98563ts;
import X.C98593tv;
import X.C98743uA;
import X.C99003ua;
import X.C99033ud;
import X.C99043ue;
import X.C99073uh;
import X.C99083ui;
import X.C99093uj;
import X.C99103uk;
import X.C99113ul;
import X.C99133un;
import X.C99143uo;
import X.C99153up;
import X.C99163uq;
import X.C99213uv;
import X.C99253uz;
import X.C99513vP;
import X.EnumC100693xJ;
import X.InterfaceC1032343j;
import X.InterfaceC1032943p;
import X.InterfaceC118454kr;
import X.InterfaceC45040Hm0;
import X.InterfaceC55057LjB;
import X.InterfaceC55235Lm3;
import X.InterfaceC98153tD;
import X.InterfaceC99183us;
import X.O6R;
import X.QCU;
import X.X1D;
import X.XKX;
import Y.ARunnableS20S0200000_1;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS4S0201000_1;
import Y.ARunnableS5S0101000_1;
import Y.AUListenerS90S0100000_1;
import Y.IDCListenerS162S0200000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.forest.Forest;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.arg.RouteArgInjector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMNaviAnalyticsImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.component.TakoTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.BackPressedProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatBackgroundColorProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import defpackage.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class BaseChatRoomFragment extends BaseFragment implements InterfaceC45040Hm0, InterfaceC118454kr, InterfaceC1032343j, C2L4 {
    public static final C98743uA Companion = new C98743uA();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 actionBarShowManager$delegate;
    public Integer activitySoftInputMode;
    public ChatRoomAlphaVideoComponent alphaVideoComponent;
    public final C5H3 backgroundColor$delegate;
    public BaseChatPanel baseChatPanel;
    public final C5H3 bgGray$delegate;
    public final C5H3 bgLightToGrayAnimator$delegate;
    public final C5H3 bgWhite$delegate;
    public final C5H3 chatRoomAssembler$delegate;
    public C99043ue chatRoomConfig;
    public final C5H3 fpsMonitor$delegate;
    public final Handler handler;
    public boolean hasPause;
    public long pageStartTime;
    public View rootView;
    public View separateLine;
    public C99033ud sessionInfo;
    public AnalysisActivityComponent stayTimeComponent;
    public C101043xs titleBar;
    public InterfaceC99183us titleBarComponent;
    public final ValueAnimator.AnimatorUpdateListener valueAnimUpdateListener;

    public static final boolean start(C98593tv c98593tv) {
        Companion.getClass();
        return C98743uA.LIZ(c98593tv);
    }

    public static final boolean start$im_base_release(Context context, C99003ua c99003ua) {
        Companion.getClass();
        return C98743uA.LIZIZ(context, c99003ua);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract C98593tv getChatParams();

    public abstract C99003ua getTakoParams();

    public boolean isBookMode() {
        return false;
    }

    @Override // X.InterfaceC118454kr
    public void onAnimatedEmojiCheckCompleted(boolean z) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public BaseChatRoomFragment() {
        C40443Fu3.LIZ("enter_chat_fps").start();
        C100723xM.LIZLLL();
        C99043ue c99043ue = new C99043ue();
        this.chatRoomConfig = new C99043ue(c99043ue.LJLIL, c99043ue.LJLILLLLZI, c99043ue.LJLJI, c99043ue.LJLJJI, c99043ue.LJLJJL, c99043ue.LJLJJLL, c99043ue.LJLJL, c99043ue.LJLJLJ, c99043ue.LJLJLLL, c99043ue.LJLL, c99043ue.LJLLI, c99043ue.LJLLILLLL, c99043ue.LJLLJ, c99043ue.LJLLL, c99043ue.LJLLLL, c99043ue.LJLLLLLL, c99043ue.LJLZ, c99043ue.LJZ, c99043ue.LJZI, c99043ue.LJZL, c99043ue.LL, c99043ue.LLD, c99043ue.LLF, !C4LS.LIZ());
        this.actionBarShowManager$delegate = C221108m2.LIZIZ(new AqS151S0100000_1(this, 444));
        this.backgroundColor$delegate = C221108m2.LIZIZ(C99073uh.LJLIL);
        this.fpsMonitor$delegate = C221108m2.LIZIZ(C99103uk.LJLIL);
        this.chatRoomAssembler$delegate = C221108m2.LIZIZ(new AqS151S0100000_1(this, 448));
        this.bgWhite$delegate = C221108m2.LIZIZ(new AqS151S0100000_1(this, 447));
        this.bgGray$delegate = C221108m2.LIZIZ(new AqS151S0100000_1(this, 445));
        this.bgLightToGrayAnimator$delegate = C221108m2.LIZIZ(new AqS151S0100000_1(this, 446));
        this.valueAnimUpdateListener = new AUListenerS90S0100000_1(this, 14);
        this.handler = new Handler(C16880lQ.LLJJJJ());
    }

    private final C1046648w getActionBarShowManager() {
        return (C1046648w) this.actionBarShowManager$delegate.getValue();
    }

    private final C4LO getChatRoomAssembler() {
        return (C4LO) this.chatRoomAssembler$delegate.getValue();
    }

    private final int getLayoutRes() {
        if (this.chatRoomConfig.LLF) {
            return R.layout.b1o;
        }
        if (isAssemEnabled()) {
            return R.layout.b1n;
        }
        return R.layout.b1m;
    }

    public final Integer fetchInputViewHeight() {
        int dimensionPixelOffset;
        BaseChatPanel baseChatPanel = this.baseChatPanel;
        if (baseChatPanel == null) {
            return null;
        }
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
            dimensionPixelOffset = baseChatPanel.LJLJI.getResources().getDimensionPixelOffset(R.dimen.ta);
        }
        return Integer.valueOf(dimensionPixelOffset);
    }

    @Override // X.InterfaceC45040Hm0
    public Analysis getAnalysis() {
        String str;
        C99033ud c99033ud = this.sessionInfo;
        if (c99033ud != null && c99033ud.isSingleChat()) {
            str = "private";
        } else {
            C99033ud c99033ud2 = this.sessionInfo;
            if (c99033ud2 != null && c99033ud2.isGroupChat()) {
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

    public final int getBackgroundColor() {
        return ((Number) this.backgroundColor$delegate.getValue()).intValue();
    }

    public final Integer getBgGray() {
        return (Integer) this.bgGray$delegate.getValue();
    }

    public final ValueAnimator getBgLightToGrayAnimator() {
        return (ValueAnimator) this.bgLightToGrayAnimator$delegate.getValue();
    }

    public final Integer getBgWhite() {
        return (Integer) this.bgWhite$delegate.getValue();
    }

    public final InterfaceC55057LjB getFpsMonitor() {
        return (InterfaceC55057LjB) this.fpsMonitor$delegate.getValue();
    }

    public final View getRootView() {
        View view = this.rootView;
        if (view != null) {
            return view;
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // X.C2L4
    public List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(ChatRoomScope.class);
    }

    private final void cleanMessageViewCache() {
        C16970lZ.LJII(R.layout.b7e);
        C16970lZ.LJII(R.layout.b6v);
        C99033ud c99033ud = this.sessionInfo;
        if (c99033ud == null) {
            return;
        }
        c99033ud.setBookMode(isBookMode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment$initChatPanel$1] */
    private final void initChatPanel() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        final int i;
        String str7;
        C97273rn LIZIZ = C96963rI.LIZIZ();
        C99003ua takoParams = getTakoParams();
        View rootView = getRootView();
        final C99033ud c99033ud = this.sessionInfo;
        int backgroundColor = getBackgroundColor();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        LIZIZ.getClass();
        o.LJIIIZ(rootView, "rootView");
        if (takoParams != null) {
            C96963rI.LIZ().getClass();
            try {
                if (C84523Tk.LIZ()) {
                    C96963rI.LIZIZ().getClass();
                    if (C97273rn.LIZ() || !C1GE.LJIILIIL(takoParams.getAutoSendMsgContent())) {
                        C89163ei.LIZ(takoParams.getAutoWelcomeMsgContent());
                    }
                }
            } catch (Exception e) {
                QCU.LJFF("checkAutoWelcomeMsgWhenEnterChat exception!", e, 4);
            }
            if (C84523Tk.LIZJ()) {
                C96963rI.LIZJ().getClass();
                C84503Ti.LIZ(takoParams, false);
            } else if (o.LJ(SearchServiceImpl.LLLZI().LLLLIL().getEnableDisclaimer(), Boolean.TRUE)) {
                AqS132S0200000_1 aqS132S0200000_1 = new AqS132S0200000_1(c99033ud, takoParams, 35);
                if (mo49getActivity != null) {
                    C62822Ol8 c62822Ol8 = C4DR.LIZ;
                    if (((Number) c62822Ol8.getValue()).intValue() == 1) {
                        final C99253uz c99253uz = (C99253uz) rootView.findViewById(R.id.cae);
                        RecyclerView recyclerView = c99253uz.LJLIL;
                        recyclerView.getContext();
                        final C99083ui c99083ui = new C99083ui(c99253uz);
                        recyclerView.setAdapter(new AbstractC029409q<C93843mG>(c99033ud, c99083ui) { // from class: X.3mH
                            public final C99033ud LJLIL;
                            public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
                            public final List<C93863mI> LJLJI = C47261Igj.LJJIJIIJI(new C93863mI(R.string.cmr, 1, "1.2k"), new C93863mI(R.string.cn2), new C93863mI(R.string.cn3, 2, "1.5k"), new C93863mI(R.string.cn4), new C93863mI(R.string.cn5, 1, "3.5k"), new C93863mI(R.string.cn6, 2, "23k"), new C93863mI(R.string.cn7), new C93863mI(R.string.cn8, 1, "3.1k"), new C93863mI(R.string.cn9), new C93863mI(R.string.cms, 2, "11k"), new C93863mI(R.string.cmt, 2, "1.5k"), new C93863mI(R.string.cmu), new C93863mI(R.string.cmv, 1, "3k"), new C93863mI(R.string.cmw), new C93863mI(R.string.cmx, 2, "2.8k"), new C93863mI(R.string.cmy, 1, "8.7k"), new C93863mI(R.string.cmz), new C93863mI(R.string.cn0, 1, "1.3k"), new C93863mI(R.string.cn1));

                            @Override // X.AbstractC029409q
                            public final int getItemCount() {
                                return Integer.MAX_VALUE;
                            }

                            {
                                this.LJLIL = c99033ud;
                                this.LJLILLLLZI = c99083ui;
                            }

                            @Override // X.AbstractC029409q
                            public final void onBindViewHolder(C93843mG c93843mG, int i2) {
                                String LIZIZ2;
                                C2068389v c2068389v;
                                C93843mG holder = c93843mG;
                                o.LJIIIZ(holder, "holder");
                                List<C93863mI> list = this.LJLJI;
                                C93863mI c93863mI = (C93863mI) ListProtector.get(list, i2 % list.size());
                                int i3 = c93863mI.LIZ;
                                int i4 = c93863mI.LIZIZ;
                                String str8 = c93863mI.LIZJ;
                                holder.LJLJI.setText(C97343ru.LJFF(i3));
                                TuxTextView tuxTextView = holder.LJLJJI;
                                boolean z = true;
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        LIZIZ2 = C97343ru.LJFF(R.string.cnf);
                                    } else {
                                        StringBuilder LJFF = C72972SkS.LJFF(str8, ' ');
                                        LJFF.append(C97343ru.LJFF(R.string.cna));
                                        LIZIZ2 = X1D.LIZIZ(LJFF);
                                    }
                                } else {
                                    StringBuilder LJFF2 = C72972SkS.LJFF(str8, ' ');
                                    LJFF2.append(C97343ru.LJFF(R.string.cmq));
                                    LIZIZ2 = X1D.LIZIZ(LJFF2);
                                }
                                tuxTextView.setText(LIZIZ2);
                                TuxIconView tuxIconView = holder.LJLJJL;
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        c2068389v = new C2068389v();
                                        c2068389v.LIZ = R.raw.icon_fire_3_fill;
                                        c2068389v.LIZLLL = C19N.LIZIZ(holder.itemView, "itemView.context", R.attr.eb);
                                    } else {
                                        c2068389v = new C2068389v();
                                        c2068389v.LIZ = R.raw.icon_arrow_turn_up_right_fill;
                                        c2068389v.LIZLLL = C19N.LIZIZ(holder.itemView, "itemView.context", R.attr.bu);
                                    }
                                } else {
                                    c2068389v = new C2068389v();
                                    c2068389v.LIZ = R.raw.icon_heart_fill;
                                    c2068389v.LIZLLL = C19N.LIZIZ(holder.itemView, "itemView.context", R.attr.eb);
                                }
                                tuxIconView.setTuxIcon(c2068389v);
                                ConstraintLayout constraintLayout = holder.LJLILLLLZI;
                                Context context = holder.itemView.getContext();
                                o.LJIIIIZZ(context, "itemView.context");
                                Integer LJ = C79045V0n.LJ(R.attr.bpu, context);
                                if (LJ == null || LJ.intValue() != 0) {
                                    z = false;
                                }
                                constraintLayout.setSelected(z);
                            }

                            @Override // X.AbstractC029409q
                            /* renamed from: onCreateViewHolder */
                            public final C93843mG com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i2) {
                                View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.b6f, viewGroup, false);
                                o.LJIIIIZZ(view, "view");
                                C93843mG c93843mG = new C93843mG(view, this.LJLIL, this.LJLILLLLZI);
                                C0AX.LIZ(viewGroup, c93843mG.itemView, R.id.lj7);
                                View view2 = c93843mG.itemView;
                                if (view2 != null) {
                                    view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
                                }
                                try {
                                    if (c93843mG.itemView.getParent() != null) {
                                        boolean z = true;
                                        try {
                                            SettingsManager.LIZLLL().getClass();
                                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                                        } catch (Exception unused) {
                                        }
                                        if (z) {
                                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                            stringBuffer.append(C93843mG.class.getName());
                                            stringBuffer.append(" parent ");
                                            stringBuffer.append(viewGroup.getClass().getName());
                                            stringBuffer.append(" viewType ");
                                            stringBuffer.append(i2);
                                            C78983UzD.LJIILL(stringBuffer.toString());
                                            ViewGroup viewGroup2 = (ViewGroup) c93843mG.itemView.getParent();
                                            if (viewGroup2 != null) {
                                                C16880lQ.LJLLL(c93843mG.itemView, viewGroup2);
                                            }
                                        }
                                    }
                                } catch (Exception e2) {
                                    C78946Uyc.LIZIZ(e2);
                                    C36922EeM.LIZ(e2);
                                }
                                C29127Bbv.LIZ = C93843mG.class.getName();
                                return c93843mG;
                            }
                        });
                        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, 0));
                        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: X.3ur
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                return true;
                            }
                        });
                        recyclerView.LJII(new AbstractC030309z() { // from class: X.3vS
                            @Override // X.AbstractC030309z
                            public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
                                C1BZ c1bz;
                                o.LJIIIZ(outRect, "outRect");
                                o.LJIIIZ(view, "view");
                                o.LJIIIZ(parent, "parent");
                                o.LJIIIZ(state, "state");
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                if ((layoutParams instanceof C1BZ) && (c1bz = (C1BZ) layoutParams) != null) {
                                    int LIZ = c1bz.LIZ();
                                    if (LIZ == 0 || LIZ == 1) {
                                        outRect.bottom = C7MY.LIZIZ(12);
                                    }
                                    outRect.right = C7MY.LIZIZ(12);
                                }
                            }
                        }, -1);
                        final ValueAnimator ofInt = ValueAnimator.ofInt(0, C7MY.LIZIZ(200));
                        ofInt.setRepeatCount(-1);
                        ofInt.setRepeatMode(1);
                        ofInt.setDuration(10000L);
                        ofInt.setInterpolator(new LinearInterpolator());
                        final C76732zl c76732zl = new C76732zl();
                        if (C90193gN.LIZ()) {
                            i = -1;
                        } else {
                            i = 1;
                        }
                        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3ug
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator it) {
                                o.LJIIIZ(it, "it");
                                int i2 = C76732zl.this.element;
                                Object animatedValue = ofInt.getAnimatedValue();
                                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                if (i2 != ((Integer) animatedValue).intValue()) {
                                    c99253uz.LJLIL.scrollBy(i, 0);
                                    C76732zl c76732zl2 = C76732zl.this;
                                    Object animatedValue2 = ofInt.getAnimatedValue();
                                    o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                                    c76732zl2.element = ((Integer) animatedValue2).intValue();
                                }
                            }
                        });
                        recyclerView.post(new ARunnableS37S0100000_1(ofInt, 64));
                        c99253uz.LJLILLLLZI = ofInt;
                        C17N.LJJLIIIJJI(c99253uz);
                        c99253uz.setOnConfirm(aqS132S0200000_1);
                    } else {
                        C97293rp c97293rp = new C97293rp(mo49getActivity, null, 0);
                        c97293rp.setOnConfirm(new AqS132S0200000_1(c97293rp, aqS132S0200000_1, 36));
                        ASL asl = new ASL();
                        C235119Kp c235119Kp = new C235119Kp();
                        C234529Ii LIZJ = s1.LIZJ();
                        LIZJ.LIZJ = R.raw.icon_x_mark_small;
                        LIZJ.LIZIZ(new AqS148S0200000_1(c97293rp, aqS132S0200000_1, 20));
                        c235119Kp.LIZIZ(LIZJ);
                        TuxSheet tuxSheet = asl.LIZ;
                        tuxSheet.LJLLL = c235119Kp;
                        tuxSheet.LLD = true;
                        tuxSheet.LL = true;
                        tuxSheet.LJLJI = true;
                        tuxSheet.LJLIL = new IDCListenerS162S0200000_1(c97293rp, aqS132S0200000_1, 0);
                        tuxSheet.LJLLI = c97293rp;
                        asl.LJI(0);
                        TuxSheet tuxSheet2 = asl.LIZ;
                        tuxSheet2.LJZI = false;
                        C1DH.LJJIJIIJIL(0L, new ARunnableS20S0200000_1(mo49getActivity, tuxSheet2, 26));
                    }
                    rootView.post(new ARunnableS4S0201000_1(backgroundColor, rootView, mo49getActivity, 5));
                    rootView.post(new ARunnableS20S0200000_1(rootView, mo49getActivity, 25));
                    if (c99033ud != null) {
                        str = c99033ud.getEnterFromForMob();
                        str2 = c99033ud.getEnterMethod();
                        str3 = c99033ud.getGroupId();
                        str4 = c99033ud.getConversationId();
                        str5 = c99033ud.getSearchId();
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                        str4 = null;
                        str5 = null;
                    }
                    if (((Number) c62822Ol8.getValue()).intValue() == 1) {
                        str6 = "1";
                    } else {
                        str6 = CardStruct.IStatusCode.DEFAULT;
                    }
                    C85323Wm LIZ = C772831o.LIZ();
                    C1HQ LIZ2 = C111074Xn.LIZ(LIZ, "onEventV3", "enter_from", str, "enter_method", str2);
                    LIZ2.put("group_id", str3);
                    LIZ2.put("conversation_id", str4);
                    LIZ2.put("search_id", str5);
                    LIZ2.put("process_id", C3Y4.LIZJ);
                    LIZ2.put("is_fullscreen", str6);
                    LIZ.LIZIZ("tikbot_disclaimer_show", LIZ2);
                }
            } else {
                C96963rI.LIZJ().getClass();
                C84503Ti.LIZ(takoParams, false);
            }
            C78555UsJ.LJJJJ();
        }
        C99033ud c99033ud2 = this.sessionInfo;
        if (c99033ud2 == null) {
            requireActivity().finish();
            return;
        }
        if (this.chatRoomConfig.LJLILLLLZI) {
            C92993kt.LIZ(mo49getActivity());
        }
        if (!isAssemEnabled()) {
            View findViewById = getRootView().findViewById(R.id.b_5);
            o.LJIIIIZZ(findViewById, "rootView.findViewById<Im…>(R.id.chat_title_layout)");
            C101043xs c101043xs = (C101043xs) findViewById;
            this.titleBar = c101043xs;
            C16300kU.LJIILLIIL(c101043xs, null);
        }
        this.separateLine = getRootView().findViewById(R.id.jop);
        ViewStub alphaVideoViewStub = (ViewStub) getRootView().findViewById(R.id.eds);
        View view = this.separateLine;
        if (view != null) {
            view.setVisibility(0);
        }
        if (c99033ud2.getChatType() == 3) {
            C98563ts c98563ts = (C98563ts) c99033ud2;
            GroupChatViewModel LIZ3 = C99213uv.LIZ(this, c98563ts);
            if (!isAssemEnabled()) {
                this.baseChatPanel = new GroupChatPanel(this, getRootView(), c98563ts, LIZ3, false, this.chatRoomConfig);
                C101043xs c101043xs2 = this.titleBar;
                if (c101043xs2 != null) {
                    this.titleBarComponent = new GroupChatTitleBarComponent(LIZ3, this, c101043xs2);
                } else {
                    o.LJIJI("titleBar");
                    throw null;
                }
            }
        } else {
            C98523to c98523to = (C98523to) c99033ud2;
            if (this.chatRoomConfig.LLF) {
                if (!isAssemEnabled()) {
                    this.baseChatPanel = new SingleChatPanel(this, getRootView(), c98523to, false, this.chatRoomConfig);
                    C101043xs c101043xs3 = this.titleBar;
                    if (c101043xs3 != null) {
                        this.titleBarComponent = new TakoTitleBarComponent(this, c101043xs3);
                    } else {
                        o.LJIJI("titleBar");
                        throw null;
                    }
                }
            } else if (!isAssemEnabled()) {
                refreshUser(c98523to);
                this.baseChatPanel = new SingleChatPanel(this, getRootView(), c98523to, false, this.chatRoomConfig);
                C101043xs c101043xs4 = this.titleBar;
                if (c101043xs4 != null) {
                    this.titleBarComponent = new SingleChatTitleBarComponent(c98523to, this, c101043xs4);
                } else {
                    o.LJIJI("titleBar");
                    throw null;
                }
            }
        }
        if (isAssemEnabled()) {
            final InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(this, null);
            final ?? r8 = new ChatBackgroundColorProtocol() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment$initChatPanel$1
                @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatBackgroundColorProtocol
                public final void LLIL() {
                    ValueAnimator bgLightToGrayAnimator = BaseChatRoomFragment.this.getBgLightToGrayAnimator();
                    if (bgLightToGrayAnimator != null && !bgLightToGrayAnimator.isRunning()) {
                        bgLightToGrayAnimator.start();
                    }
                }

                @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatBackgroundColorProtocol
                public final void LLLLLLZZ() {
                    Integer bgWhite = BaseChatRoomFragment.this.getBgWhite();
                    if (bgWhite != null) {
                        BaseChatRoomFragment baseChatRoomFragment = BaseChatRoomFragment.this;
                        baseChatRoomFragment.handler.post(new ARunnableS5S0101000_1(baseChatRoomFragment, bgWhite.intValue(), 12));
                    }
                }
            };
            C62814Ol0.LJJIIJZLJL(LIZJ2, ChatBackgroundColorProtocol.class, C47261Igj.LJJIJIL(r8));
            Lifecycle lifecycle = getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment$initChatPanel$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                        o.LJIIIZ(source, "source");
                        o.LJIIIZ(event, "event");
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C62814Ol0.LJJIJL(InterfaceC55235Lm3.this, ChatBackgroundColorProtocol.class, r8);
                        }
                    }
                });
            }
        } else {
            BaseChatPanel baseChatPanel = this.baseChatPanel;
            if (baseChatPanel != null) {
                baseChatPanel.LLJJIJIL = new C99113ul(this);
            }
        }
        if ((mo49getActivity() instanceof SelectChatMsgHostActivity) || !this.chatRoomConfig.LJLIL) {
            this.alphaVideoComponent = null;
        } else {
            if (c99033ud2.isSingleChat()) {
                str7 = "private";
            } else if (c99033ud2.isGroupChat()) {
                str7 = "group";
            } else {
                str7 = "";
            }
            o.LJIIIIZZ(alphaVideoViewStub, "alphaVideoViewStub");
            ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent = new ChatRoomAlphaVideoComponent(this, alphaVideoViewStub, c99033ud2.getConversationId(), "notification_page");
            this.alphaVideoComponent = chatRoomAlphaVideoComponent;
            chatRoomAlphaVideoComponent.LJLLL = str7;
        }
        BaseChatPanel baseChatPanel2 = this.baseChatPanel;
        if (baseChatPanel2 != null) {
            getLifecycle().addObserver(baseChatPanel2);
        }
        InterfaceC99183us interfaceC99183us = this.titleBarComponent;
        if (interfaceC99183us != null) {
            getLifecycle().addObserver(interfaceC99183us);
        }
        ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent2 = this.alphaVideoComponent;
        if (chatRoomAlphaVideoComponent2 != null) {
            getLifecycle().addObserver(chatRoomAlphaVideoComponent2);
        }
        handleBookModeDiff$default(this, null, 1, null);
    }

    private final boolean isAssemEnabled() {
        C99033ud c99033ud;
        if (!C110594Vr.LIZ() || (c99033ud = this.sessionInfo) == null || c99033ud.isTakoChat$im_base_release()) {
            return false;
        }
        return true;
    }

    private final void preloadViews() {
        C16970lZ.LJ(R.layout.b7e, getContext());
        C16970lZ.LJ(R.layout.b6v, getContext());
    }

    public void configImmersive() {
        C61712OJw.LIZIZ(this).LJ(getBackgroundColor());
        fragmentConfiguration(new AqS173S0100000_7(this, 73));
        if (C99163uq.LIZ() && this.chatRoomConfig.LJLIL) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C107954Ln(new C107994Lr((Forest) C108054Lx.LIZJ.getValue()), null, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // X.InterfaceC118454kr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int findFirstVisibleItemPositionInScreen() {
        /*
            r2 = this;
            boolean r1 = r2.isAssemEnabled()
            r0 = 0
            if (r1 == 0) goto L2a
            X.Lm3 r1 = X.C55230Lly.LIZJ(r2, r0)
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol> r0 = com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol.class
            java.util.List r0 = X.C62814Ol0.LJIJ(r1, r0)
            if (r0 == 0) goto L39
            java.lang.Object r0 = X.ORZ.LJLLJ(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol r0 = (com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol) r0
            if (r0 == 0) goto L39
            int r0 = r0.findFirstVisibleItemPositionInScreen()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            if (r0 == 0) goto L39
            int r0 = r0.intValue()
        L29:
            return r0
        L2a:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel r0 = r2.baseChatPanel
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$linearLayoutManager$1 r0 = r0.LLILL
            int r0 = r0.LLJJJJLIIL()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L23
        L39:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment.findFirstVisibleItemPositionInScreen():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // X.InterfaceC118454kr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int findLastVisibleItemPositionInScreen() {
        /*
            r2 = this;
            boolean r1 = r2.isAssemEnabled()
            r0 = 0
            if (r1 == 0) goto L2a
            X.Lm3 r1 = X.C55230Lly.LIZJ(r2, r0)
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol> r0 = com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol.class
            java.util.List r0 = X.C62814Ol0.LJIJ(r1, r0)
            if (r0 == 0) goto L39
            java.lang.Object r0 = X.ORZ.LJLLJ(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol r0 = (com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListProtocol) r0
            if (r0 == 0) goto L39
            int r0 = r0.findLastVisibleItemPositionInScreen()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            if (r0 == 0) goto L39
            int r0 = r0.intValue()
        L29:
            return r0
        L2a:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel r0 = r2.baseChatPanel
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$linearLayoutManager$1 r0 = r0.LLILL
            int r0 = r0.LLJJL()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L23
        L39:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment.findLastVisibleItemPositionInScreen():int");
    }

    @Override // X.InterfaceC1032343j
    public C1046648w getActionBarDisplayManager() {
        return getActionBarShowManager();
    }

    public final boolean handleOnBackPressed() {
        InputView inputView;
        if (isAssemEnabled()) {
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
        BaseChatPanel baseChatPanel = this.baseChatPanel;
        if (baseChatPanel == null || (inputView = baseChatPanel.LLILLL) == null) {
            return false;
        }
        return inputView.onBackPressed();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BaseChatPanel baseChatPanel = this.baseChatPanel;
        if (baseChatPanel != null) {
            baseChatPanel.LLJJIJIL = null;
            InputView inputView = baseChatPanel.LLILLL;
            if (inputView != null) {
                inputView.LJIILJJIL();
            }
        }
        if (this.chatRoomConfig.LJLILLLLZI) {
            C92993kt.LIZIZ(mo49getActivity());
        }
        BaseChatPanel baseChatPanel2 = this.baseChatPanel;
        if (baseChatPanel2 != null) {
            getLifecycle().removeObserver(baseChatPanel2);
        }
        InterfaceC99183us interfaceC99183us = this.titleBarComponent;
        if (interfaceC99183us != null) {
            getLifecycle().removeObserver(interfaceC99183us);
        }
        ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent = this.alphaVideoComponent;
        if (chatRoomAlphaVideoComponent != null) {
            getLifecycle().removeObserver(chatRoomAlphaVideoComponent);
        }
        Companion.getClass();
        C3Y4.LIZJ = "";
        ((ConcurrentHashMap) C3Y4.LIZIZ).clear();
        cleanMessageViewCache();
        this.stayTimeComponent = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        String str;
        String str2;
        String str3;
        super.onPause();
        if (this.chatRoomConfig.LLF) {
            long j = this.pageStartTime;
            C99033ud c99033ud = this.sessionInfo;
            if (j != -1) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                if (elapsedRealtime > 0) {
                    C1HQ c1hq = new C1HQ();
                    String str4 = null;
                    if (c99033ud != null) {
                        str = c99033ud.getEnterFromForMob();
                    } else {
                        str = null;
                    }
                    c1hq.put("enter_from", str);
                    if (c99033ud != null) {
                        str2 = c99033ud.getEnterMethod();
                    } else {
                        str2 = null;
                    }
                    c1hq.put("enter_method", str2);
                    if (c99033ud != null) {
                        str3 = c99033ud.getSearchId();
                    } else {
                        str3 = null;
                    }
                    c1hq.put("search_id", str3);
                    if (c99033ud != null) {
                        str4 = c99033ud.getConversationId();
                    }
                    c1hq.put("conversation_id", str4);
                    c1hq.put("duration", String.valueOf(elapsedRealtime));
                    c1hq.put("process_id", C3Y4.LIZJ);
                    C772831o.LIZ().LIZIZ("stay_time", c1hq);
                }
            }
            this.pageStartTime = -1L;
        } else {
            AnalysisActivityComponent analysisActivityComponent = this.stayTimeComponent;
            if (analysisActivityComponent != null) {
                analysisActivityComponent.onPause();
            }
        }
        this.hasPause = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.chatRoomConfig.LLF) {
            this.pageStartTime = SystemClock.elapsedRealtime();
            return;
        }
        AnalysisActivityComponent analysisActivityComponent = this.stayTimeComponent;
        if (analysisActivityComponent == null) {
            return;
        }
        analysisActivityComponent.LJLIL = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int i;
        super.onStart();
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        new C99513vP(requireContext, this.sessionInfo).LIZ();
        getFpsMonitor().start();
        InterfaceC55057LjB fpsMonitor = getFpsMonitor();
        C99033ud c99033ud = this.sessionInfo;
        if (c99033ud != null) {
            i = c99033ud.getChatType();
        } else {
            i = -1;
        }
        fpsMonitor.LJII(Integer.valueOf(i), "chat_type");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        getFpsMonitor().stop();
        super.onStop();
    }

    public final void setLightTheme() {
        Integer num;
        C1046648w actionBarShowManager = getActionBarShowManager();
        if (actionBarShowManager != null && (num = (Integer) actionBarShowManager.LJ.getValue()) != null) {
            int intValue = num.intValue();
            FrameLayout frameLayout = actionBarShowManager.LIZ;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(intValue);
            }
        }
        Integer bgWhite = getBgWhite();
        if (bgWhite != null) {
            this.handler.post(new ARunnableS5S0101000_1(this, bgWhite.intValue(), 13));
        }
    }

    public final void startNavBarLightToGrayAnimation() {
        ValueAnimator valueAnimator;
        C1046648w actionBarShowManager = getActionBarShowManager();
        if (actionBarShowManager != null && (valueAnimator = (ValueAnimator) actionBarShowManager.LJII.getValue()) != null) {
            valueAnimator.start();
        }
        ValueAnimator bgLightToGrayAnimator = getBgLightToGrayAnimator();
        if (bgLightToGrayAnimator != null && !bgLightToGrayAnimator.isRunning()) {
            bgLightToGrayAnimator.start();
        }
    }

    private final void handleBookModeDiff(Configuration configuration) {
        boolean z;
        int i;
        if (!isBookMode()) {
            return;
        }
        boolean z2 = C53946LFe.LIZJ(mo49getActivity(), configuration).LJFF;
        C99033ud c99033ud = this.sessionInfo;
        if (c99033ud != null) {
            z = c99033ud.isGroupChat();
        } else {
            z = false;
        }
        int i2 = 8;
        if (!isAssemEnabled()) {
            C101043xs c101043xs = this.titleBar;
            if (c101043xs != null) {
                if (z2) {
                    i = 8;
                } else {
                    i = 0;
                }
                c101043xs.setLeftViewVisiblity(i);
                C101043xs c101043xs2 = this.titleBar;
                if (c101043xs2 != null) {
                    C16300kU.LJIILLIIL(c101043xs2, null);
                } else {
                    o.LJIJI("titleBar");
                    throw null;
                }
            } else {
                o.LJIJI("titleBar");
                throw null;
            }
        }
        View view = this.separateLine;
        if (view != null) {
            if (!z2) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
        if (!isAssemEnabled()) {
            if (z2 && (z || C107454Jp.LIZ())) {
                C101043xs c101043xs3 = this.titleBar;
                if (c101043xs3 != null) {
                    c101043xs3.setLeftAvatarMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    return;
                } else {
                    o.LJIJI("titleBar");
                    throw null;
                }
            }
            C101043xs c101043xs4 = this.titleBar;
            if (c101043xs4 != null) {
                c101043xs4.setLeftAvatarMarginStart(0);
            } else {
                o.LJIJI("titleBar");
                throw null;
            }
        }
    }

    private final void modifiedForChatPageRedesign(Context context) {
        Integer LJI = C79045V0n.LJI(getBackgroundColor(), context);
        if (LJI != null) {
            getRootView().setBackgroundColor(LJI.intValue());
        }
    }

    private final void refreshUser(final C98523to c98523to) {
        IMUser fromUser = c98523to.getFromUser();
        if (fromUser == null || IMUser.isInvalidUser(fromUser.getUid())) {
            return;
        }
        C80533Eb.LJIIJJI(fromUser.getUid(), fromUser.getSecUid(), true, new C3EU() { // from class: X.3uf
            @Override // X.C3EU
            public final void LIZ(IMUser result) {
                SingleChatTitleBarComponent singleChatTitleBarComponent;
                o.LJIIIZ(result, "result");
                BaseChatRoomFragment.this.updateMafUser(c98523to, result);
                InterfaceC99183us interfaceC99183us = BaseChatRoomFragment.this.titleBarComponent;
                if ((interfaceC99183us instanceof SingleChatTitleBarComponent) && (singleChatTitleBarComponent = (SingleChatTitleBarComponent) interfaceC99183us) != null) {
                    singleChatTitleBarComponent.LIZIZ(result);
                }
                c98523to.setFromUser(result);
                BaseChatPanel baseChatPanel = BaseChatRoomFragment.this.baseChatPanel;
                if (baseChatPanel != null) {
                    baseChatPanel.LJIIJ(result);
                }
                C85163Vw.LIZ(c98523to.getFromUser(), c98523to.getConversationId(), Integer.valueOf(c98523to.getEnterFrom()), "SingleChatPanel");
            }

            @Override // X.C3EU
            public final void LIZIZ(Throwable throwable) {
                o.LJIIIZ(throwable, "throwable");
            }
        });
    }

    @Override // X.InterfaceC118454kr
    public void addOnPanelChangeListener(InterfaceC1032943p listener) {
        o.LJIIIZ(listener, "listener");
        BaseChatPanel baseChatPanel = this.baseChatPanel;
        if (baseChatPanel != null) {
            ((ArrayList) baseChatPanel.LLIZLLLIL).add(listener);
        }
    }

    public final void handleNewIntent(Intent intent) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.setIntent(intent);
        }
        RouteArgInjector.INSTANCE.inject(this);
        initParam(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0223, code lost:
    
        if (X.C100013wD.LIZ(X.C4WC.LIZIZ.LIZ(r11)) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initParam(boolean r29) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment.initParam(boolean):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        InterfaceC98153tD.LIZ.LIZIZ("chat_room");
        getLifecycle().addObserver(IMNaviAnalyticsImpl.LJLJI);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        handleBookModeDiff(newConfig);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Integer LJI;
        Bundle arguments;
        super.onCreate(bundle);
        preloadViews();
        ((C4Z2) C96423qQ.LIZ()).LIZ(EnumC100693xJ.ENTER_CHAT_ROOM);
        if (bundle != null && (arguments = getArguments()) != null) {
            arguments.putAll(bundle);
        }
        initParam$default(this, false, 1, null);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            if (this.chatRoomConfig.LLF) {
                this.activitySoftInputMode = Integer.valueOf(mo49getActivity.getWindow().getAttributes().softInputMode);
                mo49getActivity.getWindow().setSoftInputMode(0);
            }
            if (!isBookMode() && (LJI = C79045V0n.LJI(C49R.LIZ.LIZLLL, mo49getActivity)) != null) {
                mo49getActivity.getWindow().getDecorView().setBackgroundColor(LJI.intValue());
            }
        }
        this.stayTimeComponent = new AnalysisActivityComponent(this);
        C96423qQ.LIZ();
        C4Z2.LJIILLIIL();
        configImmersive();
        if (!this.chatRoomConfig.LLF) {
            C107064Ic.LIZ();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        C99033ud c99033ud = this.sessionInfo;
        if (c99033ud != null) {
            outState.putSerializable("key_session_info", c99033ud);
        }
    }

    public final void setChatRoomConfig(C99043ue c99043ue) {
        o.LJIIIZ(c99043ue, "<set-?>");
        this.chatRoomConfig = c99043ue;
    }

    public final void setRootView(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.rootView = view;
    }

    @Override // X.InterfaceC118454kr
    public void setUpAnimatedEmojiCheck(C118274kZ observer) {
        o.LJIIIZ(observer, "observer");
        BaseChatPanel baseChatPanel = this.baseChatPanel;
        if (baseChatPanel != null) {
            baseChatPanel.LLIIIILZ.LJIIJJI(observer);
            baseChatPanel.LLJILJIL.LJLLLLLL(observer);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        long j;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C84683Ua c84683Ua = C84683Ua.LJFF;
        C99153up c99153up = new C3UX() { // from class: X.3up
        };
        c84683Ua.LIZIZ(c99153up, true);
        InterfaceC98153tD.LIZ.LIZ(view, "chat_room", null);
        long currentTimeMillis = System.currentTimeMillis();
        C99093uj.LIZ = currentTimeMillis;
        HashMap hashMap = (HashMap) C99093uj.LIZJ;
        hashMap.put("enterChatRoom", Long.valueOf(currentTimeMillis));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enterChatRoom");
        LIZ.append(" start: ");
        LIZ.append(C99093uj.LIZ);
        C34B.LIZIZ("TimeLog", X1D.LIZIZ(LIZ));
        initChatPanel();
        C99093uj.LIZIZ = System.currentTimeMillis();
        Long l = (Long) hashMap.get("enterChatRoom");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        StringBuilder LIZJ = b1.LIZJ("enterChatRoom", " end:  time interval");
        LIZJ.append(C99093uj.LIZIZ - j);
        C34B.LIZIZ("TimeLog", X1D.LIZIZ(LIZJ));
        C99093uj.LIZ = C99093uj.LIZIZ;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        modifiedForChatPageRedesign(context);
        c84683Ua.LIZ(c99153up, C46B.LIZLLL);
        if (isAssemEnabled()) {
            C99133un c99133un = new C3UX() { // from class: X.3un
            };
            c84683Ua.LIZIZ(c99133un, true);
            C4LO chatRoomAssembler = getChatRoomAssembler();
            if (chatRoomAssembler != null) {
                C8VV.LIZ(chatRoomAssembler.LIZ, false, new AqS167S0100000_1(chatRoomAssembler, 537));
            }
            c84683Ua.LIZ(c99133un, C46B.LIZLLL);
        }
    }

    public final void updateMafUser(C98523to c98523to, IMUser iMUser) {
        IMUser fromUser;
        String recType;
        if (C3UE.LIZIZ() && (fromUser = c98523to.getFromUser()) != null && (recType = fromUser.getRecType()) != null) {
            String recType2 = iMUser.getRecType();
            if (recType2 == null || recType2.length() == 0) {
                iMUser.setRecType(recType);
            }
        }
    }

    public View com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment__onCreateView$___twin___(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C84683Ua c84683Ua = C84683Ua.LJFF;
        C99143uo c99143uo = new C3UX() { // from class: X.3uo
        };
        c84683Ua.LIZIZ(c99143uo, true);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, getLayoutRes(), viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(getLayoutRes(), container, false)");
        setRootView(LLLLIILL);
        c84683Ua.LIZ(c99143uo, C46B.LIZLLL);
        return getRootView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (isAssemEnabled()) {
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
        BaseChatPanel baseChatPanel = this.baseChatPanel;
        if (baseChatPanel != null) {
            baseChatPanel.LJIIIZ(i, i2, intent);
        }
    }

    public static View com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(BaseChatRoomFragment baseChatRoomFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment__onCreateView$___twin___ = baseChatRoomFragment.com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment__onCreateView$___twin___, baseChatRoomFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment__onCreateView$___twin___, baseChatRoomFragment);
                C10A.LIZIZ(com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment__onCreateView$___twin___, baseChatRoomFragment);
                ActivityC45651qj mo49getActivity = baseChatRoomFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_aweme_im_sdk_chat_ui_powerpage_BaseChatRoomFragment__onCreateView$___twin___;
    }

    public static /* synthetic */ void handleBookModeDiff$default(BaseChatRoomFragment baseChatRoomFragment, Configuration configuration, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                configuration = null;
            }
            baseChatRoomFragment.handleBookModeDiff(configuration);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleBookModeDiff");
    }

    public static /* synthetic */ void initParam$default(BaseChatRoomFragment baseChatRoomFragment, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            baseChatRoomFragment.initParam(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initParam");
    }
}
