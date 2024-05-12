package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.1d6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37201d6<T> extends AbstractC261010s<T> {
    public final T LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37201d6)) {
            return false;
        }
        C37201d6 c37201d6 = (C37201d6) obj;
        return o.LJ(this.LIZ, c37201d6.LIZ) && this.LIZIZ == c37201d6.LIZIZ;
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
        LIZ.append("UpdateFavoriteFail(effect=");
        LIZ.append(this.LIZ);
        LIZ.append(", wasTryingToAdd=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37201d6(LiveEffect effect, boolean z) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
        this.LIZIZ = z;
    }
}
