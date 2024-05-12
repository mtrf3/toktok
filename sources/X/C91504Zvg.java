package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zvg, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91504Zvg implements InterfaceC57784Mm4 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91504Zvg)) {
            return false;
        }
        obj.getClass();
        return o.LJ(null, null) && o.LJ(null, null) && o.LJ(null, null) && o.LJ(null, null) && o.LJ(null, null) && o.LJ(null, null);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryMusicItem(id=");
        LIZ.append((String) null);
        LIZ.append(", fullClipId=");
        LIZ.append((String) null);
        LIZ.append(", pictureUrl=");
        LIZ.append((Object) null);
        LIZ.append(", name=");
        LIZ.append((String) null);
        LIZ.append(", artistName=");
        LIZ.append((String) null);
        LIZ.append(", duration=");
        LIZ.append(0);
        LIZ.append(", playbackState=");
        LIZ.append((Object) null);
        LIZ.append(", onPlayClickListener=");
        LIZ.append((Object) null);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
