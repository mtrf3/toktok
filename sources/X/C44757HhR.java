package X;

/* renamed from: X.HhR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44757HhR {
    public static final int LIZ() {
        String LIZJ;
        String LIZJ2;
        Integer LIZIZ = C06540Nm.LIZIZ(31744, 0, "upload_video_size_index", true);
        Integer valueOf = Integer.valueOf(InterfaceC44776Hhk.LJIIIZ.uploadVideoSizeIndex());
        if (C44796Hi4.LIZ() || C44797Hi5.LIZ()) {
            StringBuilder sb = new StringBuilder("key : upload_video_size_index , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Integer.class)) {
                LIZJ = String.valueOf(valueOf);
            } else {
                LIZJ = T28.LIZJ(valueOf);
            }
            C0DC.LIZLLL(sb, LIZJ);
            LIZIZ = valueOf;
        } else {
            StringBuilder sb2 = new StringBuilder("key : upload_video_size_index , libraValue : ");
            if (C30581Hy.LJJIFFI(Integer.class)) {
                LIZJ2 = String.valueOf(LIZIZ);
            } else {
                LIZJ2 = T28.LIZJ(LIZIZ);
            }
            C0DC.LIZLLL(sb2, LIZJ2);
        }
        return LIZIZ.intValue();
    }
}
