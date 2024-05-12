package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.0to, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22080to {
    public static final C22080to LIZIZ = new C22080to(0);
    public static final C22080to LIZJ = new C22080to(1);
    public static final C22080to LIZLLL = new C22080to(2);
    public final int LIZ;

    public final String toString() {
        if (this.LIZ == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.LIZ & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((this.LIZ & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TextDecoration.");
            LIZ.append((String) ListProtector.get(arrayList, 0));
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("TextDecoration[");
        LIZ2.append(C77357UXp.LJIIJJI(arrayList, ", ", null, 62));
        LIZ2.append(']');
        return X1D.LIZIZ(LIZ2);
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public C22080to(int i) {
        this.LIZ = i;
    }

    public final boolean LIZ(C22080to c22080to) {
        int i = this.LIZ;
        if ((c22080to.LIZ | i) == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C22080to) && this.LIZ == ((C22080to) obj).LIZ) {
            return true;
        }
        return false;
    }
}
