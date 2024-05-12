package X;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.06u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C022006u {
    public final Bundle LIZ;
    public IconCompat LIZIZ;
    public final C020406e[] LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final boolean LJI;
    public final int LJII;
    public final CharSequence LJIIIIZZ;
    public final PendingIntent LJIIIZ;
    public final boolean LJIIJ;

    public final IconCompat LIZ() {
        int i;
        if (this.LIZIZ == null && (i = this.LJII) != 0) {
            this.LIZIZ = IconCompat.LIZJ(null, "", i);
        }
        return this.LIZIZ;
    }

    public C022006u(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C020406e[] c020406eArr, C020406e[] c020406eArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.LJ = true;
        this.LIZIZ = iconCompat;
        if (iconCompat != null) {
            int i2 = iconCompat.LIZ;
            if (i2 == -1) {
                i2 = Build.VERSION.SDK_INT >= 23 ? C07B.LIZJ(iconCompat.LIZIZ) : i2;
            }
            if (i2 == 2) {
                this.LJII = iconCompat.LIZLLL();
            }
        }
        this.LJIIIIZZ = C022406y.LIZJ(charSequence);
        this.LJIIIZ = pendingIntent;
        this.LIZ = bundle == null ? new Bundle() : bundle;
        this.LIZJ = c020406eArr;
        this.LIZLLL = z;
        this.LJFF = i;
        this.LJ = z2;
        this.LJI = z3;
        this.LJIIJ = z4;
    }
}
