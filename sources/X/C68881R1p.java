package X;

/* renamed from: X.R1p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68881R1p implements InterfaceC68884R1s {
    public final QI3 LIZ;

    public C68881R1p(QI3 qi3) {
        this.LIZ = qi3;
        C1KV c1kv = new C1KV(1);
        String str = qi3.LJIIIZ;
        Object obj = c1kv.LJLIL;
        ((C68878R1m) obj).LIZ = str;
        ((C68878R1m) obj).LIZJ = 1;
        ((C68878R1m) c1kv.LJLIL).LIZIZ = C16880lQ.LLLLIIIILLL().getName();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Console logger debug is:");
        LIZ.append(qi3.LJJJ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        Object obj2 = c1kv.LJLIL;
        ((C68878R1m) obj2).LJFF = LIZIZ;
        LIZ((C68878R1m) obj2);
    }

    @Override // X.InterfaceC68884R1s
    public final void LIZ(C68878R1m c68878R1m) {
        if (!this.LIZ.LJJJ) {
        }
    }
}
