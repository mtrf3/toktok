package X;

/* renamed from: X.HhH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44747HhH {
    public static int LIZ() {
        String LIZJ;
        String LIZJ2;
        Integer LIZLLL = AnonymousClass391.LIZLLL("high_quality_compile_video_size_index", 99);
        Integer valueOf = Integer.valueOf(InterfaceC44776Hhk.LJIIIZ.hdCompileVideoSizeIndex());
        if (C44796Hi4.LIZ() || C44797Hi5.LIZ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("key : ", "high_quality_compile_video_size_index", " , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Integer.class)) {
                LIZJ = String.valueOf(valueOf);
            } else {
                LIZJ = T28.LIZJ(valueOf);
            }
            C44847Hit.LIZJ(LIZIZ, LIZJ, LIZIZ);
            LIZLLL = valueOf;
        } else {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("key : ", "high_quality_compile_video_size_index", " , libraValue : ");
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
