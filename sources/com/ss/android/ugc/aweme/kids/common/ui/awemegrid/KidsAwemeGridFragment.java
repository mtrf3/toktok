package com.ss.android.ugc.aweme.kids.common.ui.awemegrid;

import X.AFM;
import X.ActivityC45651qj;
import X.C0A2;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C42625Go9;
import X.C56525MGj;
import X.C56616MJw;
import X.C62822Ol8;
import X.C73305Spp;
import X.C73411SrX;
import X.C76800UCe;
import X.C8GY;
import X.C90903hW;
import X.G3Z;
import X.InterfaceC191547fS;
import X.InterfaceC36195EIl;
import X.InterfaceC56526MGk;
import X.QD3;
import Y.AObserverS74S0100000_6;
import Y.AfS58S0100000_6;
import Y.IDhS99S0100000_6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes7.dex */
public abstract class KidsAwemeGridFragment extends AmeBaseFragment implements InterfaceC191547fS, InterfaceC56526MGk, C8GY {
    public RecyclerView LJLIL;
    public InterfaceC36195EIl LJLJI;
    public KidsAwemeGridViewModel LJLJJI;
    public C56616MJw LJLJJL;
    public C73305Spp LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS156S0100000_6(this, 44));

    public abstract void Al();

    public abstract boolean Il();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract View vl();

    public abstract String wl();

    public abstract void xl(View view, Aweme aweme);

    public void Dl() {
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setVisibility(8);
    }

    public void Gl() {
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setVisibility(8);
    }

    public final void Hl() {
        C73411SrX c73411SrX;
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = this.LJLJJLL;
        if (c73305Spp2 != null) {
            c73305Spp2.LJFF();
        }
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.LJLJJI;
        if (kidsAwemeGridViewModel == null || kidsAwemeGridViewModel.LJLIL == null || kidsAwemeGridViewModel.LJLJL) {
            return;
        }
        kidsAwemeGridViewModel.LJLJL = true;
        C73411SrX c73411SrX2 = kidsAwemeGridViewModel.LJLJJL;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = kidsAwemeGridViewModel.LJLJJL) != null) {
            c73411SrX.dispose();
        }
        kidsAwemeGridViewModel.LJLJJL = (C73411SrX) kidsAwemeGridViewModel.LJLIL.refresh().LJJIJL(new IDhS99S0100000_6(kidsAwemeGridViewModel, 6)).LJIJJLI(new AfS58S0100000_6(kidsAwemeGridViewModel, 29)).LJJJLIIL(new AfS58S0100000_6(kidsAwemeGridViewModel, 30), new AfS58S0100000_6(kidsAwemeGridViewModel, 31));
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        C73411SrX c73411SrX;
        C56616MJw c56616MJw = this.LJLJJL;
        if (c56616MJw != null) {
            c56616MJw.showLoadMoreLoading();
        }
        C56616MJw c56616MJw2 = this.LJLJJL;
        if (c56616MJw2 != null) {
            c56616MJw2.setShowFooter(true);
        }
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.LJLJJI;
        if (kidsAwemeGridViewModel == null || kidsAwemeGridViewModel.LJLIL == null || kidsAwemeGridViewModel.LJLJL) {
            return;
        }
        kidsAwemeGridViewModel.LJLJL = true;
        C73411SrX c73411SrX2 = kidsAwemeGridViewModel.LJLJJLL;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = kidsAwemeGridViewModel.LJLJJLL) != null) {
            c73411SrX.dispose();
        }
        kidsAwemeGridViewModel.LJLJJLL = (C73411SrX) kidsAwemeGridViewModel.LJLIL.LJIIJJI().LJJIJL(new IDhS99S0100000_6(kidsAwemeGridViewModel, 5)).LJIJJLI(new AfS58S0100000_6(kidsAwemeGridViewModel, 26)).LJJJLIIL(new AfS58S0100000_6(kidsAwemeGridViewModel, 27), new AfS58S0100000_6(kidsAwemeGridViewModel, 28));
    }

    @Override // X.InterfaceC56526MGk
    public final boolean hasMore() {
        InterfaceC36195EIl interfaceC36195EIl = this.LJLJI;
        if (interfaceC36195EIl == null || !interfaceC36195EIl.LJIILJJIL()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // X.InterfaceC56526MGk
    public final void LIZJ() {
        LJIIJJI();
    }

    @Override // X.InterfaceC56526MGk
    public final void A8(boolean z) {
        C56616MJw c56616MJw = this.LJLJJL;
        if (c56616MJw != null) {
            c56616MJw.setLoadMoreListener((InterfaceC191547fS) null);
        }
        C56616MJw c56616MJw2 = this.LJLJJL;
        if (c56616MJw2 != null) {
            c56616MJw2.showLoadMoreEmpty();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C42625Go9.LIZIZ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onReportEvent(AFM event) {
        o.LJIIIZ(event, "event");
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.LJLJJI;
        if (kidsAwemeGridViewModel != null) {
            List<Aweme> value = kidsAwemeGridViewModel.LJLILLLLZI.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            Iterator<Aweme> it = value.iterator();
            while (it.hasNext()) {
                if (it.next().getAid().equals(event.LJLIL)) {
                    it.remove();
                }
            }
            kidsAwemeGridViewModel.LJLILLLLZI.postValue(value);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (RecyclerView) view.findViewById(R.id.fdb);
        this.LJLJJLL = (C73305Spp) view.findViewById(R.id.fdc);
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        RecyclerView recyclerView2 = this.LJLIL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager((C0A2) this.LJLILLLLZI.getValue());
        }
        if (getContext() != null) {
            C56616MJw c56616MJw = new C56616MJw(wl(), this, Il());
            this.LJLJJL = c56616MJw;
            c56616MJw.LJLJJLL = vl();
            C56616MJw c56616MJw2 = this.LJLJJL;
            if (c56616MJw2 != null) {
                c56616MJw2.setLoadMoreListener(this);
            }
            C56616MJw c56616MJw3 = this.LJLJJL;
            if (c56616MJw3 != null) {
                c56616MJw3.spanSizeLookup = new G3Z();
            }
        }
        InterfaceC36195EIl interfaceC36195EIl = this.LJLJI;
        if (interfaceC36195EIl != null) {
            KidsAwemeGridViewModel kidsAwemeGridViewModel = new KidsAwemeGridViewModel(interfaceC36195EIl);
            kidsAwemeGridViewModel.LJLILLLLZI.observe(this, new AObserverS74S0100000_6(this, 6));
            kidsAwemeGridViewModel.LJLJI.observe(this, new AObserverS74S0100000_6(this, 7));
            kidsAwemeGridViewModel.LJLJJI.observe(this, new AObserverS74S0100000_6(this, 8));
            this.LJLJJI = kidsAwemeGridViewModel;
        }
        RecyclerView recyclerView3 = this.LJLIL;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.LJLJJL);
        }
        RecyclerView recyclerView4 = this.LJLIL;
        if (recyclerView4 != null) {
            recyclerView4.setOnFlingListener(new C56525MGj(recyclerView4, this));
        }
        Hl();
    }

    @Override // X.C8GY
    public final void LLLILZ(View view, Aweme aweme, String str) {
        xl(view, aweme);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bf5, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
