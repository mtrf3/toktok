package X;

import com.bytedance.keva.Keva;

/* loaded from: classes10.dex */
public final class LA6 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final LA6 LJLIL = new LA6();

    public LA6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permission_dialog");
        LIZ.append(LA5.LIZIZ);
        return Keva.getRepo(X1D.LIZIZ(LIZ));
    }
}
