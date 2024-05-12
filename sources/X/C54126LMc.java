package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.qrcode.IQRCodeService;
import com.ss.android.ugc.aweme.qrcode.QRCodeServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.LMc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54126LMc implements InterfaceC54125LMb {
    public final LNP LJLIL;
    public ImageView LJLILLLLZI;
    public final String LJLJI;

    @Override // X.LM4
    public final void LIZ() {
    }

    @Override // X.LM4
    public final int LIZIZ() {
        return 8388629;
    }

    @Override // X.LM4
    public final void LIZJ() {
    }

    @Override // X.LM4
    public final void LJ(LMX lmx, int i) {
    }

    @Override // X.LM4
    public final void LJIIJ() {
    }

    @Override // X.LM4
    public final void LJIIL() {
    }

    @Override // X.LM4
    public final void LJIILJJIL() {
    }

    @Override // X.LM4
    public final void LJIIZILJ() {
    }

    @Override // X.LM4
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.LM4
    public final void onCreate() {
    }

    @Override // X.LM4
    public final void onDestroyView() {
    }

    @Override // X.LM4
    public final void onPause() {
    }

    @Override // X.LM4
    public final void onResume() {
    }

    @Override // X.LM4
    public final View LJII() {
        if (C35056DpM.LIZ == 2) {
            HomePageUIFrameService LIZ = HomePageUIFrameServiceImpl.LIZ();
            ActivityC45651qj activity = this.LJLIL.getActivity();
            o.LJI(activity);
            ImageView ivScanView = LIZ.ivScanView(activity);
            this.LJLILLLLZI = ivScanView;
            o.LJI(ivScanView);
            ViewParent parent = ivScanView.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(this.LJLILLLLZI, (ViewGroup) parent);
        } else {
            HomePageUIFrameService LIZ2 = HomePageUIFrameServiceImpl.LIZ();
            ActivityC45651qj activity2 = this.LJLIL.getActivity();
            o.LJI(activity2);
            this.LJLILLLLZI = LIZ2.buildScanIcon(activity2);
        }
        return this.LJLILLLLZI;
    }

    @Override // X.LM4
    public final boolean enabled() {
        Boolean LIZ = C54127LMd.LIZ.LIZ();
        o.LJIIIIZZ(LIZ, "getInstance().enableHomeScanQrcode");
        return LIZ.booleanValue();
    }

    @Override // X.LM4
    public final String getTag() {
        return this.LJLJI;
    }

    public C54126LMc(LNP mIEnvironmentConfig) {
        o.LJIIIZ(mIEnvironmentConfig, "mIEnvironmentConfig");
        this.LJLIL = mIEnvironmentConfig;
        this.LJLJI = LMF.SCAN.getTag();
    }

    @Override // X.LM4
    public final void LJFF(View view) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_hot");
        FMX.LJIIL("qr_code_scan_enter", c188727au.LIZ);
        IQRCodeService LJIIIIZZ = QRCodeServiceImpl.LJIIIIZZ();
        ActivityC45651qj activity = this.LJLIL.getActivity();
        o.LJI(activity);
        LJIIIIZZ.LIZIZ(activity, -1, false);
    }

    @Override // X.InterfaceC54125LMb
    public final void LJIIJJI(int i) {
        ImageView imageView = this.LJLILLLLZI;
        if (imageView == null) {
            return;
        }
        C55511LqV.LJIIJJI(i, imageView);
    }
}
