package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Axw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27944Axw {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C27941Axt c27941Axt) {
        List<C27959AyB> list;
        java.util.Map<String, Boolean> map;
        java.util.Map<String, Boolean> map2;
        StringBuffer stringBuffer = new StringBuffer();
        if (c27941Axt != null && (list = c27941Axt.LIZ) != null) {
            for (C27959AyB c27959AyB : list) {
                String str = c27959AyB.LJIL;
                if (str == null) {
                    str = "";
                }
                String str2 = c27959AyB.LIZ;
                if (str2 != null && (map = c27941Axt.LIZIZ) != null && map.containsKey(str2) && (map2 = c27941Axt.LIZIZ) != null && o.LJ(map2.get(str2), Boolean.TRUE)) {
                    stringBuffer.append(str);
                    stringBuffer.append(',');
                }
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        o.LJIIIIZZ(stringBuffer2, "StringBuffer().apply {\n …   }\n        }.toString()");
        if (s.LJJL(stringBuffer2, ',')) {
            return s.LL(stringBuffer2, ',');
        }
        return stringBuffer2;
    }

    public static String LIZIZ(C27941Axt c27941Axt, java.util.Map addonSkuTrackIds) {
        java.util.Map<String, Boolean> map;
        String str;
        o.LJIIIZ(addonSkuTrackIds, "addonSkuTrackIds");
        StringBuffer stringBuffer = new StringBuffer();
        if (c27941Axt != null && (map = c27941Axt.LIZIZ) != null) {
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                if (entry != null && entry.getValue().booleanValue() && (str = (String) ((HashMap) addonSkuTrackIds).get(entry.getKey())) != null) {
                    stringBuffer.append(str);
                    stringBuffer.append(',');
                }
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        o.LJIIIIZZ(stringBuffer2, "StringBuffer().apply {\n …   }\n        }.toString()");
        if (s.LJJL(stringBuffer2, ',')) {
            return s.LL(stringBuffer2, ',');
        }
        return stringBuffer2;
    }
}
