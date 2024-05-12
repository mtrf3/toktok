package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34171Vt extends AbstractC17370mD {
    public final List<C33511Tf> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34171Vt) && o.LJ(this.LIZ, ((C34171Vt) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchAlbumInfoSuccess(albumInfoList=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C34171Vt(List<C33511Tf> list) {
        this.LIZ = list;
    }
}
