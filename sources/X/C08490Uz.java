package X;

import android.graphics.Matrix;
import android.graphics.Shader;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0Uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08490Uz {
    public final C1NB LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final int LJFF;
    public final List<C10390ax> LJI;
    public final List<C1NC> LJII;

    public final void LIZJ(int i) {
        if (i >= 0 && i <= this.LIZ.LIZ.LJLIL.length()) {
            return;
        }
        StringBuilder LJ = C7MY.LJ("offset(", i, ") is out of bounds [0, ");
        LJ.append(this.LIZ.LIZ.length());
        LJ.append(']');
        String LIZIZ = X1D.LIZIZ(LJ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public final void LIZLLL(int i) {
        if (i >= 0 && i < this.LJFF) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lineIndex(");
        LIZ.append(i);
        LIZ.append(") is out of bounds [0, ");
        LIZ.append(i);
        LIZ.append(')');
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    public C08490Uz(C1NB c1nb, long j, int i, boolean z) {
        boolean z2;
        C10390ax c10390ax;
        int LJI;
        this.LIZ = c1nb;
        this.LIZIZ = i;
        if (C23360vs.LJIIIZ(j) == 0 && C23360vs.LJIIIIZZ(j) == 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) c1nb.LJ;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            float f = 0.0f;
            while (i2 < size) {
                C1ND c1nd = (C1ND) ListProtector.get(arrayList2, i2);
                C0V1 paragraphIntrinsics = c1nd.LJLIL;
                int LJII = C23360vs.LJII(j);
                if (C23360vs.LIZJ(j)) {
                    LJI = C23360vs.LJI(j) - ((int) Math.ceil(f));
                    if (LJI < 0) {
                        LJI = 0;
                    }
                } else {
                    LJI = C23360vs.LJI(j);
                }
                long LJ = C78555UsJ.LJ(LJII, LJI, 5);
                int i4 = this.LIZIZ - i3;
                o.LJIIIZ(paragraphIntrinsics, "paragraphIntrinsics");
                C1N9 c1n9 = new C1N9((C34361Wm) paragraphIntrinsics, i4, z, LJ);
                float height = c1n9.getHeight() + f;
                int i5 = i3 + c1n9.LIZLLL.LJ;
                arrayList.add(new C1NC(c1n9, c1nd.LJLILLLLZI, c1nd.LJLJI, i3, i5, f, height));
                if (c1n9.LIZLLL.LIZJ || (i5 == this.LIZIZ && i2 != C47261Igj.LJJI(this.LIZ.LJ))) {
                    i3 = i5;
                    f = height;
                    z2 = true;
                    break;
                } else {
                    i2++;
                    i3 = i5;
                    f = height;
                }
            }
            z2 = false;
            this.LJ = f;
            this.LJFF = i3;
            this.LIZJ = z2;
            this.LJII = arrayList;
            this.LIZLLL = C23360vs.LJII(j);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                C1NC c1nc = (C1NC) ListProtector.get(arrayList, i6);
                List<C10390ax> LJIJJ = c1nc.LJLIL.LJIJJ();
                ArrayList arrayList4 = new ArrayList(LJIJJ.size());
                int size3 = LJIJJ.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    C10390ax c10390ax2 = (C10390ax) ListProtector.get(LJIJJ, i7);
                    if (c10390ax2 != null) {
                        c10390ax = c1nc.L(c10390ax2);
                    } else {
                        c10390ax = null;
                    }
                    arrayList4.add(c10390ax);
                }
                ORS.LJJLIIIJILLIZJL(arrayList4, arrayList3);
            }
            int size4 = arrayList3.size();
            ArrayList arrayList5 = arrayList3;
            if (size4 < this.LIZ.LIZIZ.size()) {
                int size5 = this.LIZ.LIZIZ.size() - arrayList3.size();
                ArrayList arrayList6 = new ArrayList(size5);
                for (int i8 = 0; i8 < size5; i8++) {
                    arrayList6.add(null);
                }
                arrayList5 = ORZ.LLIIIZ(arrayList6, arrayList3);
            }
            this.LJI = arrayList5;
            return;
        }
        "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString();
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }

    public final void LIZIZ(InterfaceC11750d9 interfaceC11750d9, long j, C11770dB c11770dB, C22080to c22080to) {
        interfaceC11750d9.LJIIL();
        ArrayList arrayList = (ArrayList) this.LJII;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1NC c1nc = (C1NC) ListProtector.get(arrayList, i);
            c1nc.LJLIL.LJIIIIZZ(interfaceC11750d9, j, c11770dB, c22080to);
            interfaceC11750d9.LJIILLIIL(0.0f, c1nc.LJLIL.getHeight());
        }
        interfaceC11750d9.LJIIJ();
    }

    public final void LIZ(InterfaceC11750d9 interfaceC11750d9, AbstractC11740d8 abstractC11740d8, float f, C11770dB c11770dB, C22080to c22080to) {
        InterfaceC11750d9 interfaceC11750d92 = interfaceC11750d9;
        interfaceC11750d92.LJIIL();
        float f2 = f;
        C11770dB c11770dB2 = c11770dB;
        C22080to c22080to2 = c22080to;
        if (((ArrayList) this.LJII).size() <= 1) {
            C78926UyI.LJIIIZ(this, interfaceC11750d92, abstractC11740d8, f2, c11770dB2, c22080to2);
        } else if (abstractC11740d8 instanceof C32691Qb) {
            C78926UyI.LJIIIZ(this, interfaceC11750d92, abstractC11740d8, f2, c11770dB2, c22080to2);
        } else if (abstractC11740d8 instanceof AbstractC32681Qa) {
            ArrayList arrayList = (ArrayList) this.LJII;
            int size = arrayList.size();
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i = 0; i < size; i++) {
                C1NC c1nc = (C1NC) ListProtector.get(arrayList, i);
                f4 += c1nc.LJLIL.getHeight();
                f3 = Math.max(f3, c1nc.LJLIL.getWidth());
            }
            Shader LIZIZ = ((AbstractC32681Qa) abstractC11740d8).LIZIZ(C1DF.LIZIZ(f3, f4));
            Matrix matrix = new Matrix();
            LIZIZ.getLocalMatrix(matrix);
            ArrayList arrayList2 = (ArrayList) this.LJII;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C1NC c1nc2 = (C1NC) ListProtector.get(arrayList2, i2);
                interfaceC11750d92 = interfaceC11750d92;
                f2 = f2;
                c11770dB2 = c11770dB2;
                c22080to2 = c22080to2;
                c1nc2.LJLIL.LJIILJJIL(interfaceC11750d92, new C42631lr(LIZIZ), f2, c11770dB2, c22080to2, null);
                interfaceC11750d92.LJIILLIIL(0.0f, c1nc2.LJLIL.getHeight());
                matrix.setTranslate(0.0f, -c1nc2.LJLIL.getHeight());
                LIZIZ.setLocalMatrix(matrix);
            }
        }
        interfaceC11750d92.LJIIJ();
    }
}
