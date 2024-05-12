package X;

import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.1Qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC32681Qa extends AbstractC11740d8 {
    public Shader LIZIZ;
    public long LIZJ = C10430b1.LIZJ;

    public abstract Shader LIZIZ(long j);

    @Override // X.AbstractC11740d8
    public final void LIZ(float f, long j, InterfaceC11550cp interfaceC11550cp) {
        Shader shader = this.LIZIZ;
        if (shader == null || !C10430b1.LIZ(this.LIZJ, j)) {
            shader = LIZIZ(j);
            this.LIZIZ = shader;
            this.LIZJ = j;
        }
        long LIZJ = interfaceC11550cp.LIZJ();
        long j2 = C11850dJ.LIZIZ;
        if (!C11850dJ.LIZJ(LIZJ, j2)) {
            interfaceC11550cp.LIZLLL(j2);
        }
        if (!o.LJ(interfaceC11550cp.LJIIIIZZ(), shader)) {
            interfaceC11550cp.LJIIJ(shader);
        }
        if (interfaceC11550cp.LIZ() == f) {
            return;
        }
        interfaceC11550cp.setAlpha(f);
    }
}
