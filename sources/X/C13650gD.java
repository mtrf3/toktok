package X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.0gD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13650gD {
    public boolean LIZ;
    public int LIZIZ;
    public C42891mH LIZJ;

    public final C13670gF LIZ() {
        if (this.LIZIZ == 2 && this.LIZJ == C13670gF.LIZLLL) {
            if (this.LIZ) {
                return C13670gF.LJII;
            }
            return C13670gF.LJI;
        }
        return new C13670gF(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public C13650gD() {
        this.LIZ = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.LIZJ = C13670gF.LIZLLL;
        this.LIZIZ = 2;
    }

    public C13650gD(boolean z) {
        this.LIZ = z;
        this.LIZJ = C13670gF.LIZLLL;
        this.LIZIZ = 2;
    }
}
