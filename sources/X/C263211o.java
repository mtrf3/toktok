package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.util.List;

/* renamed from: X.11o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C263211o {
    public final List<C16V> LIZ;
    public final int LIZIZ;
    public final C16U LIZJ;
    public int LIZLLL;

    public final C16U LIZ(C16U c16u) {
        String str;
        if (this.LIZIZ >= this.LIZ.size()) {
            if (c16u.LIZ == null && c16u.LIZJ != null) {
                String str2 = c16u.LIZIZ;
                if (str2 != null && !str2.isEmpty()) {
                    String str3 = c16u.LIZIZ;
                    String str4 = c16u.LIZJ;
                    if (!str4.isEmpty() && !str4.equals("/")) {
                        if (str4.charAt(0) == '/') {
                            if (!str3.equals("/")) {
                                str4 = i0.LJFF(str3, str4);
                            }
                        } else if (str3.equals("/")) {
                            str4 = i0.LJFF(str3, str4);
                        } else {
                            str3 = C00F.LIZIZ(str3, '/', str4);
                        }
                        c16u.LIZ = str4;
                    }
                    str4 = str3;
                    c16u.LIZ = str4;
                } else {
                    c16u.LIZ = c16u.LIZJ;
                }
            }
            return c16u;
        }
        int i = this.LIZLLL + 1;
        this.LIZLLL = i;
        if (i <= 1) {
            List<C16V> list = this.LIZ;
            int i2 = this.LIZIZ;
            C263211o c263211o = new C263211o(list, i2 + 1, c16u);
            C16V c16v = (C16V) ListProtector.get(list, i2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FileResolver = ");
            if (c16v != null) {
                str = c16v.toString();
            } else {
                str = "";
            }
            LIZ.append(str);
            LIZ.append(" file = ");
            LIZ.append(c16u.LIZ);
            X1D.LIZIZ(LIZ);
            C16U LIZ2 = c16v.LIZ(c263211o);
            if (LIZ2 != null) {
                if (LIZ2.LIZ != null) {
                    return LIZ2;
                }
                C263011m.LIZ.getClass();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("resolver ");
                LIZ3.append(c16v);
                LIZ3.append(" returned a file with no body");
                throw new IllegalStateException(X1D.LIZIZ(LIZ3));
            }
            C263011m.LIZ.getClass();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("resolver ");
            LIZ4.append(c16v);
            LIZ4.append(" returned null");
            throw new NullPointerException(X1D.LIZIZ(LIZ4));
        }
        C263011m.LIZ.getClass();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("FileResolver ");
        LIZ5.append(ListProtector.get(this.LIZ, this.LIZIZ - 1));
        LIZ5.append(" must call handle() exactly once");
        throw new IllegalStateException(X1D.LIZIZ(LIZ5));
    }

    public C263211o(List<C16V> list, int i, C16U c16u) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = c16u;
    }
}
