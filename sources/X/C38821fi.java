package X;

import android.graphics.PointF;

/* renamed from: X.1fi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38821fi implements InterfaceC271214q {
    public final String LIZ;
    public final InterfaceC268913t<PointF, PointF> LIZIZ;
    public final C44481oq LIZJ;
    public final C44451on LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RectangleShape{position=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", size=");
        LIZ.append(this.LIZJ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC271214q
    public final InterfaceC20640rU LIZ(C04740Go c04740Go, AbstractC45041pk abstractC45041pk) {
        return new C43671nX(c04740Go, abstractC45041pk, this);
    }

    public C38821fi(String str, InterfaceC268913t<PointF, PointF> interfaceC268913t, C44481oq c44481oq, C44451on c44451on) {
        this.LIZ = str;
        this.LIZIZ = interfaceC268913t;
        this.LIZJ = c44481oq;
        this.LIZLLL = c44451on;
    }
}
