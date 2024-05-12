package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* renamed from: X.WDa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81918WDa extends AbstractC65781Prl implements InterfaceC65784Pro<C81814W9a> {
    public static final C81918WDa LJLIL = new C81918WDa();

    public C81918WDa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C81814W9a invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJI();
        }
        return null;
    }
}
