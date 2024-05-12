package X;

import android.content.Intent;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.FRu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38986FRu {
    public static AbstractC39351FcR LIZ() {
        if (!AbstractC39351FcR.LJIIIZ) {
            synchronized (C38987FRv.LIZJ) {
                if (C38987FRv.LIZ != null && C38987FRv.LIZ.booleanValue()) {
                    C38987FRv.LIZ = null;
                }
            }
            C38985FRt c38985FRt = C38985FRt.LIZIZ;
            AbstractC39351FcR LJIILL = c38985FRt.LJIILL(1);
            AbstractC39351FcR LJIILL2 = c38985FRt.LJIILL(3);
            if (LJIILL.LIZIZ() == 0) {
                if (LJIILL2.LIZIZ() != 0) {
                    LJIILL = LJIILL2;
                } else {
                    LJIILL = new EH4();
                }
            }
            AbstractC39351FcR.LJIIIIZZ = LJIILL;
            AbstractC39351FcR.LJIIIZ = true;
        }
        AbstractC39351FcR abstractC39351FcR = AbstractC39351FcR.LJIIIIZZ;
        if (abstractC39351FcR != null) {
            return abstractC39351FcR;
        }
        o.LJIJI("ins");
        throw null;
    }

    public static void LIZIZ(Intent intent) {
        String str;
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextUtils.equals(str, "HOME");
        }
    }
}
