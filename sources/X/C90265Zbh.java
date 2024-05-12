package X;

/* renamed from: X.Zbh, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90265Zbh {
    public static final C90670ZiE LIZIZ = new C90670ZiE();
    public final C90675ZiJ LIZ;

    public C90265Zbh() {
        InterfaceC90313ZcT interfaceC90313ZcT;
        InterfaceC90313ZcT[] interfaceC90313ZcTArr = new InterfaceC90313ZcT[2];
        interfaceC90313ZcTArr[0] = C90684ZiS.LIZ;
        try {
            interfaceC90313ZcT = (InterfaceC90313ZcT) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC90313ZcT = LIZIZ;
        }
        interfaceC90313ZcTArr[1] = interfaceC90313ZcT;
        this.LIZ = new C90675ZiJ(interfaceC90313ZcTArr);
    }
}
