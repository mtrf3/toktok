package X;

import com.bytedance.keva.Keva;

/* loaded from: classes10.dex */
public final class LTV extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final LTV LJLIL = new LTV();

    public LTV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("popular_keva_repo");
    }
}
