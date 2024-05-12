package X;

import com.bytedance.keva.Keva;

/* loaded from: classes15.dex */
public final class W0B extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final W0B LJLIL = new W0B();

    public W0B() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("upload_cached_log");
    }
}
