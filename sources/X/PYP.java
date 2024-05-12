package X;

import com.bytedance.keva.KevaImpl;

/* loaded from: classes12.dex */
public final class PYP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final PYP LJLIL = new PYP();

    public PYP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(KevaImpl.getRepo("keva_repo_native_network_monitor", 1).getBoolean("keva_key_native_network_monitor", true));
    }
}
