package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOG extends AbstractC65781Prl implements InterfaceC65784Pro<TOH> {
    public static final TOG LJLIL = new TOG();

    public TOG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TOH invoke() {
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        TOH toh = new TOH(application, C139815eD.LJLIL, TOV.LJLIL, TOW.LJLIL);
        C83088WjE provider = C83088WjE.LJLIL;
        o.LJIIIZ(provider, "provider");
        toh.LIZ = provider;
        return toh;
    }
}
