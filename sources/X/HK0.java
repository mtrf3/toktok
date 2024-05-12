package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class HK0 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final HK0 LJLIL = new HK0();

    public HK0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("studio_now_creation");
    }
}
