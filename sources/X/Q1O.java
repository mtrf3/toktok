package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1O {
    public static final Gson LIZ = new Gson();
    public static final ArrayList<Q1P> LIZIZ = new ArrayList<>();

    public static j LIZ(String str, j jVar) {
        Object value;
        if (jVar == null) {
            return null;
        }
        if ((jVar instanceof l) || (jVar instanceof p)) {
            return jVar;
        }
        if (jVar instanceof m) {
            m mVar = new m();
            java.util.Set<Map.Entry<String, j>> entrySet = ((m) jVar).entrySet();
            o.LJFF(entrySet, "conf.entrySet()");
            for (Map.Entry<String, j> entry : entrySet) {
                String key = entry.getKey();
                j value2 = entry.getValue();
                if (value2 != null && (value2 instanceof p) && (value2.LJIJ().LJLIL instanceof String)) {
                    String valueString = value2.LJJIFFI();
                    o.LJFF(valueString, "valueString");
                    if (ujb.o.LJJJLIIL(valueString, "$", false)) {
                        String substring = valueString.substring(1, valueString.length());
                        o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        FTR<?> LIZ2 = FJI.LIZ(str, substring);
                        if (LIZ2 != null && (value = LIZ2.getValue()) != null) {
                            mVar.LJJII(key, GsonProtectorUtils.toJsonTree(LIZ, value));
                        }
                    }
                }
                mVar.LJJII(key, LIZ(str, value2));
            }
            return mVar;
        }
        if (!(jVar instanceof g)) {
            return null;
        }
        g gVar = new g();
        Iterator<j> it = gVar.iterator();
        while (it.hasNext()) {
            gVar.LJJII(LIZ(str, it.next()));
        }
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a1 A[Catch: all -> 0x01f8, TryCatch #1 {all -> 0x01f8, blocks: (B:64:0x0124, B:66:0x0129, B:68:0x013f, B:70:0x0145, B:72:0x014d, B:74:0x0151, B:75:0x015e, B:77:0x0164, B:79:0x017b, B:80:0x01cf, B:82:0x01d3, B:84:0x01db, B:88:0x01e3, B:90:0x01e7, B:91:0x01f4, B:92:0x01f7, B:93:0x01ee, B:95:0x017e, B:97:0x0184, B:102:0x019d, B:104:0x01a1, B:105:0x01ae, B:107:0x01b4, B:109:0x01c2, B:111:0x01c8, B:115:0x0192, B:118:0x012f, B:120:0x0133, B:101:0x018a), top: B:63:0x0124, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.Q1P LIZIZ(java.lang.String r17, com.google.gson.j r18) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1O.LIZIZ(java.lang.String, com.google.gson.j):X.Q1P");
    }

    public static List LIZJ(String source, j jVar) {
        o.LJIIJ(source, "source");
        if (jVar == null || !(jVar instanceof g)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<j> it = jVar.LJIILLIIL().iterator();
        while (it.hasNext()) {
            j it2 = it.next();
            o.LJFF(it2, "it");
            Q1P LIZIZ2 = LIZIZ(source, it2.LJIIZILJ());
            if (LIZIZ2 != null) {
                arrayList.add(LIZIZ2);
            }
        }
        return arrayList;
    }
}
