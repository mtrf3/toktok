package X;

import Y.ARunnableS27S0200000_8;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JiX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49921JiX {
    public static long LIZIZ;
    public static C49920JiW LJ;
    public static int LJFF;
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static final java.util.Map<String, C49920JiW> LIZJ = new LinkedHashMap();
    public static final java.util.Map<String, java.util.Map<String, Long>> LIZLLL = new LinkedHashMap();

    public static void LIZ(SearchResultParam searchResultParam) {
        Long l;
        if (searchResultParam == null) {
            return;
        }
        C49920JiW c49920JiW = (C49920JiW) ((LinkedHashMap) LIZJ).get(C49567Jcp.LIZ(searchResultParam));
        if (c49920JiW != null) {
            if (c49920JiW.LIZIZ == 0 || c49920JiW.LJIJI == -1 || c49920JiW.LJJIJLIJ) {
                if (c49920JiW != null && c49920JiW.LJJIJLIJ) {
                    c49920JiW.LJJIJLIJ = false;
                    c49920JiW.LJJIJIL = (int) (System.currentTimeMillis() - c49920JiW.LIZIZ);
                }
            } else if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                LIZJ(c49920JiW, searchResultParam);
                return;
            } else {
                LIZ.post(new ARunnableS27S0200000_8(searchResultParam, c49920JiW, 76));
                return;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" return2 ： event ");
        LIZ2.append(c49920JiW);
        LIZ2.append("start ");
        Integer num = null;
        if (c49920JiW != null) {
            l = Long.valueOf(c49920JiW.LIZIZ);
        } else {
            l = null;
        }
        LIZ2.append(l);
        LIZ2.append(" event.status: ");
        if (c49920JiW != null) {
            num = Integer.valueOf(c49920JiW.LJIJI);
        }
        LIZ2.append(num);
        X1D.LIZIZ(LIZ2);
    }

    public static void LIZLLL(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                keys.remove();
            }
        }
    }

    public static C49920JiW LJ(SearchResultParam searchResultParam) {
        if (searchResultParam != null) {
            C49920JiW c49920JiW = (C49920JiW) ((LinkedHashMap) LIZJ).get(C49567Jcp.LIZ(searchResultParam));
            if (c49920JiW == null) {
                return C49567Jcp.LIZ;
            }
            return c49920JiW;
        }
        return C49567Jcp.LIZ;
    }

    public static boolean LIZIZ(SearchResultParam searchResultParam, boolean z) {
        if (z && searchResultParam != null && !TextUtils.isEmpty(searchResultParam.getKeyword())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:(13:1|2|(1:4)(1:202)|5|6|(5:8|9|(15:11|(1:13)(1:63)|14|(1:62)(1:20)|21|(1:61)(1:27)|28|(1:60)(1:34)|35|(1:59)(1:41)|42|(1:58)(1:48)|49|(1:57)(1:55)|56)|64|(6:66|67|(6:69|(1:71)|72|(1:74)|75|(1:77))|78|(6:80|(2:106|(2:111|(3:116|(1:118)(1:120)|119)(1:115))(1:110))(1:84)|85|(4:88|(3:90|91|92)(1:94)|93|86)|95|(4:97|(1:99)|(1:101)|(2:103|104)))(1:121)|105))(2:196|(3:198|(1:200)|201))|122|(1:124)|125|(1:127)|128|(1:130)|131)|(25:136|137|138|(1:140)|141|(1:194)|143|(2:145|146)(1:193)|147|(1:149)(1:192)|150|(1:152)|153|(4:156|(3:162|163|164)(3:158|159|160)|161|154)|165|166|167|168|169|(1:171)(3:180|(1:183)|182)|172|(2:175|173)|176|177|178)|195|137|138|(0)|141|(0)|143|(0)(0)|147|(0)(0)|150|(0)|153|(1:154)|165|166|167|168|169|(0)(0)|172|(1:173)|176|177|178|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0532, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0535, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0538, code lost:
    
        r20.getClass();
        r1 = ((java.util.ArrayList) r20.LJJIZ).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0549, code lost:
    
        ((java.lang.Runnable) r1.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0436 A[Catch: Exception -> 0x0534, all -> 0x0569, TryCatch #4 {Exception -> 0x0534, all -> 0x0569, blocks: (B:2:0x0000, B:4:0x000c, B:5:0x0015, B:8:0x0089, B:11:0x0091, B:13:0x0097, B:14:0x0099, B:16:0x00a2, B:18:0x00a6, B:20:0x00aa, B:21:0x00b2, B:23:0x00bb, B:25:0x00bf, B:27:0x00c3, B:28:0x00cb, B:30:0x00d2, B:32:0x00d6, B:34:0x00da, B:35:0x00e2, B:37:0x00eb, B:39:0x00ef, B:41:0x00f3, B:42:0x00fb, B:44:0x0104, B:46:0x0108, B:48:0x010c, B:49:0x0114, B:51:0x011d, B:53:0x0121, B:55:0x0125, B:56:0x012d, B:64:0x0130, B:66:0x013b, B:69:0x0158, B:71:0x0171, B:72:0x017a, B:74:0x0182, B:75:0x0186, B:77:0x018b, B:78:0x01a0, B:80:0x01ea, B:82:0x01f3, B:84:0x01fa, B:85:0x022f, B:86:0x023d, B:88:0x0243, B:91:0x024b, B:97:0x0313, B:99:0x0338, B:101:0x0347, B:104:0x0351, B:105:0x0356, B:106:0x02b2, B:108:0x02b6, B:110:0x02bd, B:111:0x02d8, B:113:0x02dd, B:115:0x02e4, B:116:0x02f3, B:118:0x0301, B:122:0x03ab, B:124:0x03b0, B:125:0x03b5, B:127:0x03ba, B:128:0x03bf, B:130:0x03c3, B:131:0x03cd, B:133:0x03ec, B:137:0x03f4, B:141:0x040b, B:143:0x0414, B:147:0x0421, B:150:0x042f, B:152:0x0436, B:153:0x0444, B:154:0x047a, B:156:0x0480, B:163:0x048c, B:159:0x0490, B:166:0x04a4, B:196:0x0381, B:198:0x0385, B:200:0x0395, B:201:0x0399, B:202:0x0077), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0480 A[Catch: Exception -> 0x0534, all -> 0x0569, TryCatch #4 {Exception -> 0x0534, all -> 0x0569, blocks: (B:2:0x0000, B:4:0x000c, B:5:0x0015, B:8:0x0089, B:11:0x0091, B:13:0x0097, B:14:0x0099, B:16:0x00a2, B:18:0x00a6, B:20:0x00aa, B:21:0x00b2, B:23:0x00bb, B:25:0x00bf, B:27:0x00c3, B:28:0x00cb, B:30:0x00d2, B:32:0x00d6, B:34:0x00da, B:35:0x00e2, B:37:0x00eb, B:39:0x00ef, B:41:0x00f3, B:42:0x00fb, B:44:0x0104, B:46:0x0108, B:48:0x010c, B:49:0x0114, B:51:0x011d, B:53:0x0121, B:55:0x0125, B:56:0x012d, B:64:0x0130, B:66:0x013b, B:69:0x0158, B:71:0x0171, B:72:0x017a, B:74:0x0182, B:75:0x0186, B:77:0x018b, B:78:0x01a0, B:80:0x01ea, B:82:0x01f3, B:84:0x01fa, B:85:0x022f, B:86:0x023d, B:88:0x0243, B:91:0x024b, B:97:0x0313, B:99:0x0338, B:101:0x0347, B:104:0x0351, B:105:0x0356, B:106:0x02b2, B:108:0x02b6, B:110:0x02bd, B:111:0x02d8, B:113:0x02dd, B:115:0x02e4, B:116:0x02f3, B:118:0x0301, B:122:0x03ab, B:124:0x03b0, B:125:0x03b5, B:127:0x03ba, B:128:0x03bf, B:130:0x03c3, B:131:0x03cd, B:133:0x03ec, B:137:0x03f4, B:141:0x040b, B:143:0x0414, B:147:0x0421, B:150:0x042f, B:152:0x0436, B:153:0x0444, B:154:0x047a, B:156:0x0480, B:163:0x048c, B:159:0x0490, B:166:0x04a4, B:196:0x0381, B:198:0x0385, B:200:0x0395, B:201:0x0399, B:202:0x0077), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04bc A[Catch: Exception -> 0x0532, all -> 0x0567, TRY_ENTER, TryCatch #0 {all -> 0x0567, blocks: (B:168:0x04b2, B:171:0x04bc, B:180:0x04c3, B:182:0x04d5, B:183:0x0504, B:185:0x0535), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0528 A[LOOP:2: B:173:0x0522->B:175:0x0528, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04c3 A[Catch: Exception -> 0x0532, all -> 0x0567, TryCatch #0 {all -> 0x0567, blocks: (B:168:0x04b2, B:171:0x04bc, B:180:0x04c3, B:182:0x04d5, B:183:0x0504, B:185:0x0535), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x057b A[LOOP:4: B:205:0x0575->B:207:0x057b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C49920JiW r20, com.ss.android.ugc.aweme.search.model.SearchResultParam r21) {
        /*
            Method dump skipped, instructions count: 1433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49921JiX.LIZJ(X.JiW, com.ss.android.ugc.aweme.search.model.SearchResultParam):void");
    }

    public static C49920JiW LJFF(int i, SearchResultParam searchParam) {
        Long l;
        o.LJIIIZ(searchParam, "searchParam");
        JVZ jvz = new JVZ();
        jvz.LIZ = System.currentTimeMillis();
        JVW.LIZ = jvz;
        String LIZ2 = C49567Jcp.LIZ(searchParam);
        C49520Jc4 c49520Jc4 = new C49520Jc4();
        c49520Jc4.LIZIZ = System.currentTimeMillis();
        C49521Jc5.LIZ.put(LIZ2, c49520Jc4);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - LIZIZ;
        LIZIZ = currentTimeMillis;
        if (j < 1000) {
            return null;
        }
        SearchResultActivity LJ2 = C50989Jzl.LJ();
        if (LJ2 != null && J1C.LIZLLL(LJ2)) {
            C49640Je0 c49640Je0 = new C49640Je0();
            C49638Jdy.LIZ = c49640Je0;
            c49640Je0.LJIIZILJ = currentTimeMillis;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("record start search time:");
            C49640Je0 c49640Je02 = C49638Jdy.LIZ;
            if (c49640Je02 != null) {
                l = Long.valueOf(c49640Je02.LJIIZILJ);
            } else {
                l = null;
            }
            LIZ3.append(l);
            LIZ3.append(" in this search ");
            X1D.LIZIZ(LIZ3);
        }
        SearchResultParam copy = searchParam.copy();
        o.LJIIIIZZ(copy, "searchParam.copy()");
        C49920JiW c49920JiW = new C49920JiW(copy);
        c49920JiW.LIZIZ = currentTimeMillis;
        c49920JiW.LIZJ = 0L;
        c49920JiW.LJJIJIIJI.clear();
        c49920JiW.LJIIL = i;
        c49920JiW.LJI = searchParam.getSearchFrom();
        c49920JiW.LJII = searchParam.getEnterMethod();
        LIZJ.put(C49567Jcp.LIZ(copy), c49920JiW);
        LJ = c49920JiW;
        if (searchParam.getKeyword() != null) {
            String keyword = searchParam.getKeyword();
            o.LJIIIIZZ(keyword, "searchParam.keyword");
            C49963JjD LIZ4 = C49966JjG.LIZ(keyword);
            LIZ4.LIZ();
            LIZ4.LIZ().clear();
            LIZ4.LIZJ = "";
            LIZ4.LIZLLL = null;
            LIZ4.LIZIZ = 1;
        }
        return c49920JiW;
    }

    public static void LJI(int i, SearchResultParam searchResultParam) {
        if (searchResultParam == null) {
            return;
        }
        java.util.Map<String, C49920JiW> map = LIZJ;
        C49920JiW c49920JiW = (C49920JiW) ((LinkedHashMap) map).get(C49567Jcp.LIZ(searchResultParam));
        if (c49920JiW == null) {
            C49920JiW c49920JiW2 = LJ;
            if (c49920JiW2 != null && c49920JiW2.LIZJ <= 0) {
                String keyword = searchResultParam.getKeyword();
                C49920JiW c49920JiW3 = LJ;
                o.LJI(c49920JiW3);
                if (o.LJ(keyword, c49920JiW3.LIZ.getKeyword())) {
                    C49920JiW c49920JiW4 = LJ;
                    o.LJI(c49920JiW4);
                    map.remove(C49567Jcp.LIZ(c49920JiW4.LIZ));
                    C49920JiW c49920JiW5 = LJ;
                    o.LJI(c49920JiW5);
                    c49920JiW5.LJIILIIL(i);
                    C49920JiW c49920JiW6 = LJ;
                    o.LJI(c49920JiW6);
                    c49920JiW6.LJIILIIL(i);
                    C49920JiW c49920JiW7 = LJ;
                    o.LJI(c49920JiW7);
                    String LIZ2 = C49567Jcp.LIZ(c49920JiW7.LIZ);
                    C49920JiW c49920JiW8 = LJ;
                    o.LJI(c49920JiW8);
                    map.put(LIZ2, c49920JiW8);
                }
            }
            C49920JiW LJFF2 = LJFF(6, searchResultParam);
            if (LJFF2 != null) {
                LJFF2.LJIILIIL(i);
            }
        } else {
            c49920JiW.LJIILIIL(i);
        }
        LJ = null;
    }
}
