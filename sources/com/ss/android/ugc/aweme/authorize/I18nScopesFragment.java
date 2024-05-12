package com.ss.android.ugc.aweme.authorize;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C61949OSz;
import X.C76800UCe;
import X.C88253dF;
import X.C90903hW;
import X.InterfaceC36163EHf;
import X.OT6;
import X.OTK;
import X.OTT;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS30S0100000_10;
import Y.AObserverS69S0100000_1;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class I18nScopesFragment extends Fragment implements InterfaceC36163EHf {
    public static final /* synthetic */ int LJLJL = 0;
    public OT6 LJLIL;
    public AuthCommonViewModel LJLILLLLZI;
    public AwemeAuthorizePlatformDepend LJLJI;
    public OTK LJLJJI;
    public C88253dF LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLIL = new OT6(getArguments());
        this.LJLJI = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LJLJI;
        if (awemeAuthorizePlatformDepend != null) {
            this.LJLJJI = new OTK(context, awemeAuthorizePlatformDepend);
            Application application = requireActivity().getApplication();
            o.LJIIIIZZ(application, "requireActivity().application");
            AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.LJLJI;
            if (awemeAuthorizePlatformDepend2 != null) {
                OTK otk = this.LJLJJI;
                if (otk != null) {
                    OT6 ot6 = this.LJLIL;
                    if (ot6 != null) {
                        this.LJLILLLLZI = (AuthCommonViewModel) ViewModelProviders.of(requireActivity(), new OTT(application, awemeAuthorizePlatformDepend2, otk, ot6, C61949OSz.LIZ(getArguments()))).get(AuthCommonViewModel.class);
                        return;
                    } else {
                        o.LJIJI("request");
                        throw null;
                    }
                }
                o.LJIJI("model");
                throw null;
            }
            o.LJIJI("depend");
            throw null;
        }
        o.LJIJI("depend");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJL = new C88253dF();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.fts);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.fts);
        C88253dF c88253dF = this.LJLJJL;
        if (c88253dF != null) {
            recyclerView2.setAdapter(c88253dF);
            _$_findCachedViewById(R.id.aeh).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS30S0100000_10(this, 3)));
            AuthCommonViewModel authCommonViewModel = this.LJLILLLLZI;
            if (authCommonViewModel != null) {
                authCommonViewModel.LJLLI.observe(this, new AObserverS69S0100000_1(this, 0));
                return;
            } else {
                o.LJIJI("viewModel");
                throw null;
            }
        }
        o.LJIJI("nameListAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.awf, inflater, null);
        if (!(LLLZIIL instanceof View)) {
            LLLZIIL = null;
        }
        if (LLLZIIL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLZIIL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLZIIL, this);
                C10A.LIZIZ(LLLZIIL, this);
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
        return LLLZIIL;
    }
}
