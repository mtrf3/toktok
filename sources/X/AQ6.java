package X;

import com.bytedance.keva.Keva;

/* loaded from: classes5.dex */
public final class AQ6 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final AQ6 LJLIL = new AQ6();

    public AQ6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("keva_repo_profile_viewer");
    }
}
