package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.11t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C263711t {
    public final List<String> LIZ;
    public InterfaceC263811u LIZIZ;

    public final String toString() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KeyPath{keys=");
        LIZ.append(this.LIZ);
        LIZ.append(",resolved=");
        if (this.LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        return C48339Iy7.LIZJ(LIZ, z, '}', LIZ);
    }

    public C263711t(C263711t c263711t) {
        this.LIZ = new ArrayList(c263711t.LIZ);
        this.LIZIZ = c263711t.LIZIZ;
    }

    public C263711t(String... strArr) {
        this.LIZ = Arrays.asList(strArr);
    }

    public final boolean LIZ(int i, String str) {
        boolean z;
        boolean z2;
        if (i >= this.LIZ.size()) {
            return false;
        }
        if (i == this.LIZ.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = (String) ListProtector.get(this.LIZ, i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z) {
                if (i != this.LIZ.size() - 2) {
                    return false;
                }
                List<String> list = this.LIZ;
                if (!((String) C64504PTg.LIZIZ(list, -1, list)).equals("**")) {
                    return false;
                }
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        if (z) {
            return true;
        }
        if (((String) ListProtector.get(this.LIZ, i + 1)).equals(str)) {
            if (i != this.LIZ.size() - 2) {
                if (i != this.LIZ.size() - 3) {
                    return false;
                }
                List<String> list2 = this.LIZ;
                if (!((String) C64504PTg.LIZIZ(list2, -1, list2)).equals("**")) {
                    return false;
                }
            }
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.LIZ.size() - 1) {
            return false;
        }
        return ((String) ListProtector.get(this.LIZ, i2)).equals(str);
    }

    public final int LIZIZ(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!((String) ListProtector.get(this.LIZ, i)).equals("**")) {
            return 1;
        }
        if (i == this.LIZ.size() - 1 || !((String) ListProtector.get(this.LIZ, i + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean LIZJ(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.LIZ.size()) {
            return false;
        }
        if (((String) ListProtector.get(this.LIZ, i)).equals(str) || ((String) ListProtector.get(this.LIZ, i)).equals("**") || ((String) ListProtector.get(this.LIZ, i)).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL(int i, String str) {
        if ("__container".equals(str) || i < this.LIZ.size() - 1 || ((String) ListProtector.get(this.LIZ, i)).equals("**")) {
            return true;
        }
        return false;
    }
}
