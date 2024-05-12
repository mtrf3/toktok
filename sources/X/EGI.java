package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class EGI extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final EGI LJLIL = new EGI();

    public EGI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("tpc_sp_repo");
    }
}
