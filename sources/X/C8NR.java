package X;

import Y.ARunnableS1S0500000_3;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8NR, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8NR {
    public String LIZ;
    public String LIZIZ;

    public int LIZ() {
        return 0;
    }

    public int LIZIZ() {
        return 0;
    }

    public /* synthetic */ C8NR() {
        this.LIZ = "";
        this.LIZIZ = "";
    }

    public /* synthetic */ C8NR(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public static void LIZLLL(C8NR c8nr, Context context, List list, int i) {
        String str;
        c8nr.getClass();
        o.LJIIIZ(context, "context");
        if (list == null || list.isEmpty() || !C8NU.LIZ().getEnable()) {
            return;
        }
        String str2 = null;
        if (JA2.LIZ()) {
            String str3 = c8nr.LIZ;
            Aweme aweme = (Aweme) ORZ.LJLLLLLL(i, list);
            if (aweme != null) {
                str2 = aweme.getAid();
            }
            if (o.LJ(str3, str2)) {
                return;
            }
        }
        int LIZ = c8nr.LIZ();
        if (LIZ < 1) {
            LIZ = 1;
        }
        int i2 = i + 2;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = (LIZ + i2) - 1;
        int LJJI = C47261Igj.LJJI(list);
        if (i3 > LJJI) {
            i3 = LJJI;
        }
        c8nr.LJ(context, list, new C40517FvF(i2, i3), new C40517FvF(0, 0));
        Aweme aweme2 = (Aweme) ORZ.LJLLLLLL(i, list);
        if (aweme2 == null || (str = aweme2.getAid()) == null) {
            str = "";
        }
        c8nr.LIZ = str;
    }

    public static void LJFF(C8NR c8nr, Context context, List list, int i) {
        String str;
        c8nr.getClass();
        o.LJIIIZ(context, "context");
        if (list == null || list.isEmpty() || i <= 1 || !C8NU.LIZ().getEnable()) {
            return;
        }
        String str2 = null;
        if (JA2.LIZ()) {
            String str3 = c8nr.LIZIZ;
            Aweme aweme = (Aweme) ORZ.LJLLLLLL(i, list);
            if (aweme != null) {
                str2 = aweme.getAid();
            }
            if (o.LJ(str3, str2)) {
                return;
            }
        }
        int LIZIZ = c8nr.LIZIZ();
        if (LIZIZ < 1) {
            LIZIZ = 1;
        }
        int i2 = i - 2;
        int LJJI = C47261Igj.LJJI(list);
        if (i2 > LJJI) {
            i2 = LJJI;
        }
        int i3 = (i2 - LIZIZ) + 1;
        if (i3 < 0) {
            i3 = 0;
        }
        c8nr.LJ(context, list, C78842Uww.LJIILLIIL(i2, i3), new C40517FvF(0, 0));
        Aweme aweme2 = (Aweme) ORZ.LJLLLLLL(i, list);
        if (aweme2 == null || (str = aweme2.getAid()) == null) {
            str = "";
        }
        c8nr.LIZIZ = str;
    }

    public static void LJI(int i, Throwable th, String str, long j) {
        String str2;
        C188727au LIZJ = C78920UyC.LIZJ(i, "success");
        LIZJ.LJIIIZ("preload_url", str);
        LIZJ.LJ(j, "duration");
        LIZJ.LIZLLL(0, "error_code");
        if (th != null) {
            str2 = th.getMessage();
        } else {
            str2 = null;
        }
        LIZJ.LJIIIZ("error_msg", str2);
        LIZJ.LIZLLL(0, "http_code");
        FMX.LJIIL("photo_mode_preload_status", LIZJ.LIZ);
    }

    public void LIZJ(Context context, Aweme aweme, C40517FvF c40517FvF, KL0 priority) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(priority, "priority");
        C38995FSd.LIZLLL().execute(new ARunnableS1S0500000_3(c40517FvF, aweme, this, context, priority, 3));
    }

    public void LJ(Context context, List list, C40511Fv9 c40511Fv9, C40517FvF c40517FvF) {
        KL0 kl0;
        int i = c40511Fv9.LJLIL;
        int i2 = c40511Fv9.LJLILLLLZI;
        int i3 = c40511Fv9.LJLJI;
        if (i3 > 0) {
            if (i > i2) {
                return;
            }
        } else if (i3 >= 0 || i2 > i) {
            return;
        }
        boolean z = true;
        while (true) {
            if (((Aweme) ListProtector.get(list, i)).isPhotoMode()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("start preload aweme ");
                LIZ.append(i);
                C36922EeM.LIZLLL(3, "BasePreloadHelper", X1D.LIZIZ(LIZ));
                Aweme aweme = (Aweme) ListProtector.get(list, i);
                if (z) {
                    kl0 = KL0.HIGH;
                } else {
                    kl0 = KL0.MEDIUM;
                }
                LIZJ(context, aweme, c40517FvF, kl0);
                z = false;
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }
}
