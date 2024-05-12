package com.ss.android.ugc.aweme.bnpl.biz.credit.landing;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.AnonymousClass894;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C2068389v;
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
import X.C79045V0n;
import X.C8VV;
import X.C90903hW;
import X.C91795a0N;
import X.C91924a2S;
import X.C91930a2Y;
import X.C92006a3m;
import X.C92173a6T;
import X.C92216a7A;
import X.C92217a7B;
import X.C92580aD2;
import X.C92581aD3;
import X.C92582aD4;
import X.C92583aD5;
import X.InterfaceC61213O0r;
import X.InterfaceC65784Pro;
import X.KL2;
import X.QD3;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.bnpl.network.model.BNPLEntryData;
import com.ss.android.ugc.aweme.bnpl.network.model.UserAgreement;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes20.dex */
public final class LandingFragment extends BaseFragment {
    public final C214298b3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

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

    public LandingFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(LandingAssemVM.class);
        this.LJLIL = new C214298b3(LIZ, new IDqS422S0100000_31(LIZ, 54), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C92583aD5.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLILLLLZI = RouteArgExtension.INSTANCE.optionalArg(this, C92582aD4.LJLIL, "previous_page_id", String.class);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C92580aD2.LJLIL);
        activityConfiguration(C92581aD3.LJLIL);
        super.onCreate(bundle);
        EventBus.LIZJ().LJIILJJIL(this);
        C91924a2S.LIZ.LIZIZ("bnpl_activate_landing", (String) this.LJLILLLLZI.getValue());
    }

    @QD3
    public final void onEvent(C92216a7A event) {
        o.LJIIIZ(event, "event");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @QD3
    public final void onEvent(C92217a7B event) {
        o.LJIIIZ(event, "event");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int LJIIIIZZ;
        String str;
        UserAgreement userAgreement;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new IDqS418S0100000_31(this, 24));
        _$_findCachedViewById(R.id.ew).getLayoutParams().height = KL2.LJIIL(requireActivity());
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_chevron_left_ltr;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 105));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getResources().getString(R.string.jp_));
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        Integer LJI = C79045V0n.LJI(R.attr.dj, requireActivity);
        if (LJI != null) {
            LJIIIIZZ = LJI.intValue();
        } else {
            ActivityC45651qj requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.dj, requireActivity2);
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(LJIIIIZZ), 0, spannableStringBuilder.length(), 34);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.es);
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL(c234529Ii);
        c235119Kp.LIZJ(0);
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        C252709vu bnpl_landing_nav_bar = (C252709vu) _$_findCachedViewById(R.id.es);
        o.LJIIIIZZ(bnpl_landing_nav_bar, "bnpl_landing_nav_bar");
        C91930a2Y.LIZ(bnpl_landing_nav_bar, getContext(), false);
        C91795a0N c91795a0N = (C91795a0N) _$_findCachedViewById(R.id.ec);
        ActivityC45651qj requireActivity3 = requireActivity();
        o.LJIIIIZZ(requireActivity3, "requireActivity()");
        int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.dj, requireActivity3);
        ActivityC45651qj requireActivity4 = requireActivity();
        o.LJIIIIZZ(requireActivity4, "requireActivity()");
        c91795a0N.LIZIZ(LJIIIIZZ2, AnonymousClass636.LJIIIIZZ(R.attr.dl, requireActivity4));
        _$_findCachedViewById(R.id.eo).getClass();
        ((C92173a6T) _$_findCachedViewById(R.id.ez)).LJJLL();
        TextView textView = (TextView) _$_findCachedViewById(R.id.et);
        ActivityC45651qj requireActivity5 = requireActivity();
        o.LJIIIIZZ(requireActivity5, "requireActivity()");
        BNPLEntryData bNPLEntryData = C92006a3m.LIZ;
        if (bNPLEntryData == null || (userAgreement = bNPLEntryData.getUserAgreement()) == null || (str = userAgreement.getLandingAgreement()) == null) {
            str = "";
        }
        textView.setText(C92006a3m.LIZ(requireActivity5, str, R.attr.dj, new IDqS418S0100000_31(this, 90)));
        ((TuxTextView) _$_findCachedViewById(R.id.et)).LJJJ(12.0f);
        ((TextView) _$_findCachedViewById(R.id.et)).setHighlightColor(0);
        ((TextView) _$_findCachedViewById(R.id.et)).setMovementMethod(AnonymousClass894.LIZ());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a8, viewGroup, false);
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
