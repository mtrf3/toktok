package X;

import java.util.Objects;

/* renamed from: X.3Y6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Y6 extends C3UX {
    public final String LJ;

    public C3Y6() {
        this(0);
    }

    public final int hashCode() {
        return Objects.hash(this.LJ);
    }

    @Override // X.C3UX
    public final String toString() {
        return C78966Uyw.LJJJLL("SubmitListComputationKey:%s", this.LJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Y6(int i) {
        super("im_submit_list_performance", null, 0.0f, C3US.TEA, 6);
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        this.LJ = LIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3Y6)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C3Y6) obj).LJ}, new Object[]{this.LJ});
    }
}
