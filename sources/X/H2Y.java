package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class H2Y extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final H2Y LJLIL = new H2Y();

    public H2Y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("upload_cached_log");
    }
}
