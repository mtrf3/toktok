package com.ss.android.ugc.aweme;

import X.AbstractC42751GqB;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C31413CUn;
import X.C3C5;
import X.C42759GqJ;
import X.C61878OQg;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC42726Gpm;
import Y.ACListenerS27S0100000_7;
import Y.ACListenerS42S0200000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnchorRecentlyAddFragment extends AnchorBaseFragment {
    public boolean LJLJJI;
    public C31413CUn LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final List<AnchorCell> LJLJJLL = new ArrayList();

    @Override // com.ss.android.ugc.aweme.AnchorBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.ss.android.ugc.aweme.AnchorBaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void vl(boolean z) {
        this.LJLJJI = z;
        ((ViewAnimator) _$_findCachedViewById(R.id.msh)).setDisplayedChild(z ? 1 : 0);
        ((ViewAnimator) _$_findCachedViewById(R.id.ek6)).setDisplayedChild(z ? 1 : 0);
        Iterator<AnchorCell> it = this.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().isEditable = z;
        }
        C31413CUn c31413CUn = this.LJLJJL;
        if (c31413CUn != null) {
            c31413CUn.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RandomAccess randomAccess;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            randomAccess = arguments.getParcelableArrayList("recently_add");
        } else {
            randomAccess = null;
        }
        ((ArrayList) this.LJLJJLL).clear();
        List<AnchorCell> list = this.LJLJJLL;
        if (randomAccess == null) {
            randomAccess = C61878OQg.INSTANCE;
        }
        ((ArrayList) list).addAll(randomAccess);
        Iterator it = ((ArrayList) this.LJLJJLL).iterator();
        while (it.hasNext()) {
            ((AnchorCell) it.next()).isEditable = false;
        }
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.eix), new ACListenerS27S0100000_7(this, 110));
        TextView textView = (TextView) _$_findCachedViewById(R.id.mse);
        Context context = getContext();
        if (context != null) {
            str = context.getString(C42759GqJ.LIZIZ(AnchorBaseFragment.LJLJI).LIZ());
        }
        textView.setText(str);
        InterfaceC42726Gpm interfaceC42726Gpm = (InterfaceC42726Gpm) mo49getActivity();
        if (mo49getActivity() != null) {
            AbstractC42751GqB LIZ = C42759GqJ.LIZ(interfaceC42726Gpm, AnchorBaseFragment.LJLJI);
            C31413CUn c31413CUn = new C31413CUn();
            LIZ.LIZ(c31413CUn, LIZ.LIZ, "recently_Add");
            this.LJLJJL = c31413CUn;
            List<?> list2 = this.LJLJJLL;
            if (list2 == null) {
                list2 = new ArrayList<>();
            }
            c31413CUn.LJLIL = list2;
        }
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).setAdapter(this.LJLJJL);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((ViewAnimator) _$_findCachedViewById(R.id.msh)).setDisplayedChild(0);
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.mru), new ACListenerS27S0100000_7(this, 111));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.mrq), new ACListenerS42S0200000_7(this, interfaceC42726Gpm, 35));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.eix), new ACListenerS27S0100000_7(this, 114));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.ej4), new ACListenerS27S0100000_7(this, 116));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aw5, viewGroup, false);
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
