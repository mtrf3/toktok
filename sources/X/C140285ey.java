package X;

/* renamed from: X.5ey, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140285ey extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC139745e6<String>> {
    public static final C140285ey LJLIL = new C140285ey();

    public C140285ey() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final /* bridge */ /* synthetic */ InterfaceC139745e6<String> invoke() {
        return new InterfaceC139745e6() { // from class: X.5eO
            @Override // X.InterfaceC139745e6
            public final Object get() {
                String str;
                if (C140465fG.LIZ()) {
                    if (C140055eb.LIZ()) {
                        str = "filtercomposerexperiment";
                    } else {
                        str = "filtercomposer";
                    }
                } else if (C140055eb.LIZ()) {
                    str = "colorfilterexperiment";
                } else {
                    str = "colorfilternew";
                }
                C5NP LIZLLL = C82891Wg3.LIZLLL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("viki filter, filter panelSupplier=");
                LIZ.append(str);
                LIZLLL.d(X1D.LIZIZ(LIZ));
                return str;
            }
        };
    }
}
