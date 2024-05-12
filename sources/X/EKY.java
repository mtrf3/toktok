package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class EKY extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final EKY LJLIL = new EKY();

    public EKY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("previous_login_repo");
    }
}
