package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import o53.IDdS198S0200000_13;

/* renamed from: X.V9s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C79284V9s extends C80638Vko {
    public C81250Vug LLIIIJ;

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLIIIJ.LJ();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLIIIJ.LJFF();
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.LLIIIJ.LJ();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.LLIIIJ.LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setImageRequest(W5O w5o) {
        W4W<C81392Vwy<W5A>> LJ = W5I.LIZ().LJ(w5o, null);
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = this.LLIIIJ.LJ;
        LIZJ.LIZLLL = w5o;
        LIZJ.LJII = new IDdS198S0200000_13(LJ, this, 2);
        this.LLIIIJ.LJII(LIZJ.LIZ());
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.LLIIIJ.LIZJ() && super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public C79284V9s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.LLIIIJ == null) {
            this.LLIIIJ = new C81250Vug(new C79077V1t(getResources()).LIZ());
        }
    }
}
