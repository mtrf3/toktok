package X;

/* renamed from: X.Or7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63193Or7 {
    public final long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ = "";

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReceiverMsgModel(msgServerId=");
        LIZ.append(this.LIZ);
        LIZ.append(", recieve_start_time=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", send_start_time=");
        LIZ.append(this.LIZJ);
        LIZ.append(", recieve_end_time=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", recieve_cost_time=");
        LIZ.append(this.LJ);
        LIZ.append(", load_cost_time=");
        LIZ.append(this.LJFF);
        LIZ.append(", total_cost_time=");
        LIZ.append(this.LJI);
        LIZ.append(", isDiscontinuous=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", isWs=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", logId='");
        return JBR.LJFF(LIZ, this.LJIIJ, "')", LIZ);
    }

    public C63193Or7(long j) {
        this.LIZ = j;
    }
}
