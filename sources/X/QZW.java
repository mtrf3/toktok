package X;

/* loaded from: classes12.dex */
public final class QZW {
    public final Class<?> LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final int hashCode() {
        return ((((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ) * 1000003) ^ this.LIZJ;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.LIZ);
        sb.append(", type=");
        int i = this.LIZIZ;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.LIZJ;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(KMP.LJ("Unsupported injection: ", i2));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return AnonymousClass073.LIZIZ(sb, str2, "}");
    }

    public static QZW LIZ(Class<?> cls) {
        return new QZW(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QZW)) {
            return false;
        }
        QZW qzw = (QZW) obj;
        if (this.LIZ != qzw.LIZ || this.LIZIZ != qzw.LIZIZ || this.LIZJ != qzw.LIZJ) {
            return false;
        }
        return true;
    }

    public QZW(int i, int i2, Class cls) {
        this.LIZ = cls;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
