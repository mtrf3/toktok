package X;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.1wK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49121wK extends AbstractC014804a implements InterfaceC42201lA {
    public final C31441Lg LJLILLLLZI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DrawOverscrollModifier(overscrollEffect=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C49121wK(X.C31441Lg r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "overscrollEffect"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49121wK.<init>(X.1Lg):void");
    }

    @Override // X.InterfaceC42201lA
    public final void LJIILIIL(InterfaceC43021mU interfaceC43021mU) {
        boolean z;
        o.LJIIIZ(interfaceC43021mU, "<this>");
        interfaceC43021mU.LJJLIIIIJ();
        C31441Lg c31441Lg = this.LJLILLLLZI;
        c31441Lg.getClass();
        if (C10430b1.LJ(c31441Lg.LJIILJJIL)) {
            return;
        }
        InterfaceC11750d9 LIZ = interfaceC43021mU.LJJIII().LIZ();
        c31441Lg.LJIIJJI.getValue();
        o.LJIIIZ(LIZ, "<this>");
        Canvas canvas = ((C1QR) LIZ).LIZ;
        boolean z2 = true;
        if (C0SN.LIZIZ(c31441Lg.LJIIIZ) != 0.0f) {
            c31441Lg.LJIIIZ(interfaceC43021mU, c31441Lg.LJIIIZ, canvas);
            c31441Lg.LJIIIZ.finish();
        }
        if (!c31441Lg.LJ.isFinished()) {
            z = c31441Lg.LJIIIIZZ(interfaceC43021mU, c31441Lg.LJ, canvas);
            C0SN.LIZLLL(c31441Lg.LJIIIZ, C0SN.LIZIZ(c31441Lg.LJ), 0.0f);
        } else {
            z = false;
        }
        if (C0SN.LIZIZ(c31441Lg.LJII) != 0.0f) {
            c31441Lg.LJII(interfaceC43021mU, c31441Lg.LJII, canvas);
            c31441Lg.LJII.finish();
        }
        if (!c31441Lg.LIZJ.isFinished()) {
            EdgeEffect edgeEffect = c31441Lg.LIZJ;
            int save = canvas.save();
            canvas.translate(0.0f, interfaceC43021mU.LJJJJIZL(c31441Lg.LIZ.LIZIZ.LIZLLL()));
            boolean draw = edgeEffect.draw(canvas);
            canvas.restoreToCount(save);
            if (draw || z) {
                z = true;
            } else {
                z = false;
            }
            C0SN.LIZLLL(c31441Lg.LJII, C0SN.LIZIZ(c31441Lg.LIZJ), 0.0f);
        }
        if (C0SN.LIZIZ(c31441Lg.LJIIJ) != 0.0f) {
            c31441Lg.LJIIIIZZ(interfaceC43021mU, c31441Lg.LJIIJ, canvas);
            c31441Lg.LJIIJ.finish();
        }
        if (!c31441Lg.LJFF.isFinished()) {
            if (c31441Lg.LJIIIZ(interfaceC43021mU, c31441Lg.LJFF, canvas) || z) {
                z = true;
            } else {
                z = false;
            }
            C0SN.LIZLLL(c31441Lg.LJIIJ, C0SN.LIZIZ(c31441Lg.LJFF), 0.0f);
        }
        if (C0SN.LIZIZ(c31441Lg.LJIIIIZZ) != 0.0f) {
            EdgeEffect edgeEffect2 = c31441Lg.LJIIIIZZ;
            int save2 = canvas.save();
            canvas.translate(0.0f, interfaceC43021mU.LJJJJIZL(c31441Lg.LIZ.LIZIZ.LIZLLL()));
            edgeEffect2.draw(canvas);
            canvas.restoreToCount(save2);
            c31441Lg.LJIIIIZZ.finish();
        }
        if (!c31441Lg.LIZLLL.isFinished()) {
            if (!c31441Lg.LJII(interfaceC43021mU, c31441Lg.LIZLLL, canvas) && !z) {
                z2 = false;
            }
            C0SN.LIZLLL(c31441Lg.LJIIIIZZ, C0SN.LIZIZ(c31441Lg.LIZLLL), 0.0f);
            z = z2;
        }
        if (!z) {
            return;
        }
        c31441Lg.LJIIJ();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49121wK)) {
            return false;
        }
        return o.LJ(this.LJLILLLLZI, ((C49121wK) obj).LJLILLLLZI);
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
