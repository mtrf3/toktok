package com.ss.android.ugc.aweme.kids.commonfeed.more.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C7FR;
import X.C7FT;
import X.C90903hW;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MoreBottomSheetFragment extends BottomSheetDialogFragment {
    public Aweme LJLIL;
    public C7FR LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final List<C7FT> LJLJI = new ArrayList();

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

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        View view2 = getView();
        Object obj = null;
        if (view2 != null) {
            obj = view2.getParent();
        }
        if ((obj instanceof View) && (view = (View) obj) != null) {
            view.setBackgroundColor(0);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_aweme");
        } else {
            serializable = null;
        }
        Aweme aweme = (Aweme) serializable;
        this.LJLIL = aweme;
        if (aweme == null) {
            return;
        }
        C7FT c7ft = new C7FT();
        c7ft.LIZJ = new AqS170S0100000_4(this, 1115);
        ((ArrayList) this.LJLJI).add(c7ft);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        o.LJI(context);
        C7FR c7fr = new C7FR(context);
        this.LJLILLLLZI = c7fr;
        List<C7FT> datas = this.LJLJI;
        o.LJIIIZ(datas, "datas");
        ((ArrayList) c7fr.LJLILLLLZI).clear();
        ((ArrayList) c7fr.LJLILLLLZI).addAll(datas);
        c7fr.notifyDataSetChanged();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.gmk);
        recyclerView.setAdapter(this.LJLILLLLZI);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.avm), new ACListenerS23S0100000_3(this, 261));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View inflate = View.inflate(getContext(), R.layout.bfh, viewGroup);
        C29S c29s = null;
        if (!(inflate instanceof View)) {
            inflate = null;
        }
        if (inflate != null) {
            try {
                ViewTreeLifecycleOwner.set(inflate, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(inflate, this);
                C10A.LIZIZ(inflate, this);
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
        return inflate;
    }
}
