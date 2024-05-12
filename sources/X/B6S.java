package X;

import com.bytedance.android.livesdk.pip.PipVideoViewContainDialog;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class B6S implements B6U {
    public final /* synthetic */ PipVideoViewContainDialog LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;

    @Override // X.B6U
    public final void LIZ() {
        C0NB.LJIIIZ("picture_in_picture", "startCountDownTime onFinish() ");
        this.LIZ.LJLL = null;
        this.LIZIZ.invoke();
    }

    @Override // X.B6U
    public final void LIZIZ(int i) {
        QZP.LIZJ("startCountDownTime start time length is ", i, "picture_in_picture");
        C47121t6 c47121t6 = this.LIZ.LJLJLLL;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILL(R.string.nni, Integer.valueOf(i)));
        }
    }

    @Override // X.B6U
    public final void onStart(int i) {
        QZP.LIZJ("startCountDownTime start time length is ", i, "picture_in_picture");
        C47121t6 c47121t6 = this.LIZ.LJLJLLL;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILL(R.string.nni, Integer.valueOf(i)));
        }
    }

    public B6S(PipVideoViewContainDialog pipVideoViewContainDialog, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = pipVideoViewContainDialog;
        this.LIZIZ = interfaceC65784Pro;
    }
}
