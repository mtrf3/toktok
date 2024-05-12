package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class EBG extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final EBG LJLIL = new EBG();

    public EBG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("poi_retag_keva");
    }
}
