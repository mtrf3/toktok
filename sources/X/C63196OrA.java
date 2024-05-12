package X;

/* renamed from: X.OrA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63196OrA {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public C109544Rq LJFF;
    public C63120Opw LJI;
    public EP1 LJII;

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProcessNotifyResult{isIgnored=");
        LIZ.append(this.LIZ);
        LIZ.append(", isCursorDiscontinuous=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isSucceed=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isMessageNew=");
        C76965UIn.LIZJ(LIZ, this.LIZLLL, ", isProcessedBySendHandler=", false, ", message=");
        C109544Rq c109544Rq = this.LJFF;
        String str2 = null;
        if (c109544Rq != null) {
            str = c109544Rq.getUuid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", conversation=");
        C63120Opw c63120Opw = this.LJI;
        if (c63120Opw != null) {
            str2 = c63120Opw.getConversationId();
        }
        return JBR.LJFF(LIZ, str2, "}", LIZ);
    }
}
