package X;

import com.bytedance.keva.Keva;

/* loaded from: classes9.dex */
public final class IRC extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final IRC LJLIL = new IRC();

    public IRC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("open_on_mute_repo");
    }
}
