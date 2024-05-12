package com.ss.android.ugc.aweme.library;

import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.AbstractC73638SvC;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C04330Ez;
import X.C116424ha;
import X.C157166Eu;
import X.C16880lQ;
import X.C1BC;
import X.C25903AEp;
import X.C26045AKb;
import X.C2NU;
import X.C56560MHs;
import X.C5H3;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65772i5;
import X.C65776Prg;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C74068T5c;
import X.C76800UCe;
import X.C78840Uwu;
import X.C7W1;
import X.C80675VlP;
import X.C80896Voy;
import X.C8BJ;
import X.GHD;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.KL2;
import X.QD3;
import X.QX2;
import X.T16;
import X.T6F;
import X.T6H;
import X.T6K;
import X.T6L;
import X.T6N;
import X.T6X;
import X.TBT;
import X.TBW;
import X.TMG;
import X.W1T;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.library.aweme.LibraryDetailAwemeListFragment;
import com.ss.android.ugc.aweme.library.viewmodel.LibraryDetailState;
import com.ss.android.ugc.aweme.library.viewmodel.LibraryDetailViewModel;
import com.ss.android.ugc.aweme.model.library.LibraryDetailParam;
import com.ss.android.ugc.aweme.model.library.LibraryDetailResponse;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.IDqS455S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import ujb.s;

