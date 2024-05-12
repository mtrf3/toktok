package X;

import com.bytedance.im.core.proto.MessageBody;
import kotlin.jvm.internal.o;

/* renamed from: X.Ou2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63374Ou2 {
    public final MessageBody LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63374Ou2)) {
            return false;
        }
        C63374Ou2 c63374Ou2 = (C63374Ou2) obj;
        return o.LJ(this.LIZ, c63374Ou2.LIZ) && this.LIZIZ == c63374Ou2.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AckMessageInfo(messageBody=");
        LIZ.append(this.LIZ);
        LIZ.append(", firstSaveToDb=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C63374Ou2(MessageBody messageBody, boolean z) {
        o.LJIIIZ(messageBody, "messageBody");
        this.LIZ = messageBody;
        this.LIZIZ = z;
    }
}
