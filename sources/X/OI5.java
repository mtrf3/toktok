package X;

import com.bytedance.keva.Keva;

/* loaded from: classes11.dex */
public final class OI5 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final OI5 LJLIL = new OI5();

    public OI5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("text_mode_keva");
    }
}
