package X;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Locale;

/* renamed from: X.QaV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67259QaV {
    public static final C0MA<String, String> LIZ = new C0MA<>();
    public static Locale LIZIZ;

    public static String LIZ(Context context) {
        String packageName = context.getPackageName();
        try {
            C67166QXq LIZ2 = QCX.LIZ(context);
            return LIZ2.LIZ.getPackageManager().getApplicationLabel(C16880lQ.LLLLLLLLL(LIZ2.LIZ.getPackageManager(), packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String LIZIZ(int i, Context context) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(R.string.ok);
                }
                return resources.getString(com.zhiliaoapp.musically.R.string.dnj);
            }
            return resources.getString(com.zhiliaoapp.musically.R.string.dnt);
        }
        return resources.getString(com.zhiliaoapp.musically.R.string.dnm);
    }

    public static String LIZJ(int i, Context context) {
        Resources resources = context.getResources();
        String LIZ2 = LIZ(context);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 9) {
                                if (i != 20) {
                                    switch (i) {
                                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                            return LJ(context, "common_google_play_services_api_unavailable_text", LIZ2);
                                        case 17:
                                            return LJ(context, "common_google_play_services_sign_in_failed_text", LIZ2);
                                        case 18:
                                            return resources.getString(com.zhiliaoapp.musically.R.string.dnw, LIZ2);
                                        default:
                                            return resources.getString(com.zhiliaoapp.musically.R.string.dnr, LIZ2);
                                    }
                                }
                                return LJ(context, "common_google_play_services_restricted_profile_text", LIZ2);
                            }
                            return resources.getString(com.zhiliaoapp.musically.R.string.dns, LIZ2);
                        }
                        return LJ(context, "common_google_play_services_network_error_text", LIZ2);
                    }
                    return LJ(context, "common_google_play_services_invalid_account_text", LIZ2);
                }
                return resources.getString(com.zhiliaoapp.musically.R.string.dnk, LIZ2);
            }
            if (C67261QaX.LIZ(context)) {
                return resources.getString(com.zhiliaoapp.musically.R.string.dnx);
            }
            return resources.getString(com.zhiliaoapp.musically.R.string.dnu, LIZ2);
        }
        return resources.getString(com.zhiliaoapp.musically.R.string.dnn, LIZ2);
    }

    public static String LIZLLL(int i, Context context) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.zhiliaoapp.musically.R.string.dno);
            case 2:
                return resources.getString(com.zhiliaoapp.musically.R.string.dnv);
            case 3:
                return resources.getString(com.zhiliaoapp.musically.R.string.dnl);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return LJFF(context, "common_google_play_services_invalid_account_title");
            case 7:
                return LJFF(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return null;
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 15:
            case 19:
            default:
                return null;
            case 17:
                return LJFF(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return LJFF(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String LJFF(Context context, String str) {
        C10660bO c10660bO;
        Resources resources;
        C0MA<String, String> c0ma = LIZ;
        synchronized (c0ma) {
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                c10660bO = new C10660bO(new C32591Pr(C10620bK.LIZ(configuration)));
            } else {
                c10660bO = new C10660bO(new C32581Pq(configuration.locale));
            }
            Locale locale = c10660bO.LIZ.get();
            if (!locale.equals(LIZIZ)) {
                c0ma.clear();
                LIZIZ = locale;
            }
            String orDefault = c0ma.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    "Missing resource: ".concat(str);
                }
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                if (str.length() != 0) {
                    "Got empty resource: ".concat(str);
                }
                return null;
            }
            LIZ.put(str, string);
            return string;
        }
    }

    public static String LJ(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String LJFF = LJFF(context, str);
        if (LJFF == null) {
            LJFF = resources.getString(com.zhiliaoapp.musically.R.string.dnr);
        }
        return C16880lQ.LLLZI(resources.getConfiguration().locale, LJFF, new Object[]{str2});
    }
}
