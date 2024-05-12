package X;

import android.app.Dialog;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BY5 implements InterfaceC29882Bo6 {
    public final C28507BGt LIZ;

    @Override // X.InterfaceC29882Bo6
    public final int getLayoutId() {
        return this.LIZ.LIZ;
    }

    public BY5(C28507BGt dialogParams) {
        o.LJIIIZ(dialogParams, "dialogParams");
        this.LIZ = dialogParams;
    }

    @Override // X.InterfaceC29882Bo6
    public final void LIZ(DialogFragment dialogFragment) {
        int i;
        o.LJIIIZ(dialogFragment, "dialogFragment");
        C28507BGt c28507BGt = this.LIZ;
        if (c28507BGt.LIZLLL) {
            i = R.style.aai;
        } else {
            i = R.style.aan;
        }
        int i2 = c28507BGt.LIZIZ;
        int i3 = c28507BGt.LIZJ;
        if (i3 != -1) {
            i = i3;
        }
        dialogFragment.setStyle(i2, i);
    }

    @Override // X.InterfaceC29882Bo6
    public final void LIZIZ(Dialog dialog) {
        dialog.setCancelable(this.LIZ.LJFF);
    }

    @Override // X.InterfaceC29882Bo6
    public final void LIZJ(Dialog dialog) {
        this.LIZ.getClass();
        dialog.requestWindowFeature(1);
    }

    @Override // X.InterfaceC29882Bo6
    public final void LIZLLL(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(this.LIZ.LJIIL);
            WindowManager.LayoutParams attributes = window.getAttributes();
            C28507BGt c28507BGt = this.LIZ;
            attributes.dimAmount = c28507BGt.LJI;
            attributes.width = c28507BGt.LJIIIZ;
            int i = c28507BGt.LJIIJ;
            if (i == Integer.MIN_VALUE) {
                i = (C15380j0.LJIIJ().getDisplayMetrics().heightPixels * this.LIZ.LJIIJJI) / 100;
            }
            attributes.height = i;
            C28507BGt c28507BGt2 = this.LIZ;
            attributes.gravity = c28507BGt2.LJII;
            attributes.softInputMode = c28507BGt2.LJIILIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dialog fragment setAttributes , width = ");
            LIZ.append(window.getAttributes().width);
            LIZ.append(" height = ");
            LIZ.append(attributes.height);
            LIZ.append(", dialog paramsL W=");
            LIZ.append(this.LIZ.LJIIIZ);
            LIZ.append(" H=");
            LIZ.append(this.LIZ.LJIIJ);
            LIZ.append(' ');
            C0NB.LIZIZ("LiveDialogFragment", X1D.LIZIZ(LIZ));
            window.setAttributes(attributes);
            int i2 = this.LIZ.LJIIIIZZ;
            if (i2 != -1) {
                window.addFlags(i2);
            }
        }
    }

    @Override // X.InterfaceC29882Bo6
    public final void LJ(Dialog dialog) {
        dialog.setCanceledOnTouchOutside(this.LIZ.LJ);
    }
}
