package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1W5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1W5 extends AbstractC17600ma {
    public float[] LIZIZ;
    public C1QX LJFF;
    public C17590mZ LJI;
    public InterfaceC65784Pro<C76800UCe> LJII;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIILJJIL;
    public float LJIILL;
    public final List<AbstractC17600ma> LIZJ = new ArrayList();
    public List<? extends AbstractC17560mW> LIZLLL = C17630md.LIZ;
    public boolean LJ = true;
    public String LJIIIIZZ = "";
    public float LJIIL = 1.0f;
    public float LJIILIIL = 1.0f;
    public boolean LJIILLIIL = true;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.LJIIIIZZ);
        ArrayList arrayList = (ArrayList) this.LIZJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(arrayList, i);
            sb.append("\t");
            sb.append(obj.toString());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    @Override // X.AbstractC17600ma
    public final InterfaceC65784Pro<C76800UCe> LIZIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC17600ma
    public final void LIZ(InterfaceC33691Tx interfaceC33691Tx) {
        o.LJIIIZ(interfaceC33691Tx, "<this>");
        if (this.LJIILLIIL) {
            float[] fArr = this.LIZIZ;
            if (fArr == null) {
                fArr = C11520cm.LIZ();
                this.LIZIZ = fArr;
            } else {
                C11520cm.LIZLLL(fArr);
            }
            C11520cm.LJ(fArr, this.LJIIJ + this.LJIILJJIL, this.LJIIJJI + this.LJIILL);
            double d = (this.LJIIIZ * 3.141592653589793d) / 180.0d;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            float f = fArr[0];
            float f2 = fArr[4];
            float f3 = (sin * f2) + (cos * f);
            float f4 = -sin;
            float f5 = (f2 * cos) + (f * f4);
            float f6 = fArr[1];
            float f7 = fArr[5];
            float f8 = (sin * f7) + (cos * f6);
            float f9 = (f7 * cos) + (f6 * f4);
            float f10 = fArr[2];
            float f11 = fArr[6];
            float f12 = (sin * f11) + (cos * f10);
            float f13 = (f11 * cos) + (f10 * f4);
            float f14 = fArr[3];
            float f15 = fArr[7];
            float f16 = (sin * f15) + (cos * f14);
            float f17 = (cos * f15) + (f4 * f14);
            fArr[0] = f3;
            fArr[1] = f8;
            fArr[2] = f12;
            fArr[3] = f16;
            fArr[4] = f5;
            fArr[5] = f9;
            fArr[6] = f13;
            fArr[7] = f17;
            float f18 = this.LJIIL;
            float f19 = this.LJIILIIL;
            fArr[0] = f3 * f18;
            fArr[1] = f8 * f18;
            fArr[2] = f12 * f18;
            fArr[3] = f16 * f18;
            fArr[4] = f5 * f19;
            fArr[5] = f9 * f19;
            fArr[6] = f13 * f19;
            fArr[7] = f17 * f19;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
            C11520cm.LJ(fArr, -this.LJIIJ, -this.LJIIJJI);
            this.LJIILLIIL = false;
        }
        if (this.LJ) {
            if (!this.LIZLLL.isEmpty()) {
                C17590mZ c17590mZ = this.LJI;
                if (c17590mZ == null) {
                    c17590mZ = new C17590mZ();
                    this.LJI = c17590mZ;
                } else {
                    ((ArrayList) c17590mZ.LIZ).clear();
                }
                C1QX c1qx = this.LJFF;
                if (c1qx == null) {
                    c1qx = C1JI.LIZ();
                    this.LJFF = c1qx;
                } else {
                    c1qx.reset();
                }
                List<? extends AbstractC17560mW> nodes = this.LIZLLL;
                o.LJIIIZ(nodes, "nodes");
                ((ArrayList) c17590mZ.LIZ).addAll(nodes);
                c17590mZ.LIZJ(c1qx);
            }
            this.LJ = false;
        }
        C33681Tw LJJIII = interfaceC33691Tx.LJJIII();
        long LIZIZ = LJJIII.LIZIZ();
        LJJIII.LIZ().LJIIL();
        C14690ht c14690ht = LJJIII.LIZ;
        float[] fArr2 = this.LIZIZ;
        if (fArr2 != null) {
            c14690ht.LJFF(fArr2);
        }
        C1QX c1qx2 = this.LJFF;
        if ((!this.LIZLLL.isEmpty()) && c1qx2 != null) {
            c14690ht.LIZ(c1qx2, 1);
        }
        ArrayList arrayList = (ArrayList) this.LIZJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC17600ma) ListProtector.get(arrayList, i)).LIZ(interfaceC33691Tx);
        }
        LJJIII.LIZ().LJIIJ();
        LJJIII.LIZJ(LIZIZ);
    }

    @Override // X.AbstractC17600ma
    public final void LIZLLL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJII = interfaceC65784Pro;
        ArrayList arrayList = (ArrayList) this.LIZJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC17600ma) ListProtector.get(arrayList, i)).LIZLLL(interfaceC65784Pro);
        }
    }

    public final void LJ(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < ((ArrayList) this.LIZJ).size()) {
                ((AbstractC17600ma) ListProtector.get(this.LIZJ, i)).LIZLLL(null);
                ListProtector.remove(this.LIZJ, i);
            }
        }
        LIZJ();
    }
}
