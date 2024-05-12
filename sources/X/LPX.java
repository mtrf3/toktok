package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.e1;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class LPX {
    public static final Keva LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static int LIZLLL;
    public static int LJ;
    public static JSONObject LJFF;

    static {
        Keva repo = Keva.getRepo("event_hot_area");
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_NAME)");
        LIZ = repo;
        LIZIZ = KL2.LJIIJJI(EF7.LIZIZ());
        LIZJ = KL2.LJIIIZ(EF7.LIZIZ());
    }

    public static final boolean LIZ() {
        if (e1.LIZ(31744, "event_hot_area_hit_full_rate", true, false) || FMX.LIZJ("event_hot_area")) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(View view, String str, String str2) {
        if (LPO.LIZ() && (view instanceof C218518hr)) {
            Rect rect = new Rect();
            C218518hr c218518hr = (C218518hr) view;
            c218518hr.getGlobalVisibleRect(rect);
            float[] lastTouchDownXY = c218518hr.getLastTouchDownXY();
            if (str != null && ((o.LJ("homepage_hot", str) || o.LJ("homepage_follow", str)) && lastTouchDownXY.length == 2)) {
                int i = rect.left;
                int i2 = rect.right;
                int i3 = rect.top;
                int i4 = rect.bottom;
                int i5 = i2 - i;
                int i6 = i4 - i3;
                if (i5 != 0 && i6 != 0) {
                    float f = lastTouchDownXY[0];
                    float f2 = i;
                    if (f >= f2 && f <= i2) {
                        float f3 = lastTouchDownXY[1];
                        float f4 = i3;
                        if (f3 >= f4 && f3 <= i4) {
                            if (LIZ()) {
                                C188727au c188727au = new C188727au();
                                c188727au.LJIIIZ("type", str2);
                                float f5 = lastTouchDownXY[0] - f2;
                                float f6 = 100;
                                c188727au.LIZIZ((f5 * f6) / i5, "x");
                                c188727au.LIZIZ(((lastTouchDownXY[1] - f4) * f6) / i6, "y");
                                c188727au.LIZLLL(LIZIZ() ? 1 : 0, "rtl");
                                FMX.LJIIL("widget_event_hot_area", c188727au.LIZ);
                            }
                            Keva keva = LIZ;
                            keva.storeInt("widget_event_hot_area", keva.getInt("widget_event_hot_area", 0) + 1);
                            keva.storeLong("widget_event_hot_area_time", System.currentTimeMillis());
                        }
                    }
                }
            }
            float[] fArr = c218518hr.LJLJI;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
    }

    public static void LIZJ(Float f, Float f2, Aweme aweme, String str) {
        int i;
        Object obj;
        String str2;
        int i2;
        String groupId;
        if (!LPO.LIZ() || f == null || f2 == null) {
            return;
        }
        float floatValue = f.floatValue();
        int i3 = LIZIZ;
        if (floatValue > i3 / 2) {
            i = 2;
        } else {
            i = 1;
        }
        if (LIZ()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("type", "pause_play");
            float f3 = 100;
            c188727au.LIZIZ((f.floatValue() * f3) / i3, "x");
            c188727au.LIZIZ((f2.floatValue() * f3) / LIZJ, "y");
            c188727au.LIZLLL(i, "side");
            c188727au.LIZLLL(LIZIZ() ? 1 : 0, "rtl");
            String str3 = "";
            if (str == null) {
                str = "";
            }
            c188727au.LJIIIZ("enter_from", str);
            if (aweme == null) {
                obj = "";
            } else {
                obj = Integer.valueOf(aweme.getAwemeType());
            }
            c188727au.LJFF(obj, "aweme_type");
            if (aweme == null || (str2 = aweme.getAuthorUid()) == null) {
                str2 = "";
            }
            c188727au.LJIIIZ("author_id", str2);
            if (aweme != null && (groupId = aweme.getGroupId()) != null) {
                str3 = groupId;
            }
            c188727au.LJIIIZ("group_id", str3);
            if (aweme != null && aweme.isAd() && aweme.getAwemeType() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c188727au.LIZLLL(i2, "is_ads");
            FMX.LJIIL("event_hot_area", c188727au.LIZ);
        }
        Keva keva = LIZ;
        keva.storeInt("pause_play", keva.getInt("pause_play", 0) + 1);
        keva.storeLong("pause_play_time", System.currentTimeMillis());
    }
}
