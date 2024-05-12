package X;

/* renamed from: X.1LZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LZ extends AbstractC07660Ru {
    public final EnumC07540Ri LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1LZ) && this.LIZ == ((C1LZ) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowDefaultPage(defaultPage=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C1LZ(EnumC07540Ri enumC07540Ri) {
        this.LIZ = enumC07540Ri;
    }
}
