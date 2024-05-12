package com.ss.android.ugc.aweme.tools.draft;

import X.AEY;
import X.AI8;
import X.AI9;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.GO2;
import Y.IDCListenerS205S0100000_4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DraftSettingFragment extends Fragment {
    public String LJLIL;
    public String LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("enter_from", "");
            o.LJIIIIZZ(string, "getString(AVMob.Key.ENTER_FROM, \"\")");
            this.LJLIL = string;
            String string2 = arguments.getString("page_type", "");
            o.LJIIIIZZ(string2, "getString(\"page_type\", \"\")");
            this.LJLILLLLZI = string2;
        }
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string3 = getString(R.string.q8r);
        o.LJIIIIZZ(string3, "getString(R.string.save_draft_postdraft_draftsett)");
        c9kf.LIZJ = string3;
        c235119Kp.LIZJ = c9kf;
        C234529Ii c234529Ii = new C234529Ii();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark;
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 1210));
        c235119Kp.LIZIZ(c234529Ii);
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
        View findViewById = view.findViewById(R.id.aa9);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.autoSaveTextCell)");
        AI9 accessory = ((AI8) findViewById).getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        AEY aey = (AEY) accessory;
        GO2.LIZ.getClass();
        aey.LJIILIIL(GO2.LIZJ.getBoolean("posted_draft_status", true));
        aey.LJIILL(new IDCListenerS205S0100000_4(this, 8));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.anj, viewGroup, false);
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
