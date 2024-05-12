package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOF extends AbstractC65781Prl implements InterfaceC65784Pro<TOH> {
    public static final TOF LJLIL = new TOF();

    public TOF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TOH invoke() {
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        TOH toh = new TOH(application, C74540TNg.LJLIL, TOU.LJLIL, TOT.LJLIL);
        C83087WjD provider = C83087WjD.LJLIL;
        o.LJIIIZ(provider, "provider");
        toh.LIZ = provider;
        return toh;
    }
}
