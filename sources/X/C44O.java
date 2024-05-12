package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.44O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44O extends AbstractC89473fD {
    public final String LIZ;
    public final boolean LIZIZ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZ, Boolean.valueOf(this.LIZIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44O) {
            return C78966Uyw.LJIIIZ(((C44O) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("OnClearMessageEvent:%s,%s", LIZ());
    }

    public C44O(String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        this.LIZ = conversationId;
        this.LIZIZ = true;
    }
}
