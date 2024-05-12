package X;

/* renamed from: X.Qeh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67519Qeh implements InterfaceC67508QeW<C67433QdJ> {
    public static final C67519Qeh LIZ = new C67519Qeh();
    public static final C48260Iwq LIZIZ;
    public static final C48260Iwq LIZJ;

    static {
        C61329O5d c61329O5d = new C61329O5d("logSource");
        C67541Qf3 c67541Qf3 = new C67541Qf3();
        c67541Qf3.LIZ = 1;
        LIZIZ = C61328O5c.LJFF(c67541Qf3, c61329O5d);
        C61329O5d c61329O5d2 = new C61329O5d("logEventDropped");
        C67541Qf3 c67541Qf32 = new C67541Qf3();
        c67541Qf32.LIZ = 2;
        LIZJ = C61328O5c.LJFF(c67541Qf32, c61329O5d2);
    }

    @Override // X.InterfaceC67511QeZ
    public final void LIZ(Object obj, InterfaceC67543Qf5 interfaceC67543Qf5) {
        C67433QdJ c67433QdJ = (C67433QdJ) obj;
        InterfaceC67543Qf5 interfaceC67543Qf52 = interfaceC67543Qf5;
        interfaceC67543Qf52.LIZIZ(LIZIZ, c67433QdJ.LIZ);
        interfaceC67543Qf52.LIZIZ(LIZJ, c67433QdJ.LIZIZ);
    }
}
