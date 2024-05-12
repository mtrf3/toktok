package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Dyt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35647Dyt {
    public static final /* synthetic */ int LIZLLL = 0;
    public final String LIZ;
    public final EnumC35454Dvm LIZIZ;
    public final Long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35647Dyt)) {
            return false;
        }
        C35647Dyt c35647Dyt = (C35647Dyt) obj;
        return o.LJ(this.LIZ, c35647Dyt.LIZ) && this.LIZIZ == c35647Dyt.LIZIZ && o.LJ(this.LIZJ, c35647Dyt.LIZJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        Long l = this.LIZJ;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ValidatedFirstLikeToast(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", style=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", showDurationMs=");
        return JBR.LJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C35647Dyt(String str, EnumC35454Dvm enumC35454Dvm, Long l) {
        this.LIZ = str;
        this.LIZIZ = enumC35454Dvm;
        this.LIZJ = l;
    }
}
