package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.Gson;
import com.google.gson.internal.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.challenge.model.Hashtag2Emoji;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Op7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63069Op7 {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static ConcurrentHashMap<String, Hashtag2Emoji> LIZ = new ConcurrentHashMap<>();
    public static final LinkedHashMap<String, Bitmap> LIZLLL = new LinkedHashMap<>(30, 0.75f, true);

    public static final void LIZ() {
        ConcurrentHashMap<String, Hashtag2Emoji> concurrentHashMap;
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        try {
            if (C63073OpB.LIZ.isEmpty()) {
                SettingsManager.LIZLLL().getClass();
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) SettingsManager.LJII("hashtag2emoji_map", ConcurrentHashMap.class);
                if (concurrentHashMap2 != null) {
                    for (String key : concurrentHashMap2.keySet()) {
                        m mVar = (m) concurrentHashMap2.get(key);
                        if (mVar != null) {
                            Gson gson = C63073OpB.LIZIZ;
                            Hashtag2Emoji code = (Hashtag2Emoji) gson.LJII(gson.LJIILL(mVar), new C63075OpD().getType());
                            ConcurrentHashMap<String, Hashtag2Emoji> concurrentHashMap3 = C63073OpB.LIZ;
                            o.LJIIIIZZ(key, "key");
                            o.LJIIIIZZ(code, "code");
                            concurrentHashMap3.put(key, code);
                        }
                    }
                }
            }
            concurrentHashMap = C63073OpB.LIZ;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            concurrentHashMap = C63073OpB.LIZ;
        }
        LIZ = concurrentHashMap;
    }

    public static boolean LIZJ(TextExtraStruct textExtraStruct, String str) {
        if (str != null && textExtraStruct.getStart() >= 0 && textExtraStruct.getEnd() >= 0 && textExtraStruct.getEnd() <= str.length() && textExtraStruct.getStart() < str.length() && textExtraStruct.getStart() < textExtraStruct.getEnd()) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        C188727au c188727au = new C188727au();
        String lowerCase = str2.toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        c188727au.LJIIIZ("tag_name", lowerCase);
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("show_commercial_emoji", c188727au.LIZ);
    }

    public static final UrlModel LIZIZ(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        long currentTimeMillis;
        long currentTimeMillis2;
        Long l;
        Long l2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        if (!SettingsManager.LIZ("enable_emoji_of_non_commerce_hashtag", false)) {
            if (!z) {
                return null;
            }
        }
        LIZ();
        if (LIZ.isEmpty()) {
            return null;
        }
        for (String hashtag : LIZ.keySet()) {
            o.LJIIIIZZ(hashtag, "hashtag");
            if (z2) {
                str2 = QZZ.LIZIZ('#', hashtag);
            } else {
                str2 = hashtag;
            }
            if (str != null) {
                str3 = str.toLowerCase();
                o.LJIIIIZZ(str3, "this as java.lang.String).toLowerCase()");
            } else {
                str3 = null;
            }
            if (o.LJ(str2, str3)) {
                Hashtag2Emoji hashtag2Emoji = LIZ.get(hashtag);
                if (hashtag2Emoji != null && (l2 = hashtag2Emoji.startTime) != null) {
                    currentTimeMillis = l2.longValue();
                } else {
                    currentTimeMillis = (System.currentTimeMillis() / 1000) + 1;
                }
                long j = 1000;
                if (currentTimeMillis >= System.currentTimeMillis() / j) {
                    continue;
                } else {
                    Hashtag2Emoji hashtag2Emoji2 = LIZ.get(hashtag);
                    if (hashtag2Emoji2 != null && (l = hashtag2Emoji2.expireTime) != null) {
                        currentTimeMillis2 = l.longValue();
                    } else {
                        currentTimeMillis2 = (System.currentTimeMillis() / j) - 1;
                    }
                    if (currentTimeMillis2 > System.currentTimeMillis() / j) {
                        Hashtag2Emoji hashtag2Emoji3 = LIZ.get(hashtag);
                        if (hashtag2Emoji3 == null) {
                            return null;
                        }
                        return hashtag2Emoji3.urlModel;
                    }
                }
            }
        }
        return null;
    }
}
