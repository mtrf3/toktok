package X;

/* renamed from: X.VwH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81349VwH {
    public boolean LIZ;
    public boolean LIZIZ = true;
    public Boolean LIZJ;

    public abstract void LIZ();

    static {
        C16880lQ.LJLLJ(AbstractC81349VwH.class);
    }

    public final void LIZIZ(boolean z) {
        Boolean bool;
        if (this.LIZIZ == z) {
            return;
        }
        this.LIZIZ = z;
        if (z && (bool = this.LIZJ) != null) {
            boolean booleanValue = bool.booleanValue();
            if (this.LIZ != booleanValue) {
                if (!this.LIZIZ) {
                    this.LIZJ = Boolean.valueOf(booleanValue);
                } else {
                    this.LIZ = booleanValue;
                    LIZ();
                }
            }
            this.LIZJ = null;
        }
    }
}
