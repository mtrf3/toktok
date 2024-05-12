package X;

import java.util.Objects;

/* renamed from: X.4SA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SA extends C4SB {
    public final InterfaceC62225ObV LIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("QuickShareChannelData:%s", this.LIZ);
    }

    @Override // X.C4SB
    public final String LIZ() {
        return this.LIZ.label();
    }

    public C4SA(InterfaceC62225ObV interfaceC62225ObV) {
        this.LIZ = interfaceC62225ObV;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4SA)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C4SA) obj).LIZ}, new Object[]{this.LIZ});
    }
}
