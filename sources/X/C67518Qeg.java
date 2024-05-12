package X;

/* renamed from: X.Qeg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67518Qeg implements InterfaceC67508QeW<C67453Qdd> {
    public static final C67518Qeg LIZ = new C67518Qeg();
    public static final C48260Iwq LIZIZ;
    public static final C48260Iwq LIZJ;

    static {
        C61329O5d c61329O5d = new C61329O5d("eventsDroppedCount");
        C67541Qf3 c67541Qf3 = new C67541Qf3();
        c67541Qf3.LIZ = 1;
        LIZIZ = C61328O5c.LJFF(c67541Qf3, c61329O5d);
        C61329O5d c61329O5d2 = new C61329O5d("reason");
        C67541Qf3 c67541Qf32 = new C67541Qf3();
        c67541Qf32.LIZ = 3;
        LIZJ = C61328O5c.LJFF(c67541Qf32, c61329O5d2);
    }

    @Override // X.InterfaceC67511QeZ
    public final void LIZ(Object obj, InterfaceC67543Qf5 interfaceC67543Qf5) {
        C67453Qdd c67453Qdd = (C67453Qdd) obj;
        InterfaceC67543Qf5 interfaceC67543Qf52 = interfaceC67543Qf5;
        interfaceC67543Qf52.LIZLLL(LIZIZ, c67453Qdd.LIZ);
        interfaceC67543Qf52.LIZIZ(LIZJ, c67453Qdd.LIZIZ);
    }
}
