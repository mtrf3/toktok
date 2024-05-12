package X;

import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Ouq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63424Ouq {
    public final MessagesPerUserResponseBody LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63424Ouq)) {
            return false;
        }
        C63424Ouq c63424Ouq = (C63424Ouq) obj;
        return o.LJ(this.LIZ, c63424Ouq.LIZ) && this.LIZIZ == c63424Ouq.LIZIZ && this.LIZJ == c63424Ouq.LIZJ && o.LJ(this.LIZLLL, c63424Ouq.LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode() + JBR.LIZJ(this.LIZJ, ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetByUserBufferItem(responseBody=");
        LIZ.append(this.LIZ);
        LIZ.append(", reason=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", receivedTimestamp=");
        LIZ.append(this.LIZJ);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C63424Ouq(MessagesPerUserResponseBody messagesPerUserResponseBody, int i, long j, String logId) {
        o.LJIIIZ(logId, "logId");
        this.LIZ = messagesPerUserResponseBody;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = logId;
    }
}
