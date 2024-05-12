package com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C252949wI;
import X.C29S;
import X.C3C5;
import X.C73495Sst;
import X.C76800UCe;
import X.C85650XjS;
import X.C85665Xjh;
import X.C90903hW;
import X.RBV;
import X.SY4;
import X.X1D;
import Y.ACListenerS35S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class RuInstantLoginSIModeFragment extends BaseAccountFlowFragment {
    public C73495Sst LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLZ).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
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

    @Override // X.InterfaceC69056R8i
    public final void ee(int i) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return false;
    }

    public final void LJIJ() {
        ((SY4) _$_findCachedViewById(R.id.g_8)).setLoading(false);
        _$_findCachedViewById(R.id.g_8).setClickable(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C73495Sst c73495Sst = this.LJLLLLLL;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.eo8);
        if (c252949wI != null) {
            c252949wI.LIZIZ(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C85665Xjh c85665Xjh = (C85665Xjh) _$_findCachedViewById(R.id.g_9);
        EditText editText = c85665Xjh.getEditText();
        editText.setInputType(3);
        editText.addTextChangedListener(new C85650XjS(this, editText));
        editText.setHint(getString(R.string.idp));
        PhoneNumberUtil.PhoneNumber LJ = RBV.LJ(this);
        if (LJ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(LJ.getCountryCode());
            c85665Xjh.setCountryCode(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(LJ.getCountryIso());
            c85665Xjh.setCountryName(X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("");
            LIZ3.append(LJ.getNationalNumber());
            c85665Xjh.setPhoneNumber(X1D.LIZIZ(LIZ3));
        } else {
            c85665Xjh.LIZJ();
        }
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        c85665Xjh.LJLILLLLZI = enterFrom;
        c85665Xjh.LJLJI = "login";
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.g_8), new ACListenerS35S0100000_15(this, 165));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.g4d), new ACListenerS35S0100000_15(this, 166));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.nu, viewGroup, false);
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
