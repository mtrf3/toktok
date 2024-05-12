package X;

import java.util.Objects;

/* renamed from: X.3Uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84733Uf extends C3UX {
    public final String LJ;

    public final int hashCode() {
        return Objects.hash(this.LJ);
    }

    @Override // X.C3UX
    public final String toString() {
        return C78966Uyw.LJJJLL("ImageShowEventKey:%s", this.LJ);
    }

    public C84733Uf(String str) {
        super("aweme_im_image_show", str, 0.005f, C3US.TEA);
        this.LJ = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84733Uf)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C84733Uf) obj).LJ}, new Object[]{this.LJ});
    }
}
