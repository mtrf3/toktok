package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0n4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17900n4 {
    public final /* synthetic */ int LIZ;
    public final String LIZIZ;
    public final Object LIZJ;

    public final String LIZ() {
        StringBuilder sb = new StringBuilder("action = [");
        sb.append(this.LIZIZ);
        sb.append("], args = ");
        if (this.LIZJ != null) {
            sb.append("[");
            int i = 0;
            while (true) {
                Object obj = this.LIZJ;
                if (i >= ((Object[]) obj).length) {
                    break;
                }
                sb.append(((Object[]) obj)[i]);
                if (i != ((Object[]) this.LIZJ).length - 1) {
                    sb.append(",");
                }
                i++;
            }
            sb.append("]");
        } else {
            sb.append("null");
        }
        return sb.toString();
    }

    public final String toString() {
        switch (this.LIZ) {
            case 0:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LIZIZ);
                LIZ.append('@');
                LIZ.append(this.LIZJ);
                return X1D.LIZIZ(LIZ);
            default:
                return LIZ();
        }
    }

    public C17900n4(String[] strArr) {
        this.LIZ = 1;
        this.LIZIZ = "login";
        this.LIZJ = strArr;
    }

    public C17900n4(String str, C17960nA volume) {
        this.LIZ = 0;
        o.LJIIIZ(volume, "volume");
        this.LIZIZ = str;
        this.LIZJ = volume;
    }
}
