package X;

import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.0Xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09170Xp {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public C09170Xp LIZIZ;

    public C09170Xp(String name) {
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        if (name.length() == 0 || s.LJJJLZIJ(name, "/", false)) {
            throw new IllegalArgumentException("domain name not valid");
        }
    }

    public final String LIZ(String str) {
        C09170Xp c09170Xp = this.LIZIZ;
        if (c09170Xp == null) {
            return this.LIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c09170Xp.LIZ(str));
        LIZ.append(str);
        LIZ.append(this.LIZ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (LIZIZ != null) {
            return LIZIZ;
        }
        return "";
    }
}
