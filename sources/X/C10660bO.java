package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.0bO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10660bO {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC10670bP LIZ;

    static {
        Locale[] localeArr = new Locale[0];
        if (Build.VERSION.SDK_INT >= 24) {
            new C32591Pr(C10650bN.LIZ(localeArr));
        } else {
            new C32581Pq(localeArr);
        }
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public C10660bO(InterfaceC10670bP interfaceC10670bP) {
        this.LIZ = interfaceC10670bP;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C10660bO) && this.LIZ.equals(((C10660bO) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
