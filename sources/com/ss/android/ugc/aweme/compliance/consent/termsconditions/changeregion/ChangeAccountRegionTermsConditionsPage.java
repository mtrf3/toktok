package com.ss.android.ugc.aweme.compliance.consent.termsconditions.changeregion;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C234529Ii;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C41248GGu;
import X.C46423IJv;
import X.C56642Ke;
import X.C5H3;
import X.C63093OpV;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.FMX;
import X.InterfaceC61213O0r;
import X.QD3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import yq4.a;

@InterfaceC61213O0r
/* loaded from: classes9.dex */
public final class ChangeAccountRegionTermsConditionsPage extends BaseFragment {
    public C63093OpV LJLILLLLZI;
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.optionalArg(this, C46423IJv.LJLIL, "enter_from", String.class);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C41248GGu.LJLIL);
        this.LJLILLLLZI = new C63093OpV(a.LJIJI().LIZLLL(), new AqS174S0100000_8(this, 0), new AqS174S0100000_8(this, 1), new AqS174S0100000_8(this, 2), new AqS174S0100000_8(this, 3), new AqS158S0100000_8(this, 3));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", (String) this.LJLIL.getValue());
        FMX.LJIIL("register_terms_show", c188727au.LIZ);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadcast(C56642Ke broadCastEvent) {
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        String string = JSONObjectProtectorUtils.getString(broadCastEvent.LJLIL, "eventName");
        if (string != null && o.LJ(string, "closeKRConsentBox") && (mo49getActivity = mo49getActivity()) != null) {
            mo49getActivity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.l_2);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ(new AqS158S0100000_8(this, 45));
        c252709vu.LIZJ(LIZJ);
        c252709vu.LJIILJJIL(false);
        C8VV.LIZ(this, false, new AqS174S0100000_8(this, 13));
    }

    public final void vl(String str, boolean z) {
        int i;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", (String) this.LJLIL.getValue());
        c188727au.LJIIIZ("content", str);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c188727au.LIZLLL(i, "click_type");
        FMX.LJIIL("register_terms_click", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ag9, viewGroup, false);
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
