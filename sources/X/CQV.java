package X;

import android.text.style.ReplacementSpan;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CQV {
    public final ReplacementSpan LIZ;
    public final BadgeStruct LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CQV)) {
            return false;
        }
        CQV cqv = (CQV) obj;
        return o.LJ(this.LIZ, cqv.LIZ) && o.LJ(this.LIZIZ, cqv.LIZIZ);
    }

    public final int hashCode() {
        ReplacementSpan replacementSpan = this.LIZ;
        int hashCode = (replacementSpan == null ? 0 : replacementSpan.hashCode()) * 31;
        BadgeStruct badgeStruct = this.LIZIZ;
        return hashCode + (badgeStruct != null ? badgeStruct.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BadgeSpanModel(replacementSpan=");
        LIZ.append(this.LIZ);
        LIZ.append(", struct=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CQV(ReplacementSpan replacementSpan, BadgeStruct badgeStruct) {
        this.LIZ = replacementSpan;
        this.LIZIZ = badgeStruct;
    }
}
