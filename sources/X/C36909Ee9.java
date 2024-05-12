package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Ee9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36909Ee9 {
    public final String LIZ;
    public final long LIZIZ;
    public final List<String> LIZJ;

    public final int hashCode() {
        int intValue = CastIntegerProtector.valueOf(this.LIZ).intValue() * 31;
        long j = this.LIZIZ;
        return this.LIZJ.hashCode() + ((intValue + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "AccessTokenVerificationResult{expiresInMillis=" + this.LIZIZ + ", channelId=" + this.LIZ + ", permissions=" + this.LIZJ + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36909Ee9.class != obj.getClass()) {
            return false;
        }
        C36909Ee9 c36909Ee9 = (C36909Ee9) obj;
        if (!this.LIZ.equals(c36909Ee9.LIZ) || this.LIZIZ != c36909Ee9.LIZIZ) {
            return false;
        }
        return this.LIZJ.equals(c36909Ee9.LIZJ);
    }

    public C36909Ee9(long j, String str, List list) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = Collections.unmodifiableList(list);
    }
}
