package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.o;

/* renamed from: X.2sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72352sh extends AbstractC72372sj {
    public final AwemeDraft LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C72352sh) && o.LJ(this.LIZ, ((C72352sh) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftVideo(data=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C72352sh(AwemeDraft data) {
        o.LJIIIZ(data, "data");
        this.LIZ = data;
    }
}
