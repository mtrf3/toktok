package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class EL3 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final EL3 LJLIL = new EL3();

    public EL3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("main_session_and_push_mob");
    }
}
