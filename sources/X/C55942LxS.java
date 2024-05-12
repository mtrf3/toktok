package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.LxS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55942LxS {
    public final Bitmap LIZ;
    public final EnumC55936LxM LIZIZ;

    public C55942LxS() {
        this((EnumC55936LxM) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55942LxS)) {
            return false;
        }
        C55942LxS c55942LxS = (C55942LxS) obj;
        return o.LJ(this.LIZ, c55942LxS.LIZ) && this.LIZIZ == c55942LxS.LIZIZ;
    }

    public final int hashCode() {
        Bitmap bitmap = this.LIZ;
        return this.LIZIZ.hashCode() + ((bitmap == null ? 0 : bitmap.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IconConfig(bitmap=");
        LIZ.append(this.LIZ);
        LIZ.append(", iconState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C55942LxS(Bitmap bitmap, EnumC55936LxM iconState) {
        o.LJIIIZ(iconState, "iconState");
        this.LIZ = bitmap;
        this.LIZIZ = iconState;
    }

    public /* synthetic */ C55942LxS(EnumC55936LxM enumC55936LxM, int i) {
        this((Bitmap) null, (i & 2) != 0 ? EnumC55936LxM.HIDDEN : enumC55936LxM);
    }
}
