package X;

import com.bytedance.keva.Keva;

/* loaded from: classes13.dex */
public final class S70 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final S70 LJLIL = new S70();

    public S70() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("v2_ecommerce_live_effect_use_repo");
    }
}
