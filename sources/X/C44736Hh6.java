package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Hh6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44736Hh6 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C44736Hh6 LJLIL = new C44736Hh6();

    public C44736Hh6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int LIZIZ;
        int i;
        int[] LJIIJ;
        int[] LJIIJ2 = C44739Hh9.LJIIJ(C44737Hh7.LIZ());
        if (C79234V7u.LJIIIIZZ(true)) {
            LIZIZ = InterfaceC44798Hi6.LJFF.shotScreenEncodeSizeIndex();
        } else {
            LIZIZ = C44742HhC.LIZIZ();
        }
        List<String> LIZ = C44772Hhg.LIZ();
        if (C32151Nz.LJJIIZI(LIZ) && LIZIZ < LIZ.size() && (LJIIJ = C44739Hh9.LJIIJ((String) ListProtector.get(LIZ, LIZIZ))) != null) {
            LJIIJ2 = LJIIJ;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ShotScreenResolution ; ");
        LIZ2.append(Arrays.toString(LJIIJ2));
        C5Z5.LIZ(X1D.LIZIZ(LIZ2));
        if (LJIIJ2 == null || LJIIJ2.length != 2 || (i = LJIIJ2[0]) <= 0 || LJIIJ2[1] <= 0) {
            i = 576;
        }
        return Integer.valueOf(i);
    }
}
