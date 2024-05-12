package X;

import com.bytedance.keva.Keva;

/* loaded from: classes5.dex */
public final class AQ5 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final AQ5 LJLIL = new AQ5();

    public AQ5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("keva_repo_profile_viewer");
    }
}
