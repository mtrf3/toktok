package X;

import java.io.File;

/* renamed from: X.2rB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71412rB extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C71412rB LJLIL = new C71412rB();

    public C71412rB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) C74242vk.LIZ.getValue());
        return JBR.LJFF(LIZ, File.separator, "performance_data", LIZ);
    }
}
