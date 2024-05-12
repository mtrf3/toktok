package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.List;
import java.util.Locale;

/* loaded from: classes14.dex */
public final class UYR {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("en", "de", "es", "et", "fr", "hr", "id", "lt", "lv", "ms", "pt", "sk", "tr", "vi", "ceb", "cs", "da", "fi", "fil", "hu", "it", "jv", "nb", "nl", "pl", "ro", "sv", "uz");

    public static final String LIZ(int i, boolean z) {
        return i != 1 ? i != 2 ? i != 3 ? "" : z ? "font/TikTok-Display-Bold.otf" : "font/TikTok-Text-Bold.otf" : z ? "font/TikTok-Display-Medium.otf" : "font/TikTok-Text-Medium.otf" : z ? "font/TikTok-Display-Regular.otf" : "font/TikTok-Text-Regular.otf";
    }

    public static final T5V LIZIZ(int i, boolean z) {
        OSJ osj;
        String str;
        float f;
        int i2 = i / 10;
        int i3 = i % 10;
        Float valueOf = Float.valueOf(0.0019f);
        Float valueOf2 = Float.valueOf(0.01f);
        Float valueOf3 = Float.valueOf(1.125f);
        float f2 = 0.0f;
        Float valueOf4 = Float.valueOf(0.0f);
        Float valueOf5 = Float.valueOf(1.3f);
        switch (i2) {
            case 1:
                osj = new OSJ(24, valueOf3, valueOf2);
                break;
            case 2:
                osj = new OSJ(20, Float.valueOf(1.25f), Float.valueOf(0.02f));
                break;
            case 3:
                osj = new OSJ(17, valueOf5, valueOf4);
                break;
            case 4:
                osj = new OSJ(15, valueOf5, Float.valueOf(0.004f));
                break;
            case 5:
                osj = new OSJ(14, valueOf5, Float.valueOf(0.0067f));
                break;
            case 6:
                osj = new OSJ(13, valueOf5, Float.valueOf(0.0097f));
                break;
            case 7:
                osj = new OSJ(12, valueOf5, Float.valueOf(0.0134f));
                break;
            case 8:
                osj = new OSJ(11, valueOf5, Float.valueOf(0.0177f));
                break;
            case 9:
                osj = new OSJ(10, valueOf5, Float.valueOf(0.0229f));
                break;
            case 10:
                osj = new OSJ(16, valueOf5, valueOf);
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                osj = new OSJ(16, Float.valueOf(1.5f), valueOf);
                break;
            case 12:
                osj = new OSJ(32, Float.valueOf(1.2f), valueOf4);
                break;
            default:
                osj = new OSJ(24, valueOf3, valueOf2);
                break;
        }
        int intValue = ((Number) osj.getFirst()).intValue();
        float floatValue = ((Number) osj.getSecond()).floatValue();
        float floatValue2 = ((Number) osj.getThird()).floatValue();
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3 || intValue > 17) {
                    str = "font/TikTok-Display-Bold.otf";
                } else {
                    str = "font/TikTok-Text-Bold.otf";
                }
            } else if (intValue > 17) {
                str = "font/TikTok-Display-Medium.otf";
            } else {
                str = "font/TikTok-Text-Medium.otf";
            }
        } else if (intValue > 17) {
            str = "font/TikTok-Display-Regular.otf";
        } else {
            str = "font/TikTok-Text-Regular.otf";
        }
        if (LIZ.contains(Locale.getDefault().getLanguage())) {
            f2 = floatValue2;
        }
        float f3 = intValue;
        int i4 = (int) (floatValue * f3);
        if (z) {
            int i5 = G4K.LIZ;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2 || i5 == 3) {
                        f = 1.1f;
                    }
                } else {
                    f = 1.05f;
                }
                return new T5V((int) (f3 * f), (int) (i4 * f), f2, str);
            }
            f = 1.0f;
            return new T5V((int) (f3 * f), (int) (i4 * f), f2, str);
        }
        return new T5V(intValue, i4, f2, str);
    }
}
