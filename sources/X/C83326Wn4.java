package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.Wn4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83326Wn4 extends AbstractC83320Wmy {
    public final String LIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("TextUIOption:%s", this.LIZ);
    }

    public C83326Wn4(String text) {
        o.LJIIIZ(text, "text");
        this.LIZ = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83326Wn4)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C83326Wn4) obj).LIZ}, new Object[]{this.LIZ});
    }
}
