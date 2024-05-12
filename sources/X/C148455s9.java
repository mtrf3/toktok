package X;

import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.5s9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148455s9 {
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Drawable LIZ = null;
    public final int LIZLLL = R.raw.icon_camera_enhancephoto_fill;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C148455s9)) {
            return false;
        }
        C148455s9 c148455s9 = (C148455s9) obj;
        return o.LJ(this.LIZ, c148455s9.LIZ) && this.LIZIZ == c148455s9.LIZIZ && this.LIZJ == c148455s9.LIZJ && this.LIZLLL == c148455s9.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Drawable drawable = this.LIZ;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + (this.LIZJ ? 1 : 0)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoEnhanceStatus(drawable=");
        LIZ.append(this.LIZ);
        LIZ.append(", on=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", showToast=");
        LIZ.append(this.LIZJ);
        LIZ.append(", rawId=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C148455s9(boolean z, boolean z2) {
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
