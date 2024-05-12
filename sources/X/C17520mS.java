package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0mS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17520mS {
    public final String LIZ = "";
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final long LJFF;
    public final int LJI;
    public final boolean LJII;
    public final ArrayList LJIIIIZZ;
    public final C17510mR LJIIIZ;
    public boolean LJIIJ;

    public final void LIZJ() {
        if (!this.LJIIJ) {
            return;
        }
        "ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString();
        throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
    }

    public final void LIZIZ() {
        LIZJ();
        C17510mR c17510mR = (C17510mR) ListProtector.remove(this.LJIIIIZZ, r1.size() - 1);
        ((C17510mR) ListProtector.get(this.LJIIIIZZ, r2.size() - 1)).LJIIIZ.add(new C34331Wj(c17510mR.LIZ, c17510mR.LIZIZ, c17510mR.LIZJ, c17510mR.LIZLLL, c17510mR.LJ, c17510mR.LJFF, c17510mR.LJI, c17510mR.LJII, c17510mR.LJIIIIZZ, c17510mR.LJIIIZ));
    }

    public C17520mS(float f, float f2, float f3, float f4, long j, int i, boolean z) {
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = j;
        this.LJI = i;
        this.LJII = z;
        ArrayList arrayList = new ArrayList();
        this.LJIIIIZZ = arrayList;
        C17510mR c17510mR = new C17510mR(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.LJIIIZ = c17510mR;
        arrayList.add(c17510mR);
    }

    public final void LIZ(String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, List clipPathData) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(clipPathData, "clipPathData");
        LIZJ();
        this.LJIIIIZZ.add(new C17510mR(name, f, f2, f3, f4, f5, f6, f7, clipPathData, 512));
    }
}
