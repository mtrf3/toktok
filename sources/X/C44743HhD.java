package X;

/* renamed from: X.HhD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44743HhD {
    public static final int LIZ() {
        String LIZJ;
        String LIZJ2;
        Integer LIZIZ = C06540Nm.LIZIZ(31744, 99, "compile_video_size_index", true);
        Integer valueOf = Integer.valueOf(InterfaceC44776Hhk.LJIIIZ.compileVideoSizeIndex());
        if (C44796Hi4.LIZ() || C44797Hi5.LIZ()) {
            StringBuilder sb = new StringBuilder("key : compile_video_size_index , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Integer.class)) {
                LIZJ = String.valueOf(valueOf);
            } else {
                LIZJ = T28.LIZJ(valueOf);
            }
            C0DC.LIZLLL(sb, LIZJ);
            LIZIZ = valueOf;
        } else {
            StringBuilder sb2 = new StringBuilder("key : compile_video_size_index , libraValue : ");
            if (C30581Hy.LJJIFFI(Integer.class)) {
                LIZJ2 = String.valueOf(LIZIZ);
            } else {
                LIZJ2 = T28.LIZJ(LIZIZ);
            }
            C0DC.LIZLLL(sb2, LIZJ2);
        }
        return LIZIZ.intValue();
    }

    public static final int LIZIZ(boolean z) {
        if (C79234V7u.LJIIIIZZ(z)) {
            return InterfaceC44798Hi6.LJFF.compileVideoSizeIndex();
        }
        return LIZ();
    }
}
