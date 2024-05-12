package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1d1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37151d1<T> extends AbstractC261010s<T> {
    public final List<T> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37151d1) && o.LJ(this.LIZ, ((C37151d1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveEffectFirstPanelList(effectList=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37151d1(List<? extends T> effectList) {
        o.LJIIIZ(effectList, "effectList");
        this.LIZ = effectList;
    }
}
