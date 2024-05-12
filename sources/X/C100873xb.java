package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.3xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100873xb extends AbstractC65781Prl implements InterfaceC88472Yns<String, File> {
    public static final C100873xb LJLIL = new C100873xb();

    public C100873xb() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final File invoke(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        return new File(it);
    }
}
