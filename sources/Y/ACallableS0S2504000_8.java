package Y;

import X.C2MA;
import X.IDP;
import X.IDR;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public class ACallableS0S2504000_8 implements Callable {
    public final int $t;
    public int i10;
    public int i7;
    public int i8;
    public int i9;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5 = null;
    public Object l6;
    public String s0;
    public String s1;

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

    /* JADX WARN: Removed duplicated region for block: B:11:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$0(Y.ACallableS0S2504000_8 r19) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS0S2504000_8.call$0(Y.ACallableS0S2504000_8):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS0S2504000_8 r19) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS0S2504000_8.call$1(Y.ACallableS0S2504000_8):java.lang.Object");
    }

    public ACallableS0S2504000_8(IDP idp, int i, C2MA c2ma, int i2, int i3, int i4, Aweme aweme, String str, IDR idr, String str2, int i5) {
        this.$t = i5;
        this.l2 = idp;
        this.i7 = i;
        this.l3 = c2ma;
        this.i8 = i2;
        this.i9 = i3;
        this.i10 = i4;
        this.l4 = aweme;
        this.s0 = str;
        this.l6 = idr;
        this.s1 = str2;
    }
}
