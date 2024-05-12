package X;

import com.bytedance.im.core.proto.NewMessageNotify;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Ous, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63426Ous {
    public final NewMessageNotify LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63426Ous)) {
            return false;
        }
        C63426Ous c63426Ous = (C63426Ous) obj;
        return o.LJ(this.LIZ, c63426Ous.LIZ) && this.LIZIZ == c63426Ous.LIZIZ && o.LJ(this.LIZJ, c63426Ous.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewMsgNotifyBufferItem(notifyBody=");
        LIZ.append(this.LIZ);
        LIZ.append(", receivedTimestamp=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C63426Ous(NewMessageNotify newMessageNotify, long j, String str) {
        this.LIZ = newMessageNotify;
        this.LIZIZ = j;
        this.LIZJ = str;
    }
}
