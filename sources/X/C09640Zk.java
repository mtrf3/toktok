package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09640Zk {
    public static String LIZ;
    public static String LIZIZ;

    public static PKN LIZ(String str) {
        long j;
        Header LIZJ = Header.LIZJ();
        Header.addRuntimeHeader(LIZJ.LIZ);
        Header.LIZ(LIZJ);
        LIZJ.LJFF(PK0.LIZIZ().LIZLLL());
        PK0.LIZLLL().LIZ();
        LIZJ.LJIIJ();
        C64257PJt LIZIZ2 = PK0.LIZIZ();
        LIZIZ2.getClass();
        try {
            LIZIZ2.LIZIZ.getUserId();
        } catch (Throwable unused) {
        }
        try {
            C64257PJt LIZIZ3 = PK0.LIZIZ();
            LIZIZ3.getClass();
            try {
                j = LIZIZ3.LIZIZ.getUserId();
            } catch (Throwable unused2) {
                j = 0;
            }
            if (j > 0) {
                LIZJ.LIZ.put("user_id", j);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            LIZJ.LIZ.put("aid", 88888);
        } catch (Exception unused3) {
        }
        PKN pkn = new PKN();
        pkn.LJIIZILJ(LIZJ);
        pkn.LJIIJJI("is_native_crash", 1);
        pkn.LJIIJJI("data", str);
        Matcher matcher = PatternProtector.compile("lib\\w+\\.so").matcher(str);
        HashSet hashSet = new HashSet();
        while (matcher.find()) {
            hashSet.add(matcher.group());
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            NativeTools.LJIILJJIL().getClass();
            String LJIILL = NativeTools.LJIILL(str2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", str2);
                jSONObject.put("lib_uuid", NativeTools.LIZLLL(LJIILL));
                jSONArray.put(jSONObject);
            } catch (Exception unused4) {
            }
        }
        pkn.LJIIJJI("crash_lib_uuid", jSONArray);
        pkn.LJIIJJI("crash_time", Long.valueOf(System.currentTimeMillis()));
        return pkn;
    }

    public static String LIZIZ(Context context) {
        StringBuilder LIZ2 = X1D.LIZ();
        C09600Zg.LIZIZ();
        LIZ2.append(C09600Zg.LIZ(context));
        String str = File.separator;
        YE1.LIZLLL(LIZ2, str, "gmt", str, "tombstone.txt");
        return X1D.LIZIZ(LIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static List<JSONObject> LIZJ(String str) {
        StringBuilder LIZ2;
        BufferedReader bufferedReader = null;
        String str2 = 0;
        BufferedReader bufferedReader2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                BufferedReader bufferedReader3 = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String readLine = bufferedReader3.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("report GL usage start")) {
                            JSONObject jSONObject = new JSONObject();
                            StringBuffer stringBuffer = new StringBuffer();
                            jSONObject.put("name", "GL_USAGE");
                            jSONObject.put("usages", "null");
                            jSONObject.put("backtrace", "null");
                            while (true) {
                                str2 = bufferedReader3.readLine();
                                if (str2 == 0) {
                                    break;
                                }
                                ALog.i("GL Usage", str2);
                                if (str2.startsWith("report GL usage end")) {
                                    jSONObject.put("usages", stringBuffer.toString());
                                    arrayList.add(jSONObject);
                                    break;
                                }
                                stringBuffer.append(str2);
                                stringBuffer.append('\n');
                            }
                        }
                        if (readLine.startsWith("report GL unwind usage start")) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", "GL_UNWIND_USAGE");
                            jSONObject2.put("usages", "null");
                            jSONObject2.put("backtrace", "null");
                            StringBuffer stringBuffer2 = new StringBuffer();
                            int i = 0;
                            while (true) {
                                String readLine2 = bufferedReader3.readLine();
                                if (readLine2 == null) {
                                    break;
                                }
                                if (readLine2.startsWith("context")) {
                                    jSONObject2.put("usages", readLine2);
                                } else {
                                    if (readLine2.startsWith("report GL unwind usage end")) {
                                        jSONObject2.put("backtrace", stringBuffer2.toString());
                                        arrayList.add(jSONObject2);
                                        break;
                                    }
                                    str2 = str2;
                                    if (i >= 3) {
                                        int i2 = i - 3;
                                        if (i2 <= 9) {
                                            LIZ2 = X1D.LIZ();
                                            LIZ2.append(CardStruct.IStatusCode.DEFAULT);
                                            LIZ2.append(i2);
                                        } else {
                                            LIZ2 = X1D.LIZ();
                                            LIZ2.append(i2);
                                            LIZ2.append("");
                                        }
                                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("    #");
                                        LIZ3.append(LIZIZ2);
                                        LIZ3.append(" ");
                                        LIZ3.append(readLine2);
                                        stringBuffer2.append(X1D.LIZIZ(LIZ3));
                                        stringBuffer2.append('\n');
                                        str2 = LIZ3;
                                    }
                                    i++;
                                }
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader2 = bufferedReader3;
                        C16880lQ.LLLLIIL(e);
                        FPX.LIZIZ(bufferedReader2);
                        bufferedReader = bufferedReader2;
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader3;
                        FPX.LIZIZ(bufferedReader);
                        throw th;
                    }
                }
                FPX.LIZIZ(bufferedReader3);
                bufferedReader = str2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.content.Context r12, java.lang.String r13, java.util.List r14) {
        /*
            java.lang.String r5 = "\n"
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            r11 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> Lda
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> Lda
            r0.<init>(r13)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> Lda
            r1.<init>(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> Lda
        L12:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> Ld7
            if (r0 == 0) goto L26
            r4.append(r0)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> Ld7
            r4.append(r5)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> Ld7
            goto L12
        L1f:
            r0 = move-exception
            goto L23
        L21:
            r0 = move-exception
            r1 = r11
        L23:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> Ld7
        L26:
            X.FPX.LIZIZ(r1)
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.util.Iterator r10 = r14.iterator()
        L2f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Ld6
            java.lang.Object r1 = r10.next()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r0 = "name"
            java.lang.String r8 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)
            java.lang.String r0 = "usages"
            java.lang.String r6 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)
            java.lang.String r0 = "backtrace"
            java.lang.String r7 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)
            java.lang.String r9 = LIZIZ(r12)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            java.lang.String r0 = "pid: 2387, tid: 2991, name: RenderThread  >>> com.bytedance.ammt <<<\nsignal 11 (SIGSEGV), code 2 (SEGV_ACCERR), fault addr 0x75c7e7f020\n    x0  00000075c8288400  x1  00000075c40c1a30  x2  00000075c71fe6d0  x3  0000037e3212143c\n    x4  00000075c8288400  x5  0000000000000010  x6  000000766848e000  x7  000000000014f8f6\n    x8  0000000000000001  x9  0000007665ecc330  x10 00000075c80938e0  x11 0000000000000018\n    x12 0000007664e5aff0  x13 0000000000000000  x14 0000007665ecc330  x15 ffffffffffffffff\n    x16 00000075c7e7f020  x17 0000007666583f7c  x18 000000756d0a0000  x19 00000075c40c1a30\n    x20 00000075c40c1a30  x21 00000075c8288400  x22 0000000000000001  x23 0000007666fc21b8\n    x24 0000007666fc21b0  x25 00000075c40c2000  x26 0000007666fc21b8  x27 00000000000fc000\n    x28 00000075c3fc9000  x29 00000075c40c18d0\n    lr  0000007665ed3810  sp  00000075c40c18d0  pc  00000075c7e7f020  pst 0000000080000000\n\nbacktrace:\n"
            r1.<init>(r0)
            r1.append(r7)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r9)
            boolean r0 = r2.exists()     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> Ld4
            if (r0 != 0) goto L77
            java.io.File r0 = r2.getParentFile()     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> Ld4
            r0.mkdirs()     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> Ld4
            r2.createNewFile()     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> Ld4
        L77:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> Ld4
            r1.<init>(r2)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> Ld4
            byte[] r0 = r3.getBytes()     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L91
            r1.write(r0)     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L91
            r1.flush()     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L91
            goto L94
        L87:
            r0 = move-exception
            goto L8b
        L89:
            r0 = move-exception
            r1 = r11
        L8b:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L9c
            goto L94
        L91:
            r0 = move-exception
            if (r1 == 0) goto Ld5
        L94:
            r1.close()     // Catch: java.lang.Exception -> L98
            goto L9c
        L98:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L9c:
            java.io.File r3 = new java.io.File
            java.lang.String r0 = LIZIZ(r12)
            r3.<init>(r0)
            java.lang.String r0 = "GL_USAGE"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lcb
            java.lang.String r0 = "Signal 6(SIGABRT), Code -8 (SI_OOM)\n#00 pc 000c2312  /system/lib/libandroid_runtime.so\n"
            X.PKN r2 = LIZ(r0)
            java.lang.String r0 = "usage"
            r2.LIZIZ(r0, r6)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "profile"
            r2.LIZIZ(r1, r0)
            java.lang.String r0 = "true"
            r2.LJFF(r1, r0)
            X.C09630Zj.LIZIZ(r2, r3)
            goto L2f
        Lcb:
            X.PKN r0 = LIZ(r7)
            X.C09630Zj.LIZIZ(r0, r3)
            goto L2f
        Ld4:
            r0 = move-exception
        Ld5:
            throw r0
        Ld6:
            return
        Ld7:
            r0 = move-exception
            r11 = r1
            goto Ldb
        Lda:
            r0 = move-exception
        Ldb:
            X.FPX.LIZIZ(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09640Zk.LIZLLL(android.content.Context, java.lang.String, java.util.List):void");
    }
}
