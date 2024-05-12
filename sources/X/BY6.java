package X;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BY6 implements InterfaceC29882Bo6 {
    public final int LIZ;
    public boolean LIZIZ = true;

    @Override // X.InterfaceC29882Bo6
    public final void LIZIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC29882Bo6
    public final int getLayoutId() {
        return this.LIZ;
    }

    public BY6(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC29882Bo6
    public final void LIZ(DialogFragment dialogFragment) {
        o.LJIIIZ(dialogFragment, "dialogFragment");
        dialogFragment.setStyle(1, R.style.aal);
    }

    @Override // X.InterfaceC29882Bo6
    public final void LIZJ(Dialog dialog) {
        dialog.requestWindowFeature(1);
    }

    @Override // X.InterfaceC29882Bo6
    public final void LIZLLL(Dialog dialog) {
        int i;
        o.LJIIIZ(dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            float LIZLLL = B9K.LIZLLL(window.getContext(), C81185Vtd.LIZJ(dialog.getContext()));
            if (LIZLLL <= 0.0f || LIZLLL > 375.0f) {
                LIZLLL = 375.0f;
            }
            attributes.width = (int) B9K.LIZ(window.getContext(), LIZLLL);
            attributes.height = -1;
            if (CCJ.LIZ(window.getContext())) {
                i = 3;
            } else {
                i = 5;
            }
            attributes.gravity = i;
            attributes.softInputMode = 0;
            window.setAttributes(attributes);
        }
    }

    @Override // X.InterfaceC29882Bo6
    public final void LJ(Dialog dialog) {
        dialog.setCanceledOnTouchOutside(this.LIZIZ);
    }
}
