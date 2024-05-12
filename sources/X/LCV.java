package X;

import com.bytedance.keva.Keva;

/* loaded from: classes10.dex */
public final class LCV extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final LCV LJLIL = new LCV();

    public LCV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ec_common_kv_cache");
    }
}
