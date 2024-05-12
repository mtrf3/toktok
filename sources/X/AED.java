package X;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class AED extends AEC {
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJL;

    public final Object[] LIZJ() {
        return new Object[]{Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), this.LJLJL};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AED) {
            return C78966Uyw.LJIIIZ(((AED) obj).LIZJ(), LIZJ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZJ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("ComposableItem:%s,%s,%s", LIZJ());
    }

    public AED(InterfaceC88471Ynr interfaceC88471Ynr, boolean z, boolean z2) {
        super(false, null, 15);
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = interfaceC88471Ynr;
    }
}
