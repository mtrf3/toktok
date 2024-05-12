package X;

import com.bytedance.keva.Keva;

/* loaded from: classes10.dex */
public final class M7P extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final M7P LJLIL = new M7P();

    public M7P() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("mix_keva_repo");
    }
}
