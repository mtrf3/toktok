package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FqE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40206FqE {
    public static final ConcurrentHashMap<EnumC84359X8x, Long> LIZ = new ConcurrentHashMap<>();
    public static final JSONObject LIZIZ = new JSONObject();

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        if (android.provider.Settings.Secure.getInt(r10.getContentResolver(), "touch_exploration_enabled", 0) != 0) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.EnumC84359X8x r9, android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40206FqE.LIZ(X.X8x, android.content.Context):boolean");
    }

    public static void LIZLLL(EnumC84359X8x enumC84359X8x, Object obj) {
        String str;
        switch (C84358X8w.LIZ[enumC84359X8x.ordinal()]) {
            case 1:
                str = "common_screen_reader";
                break;
            case 2:
                str = "common_dark_display";
                break;
            case 3:
                str = "common_reduce_animation";
                break;
            case 4:
                str = "common_preferred_font_size";
                break;
            case 5:
                str = "android_high_contrast_text";
                break;
            case 6:
                str = "common_bold_text";
                break;
            case 7:
                str = "android_color_inversion";
                break;
            case 8:
                str = "android_show_captions";
                break;
            default:
                throw new C162476Zf();
        }
        if (!o.LJ(obj, Boolean.FALSE)) {
            LIZIZ.put(str, true);
        } else {
            LIZIZ.remove(str);
        }
    }

    public static void LIZIZ(EnumC84359X8x setting, Context context, String enterFrom, String str) {
        String str2;
        o.LJIIIZ(setting, "setting");
        o.LJIIIZ(enterFrom, "enterFrom");
        ConcurrentHashMap<EnumC84359X8x, Long> concurrentHashMap = LIZ;
        if (concurrentHashMap.get(setting) != null) {
            if (!LIZ(setting, context) || o.LJ(str, "app_pause")) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Long l = concurrentHashMap.get(setting);
                if (l == null) {
                    l = 0L;
                }
                long longValue = (elapsedRealtime - l.longValue()) / 1000;
                concurrentHashMap.remove(setting);
                String valueOf = String.valueOf(longValue);
                switch (C84358X8w.LIZ[setting.ordinal()]) {
                    case 1:
                        str2 = "voice_over_duration";
                        break;
                    case 2:
                        str2 = "dark_mode_duration";
                        break;
                    case 3:
                        str2 = "reduce_motion_duration";
                        break;
                    case 4:
                        str2 = "large_text_duration";
                        break;
                    case 5:
                        str2 = "increase_contrast_duration";
                        break;
                    case 6:
                        str2 = "bold_text_duration";
                        break;
                    case 7:
                        str2 = "color_inversion_duration";
                        break;
                    case 8:
                        str2 = "show_captions_duration";
                        break;
                    default:
                        throw new C162476Zf();
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", enterFrom);
                c188727au.LJIIIZ("enter_method", str);
                c188727au.LJIIIZ("duration", valueOf);
                FMX.LJIIL(str2, c188727au.LIZ);
            }
        }
    }

    public static void LIZJ(EnumC84359X8x setting, Context context, String enterFrom, String str) {
        String str2;
        o.LJIIIZ(setting, "setting");
        o.LJIIIZ(enterFrom, "enterFrom");
        ConcurrentHashMap<EnumC84359X8x, Long> concurrentHashMap = LIZ;
        if (concurrentHashMap.get(setting) == null && LIZ(setting, context)) {
            concurrentHashMap.put(setting, Long.valueOf(SystemClock.elapsedRealtime()));
            switch (C84358X8w.LIZ[setting.ordinal()]) {
                case 1:
                    str2 = "start_voice_over";
                    break;
                case 2:
                    str2 = "start_dark_mode";
                    break;
                case 3:
                    str2 = "start_reduce_motion";
                    break;
                case 4:
                    str2 = "start_large_text";
                    break;
                case 5:
                    str2 = "start_increase_contrast";
                    break;
                case 6:
                    str2 = "start_bold_text";
                    break;
                case 7:
                    str2 = "start_color_inversion";
                    break;
                case 8:
                    str2 = "start_show_captions";
                    break;
                default:
                    throw new C162476Zf();
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", enterFrom);
            c188727au.LJIIIZ("enter_method", str);
            c188727au.LJIIIZ("page", "");
            FMX.LJIIL(str2, c188727au.LIZ);
        }
    }
}
