package X;

import com.bytedance.keva.Keva;

/* loaded from: classes10.dex */
public final class LTW extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final LTW LJLIL = new LTW();

    public LTW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("popular_keva_repo");
    }
}
