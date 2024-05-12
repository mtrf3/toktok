package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H6Y extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final H6Y LJLIL = new H6Y();

    public H6Y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String LIZ = XPS.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "getInstance().downloadDir");
        File file = new File(LIZ);
        if (!file.exists()) {
            file.mkdirs();
        }
        return C76800UCe.LIZ;
    }
}
