package com.ss.android.ugc.aweme.favorites.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C203727z6;
import X.C26045AKb;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC203737z7;
import Y.ACListenerS23S0100000_3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UnFavouritesFragment extends Fragment implements InterfaceC203737z7 {
    public static final /* synthetic */ int LJLJJL = 0;
    public String LJLIL;
    public Aweme LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C203727z6 LJLJI = new C203727z6();

    @Override // X.InterfaceC203737z7
    public final void ix() {
        String aid;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            aweme.setCollectStatus(0);
        }
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            return;
        }
        AwemeService.LIZ().g6(0, aid);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.InterfaceC203737z7
    public final void aB(Exception exc) {
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.cgd);
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC203737z7
    public final void gd(String str) {
        if (str == null) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJI.LJLILLLLZI = this;
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 59), view.findViewById(R.id.mt6));
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 60), view.findViewById(R.id.mt3));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aam, viewGroup, false);
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
