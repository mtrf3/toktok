package com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C25600zU;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC65784Pro;
import X.InterfaceC81204Vtw;
import Y.ACListenerS27S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tablet.impl.settings.TabletCommentSplitSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class DefaultSectionFragment extends Fragment implements InterfaceC81204Vtw {
    public InterfaceC65784Pro<C76800UCe> LJLIL;
    public TuxIconView LJLILLLLZI;
    public LinearLayout LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // X.InterfaceC81204Vtw
    public final void Aj(Object... params) {
        o.LJIIIZ(params, "params");
    }

    public String F6() {
        return "";
    }

    @Override // X.InterfaceC81204Vtw
    public final void Of() {
    }

    @Override // X.InterfaceC81204Vtw
    public final void Og() {
    }

    @Override // X.InterfaceC81204Vtw
    public final void Q2() {
    }

    @Override // X.InterfaceC81204Vtw
    public final Fragment R4() {
        return this;
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.InterfaceC81204Vtw
    public final void b2(Object... params) {
        o.LJIIIZ(params, "params");
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC81204Vtw
    public final float LLJJJJLIIL() {
        return ((TabletCommentSplitSettings.TabletCommentSplitConfig) TabletCommentSplitSettings.LIZIZ.getValue()).provideSectionRatio;
    }

    @Override // X.InterfaceC81204Vtw
    public final void O7(int i, int i2) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3 = this.LJLJI;
        if ((linearLayout3 != null && linearLayout3.getPaddingTop() == i && (linearLayout2 = this.LJLJI) != null && linearLayout2.getPaddingBottom() == i2) || (linearLayout = this.LJLJI) == null) {
            return;
        }
        linearLayout.setPadding(0, i, 0, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLILLLLZI = (TuxIconView) view.findViewById(R.id.aek);
        this.LJLJI = (LinearLayout) view.findViewById(R.id.j83);
        TuxIconView tuxIconView = this.LJLILLLLZI;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS27S0100000_7(this, 60));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(new C25600zU(getContext(), R.style.uw)), R.layout.cpu, viewGroup, false);
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
