package X;

/* renamed from: X.Fo8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40076Fo8 {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C40076Fo8 LIZLLL;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C40076Fo8.class), "mEventHandler", "getMEventHandler()[Lcom/bytedance/android/monitorV2/dataprocessor/AbstractHandler;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(C40076Fo8.class), "mHybridEventListener", "getMHybridEventListener()Lcom/bytedance/android/monitorV2/listener/IHybridEventListener;")};
        LIZLLL = new C40076Fo8();
        LIZIZ = C221108m2.LIZIZ(C40078FoA.LJLIL);
        LIZJ = C221108m2.LIZIZ(C40075Fo7.LJLIL);
    }

    public static void LIZ(VMM vmm) {
        try {
            C40083FoF c40083FoF = new C40083FoF(VMV.LJ(vmm));
            int i = 0;
            OF9[] of9Arr = (OF9[]) LIZIZ.getValue();
            int length = of9Arr.length;
            while (true) {
                if (i < length) {
                    if (of9Arr[i].LIZ(c40083FoF)) {
                        break;
                    } else {
                        i++;
                    }
                } else if (vmm.LJII != EnumC40073Fo5.Slardar) {
                    C40080FoC.LIZ.LIZ(c40083FoF);
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
