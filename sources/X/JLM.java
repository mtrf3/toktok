package X;

import android.graphics.Rect;
import android.view.View;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class JLM extends JLL {
    public JLN LJFF;
    public final C62822Ol8 LJI;

    @Override // X.JLL
    public final void LJI() {
        this.LIZ.getLocationOnScreen(LJII());
        this.LIZLLL.left = LJII()[0];
        this.LIZLLL.top = LJII()[1];
        this.LIZLLL.right = this.LIZ.getWidth() + LJII()[0];
        this.LIZLLL.bottom = this.LIZ.getHeight() + LJII()[1];
        this.LIZJ.set(this.LIZLLL.left + LJIIJ().left, this.LIZLLL.top + LJIIJ().top, this.LIZLLL.left + LJIIJ().right, this.LIZLLL.top + LJIIJ().bottom);
    }

    public final Rect LJIIJ() {
        return (Rect) this.LJI.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JLM(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this.LJI = C221108m2.LIZIZ(JLO.LJLIL);
    }

    @Override // X.JLL, X.InterfaceC49154JQw
    public AbstractC49155JQx LJ(Collection<? extends AbstractC49155JQx> observers) {
        AbstractC49155JQx LJ;
        o.LJIIIZ(observers, "observers");
        JLN jln = this.LJFF;
        if (jln != null && jln.LIZ()) {
            JLN jln2 = this.LJFF;
            if (jln2 != null) {
                LJ = jln2.LIZIZ(observers);
            } else {
                return null;
            }
        } else {
            LJ = super.LJ(observers);
        }
        if (LJ != null) {
            UC7.LIZLLL("Algo result pos #", LJ.LIZ());
            return LJ;
        }
        return LJ;
    }

    public final void LJIIJJI(float f, float f2, float f3, float f4) {
        LJIIJ().set(C63081OpJ.LJIJJLI(this.LIZ.getContext(), f), C63081OpJ.LJIJJLI(this.LIZ.getContext(), f2), C63081OpJ.LJIJJLI(this.LIZ.getContext(), f + f3), C63081OpJ.LJIJJLI(this.LIZ.getContext(), f2 + f4));
    }
}
