package com.ss.android.ugc.aweme.bnpl.biz.credit.phone;

import X.ActivityC45651qj;
import X.AnonymousClass894;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C1B3;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C39647FhD;
import X.C3C5;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C91924a2S;
import X.C92217a7B;
import X.C92596aDI;
import X.C92597aDJ;
import X.InterfaceC61213O0r;
import X.InterfaceC65784Pro;
import X.QD3;
import X.SY4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes20.dex */
public final class PhoneNumberFragment extends BaseFragment {
    public final C214298b3 LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    public PhoneNumberFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(PhoneNumberVM.class);
        this.LJLILLLLZI = new C214298b3(LIZ, new IDqS422S0100000_31(LIZ, 56), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C92597aDJ.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Window window;
        fragmentConfiguration(C92596aDI.LJLIL);
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        C91924a2S c91924a2S = C91924a2S.LIZ;
        PhoneRouteArg phoneRouteArg = (PhoneRouteArg) this.LJLIL.getValue();
        if (phoneRouteArg != null) {
            str = phoneRouteArg.getPreviousPageId();
        } else {
            str = null;
        }
        c91924a2S.LIZIZ("bnpl_activate_phone_number", str);
    }

    @QD3
    public final void onEvent(C92217a7B event) {
        o.LJIIIZ(event, "event");
        requireActivity().finish();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new IDqS418S0100000_31(this, 29));
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_chevron_left_ltr;
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 107));
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.fj);
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL(c234529Ii);
        c235119Kp.LIZJ(0);
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        ((TuxTextView) _$_findCachedViewById(R.id.fn)).LJJJ(32.0f);
        ((TuxTextView) _$_findCachedViewById(R.id.fl)).LJJJ(12.0f);
        ((TextView) _$_findCachedViewById(R.id.fl)).setHighlightColor(0);
        ((TextView) _$_findCachedViewById(R.id.fl)).setMovementMethod(AnonymousClass894.LIZ());
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LJIIIIZZ(R.id.fa, 1, new PhoneNumberEditorFragment(), null);
        c1b3.LJIILJJIL();
        _$_findCachedViewById(R.id.fi).getClass();
        _$_findCachedViewById(R.id.f_).getClass();
        _$_findCachedViewById(R.id.f_).setVisibility(8);
        ((SY4) _$_findCachedViewById(R.id.fi)).setEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a_, viewGroup, false);
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
