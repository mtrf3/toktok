package X;

import java.io.File;

/* renamed from: X.2rA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71402rA extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C71402rA INSTANCE = new C71402rA();

    public C71402rA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath());
        return JBR.LJFF(LIZ, File.separator, "rhea-trace", LIZ);
    }
}
