package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class FI0 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final FI0 LJLIL = new FI0();

    public FI0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ColdBootABVid_Repo");
    }
}
