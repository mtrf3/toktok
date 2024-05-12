package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* renamed from: X.HsY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45446HsY extends AbstractC65781Prl implements InterfaceC65784Pro<C45452Hse> {
    public static final C45446HsY LJLIL = new C45446HsY();

    public C45446HsY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C45452Hse invoke() {
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        return new C45452Hse(application);
    }
}
