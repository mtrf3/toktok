package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EFD {
    public final int LIZ;
    public final String LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExceptionMsg(msgType=");
        LIZ.append(this.LIZ);
        LIZ.append(", msgContent='");
        return JBR.LJFF(LIZ, this.LIZIZ, "')", LIZ);
    }

    public EFD(int i, String msgContent) {
        o.LJIIIZ(msgContent, "msgContent");
        this.LIZ = i;
        this.LIZIZ = msgContent;
    }
}
