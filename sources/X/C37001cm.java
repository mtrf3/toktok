package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37001cm<T> extends AbstractC261010s<T> {
    public final String LIZ;
    public final List<T> LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37001cm)) {
            return false;
        }
        C37001cm c37001cm = (C37001cm) obj;
        return o.LJ(this.LIZ, c37001cm.LIZ) && o.LJ(this.LIZIZ, c37001cm.LIZIZ) && this.LIZJ == c37001cm.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LIZIZ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CategoryEffectList(category=");
        LIZ.append(this.LIZ);
        LIZ.append(", effectList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isFirstPanelUpdated=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37001cm(String category, List<? extends T> effectList, boolean z) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(effectList, "effectList");
        this.LIZ = category;
        this.LIZIZ = effectList;
        this.LIZJ = z;
    }
}
