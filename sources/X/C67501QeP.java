package X;

/* renamed from: X.QeP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67501QeP implements InterfaceC67508QeW<AbstractC67503QeR> {
    public static final C67501QeP LIZ = new C67501QeP();
    public static final C48260Iwq LIZIZ = C48260Iwq.LIZ("requestTimeMs");
    public static final C48260Iwq LIZJ = C48260Iwq.LIZ("requestUptimeMs");
    public static final C48260Iwq LIZLLL = C48260Iwq.LIZ("clientInfo");
    public static final C48260Iwq LJ = C48260Iwq.LIZ("logSource");
    public static final C48260Iwq LJFF = C48260Iwq.LIZ("logSourceName");
    public static final C48260Iwq LJI = C48260Iwq.LIZ("logEvent");
    public static final C48260Iwq LJII = C48260Iwq.LIZ("qosTier");

    @Override // X.InterfaceC67511QeZ
    public final void LIZ(Object obj, InterfaceC67543Qf5 interfaceC67543Qf5) {
        AbstractC67503QeR abstractC67503QeR = (AbstractC67503QeR) obj;
        InterfaceC67543Qf5 interfaceC67543Qf52 = interfaceC67543Qf5;
        interfaceC67543Qf52.LIZLLL(LIZIZ, abstractC67503QeR.LJFF());
        interfaceC67543Qf52.LIZLLL(LIZJ, abstractC67503QeR.LJI());
        interfaceC67543Qf52.LIZIZ(LIZLLL, abstractC67503QeR.LIZ());
        interfaceC67543Qf52.LIZIZ(LJ, abstractC67503QeR.LIZJ());
        interfaceC67543Qf52.LIZIZ(LJFF, abstractC67503QeR.LIZLLL());
        interfaceC67543Qf52.LIZIZ(LJI, abstractC67503QeR.LIZIZ());
        interfaceC67543Qf52.LIZIZ(LJII, abstractC67503QeR.LJ());
    }
}
