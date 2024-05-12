package com.ss.android.ugc.aweme.profile.ui;

import X.C16880lQ;
import X.InterfaceC238009Vs;
import X.InterfaceC238019Vt;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ProfileDetailEditFragment extends DialogFragment {
    public InterfaceC238009Vs LJLIL;
    public InterfaceC238019Vt LJLILLLLZI;
    public Map<Integer, View> LJLJI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this.LJLJI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void vl() {
        InterfaceC238009Vs interfaceC238009Vs = this.LJLIL;
        if (interfaceC238009Vs != null) {
            interfaceC238009Vs.k4();
        }
    }

    public final void Al(InterfaceC238019Vt mUsernameSubmitReturnListener) {
        o.LJIIIZ(mUsernameSubmitReturnListener, "mUsernameSubmitReturnListener");
        this.LJLILLLLZI = mUsernameSubmitReturnListener;
    }

    public final void wl(boolean z) {
        InterfaceC238019Vt interfaceC238019Vt = this.LJLILLLLZI;
        if (interfaceC238019Vt != null) {
            interfaceC238019Vt.b4(z);
        }
    }

    public final void xl(InterfaceC238009Vs mProfileReturnListener) {
        o.LJIIIZ(mProfileReturnListener, "mProfileReturnListener");
        this.LJLIL = mProfileReturnListener;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        try {
            super.show(manager, str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
