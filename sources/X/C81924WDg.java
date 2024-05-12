package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* renamed from: X.WDg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81924WDg extends AbstractC65781Prl implements InterfaceC65784Pro<WBG> {
    public static final C81924WDg LJLIL = new C81924WDg();

    public C81924WDg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final WBG invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LIZLLL();
        }
        return null;
    }
}
