package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.42d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1029142d extends C40S {
    public final C63120Opw LIZ;
    public final int LIZIZ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZ, Integer.valueOf(this.LIZIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1029142d) {
            return C78966Uyw.LJIIIZ(((C1029142d) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("OnUpdateConversationEvent:%s,%s", LIZ());
    }

    public C1029142d(int i, C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        this.LIZ = conversation;
        this.LIZIZ = i;
    }
}
