package X;

import java.util.Objects;

/* renamed from: X.4PF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PF extends C3UX {
    public final String LJ;

    public final int hashCode() {
        return Objects.hash(this.LJ);
    }

    @Override // X.C3UX
    public final String toString() {
        return C78966Uyw.LJJJLL("ImageShowEventWithoutSampleKey:%s", this.LJ);
    }

    public C4PF(String str) {
        super("aweme_im_image_show_full_report", str, 0.0f, C3US.TEA, 4);
        this.LJ = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4PF)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C4PF) obj).LJ}, new Object[]{this.LJ});
    }
}
