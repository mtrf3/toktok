package X;

import java.util.Objects;

/* renamed from: X.MMb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56673MMb extends AbstractC56676MMe {
    public final int LJLIL;

    public C56673MMb() {
        this(0);
    }

    public final Object[] LIZ() {
        return new Object[]{Integer.valueOf(this.LJLIL)};
    }

    @Override // X.AbstractC56676MMe
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C56673MMb) {
            return C78966Uyw.LJIIIZ(((C56673MMb) obj).LIZ(), LIZ());
        }
        return false;
    }

    @Override // X.AbstractC56676MMe
    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    @Override // X.AbstractC56676MMe
    public final boolean isUnread() {
        return false;
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("CreatorIndicatorPod:%s", LIZ());
    }

    @Override // X.AbstractC56676MMe
    public final C3ML convertToInboxEntranceWrapper$awemenotice_release() {
        return new C3ML(539, 0L, this.type, false, this);
    }

    public C56673MMb(int i) {
        super(11);
        this.LJLIL = i;
    }
}
