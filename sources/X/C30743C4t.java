package X;

/* renamed from: X.C4t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30743C4t {
    public final boolean LIZ;
    public final EnumC30108Brk LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30743C4t)) {
            return false;
        }
        C30743C4t c30743C4t = (C30743C4t) obj;
        return this.LIZ == c30743C4t.LIZ && this.LIZIZ == c30743C4t.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        EnumC30108Brk enumC30108Brk = this.LIZIZ;
        return i + (enumC30108Brk == null ? 0 : enumC30108Brk.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProgrammedLiveMenuViewEvent(visible=");
        LIZ.append(this.LIZ);
        LIZ.append(", position=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C30743C4t(boolean z, EnumC30108Brk enumC30108Brk) {
        this.LIZ = z;
        this.LIZIZ = enumC30108Brk;
    }
}
