package X;

import defpackage.m0;

/* renamed from: X.HhV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44761HhV {
    public static final boolean LIZ() {
        String LIZ;
        String LIZ2;
        Boolean LIZIZ = m0.LIZIZ(31744, "canvas_enable_dynamic_resolution", true, false);
        Boolean valueOf = Boolean.valueOf(InterfaceC44790Hhy.LIZIZ.enableCanvasDynamicResolution());
        if (C44797Hi5.LIZ()) {
            StringBuilder sb = new StringBuilder("key : canvas_enable_dynamic_resolution , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ2 = String.valueOf(valueOf);
            } else {
                LIZ2 = C44877HjN.LIZ(valueOf);
            }
            C0DC.LIZLLL(sb, LIZ2);
            LIZIZ = valueOf;
        } else {
            StringBuilder sb2 = new StringBuilder("key : canvas_enable_dynamic_resolution , libraValue : ");
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
