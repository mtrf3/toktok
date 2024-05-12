package X;

/* renamed from: X.Qej, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67521Qej implements InterfaceC67508QeW<C67489QeD> {
    public static final C67521Qej LIZ = new C67521Qej();
    public static final C48260Iwq LIZIZ;
    public static final C48260Iwq LIZJ;

    static {
        C61329O5d c61329O5d = new C61329O5d("startMs");
        C67541Qf3 c67541Qf3 = new C67541Qf3();
        c67541Qf3.LIZ = 1;
        LIZIZ = C61328O5c.LJFF(c67541Qf3, c61329O5d);
        C61329O5d c61329O5d2 = new C61329O5d("endMs");
        C67541Qf3 c67541Qf32 = new C67541Qf3();
        c67541Qf32.LIZ = 2;
        LIZJ = C61328O5c.LJFF(c67541Qf32, c61329O5d2);
    }

    @Override // X.InterfaceC67511QeZ
    public final void LIZ(Object obj, InterfaceC67543Qf5 interfaceC67543Qf5) {
        C67489QeD c67489QeD = (C67489QeD) obj;
        InterfaceC67543Qf5 interfaceC67543Qf52 = interfaceC67543Qf5;
        interfaceC67543Qf52.LIZLLL(LIZIZ, c67489QeD.LIZ);
        interfaceC67543Qf52.LIZLLL(LIZJ, c67489QeD.LIZIZ);
    }
}
