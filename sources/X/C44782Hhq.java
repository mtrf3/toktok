package X;

/* renamed from: X.Hhq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44782Hhq implements InterfaceC44791Hhz {
    public static final C44782Hhq LJIILJJIL = new C44782Hhq();

    static {
        C5Z6.LIZ("RecodeByteBenchApi -> use DefaultApi");
    }

    @Override // X.InterfaceC44791Hhz
    public final int hdRecodeBitrateThreshold() {
        return Q7K.LIZIZ("high_quality_bitrate_of_recode_threshold", 10000000);
    }

    @Override // X.InterfaceC44791Hhz
    public final int recodeBitrateThreshold() {
        return Q7K.LIZIZ("bitrate_of_recode_threshold", 10000000);
    }
}
