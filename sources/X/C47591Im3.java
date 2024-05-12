package X;

import android.text.TextUtils;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: X.Im3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47591Im3 implements InterfaceC47592Im4 {
    public static final String LIZIZ = "TTVideoEngine_CodecStrategy";
    public final TTVideoEngine LIZ;

    public C47591Im3(TTVideoEngine tTVideoEngine) {
        this.LIZ = tTVideoEngine;
    }

    public final void LIZ(EnumC47599ImB enumC47599ImB) {
        if (enumC47599ImB == null) {
            return;
        }
        this.LIZ.LLILL(1000, enumC47599ImB.encodeType);
        if (enumC47599ImB.decoder == 1) {
            this.LIZ.LJLLLL(7, 1);
            if (TextUtils.equals(enumC47599ImB.encodeType, "bytevc1")) {
                this.LIZ.LJJLJLI(1, true);
                return;
            } else {
                if (!TextUtils.equals(enumC47599ImB.encodeType, "h264")) {
                    return;
                }
                this.LIZ.LJJLJLI(0, true);
                return;
            }
        }
        this.LIZ.LJLLLL(7, 0);
    }

    public final void LIZIZ(String str, EnumC47599ImB enumC47599ImB) {
        String str2 = LIZIZ;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("setVideoID vid = ", str, ", playAuthToken = ", null, ", dimension = ");
        LIZLLL.append(enumC47599ImB);
        TTVideoEngineLog.d(str2, X1D.LIZIZ(LIZLLL));
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.LIZ;
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZLLL(14, 0, 0, str);
        } else {
            tTVideoEngineImpl.LJJLIIIJL(str);
        }
        this.LIZ.LLIIII();
        if (enumC47599ImB != null) {
            LIZ(enumC47599ImB);
            this.LIZ.LJLLLL(670, 0);
        }
    }
}
