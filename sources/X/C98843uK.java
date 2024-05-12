package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3uK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98843uK {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TypingStatusEvent(conversationId=");
        LIZ.append(this.LIZ);
        LIZ.append(", createTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", senderUid=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        C98843uK c98843uK;
        String str = null;
        if ((obj instanceof C98843uK) && (c98843uK = (C98843uK) obj) != null) {
            str = c98843uK.LIZ;
        }
        return o.LJ(str, this.LIZ);
    }

    public C98843uK(String str, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
