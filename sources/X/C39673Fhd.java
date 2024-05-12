package X;

/* renamed from: X.Fhd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39673Fhd extends AbstractC39672Fhc {
    public final Object LJLIL;

    public C39673Fhd(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.AbstractC39672Fhc
    public final Object zza() {
        return this.LJLIL;
    }

    @Override // X.AbstractC39672Fhc
    public final boolean zzb() {
        return true;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.LJLIL + ")";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39673Fhd) {
            return this.LJLIL.equals(((C39673Fhd) obj).LJLIL);
        }
        return false;
    }
}
