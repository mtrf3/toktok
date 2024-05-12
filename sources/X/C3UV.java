package X;

import java.util.Objects;

/* renamed from: X.3UV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UV extends C3UX {
    public final long LJ;

    public final Object[] LIZ() {
        return new Object[]{Long.valueOf(this.LJ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3UV) {
            return C78966Uyw.LJIIIZ(((C3UV) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    @Override // X.C3UX
    public final String toString() {
        return C78966Uyw.LJJJLL("StickerShowEventKey:%s", LIZ());
    }

    public C3UV(long j) {
        super("aweme_im_sticker_show", String.valueOf(j), 0.0f, C3US.SLARDAR, 4);
        this.LJ = j;
    }
}
