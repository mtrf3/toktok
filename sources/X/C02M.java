package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.zhiliaoapp.musically.R;

/* renamed from: X.02M, reason: invalid class name */
/* loaded from: classes.dex */
public class C02M {
    public final Context LIZ;
    public final C281318n LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public View LJFF;
    public int LJI;
    public boolean LJII;
    public C02N LJIIIIZZ;
    public AbstractC37391dP LJIIIZ;
    public PopupWindow.OnDismissListener LJIIJ;
    public final C02L LJIIJJI;

    public void LIZJ() {
        this.LJIIIZ = null;
        PopupWindow.OnDismissListener onDismissListener = this.LJIIJ;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final AbstractC37391dP LIZ() {
        AbstractC37391dP viewOnKeyListenerC39841hM;
        if (this.LJIIIZ == null) {
            Display defaultDisplay = ((WindowManager) C16880lQ.LLILL(this.LIZ, "window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.LIZ.getResources().getDimensionPixelSize(R.dimen.bv)) {
                viewOnKeyListenerC39841hM = new ViewOnKeyListenerC39831hL(this.LIZ, this.LJFF, this.LIZLLL, this.LJ, this.LIZJ);
            } else {
                Context context = this.LIZ;
                C281318n c281318n = this.LIZIZ;
                viewOnKeyListenerC39841hM = new ViewOnKeyListenerC39841hM(this.LIZLLL, this.LJ, context, this.LJFF, c281318n, this.LIZJ);
            }
            viewOnKeyListenerC39841hM.LJIIJJI(this.LIZIZ);
            viewOnKeyListenerC39841hM.LJIIZILJ(this.LJIIJJI);
            viewOnKeyListenerC39841hM.LJIILIIL(this.LJFF);
            viewOnKeyListenerC39841hM.LJIIIZ(this.LJIIIIZZ);
            viewOnKeyListenerC39841hM.LJIILJJIL(this.LJII);
            viewOnKeyListenerC39841hM.LJIILL(this.LJI);
            this.LJIIIZ = viewOnKeyListenerC39841hM;
        }
        return this.LJIIIZ;
    }

    public final boolean LIZIZ() {
        AbstractC37391dP abstractC37391dP = this.LJIIIZ;
        if (abstractC37391dP != null && abstractC37391dP.isShowing()) {
            return true;
        }
        return false;
    }

    public C02M(Context context, C281318n c281318n, View view, boolean z) {
        this(R.attr.uu, 0, context, view, c281318n, z);
    }

    public final void LIZLLL(int i, int i2, boolean z, boolean z2) {
        AbstractC37391dP LIZ = LIZ();
        LIZ.LJIJ(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.LJI, C16310kV.LIZLLL(this.LJFF)) & 7) == 5) {
                i -= this.LJFF.getWidth();
            }
            LIZ.LJIILLIIL(i);
            LIZ.LJIJI(i2);
            int i3 = (int) ((this.LIZ.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            LIZ.LJLIL = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        LIZ.show();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.02L] */
    public C02M(int i, int i2, Context context, View view, C281318n c281318n, boolean z) {
        this.LJI = 8388611;
        this.LJIIJJI = new PopupWindow.OnDismissListener() { // from class: X.02L
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C02M.this.LIZJ();
            }
        };
        this.LIZ = context;
        this.LIZIZ = c281318n;
        this.LJFF = view;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
