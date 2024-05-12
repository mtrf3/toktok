package X;

import android.text.TextUtils;
import com.google.gson.m;
import defpackage.i0;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.9K4 */
/* loaded from: classes5.dex */
public final class C9K4 {
    public static final C9K4 LIZ = new C9K4();

    public final void LIZJ(String str, HashMap extraInfo) {
        o.LJIIIZ(extraInfo, "extraInfo");
        LJ(this, extraInfo, str, null, 28);
    }

    public static String LIZ(HashMap hashMap) {
        if (((Number) C35168DrA.LIZ.getValue()).intValue() == 1) {
            m mVar = new m();
            Object obj = "";
            for (Map.Entry entry : hashMap.entrySet()) {
                if (!o.LJ(entry.getKey(), "source")) {
                    mVar.LJJIIZ((String) entry.getKey(), (String) entry.getValue());
                } else {
                    obj = entry.getValue();
                }
            }
            m mVar2 = new m();
            mVar2.LJJII((String) obj, mVar);
            String jVar = mVar2.toString();
            o.LJIIIIZZ(jVar, "{\n            val elemen…json.toString()\n        }");
            return jVar;
        }
        String abstractMap = hashMap.toString();
        o.LJIIIIZZ(abstractMap, "{\n            map.toString()\n        }");
        return abstractMap;
    }

    public static void LIZIZ(String extraInfo, String str) {
        o.LJIIIZ(extraInfo, "extraInfo");
        if (!C35168DrA.LIZ()) {
            return;
        }
        String str2 = "FeedCoreProcess";
        if (!TextUtils.isEmpty(str)) {
            str2 = i0.LJFF("FeedCoreProcess", str);
        }
        C36922EeM.LIZLLL(4, str2, extraInfo);
    }

    public static void LIZLLL(HashMap extraInfo, String str, C9K6 stage, Exception exc) {
        o.LJIIIZ(extraInfo, "extraInfo");
        o.LJIIIZ(stage, "stage");
        if (!C35168DrA.LIZ()) {
            return;
        }
        if (C9K5.LIZ[stage.ordinal()] == 1 && exc != null) {
            extraInfo.put("code", String.valueOf(C64920Pds.LIZ(EF7.LIZIZ(), exc)));
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            extraInfo.put("errMsg", message);
        }
        String LIZ2 = LIZ(extraInfo);
        String str2 = "FeedCoreProcess";
        if (!TextUtils.isEmpty(str)) {
            str2 = i0.LJFF("FeedCoreProcess", str);
        }
        C36922EeM.LIZLLL(4, str2, LIZ2);
    }

    public static /* synthetic */ void LJ(C9K4 c9k4, HashMap hashMap, String str, C9K6 c9k6, int i) {
        if ((i & 1) != 0) {
            hashMap = new HashMap();
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            c9k6 = C9K6.DEFAULT;
        }
        c9k4.getClass();
        LIZLLL(hashMap, str, c9k6, null);
    }
}
