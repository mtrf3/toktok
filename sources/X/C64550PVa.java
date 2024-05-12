package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.PVa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64550PVa extends PVP {
    public static final C39745Fin LIZJ = C39745Fin.LIZIZ("application/x-www-form-urlencoded");
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    @Override // X.PVP
    public final long LIZ() {
        return LJI(null, true);
    }

    @Override // X.PVP
    public final C39745Fin LIZIZ() {
        return LIZJ;
    }

    @Override // X.PVP
    public final void LJ(PVU pvu) {
        LJI(pvu, false);
    }

    public final String LJFF(int i) {
        return (String) ListProtector.get(this.LIZ, i);
    }

    public C64550PVa(List<String> list, List<String> list2) {
        this.LIZ = PVA.LJIILIIL(list);
        this.LIZIZ = PVA.LJIILIIL(list2);
    }

    public final long LJI(PVU pvu, boolean z) {
        C64533PUj LJJIJ;
        if (z) {
            LJJIJ = new C64533PUj();
        } else {
            LJJIJ = pvu.LJJIJ();
        }
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                LJJIJ.LJJIII(38);
            }
            LJJIJ.LJJJI((String) ListProtector.get(this.LIZ, i));
            LJJIJ.LJJIII(61);
            LJJIJ.LJJJI((String) ListProtector.get(this.LIZIZ, i));
        }
        if (z) {
            long j = LJJIJ.LJLILLLLZI;
            LJJIJ.LIZ();
            return j;
        }
        return 0L;
    }
}
