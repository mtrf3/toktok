package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class H3N extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final H3N LJLIL = new H3N();

    public H3N() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("upload_param_repo");
    }
}
