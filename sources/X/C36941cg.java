package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36941cg<T> extends AbstractC260710p<T> {
    public final List<T> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36941cg) && o.LJ(this.LIZ, ((C36941cg) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SaveSoundEffectOrder(effectList=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36941cg(List<? extends T> effectList) {
        o.LJIIIZ(effectList, "effectList");
        this.LIZ = effectList;
    }
}
