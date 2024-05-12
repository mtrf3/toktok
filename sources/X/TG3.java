package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TG3 extends TG1 {
    public final View LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TG3) && o.LJ(this.LIZ, ((TG3) obj).LIZ);
        }
        return true;
    }

    public final int hashCode() {
        View view = this.LIZ;
        if (view != null) {
            return view.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewCreated(stickerView=");
        LIZ.append(this.LIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public TG3(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LIZ = stickerView;
    }
}
