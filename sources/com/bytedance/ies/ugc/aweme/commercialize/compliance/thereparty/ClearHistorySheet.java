package com.bytedance.ies.ugc.aweme.commercialize.compliance.thereparty;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.C90923hY;
import X.C9KF;
import X.InterfaceC219588ja;
import X.SY4;
import Y.ACListenerS27S0100000_7;
import Y.AObserverS69S0100000_1;
import Y.IDFactoryS60S0000000_1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thereparty.ClearHistorySheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ClearHistorySheet extends Fragment implements InterfaceC219588ja {
    public static TuxSheet LJLJJI;
    public ActivityC45651qj LJLIL;
    public ComplianceVM LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

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

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            String string = activityC45651qj.getString(R.string.qy8);
            o.LJIIIIZZ(string, "activty.getString(R.stri…_ad_personalization_CA_2)");
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = string;
            c235119Kp.LIZJ = c9kf;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZIZ(C90923hY.LJLIL);
            c235119Kp.LIZIZ(LIZJ);
            c235119Kp.LIZLLL = true;
            return c235119Kp;
        }
        o.LJIJI("activty");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            ComplianceVM complianceVM = (ComplianceVM) ViewModelProviders.of(activityC45651qj, new IDFactoryS60S0000000_1(0)).get(ComplianceVM.class);
            this.LJLILLLLZI = complianceVM;
            if (complianceVM != null) {
                complianceVM.LJLJJI.observe(getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 138));
                C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.bek), new ACListenerS27S0100000_7(this, 166));
                C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.bej), new View.OnClickListener() { // from class: X.35e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        TuxSheet tuxSheet = ClearHistorySheet.LJLJJI;
                        if (tuxSheet != null) {
                            tuxSheet.dismiss();
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("click_choice", "cancel");
                            FMX.LJIIL("exit_clear_activity_page", c188727au.LIZ);
                            return;
                        }
                        o.LJIJI("sheet");
                        throw null;
                    }
                });
                return;
            }
            o.LJIJI("complianceVM");
            throw null;
        }
        o.LJIJI("activty");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cqf, viewGroup, false);
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
