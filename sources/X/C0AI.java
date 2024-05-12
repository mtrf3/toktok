package X;

/* renamed from: X.0AI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AI {
    public int LIZ;
    public int LIZIZ;
    public Object LIZJ;
    public int LIZLLL;

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(Integer.toHexString(System.identityHashCode(this)));
        LIZ.append("[");
        int i = this.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        LIZ.append(str);
        LIZ.append(",s:");
        LIZ.append(this.LIZIZ);
        LIZ.append("c:");
        LIZ.append(this.LIZLLL);
        LIZ.append(",p:");
        LIZ.append(this.LIZJ);
        LIZ.append("]");
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0AI)) {
            return false;
        }
        C0AI c0ai = (C0AI) obj;
        int i = this.LIZ;
        if (i != c0ai.LIZ) {
            return false;
        }
        if (i == 8 && Math.abs(this.LIZLLL - this.LIZIZ) == 1 && this.LIZLLL == c0ai.LIZIZ && this.LIZIZ == c0ai.LIZLLL) {
            return true;
        }
        if (this.LIZLLL != c0ai.LIZLLL || this.LIZIZ != c0ai.LIZIZ) {
            return false;
        }
        Object obj2 = this.LIZJ;
        if (obj2 != null) {
            if (!obj2.equals(c0ai.LIZJ)) {
                return false;
            }
        } else if (c0ai.LIZJ != null) {
            return false;
        }
        return true;
    }

    public C0AI(int i, int i2, int i3, Object obj) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = i3;
        this.LIZJ = obj;
    }
}
