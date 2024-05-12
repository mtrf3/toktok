package X;

import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* renamed from: X.1Vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34181Vu extends AbstractC17370mD {
    public final MusicSong LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34181Vu) && o.LJ(this.LIZ, ((C34181Vu) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchFirstTrendingSongSuccess(musicSong=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C34181Vu(MusicSong musicSong) {
        this.LIZ = musicSong;
    }
}
