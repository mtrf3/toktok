package X;

/* renamed from: X.3bW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87183bW {
    public final boolean LIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C87183bW) && this.LIZ == ((C87183bW) obj).LIZ;
    }

    public final int hashCode() {
        boolean z = this.LIZ;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoStickerContentDiffStatus(isFavChanged=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }
}
