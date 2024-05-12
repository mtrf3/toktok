package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EE0 extends AbstractC36078EDy {
    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
    }

    @Override // X.AbstractC36078EDy
    public final EFK LJFF() {
        return EFK.MAIN;
    }

    @Override // X.AbstractC36078EDy, X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        super.LIZJ(components);
        C36093EEn.LIZ.getClass();
        C36093EEn.LIZIZ.LJ(EFK.MAIN, components);
        for (EEY eey : components) {
            C36093EEn.LIZ.getClass();
            EE9 ee9 = C36093EEn.LIZIZ;
            o.LJII(eey, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
            ee9.LJFF((EE1) eey);
        }
    }
}
