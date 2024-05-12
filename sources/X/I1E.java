package X;

import android.app.Activity;
import android.app.Dialog;
import kotlin.jvm.internal.AqS157S0100000_7;

/* loaded from: classes8.dex */
public final class I1E implements I1F {
    public final Activity LIZ;
    public final String LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final long LIZJ = 0;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 770));

    @Override // X.I1F
    public final void LIZ() {
    }

    @Override // X.I1F
    public final void hide() {
    }

    @Override // X.I1F
    public final void show() {
    }

    @Override // X.I1F
    public final void LIZIZ() {
        if (this.LIZ.isFinishing() || this.LIZ.isDestroyed() || ((Dialog) this.LJ.getValue()).isShowing()) {
            return;
        }
        Dialog dialog = (Dialog) this.LJ.getValue();
        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/gamora/recorder/sticker/view/DoubleBallLoadingDialog", "show", dialog, new Object[0], "void", new C65300Pk0(false, "()V", "-7613365037895950675")).LIZ) {
            dialog.show();
        }
        dialog.setCancelable(false);
    }

    @Override // X.I1F
    public final void LJIIIIZZ() {
        if (this.LIZ.isFinishing() || this.LIZ.isDestroyed() || !((Dialog) this.LJ.getValue()).isShowing()) {
            return;
        }
        ((Dialog) this.LJ.getValue()).dismiss();
    }

    public I1E(ActivityC45651qj activityC45651qj, String str, AqS157S0100000_7 aqS157S0100000_7) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = str;
        this.LIZLLL = aqS157S0100000_7;
    }
}
