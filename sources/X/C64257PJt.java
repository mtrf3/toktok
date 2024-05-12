package X;

import android.content.Context;
import com.bytedance.crash.ICommonParams;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.PJt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64257PJt {
    public final Context LIZ;
    public final ICommonParams LIZIZ;
    public final ICommonParams LIZJ;

    public final String LIZ() {
        String valueOf;
        ICommonParams iCommonParams = this.LIZIZ;
        try {
            if (iCommonParams instanceof C38832FLw) {
                C38832FLw c38832FLw = (C38832FLw) iCommonParams;
                c38832FLw.getClass();
                valueOf = String.valueOf(EF7.LJIIIZ);
                if ("3902".equals(c38832FLw.LJLIL)) {
                    valueOf = "3902";
                }
            } else if (iCommonParams instanceof C38833FLx) {
                ((C38833FLx) iCommonParams).getClass();
                valueOf = String.valueOf(EF7.LJIIIZ);
            } else {
                valueOf = String.valueOf(iCommonParams.getCommonParams().get("aid"));
            }
            return valueOf;
        } catch (Throwable unused) {
            return "4444";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LJ() {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64257PJt.LJ():java.util.Map");
    }

    public final java.util.Map<String, Object> LIZLLL() {
        java.util.Map<String, Object> LJ = LJ();
        Object obj = LJ.get("aid");
        if (obj == null || String.valueOf(obj) == null) {
            LJ.put("aid", 4444);
        }
        return LJ;
    }

    public static boolean LJFF(java.util.Map<String, Object> map) {
        if (map.isEmpty() || ((!map.containsKey("app_version") && !map.containsKey("version_name")) || !map.containsKey("version_code") || !map.containsKey("update_version_code"))) {
            return true;
        }
        return false;
    }

    public static java.util.Map<String, String> LIZIZ(JSONObject jSONObject, String... strArr) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        return LIZJ(strArr, hashMap);
    }

    public static java.util.Map LIZJ(String[] strArr, java.util.Map map) {
        HashMap hashMap = new HashMap();
        if (strArr.length == 0 || strArr.length % 2 != 0) {
            PJY pjy = PJZ.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("err keysWithDefaultValue:");
            LIZ.append(strArr);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(X1D.LIZIZ(LIZ));
            pjy.getClass();
            PJY.LIZ("NPTH_CATCH", illegalArgumentException);
            return hashMap;
        }
        for (int i = 0; i < strArr.length; i += 2) {
            String str = strArr[i];
            Object obj = map.get(str);
            if (obj == null) {
                hashMap.put(str, strArr[i + 1]);
            } else {
                hashMap.put(str, String.valueOf(obj));
            }
        }
        return hashMap;
    }

    public C64257PJt(Context context, ICommonParams iCommonParams, C64257PJt c64257PJt) {
        ICommonParams iCommonParams2;
        this.LIZ = context;
        this.LIZIZ = iCommonParams;
        if (c64257PJt == null) {
            iCommonParams2 = null;
        } else {
            iCommonParams2 = c64257PJt.LIZIZ;
        }
        this.LIZJ = iCommonParams2;
    }
}
