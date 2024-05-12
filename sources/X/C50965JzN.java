package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.JzN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50965JzN {
    public final Activity LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public String LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Data(type=");
        LIZ.append(this.LJFF);
        LIZ.append(", state=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", searchVideoClickTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", detailOnCreateTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", detailVideoRenderTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C50965JzN(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LJFF = "unknown";
    }
}
