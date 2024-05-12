package X;

import X.AbstractC82681Wcf;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow;
import kotlin.jvm.internal.o;

/* renamed from: X.Wcf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82681Wcf<T extends AbstractC82681Wcf<T>> {
    public final C82682Wcg LIZ;
    public final Activity LIZIZ;

    public InterfaceC82683Wch LIZJ() {
        C82682Wcg c82682Wcg = this.LIZ;
        if (c82682Wcg.LIZJ != null) {
            return new C82680Wce(this.LIZIZ, c82682Wcg);
        }
        return new TuxTooltipPopupWindow(this.LIZIZ, this.LIZ);
    }

    public final void LJFF() {
        C82682Wcg c82682Wcg = this.LIZ;
        Activity activity = this.LIZIZ;
        o.LJII(activity, "null cannot be cast to non-null type android.app.Activity");
        View decorView = activity.getWindow().getDecorView();
        o.LJII(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        c82682Wcg.LIZJ = (ViewGroup) decorView;
    }

    public AbstractC82681Wcf(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = new C82682Wcg();
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        o.LJI(LJIJJ);
        this.LIZIZ = LJIJJ;
    }

    public final void LIZIZ(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ.LIZIZ = view;
    }

    public final void LIZLLL(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ.LJIJ = view;
    }

    public final void LJ(InterfaceC65784Pro dismissListener) {
        o.LJIIIZ(dismissListener, "dismissListener");
        this.LIZ.LJJIFFI = new C82685Wcj(dismissListener);
    }

    public final void LJI(WHL position) {
        o.LJIIIZ(position, "position");
        C82682Wcg c82682Wcg = this.LIZ;
        c82682Wcg.getClass();
        c82682Wcg.LIZLLL = position;
    }

    public final void LJII(InterfaceC65784Pro showListener) {
        o.LJIIIZ(showListener, "showListener");
        this.LIZ.LJJII = new C82686Wck(showListener);
    }

    public final void LJIIIIZZ(int i) {
        this.LIZ.LIZ = Integer.valueOf(i);
    }

    public final void LJIIIZ(int i) {
        this.LIZ.LIZ = C79045V0n.LJI(i, this.LIZIZ);
    }

    public final void LIZ(int i, int i2) {
        C82682Wcg c82682Wcg = this.LIZ;
        c82682Wcg.LJIILLIIL = i;
        c82682Wcg.LJIIZILJ = i2;
    }

    public final void LJIIJ(View.OnClickListener onClickListener, boolean z) {
        C82682Wcg c82682Wcg = this.LIZ;
        c82682Wcg.LJJI = z;
        c82682Wcg.LJJ = onClickListener;
    }
}
