package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import kotlin.jvm.internal.o;

/* renamed from: X.Tr9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75935Tr9 {
    public final int LIZ;
    public final int LIZIZ;
    public final AbnormalDisconnectReason LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75935Tr9)) {
            return false;
        }
        C75935Tr9 c75935Tr9 = (C75935Tr9) obj;
        return this.LIZ == c75935Tr9.LIZ && this.LIZIZ == c75935Tr9.LIZIZ && o.LJ(this.LIZJ, c75935Tr9.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        AbnormalDisconnectReason abnormalDisconnectReason = this.LIZJ;
        return i + (abnormalDisconnectReason == null ? 0 : abnormalDisconnectReason.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkMicFinishMessage(source=");
        LIZ.append(this.LIZ);
        LIZ.append(", detailedCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", abnormalDisconnectReason=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C75935Tr9(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = abnormalDisconnectReason;
    }
}
