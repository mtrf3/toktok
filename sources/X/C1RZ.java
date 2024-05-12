package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.1RZ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1RZ implements InterfaceC13460fu {
    public final int LIZ;
    public final InterfaceC13330fh LIZIZ;
    public final C13610g9 LIZJ;

    @Override // X.InterfaceC13460fu
    public final int LIZIZ() {
        return this.LIZ;
    }

    public C1RZ(C13610g9 c13610g9) {
        C32971Rd c32971Rd = new InterfaceC13330fh() { // from class: X.1Rd
            @Override // X.InterfaceC13330fh
            public final Object LIZ() {
                throw new UnsupportedOperationException("All preloaded fonts are blocking.");
            }

            @Override // X.InterfaceC13330fh
            public final Typeface LIZIZ(Context context, C1RZ c1rz) {
                AbstractC42841mC abstractC42841mC;
                if (!(c1rz instanceof AbstractC42841mC) || (abstractC42841mC = (AbstractC42841mC) c1rz) == null) {
                    return null;
                }
                if (!abstractC42841mC.LJFF && abstractC42841mC.LJI == null) {
                    abstractC42841mC.LJI = abstractC42841mC.LIZLLL(context);
                }
                abstractC42841mC.LJFF = true;
                return abstractC42841mC.LJI;
            }
        };
        this.LIZ = 0;
        this.LIZIZ = c32971Rd;
        this.LIZJ = c13610g9;
    }
}
