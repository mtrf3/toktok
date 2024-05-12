package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IVy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC46738IVy {
    public final EnumC46736IVw LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public AbstractC46738IVy(EnumC46736IVw enumC46736IVw) {
        this.LIZ = enumC46736IVw;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!o.LJ(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            if (this.LIZ == ((AbstractC46738IVy) obj).LIZ) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.video.preload.PreloadType");
    }
}
