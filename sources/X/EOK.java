package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class EOK extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final EOK LJLIL = new EOK();

    public EOK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("repo_network_api_config_v1");
    }
}
