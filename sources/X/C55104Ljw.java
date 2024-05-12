package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.Ljw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55104Ljw extends SZD {
    public final Class<? extends C2K0> LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC55235Lm3 LJ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZJ, Boolean.valueOf(this.LIZLLL), this.LJ};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C55104Ljw) {
            return C78966Uyw.LJIIIZ(((C55104Ljw) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("GetAbilityPerformanceTrackParams:%s,%s,%s", LIZ());
    }

    public C55104Ljw(Class<? extends C2K0> abilityClass, boolean z, InterfaceC55235Lm3 startScope) {
        o.LJIIIZ(abilityClass, "abilityClass");
        o.LJIIIZ(startScope, "startScope");
        this.LIZJ = abilityClass;
        this.LIZLLL = z;
        this.LJ = startScope;
    }
}
