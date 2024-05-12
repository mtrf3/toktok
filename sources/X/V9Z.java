package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import o53.IDdS479S0100000_14;

/* loaded from: classes14.dex */
public final class V9Z extends AbstractC79742VRi {
    public Drawable LJLLLLLL;
    public final AbstractC81686W4c LJLZ;
    public final C81250Vug<V92> LJZ;
    public final Object LJZI;
    public final W4V LJZL;
    public final android.net.Uri LL;
    public final InterfaceC78716Uuu LLD;

    @Override // X.AbstractC79742VRi
    public final void LIZLLL() {
        this.LJZ.LJ();
    }

    @Override // X.AbstractC79742VRi
    public final void LJ() {
        this.LJZ.LJFF();
    }

    @Override // X.AbstractC79742VRi
    public final void LJFF() {
        this.LJZ.LJ();
    }

    @Override // X.AbstractC79742VRi
    public final void LJI() {
        this.LJZ.LJFF();
    }

    @Override // X.AbstractC79742VRi
    public final Drawable LIZJ() {
        return this.LJLLLLLL;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [REQUEST, X.V9a] */
    @Override // X.AbstractC79742VRi
    public final void LJIIIIZZ(Drawable.Callback callback) {
        android.net.Uri uri;
        this.LJLLLL = callback;
        if (callback != null && this.LJLLLLLL == null && (uri = this.LL) != android.net.Uri.EMPTY) {
            W5P LIZLLL = W5P.LIZLLL(uri);
            V9E.LIZIZ(LIZLLL, Bitmap.Config.ARGB_8888);
            ?? c79266V9a = new C79266V9a(LIZLLL, null);
            AbstractC81686W4c abstractC81686W4c = this.LJLZ;
            abstractC81686W4c.LIZJ();
            abstractC81686W4c.LJIIJ = true;
            abstractC81686W4c.LJIIL = this.LJZ.LJ;
            abstractC81686W4c.LIZJ = this.LJZI;
            abstractC81686W4c.LIZLLL = c79266V9a;
            abstractC81686W4c.LJII = this.LJZL;
            this.LJZ.LJII(abstractC81686W4c.LIZ());
            this.LJLZ.LIZJ();
            Drawable LIZJ = this.LJZ.LIZJ();
            this.LJLLLLLL = LIZJ;
            if (LIZJ != null) {
                LIZJ.setBounds(0, 0, this.LJLJL, this.LJLJJLL);
                this.LJLLLLLL.setCallback(this.LJLLLL);
                V92 v92 = this.LJZ.LIZLLL;
                v92.getClass();
                v92.LJIILJJIL(this.LLD);
            }
        }
        Drawable drawable = this.LJLLLLLL;
        if (drawable != null) {
            drawable.setCallback(callback);
        }
    }

    public V9Z(Resources resources, int i, int i2, int[] iArr, android.net.Uri uri, AbstractC78707Uul abstractC78707Uul, C81705W4v c81705W4v, IDdS479S0100000_14 iDdS479S0100000_14) {
        super(i, i2, iArr);
        this.LJZ = new C81250Vug<>(new C79077V1t(resources).LIZ());
        this.LJLZ = c81705W4v;
        this.LJZI = null;
        this.LL = uri == null ? android.net.Uri.EMPTY : uri;
        this.LLD = abstractC78707Uul;
        this.LJZL = iDdS479S0100000_14;
    }

    @Override // X.AbstractC79742VRi, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.LJLLLL == null) {
            return;
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }
}
