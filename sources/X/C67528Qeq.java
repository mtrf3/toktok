package X;

/* renamed from: X.Qeq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67528Qeq implements InterfaceC67508QeW<AbstractC67530Qes> {
    public static final C67528Qeq LIZ = new C67528Qeq();
    public static final C48260Iwq LIZIZ = C48260Iwq.LIZ("eventTimeMs");
    public static final C48260Iwq LIZJ = C48260Iwq.LIZ("eventCode");
    public static final C48260Iwq LIZLLL = C48260Iwq.LIZ("eventUptimeMs");
    public static final C48260Iwq LJ = C48260Iwq.LIZ("sourceExtension");
    public static final C48260Iwq LJFF = C48260Iwq.LIZ("sourceExtensionJsonProto3");
    public static final C48260Iwq LJI = C48260Iwq.LIZ("timezoneOffsetSeconds");
    public static final C48260Iwq LJII = C48260Iwq.LIZ("networkConnectionInfo");

    @Override // X.InterfaceC67511QeZ
    public final void LIZ(Object obj, InterfaceC67543Qf5 interfaceC67543Qf5) {
        AbstractC67530Qes abstractC67530Qes = (AbstractC67530Qes) obj;
        InterfaceC67543Qf5 interfaceC67543Qf52 = interfaceC67543Qf5;
        interfaceC67543Qf52.LIZLLL(LIZIZ, abstractC67530Qes.LIZIZ());
        interfaceC67543Qf52.LIZIZ(LIZJ, abstractC67530Qes.LIZ());
        interfaceC67543Qf52.LIZLLL(LIZLLL, abstractC67530Qes.LIZJ());
        interfaceC67543Qf52.LIZIZ(LJ, abstractC67530Qes.LJ());
        interfaceC67543Qf52.LIZIZ(LJFF, abstractC67530Qes.LJFF());
        interfaceC67543Qf52.LIZLLL(LJI, abstractC67530Qes.LJI());
        interfaceC67543Qf52.LIZIZ(LJII, abstractC67530Qes.LIZLLL());
    }
}
