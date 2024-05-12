package X;

import com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration;

/* renamed from: X.Hl8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44986Hl8 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends Integer>> {
    public static final C44986Hl8 LJLIL = new C44986Hl8();

    public C44986Hl8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends Integer> invoke() {
        InterfaceC09240Xw LIZ;
        ByteBenchStrategyHWFastImportConfiguration byteBenchStrategyHWFastImportConfiguration;
        String h264HWDecodeThreshold;
        C09580Ze LIZJ = C09580Ze.LIZJ();
        if (LIZJ == null || (LIZ = LIZJ.LIZ()) == null || (byteBenchStrategyHWFastImportConfiguration = (ByteBenchStrategyHWFastImportConfiguration) LIZ.LJIILJJIL(ByteBenchStrategyHWFastImportConfiguration.class)) == null || (h264HWDecodeThreshold = byteBenchStrategyHWFastImportConfiguration.getH264HWDecodeThreshold()) == null || h264HWDecodeThreshold.length() == 0) {
            return C113554cx.LJJJLIIL();
        }
        return L5I.LIZ(h264HWDecodeThreshold);
    }
}
