package X;

import android.os.Build;
import java.util.HashSet;

/* renamed from: X.1Cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC29211Cr implements InterfaceC07940Sw {
    public static final java.util.Set<AbstractC29211Cr> LIZJ = new HashSet();
    public final String LIZ;
    public final String LIZIZ;

    public abstract boolean LIZJ();

    public boolean LIZLLL() {
        java.util.Set<String> set = C0CQ.LIZ;
        String str = this.LIZIZ;
        HashSet hashSet = (HashSet) set;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if ("eng".equals(str2) || "userdebug".equals(str2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(":dev");
            if (hashSet.contains(X1D.LIZIZ(LIZ))) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC07940Sw
    public final boolean LIZIZ() {
        if (LIZJ() || LIZLLL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC07940Sw
    public final String LIZ() {
        return this.LIZ;
    }

    public AbstractC29211Cr(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        ((HashSet) LIZJ).add(this);
    }
}
