package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.6ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168826ju extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C168826ju LJLIL = new C168826ju();

    public C168826ju() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        String absolutePath = H8J.LIZ().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "creativeToolsFileRootDir().absolutePath");
        LIZ.append(C78966Uyw.LJIJJLI(absolutePath));
        LIZ.append("CreativeTool");
        LIZ.append(File.separator);
        return X1D.LIZIZ(LIZ);
    }
}
