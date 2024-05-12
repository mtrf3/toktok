package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ses, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72626Ses {
    public final EnumC72639Sf5 LIZ;
    public final EnumC72639Sf5 LIZIZ;

    public C72626Ses() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72626Ses)) {
            return false;
        }
        C72626Ses c72626Ses = (C72626Ses) obj;
        return this.LIZ == c72626Ses.LIZ && this.LIZIZ == c72626Ses.LIZIZ;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        EnumC72639Sf5 enumC72639Sf5 = this.LIZIZ;
        return hashCode + (enumC72639Sf5 == null ? 0 : enumC72639Sf5.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OnboardingStep(onboardingState=");
        LIZ.append(this.LIZ);
        LIZ.append(", prevOnboardingState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C72626Ses(EnumC72639Sf5 onboardingState, int i) {
        onboardingState = (i & 1) != 0 ? EnumC72639Sf5.NOT_INITIALIZED : onboardingState;
        o.LJIIIZ(onboardingState, "onboardingState");
        this.LIZ = onboardingState;
        this.LIZIZ = null;
    }
}
