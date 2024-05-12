package X;

import Y.ACListenerS35S0100000_15;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xrg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86160Xrg extends AbstractC86162Xri {
    public boolean LIZLLL = this.LIZJ;
    public final /* synthetic */ C86159Xrf LJ;

    public C86160Xrg(C86159Xrf c86159Xrf) {
        this.LJ = c86159Xrf;
        c86159Xrf.LIZIZ().setText(R.string.dts);
        c86159Xrf.LIZIZ().setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, c86159Xrf.LIZ));
        c86159Xrf.LIZIZ().setBackground(C04270Et.LIZIZ(c86159Xrf.LIZ, R.drawable.akc));
        C16880lQ.LJJIZ(c86159Xrf.LIZIZ(), new ACListenerS35S0100000_15(this, 205));
    }

    @Override // X.AbstractC86162Xri
    public final void LIZ(boolean z) {
        TransitionDrawable transitionDrawable;
        this.LIZJ = z;
        if (this.LIZLLL == z) {
            return;
        }
        if (z) {
            this.LJ.LIZIZ().setText(R.string.dtr);
            this.LJ.LIZIZ().setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, this.LJ.LIZ));
            transitionDrawable = new TransitionDrawable(new Drawable[]{C04270Et.LIZIZ(this.LJ.LIZ, R.drawable.akc), C04270Et.LIZIZ(this.LJ.LIZ, R.drawable.aka)});
        } else {
            this.LJ.LIZIZ().setText(R.string.dts);
            this.LJ.LIZIZ().setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, this.LJ.LIZ));
            transitionDrawable = new TransitionDrawable(new Drawable[]{C04270Et.LIZIZ(this.LJ.LIZ, R.drawable.aka), C04270Et.LIZIZ(this.LJ.LIZ, R.drawable.akc)});
        }
        this.LJ.LIZIZ().setBackground(transitionDrawable);
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(200);
        this.LIZLLL = this.LIZJ;
    }
}
