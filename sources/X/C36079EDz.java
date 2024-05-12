package X;

import Y.ARunnableS25S0200000_6;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.EDz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36079EDz extends AbstractC36078EDy {
    public final java.util.Map<EEY, EEY> LJLIL = new LinkedHashMap();
    public final java.util.Map<EEY, Integer> LJLILLLLZI = new LinkedHashMap();

    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
    }

    @Override // X.AbstractC36078EDy
    public final EFK LJFF() {
        return EFK.BACKGROUND;
    }

    @Override // X.AbstractC36078EDy, X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        super.LIZJ(components);
        C36093EEn.LIZ.getClass();
        C36093EEn.LIZIZ.LJ(EFK.BACKGROUND, components);
        for (EEY eey : components) {
            o.LJII(eey, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
            LJII((EE1) eey);
        }
    }

    public final void LJI(EE1 ee12) {
        C36093EEn.LIZ.getClass();
        C36093EEn.LIZIZ.LJFF(ee12);
        EEY eey = (EEY) ((LinkedHashMap) this.LJLIL).get(ee12);
        if (eey != null) {
            Integer num = (Integer) ((LinkedHashMap) this.LJLILLLLZI).get(eey);
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 1) {
                    this.LJLILLLLZI.remove(eey);
                    LJII((EE1) eey);
                } else {
                    this.LJLILLLLZI.put(eey, Integer.valueOf(intValue - 1));
                }
            }
            this.LJLIL.remove(ee12);
        }
    }

    public final void LJII(EE1 ee12) {
        ExecutorService LIZLLL;
        if (ee12 instanceof InterfaceC36076EDw) {
            EE4 threadType = ((InterfaceC36076EDw) ee12).threadType();
            if (threadType != null) {
                int i = EE2.LIZ[threadType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        LIZLLL = C37179EiV.LIZJ(ee12.serialExecute());
                    }
                } else {
                    LIZLLL = C38995FSd.LIZLLL();
                    o.LJIIIIZZ(LIZLLL, "getIOExecutor()");
                }
                LIZLLL.execute(new ARunnableS25S0200000_6(this, ee12, 37));
                return;
            }
            throw new C162476Zf();
        }
        C37179EiV.LIZJ(ee12.serialExecute()).execute(new ARunnableS25S0200000_6(this, ee12, 38));
    }
}
