package X;

import android.os.Build;

/* renamed from: X.0lD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16750lD {
    public final C16760lE LIZ;

    public final C16800lI LIZ() {
        return this.LIZ.LIZIZ();
    }

    public C16750lD() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C43261ms();
        } else if (i >= 29) {
            this.LIZ = new C1V2();
        } else {
            this.LIZ = new C1V1();
        }
    }

    public C16750lD(C16800lI c16800lI) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C43261ms(c16800lI);
        } else if (i >= 29) {
            this.LIZ = new C1V2(c16800lI);
        } else {
            this.LIZ = new C1V1(c16800lI);
        }
    }
}
