package X;

import com.bytedance.keva.Keva;

/* loaded from: classes9.dex */
public final class JCI extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final JCI LJLIL = new JCI();

    public JCI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("play_count");
    }
}
