package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.VgT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80369VgT implements InterfaceC80336Vfw {
    public final float LIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.LIZ)});
    }

    public C80369VgT(float f) {
        this.LIZ = f;
    }

    @Override // X.InterfaceC80336Vfw
    public final float LIZ(RectF rectF) {
        return rectF.height() * this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C80369VgT) && this.LIZ == ((C80369VgT) obj).LIZ) {
            return true;
        }
        return false;
    }
}
