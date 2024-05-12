package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1d2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37161d2<T> extends AbstractC261010s<T> {
    public final List LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37161d2) && o.LJ(this.LIZ, ((C37161d2) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveEffectPanelList(effectPanelList=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C37161d2(List effectPanelList) {
        o.LJIIIZ(effectPanelList, "effectPanelList");
        this.LIZ = effectPanelList;
    }
}
