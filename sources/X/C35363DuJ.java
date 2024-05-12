package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.m;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.DuJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35363DuJ {
    public static String LIZ() {
        boolean LIZJ = C53363Kwx.LIZJ();
        if (((Boolean) DWN.LIZIZ.getValue()).booleanValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("crash fixed & hit system box ");
            LIZ.append(LIZJ);
            C221018lt.LJFF("NoticeCountRequestParamUtils", X1D.LIZIZ(LIZ));
            m mVar = new m();
            if (LIZJ) {
                mVar.LJJIIJ("unread_count_flag", Integer.valueOf(((Number) C35364DuK.LIZ.getValue()).intValue()));
            }
            String jVar = mVar.toString();
            o.LJIIIIZZ(jVar, "abSettings.toString()");
            return jVar;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("online & hit system box ");
        LIZ2.append(LIZJ);
        C221018lt.LJFF("NoticeCountRequestParamUtils", X1D.LIZIZ(LIZ2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (LIZJ) {
            linkedHashMap.put("unread_count_flag", Integer.valueOf(((Number) C35364DuK.LIZ.getValue()).intValue()));
        }
        String json = GsonProtectorUtils.toJson(new Gson(), linkedHashMap);
        o.LJIIIIZZ(json, "Gson().toJson(abSettings)");
        return json;
    }
}