/* loaded from: classes13.dex */
public class LibraryDetailFragment extends BaseDetailFragment implements InterfaceC151715xP, AMD<C25903AEp> {
    public static final /* synthetic */ int LLIFFJFJJ = 0;
    public C74068T5c LJLLI;
    public LibraryDetailAwemeListFragment LJLLILLLL;
    public String LJLLJ;
    public LibraryMaterialInfo LJLLL;
    public LibraryDetailResponse LJLLLL;
    public String LJLZ;
    public boolean LJZI;
    public final lifecycleAwareLazy LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public C7W1 LLFF;
    public boolean LLFFF;
    public T6H LLFII;
    public int LLFZ;
    public final Map<Integer, View> LLI = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);
    public final C5H3 LJLILLLLZI = C78840Uwu.LJJIIJ(new AqS157S0100000_7(this, 136));
    public final C5H3 LJLJI = C78840Uwu.LJJIIJ(new AqS162S0100000_12(this, 748));
    public final C5H3 LJLJJI = C78840Uwu.LJJIIJ(new AqS162S0100000_12(this, 750));
    public final C5H3 LJLJJL = C78840Uwu.LJJIIJ(new AqS162S0100000_12(this, 745));
    public final C5H3 LJLJJLL = C78840Uwu.LJJIIJ(new AqS162S0100000_12(this, 746));
    public final C5H3 LJLJL = C78840Uwu.LJJIIJ(new AqS162S0100000_12(this, 749));
    public final C5H3 LJLJLJ = C78840Uwu.LJJIIJ(new AqS162S0100000_12(this, 747));
    public final C5H3 LJLJLLL = C78840Uwu.LJJIIJ(new AqS162S0100000_12(this, 743));
    public final C5H3 LJLL = C78840Uwu.LJJIIJ(new AqS162S0100000_12(this, 744));
    public boolean LJLLLLLL = true;
    public String LJZ = "";
    public final C25903AEp LJZL = new C25903AEp();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLI;
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

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment
    public final String getLabel() {
        return "library_detail_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return i == 0 ? "library_detail_page" : "";
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getResId() {
        return R.layout.cqx;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return "click_library_shoot";
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public LibraryDetailFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(LibraryDetailViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 751);
        this.LL = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, T6K.INSTANCE, 18));
        this.LLD = C78840Uwu.LJJIIJ(new AqS157S0100000_7(this, 137));
        this.LLF = C78840Uwu.LJJIIJ(GHD.LJLIL);
        this.LLFZ = -1;
    }

    public final C116424ha Al() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-mBackButton>(...)");
        return (C116424ha) value;
    }

    public final LibraryDetailParam Dl() {
        return (LibraryDetailParam) this.LJLILLLLZI.getValue();
    }

    public final C65772i5 Gl() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-mHeaderContainer>(...)");
        return (C65772i5) value;
    }

    public final RelativeLayout Hl() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-mRecordContainer>(...)");
        return (RelativeLayout) value;
    }

    public final C80896Voy Il() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-mRefreshLayout>(...)");
        return (C80896Voy) value;
    }

    public final View Jl() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mStatusBar>(...)");
        return (View) value;
    }

    public final C73305Spp Kl() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-mStatusView>(...)");
        return (C73305Spp) value;
    }

    public final View Ll() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-mTitleBar>(...)");
        return (View) value;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        String str = this.LJLLJ;
        if (str != null) {
            return str;
        }
        o.LJIJI("mLibraryId");
        throw null;
    }

    public final void Ml() {
        Il().setRefreshing(false);
        Il().setVisibility(8);
        Il().setScrollMode(C8BJ.NONE);
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-mReportButton>(...)");
        ((ImageView) value).setVisibility(8);
        Al().setVisibility(8);
        Hl().setVisibility(8);
        C73305Spp Kl = Kl();
        C73306Spq c73306Spq = new C73306Spq();
        C73312Spw.LJI(c73306Spq, new T6N(this));
        Kl.setStatus(c73306Spq);
        Kl().setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initData() {
        super.initData();
        C80675VlP c80675VlP = this.mTabLayout;
        if (c80675VlP != null) {
            c80675VlP.setBackgroundResource(R.color.ar);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final C1BC getFragmentPagerAdapter() {
        return this.LLFII;
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LJZL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0214, code lost:
    
        if (r9 != null) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Nl(com.ss.android.ugc.aweme.model.library.LibraryDetailResponse r16) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.library.LibraryDetailFragment.Nl(com.ss.android.ugc.aweme.model.library.LibraryDetailResponse):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        String id = Dl().getId();
        String str = "";
        if (id == null) {
            id = "";
        }
        this.LJLLJ = id;
        String processId = Dl().getProcessId();
        if (processId != null) {
            str = processId;
        }
        this.LJZ = str;
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str != null && s.LJJJLZIJ(str, "/tiktok/material/details/v1/?", false)) {
            EventBus.LIZJ().LIZIZ(event);
            Ol(this, true, 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment
    public final void onPreVideoRecord(Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (TextUtils.isEmpty(this.LJLZ)) {
            this.LJLZ = UUID.randomUUID().toString();
        }
        intent.putExtra("creation_id", this.LJLZ);
    }

    public final void J4(boolean z, boolean z2) {
        Kl().setVisibility(0);
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            Kl().LJFF();
            String id = Dl().getId();
            if (id != null) {
                JediViewModel jediViewModel = (JediViewModel) this.LL.getValue();
                jediViewModel.getClass();
                jediViewModel.execute(AbstractC73638SvC.LJI(new C56560MHs(z2, id)).LJJIIJ(T16.LIZ()), T6L.LJLIL);
            }
            List<T6F> list = this.mFragments;
            if (z && list != null) {
                Iterator<T6F> it = list.iterator();
                while (it.hasNext()) {
                    it.next().J4(false, true);
                }
            }
            if (z2) {
                Kl().setVisibility(8);
                onScrolled(0.0f, -60.0f);
                return;
            }
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
        Ml();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void onPageChange(int i, int i2) {
        boolean z;
        super.onPageChange(i, i2);
        Set<Map.Entry> entrySet = ((HashMap) this.LLF.getValue()).entrySet();
        if (entrySet != null) {
            for (Map.Entry entry : entrySet) {
                View view = (View) entry.getValue();
                Integer num = (Integer) entry.getKey();
                if (num == null || num.intValue() != i) {
                    z = false;
                } else {
                    z = true;
                }
                view.setSelected(z);
            }
        }
        List<T6F> list = this.mFragments;
        if (list == null) {
            return;
        }
        Object obj = ListProtector.get(list, i);
        if (!((T6F) obj).lh()) {
            obj = null;
        }
        T6F t6f = (T6F) obj;
        if (t6f != null) {
            t6f.refresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        int i3;
        super.onScroll(i, i2);
        if (this.LLFZ != Gl().getBottom()) {
            Gl().getBottom();
            this.mTitleColorCtrl.getBottom();
            Jl().getHeight();
            KL2.LIZJ(getContext(), 20.0f);
            this.LLFZ = Gl().getBottom();
        }
        if (i == 0) {
            Ll().setBackground(new ColorDrawable(C04330Ez.LIZIZ(Ll().getContext(), R.color.cz)));
        } else {
            View Ll = Ll();
            Context context = Ll().getContext();
            o.LJIIIIZZ(context, "mTitleBar.context");
            Ll.setBackground(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.cl, context)));
        }
        C74068T5c c74068T5c = this.LJLLI;
        if (c74068T5c != null) {
            i3 = c74068T5c.getAvatarContainerHeight();
        } else {
            i3 = 1;
        }
        float f = i / i3;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.mTitle.setAlpha(f);
        this.LJZI = T6X.LIZ(f, this.LJZI, this);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        this.LJZI = T6X.LIZIZ(f, f2, this.LJZI, this);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(Dl().getId())) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
                return;
            }
            return;
        }
        this.mTabLayout.setVisibility(8);
        this.mTitle.setVisibility(0);
        if (MSAdaptionService.LJIIL().LIZIZ(getContext())) {
            Al().setVisibility(8);
        }
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(new AqS170S0100000_4(this, 1525), (InterfaceC88472Yns<? super View, C76800UCe>) 240), Al());
        Context context = getContext();
        if (context != null) {
            i = C63081OpJ.LJJJJLI(context);
        } else {
            i = 0;
        }
        Jl().getLayoutParams().height = i;
        Jl().setAlpha(1.0f);
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-mReportButton>(...)");
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(new AqS176S0100000_10(this, 248), (InterfaceC88472Yns<? super View, C76800UCe>) 240), (View) value);
        Il().setScrollMode(C8BJ.NONE);
        Il().setOnRefreshListener(new AqS162S0100000_12(this, 1225));
        Gl().setOnSizeChangedListener(new IDqS455S0100000_12(this, 1));
        C73156SnQ.LIZIZ(this, (JediViewModel) this.LL.getValue(), new TBT() { // from class: X.T6M
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((LibraryDetailState) obj).getLibraryDetail();
            }
        }, new AqS194S0100000_12(this, 129), null, new AqS194S0100000_12(this, 130), 10);
        Ol(this, false, 2);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public static /* synthetic */ void Ol(LibraryDetailFragment libraryDetailFragment, boolean z, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        libraryDetailFragment.J4(z, false);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
