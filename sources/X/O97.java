package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O97 {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O97)) {
            return false;
        }
        O97 o97 = (O97) obj;
        return o.LJ(this.LIZ, o97.LIZ) && this.LIZIZ == o97.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SparkViewModel(sparkView=");
        LIZ.append(this.LIZ);
        LIZ.append(", isPreCreate=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public O97(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView, boolean z) {
        o.LJIIIZ(sparkView, "sparkView");
        this.LIZ = sparkView;
        this.LIZIZ = z;
    }
}
