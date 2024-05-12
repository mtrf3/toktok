package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.40R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40R extends C40S {
    public final C63120Opw LIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("OnDissolvedConversationEvent:%s", this.LIZ);
    }

    public C40R(C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        this.LIZ = conversation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40R)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C40R) obj).LIZ}, new Object[]{this.LIZ});
    }
}
