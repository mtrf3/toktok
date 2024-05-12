package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS29S0100000_9;
import Y.AObserverS77S0100000_9;
import Y.IDrS48S0100000_9;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MOu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56744MOu extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ MusNewNotificationFragment LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56744MOu(MusNewNotificationFragment musNewNotificationFragment, View view, Bundle bundle) {
        super(0);
        this.LJLIL = musNewNotificationFragment;
        this.LJLILLLLZI = view;
        this.LJLJI = bundle;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        int i;
        ForegroundColorSpan foregroundColorSpan;
        Integer LJI;
        super/*com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment*/.onViewCreated(this.LJLILLLLZI, this.LJLJI);
        Context context = this.LJLILLLLZI.getContext();
        if (context != null) {
            C56812MRk.LIZ = C56812MRk.LIZJ(context);
        }
        MusNewNotificationFragment musNewNotificationFragment = this.LJLIL;
        musNewNotificationFragment.getClass();
        musNewNotificationFragment.LJLLI = C56702MNe.LIZ;
        ViewGroup.LayoutParams layoutParams = musNewNotificationFragment._$_findCachedViewById(R.id.n2e).getLayoutParams();
        Context context2 = musNewNotificationFragment.getContext();
        if (context2 != null) {
            i = C63081OpJ.LJJJJLI(context2);
        } else {
            i = 0;
        }
        layoutParams.height = i;
        musNewNotificationFragment.getContext();
        musNewNotificationFragment.LJLJL = new FixedLinearlayoutManager();
        RecyclerView recyclerView = (RecyclerView) musNewNotificationFragment._$_findCachedViewById(R.id.j_9);
        FixedLinearlayoutManager fixedLinearlayoutManager = musNewNotificationFragment.LJLJL;
        if (fixedLinearlayoutManager != null) {
            recyclerView.setLayoutManager(fixedLinearlayoutManager);
            ((RecyclerView) musNewNotificationFragment._$_findCachedViewById(R.id.j_9)).LJIIJJI(new C73379Sr1(musNewNotificationFragment.getContext()));
            C56649MLd.LIZ((RecyclerView) musNewNotificationFragment._$_findCachedViewById(R.id.j_9), (C223318pb) musNewNotificationFragment._$_findCachedViewById(R.id.kb6));
            ((RecyclerView) musNewNotificationFragment._$_findCachedViewById(R.id.j_9)).LJIIJJI(new IDrS48S0100000_9(musNewNotificationFragment, 13));
            ((C80896Voy) musNewNotificationFragment._$_findCachedViewById(R.id.kb6)).setOnRefreshListener(musNewNotificationFragment);
            if (!C1DH.LJIJJLI()) {
                C7FA.LIZIZ(musNewNotificationFragment._$_findCachedViewById(R.id.fn0));
                C16880lQ.LJIL((ConstraintLayout) musNewNotificationFragment._$_findCachedViewById(R.id.fn0), new ACListenerS29S0100000_9(musNewNotificationFragment, 189));
                ((ImageView) musNewNotificationFragment._$_findCachedViewById(R.id.f36)).setVisibility(0);
                if (!INB.LIZIZ()) {
                    View dmEntranceView = IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().getDmEntranceView(musNewNotificationFragment.mo49getActivity(), "notification_page");
                    musNewNotificationFragment.LJZL = dmEntranceView;
                    if (dmEntranceView != null) {
                        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(musNewNotificationFragment, 264), dmEntranceView);
                        ((ViewGroup) musNewNotificationFragment._$_findCachedViewById(R.id.j5z)).addView(dmEntranceView);
                    }
                }
            }
            C16880lQ.LJIJ((RelativeLayout) musNewNotificationFragment._$_findCachedViewById(R.id.j5z), MRY.LJLIL);
            musNewNotificationFragment.Sl(R.string.iw5, R.string.iwg, Integer.valueOf(R.raw.icon_large_inbox));
            musNewNotificationFragment.Ll().LJJ(musNewNotificationFragment.Kl());
            musNewNotificationFragment.Ll().LJJI(musNewNotificationFragment);
            musNewNotificationFragment.Jl().LJJ(new C56741MOr());
            musNewNotificationFragment.Jl().LJLILLLLZI = musNewNotificationFragment;
            ((LiveData) musNewNotificationFragment.Gl().LJLLILLLL.getValue()).observe(musNewNotificationFragment, new AObserverS77S0100000_9(musNewNotificationFragment, 125));
            ((LiveData) musNewNotificationFragment.Gl().LJLLL.getValue()).observe(musNewNotificationFragment, new AObserverS77S0100000_9(musNewNotificationFragment, 126));
            ((LiveData) musNewNotificationFragment.Gl().LJLLJ.getValue()).observe(musNewNotificationFragment, new AObserverS77S0100000_9(musNewNotificationFragment, 127));
            ((LiveData) musNewNotificationFragment.Gl().LJLLLL.getValue()).observe(musNewNotificationFragment, new AObserverS77S0100000_9(musNewNotificationFragment, 129));
            ((LiveData) musNewNotificationFragment.Gl().LJLLLLLL.getValue()).observe(musNewNotificationFragment, new AObserverS77S0100000_9(musNewNotificationFragment, 130));
            musNewNotificationFragment.Il().getBoolean("is_from_push", false);
            C56743MOt c56743MOt = new C56743MOt(musNewNotificationFragment, musNewNotificationFragment.Gl().LJLILLLLZI, new AqS159S0100000_9(musNewNotificationFragment, 1028));
            musNewNotificationFragment.LJLJJI = c56743MOt;
            c56743MOt.setLoadMoreListener(musNewNotificationFragment);
            C56743MOt c56743MOt2 = musNewNotificationFragment.LJLJJI;
            if (c56743MOt2 != null) {
                c56743MOt2.setShowFooter(false);
                C56743MOt c56743MOt3 = musNewNotificationFragment.LJLJJI;
                if (c56743MOt3 != null) {
                    c56743MOt3.setLoadEmptyText("");
                    musNewNotificationFragment.showLoadMoreEmpty();
                    RecyclerView recyclerView2 = (RecyclerView) musNewNotificationFragment._$_findCachedViewById(R.id.j_9);
                    C56743MOt c56743MOt4 = musNewNotificationFragment.LJLJJI;
                    if (c56743MOt4 != null) {
                        recyclerView2.setAdapter(c56743MOt4);
                        ((RecyclerView) musNewNotificationFragment._$_findCachedViewById(R.id.j_9)).LJII(new MP9(musNewNotificationFragment), -1);
                        LogHelper LJIIIIZZ = LogHelperImpl.LJIIIIZZ();
                        RecyclerView rv_list = (RecyclerView) musNewNotificationFragment._$_findCachedViewById(R.id.j_9);
                        o.LJIIIIZZ(rv_list, "rv_list");
                        LJIIIIZZ.LIZ(rv_list);
                        musNewNotificationFragment.Kl().liveData.observe(musNewNotificationFragment, new AObserverS77S0100000_9(musNewNotificationFragment, 135));
                        musNewNotificationFragment.Kl().updateLiveData.observe(musNewNotificationFragment, new AObserverS77S0100000_9(musNewNotificationFragment, 136));
                        TutorialVideoViewModel tutorialVideoViewModel = (TutorialVideoViewModel) ViewModelProviders.of(musNewNotificationFragment).get(TutorialVideoViewModel.class);
                        musNewNotificationFragment.LJLJJLL = tutorialVideoViewModel;
                        if (tutorialVideoViewModel != null) {
                            Context context3 = musNewNotificationFragment.getContext();
                            if (context3 != null) {
                                tutorialVideoViewModel.LJLIL = new WeakReference<>(context3);
                            }
                            TutorialVideoViewModel tutorialVideoViewModel2 = musNewNotificationFragment.LJLJJLL;
                            if (tutorialVideoViewModel2 != null) {
                                tutorialVideoViewModel2.LJLILLLLZI.observe(musNewNotificationFragment, new AObserverS77S0100000_9(musNewNotificationFragment, 137));
                                MSQ msq = new MSQ();
                                RecyclerView rv_list2 = (RecyclerView) musNewNotificationFragment._$_findCachedViewById(R.id.j_9);
                                o.LJIIIIZZ(rv_list2, "rv_list");
                                FixedLinearlayoutManager fixedLinearlayoutManager2 = musNewNotificationFragment.LJLJL;
                                if (fixedLinearlayoutManager2 != null) {
                                    msq.LIZ(rv_list2, fixedLinearlayoutManager2, new MQQ(musNewNotificationFragment));
                                    ViewOnClickListenerC226978vV viewOnClickListenerC226978vV = (ViewOnClickListenerC226978vV) musNewNotificationFragment._$_findCachedViewById(R.id.dxc);
                                    viewOnClickListenerC226978vV.setIconImage(MN5.LIZ(R.raw.icon_bell));
                                    viewOnClickListenerC226978vV.setCloseImage(MN5.LIZ(R.raw.icon_x_mark_small));
                                    SpannableString spannableString = new SpannableString(C86V.LJFF(R.string.hdw));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C42398GkU.LIZIZ(C86V.LJFF(R.string.hdx), ' '));
                                    if (musNewNotificationFragment.getContext() != null) {
                                        Context context4 = musNewNotificationFragment.getContext();
                                        if (context4 != null && (LJI = C79045V0n.LJI(R.attr.eb, context4)) != null) {
                                            foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
                                        } else {
                                            foregroundColorSpan = null;
                                        }
                                        spannableString.setSpan(foregroundColorSpan, 0, spannableString.length(), 34);
                                        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
                                        spannableStringBuilder.append((CharSequence) spannableString);
                                    }
                                    ((ViewOnClickListenerC226978vV) musNewNotificationFragment._$_findCachedViewById(R.id.dxc)).setTitleText(spannableStringBuilder);
                                    View go_enable_push_settings_guide = musNewNotificationFragment._$_findCachedViewById(R.id.dxc);
                                    o.LJIIIIZZ(go_enable_push_settings_guide, "go_enable_push_settings_guide");
                                    C55879LwR.LIZLLL = new WeakReference<>(go_enable_push_settings_guide);
                                    C56747MOx c56747MOx = new C56747MOx((ViewOnClickListenerC226978vV) musNewNotificationFragment._$_findCachedViewById(R.id.dxc), new C78596Usy());
                                    musNewNotificationFragment.LJLLL = c56747MOx;
                                    c56747MOx.LIZLLL = MPS.Message;
                                    c56747MOx.LIZ();
                                    musNewNotificationFragment.Ql();
                                    C56743MOt c56743MOt5 = musNewNotificationFragment.LJLJJI;
                                    if (c56743MOt5 != null) {
                                        c56743MOt5.LJLLI = musNewNotificationFragment;
                                        c56743MOt5.LJLL = musNewNotificationFragment;
                                        c56743MOt5.LJZI = musNewNotificationFragment;
                                        musNewNotificationFragment.Vl();
                                        if (INB.LIZIZ()) {
                                            ((ImageView) musNewNotificationFragment._$_findCachedViewById(R.id.aei)).setVisibility(0);
                                            C16880lQ.LJJJ((TuxIconView) musNewNotificationFragment._$_findCachedViewById(R.id.aei), new ACListenerS29S0100000_9(musNewNotificationFragment, 187));
                                            C61713OJx LIZIZ = C61712OJw.LIZIZ(musNewNotificationFragment);
                                            LIZIZ.LJII(R.attr.cl);
                                            LIZIZ.LJ(R.attr.cl);
                                            LIZIZ.LIZ(true);
                                            LIZIZ.LIZJ();
                                        }
                                        this.LJLIL.LJ();
                                        return C76800UCe.LIZ;
                                    }
                                    o.LJIJI("mAdapter");
                                    throw null;
                                }
                                o.LJIJI("mLinearLayoutManager");
                                throw null;
                            }
                            o.LJIJI("mTutorialVideoModel");
                            throw null;
                        }
                        o.LJIJI("mTutorialVideoModel");
                        throw null;
                    }
                    o.LJIJI("mAdapter");
                    throw null;
                }
                o.LJIJI("mAdapter");
                throw null;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mLinearLayoutManager");
        throw null;
    }
}
