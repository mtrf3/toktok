package X;

import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CH3 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, Float>> {
    public static final CH3 LJLIL = new CH3();

    public CH3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, Float> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(EF7.LJIIIZ);
            C05060Hu[] c05060HuArr = {C05060Hu.LIZJ, C05060Hu.LIZLLL, C05060Hu.LJ, C05060Hu.LJFF, C05060Hu.LJI, C05060Hu.LJII, C05060Hu.LJIIIIZZ, C05060Hu.LJIIIZ, C05060Hu.LJIIJ};
            Bundle bundle = new Bundle();
            LIZIZ.LJIILIIL(c05060HuArr, bundle);
            for (int i = 0; i < 9; i++) {
                C05060Hu c05060Hu = c05060HuArr[i];
                String str = c05060Hu.LIZ;
                o.LJIIIIZZ(str, "feature.mKey");
                linkedHashMap.put(str, Float.valueOf(bundle.getFloat(c05060Hu.LIZ)));
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return linkedHashMap;
    }
}
