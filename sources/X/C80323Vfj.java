package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.Vfj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80323Vfj implements InterfaceC80336Vfw {
    public final float LIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.LIZ)});
    }

    public C80323Vfj(float f) {
        this.LIZ = f;
    }

    @Override // X.InterfaceC80336Vfw
    public final float LIZ(RectF rectF) {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C80323Vfj) && this.LIZ == ((C80323Vfj) obj).LIZ) {
            return true;
        }
        return false;
    }
}
