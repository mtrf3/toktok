package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class H4N extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final H4N LJLIL = new H4N();

    public H4N() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("repo_watermark_resource");
    }
}
