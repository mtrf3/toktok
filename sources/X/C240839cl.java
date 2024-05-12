package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240839cl implements C33Q {
    public final C240719cZ LJLIL;
    public final EnumC241749eE LJLILLLLZI;

    public C240839cl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C240839cl)) {
            return false;
        }
        C240839cl c240839cl = (C240839cl) obj;
        return o.LJ(this.LJLIL, c240839cl.LJLIL) && this.LJLILLLLZI == c240839cl.LJLILLLLZI;
    }

    public final int hashCode() {
        C240719cZ c240719cZ = this.LJLIL;
        return this.LJLILLLLZI.hashCode() + ((c240719cZ == null ? 0 : c240719cZ.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicState(playingMusicItem=");
        LIZ.append(this.LJLIL);
        LIZ.append(", playingStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C240839cl(int i) {
        this(null, EnumC241749eE.DEFAULT);
    }

    public C240839cl(C240719cZ c240719cZ, EnumC241749eE playingStatus) {
        o.LJIIIZ(playingStatus, "playingStatus");
        this.LJLIL = c240719cZ;
        this.LJLILLLLZI = playingStatus;
    }
}
