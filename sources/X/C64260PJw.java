package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.PJw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64260PJw {
    public String LIZ;

    public final String LIZ() {
        String str;
        boolean isEmpty = TextUtils.isEmpty(this.LIZ);
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!isEmpty && !CardStruct.IStatusCode.DEFAULT.equals(this.LIZ)) {
            return this.LIZ;
        }
        C64257PJt LIZIZ = PK0.LIZIZ();
        LIZIZ.getClass();
        try {
            str = LIZIZ.LIZIZ.getDeviceId();
        } catch (Throwable unused) {
            str = "";
        }
        this.LIZ = str;
        if (TextUtils.isEmpty(str) || CardStruct.IStatusCode.DEFAULT.equals(this.LIZ)) {
            C64256PJs LIZIZ2 = C64256PJs.LIZIZ();
            LIZIZ2.getClass();
            try {
                str2 = PK8.LJFF(LIZIZ2.LIZIZ.getAbsolutePath());
            } catch (Throwable unused2) {
            }
            this.LIZ = str2;
            return str2;
        }
        LIZIZ(this.LIZ);
        return this.LIZ;
    }

    public final void LIZIZ(String str) {
        this.LIZ = str;
        C64256PJs LIZIZ = C64256PJs.LIZIZ();
        LIZIZ.getClass();
        try {
            PK8.LJIILJJIL(LIZIZ.LIZIZ, str, false);
        } catch (Throwable unused) {
        }
    }
}
