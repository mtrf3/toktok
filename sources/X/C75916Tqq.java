package X;

/* renamed from: X.Tqq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75916Tqq implements InterfaceC29937Boz {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ C75884TqK LIZIZ;
    public final /* synthetic */ EnumC75915Tqp LIZJ;

    public C75916Tqq(long j, C75884TqK c75884TqK, EnumC75915Tqp enumC75915Tqp) {
        this.LIZ = j;
        this.LIZIZ = c75884TqK;
        this.LIZJ = enumC75915Tqp;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startCountDown, uid = ");
        LIZ.append(this.LIZ);
        LIZ.append(", finish");
        C0NB.LJIIIZ("MultiCoHostTimeOut", X1D.LIZIZ(LIZ));
        this.LIZIZ.LIZJ(this.LIZ, 0L, this.LIZJ);
    }
}
