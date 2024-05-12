package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.1mC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42841mC extends C1RZ {
    public final C13640gC LIZLLL;
    public final int LJ;
    public boolean LJFF;
    public Typeface LJI;

    public abstract Typeface LIZLLL(Context context);

    @Override // X.InterfaceC13460fu
    public final C13640gC LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC13460fu
    public final int LIZJ() {
        return this.LJ;
    }

    public AbstractC42841mC(C13640gC c13640gC, int i, C13610g9 c13610g9) {
        super(c13610g9);
        this.LIZLLL = c13640gC;
        this.LJ = i;
    }
}
