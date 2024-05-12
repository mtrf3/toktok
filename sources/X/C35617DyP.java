package X;

import java.io.File;

/* renamed from: X.DyP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35617DyP extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C35617DyP INSTANCE = new C35617DyP();

    public C35617DyP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return new File(C16880lQ.LLIIIL(EF7.LIZIZ()), "zstd").getAbsolutePath();
    }
}
