package X;

import Y.ARunnableS46S0100000_10;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Ngl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60003Ngl {
    public final Dialog LIZ;
    public final ImageView LIZIZ;
    public final TextView LIZJ;
    public final View LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final Handler LJI = new Handler();
    public final ARunnableS46S0100000_10 LJII = new ARunnableS46S0100000_10(this, 125);

    public final void LIZ() {
        if (this.LJ) {
            return;
        }
        try {
            if (this.LIZ.isShowing()) {
                this.LIZ.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public C60003Ngl(Context context) {
        LayoutInflater LLZIL = C16880lQ.LLZIL(context);
        Dialog dialog = new Dialog(context, R.style.a9j);
        this.LIZ = dialog;
        try {
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c1g, LLZIL, null);
            this.LIZLLL = LLLZIIL;
            this.LIZIZ = (ImageView) LLLZIIL.findViewById(R.id.e_q);
            TextView textView = (TextView) LLLZIIL.findViewById(R.id.text);
            this.LIZJ = textView;
            textView.setMaxWidth((int) ((((WindowManager) C16880lQ.LLILL(context, "window")).getDefaultDisplay().getWidth() * 0.68d) - 80.0d));
            dialog.setContentView(LLLZIIL);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(C04330Ez.LIZIZ(context, R.color.cz)));
            dialog.getWindow().addFlags(8);
            dialog.getWindow().addFlags(32);
            dialog.getWindow().addFlags(16);
            dialog.getWindow().setLayout(-2, -2);
            dialog.getWindow().setGravity(17);
        } catch (Throwable unused) {
        }
    }

    public final void LIZIZ(int i, int i2, String str) {
        if (this.LJ || i2 <= 0) {
            return;
        }
        boolean z = false;
        if (i > 0) {
            this.LIZIZ.setImageResource(i);
            this.LIZIZ.setVisibility(0);
            z = true;
        } else {
            this.LIZIZ.setVisibility(8);
        }
        if (!C38354F3m.LJ(str)) {
            this.LIZJ.setText(str);
        } else if (!z) {
            return;
        }
        this.LJI.removeCallbacks(this.LJII);
        LIZ();
        try {
            this.LIZ.getWindow().setGravity(17);
            C16880lQ.LIZ(this.LIZ);
            this.LJI.postDelayed(this.LJII, i2);
        } catch (Exception unused) {
        }
    }
}
