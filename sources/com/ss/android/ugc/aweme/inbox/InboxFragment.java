package com.ss.android.ugc.aweme.inbox;

import X.AX5;
import X.AX6;
import X.AbstractC029409q;
import X.AbstractC030109x;
import X.AbstractC225698tR;
import X.AbstractC28931Bp;
import X.AbstractC72775ShH;
import X.ActivityC45651qj;
import X.C00F;
import X.C03880Dg;
import X.C0A2;
import X.C107384Ji;
import X.C107454Jp;
import X.C10A;
import X.C10K;
import X.C112054aX;
import X.C114304eA;
import X.C119354mJ;
import X.C119964nI;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C18000nE;
import X.C188727au;
import X.C221018lt;
import X.C221108m2;
import X.C223318pb;
import X.C244389iU;
import X.C27740Aue;
import X.C29S;
import X.C2NH;
import X.C2U8;
import X.C35154Dqw;
import X.C3B2;
import X.C3C5;
import X.C3SN;
import X.C3ST;
import X.C40171ht;
import X.C42224Ghg;
import X.C45804HyK;
import X.C46604IQu;
import X.C52716KmW;
import X.C53104Ksm;
import X.C53352Kwm;
import X.C53355Kwp;
import X.C53432Ky4;
import X.C53765L8f;
import X.C54072LKa;
import X.C54081LKj;
import X.C54082LKk;
import X.C54110LLm;
import X.C54251LQx;
import X.C54262LRi;
import X.C54316LTk;
import X.C54362LVe;
import X.C55012LiS;
import X.C55883LwV;
import X.C55885LwX;
import X.C56204M4a;
import X.C56351M9r;
import X.C56625MKf;
import X.C56630MKk;
import X.C56641MKv;
import X.C56642Ke;
import X.C56642MKw;
import X.C56652MLg;
import X.C56691MMt;
import X.C56775MPz;
import X.C57092Lx;
import X.C59512Vf;
import X.C5H3;
import X.C61447O9r;
import X.C61712OJw;
import X.C61713OJx;
import X.C62685Oiv;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C67552kx;
import X.C73305Spp;
import X.C76800UCe;
import X.C79045V0n;
import X.C79723Ay;
import X.C82093Kb;
import X.C8WY;
import X.C90903hW;
import X.C9XU;
import X.EnumC112394b5;
import X.EnumC57165Mc5;
import X.EnumC94693nd;
import X.FMX;
import X.G27;
import X.HG3;
import X.IR3;
import X.IR8;
import X.IRD;
import X.IRI;
import X.InterfaceC100173wT;
import X.InterfaceC109664Sc;
import X.InterfaceC178086yq;
import X.InterfaceC26157AOj;
import X.InterfaceC34471Wx;
import X.InterfaceC53896LDg;
import X.InterfaceC56322M8o;
import X.InterfaceC56632MKm;
import X.InterfaceC57760Mlg;
import X.InterfaceC74170T9a;
import X.K2B;
import X.L08;
import X.L0A;
import X.LA9;
import X.LAB;
import X.LFQ;
import X.LK2;
import X.LKR;
import X.LLQ;
import X.LLY;
import X.LNZ;
import X.LQZ;
import X.M9V;
import X.M9Z;
import X.MKV;
import X.MKZ;
import X.MLJ;
import X.MLK;
import X.MLP;
import X.MLS;
import X.MMI;
import X.QD3;
import X.R1V;
import X.RBX;
import X.SQR;
import X.V1B;
import X.ViewOnClickListenerC56620MKa;
import X.X1D;
import Y.ACListenerS36S0200000_1;
import Y.ACallableS112S0100000_9;
import Y.ACallableS92S0200000_15;
import Y.ALAdapterS0S0200000_1;
import Y.AObserverS69S0100000_1;
import Y.AObserverS73S0200000_9;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS40S0100000_4;
import Y.ARunnableS45S0100000_9;
import Y.ARunnableS5S0210000_3;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.account.prompt.AccountShowConfirmPromptServiceImpl;
import com.ss.android.ugc.aweme.account.prompt.IAccountShowBindPromptApi;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.NoticeAndDMCombineWidget;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.popup.AvatarAndNicknamePopupController;
import com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget;
import com.ss.android.ugc.aweme.services.SmartLockService;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS98S0300000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* loaded from: classes10.dex */
public final class InboxFragment extends BaseInboxFragment implements LQZ, InterfaceC74170T9a, InterfaceC53896LDg, InterfaceC34471Wx, InterfaceC56322M8o, G27, LK2, LLY, InterfaceC178086yq {
    public static final M9V LLIILII = new M9V();
    public static final long LLIILZL;
    public static final int LLIIZ;
    public C119964nI LJLJL;
    public FixedLinearlayoutManager LJLJLJ;
    public int LJLJLLL;
    public InterfaceC100173wT LL;
    public boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public final String LLIIJI;
    public final M9Z LLIIJLIL;
    public final Map<Integer, View> LLIIL = new LinkedHashMap();
    public long LJLJJL = -1;
    public boolean LJLJJLL = true;
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(IRD.LJLIL);
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 270));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(C56351M9r.LJLIL);
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 272));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 266));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 670));
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 674));
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(C3SN.LJLIL);
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 672));
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 671));
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 673));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new AqS159S0100000_9(this, 274));
    public final C54072LKa LLF = new C54072LKa();
    public final C62822Ol8 LLFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 267));
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 268));
    public boolean LLFII = true;
    public final AqS159S0100000_9 LLIIII = new AqS159S0100000_9(this, 271);
    public final C5H3 LLIIIILZ = V1B.LJZI(new AqS159S0100000_9(this, 275));
    public final AqS175S0100000_9 LLIIIJ = new AqS175S0100000_9(this, 99);
    public final AObserverS69S0100000_1 LLIIIL = new AObserverS69S0100000_1(this, 56);
    public final C62822Ol8 LLIIIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 269));

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public final AbstractC030109x Ml() {
        AbstractC030109x abstractC030109x;
        AbstractC28931Bp abstractC28931Bp;
        LAB.LIZ.getClass();
        if (LAB.LIZ()) {
            return null;
        }
        AbsUserCardInboxWidget Pl = Pl();
        if (!(Pl instanceof AbsUserCardInboxWidget) || Pl == null || (abstractC030109x = Pl.LJIJ()) == null) {
            abstractC030109x = new C40171ht() { // from class: X.4j6
                public final List<RecyclerView.ViewHolder> LJIJI = new ArrayList();

                {
                    this.LJ = 220L;
                    this.LIZLLL = 110L;
                    this.LIZJ = 110L;
                }

                @Override // X.C40171ht, X.AbstractC030109x
                public final boolean LJIILJJIL() {
                    if (super.LJIILJJIL() || (!this.LJIJI.isEmpty())) {
                        return true;
                    }
                    return false;
                }

                @Override // X.C40171ht, X.AbstractC030109x
                public final void LJIIZILJ() {
                    super.LJIIZILJ();
                    if (!this.LJIJI.isEmpty()) {
                        for (RecyclerView.ViewHolder viewHolder : this.LJIJI) {
                            ObjectAnimator duration = ObjectAnimator.ofFloat(viewHolder.itemView, "alpha", 1.0f, 0.0f, 1.0f).setDuration(this.LJ);
                            o.LJIIIIZZ(duration, "ofFloat(viewHolder.itemV…setDuration(moveDuration)");
                            duration.setInterpolator(new C30911Jf());
                            duration.addListener(new ALAdapterS0S0200000_1(this, viewHolder, 4));
                            duration.start();
                        }
                        ((ArrayList) this.LJIJI).clear();
                    }
                }

                @Override // X.C40171ht, X.AbstractC28931Bp
                public final boolean LJIJJ(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
                    return super.LJIJJ(viewHolder, i, i2, i3, i4);
                }
            };
        }
        if (C00F.LIZ(31744, 0, "tt_im_disable_inbox_change_animation", true) == 1 && (abstractC030109x instanceof AbstractC28931Bp) && (abstractC28931Bp = (AbstractC28931Bp) abstractC030109x) != null) {
            abstractC28931Bp.LJI = false;
        }
        return abstractC030109x;
    }

    @Override // X.LLY
    public final void Vj() {
    }

    @Override // com.ss.android.ugc.aweme.inbox.BaseInboxFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.inbox.BaseInboxFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLIIL;
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

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b9081";
    }

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "notification_page";
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.BaseInboxFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.LLY
    public final void x9(AbstractC225698tR tabStyle, boolean z) {
        o.LJIIIZ(tabStyle, "tabStyle");
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "MainTabPage";
    }

    static {
        AbstractC72775ShH.LJLJLLL.getClass();
        ValueAnimator valueAnimator = AbstractC72775ShH.LJLLI;
        LLIILZL = valueAnimator.getDuration();
        LLIIZ = valueAnimator.getRepeatCount();
    }

    public InboxFragment() {
        C56641MKv.LIZ(C56642MKw.LJLIL);
        IR8.LIZ();
        IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LIZJ();
        this.LLIIJI = "inbox";
        this.LLIIJLIL = new M9Z();
    }

    public final NoticeAndDMCombineWidget Il() {
        return (NoticeAndDMCombineWidget) this.LJLLL.getValue();
    }

    public final C42224Ghg Jl() {
        return (C42224Ghg) this.LLFFF.getValue();
    }

    public final InboxFragmentVM Kl() {
        return (InboxFragmentVM) this.LJLLI.getValue();
    }

    public final InboxAdapterWidget Ll() {
        return (InboxAdapterWidget) this.LJZI.getValue();
    }

    public final InboxAdapterWidget Nl() {
        return (InboxAdapterWidget) this.LJZ.getValue();
    }

    public final MultiAdapterWidget Ol() {
        return (MultiAdapterWidget) this.LJLLJ.getValue();
    }

    public final AbsUserCardInboxWidget Pl() {
        return (AbsUserCardInboxWidget) this.LLD.getValue();
    }

    public final C223318pb Ql() {
        return (C223318pb) this.LLIIIILZ.getValue();
    }

    public final InboxAdapterWidget Rl() {
        return (InboxAdapterWidget) this.LJLLLLLL.getValue();
    }

    public final List<InboxAdapterWidget> Tl() {
        return (List) this.LLFF.getValue();
    }

    public final boolean Wl() {
        return ((Boolean) this.LJLLILLLL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("notification_page");
        return analysis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Dl() {
        List<InboxAdapterWidget> Tl = Tl();
        if (!(Tl instanceof Collection) || !Tl.isEmpty()) {
            Iterator<InboxAdapterWidget> it = Tl.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next(), Ll())) {
                    return;
                }
            }
        }
        InboxAdapterWidget Ll = Ll();
        if (Ll != null) {
            Ll.LJLJJI = true;
            Ll.getLifecycle().addObserver(Ll);
            Tl().add(Ll);
            C42224Ghg Jl = Jl();
            AbstractC029409q<?> adapter = Ll.LJIIJ();
            Jl.getClass();
            o.LJIIIZ(adapter, "adapter");
            Jl.LJLIL.LJLLLLLL(adapter);
            Xl(Ll);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Gl() {
        AbstractC029409q<?> Wk0;
        List<InboxAdapterWidget> Tl = Tl();
        if (!(Tl instanceof Collection) || !Tl.isEmpty()) {
            Iterator<InboxAdapterWidget> it = Tl.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next(), Pl())) {
                    return;
                }
            }
        }
        L08.LIZ(new C59512Vf(System.currentTimeMillis() - MMI.SWITCH_TAB_TIMESTAMP.getEventValue(), "inbox_fragment", "connectRecUserWidget"));
        AbsUserCardInboxWidget widget = Pl();
        if (((Boolean) C46604IQu.LIZIZ.getValue()).booleanValue()) {
            o.LJIIIZ(widget, "widget");
            widget.LJII(1, C56625MKf.LIZLLL);
        }
        if (((Boolean) C46604IQu.LJFF.getValue()).booleanValue()) {
            C56625MKf.LIZ(widget);
        }
        widget.LJLJJI = true;
        widget.getLifecycle().addObserver(widget);
        if (widget.LJIILIIL().getValue() != EnumC94693nd.SUCCESS) {
            widget.LJ();
        }
        Tl().add(widget);
        InterfaceC57760Mlg LJIIZILJ = widget.LJIIZILJ();
        if (LJIIZILJ != null && (Wk0 = LJIIZILJ.Wk0()) != null) {
            C42224Ghg Jl = Jl();
            Jl.getClass();
            Jl.LJLIL.LJLLLLLL(Wk0);
        }
        C42224Ghg Jl2 = Jl();
        AbstractC029409q<?> adapter = widget.LJIIJ();
        Jl2.getClass();
        o.LJIIIZ(adapter, "adapter");
        Jl2.LJLIL.LJLLLLLL(adapter);
        Xl(widget);
    }

    public final void Hl() {
        List<InboxAdapterWidget> Tl = Tl();
        if ((Tl instanceof Collection) && Tl.isEmpty()) {
            return;
        }
        Iterator<InboxAdapterWidget> it = Tl.iterator();
        while (it.hasNext()) {
            if (o.LJ(it.next(), Pl())) {
                AbsUserCardInboxWidget Pl = Pl();
                Tl().remove(Pl);
                C42224Ghg Jl = Jl();
                AbstractC029409q<?> adapter = Pl.LJIIJ();
                Jl.getClass();
                o.LJIIIZ(adapter, "adapter");
                Jl.LJLIL.LJZI(adapter);
                K2B inboxRecyclerView = (K2B) _$_findCachedViewById(R.id.ekg);
                o.LJIIIIZZ(inboxRecyclerView, "inboxRecyclerView");
                Pl.LJIJI(inboxRecyclerView);
                Pl.LJLJJI = false;
                return;
            }
        }
    }

    @Override // X.InterfaceC74170T9a
    public final void LJ() {
        MutableLiveData<Boolean> LJIILJJIL;
        Iterator<InboxAdapterWidget> it = Tl().iterator();
        while (it.hasNext()) {
            it.next().LJ();
        }
        InboxAdapterWidget Rl = Rl();
        if (Rl != null && (LJIILJJIL = Rl.LJIILJJIL()) != null) {
            LJIILJJIL.postValue(Boolean.valueOf(((Boolean) this.LJLL.getValue()).booleanValue()));
        }
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    public final InterfaceC56632MKm Sl() {
        C0A2 layoutManager;
        Object LJJJJJL;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ekg);
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int LJJJI = layoutManager.LJJJI();
            for (int i = 0; i < LJJJI; i++) {
                View LJJJ = layoutManager.LJJJ(i);
                if (LJJJ != null && (LJJJJJL = ((RecyclerView) _$_findCachedViewById(R.id.ekg)).LJJJJJL(LJJJ)) != null && (LJJJJJL instanceof InterfaceC56632MKm)) {
                    return (InterfaceC56632MKm) LJJJJJL;
                }
            }
            return null;
        }
        return null;
    }

    public final void Yl() {
        ActivityC45651qj LJJIFFI;
        LLQ Xm0;
        Context context = getContext();
        if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return;
        }
        this.LLF.getClass();
        if (!C53765L8f.LJIIL("NOTIFICATION")) {
            _$_findCachedViewById(R.id.aok).setVisibility(8);
            return;
        }
        if (AX6.LIZIZ() || ((Xm0 = LNZ.LIZIZ.getHomeTabViewModel(LJJIFFI).Xm0()) != null && !Xm0.LJIILLIIL())) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.aok);
            if (_$_findCachedViewById == null) {
                return;
            }
            _$_findCachedViewById.setVisibility(8);
            return;
        }
        _$_findCachedViewById(R.id.aok).setVisibility(0);
        C57092Lx.LIZ.getClass();
        int LIZ = C61447O9r.LIZ();
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.aok).getLayoutParams();
        if (layoutParams.height != LIZ) {
            layoutParams.height = LIZ;
            _$_findCachedViewById(R.id.aok).setLayoutParams(layoutParams);
        }
    }

    public final void Zl() {
        C223318pb Ql;
        if (!C53432Ky4.LIZLLL()) {
            ((C73305Spp) _$_findCachedViewById(R.id.keh)).LJFF();
            ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(0);
        }
        if (!C53352Kwm.LIZ() && (Ql = Ql()) != null) {
            Ql.post(new ARunnableS45S0100000_9(this, 56));
        }
    }

    public final void cm() {
        if (_$_findCachedViewById(R.id.l9q) != null && C107454Jp.LIZ() && ((C119354mJ) _$_findCachedViewById(R.id.l9q)).LJLJLLL != IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJII() && this.LLI) {
            ((C119354mJ) _$_findCachedViewById(R.id.l9q)).setActive(IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJII());
            if (IRI.LIZ()) {
                Il().LJ();
            } else {
                Ol().LJ();
                InboxAdapterWidget Rl = Rl();
                if (Rl != null) {
                    Rl.LJ();
                }
            }
            this.LLI = false;
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        return C54081LKj.LIZ(requireContext, this);
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || !getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) || !LKR.LIZJ(mo49getActivity, "NOTIFICATION")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        dm(false);
        Iterator<InboxAdapterWidget> it = Tl().iterator();
        while (it.hasNext()) {
            getLifecycle().removeObserver(it.next());
        }
        EventBus.LIZJ().LJIJ(this);
        if (_$_findCachedViewById(R.id.ekg) != null && ((Boolean) C52716KmW.LIZJ.getValue()).booleanValue()) {
            _$_findCachedViewById(R.id.ekg).removeCallbacks(new ARunnableS45S0100000_9(this.LLIIII, 166));
            C221018lt.LJFF("InboxFragment", "remove add item animator runnable");
        }
        LFQ.LIZJ(this);
        C114304eA.LIZJ();
        L08.LIZIZ();
        L0A.LIZ();
        InterfaceC56632MKm Sl = Sl();
        if (Sl != null) {
            Sl.LLLII();
        }
        C56652MLg.LIZJ.LIZIZ(-1);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        AbstractC030109x itemAnimator;
        super.onPause();
        C221018lt.LJFF("InboxFragment", "onPause");
        AX5.LIZ = null;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ekg);
        if (recyclerView != null && (itemAnimator = recyclerView.getItemAnimator()) != null) {
            itemAnimator.LJIIJ();
            C221018lt.LJFF("InboxFragment", "inbox recyclerview item animator end animations");
        }
        InterfaceC100173wT interfaceC100173wT = this.LL;
        if (interfaceC100173wT != null) {
            interfaceC100173wT.onInvisible();
        }
        InterfaceC56632MKm Sl = Sl();
        if (Sl != null) {
            Sl.LLLLZLL();
        }
        C56652MLg.LIZJ.LIZIZ(7);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Context context;
        Integer LJI;
        super.onResume();
        C221018lt.LJFF("InboxFragment", "onResume");
        if (!C54316LTk.LIZ) {
            C54262LRi c54262LRi = new C54262LRi(-99999);
            c54262LRi.LIZLLL(-999999, -1);
            c54262LRi.post();
        }
        AX5.LIZ = "inbox_first_page";
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && LKR.LIZIZ(mo49getActivity, "NOTIFICATION")) {
            C221018lt.LJFF("InboxFragment", "onResume current is Inbox Tab");
            C12460eI.LJIIIIZZ(this, null);
            C56652MLg.LIZJ.LIZIZ(6);
            InterfaceC56632MKm Sl = Sl();
            if (Sl != null) {
                Sl.LLJJJJJIL();
            }
        }
        if (AX6.LIZIZ() && this.LLFII && (context = getContext()) != null && (LJI = C79045V0n.LJI(R.attr.cl, context)) != null) {
            int intValue = LJI.intValue();
            C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
            LIZIZ.LJI(intValue);
            LIZIZ.LIZ(true);
            LIZIZ.LIZJ();
        }
        if (((C82093Kb) this.LJLZ.getValue()).LJLILLLLZI) {
            C2NH.LIZ.post(new ARunnableS40S0100000_4(this, 61));
        } else {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                IAccountShowBindPromptApi LIZJ = AccountShowConfirmPromptServiceImpl.LIZJ();
                if (LIZJ.LIZ()) {
                    LIZJ.LIZIZ(mo49getActivity2, "notification_page", null);
                }
            }
        }
        InterfaceC100173wT interfaceC100173wT = this.LL;
        if (interfaceC100173wT != null) {
            interfaceC100173wT.onVisible();
        }
        C56204M4a.LIZLLL("life-onResume");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        L08.LIZ(new AqS159S0100000_9(this, 273));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.LLFII && this.LLFZ) {
            BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false).stopBenchmark();
            this.LLFZ = false;
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LLIIJI;
    }

    public static void dm(boolean z) {
        long j;
        int i;
        if (C53432Ky4.LIZLLL() && C16880lQ.LLLZLL()) {
            AbstractC72775ShH.LJLJLLL.getClass();
            ValueAnimator valueAnimator = AbstractC72775ShH.LJLLI;
            if (z) {
                j = 0;
            } else {
                j = LLIILZL;
            }
            valueAnimator.setDuration(j);
            if (z) {
                i = 0;
            } else {
                i = LLIIZ;
            }
            valueAnimator.setRepeatCount(i);
        }
    }

    public final void Al(boolean z) {
        Intent intent;
        String str;
        String str2;
        Intent intent2;
        String LLJJIJIIJIL;
        Intent intent3;
        Intent intent4;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null && intent.getIntExtra("intent_story_widget_action", -1) == 1) {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            String str3 = "";
            if (mo49getActivity2 == null || (intent4 = mo49getActivity2.getIntent()) == null || (str = C16880lQ.LLJJIJIIJIL(intent4, "uid")) == null) {
                str = "";
            }
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 == null || (intent3 = mo49getActivity3.getIntent()) == null || (str2 = C16880lQ.LLJJIJIIJIL(intent3, "id")) == null) {
                str2 = "";
            }
            ActivityC45651qj mo49getActivity4 = mo49getActivity();
            if (mo49getActivity4 != null && (intent2 = mo49getActivity4.getIntent()) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent2, "enter_from")) != null) {
                str3 = LLJJIJIIJIL;
            }
            InsertStory insertStory = new InsertStory(CastLongProtector.parseLong(str), CastLongProtector.parseLong(str2));
            if (IRI.LIZ()) {
                MultiAdapterWidget multiAdapterWidget = Il().LLF;
                multiAdapterWidget.LJIILLIIL().LLII = insertStory;
                multiAdapterWidget.LJLLLLLL = insertStory;
                Il().LLF.LJLZ = str3;
                if (!z) {
                    Il().LLF.LJ();
                    return;
                }
                return;
            }
            MultiAdapterWidget Ol = Ol();
            Ol.LJIILLIIL().LLII = insertStory;
            Ol.LJLLLLLL = insertStory;
            Ol().LJLZ = str3;
            if (z) {
                return;
            }
            Ol().LJ();
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        C221018lt.LJFF("InboxFragment", "onNodeHide......");
        C56691MMt.LIZ.getClass();
        if (C56691MMt.LIZ()) {
            MLS.LJ();
            MLS.LJ = false;
        }
        dm(false);
        if (!C53355Kwp.LIZ() && this.LJLJJL != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLJJL;
            if (currentTimeMillis > 100 && getAnalysis() != null && !TextUtils.isEmpty(getAnalysis().getLabelName())) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("duration", String.valueOf(currentTimeMillis));
                c188727au.LJIIIZ("enter_from", getAnalysis().getLabelName());
                FMX.LJIIL("stay_time", c188727au.LIZ);
            }
            this.LJLJJL = -1L;
        }
        if (this.LLFII && this.LLFZ) {
            BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false).stopBenchmark();
            this.LLFZ = false;
        }
        this.LLFII = false;
        IMService.createIIMServicebyMonsterPlugin(false).getInboxTabChangeManager().LIZ(false);
        IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().onNodeVisibilityChanged(false);
        if (C35154Dqw.LIZ()) {
            MLP.LIZIZ.LIZ(EnumC112394b5.INBOX_TAB);
        } else {
            R1V.LJIIIZ(2);
        }
        C114304eA.LIZJ();
        L08.LIZIZ();
        L0A.LIZ();
        if (C53104Ksm.LIZ()) {
            EventBus.LIZJ().LJIJ(FollowerPreCacheManager.LIZ);
        }
        InterfaceC56632MKm Sl = Sl();
        if (Sl != null) {
            Sl.LLLLZLL();
        }
        C56652MLg.LIZJ.LIZIZ(7);
        C54072LKa c54072LKa = this.LLF;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c54072LKa.getClass();
        if (mo49getActivity != null && !C53765L8f.LJIIL("NOTIFICATION")) {
            C27740Aue.LJIIIIZZ(mo49getActivity);
            C244389iU.LIZ(mo49getActivity);
        }
        C56204M4a.LIZLLL("dismissGuideIfNeed");
        C2U8.LIZ(new MKV(false));
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        User curUser;
        o.LJIIIZ(args, "args");
        C221018lt.LJFF("InboxFragment", "onNodeShow....");
        C56691MMt.LIZ.getClass();
        if (C56691MMt.LIZ()) {
            MLS.LJ = true;
        }
        dm(true);
        if (!C53355Kwp.LIZ()) {
            this.LJLJJL = System.currentTimeMillis();
        }
        IMService.createIIMServicebyMonsterPlugin(false).getInboxTabChangeManager().LIZ(true);
        IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().onNodeVisibilityChanged(true);
        IMService.createIIMServicebyMonsterPlugin(false).getRelationService().LIZ();
        EnumC57165Mc5.CONTACTS.markEnterInbox();
        this.LJLJJLL = true;
        C12460eI.LJIIIIZZ(this, null);
        if (this.LLIFFJFJJ && isViewValid()) {
            if (IRI.LIZ()) {
                Il().LLF.LJLLJ = true;
            } else {
                Ol().LJLLJ = true;
            }
            C221018lt.LJFF("InboxFragment", "onNodeShow");
            LJ();
        }
        if (!C46604IQu.LIZLLL() && !C56630MKk.LIZ() && C54362LVe.LJIILJJIL(12) != 0) {
            C54362LVe.LIZIZ(12);
            C2U8.LIZ(new C54251LQx(6, C54362LVe.LJIILJJIL(6)));
        }
        Kl().getClass();
        InboxFragmentVM.hv0();
        this.LLFII = true;
        this.LLIFFJFJJ = true;
        if (!this.LLFZ) {
            BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false).startBenchmark(3);
            this.LLFZ = true;
        }
        C3B2 activityStatusViewModel = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
        if (activityStatusViewModel.getSettings().LJI()) {
            C107384Ji settings = activityStatusViewModel.getSettings();
            settings.LJIIZILJ.removeObserver(this.LLIIIL);
            settings.LJIIZILJ.observe(this, this.LLIIIL);
            if (!_$_findCachedViewById(R.id.eki).hasOnClickListeners()) {
                C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.eki), new ACListenerS36S0200000_1(this, settings, 54));
            }
            C119354mJ c119354mJ = (C119354mJ) _$_findCachedViewById(R.id.l9q);
            if (c119354mJ != null) {
                c119354mJ.setActive(settings.LJII());
            }
        }
        if (((RBX) HG3.LJIILL()).isLogin() && (curUser = ((RBX) HG3.LJIILL()).getCurUser()) != null && !TextUtils.isEmpty(curUser.getUniqueId()) && !TextUtils.isEmpty(curUser.getUid()) && SmartLockService.createISmartLockServicebyMonsterPlugin(false).shouldShowOnInbox()) {
            MLK mlk = new MLK();
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            mlk.LIZJ(curUserId);
            String uniqueId = ((RBX) HG3.LJIILL()).getCurUser().getUniqueId();
            o.LJIIIIZZ(uniqueId, "userService().curUser.uniqueId");
            mlk.LIZLLL(uniqueId);
            String nickName = ((RBX) HG3.LJIILL()).getNickName();
            o.LJIIIIZZ(nickName, "userService().nickName");
            mlk.LIZIZ(nickName);
            String avatarUrl = ((RBX) HG3.LJIILL()).getAvatarUrl();
            o.LJIIIIZZ(avatarUrl, "userService().avatarUrl");
            mlk.LIZ(avatarUrl);
            PopupManager.LJIIL(new C55012LiS(mlk.LIZ, this));
        }
        C112054aX asyncBlock = C112054aX.LJLIL;
        o.LJIIIZ(asyncBlock, "asyncBlock");
        if (((Boolean) L0A.LIZIZ.getValue()).booleanValue()) {
            C221018lt.LJFF("InboxJankOptimizationV3", "asyncJankMethod");
            C10K.LIZJ(new ACallableS112S0100000_9(asyncBlock, 32));
        } else {
            asyncBlock.invoke();
        }
        if (C53104Ksm.LIZ()) {
            EventBus.LIZJ().LJIILJJIL(FollowerPreCacheManager.LIZ);
        }
        InterfaceC56632MKm Sl = Sl();
        if (Sl != null) {
            Sl.LLJJJJJIL();
        }
        C56652MLg.LIZJ.LIZIZ(6);
        AvatarAndNicknamePopupController.LIZJ().LIZIZ();
        C54072LKa c54072LKa = this.LLF;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c54072LKa.getClass();
        if (mo49getActivity != null && !C53765L8f.LJIIL("NOTIFICATION")) {
            C27740Aue.LJIIIIZZ(mo49getActivity);
            C27740Aue.LJII(mo49getActivity);
        }
        C56204M4a.LIZLLL("life-onNodeShow");
        C56204M4a.LJIIIIZZ();
    }

    public final void Vl(int i) {
        if (i == Integer.MAX_VALUE) {
            Hl();
            return;
        }
        if (C56775MPz.LJ()) {
            if (i < 100) {
                Gl();
                return;
            } else if (i < IR3.LIZIZ().dmMaxThresholdHideRecommend) {
                Gl();
                return;
            } else {
                Hl();
                return;
            }
        }
        Gl();
    }

    public final void Xl(InboxAdapterWidget inboxAdapterWidget) {
        try {
            inboxAdapterWidget.LJIILIIL().observe(this, new AObserverS73S0200000_9(this, inboxAdapterWidget, 1));
            LiveData<Boolean> LJIIIIZZ = inboxAdapterWidget.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                LJIIIIZZ.observe(this, new AObserverS77S0100000_9(this, 18));
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("repeat add : ");
            LIZ.append(e.getMessage());
            C221018lt.LJFF("InboxFragment", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C9XU.LIZ(mo49getActivity.hashCode(), this);
            LFQ.LIZIZ(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C56641MKv.LIZIZ(C8WY.ON_CREATE, new AqS156S0200000_9(this, bundle, 13));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCreatorGuideEvent(MKV event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive CreatorGuideEvent = ");
        LIZ.append(event.LJLIL);
        C56204M4a.LIZLLL(X1D.LIZIZ(LIZ));
        MKZ mkz = (MKZ) this.LLIIIZ.getValue();
        if (mkz != null) {
            if (event.LJLIL) {
                PopupManager.LJIIL(mkz);
                return;
            }
            ViewOnClickListenerC56620MKa viewOnClickListenerC56620MKa = mkz.LJLILLLLZI;
            if (viewOnClickListenerC56620MKa == null) {
                return;
            }
            viewOnClickListenerC56620MKa.LIZIZ();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCreatorSettingChange(C55883LwV event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive CreatorSettingChangeEvent = ");
        LIZ.append(event.LJLIL);
        C56204M4a.LIZLLL(X1D.LIZIZ(LIZ));
        NoticeAndDMCombineWidget Il = Il();
        Il.LJIILLIIL().LJLZ().rv0(false);
        int intValue = ((Number) LA9.LIZJ().getFirst()).intValue();
        if (Il.LLIIIZ != intValue) {
            Il.LLIIIZ = intValue;
            Il.LJIL();
        }
        int intValue2 = ((Number) LA9.LIZJ().getSecond()).intValue();
        if (Il.LLIIJI != intValue2) {
            Il.LLIIJI = intValue2;
            Il.LJIL();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDoubleClickTab(C54110LLm event) {
        o.LJIIIZ(event, "event");
        InboxFragmentVM Kl = Kl();
        List<InboxAdapterWidget> widgets = Tl();
        FixedLinearlayoutManager fixedLinearlayoutManager = this.LJLJLJ;
        if (fixedLinearlayoutManager != null) {
            int LLILL = fixedLinearlayoutManager.LLILL();
            Kl.getClass();
            o.LJIIIZ(widgets, "widgets");
            if (Kl.gv0(widgets, LLILL, false) || Kl.gv0(widgets, 0, true)) {
                return;
            }
            Kl.LJLILLLLZI.postValue(0);
            return;
        }
        o.LJIJI("layoutManager");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "1090891368859316742");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/aweme/inbox/InboxFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/inbox/InboxFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (!z) {
            HG3.LJIIL();
            InterfaceC26157AOj LJIIL = HG3.LJLJL.LJIIL();
            if (LJIIL.isUpsell2svInboxHVAExperimentTreatment()) {
                C10K.LIZJ(new ACallableS92S0200000_15(LJIIL, this, 3));
            }
        }
        c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/inbox/InboxFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke event) {
        InterfaceC109664Sc inboxAdapterService;
        o.LJIIIZ(event, "event");
        try {
            InterfaceC109664Sc inboxAdapterService2 = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService();
            if (inboxAdapterService2 != null) {
                String string = JSONObjectProtectorUtils.getString(event.LJLIL, "eventName");
                o.LJIIIIZZ(string, "event.params.getString(\"eventName\")");
                Lifecycle.State currentState = getLifecycle().getCurrentState();
                o.LJIIIIZZ(currentState, "this@InboxFragment.lifecycle.currentState");
                if (inboxAdapterService2.LJIIJ(string, currentState) && (inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService()) != null) {
                    Context requireContext = requireContext();
                    o.LJIIIIZZ(requireContext, "this@InboxFragment.requireContext()");
                    FragmentManager requireFragmentManager = requireFragmentManager();
                    o.LJIIIIZZ(requireFragmentManager, "requireFragmentManager()");
                    SQR LIZ = inboxAdapterService.LIZ(requireContext, this, requireFragmentManager);
                    if (LIZ != null) {
                        PopupManager.LJIIL(LIZ);
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    @QD3
    public final void onNewIntent(C3ST c3st) {
        String str;
        String string;
        Intent intent;
        Bundle LLJJIJI;
        Bundle arguments = getArguments();
        Intent intent2 = null;
        if (arguments != null) {
            str = arguments.getString("push_id");
        } else {
            str = null;
        }
        if (c3st != null && (intent = c3st.LJLIL) != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null) {
            setArguments(LLJJIJI);
        }
        Al(false);
        if (c3st != null) {
            intent2 = c3st.LJLIL;
        }
        MLJ.LIZ(this, intent2);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("push_id")) == null || string.length() == 0 || !o.LJ(string, str)) {
            IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LJIIJ(this);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNoRepostToastEvent(C67552kx event) {
        o.LJIIIZ(event, "event");
        C221018lt.LJFF("InboxRepostList", "InboxFragment#onNoRepostToastEvent");
        C62685Oiv.LIZIZ.LJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPrivacyUserSettingsChange(C79723Ay event) {
        boolean z;
        o.LJIIIZ(event, "event");
        C119354mJ c119354mJ = (C119354mJ) _$_findCachedViewById(R.id.l9q);
        if (c119354mJ != null) {
            boolean z2 = c119354mJ.LJLJLLL;
            Integer M = event.LJLIL.M("activity_status");
            if (M == null || M.intValue() != 1) {
                z = false;
            } else {
                z = true;
            }
            if (z2 == z) {
                return;
            }
        }
        this.LLI = true;
        if (!isVisible()) {
            return;
        }
        cm();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRemoveEntranceEvent(C55885LwX event) {
        Object obj;
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive entrance id =");
        LIZ.append(event.LJLIL);
        C221018lt.LJFF("InboxFragment", X1D.LIZIZ(LIZ));
        NoticeAndDMCombineWidget Il = Il();
        int i = event.LJLIL;
        MultiViewModel LJLZ = Il.LJIILLIIL().LJLZ();
        Iterator it = ((ArrayList) LJLZ.LLFII).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((InboxEntrancePod) obj).entranceCell.getCellId() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InboxEntrancePod inboxEntrancePod = (InboxEntrancePod) obj;
        if (inboxEntrancePod != null && !inboxEntrancePod.entranceCell.isActivity() && !inboxEntrancePod.entranceCell.isFollower()) {
            if (inboxEntrancePod.entranceCell.getFilterType() != Integer.MIN_VALUE) {
                C54362LVe.LIZLLL(inboxEntrancePod.entranceCell.getFilterType());
            } else if (inboxEntrancePod.entranceCell.getGroup() != 0) {
                C54362LVe.LIZIZ(inboxEntrancePod.entranceCell.getGroup());
            }
            C2U8.LIZ(new C54251LQx(6, C54362LVe.LJIILJJIL(6)));
            LJLZ.tv0(inboxEntrancePod);
        }
    }

    @Override // X.LK2
    public final void v0(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
    }

    public static final /* synthetic */ void wl(InboxFragment inboxFragment, Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC178086yq
    public final void Ha(RecyclerView.ViewHolder viewHolder, boolean z) {
        View _$_findCachedViewById;
        if (viewHolder != null && (_$_findCachedViewById = _$_findCachedViewById(R.id.ekg)) != null) {
            _$_findCachedViewById.post(new ARunnableS5S0210000_3(viewHolder, this, z, 3));
        }
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        IMService.createIIMServicebyMonsterPlugin(false).getGroupChatService().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        AqS98S0300000_9 aqS98S0300000_9 = new AqS98S0300000_9(this, view, bundle, 4);
        if (!AX6.LIZIZ()) {
            aqS98S0300000_9.invoke();
            return;
        }
        if (!this.LJLJI) {
            this.LJLJI = true;
            aqS98S0300000_9.invoke();
        }
        this.mStatusViewValid = true;
    }

    @Override // X.LLY
    public final void s0(AbstractC225698tR tabStyle, boolean z) {
        o.LJIIIZ(tabStyle, "tabStyle");
        Yl();
    }

    public static final /* synthetic */ void xl(InboxFragment inboxFragment, View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InboxAdapterWidget Rl = Rl();
        if (Rl != null) {
            Rl.LJIILL(i, i2, intent);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View view = (View) C56641MKv.LIZIZ(C8WY.ON_CREATE_VIEW, new AqS98S0300000_9(this, inflater, viewGroup, 3));
        C29S c29s = null;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view;
    }
}
