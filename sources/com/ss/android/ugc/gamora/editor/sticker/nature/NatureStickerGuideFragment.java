package com.ss.android.ugc.gamora.editor.sticker.nature;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.SY4;
import Y.ACListenerS21S0100000_1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NatureStickerGuideFragment extends Fragment {
    public SY4 LJLIL;
    public C252709vu LJLILLLLZI;
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
        View findViewById = view.findViewById(R.id.lvd);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tuxbutton)");
        this.LJLIL = (SY4) findViewById;
        this.LJLILLLLZI = (C252709vu) view.findViewById(R.id.luy);
        SY4 sy4 = this.LJLIL;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 124));
            C252709vu c252709vu = this.LJLILLLLZI;
            if (c252709vu != null) {
                C235119Kp c235119Kp = new C235119Kp();
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_x_mark_small;
                LIZJ.LIZIZ(new AqS151S0100000_1(this, 758));
                c235119Kp.LIZIZ(LIZJ);
                c252709vu.setNavActions(c235119Kp);
                return;
            }
            return;
        }
        o.LJIJI("continueBtn");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bvu, viewGroup, false);
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
