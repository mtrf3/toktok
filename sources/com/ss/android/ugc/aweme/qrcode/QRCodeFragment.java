package com.ss.android.ugc.aweme.qrcode;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C03880Dg;
import X.C04330Ez;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C38816FLg;
import X.C3C5;
import X.C5S1;
import X.C62112OZg;
import X.C62151OaJ;
import X.C62153OaL;
import X.C62155OaN;
import X.C62157OaP;
import X.C62162OaU;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78840Uwu;
import X.C78966Uyw;
import X.C90903hW;
import X.DialogC25756A8y;
import X.EF7;
import X.FMX;
import X.HG3;
import X.InterfaceC61213O0r;
import X.InterfaceC62152OaK;
import X.KL2;
import X.RBX;
import X.V1B;
import Y.AObjectS12S0001000_7;
import Y.AObjectS28S0000000_5;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes11.dex */
public class QRCodeFragment extends Hilt_QRCodeFragment implements View.OnClickListener, InterfaceC62152OaK {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public C62162OaU LJLJJI;
    public C62151OaJ LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public FrameLayout LJLJLJ;
    public C62157OaP LJLJLLL;
    public DialogC25756A8y LJLL;
    public View LJLLI;
    public C252709vu LJLLILLLL;
    public TextView LJLLJ;
    public boolean LJLLL;
    public List<Aweme> LJLLLL;

    @Override // X.InterfaceC62152OaK
    public final void P1() {
    }

