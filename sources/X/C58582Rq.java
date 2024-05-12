package X;

import Y.ARunnableS2S1100000_1;
import android.content.Context;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* renamed from: X.2Rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58582Rq {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58592Rr.LJLIL);

    public static final void LIZ(String msg, String str) {
        o.LJIIIZ(msg, "msg");
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            StringBuilder LJFF = C72972SkS.LJFF("AdHybridLog", ' ');
            if (str == null) {
                str = "";
            }
            LJFF.append(str);
            X1D.LIZIZ(LJFF);
        }
    }

    public static final void LIZIZ(Context context, String str) {
        if (context == null) {
            return;
        }
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "pop_toast_with_ad_hybrid", true, false);
        } catch (Throwable unused) {
        }
        if (z && ((Boolean) LIZIZ.getValue()).booleanValue()) {
            LIZ.post(new ARunnableS2S1100000_1(context, str, 6));
        }
    }
}
