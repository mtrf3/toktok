package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* renamed from: X.WDb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81919WDb extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C81919WDb LJLIL = new C81919WDb();

    public C81919WDb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJFF();
        }
        return null;
    }
}
