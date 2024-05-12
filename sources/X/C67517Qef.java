package X;

/* renamed from: X.Qef, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67517Qef implements InterfaceC67508QeW<C67430QdG> {
    public static final C67517Qef LIZ = new C67517Qef();
    public static final C48260Iwq LIZIZ;
    public static final C48260Iwq LIZJ;
    public static final C48260Iwq LIZLLL;
    public static final C48260Iwq LJ;

    static {
        C61329O5d c61329O5d = new C61329O5d("window");
        C67541Qf3 c67541Qf3 = new C67541Qf3();
        c67541Qf3.LIZ = 1;
        LIZIZ = C61328O5c.LJFF(c67541Qf3, c61329O5d);
        C61329O5d c61329O5d2 = new C61329O5d("logSourceMetrics");
        C67541Qf3 c67541Qf32 = new C67541Qf3();
        c67541Qf32.LIZ = 2;
        LIZJ = C61328O5c.LJFF(c67541Qf32, c61329O5d2);
        C61329O5d c61329O5d3 = new C61329O5d("globalMetrics");
        C67541Qf3 c67541Qf33 = new C67541Qf3();
        c67541Qf33.LIZ = 3;
        LIZLLL = C61328O5c.LJFF(c67541Qf33, c61329O5d3);
        C61329O5d c61329O5d4 = new C61329O5d("appNamespace");
        C67541Qf3 c67541Qf34 = new C67541Qf3();
        c67541Qf34.LIZ = 4;
        LJ = C61328O5c.LJFF(c67541Qf34, c61329O5d4);
    }

    @Override // X.InterfaceC67511QeZ
    public final void LIZ(Object obj, InterfaceC67543Qf5 interfaceC67543Qf5) {
        C67430QdG c67430QdG = (C67430QdG) obj;
        InterfaceC67543Qf5 interfaceC67543Qf52 = interfaceC67543Qf5;
        interfaceC67543Qf52.LIZIZ(LIZIZ, c67430QdG.LIZ);
        interfaceC67543Qf52.LIZIZ(LIZJ, c67430QdG.LIZIZ);
        interfaceC67543Qf52.LIZIZ(LIZLLL, c67430QdG.LIZJ);
        interfaceC67543Qf52.LIZIZ(LJ, c67430QdG.LIZLLL);
    }
}
