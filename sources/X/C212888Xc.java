package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.8Xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212888Xc extends SZD {
    public final C8RL LIZJ;

    public final int hashCode() {
        return Objects.hash(this.LIZJ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("BindProxyParams:%s", this.LIZJ);
    }

    public C212888Xc(C8RL item) {
        o.LJIIIZ(item, "item");
        this.LIZJ = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C212888Xc)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C212888Xc) obj).LIZJ}, new Object[]{this.LIZJ});
    }
}
