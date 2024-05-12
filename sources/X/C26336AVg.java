package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.o;

/* renamed from: X.AVg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26336AVg {
    public final int LIZ;
    public final AwemeDraft LIZIZ;

    public C26336AVg() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26336AVg)) {
            return false;
        }
        C26336AVg c26336AVg = (C26336AVg) obj;
        return this.LIZ == c26336AVg.LIZ && o.LJ(this.LIZIZ, c26336AVg.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        AwemeDraft awemeDraft = this.LIZIZ;
        return i + (awemeDraft == null ? 0 : awemeDraft.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftsInfo(count=");
        LIZ.append(this.LIZ);
        LIZ.append(", firstDraft=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C26336AVg(int i, AwemeDraft awemeDraft) {
        this.LIZ = i;
        this.LIZIZ = awemeDraft;
    }
}
