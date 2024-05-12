package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108304Mw {
    public static final /* synthetic */ int LJLJI = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C4N0.LJLIL);
    public C4W6 LJLILLLLZI = new C4W6();

    static {
        new C83263Oo();
    }

    public abstract void LIZ(List<? extends C63120Opw> list);

    public abstract void LIZIZ(List<? extends C63120Opw> list);

    public abstract void LIZLLL();

    public abstract boolean LJ();

    public abstract void LJFF();

    public abstract void LJI();

    public void LJII() {
        C4W6 c4w6 = this.LJLILLLLZI;
        if (c4w6 != null) {
            ((ArrayList) c4w6.LJLIL).clear();
        }
        this.LJLILLLLZI = null;
    }

    public void LIZJ(C4W9... observers) {
        o.LJIIIZ(observers, "observers");
        for (C4W9 observer : observers) {
            C4W6 c4w6 = this.LJLILLLLZI;
            if (c4w6 != null) {
                o.LJIIIZ(observer, "observer");
                ((ArrayList) c4w6.LJLIL).add(observer);
            }
        }
    }
}
