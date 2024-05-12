package com.ss.android.ugc.aweme.pns.universalpopup.uiextension.defaultui;

import X.AR7;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C26227ARb;
import X.C26231ARf;
import X.C29S;
import X.C3AW;
import X.C3C5;
import X.C76800UCe;
import X.C77123UOp;
import X.C78857UxB;
import X.C90903hW;
import X.UC0;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UniversalPopupDialogUI extends UniversalPopupUI {
    public C26227ARb LJLJJL;
    public C26231ARf LJLJJLL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C26231ARf c26231ARf = this.LJLJJLL;
        if (c26231ARf == null) {
            return;
        }
        c26231ARf.LIZIZ(null);
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Al(SpannableStringBuilder spannableStringBuilder) {
        C26227ARb c26227ARb = this.LJLJJL;
        if (c26227ARb != null) {
            c26227ARb.LIZIZ(spannableStringBuilder);
        } else {
            o.LJIJI("dialogBuilder");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Hl(String title) {
        o.LJIIIZ(title, "title");
        C26227ARb c26227ARb = this.LJLJJL;
        if (c26227ARb != null) {
            c26227ARb.LJFF(title);
        } else {
            o.LJIJI("dialogBuilder");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        C26227ARb LIZ = C3AW.LIZ(context);
        LIZ.LJIIIIZZ = false;
        LIZ.LJII = false;
        LIZ.LJIILIIL = 1;
        this.LJLJJL = LIZ;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void xl(Map<String, String> map) {
        if (this.LJLJJLL == null) {
            C26227ARb c26227ARb = this.LJLJJL;
            if (c26227ARb != null) {
                C26231ARf LJI = c26227ARb.LJI();
                this.LJLJJLL = LJI;
                LJI.LIZLLL();
                return;
            }
            o.LJIJI("dialogBuilder");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Gl(String iconUrl, String iconUrlDark) {
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(iconUrlDark, "iconUrlDark");
        if (ujb.o.LJJJJJL(iconUrl)) {
            return;
        }
        SmartImageView smartImageView = new SmartImageView(requireContext());
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(iconUrl);
        LJIIIIZZ.LIZJ = requireContext();
        LJIIIIZZ.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LJIIIIZZ);
        C26227ARb c26227ARb = this.LJLJJL;
        if (c26227ARb != null) {
            C78857UxB.LJJI(c26227ARb, smartImageView, null);
        } else {
            o.LJIJI("dialogBuilder");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Dl(List list, Boolean bool, AqS169S0100000_3 aqS169S0100000_3) {
        if (o.LJ(bool, Boolean.TRUE)) {
            C26227ARb c26227ARb = this.LJLJJL;
            if (c26227ARb != null) {
                C77123UOp.LJIILL(c26227ARb, new AqS135S0200000_4(aqS169S0100000_3, list, 191));
                return;
            } else {
                o.LJIJI("dialogBuilder");
                throw null;
            }
        }
        C26227ARb c26227ARb2 = this.LJLJJL;
        if (c26227ARb2 != null) {
            UC0.LIZJ(c26227ARb2, new AqS135S0200000_4(aqS169S0100000_3, list, 194));
        } else {
            o.LJIJI("dialogBuilder");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        inflater.getContext().setTheme(R.style.ul);
        ConstraintLayout constraintLayout = AR7.LIZ(inflater, viewGroup).LJLIL;
        C29S c29s = null;
        if (!(constraintLayout instanceof View)) {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(constraintLayout, this);
                C10A.LIZIZ(constraintLayout, this);
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
        return constraintLayout;
    }
}
