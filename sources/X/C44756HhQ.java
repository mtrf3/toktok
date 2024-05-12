package X;

/* renamed from: X.HhQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44756HhQ {
    public static boolean LIZ() {
        String LIZ;
        String LIZ2;
        Boolean LIZIZ = C03090Af.LIZIZ("enable_1080p_photo_to_video", false);
        Boolean valueOf = Boolean.valueOf(InterfaceC44777Hhl.LJII.enableSynthesisMvTo1080p());
        if (C44797Hi5.LIZ()) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("key : ", "enable_1080p_photo_to_video", " , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ2 = String.valueOf(valueOf);
            } else {
                LIZ2 = C44877HjN.LIZ(valueOf);
            }
            C44847Hit.LIZJ(LIZIZ2, LIZ2, LIZIZ2);
            LIZIZ = valueOf;
        } else {
            StringBuilder LIZIZ3 = C25620zW.LIZIZ("key : ", "enable_1080p_photo_to_video", " , libraValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ = String.valueOf(LIZIZ);
            } else {
                LIZ = C44877HjN.LIZ(LIZIZ);
            }
            C44847Hit.LIZJ(LIZIZ3, LIZ, LIZIZ3);
        }
        return LIZIZ.booleanValue();
    }
}
