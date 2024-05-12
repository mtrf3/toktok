package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1LK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LK extends AbstractC07660Ru {
    public final C279917z LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1LK) && o.LJ(this.LIZ, ((C1LK) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NotifyCurPlayingSong(songInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C1LK(C279917z songInfo) {
        o.LJIIIZ(songInfo, "songInfo");
        this.LIZ = songInfo;
    }
}