    @Override // X.InterfaceC62152OaK
    public final void Xc() {
        DialogC25756A8y dialogC25756A8y = this.LJLL;
        if (dialogC25756A8y != null && !dialogC25756A8y.isShowing()) {
            DialogC25756A8y dialogC25756A8y2 = this.LJLL;
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y2, new Object[0], "void", new C65300Pk0(false, "()V", "-6434447474008081032")).LIZ) {
                dialogC25756A8y2.show();
            }
        }
        C62112OZg c62112OZg = new C62112OZg();
        c62112OZg.LJIILJJIL = this.LJLJJI.enterFrom;
        c62112OZg.LJIILL = "normal";
        c62112OZg.LJIILLIIL = "shaped";
        c62112OZg.LJIILIIL();
    }

    public final void vl() {
        DialogC25756A8y dialogC25756A8y = this.LJLL;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            this.LJLL.dismiss();
        }
    }

    @Override // X.InterfaceC62152OaK
    public final void Ie() {
        if (!mo49getActivity().isFinishing()) {
            vl();
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.q9n);
            c5s1.LJ();
            this.LJLJJLL.announceForAccessibility(getString(R.string.q9n));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (C78966Uyw.LJLJJL == this.LJLLLL) {
            C78966Uyw.LJLJJL = null;
        }
        C62151OaJ c62151OaJ = this.LJLJJL;
        if (c62151OaJ != null) {
            c62151OaJ.LIZ = null;
            c62151OaJ.LIZIZ = null;
        }
        vl();
    }

    @Override // androidx.fragment.app.Fragment
    public final View getView() {
        return this.LJLJLLL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(new AObjectS28S0000000_5(2));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.eys) {
            mo49getActivity().finish();
            return;
        }
        if (id == R.id.mik) {
            if (this.LJLJLLL.LJLJJL) {
                C62151OaJ c62151OaJ = this.LJLJJL;
                if (C04330Ez.LIZ(c62151OaJ.LIZIZ, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 || Build.VERSION.SDK_INT >= 33) {
                    c62151OaJ.LIZ.Xc();
                    C38816FLg.LIZJ(new ARunnableS46S0100000_10(c62151OaJ, 2));
                    return;
                } else {
                    c62151OaJ.LIZ();
                    return;
                }
            }
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(getString(R.string.exr));
            c5s1.LJ();
            view.announceForAccessibility(getString(R.string.exr));
            return;
        }
        if (id != R.id.mim) {
            return;
        }
        boolean z = false;
        if (MSAdaptionService.LJIIL().LJI(getContext())) {
            C16880lQ.LLZILL(Toast.makeText(getContext(), getString(R.string.f1i), 0));
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "qr_code_detail");
        c188727au.LJIIIZ("previous_page", this.LJLJJI.enterFrom);
        FMX.LJIIL("qr_code_scan_enter", c188727au.LIZ);
        Context context = getContext();
        if (this.LJLJJI.type == 4) {
            z = true;
        }
        QRCodePermissionActivity.LLFZ(context, z, -1);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C62157OaP c62157OaP;
        super.onViewCreated(view, bundle);
        fragmentConfiguration(new AObjectS12S0001000_7(1, 3));
        this.LJLLLL = C78966Uyw.LJLJJL;
        this.LJLLI = view.findViewById(R.id.bs_);
        this.LJLLILLLL = (C252709vu) view.findViewById(R.id.l_2);
        this.LJLLJ = (TextView) view.findViewById(R.id.jb9);
        this.LJLJJLL = (TextView) view.findViewById(R.id.mik);
        this.LJLJL = (TextView) view.findViewById(R.id.mim);
        this.LJLJLJ = (FrameLayout) view.findViewById(R.id.iik);
        C16880lQ.LJIJI(this.LJLJJLL, this);
        C16880lQ.LJIJI(this.LJLJL, this);
        C252709vu c252709vu = this.LJLLILLLL;
        C235119Kp c235119Kp = new C235119Kp();
        C62162OaU c62162OaU = this.LJLJJI;
        int i = R.string.pr5;
        if (c62162OaU == null) {
            string = getString(R.string.pr5);
        } else {
            int i2 = c62162OaU.type;
            String str = c62162OaU.objectId;
            if (i2 == 4 && TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), str)) {
                i = R.string.ik6;
            }
            string = getString(i);
        }
        C78840Uwu.LJJIL(c235119Kp, string, requireActivity());
        c252709vu.setNavActions(c235119Kp);
        if (this.LJLJJI == null) {
            mo49getActivity().finish();
            return;
        }
        int LJIILL = KL2.LJIILL(getContext(), KL2.LJIIIZ(getContext()));
        if (LJIILL < 660) {
            float f = LJIILL / 667.0f;
            this.LJLJLJ.setScaleX(f);
            this.LJLJLJ.setScaleY(f);
            float f2 = ((1.0f - f) * 400.0f) / 2.0f;
            float f3 = (32.0f * f) - f2;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LJLJLJ.getLayoutParams();
            layoutParams.topMargin = (int) KL2.LIZJ(getContext(), f3);
            this.LJLJLJ.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.LJLLJ.getLayoutParams();
            layoutParams2.topMargin = (int) KL2.LIZJ(getContext(), 16.0f - f2);
            this.LJLLJ.setLayoutParams(layoutParams2);
        }
        C62162OaU c62162OaU2 = this.LJLJJI;
        if (c62162OaU2 != null && c62162OaU2.type == 4) {
            c62157OaP = new C62155OaN(getContext());
        } else {
            c62157OaP = new C62157OaP(getContext());
        }
        this.LJLJLLL = c62157OaP;
        this.LJLJLJ.addView(c62157OaP);
        if (this.LJLL == null) {
            DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(requireContext());
            this.LJLL = dialogC25756A8y;
            dialogC25756A8y.LIZIZ(R.string.pra);
            V1B.LJLJJL(this.LJLL);
        }
        this.LJLJLLL.setOnBindQrCodeListener(new C62153OaL(this));
        this.LJLJLLL.setData(this.LJLJJI);
        this.LJLLI.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cv, getContext()));
        this.LJLJJLL.setTextColor(C04330Ez.LIZIZ(getContext(), R.color.s8));
        this.LJLJL.setTextColor(C04330Ez.LIZIZ(getContext(), R.color.s8));
        this.LJLJLLL.setQRCodeCardTitleColor(AnonymousClass636.LJIIIIZZ(R.attr.go, getContext()));
        this.LJLJLLL.setQRCodeCardSubtitleColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, getContext()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.f1, viewGroup, false);
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

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C62151OaJ c62151OaJ = this.LJLJJL;
        c62151OaJ.getClass();
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == -1) {
                    c62151OaJ.LIZ();
                    return;
                }
            }
            c62151OaJ.LIZ.Xc();
            C38816FLg.LIZJ(new ARunnableS46S0100000_10(c62151OaJ, 2));
        }
    }
}
