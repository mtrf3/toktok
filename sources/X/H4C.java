package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class H4C extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final H4C LJLIL = new H4C();

    public H4C() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("repo_effect_watermark");
    }
}
