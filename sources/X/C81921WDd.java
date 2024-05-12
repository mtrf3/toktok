package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* renamed from: X.WDd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81921WDd extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C81921WDd LJLIL = new C81921WDd();

    public C81921WDd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIJI();
        }
        return null;
    }
}
