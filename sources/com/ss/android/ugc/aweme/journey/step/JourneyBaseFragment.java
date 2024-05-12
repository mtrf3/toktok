package com.ss.android.ugc.aweme.journey.step;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C40869G2f;
import X.C76800UCe;
import X.C7FC;
import X.C90903hW;
import X.KL2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class JourneyBaseFragment extends NUJComponentFragment {
    public TextView LJLJJL;
    public RecyclerView LJLJJLL;
    public AbstractC65781Prl LJLJLJ;
    public boolean LJLJLLL;
    public long LJLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public long LJLJL = System.currentTimeMillis();
    public long LJLLI = System.currentTimeMillis();

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final TextView Al() {
        TextView textView = this.LJLJJL;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("doneView");
        throw null;
    }

    public final RecyclerView Dl() {
        RecyclerView recyclerView = this.LJLJJLL;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("infoListView");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Yns, X.Prl] */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        ?? r1;
        this.LJLL = (System.currentTimeMillis() - this.LJLLI) + this.LJLL;
        if (!this.LJLJLLL && (r1 = this.LJLJLJ) != 0) {
            r1.invoke(Boolean.TRUE);
        }
        super.onStop();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLLI = currentTimeMillis;
        this.LJLJL = currentTimeMillis;
    }

    public final void Gl(boolean z) {
        Al().setEnabled(z);
        if (z) {
            TextView Al = Al();
            Context context = Al().getContext();
            o.LJIIIIZZ(context, "doneView.context");
            Al.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context));
            return;
        }
        TextView Al2 = Al();
        Context context2 = Al().getContext();
        o.LJIIIIZZ(context2, "doneView.context");
        Al2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context2));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        TextView done = (TextView) _$_findCachedViewById(R.id.cex);
        o.LJIIIIZZ(done, "done");
        this.LJLJJL = done;
        RecyclerView rv = (RecyclerView) _$_findCachedViewById(R.id.j9c);
        o.LJIIIIZZ(rv, "rv");
        this.LJLJJLL = rv;
        Dl().setItemAnimator(null);
        C7FC.LIZJ(Al(), 0.75f);
        C7FC.LIZJ(_$_findCachedViewById(R.id.k2f), 0.75f);
        ViewGroup.LayoutParams layoutParams = Dl().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int LIZJ = marginLayoutParams.leftMargin - ((int) KL2.LIZJ(Dl().getContext(), 4.0f));
        marginLayoutParams.leftMargin = LIZJ;
        marginLayoutParams.rightMargin = LIZJ;
        Gl(false);
        Dl().LJIIJJI(new C40869G2f(this));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ber, viewGroup, false);
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
