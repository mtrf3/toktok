package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* renamed from: X.WDh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81925WDh extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C81925WDh LJLIL = new C81925WDh();

    public C81925WDh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJJI();
        }
        return null;
    }
}
