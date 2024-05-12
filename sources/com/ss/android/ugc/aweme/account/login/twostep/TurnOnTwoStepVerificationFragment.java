package com.ss.android.ugc.aweme.account.login.twostep;

import X.AEY;
import X.AI8;
import X.AI9;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C41232GGe;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.GJ0;
import X.HG3;
import X.RBX;
import X.SY4;
import Y.ACListenerS27S0100000_7;
import Y.IDCListenerS207S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TurnOnTwoStepVerificationFragment extends BaseFragment {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 43));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 44));
    public final List<String> LJLJI = new ArrayList();

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
    public final void onViewCreated(View view, Bundle bundle) {
        String bindPhone;
        String email;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        fragmentConfiguration(C41232GGe.LJLIL);
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        TwoSvUserData twoSvUserData = (TwoSvUserData) this.LJLILLLLZI.getValue();
        if (twoSvUserData == null || (bindPhone = twoSvUserData.getMobile()) == null) {
            bindPhone = curUser.getBindPhone();
        }
        TwoSvUserData twoSvUserData2 = (TwoSvUserData) this.LJLILLLLZI.getValue();
        if (twoSvUserData2 == null || (email = twoSvUserData2.getEmail()) == null) {
            email = curUser.getEmail();
        }
        ((AI8) _$_findCachedViewById(R.id.c77)).LJ(true, true);
        AI8 ai8 = (AI8) _$_findCachedViewById(R.id.k63);
        if (bindPhone == null || bindPhone.length() == 0) {
            bindPhone = getString(R.string.tx);
        }
        ai8.setTitle(bindPhone);
        ai8.LJ(true, false);
        AI9 accessory = ai8.getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.CheckBox");
        ((AEY) accessory).LJIILL(new IDCListenerS207S0100000_7(this, 0));
        AI8 ai82 = (AI8) _$_findCachedViewById(R.id.cth);
        if (email == null || email.length() == 0) {
            email = getString(R.string.mu);
        }
        ai82.setTitle(email);
        ai82.LJ(false, true);
        AI9 accessory2 = ai82.getAccessory();
        o.LJII(accessory2, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.CheckBox");
        ((AEY) accessory2).LJIILL(new IDCListenerS207S0100000_7(this, 1));
        if (GJ0.LIZ()) {
            AI8 ai83 = (AI8) _$_findCachedViewById(R.id.liv);
            ai83.LJ(false, true);
            ai83.setVisibility(0);
            AI9 accessory3 = ai83.getAccessory();
            o.LJII(accessory3, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.CheckBox");
            ((AEY) accessory3).LJIILL(new IDCListenerS207S0100000_7(this, 2));
        }
        AI8 ai84 = (AI8) _$_findCachedViewById(R.id.hin);
        ai84.LJ(true, true);
        AI9 accessory4 = ai84.getAccessory();
        o.LJII(accessory4, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.CheckBox");
        ((AEY) accessory4).LJIILL(new IDCListenerS207S0100000_7(this, 3));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.ltu), new ACListenerS27S0100000_7(this, 9));
    }

    public final void vl(String str, boolean z) {
        boolean z2;
        if (z) {
            ((ArrayList) this.LJLJI).add(str);
        } else {
            ((ArrayList) this.LJLJI).remove(str);
        }
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.ltu);
        if (((ArrayList) this.LJLJI).size() >= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        sy4.setEnabled(z2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.o5, viewGroup, false);
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
