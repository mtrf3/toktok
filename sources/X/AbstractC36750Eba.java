package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Eba, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC36750Eba {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public AbstractC36750Eba(String str) {
        this.LIZ = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC36750Eba) || obj == null) {
            return false;
        }
        AbstractC36750Eba abstractC36750Eba = (AbstractC36750Eba) obj;
        if (!o.LJ(abstractC36750Eba.getClass(), getClass())) {
            return false;
        }
        return o.LJ(this.LIZ, abstractC36750Eba.LIZ);
    }
}
