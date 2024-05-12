package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IFH {
    public static Aweme LIZ;
    public static float LIZIZ = 1.0f;
    public static float LIZJ = 1.0f;
    public static InterfaceC88471Ynr<? super Float, ? super Aweme, C76800UCe> LIZLLL;

    public static boolean LIZ(Aweme aweme) {
        if (((Number) IFJ.LIZ.getValue()).intValue() == 1 || aweme == null || aweme.getIsSubAweme() || aweme.isLive() || !aweme.isCanPlay() || aweme.isAd() || aweme.isImage() || aweme.isPhotoMode() || C54838Lfe.LJJI(aweme) || C47261Igj.LJJIIZI(aweme) || C224868s6.LIZLLL(aweme) || aweme.getAwemeType() == 4000 || aweme.getAwemeType() == 4001 || aweme.getAwemeType() == 4003) {
            return false;
        }
        return true;
    }

    public static float LIZIZ(Aweme aweme) {
        if (LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZLLL().LJJIJIIJIL()) {
            return LIZJ;
        }
        if (!TextUtils.equals(C78996UzQ.LJIIL(LIZ), C78996UzQ.LJIIL(aweme))) {
            return 1.0f;
        }
        return LIZJ;
    }

    public static float LIZJ(Aweme aweme) {
        if (LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZLLL().LJJIJIIJIL()) {
            return LIZIZ;
        }
        if (!TextUtils.equals(C78996UzQ.LJIIL(LIZ), C78996UzQ.LJIIL(aweme))) {
            return 1.0f;
        }
        return LIZIZ;
    }

    public static void LIZLLL(String enterFrom, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C2U8.LIZ(new C56152Ih(enterFrom, str));
    }

    public static void LJ(String enterFrom, Aweme aweme, float f) {
        o.LJIIIZ(enterFrom, "enterFrom");
        float f2 = LIZJ;
        LIZ = aweme;
        LIZJ = f;
        LIZIZ = f;
        InterfaceC88471Ynr<? super Float, ? super Aweme, C76800UCe> interfaceC88471Ynr = LIZLLL;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Float.valueOf(f), LIZ);
        }
        LIZIZ(aweme);
        C2U8.LIZ(new C2IY(f2, enterFrom, true));
    }
}
