package X;

import com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration;

/* renamed from: X.Hl9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44987Hl9 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends Integer>> {
    public static final C44987Hl9 LJLIL = new C44987Hl9();

    public C44987Hl9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends Integer> invoke() {
        InterfaceC09240Xw LIZ;
        ByteBenchStrategyHWFastImportConfiguration byteBenchStrategyHWFastImportConfiguration;
        String byteVC1HWDecodeThreshold;
        C09580Ze LIZJ = C09580Ze.LIZJ();
        if (LIZJ == null || (LIZ = LIZJ.LIZ()) == null || (byteBenchStrategyHWFastImportConfiguration = (ByteBenchStrategyHWFastImportConfiguration) LIZ.LJIILJJIL(ByteBenchStrategyHWFastImportConfiguration.class)) == null || (byteVC1HWDecodeThreshold = byteBenchStrategyHWFastImportConfiguration.getByteVC1HWDecodeThreshold()) == null || byteVC1HWDecodeThreshold.length() == 0) {
            return C113554cx.LJJJLIIL();
        }
        return L5I.LIZ(byteVC1HWDecodeThreshold);
    }
}
