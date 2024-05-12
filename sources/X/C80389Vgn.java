package X;

import android.animation.TypeEvaluator;

/* renamed from: X.Vgn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80389Vgn implements TypeEvaluator<C80391Vgp> {
    public static final C80389Vgn LIZIZ = new C80389Vgn();
    public final C80391Vgp LIZ = new C80391Vgp();

    @Override // android.animation.TypeEvaluator
    public final C80391Vgp evaluate(float f, C80391Vgp c80391Vgp, C80391Vgp c80391Vgp2) {
        C80391Vgp c80391Vgp3 = c80391Vgp;
        C80391Vgp c80391Vgp4 = c80391Vgp2;
        C80391Vgp c80391Vgp5 = this.LIZ;
        float f2 = c80391Vgp3.LIZ;
        float f3 = 1.0f - f;
        float f4 = (c80391Vgp4.LIZ * f) + (f2 * f3);
        float f5 = c80391Vgp3.LIZIZ;
        float f6 = (c80391Vgp4.LIZIZ * f) + (f5 * f3);
        float f7 = c80391Vgp3.LIZJ;
        float f8 = f * c80391Vgp4.LIZJ;
        c80391Vgp5.LIZ = f4;
        c80391Vgp5.LIZIZ = f6;
        c80391Vgp5.LIZJ = f8 + (f3 * f7);
        return c80391Vgp5;
    }
}
