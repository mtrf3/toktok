package com.ss.android.ugc.aweme.paidcontent.fragments;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C78496UrM;
import X.C79045V0n;
import X.C90903hW;
import X.FMX;
import X.InterfaceC219588ja;
import X.InterfaceC65784Pro;
import X.JBR;
import X.SY4;
import X.W5F;
import X.W5U;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.experiment.PaidContentImageSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromoteDialogFragment extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJLLL = 0;
    public InterfaceC65784Pro<C76800UCe> LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public TuxIconView LJLJJL;
    public SmartImageView LJLJJLL;
    public LinearLayout LJLJL;
    public SY4 LJLJLJ;

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        return null;
    }

    public PromoteDialogFragment() {
        new LinkedHashMap();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer LJI;
        o.LJIIIZ(view, "view");
        TuxIconView tuxIconView = this.LJLJJL;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 106));
        }
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.cl, context)) != null) {
            int intValue = LJI.intValue();
            TuxIconView tuxIconView2 = this.LJLJJL;
            if (tuxIconView2 != null) {
                tuxIconView2.setBackgroundColor(intValue);
            }
        }
        LinearLayout linearLayout = this.LJLJL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        PaidContentImageSettings.LIZ.getClass();
        W5F LJIIIIZZ = W5U.LJIIIIZZ(PaidContentImageSettings.LIZ().seriesPromoteDialogImage.light);
        LJIIIIZZ.LJJIIJ = this.LJLJJLL;
        C16880lQ.LLJJJ(LJIIIIZZ);
        SY4 sy4 = this.LJLJLJ;
        if (sy4 != null) {
            sy4.setText(this.LJLILLLLZI);
        }
        SY4 sy42 = this.LJLJLJ;
        if (sy42 != null) {
            C16880lQ.LJJIZ(sy42, new ACListenerS24S0100000_4(this, 107));
        }
        FMX.LJIIL("show_info_show_off_series", JBR.LJIIIIZZ("enter_from", this.LJLJI, "author_id", this.LJLJJI).LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.aix, viewGroup, false, "inflater.inflate(R.layou…dialog, container, false)");
        this.LJLJJL = (TuxIconView) LIZIZ.findViewById(R.id.ibf);
        this.LJLJL = (LinearLayout) LIZIZ.findViewById(R.id.ibi);
        this.LJLJJLL = (SmartImageView) LIZIZ.findViewById(R.id.ibh);
        this.LJLJLJ = (SY4) LIZIZ.findViewById(R.id.ibg);
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
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
        return LIZIZ;
    }
}
