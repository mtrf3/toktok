package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.VgR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80367VgR implements InterfaceC80336Vfw {
    public final InterfaceC80336Vfw LIZ;
    public final float LIZIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ, Float.valueOf(this.LIZIZ)});
    }

    @Override // X.InterfaceC80336Vfw
    public final float LIZ(RectF rectF) {
        return Math.max(0.0f, this.LIZ.LIZ(rectF) + this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80367VgR)) {
            return false;
        }
        C80367VgR c80367VgR = (C80367VgR) obj;
        if (this.LIZ.equals(c80367VgR.LIZ) && this.LIZIZ == c80367VgR.LIZIZ) {
            return true;
        }
        return false;
    }

    public C80367VgR(float f, InterfaceC80336Vfw interfaceC80336Vfw) {
        while (interfaceC80336Vfw instanceof C80367VgR) {
            interfaceC80336Vfw = ((C80367VgR) interfaceC80336Vfw).LIZ;
            f += ((C80367VgR) interfaceC80336Vfw).LIZIZ;
        }
        this.LIZ = interfaceC80336Vfw;
        this.LIZIZ = f;
    }
}
