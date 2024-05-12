package X;

import com.ss.android.ugc.aweme.comment.event.PinNotice;
import kotlin.jvm.internal.o;

/* renamed from: X.6uZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175436uZ {
    public final EnumC177716yF LIZ;
    public final PinNotice LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175436uZ)) {
            return false;
        }
        C175436uZ c175436uZ = (C175436uZ) obj;
        return this.LIZ == c175436uZ.LIZ && o.LJ(this.LIZIZ, c175436uZ.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        PinNotice pinNotice = this.LIZIZ;
        return hashCode + (pinNotice == null ? 0 : pinNotice.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinEvent(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", notice=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C175436uZ(EnumC177716yF status, PinNotice pinNotice) {
        o.LJIIIZ(status, "status");
        this.LIZ = status;
        this.LIZIZ = pinNotice;
    }
}
