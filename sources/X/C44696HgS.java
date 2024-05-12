package X;

import android.app.Application;

/* renamed from: X.HgS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44696HgS extends AbstractC65781Prl implements InterfaceC65784Pro<Application> {
    public static final C44696HgS LJLIL = new C44696HgS();

    public C44696HgS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Application invoke() {
        InterfaceC44697HgT interfaceC44697HgT = C44694HgQ.LJI;
        if (interfaceC44697HgT != null) {
            return interfaceC44697HgT.getApplication();
        }
        return null;
    }
}
