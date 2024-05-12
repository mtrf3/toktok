package X;

/* loaded from: classes16.dex */
public class YIB {
    public volatile YIZ LIZ;
    public volatile AbstractC87141YHx LIZIZ;

    static {
        if (C36502EUg.LIZ != null) {
            try {
                C36502EUg.LIZ();
            } catch (Exception unused) {
            }
        }
    }

    public int hashCode() {
        return 1;
    }

    public final AbstractC87141YHx LIZ() {
        if (this.LIZIZ != null) {
            return this.LIZIZ;
        }
        synchronized (this) {
            if (this.LIZIZ != null) {
                return this.LIZIZ;
            }
            if (this.LIZ == null) {
                this.LIZIZ = AbstractC87141YHx.zzfuo;
            } else {
                this.LIZIZ = this.LIZ.LJ();
            }
            return this.LIZIZ;
        }
    }

    public final YIZ LIZIZ(YIZ yiz) {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    try {
                        this.LIZ = yiz;
                        this.LIZIZ = AbstractC87141YHx.zzfuo;
                    } catch (YI5 unused) {
                        this.LIZ = yiz;
                        this.LIZIZ = AbstractC87141YHx.zzfuo;
                    }
                }
            }
        }
        return this.LIZ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YIB)) {
            return false;
        }
        YIB yib = (YIB) obj;
        YIZ yiz = this.LIZ;
        YIZ yiz2 = yib.LIZ;
        if (yiz == null) {
            if (yiz2 == null) {
                return LIZ().equals(yib.LIZ());
            }
            return LIZIZ(yiz2.LIZIZ()).equals(yiz2);
        }
        if (yiz2 != null) {
            return yiz.equals(yiz2);
        }
        return yiz.equals(yib.LIZIZ(yiz.LIZIZ()));
    }
}
