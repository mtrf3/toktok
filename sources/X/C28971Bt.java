package X;

/* renamed from: X.1Bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28971Bt implements InterfaceC03220As {
    public long LIZ;

    @Override // X.InterfaceC03220As
    public final InterfaceC03210Ar LIZ() {
        return new InterfaceC03210Ar() { // from class: X.1Bs
            public final C0M5<Long> LIZ = new C0M5<>();

            @Override // X.InterfaceC03210Ar
            public final long LIZ(long j) {
                Long LJ = this.LIZ.LJ(j, null);
                if (LJ == null) {
                    C28971Bt c28971Bt = C28971Bt.this;
                    long j2 = c28971Bt.LIZ;
                    c28971Bt.LIZ = 1 + j2;
                    LJ = Long.valueOf(j2);
                    this.LIZ.LJI(j, LJ);
                }
                return LJ.longValue();
            }
        };
    }
}
