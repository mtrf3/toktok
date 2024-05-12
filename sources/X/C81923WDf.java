package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* renamed from: X.WDf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81923WDf extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C81923WDf LJLIL = new C81923WDf();

    public C81923WDf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJJIJIL();
        }
        return null;
    }
}
