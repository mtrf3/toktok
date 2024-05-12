package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xh7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85505Xh7 {
    public final View LIZ;
    public View.OnClickListener LIZJ;
    public View.OnClickListener LIZLLL;
    public View.OnClickListener LJ;
    public boolean LIZIZ = true;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 859));
    public final C62822Ol8 LJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 857));
    public final C62822Ol8 LJII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 858));
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 856));
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 860));

    public final TuxIconView LIZ() {
        Object value = this.LJIIIIZZ.getValue();
        o.LJIIIIZZ(value, "<get-endIcon>(...)");
        return (TuxIconView) value;
    }

    public final TuxTextView LIZIZ() {
        Object value = this.LJI.getValue();
        o.LJIIIIZZ(value, "<get-endTextButton>(...)");
        return (TuxTextView) value;
    }

    public final TuxIconView LIZJ() {
        Object value = this.LJII.getValue();
        o.LJIIIIZZ(value, "<get-startIcon>(...)");
        return (TuxIconView) value;
    }

    public final TuxTextView LIZLLL() {
        Object value = this.LJFF.getValue();
        o.LJIIIIZZ(value, "<get-startTextButton>(...)");
        return (TuxTextView) value;
    }

    public final void LJI() {
        C16880lQ.LJJJ(LIZJ(), this.LIZJ);
        C16880lQ.LJJJJI(LIZLLL(), this.LIZJ);
        if (this.LIZIZ) {
            C16880lQ.LJJJ(LIZ(), this.LIZLLL);
            C16880lQ.LJJJJI(LIZIZ(), this.LIZLLL);
        } else {
            C16880lQ.LJJJ(LIZ(), this.LJ);
            C16880lQ.LJJJJI(LIZIZ(), this.LJ);
        }
    }

    public C85505Xh7(View view) {
        this.LIZ = view;
    }

    public final void LJ(boolean z) {
        this.LIZIZ = z;
        if (z) {
            TuxIconView LIZ = LIZ();
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "view.context");
            LIZ.setColorFilter(AnonymousClass636.LJIIIIZZ(R.attr.dj, context));
            LIZIZ().setTextColor(C04330Ez.LIZIZ(this.LIZ.getContext(), R.color.bc));
        } else {
            TuxIconView LIZ2 = LIZ();
            Context context2 = this.LIZ.getContext();
            o.LJIIIIZZ(context2, "view.context");
            LIZ2.setColorFilter(AnonymousClass636.LJIIIIZZ(R.attr.dm, context2));
            LIZIZ().setTextColor(C04330Ez.LIZIZ(this.LIZ.getContext(), R.color.bg));
        }
        LJI();
    }

    public static void LJFF(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
            view.setEnabled(true);
        } else {
            view.setVisibility(4);
            view.setEnabled(false);
        }
    }
}
