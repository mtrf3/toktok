package com.ss.android.ugc.aweme.nows.archive.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C212428Vi;
import X.C29S;
import X.C3C5;
import X.C41216GFo;
import X.C5H3;
import X.C76800UCe;
import X.C79045V0n;
import X.C7GZ;
import X.C7M1;
import X.C7MK;
import X.C8VV;
import X.C90903hW;
import X.InterfaceC61213O0r;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class NowArchiveCalendarFragment extends BaseFragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C7M1.LJLIL, "enter_from", String.class);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        ((ArrayList) C7GZ.LIZ).clear();
        ((LinkedHashMap) C7GZ.LIZIZ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        fragmentConfiguration(C41216GFo.LJLIL);
        ((ArrayList) C7GZ.LIZ).clear();
        ((LinkedHashMap) C7GZ.LIZIZ).clear();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer LJI;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.d4, context)) != null) {
            int intValue = LJI.intValue();
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null && (window = LIZ.getWindow()) != null) {
                window.setNavigationBarColor(intValue);
            }
        }
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 293));
        C7MK.LJI("enter_now_memories_page", new AqS169S0100000_3(this, 294));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bxc, viewGroup, false);
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
