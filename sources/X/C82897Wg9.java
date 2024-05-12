package X;

import android.app.Application;

/* renamed from: X.Wg9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82897Wg9 extends AbstractC65781Prl implements InterfaceC65784Pro<Application> {
    public static final C82897Wg9 LJLIL = new C82897Wg9();

    public C82897Wg9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Application invoke() {
        Application appContext;
        InterfaceC82904WgG interfaceC82904WgG = C82891Wg3.LJII;
        if (interfaceC82904WgG != null && (appContext = interfaceC82904WgG.getAppContext()) != null) {
            return appContext;
        }
        throw new RuntimeException("Lazy value not initialized yet.");
    }
}
