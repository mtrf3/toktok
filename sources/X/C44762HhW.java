package X;

import defpackage.m0;

/* renamed from: X.HhW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44762HhW {
    public static final boolean LIZ() {
        String LIZ;
        String LIZ2;
        Boolean LIZIZ = m0.LIZIZ(31744, "story_canvas_enable_1080p", true, false);
        Boolean valueOf = Boolean.valueOf(InterfaceC44790Hhy.LIZIZ.enableStoryCanvas1080p());
        if (C44797Hi5.LIZ()) {
            StringBuilder sb = new StringBuilder("key : story_canvas_enable_1080p , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ2 = String.valueOf(valueOf);
            } else {
                LIZ2 = C44877HjN.LIZ(valueOf);
            }
            C0DC.LIZLLL(sb, LIZ2);
            LIZIZ = valueOf;
        } else {
            StringBuilder sb2 = new StringBuilder("key : story_canvas_enable_1080p , libraValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ = String.valueOf(LIZIZ);
            } else {
                LIZ = C44877HjN.LIZ(LIZIZ);
            }
            C0DC.LIZLLL(sb2, LIZ);
        }
        return LIZIZ.booleanValue();
    }
}
