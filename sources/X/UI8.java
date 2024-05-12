package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UI8 {
    public final int LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public Exception LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final int LJI;
    public final boolean LJII;
    public java.util.Map<String, String> LJIIIIZZ;
    public int LJIIIZ;
    public UI3 LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;

    public UI8() {
        this.LJFF = "";
        this.LJIIIIZZ = new HashMap();
        this.LJIILIIL = true;
    }

    public UI8(int i, String chargeReason) {
        o.LJIIIZ(chargeReason, "chargeReason");
        this.LJFF = "";
        this.LJIIIIZZ = new HashMap();
        this.LJIILIIL = true;
        this.LJ = true;
        this.LJFF = chargeReason;
        this.LJI = i;
        this.LJII = false;
    }

    public UI8(int i, int i2, int i3, Exception exc, boolean z, String chargeReason, int i4, boolean z2) {
        o.LJIIIZ(chargeReason, "chargeReason");
        this.LJFF = "";
        this.LJIIIIZZ = new HashMap();
        this.LJIILIIL = true;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = exc;
        this.LJ = z;
        this.LJFF = chargeReason;
        this.LJI = i4;
        this.LJII = z2;
    }
}
