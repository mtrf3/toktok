package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.EsQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37794EsQ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(android.net.Uri uri) {
        o.LJIIIZ(uri, "<this>");
        if (!uri.isHierarchical()) {
            String uri2 = uri.toString();
            o.LJIIIIZZ(uri2, "toString()");
            return uri2;
        }
        try {
            String builder = uri.buildUpon().clearQuery().toString();
            o.LJIIIIZZ(builder, "{\n            buildUpon(…ry().toString()\n        }");
            return builder;
        } catch (Throwable unused) {
            String uri3 = uri.toString();
            o.LJIIIIZZ(uri3, "{\n            toString()\n        }");
            return uri3;
        }
    }

    public static boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        if (!ujb.o.LJJJLIIL(str, "http://", false) && !ujb.o.LJJJLIIL(str, "https://", false)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(String str) {
        if (!UriProtector.parse(str).isRelative() && !ujb.o.LJJJLIIL(str, ".", false) && !ujb.o.LJJJLIIL(str, "/", false)) {
            return false;
        }
        return true;
    }

    public static C35661Dz7 LIZ(C64797Pbt c64797Pbt, InputStream inputStream, java.util.Map map) {
        String LIZIZ;
        String str;
        String reasonPhrase;
        Charset LIZ2;
        InputStream inputStream2 = inputStream;
        List<EJ6> list = c64797Pbt.LIZ.LIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (EJ6 ej6 : list) {
                if (linkedHashMap.get(ej6.LIZ) == null) {
                    String str2 = ej6.LIZ;
                    o.LJIIIIZZ(str2, "header.name");
                    String str3 = ej6.LIZIZ;
                    o.LJIIIIZZ(str3, "header.value");
                    linkedHashMap.put(str2, str3);
                } else {
                    String str4 = ej6.LIZ;
                    o.LJIIIIZZ(str4, "header.name");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append((String) linkedHashMap.get(ej6.LIZ));
                    LIZ3.append(" ,");
                    LIZ3.append(ej6.LIZIZ);
                    linkedHashMap.put(str4, X1D.LIZIZ(LIZ3));
                }
            }
        }
        String str5 = (String) linkedHashMap.get("Content-Type");
        if (str5 == null && (str5 = (String) linkedHashMap.get("content-type")) == null) {
            str5 = "text/html; charset=UTF-8";
        }
        C39745Fin LIZJ = C39745Fin.LIZJ(str5);
        if (LIZJ == null) {
            LIZIZ = "text/html";
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LIZJ.LIZIZ);
            LIZ4.append('/');
            LIZ4.append(LIZJ.LIZJ);
            LIZIZ = X1D.LIZIZ(LIZ4);
        }
        if (LIZJ == null || (LIZ2 = LIZJ.LIZ(null)) == null || (str = LIZ2.toString()) == null) {
            str = "utf-8";
        }
        C36910EeA c36910EeA = c64797Pbt.LIZ;
        int i = c36910EeA.LIZIZ;
        if (TextUtils.isEmpty(c36910EeA.LIZJ)) {
            reasonPhrase = "OK";
        } else {
            reasonPhrase = c64797Pbt.LIZ.LIZJ;
        }
        String str6 = (String) map.get("range");
        if (str6 != null || (str6 = (String) map.get("Range")) != null) {
            int i2 = 0;
            try {
                String substring = s.LJZI(str6).toString().substring(6);
                o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                i2 = CastIntegerProtector.parseInt((String) ListProtector.get(s.LJLJJL(substring, new String[]{"-"}, 0, 6), 0));
            } catch (Exception unused) {
            }
            if (i2 != 0 && inputStream2 != null) {
                inputStream2 = new C37795EsR(inputStream2, new C37796EsS(i2));
            }
        }
        o.LJIIIIZZ(reasonPhrase, "reasonPhrase");
        return new C35661Dz7(LIZIZ, str, i, reasonPhrase, linkedHashMap, inputStream2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(46:1|(1:3)|4|(1:298)(1:8)|9|(1:11)|12|(1:14)|15|(1:297)|17|(2:19|(32:29|30|(2:33|31)|34|35|(1:37)|38|(1:40)(2:292|(1:294)(1:295))|41|(2:42|(2:44|(1:46)(1:289))(2:290|291))|47|(1:288)|51|52|53|(3:278|279|(15:283|57|(1:59)|60|61|63|(1:158)|(3:130|131|(13:133|(1:135)(1:155)|136|(1:138)(3:152|153|154)|139|146|147|(2:149|67)|68|(2:72|(9:74|(5:78|(3:81|(2:83|84)(1:121)|79)|122|123|124)|125|86|(7:109|110|111|(1:113)|114|(1:116)|117)(1:88)|89|(4:92|93|94|(1:97))|101|(4:103|(1:105)|106|107)))|126|(1:128)|129))|66|67|68|(2:72|(0))|126|(0)|129))|55|56|57|(0)|60|61|63|(0)|(0)|66|67|68|(0)|126|(0)|129))|296|30|(1:31)|34|35|(0)|38|(0)(0)|41|(3:42|(0)(0)|289)|47|(1:49)|288|51|52|53|(0)|55|56|57|(0)|60|61|63|(0)|(0)|66|67|68|(0)|126|(0)|129|(3:(0)|(16:262|(14:264|(1:239)(1:(1:258)(1:259))|240|(2:242|(3:244|(2:249|250)|246)(3:251|(2:253|250)|246))(3:254|(2:256|250)|246)|63|(0)|(0)|66|67|68|(0)|126|(0)|129)|237|(0)(0)|240|(0)(0)|63|(0)|(0)|66|67|68|(0)|126|(0)|129)|(17:(4:188|(10:194|195|196|197|199|200|201|(0)|204|(0)(0))(3:190|191|192)|193|186)|221|222|(4:225|(3:227|228|229)(1:231)|230|223)|232|233|162|63|(0)|(0)|66|67|68|(0)|126|(0)|129))) */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02b8, code lost:
    
        if (r7.equals("PUT") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02da, code lost:
    
        r2 = com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl.LJIILIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02de, code lost:
    
        if (r2 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02ea, code lost:
    
        if (r2.LJFF(new X.C37163EiF(r42, r7, 1, r13)) != true) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02ec, code lost:
    
        r9.LJIIZILJ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02f0, code lost:
    
        if (r43 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02f4, code lost:
    
        if (r45 != X.EnumC37177EiT.RESOURCE_INTERCEPT) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02f6, code lost:
    
        r8.LIZ(-1, (android.webkit.WebView) r28.get(), "dataStr == null");
        r32 = null;
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0312, code lost:
    
        if (ujb.s.LJJJLZIJ(r22, "multipart/form-data", false) == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0318, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r7, "POST") == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x031a, code lost:
    
        r18 = new java.util.LinkedHashMap();
        r17 = new X.C64553PVd[0];
        r4 = new org.json.JSONArray(r43);
        r16 = X.C78842Uww.LJJ(0, r4.length()).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0438, code lost:
    
        r2 = (android.webkit.WebView) r28.get();
        r1 = X.X1D.LIZ();
        r1.append("ttnetRequest unexpect method: ");
        r1.append(r7);
        r8.LIZ(-2, r2, X.X1D.LIZIZ(r1));
        r32 = null;
        r4 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0459, code lost:
    
        if (r22.length() != 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x045b, code lost:
    
        r2 = new org.json.JSONObject(r43);
        X.C3C5.m7constructorimpl(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0469, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x046a, code lost:
    
        r2 = X.C141335gf.LIZ(r2);
        X.C3C5.m7constructorimpl(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x02ce, code lost:
    
        if (r7.equals("POST") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x02d6, code lost:
    
        if (r7.equals("PATCH") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0207, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x060f, code lost:
    
        if (r0 != null) goto L238;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x038d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118 A[LOOP:0: B:31:0x0112->B:33:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05db  */
    /* JADX WARN: Type inference failed for: r0v118, types: [T, X.Esm] */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v135, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v212 */
    /* JADX WARN: Type inference failed for: r1v56, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C35661Dz7 LJ(android.webkit.WebView r38, boolean r39, java.lang.String r40, android.net.Uri r41, java.util.Map r42, java.lang.String r43, boolean r44, X.EnumC37177EiT r45) {
        /*
            Method dump skipped, instructions count: 1814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37794EsQ.LJ(android.webkit.WebView, boolean, java.lang.String, android.net.Uri, java.util.Map, java.lang.String, boolean, X.EiT):X.Dz7");
    }
}
