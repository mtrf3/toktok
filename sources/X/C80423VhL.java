package X;

import android.graphics.Matrix;
import android.graphics.Path;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VhL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80423VhL {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public final List<AbstractC80432VhU> LJI = new ArrayList();
    public final List<AbstractC80431VhT> LJII = new ArrayList();

    public C80423VhL() {
        LJ(0.0f, 270.0f, 0.0f);
    }

    public final void LIZIZ(float f) {
        float f2 = this.LJ;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.LIZJ;
        float f5 = this.LIZLLL;
        C80427VhP c80427VhP = new C80427VhP(f4, f5, f4, f5);
        c80427VhP.LJFF = this.LJ;
        c80427VhP.LJI = f3;
        ((ArrayList) this.LJII).add(new C80424VhM(c80427VhP));
        this.LJ = f;
    }

    public final void LIZJ(Matrix matrix, Path path) {
        int size = ((ArrayList) this.LJI).size();
        for (int i = 0; i < size; i++) {
            ((AbstractC80432VhU) ListProtector.get(this.LJI, i)).LIZ(matrix, path);
        }
    }

    public final void LIZLLL(float f, float f2) {
        C80428VhQ c80428VhQ = new C80428VhQ();
        c80428VhQ.LIZIZ = f;
        c80428VhQ.LIZJ = f2;
        ((ArrayList) this.LJI).add(c80428VhQ);
        C80425VhN c80425VhN = new C80425VhN(c80428VhQ, this.LIZJ, this.LIZLLL);
        float LIZIZ = c80425VhN.LIZIZ() + 270.0f;
        float LIZIZ2 = c80425VhN.LIZIZ() + 270.0f;
        LIZIZ(LIZIZ);
        ((ArrayList) this.LJII).add(c80425VhN);
        this.LJ = LIZIZ2;
        this.LIZJ = f;
        this.LIZLLL = f2;
    }

    public final void LJ(float f, float f2, float f3) {
        this.LIZ = 0.0f;
        this.LIZIZ = f;
        this.LIZJ = 0.0f;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = (f2 + f3) % 360.0f;
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJII).clear();
    }

    public final void LIZ(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        C80427VhP c80427VhP = new C80427VhP(f, f2, f3, f4);
        c80427VhP.LJFF = f5;
        c80427VhP.LJI = f6;
        ((ArrayList) this.LJI).add(c80427VhP);
        C80424VhM c80424VhM = new C80424VhM(c80427VhP);
        float f8 = f5 + f6;
        if (f6 < 0.0f && 1 != 0) {
            f5 = (f5 + 180.0f) % 360.0f;
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        LIZIZ(f5);
        ((ArrayList) this.LJII).add(c80424VhM);
        this.LJ = f7;
        double d = f8;
        this.LIZJ = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.LIZLLL = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }
}
