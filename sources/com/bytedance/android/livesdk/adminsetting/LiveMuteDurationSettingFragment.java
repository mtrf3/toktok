package com.bytedance.android.livesdk.adminsetting;

import X.ActivityC45651qj;
import X.C05490Jl;
import X.C10A;
import X.C141335gf;
import X.C16340kY;
import X.C16360ka;
import X.C16880lQ;
import X.C28372BBo;
import X.C28381BBx;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.CN1;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMuteDurationSettingFragment extends BaseFragment {
    public C05490Jl LJLIL;
    public View.OnClickListener LJLILLLLZI;
    public InterfaceC88472Yns<? super C05490Jl, C76800UCe> LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C05490Jl c05490Jl = this.LJLIL;
        if (c05490Jl != null) {
            InterfaceC88472Yns<? super C05490Jl, C76800UCe> interfaceC88472Yns = this.LJLJI;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(c05490Jl);
            }
            this.LJLIL = null;
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (view.getContext().getResources().getDisplayMetrics().heightPixels * 73) / 100;
            view.setLayoutParams(layoutParams);
        }
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.aeg), this.LJLILLLLZI);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.cjd);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        Context context = getContext();
        o.LJI(context);
        C28381BBx c28381BBx = new C28381BBx(context, true);
        c28381BBx.LJLJJLL = new AqS171S0100000_5(this, 118);
        ((RecyclerView) _$_findCachedViewById(R.id.cjd)).setAdapter(c28381BBx);
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Zo0(new AqS171S0100000_5(c28381BBx, 119));
        C16360ka.LJIJJ(_$_findCachedViewById(R.id.cjd), new C28372BBo());
        C16340kY.LIZJ(_$_findCachedViewById(R.id.cjd));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d0k, viewGroup, false);
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
