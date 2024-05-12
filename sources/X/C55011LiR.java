package X;

import com.ss.android.ugc.aweme.ISmartLockService;

/* renamed from: X.LiR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55011LiR implements R5X {
    public final /* synthetic */ ISmartLockService LIZ;
    public final /* synthetic */ M78 LIZIZ;
    public final /* synthetic */ C54082LKk LIZJ;
    public final /* synthetic */ C55012LiS LIZLLL;

    @Override // X.R5X
    public final void onDialogShow() {
        this.LIZ.smartLockTipMaskShow(this.LIZJ.LIZ, this.LIZLLL.LJLIL.LIZIZ);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "inbox");
        FMX.LJIIL("express_login_authority_window_pop_up", c188727au.LIZ);
    }

    @Override // X.R5X
    public final void onFailure(int i) {
        this.LIZ.smartLockTipMaskDismiss();
        this.LIZIZ.LIZ();
    }

    @Override // X.R5X
    public final void onSuccess(MLL mll) {
        this.LIZ.smartLockTipMaskDismiss();
        this.LIZIZ.LIZ();
    }

    public C55011LiR(ISmartLockService iSmartLockService, M78 m78, C54082LKk c54082LKk, C55012LiS c55012LiS) {
        this.LIZ = iSmartLockService;
        this.LIZIZ = m78;
        this.LIZJ = c54082LKk;
        this.LIZLLL = c55012LiS;
    }
}
