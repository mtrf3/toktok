package X;

import com.bytedance.keva.Keva;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* renamed from: X.ANk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26132ANk {
    public static C26132ANk LIZLLL;
    public final DateFormat LIZ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public final int LIZIZ;
    public final Keva LIZJ;

    public static C26132ANk LIZ() {
        if (LIZLLL == null) {
            synchronized (C26132ANk.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C26132ANk();
                }
            }
        }
        return LIZLLL;
    }

    public C26132ANk() {
        C16880lQ.LJLLJ(C26132ANk.class);
        this.LIZIZ = 11;
        this.LIZJ = Keva.getRepo("ug_coupon_repo");
    }

    public final void LIZIZ(boolean z) {
        if (!z && this.LIZJ.getBoolean("show_bar", false)) {
            return;
        }
        this.LIZJ.storeBoolean("show_bar", z);
    }
}
