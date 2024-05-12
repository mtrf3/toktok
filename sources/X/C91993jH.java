package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.3jH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91993jH extends C3UX {
    public final String LJ;

    public final int hashCode() {
        return Objects.hash(this.LJ);
    }

    @Override // X.C3UX
    public final String toString() {
        return C78966Uyw.LJJJLL("StickerDownloadEventKey:%s", this.LJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91993jH(String resourceID) {
        super("aweme_im_sticker_download", resourceID, 0.0f, C3US.TEA, 4);
        o.LJIIIZ(resourceID, "resourceID");
        this.LJ = resourceID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91993jH)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C91993jH) obj).LJ}, new Object[]{this.LJ});
    }
}
