package Y;

import X.C55693LtR;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public class ACallableS0S3124100_9 implements Callable {
    public final int $t;
    public int i6;
    public int i7;
    public int i8;
    public int i9;
    public long j10;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;
    public boolean z4;
    public boolean z5 = false;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS0S3124100_9 aCallableS0S3124100_9) {
        return ((C55693LtR) aCallableS0S3124100_9.l3).LJIILL(aCallableS0S3124100_9.z4, aCallableS0S3124100_9.s0, aCallableS0S3124100_9.i6, aCallableS0S3124100_9.j10, aCallableS0S3124100_9.i7, aCallableS0S3124100_9.s1, aCallableS0S3124100_9.i8, aCallableS0S3124100_9.i9, aCallableS0S3124100_9.z5, aCallableS0S3124100_9.s2);
    }

    public static final Object call$1(ACallableS0S3124100_9 aCallableS0S3124100_9) {
        return ((C55693LtR) aCallableS0S3124100_9.l3).LJIILL(aCallableS0S3124100_9.z4, aCallableS0S3124100_9.s0, aCallableS0S3124100_9.i6, aCallableS0S3124100_9.j10, aCallableS0S3124100_9.i7, aCallableS0S3124100_9.s1, aCallableS0S3124100_9.i8, aCallableS0S3124100_9.i9, aCallableS0S3124100_9.z5, aCallableS0S3124100_9.s2);
    }

    public ACallableS0S3124100_9(C55693LtR c55693LtR, boolean z, String str, int i, long j, int i2, String str2, int i3, int i4, String str3, int i5) {
        this.$t = i5;
        this.l3 = c55693LtR;
        this.z4 = z;
        this.s0 = str;
        this.i6 = i;
        this.j10 = j;
        this.i7 = i2;
        this.s1 = str2;
        this.i8 = i3;
        this.i9 = i4;
        this.s2 = str3;
    }
}
