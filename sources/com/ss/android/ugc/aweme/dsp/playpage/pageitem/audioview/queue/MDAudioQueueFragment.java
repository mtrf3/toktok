package com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.InterfaceC91281Zs5;
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
import kotlin.jvm.internal.IDqS173S0200000_29;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MDAudioQueueFragment extends Fragment implements InterfaceC219588ja {
    public final InterfaceC91281Zs5 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C234529Ii c234529Ii = new C234529Ii();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark;
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new IDqS421S0100000_29(this, 22));
        C234529Ii c234529Ii2 = new C234529Ii();
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_flag;
        c234529Ii2.LIZ(c2068389v2);
        c234529Ii2.LIZIZ(new IDqS421S0100000_29(this, 23));
        C9KF c9kf = new C9KF();
        String string = getString(R.string.iho);
        o.LJIIIIZZ(string, "getString(R.string.music_dsp_queue)");
        c9kf.LIZJ = string;
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZIZ(c234529Ii2);
        c235119Kp.LIZLLL(c234529Ii);
        c235119Kp.LIZLLL = true;
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    public MDAudioQueueFragment(InterfaceC91281Zs5 interfaceC91281Zs5) {
        this.LJLIL = interfaceC91281Zs5;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new IDqS173S0200000_29(this, view, 6));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b4, viewGroup, false);
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
