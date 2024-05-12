package com.ss.android.ugc.aweme.pns.universalpopup.uiextension.defaultui;

import X.AR7;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C1B3;
import X.C26224AQy;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C78555UsJ;
import X.C8GN;
import X.C90903hW;
import X.ORZ;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UniversalPopupFullscreenUI extends UniversalPopupUI {
    public final C26224AQy LJLJJL;

    public UniversalPopupFullscreenUI() {
        C26224AQy c26224AQy = new C26224AQy();
        c26224AQy.LJIILIIL = false;
        c26224AQy.LJIILL = true;
        this.LJLJJL = c26224AQy;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Al(SpannableStringBuilder spannableStringBuilder) {
        C26224AQy c26224AQy = this.LJLJJL;
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        c26224AQy.LJIIJJI = C78555UsJ.LJIJ(requireContext, spannableStringBuilder);
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Hl(String title) {
        o.LJIIIZ(title, "title");
        C26224AQy c26224AQy = this.LJLJJL;
        c26224AQy.getClass();
        c26224AQy.LJ = title;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void xl(Map<String, String> map) {
        C26224AQy c26224AQy = this.LJLJJL;
        c26224AQy.LJIILJJIL = false;
        TuxIntroFragment tuxIntroFragment = new TuxIntroFragment();
        tuxIntroFragment.LJLIL = c26224AQy;
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LJIIJ(tuxIntroFragment, null, R.id.mtc);
        c1b3.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Gl(String iconUrl, String iconUrlDark) {
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(iconUrlDark, "iconUrlDark");
        C26224AQy c26224AQy = this.LJLJJL;
        AqS29S1000000_4 aqS29S1000000_4 = new AqS29S1000000_4(iconUrl, 17);
        c26224AQy.getClass();
        c26224AQy.LIZJ = aqS29S1000000_4;
        c26224AQy.LIZLLL = 3;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Dl(List list, Boolean bool, AqS169S0100000_3 aqS169S0100000_3) {
        C8GN c8gn = (C8GN) ORZ.LJLLLLLL(0, list);
        if (c8gn != null) {
            C26224AQy c26224AQy = this.LJLJJL;
            String str = c8gn.LJLIL;
            AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(aqS169S0100000_3, c8gn, 195);
            c26224AQy.LJII = str;
            c26224AQy.LJIIIZ = aqS135S0200000_4;
        }
        C8GN c8gn2 = (C8GN) ORZ.LJLLLLLL(1, list);
        if (c8gn2 == null) {
            return;
        }
        C26224AQy c26224AQy2 = this.LJLJJL;
        String str2 = c8gn2.LJLIL;
        AqS135S0200000_4 aqS135S0200000_42 = new AqS135S0200000_4(aqS169S0100000_3, c8gn2, 196);
        c26224AQy2.LJIIIIZZ = str2;
        c26224AQy2.LJIIJ = aqS135S0200000_42;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        inflater.getContext().setTheme(R.style.ul);
        ConstraintLayout constraintLayout = AR7.LIZ(inflater, viewGroup).LJLIL;
        constraintLayout.setBackgroundColor(-1);
        try {
            ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(constraintLayout, this);
            C10A.LIZIZ(constraintLayout, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return constraintLayout;
    }
}
