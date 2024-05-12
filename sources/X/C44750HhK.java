package X;

/* renamed from: X.HhK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44750HhK {
    public static int LIZ() {
        String LIZJ;
        String LIZJ2;
        Integer LIZLLL = AnonymousClass391.LIZLLL("high_quality_bitrate_of_recode_threshold", 10000000);
        Integer valueOf = Integer.valueOf(InterfaceC44791Hhz.LJIIIIZZ.hdRecodeBitrateThreshold());
        if (C44796Hi4.LIZ() || C44797Hi5.LIZ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("key : ", "high_quality_bitrate_of_recode_threshold", " , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Integer.class)) {
                LIZJ = String.valueOf(valueOf);
            } else {
                LIZJ = T28.LIZJ(valueOf);
            }
            C44847Hit.LIZJ(LIZIZ, LIZJ, LIZIZ);
            LIZLLL = valueOf;
        } else {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("key : ", "high_quality_bitrate_of_recode_threshold", " , libraValue : ");
            if (C30581Hy.LJJIFFI(Integer.class)) {
                LIZJ2 = String.valueOf(LIZLLL);
            } else {
                LIZJ2 = T28.LIZJ(LIZLLL);
            }
            C44847Hit.LIZJ(LIZIZ2, LIZJ2, LIZIZ2);
        }
        return LIZLLL.intValue();
    }
}
