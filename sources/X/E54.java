package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class E54 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final E54 LJLIL = new E54();

    public E54() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("plugin_repo");
    }
}