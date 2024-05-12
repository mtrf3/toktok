package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* renamed from: X.WDc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81920WDc extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C81920WDc LJLIL = new C81920WDc();

    public C81920WDc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIJ();
        }
        return null;
    }
}
