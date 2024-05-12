package X;

import X.InterfaceC57357MfB;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XGT<D extends InterfaceC57357MfB> extends XGV<D> {
    public final XGS LJ;
    public final C57301MeH LJFF;

    public final Object[] LIZ() {
        return new Object[]{this.LJ, this.LJFF};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XGT) {
            return C78966Uyw.LJIIIZ(((XGT) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("MotaError:%s,%s", LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XGT(XGS r, C57301MeH c57301MeH) {
        super(r, c57301MeH);
        o.LJIIIZ(r, "r");
        this.LJ = r;
        this.LJFF = c57301MeH;
    }
}
