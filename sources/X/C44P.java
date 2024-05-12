package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.44P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44P extends C40S {
    public final C63120Opw LIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("OnCreateConversationEvent:%s", this.LIZ);
    }

    public C44P(C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        this.LIZ = conversation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44P)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C44P) obj).LIZ}, new Object[]{this.LIZ});
    }
}
