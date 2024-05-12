package Y;

import X.C188727au;
import X.FMX;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class ACallableS0S2121101_3 implements Callable {
    public final int $t;
    public float f7;
    public int i5;
    public long j6;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;
    public boolean z4;

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

    public static final Object call$0(ACallableS0S2121101_3 aCallableS0S2121101_3) {
        String str;
        String str2;
        String str3;
        String str4;
        String authorUid;
        Aweme aweme = (Aweme) aCallableS0S2121101_3.l2;
        if (aweme != null) {
            str = aweme.getGroupId();
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        }
        Aweme aweme2 = (Aweme) aCallableS0S2121101_3.l2;
        if (aweme2 != null && (authorUid = aweme2.getAuthorUid()) != null) {
            str5 = authorUid;
        }
        String str6 = aCallableS0S2121101_3.s0;
        if (str6 == null || str6.length() == 0) {
            str2 = "long_press";
        } else {
            str2 = aCallableS0S2121101_3.s0;
        }
        C188727au c188727au = new C188727au();
        if (aCallableS0S2121101_3.z3) {
            str3 = str2;
        } else {
            str3 = "slide";
        }
        c188727au.LJIIIZ("enter_method", str3);
        c188727au.LJIIIZ("panel_source", str2);
        if (aCallableS0S2121101_3.z3) {
            str4 = "stable";
        } else {
            str4 = "unstable";
        }
        c188727au.LJIIIZ("status", str4);
        c188727au.LJIIIZ("enter_from", aCallableS0S2121101_3.s1);
        c188727au.LJIIIZ("group_id", str);
        c188727au.LJIIIZ("author_id", str5);
        c188727au.LIZIZ(aCallableS0S2121101_3.f7, "vPct");
        c188727au.LJ(aCallableS0S2121101_3.j6, "vDuration");
        c188727au.LIZLLL(aCallableS0S2121101_3.i5, "vLoops");
        c188727au.LIZLLL(aCallableS0S2121101_3.z4 ? 1 : 0, "is_clear_mode");
        FMX.LJIIL("enter_clear_screen", c188727au.LIZ);
        return null;
    }

    public static final Object call$1(ACallableS0S2121101_3 aCallableS0S2121101_3) {
        String str;
        String str2;
        String authorUid;
        Aweme aweme = (Aweme) aCallableS0S2121101_3.l2;
        if (aweme != null) {
            str = aweme.getGroupId();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        Aweme aweme2 = (Aweme) aCallableS0S2121101_3.l2;
        if (aweme2 != null && (authorUid = aweme2.getAuthorUid()) != null) {
            str3 = authorUid;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", aCallableS0S2121101_3.s0);
        if (aCallableS0S2121101_3.z3) {
            str2 = "stable";
        } else {
            str2 = "unstable";
        }
        c188727au.LJIIIZ("status", str2);
        c188727au.LJIIIZ("enter_from", aCallableS0S2121101_3.s1);
        c188727au.LJIIIZ("group_id", str);
        c188727au.LJIIIZ("author_id", str3);
        c188727au.LIZIZ(aCallableS0S2121101_3.f7, "vPct");
        c188727au.LJ(aCallableS0S2121101_3.j6, "vDuration");
        c188727au.LIZLLL(aCallableS0S2121101_3.i5, "vLoops");
        c188727au.LIZLLL(aCallableS0S2121101_3.z4 ? 1 : 0, "is_clear_mode");
        FMX.LJIIL("exit_clear_screen", c188727au.LIZ);
        return null;
    }

    public ACallableS0S2121101_3(float f, int i, long j, Aweme aweme, String str, String str2, boolean z, boolean z2, int i2) {
        this.$t = i2;
        this.l2 = aweme;
        this.s0 = str;
        this.z3 = z;
        this.s1 = str2;
        this.f7 = f;
        this.j6 = j;
        this.i5 = i;
        this.z4 = z2;
    }
}
