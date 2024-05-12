package X;

/* renamed from: X.HhJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44749HhJ {
    public static boolean LIZ() {
        String LIZ;
        String LIZ2;
        Boolean LIZIZ = C03090Af.LIZIZ("enable_default_open_hd_video_switch", false);
        Boolean valueOf = Boolean.valueOf(InterfaceC44775Hhj.LJ.enableDefaultOpenHDSwitch());
        if (C44797Hi5.LIZ()) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("key : ", "enable_default_open_hd_video_switch", " , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ2 = String.valueOf(valueOf);
            } else {
                LIZ2 = C44877HjN.LIZ(valueOf);
            }
            C44847Hit.LIZJ(LIZIZ2, LIZ2, LIZIZ2);
            LIZIZ = valueOf;
        } else {
            StringBuilder LIZIZ3 = C25620zW.LIZIZ("key : ", "enable_default_open_hd_video_switch", " , libraValue : ");
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
