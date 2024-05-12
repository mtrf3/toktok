package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.16G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16G {
    public final AbstractC39241gO LIZ;
    public final ArrayList<AbstractC39241gO> LIZIZ = new ArrayList<>();

    public C16G(AbstractC39241gO abstractC39241gO) {
        this.LIZ = abstractC39241gO;
    }

    public static long LIZ(C39231gN c39231gN, long j) {
        AbstractC39241gO abstractC39241gO = c39231gN.LIZLLL;
        if (abstractC39241gO instanceof C45011ph) {
            return j;
        }
        int size = ((ArrayList) c39231gN.LJIIJ).size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C16B c16b = (C16B) ListProtector.get(c39231gN.LJIIJ, i);
            if (c16b instanceof C39231gN) {
                C39231gN c39231gN2 = (C39231gN) c16b;
                if (c39231gN2.LIZLLL != abstractC39241gO) {
                    j2 = Math.min(j2, LIZ(c39231gN2, c39231gN2.LJFF + j));
                }
            }
        }
        if (c39231gN == abstractC39241gO.LJIIIIZZ) {
            long LJIIIZ = j - abstractC39241gO.LJIIIZ();
            return Math.min(Math.min(j2, LIZ(abstractC39241gO.LJII, LJIIIZ)), LJIIIZ - abstractC39241gO.LJII.LJFF);
        }
        return j2;
    }

    public static long LIZIZ(C39231gN c39231gN, long j) {
        AbstractC39241gO abstractC39241gO = c39231gN.LIZLLL;
        if (abstractC39241gO instanceof C45011ph) {
            return j;
        }
        int size = ((ArrayList) c39231gN.LJIIJ).size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C16B c16b = (C16B) ListProtector.get(c39231gN.LJIIJ, i);
            if (c16b instanceof C39231gN) {
                C39231gN c39231gN2 = (C39231gN) c16b;
                if (c39231gN2.LIZLLL != abstractC39241gO) {
                    j2 = Math.max(j2, LIZIZ(c39231gN2, c39231gN2.LJFF + j));
                }
            }
        }
        if (c39231gN == abstractC39241gO.LJII) {
            long LJIIIZ = j + abstractC39241gO.LJIIIZ();
            return Math.max(Math.max(j2, LIZIZ(abstractC39241gO.LJIIIIZZ, LJIIIZ)), LJIIIZ - abstractC39241gO.LJIIIIZZ.LJFF);
        }
        return j2;
    }
}
