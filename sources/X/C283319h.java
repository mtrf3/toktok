package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.19h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C283319h implements InterfaceC1039145z<C04R> {
    public final List<C04R> LIZ = new ArrayList();

    @Override // X.InterfaceC1039145z
    public final Iterator<C04R> iterator() {
        return ((ArrayList) this.LIZ).iterator();
    }

    public final void LIZ(final String str, final Object obj) {
        ((ArrayList) this.LIZ).add(new Object(str, obj) { // from class: X.04R
            public final String LIZ;
            public final Object LIZIZ;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C04R)) {
                    return false;
                }
                C04R c04r = (C04R) obj2;
                return o.LJ(this.LIZ, c04r.LIZ) && o.LJ(this.LIZIZ, c04r.LIZIZ);
            }

            public final int hashCode() {
                int hashCode = this.LIZ.hashCode() * 31;
                Object obj2 = this.LIZIZ;
                return hashCode + (obj2 == null ? 0 : obj2.hashCode());
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ValueElement(name=");
                LIZ.append(this.LIZ);
                LIZ.append(", value=");
                return U26.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = obj;
            }
        });
    }
}
