package X;

/* renamed from: X.Qel, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67523Qel implements InterfaceC67508QeW<C67475Qdz> {
    public static final C67523Qel LIZ = new C67523Qel();
    public static final C48260Iwq LIZIZ;
    public static final C48260Iwq LIZJ;

    static {
        C61329O5d c61329O5d = new C61329O5d("currentCacheSizeBytes");
        C67541Qf3 c67541Qf3 = new C67541Qf3();
        c67541Qf3.LIZ = 1;
        LIZIZ = C61328O5c.LJFF(c67541Qf3, c61329O5d);
        C61329O5d c61329O5d2 = new C61329O5d("maxCacheSizeBytes");
        C67541Qf3 c67541Qf32 = new C67541Qf3();
        c67541Qf32.LIZ = 2;
        LIZJ = C61328O5c.LJFF(c67541Qf32, c61329O5d2);
    }

    @Override // X.InterfaceC67511QeZ
    public final void LIZ(Object obj, InterfaceC67543Qf5 interfaceC67543Qf5) {
        C67475Qdz c67475Qdz = (C67475Qdz) obj;
        InterfaceC67543Qf5 interfaceC67543Qf52 = interfaceC67543Qf5;
        interfaceC67543Qf52.LIZLLL(LIZIZ, c67475Qdz.LIZ);
        interfaceC67543Qf52.LIZLLL(LIZJ, c67475Qdz.LIZIZ);
    }
}
