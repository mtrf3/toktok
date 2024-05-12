package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import kotlin.jvm.internal.o;

/* renamed from: X.GPm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41474GPm {
    public final AwemeDraft LIZ;
    public final PublishFailureReason LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41474GPm)) {
            return false;
        }
        C41474GPm c41474GPm = (C41474GPm) obj;
        return o.LJ(this.LIZ, c41474GPm.LIZ) && o.LJ(this.LIZIZ, c41474GPm.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        PublishFailureReason publishFailureReason = this.LIZIZ;
        return hashCode + (publishFailureReason == null ? 0 : publishFailureReason.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreationBundle(draft=");
        LIZ.append(this.LIZ);
        LIZ.append(", failedReason=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C41474GPm(AwemeDraft draft, PublishFailureReason publishFailureReason) {
        o.LJIIIZ(draft, "draft");
        this.LIZ = draft;
        this.LIZIZ = publishFailureReason;
    }
}
