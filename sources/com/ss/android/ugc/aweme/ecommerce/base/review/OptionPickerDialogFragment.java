package com.ss.android.ugc.aweme.ecommerce.base.review;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C70819Rqp;
import X.C76800UCe;
import X.C7MY;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class OptionPickerDialogFragment extends ECBaseFragment implements InterfaceC219588ja, DialogInterface.OnDismissListener {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public String LJLIL;
    public String LJLILLLLZI;
    public ArrayList<Option> LJLJI;
    public boolean LJLJJL;
    public AbstractC65781Prl LJLJJLL;
    public AbstractC65781Prl LJLJL;
    public AqS178S0100000_12 LJLJLJ;
    public AbstractC65781Prl LJLJLLL;
    public AbstractC65781Prl LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public boolean LJLJJI = true;

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL = true;
        String str = this.LJLIL;
        if (str != null) {
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = str;
            c235119Kp.LIZJ = c9kf;
        }
        C234529Ii c234529Ii = new C234529Ii();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark_fill_small;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c2068389v.LIZIZ = C7MY.LIZIZ(24);
        c2068389v.LIZJ = C7MY.LIZIZ(24);
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new AqS162S0100000_12(this, 403));
        c235119Kp.LIZIZ(c234529Ii);
        return c235119Kp;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Ynt, X.Prl] */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        ?? r3;
        super.onStop();
        if (!this.LJLJJL && (r3 = this.LJLL) != 0) {
            r3.invoke(getView(), "close", Long.valueOf(getStayDuration()));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        ArrayList<Option> arrayList;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("title");
        } else {
            str = null;
        }
        this.LJLIL = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("init_option_key");
        }
        this.LJLILLLLZI = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (arrayList = arguments3.getParcelableArrayList("option_list")) == null) {
            arrayList = new ArrayList<>();
        }
        this.LJLJI = arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.Ynt, X.Prl] */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        this.LJLJJL = true;
        ?? r4 = this.LJLL;
        if (r4 != 0) {
            View view = getView();
            if (this.LJLJJI) {
                str = "return";
            } else {
                str = "next";
            }
            r4.invoke(view, str, Long.valueOf(getStayDuration()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.Yns, X.Prl] */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ArrayList<Option> arrayList = this.LJLJI;
        if (arrayList != null) {
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.isn);
            C70819Rqp c70819Rqp = new C70819Rqp(this, arrayList);
            c70819Rqp.LJLILLLLZI = this.LJLILLLLZI;
            recyclerView2.setAdapter(c70819Rqp);
        }
        View done_button = _$_findCachedViewById(R.id.cf0);
        o.LJIIIIZZ(done_button, "done_button");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 99, 42), done_button);
        ?? r0 = this.LJLJLLL;
        if (r0 != 0) {
            r0.invoke(view);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a0s, viewGroup, false);
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
