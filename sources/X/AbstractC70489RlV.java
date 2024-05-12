package X;

/* renamed from: X.RlV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC70489RlV {
    public final EnumC70491RlX LIZ;
    public final LA8 LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + this.LIZ.hashCode() + 31;
    }

    public final boolean equals(Object obj) {
        AbstractC70489RlV abstractC70489RlV;
        if ((obj instanceof AbstractC70489RlV) && (abstractC70489RlV = (AbstractC70489RlV) obj) != null && abstractC70489RlV.LIZ == this.LIZ && abstractC70489RlV.LIZIZ == this.LIZIZ) {
            return true;
        }
        return false;
    }

    public AbstractC70489RlV(EnumC70491RlX enumC70491RlX, LA8 la8) {
        this.LIZ = enumC70491RlX;
        this.LIZIZ = la8;
    }
}
