package X;

/* loaded from: classes16.dex */
public final class X1G implements X1E {
    public final StringBuilder[] LIZ = new StringBuilder[32];
    public final Object LIZIZ = new Object();
    public int LIZJ = -1;

    @Override // X.X1E
    public final StringBuilder get() {
        StringBuilder sb;
        synchronized (this.LIZIZ) {
            int i = this.LIZJ;
            sb = null;
            if (i >= 0 && i < 32) {
                StringBuilder[] sbArr = this.LIZ;
                StringBuilder sb2 = sbArr[i];
                sbArr[i] = null;
                this.LIZJ = i - 1;
                sb = sb2;
            }
        }
        if (sb == null) {
            return new StringBuilder();
        }
        return sb;
    }

    @Override // X.X1E
    public final String LIZ(StringBuilder sb) {
        String sb2 = sb.toString();
        if (sb.length() > 4096) {
            return sb2;
        }
        sb.setLength(0);
        synchronized (this.LIZIZ) {
            int i = this.LIZJ + 1;
            if (i < 32 && i >= 0) {
                this.LIZJ = i;
                this.LIZ[i] = sb;
                return sb2;
            }
            return sb2;
        }
    }
}
