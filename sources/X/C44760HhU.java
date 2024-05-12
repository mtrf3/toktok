package X;

/* renamed from: X.HhU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44760HhU {
    public static int LIZ() {
        String LIZJ;
        String LIZJ2;
        Integer LIZIZ = C06540Nm.LIZIZ(31744, 0, "mv_photo_resize_strategy", true);
        Integer valueOf = Integer.valueOf(InterfaceC44777Hhl.LJII.mvFastImportStrategy());
        if (C44797Hi5.LIZ()) {
            StringBuilder sb = new StringBuilder("key : mv_photo_resize_strategy , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Integer.class)) {
                LIZJ2 = String.valueOf(valueOf);
            } else {
                LIZJ2 = T28.LIZJ(valueOf);
            }
            C0DC.LIZLLL(sb, LIZJ2);
            LIZIZ = valueOf;
        } else {
            StringBuilder sb2 = new StringBuilder("key : mv_photo_resize_strategy , libraValue : ");
            if (C30581Hy.LJJIFFI(Integer.class)) {
                LIZJ = String.valueOf(LIZIZ);
            } else {
                LIZJ = T28.LIZJ(LIZIZ);
            }
            C0DC.LIZLLL(sb2, LIZJ);
        }
        return LIZIZ.intValue();
    }
}
