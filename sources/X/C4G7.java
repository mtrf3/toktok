package X;

import java.util.Objects;

/* renamed from: X.4G7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4G7 extends C3UY {
    public final boolean LIZLLL;

    public C4G7() {
        this(0);
    }

    public final Object[] LIZ() {
        return new Object[]{Boolean.valueOf(this.LIZLLL)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4G7) {
            return C78966Uyw.LJIIIZ(((C4G7) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("StickerShowEventBody:%s", LIZ());
    }

    public C4G7(int i) {
        super(C0DC.LIZIZ("is_preload", true), null, null, 6);
        this.LIZLLL = true;
    }
}
