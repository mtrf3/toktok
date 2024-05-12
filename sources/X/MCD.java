package X;

import com.bytedance.keva.Keva;

/* loaded from: classes10.dex */
public final class MCD extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final MCD LJLIL = new MCD();

    public MCD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("keva_repo_referral_widget");
    }
}
