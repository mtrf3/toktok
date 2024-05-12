package X;

import com.bytedance.keva.Keva;

/* loaded from: classes16.dex */
public final class XJ1 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final XJ1 LJLIL = new XJ1();

    public XJ1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("app_launch");
    }
}
