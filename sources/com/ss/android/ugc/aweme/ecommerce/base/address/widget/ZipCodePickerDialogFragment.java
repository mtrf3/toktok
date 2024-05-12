package com.ss.android.ugc.aweme.ecommerce.base.address.widget;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C238719Yl;
import X.C26059AKp;
import X.C26748Aee;
import X.C29021By;
import X.C29S;
import X.C3C5;
import X.C70858RrS;
import X.C70921RsT;
import X.C70922RsU;
import X.C76800UCe;
import X.C78915Uy7;
import X.C78946Uyc;
import X.C90903hW;
import X.InterfaceC60061Nhh;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0100100_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ZipCodePickerDialogFragment extends ECBaseFragment implements InterfaceC60061Nhh {
    public static final /* synthetic */ int LJLJJL = 0;
    public TuxSheet LJLIL;
    public long LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public String LJLJI = "close";

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
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

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "Select Postcode";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LJLILLLLZI != 0) {
            C78946Uyc.LJJII(this, new C70921RsT(), new AqS29S0100100_4(SystemClock.elapsedRealtime() - this.LJLILLLLZI, this, 1));
            this.LJLILLLLZI = 0L;
        }
        this.LJLIL = null;
        C26059AKp.LIZ().LIZIZ("ec_zipcode_selected_event", this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        if (ActivityStack.isAppBackGround()) {
            str = "close";
        } else if (requireActivity().isFinishing()) {
            str = "return";
        } else {
            str = "next";
        }
        this.LJLJI = str;
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        C78915Uy7.LJJIL(params, C26748Aee.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C26059AKp.LIZ().LIZJ("ec_zipcode_selected_event", this);
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        TuxSheet tuxSheet;
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_zipcode_selected_event") && (tuxSheet = this.LJLIL) != null) {
            tuxSheet.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLILLLLZI = SystemClock.elapsedRealtime();
        Bundle arguments = getArguments();
        ArrayList<String> arrayList = null;
        if (arguments != null) {
            arrayList = arguments.getStringArrayList("zipcode");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("title")) != null) {
            ((TextView) _$_findCachedViewById(R.id.mo6)).setText(string);
        }
        if (arrayList != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j_t);
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            C238719Yl c238719Yl = new C238719Yl();
            ((RecyclerView) _$_findCachedViewById(R.id.j_t)).setAdapter(c238719Yl);
            ((RecyclerView) _$_findCachedViewById(R.id.j_t)).LJII(new C29021By(getContext(), 1), -1);
            c238719Yl.LJLIL = arrayList;
            c238719Yl.notifyDataSetChanged();
        }
        View icon_X = _$_findCachedViewById(R.id.eaj);
        o.LJIIIIZZ(icon_X, "icon_X");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 28, 42), icon_X);
        C78946Uyc.LJJIIJ(view, new C70922RsU(), new AqS170S0100000_4((ArrayList) arrayList, (ArrayList<String>) 227));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.xj, viewGroup, false);
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
