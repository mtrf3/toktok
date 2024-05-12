package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.V1u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79078V1u {
    /* JADX WARN: Multi-variable type inference failed */
    public static C79265V8z LIZ(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof C79265V8z) {
            return (C79265V8z) drawable;
        }
        if (drawable instanceof InterfaceC79080V1w) {
            return LIZ(((InterfaceC79080V1w) drawable).LJIIIIZZ());
        }
        if (drawable instanceof C80628Vke) {
            C80628Vke c80628Vke = (C80628Vke) drawable;
            int length = c80628Vke.LJLJI.length;
            for (int i = 0; i < length; i++) {
                C79265V8z LIZ = LIZ(c80628Vke.LIZ(i));
                if (LIZ != null) {
                    return LIZ;
                }
            }
        }
        return null;
    }
}
