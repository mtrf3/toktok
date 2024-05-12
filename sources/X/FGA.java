package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class FGA extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final FGA LJLIL = new FGA();

    public FGA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("prev_login_task");
    }
}
