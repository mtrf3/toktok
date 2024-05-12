package X;

import com.ss.android.ugc.aweme.experiment.SupportedLanguage;
import com.ss.android.ugc.aweme.experiment.TTLingoGeckoLowStorageConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ACW {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        ACX.LIZ.getClass();
        SupportedLanguage[] supportedLangValues = (SupportedLanguage[]) ACX.LIZJ.getValue();
        o.LJIIIIZZ(supportedLangValues, "supportedLangValues");
        for (SupportedLanguage supportedLanguage : supportedLangValues) {
            if (supportedLanguage.translationLanguage.contains(Y01.LIZIZ.LJJIIZI())) {
                if (!C25840ACe.LIZ || !TTLingoGeckoLowStorageConfig.isEnable()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ() {
        ACX.LIZ.getClass();
        SupportedLanguage[] supportedLangValues = (SupportedLanguage[]) ACX.LIZJ.getValue();
        o.LJIIIIZZ(supportedLangValues, "supportedLangValues");
        for (SupportedLanguage supportedLanguage : supportedLangValues) {
            if (supportedLanguage.translationLanguage.contains(Y01.LIZIZ.LJJIIZI())) {
                return true;
            }
        }
        return false;
    }

    public static EnumC25835ABz LIZ() {
        if (LIZIZ() && C25840ACe.LIZIZ != 0 && C25840ACe.LIZIZ == 1) {
            return EnumC25835ABz.TRANSCRIPT;
        }
        return EnumC25835ABz.CAPTIONS;
    }
}
