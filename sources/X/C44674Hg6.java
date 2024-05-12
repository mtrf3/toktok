package X;

/* renamed from: X.Hg6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44674Hg6 {
    public static final boolean LIZ() {
        String LIZ;
        String LIZ2;
        Boolean LIZIZ = C03090Af.LIZIZ("enable_high_quality_video", false);
        Boolean valueOf = Boolean.valueOf(InterfaceC44775Hhj.LJ.showHDButton());
        if (C44796Hi4.LIZ() || C44797Hi5.LIZ()) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("key : ", "enable_high_quality_video", " , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ = String.valueOf(valueOf);
            } else {
                LIZ = C44877HjN.LIZ(valueOf);
            }
            C44847Hit.LIZJ(LIZIZ2, LIZ, LIZIZ2);
            LIZIZ = valueOf;
        } else {
            StringBuilder LIZIZ3 = C25620zW.LIZIZ("key : ", "enable_high_quality_video", " , libraValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ2 = String.valueOf(LIZIZ);
            } else {
                LIZ2 = C44877HjN.LIZ(LIZIZ);
            }
            C44847Hit.LIZJ(LIZIZ3, LIZ2, LIZIZ3);
        }
        return LIZIZ.booleanValue();
    }
}
