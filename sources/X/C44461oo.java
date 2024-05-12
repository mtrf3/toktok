package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.1oo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44461oo extends AbstractC38521fE {
    @Override // X.InterfaceC268913t
    public final AbstractC22650uj<C271314r, C271314r> LIZ() {
        final List list = (List) this.LJLILLLLZI;
        return new AbstractC35131Zl<C271314r>(list) { // from class: X.1ng
            public final C271314r LJIIJ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                super(list);
                C271314r c271314r = (C271314r) ((C06780Ok) ListProtector.get(list, 0)).LIZIZ;
                int length = c271314r != null ? c271314r.LIZIZ.length : 0;
                this.LJIIJ = new C271314r(new float[length], new int[length]);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC22650uj
            public final Object LJII(C06780Ok c06780Ok, float f) {
                C271314r c271314r = this.LJIIJ;
                C271314r c271314r2 = (C271314r) c06780Ok.LIZIZ;
                C271314r c271314r3 = (C271314r) c06780Ok.LIZJ;
                c271314r.getClass();
                if (c271314r2.LIZIZ.length == c271314r3.LIZIZ.length) {
                    int i = 0;
                    while (true) {
                        int[] iArr = c271314r2.LIZIZ;
                        if (i < iArr.length) {
                            float[] fArr = c271314r.LIZ;
                            float f2 = c271314r2.LIZ[i];
                            fArr[i] = C06420Na.LIZIZ(c271314r3.LIZ[i], f2, f, f2);
                            c271314r.LIZIZ[i] = C06210Mf.LIZJ(f, iArr[i], c271314r3.LIZIZ[i]);
                            i++;
                        } else {
                            return this.LJIIJ;
                        }
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Cannot interpolate between gradients. Lengths vary (");
                    LIZ.append(c271314r2.LIZIZ.length);
                    LIZ.append(" vs ");
                    throw new IllegalArgumentException(C08380Uo.LIZ(LIZ, c271314r3.LIZIZ.length, ")", LIZ));
                }
            }
        };
    }

    public C44461oo(List<C06780Ok<C271314r>> list) {
        super(list, 0);
    }
}
