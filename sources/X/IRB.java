package X;

import com.bytedance.keva.Keva;

/* loaded from: classes9.dex */
public final class IRB extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final IRB LJLIL = new IRB();

    public IRB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("keva_aigc_repo_name");
    }
}
