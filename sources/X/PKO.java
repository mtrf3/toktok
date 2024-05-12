package X;

import Y.ARunnableS18S0000000_11;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PKO {
    public static File LIZ = null;
    public static File LIZIZ = null;
    public static boolean LIZJ = false;
    public static long LIZLLL = -1;
    public static long LJ = -1;
    public static File LJFF = null;
    public static volatile boolean LJI = false;
    public static File LJII = null;
    public static int LJIIIIZZ = 0;
    public static PKN LJIIIZ = null;
    public static long LJIIJ = -1;
    public static final ARunnableS18S0000000_11 LJIIJJI = new ARunnableS18S0000000_11(26);
    public static final String[] LJIIL = {"looper_message.txt", "main_stack.txt", "origin_json.txt", "result_body.json", "logcat.txt", "trace.txt"};

    public static void LJ(String str, List list) {
        if (new C03880Dg(2).LIZJ(10302, "com/bytedance/crash/alog/AlogUploadManager", "uploadAlog", PKB.class, new Object[]{list, str}, "java.lang.String", new C65300Pk0(false, "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "3007283589095475156")).LIZ) {
            return;
        }
        PKB.LIZLLL(str, list);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(15:124|125|127|128|129|130|(3:151|(1:157)(1:155)|156)|(3:145|146|(1:148))|135|(1:137)|138|(2:140|(1:142))|(1:144)|112|85)|(11:99|100|(1:102)(1:116)|103|104|105|106|(1:113)(1:110)|111|112|85)|70|71|(1:89)|75|76|77|78|(1:86)(1:82)|83|84|85) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d1, code lost:
    
        r29 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI() {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKO.LJI():void");
    }

    public static File LJIIIZ() {
        if (LJII == null) {
            File LLIIJLIL = C16880lQ.LLIIJLIL(PK0.LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("npth/has_anr_signal_");
            LIZ2.append(C64264PKa.LIZJ(PK0.LIZ).replaceAll(":", "_"));
            LJII = new File(LLIIJLIL, X1D.LIZIZ(LIZ2));
        }
        return LJII;
    }

    public static PKN LJIIJJI() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        PKN pkn = new PKN(jSONObject);
        pkn.LJIIJJI("is_anr", 1);
        pkn.LJIIJJI("has_dump", "true");
        pkn.LJIIJJI("jiffy", Long.valueOf(PLY.LIZ()));
        C64254PJq.LIZ(jSONObject);
        pkn.LJFF("sdk_version", "3.1.7-rc.51.oversea");
        pkn.LJFF("is_64_devices", String.valueOf(Header.LJIIIIZZ()));
        pkn.LJFF("is_64_runtime", String.valueOf(NativeTools.LJIILJJIL().LJJIIZ()));
        pkn.LJFF("is_x86_devices", String.valueOf(Header.LJIIIZ()));
        if (PKM.LIZIZ()) {
            str = "true";
        } else {
            str = "false";
        }
        pkn.LJFF("is_root", str);
        try {
            str2 = System.getProperty("os.version");
        } catch (Throwable unused) {
            str2 = null;
        }
        pkn.LJFF("kernel_version", str2);
        pkn.LJFF("is_hm_os", String.valueOf(PC9.LIZIZ()));
        pkn.LJFF("has_dump", "true");
        return pkn;
    }

    public static void LIZLLL() {
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C78596Usy.LJJIIJ(PK0.LIZ));
            LIZ2.append("/npth");
            new File(X1D.LIZIZ(LIZ2), "anr_mindump").listFiles(new PLC());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:7|18|12|(1:14)|15|(2:16|17)|18|19|20|21|(2:23|(1:25)(1:26))|27|28|29|(19:31|32|(3:34|(1:36)(1:38)|37)|39|40|(2:42|43)(1:120)|44|(1:46)|47|48|(1:50)(1:118)|51|(1:117)|53|(1:55)(1:116)|56|57|(8:58|59|(1:61)|62|(1:64)|65|(1:67)|68)|69)|70|(1:72)|73|(1:75)|76|(1:78)|79|(2:80|81)|82|(1:86)|87|88|89|(1:91)|93|(2:94|95)|(2:96|97)|(3:98|99|101)) */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x040c A[Catch: all -> 0x0414, TRY_LEAVE, TryCatch #3 {all -> 0x0414, blocks: (B:89:0x0408, B:91:0x040c), top: B:88:0x0408 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII() {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKO.LJII():void");
    }

    public static boolean LIZJ(JSONObject jSONObject) {
        boolean z;
        String str = "";
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("data"));
            str = jSONObject2.optString("mainStackFromTrace");
            z = !jSONObject2.optBoolean("invalid", false);
        } catch (JSONException unused) {
            z = false;
        }
        if (TextUtils.isEmpty(str) || str.contains("at InvalidStack.NoStackAvailable(Invalid.java:1).\n")) {
            return false;
        }
        return z;
    }

    public static File LJIIIIZZ(long j) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C78596Usy.LJJIIJ(PK0.LIZ));
        LIZ2.append("/npth");
        File[] listFiles = new File(X1D.LIZIZ(LIZ2), "anr_mindump").listFiles(new PLJ(j));
        if (listFiles != null && listFiles.length > 0) {
            return listFiles[0];
        }
        return null;
    }

    public static void LJIILLIIL(PKN pkn) {
        float f;
        float parseFloat;
        JSONObject jSONObject = pkn.LIZ;
        JSONArray optJSONArray = jSONObject.optJSONArray("logcat");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return;
        }
        int i = 1;
        int length = optJSONArray.length() - 1;
        float f2 = 0.0f;
        long j = 0;
        while (length > 0) {
            try {
                String string = JSONArrayProtectorUtils.getString(optJSONArray, length);
                if (!TextUtils.isEmpty(string) && string.contains("GC freed")) {
                    Matcher matcher = PatternProtector.compile("(\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}.\\d{3})\\s+(\\d+)\\s+(\\d+) ([IWDE])\\s+([\\s\\S]*):([\\s\\S]*)").matcher(string);
                    if (matcher.find()) {
                        String group = matcher.group(i);
                        matcher.group(2);
                        matcher.group(3);
                        matcher.group(4);
                        matcher.group(5);
                        String group2 = matcher.group(6);
                        Date date = new Date(jSONObject.optLong("crash_time"));
                        String LLLZ = C16880lQ.LLLZ("%tY", new Object[]{date});
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(LLLZ);
                        LIZ2.append("-");
                        LIZ2.append(group);
                        long time = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(X1D.LIZIZ(LIZ2)).getTime() - date.getTime()) / 1000;
                        if (group2.contains(" total ") && Math.abs(time) <= 30 && time < 0) {
                            j++;
                            String[] split = group2.split(" total ");
                            if (split.length == 2) {
                                try {
                                    String str = split[1];
                                    if (str.contains("ms")) {
                                        f2 += CastFloatProtector.parseFloat(str.split("ms")[0]);
                                    } else {
                                        if (str.contains("us")) {
                                            parseFloat = CastFloatProtector.parseFloat(str.split("us")[0]) / 1000000.0f;
                                        } else if (str.contains("s")) {
                                            parseFloat = CastFloatProtector.parseFloat(str.split("s")[0]) * 1000.0f;
                                        }
                                        f2 += parseFloat;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    new RuntimeException(e);
                                    C78685UuP.LJJ();
                                    length--;
                                    i = 1;
                                }
                            }
                        } else if (Math.abs(time) > 30 && time < 0) {
                            break;
                        }
                    } else {
                        C78685UuP.LJIJJLI();
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
            length--;
            i = 1;
        }
        if (j > 0) {
            f = f2 / ((float) j);
        } else {
            f = 0.0f;
        }
        pkn.LIZLLL(f2, "gc_time");
        pkn.LJ(j, "gc_count");
        pkn.LIZLLL(f, "gc_time_avg");
    }

    public static void LJIJ(PKN pkn) {
        JSONObject jSONObject = pkn.LIZ;
        JSONObject optJSONObject = jSONObject.optJSONObject("app_memory_info");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("memory_info");
        if (optJSONObject != null) {
            long optLong = optJSONObject.optLong("max_memory");
            long optLong2 = optJSONObject.optLong("free_memory");
            long optLong3 = optJSONObject.optLong("total_memory");
            if (optLong > 0) {
                pkn.LIZLLL((float) (((optLong3 - optLong2) * 100) / optLong), "java_heap_usage");
            }
        }
        if (optJSONObject2 != null) {
            pkn.LJ(optJSONObject2.optLong("totalPss") / 1048576, "total_pss");
        }
    }

    public static void LIZIZ(PKN pkn, long j) {
        long j2 = PKP.LJIILIIL;
        JSONObject jSONObject = pkn.LIZ;
        JSONObject optJSONObject = jSONObject.optJSONObject("current_message");
        if (optJSONObject == null) {
            PKN.LJIILIIL("no_cmsg", "filters", "anr_cmsg_wall", jSONObject);
            return;
        }
        if (j2 <= 0) {
            j2 = j;
        }
        if (j <= 0) {
            PKN.LJIILIIL("no_crash_time", "filters", "anr_cmsg_wall", jSONObject);
            return;
        }
        long j3 = j - j2;
        long optLong = optJSONObject.optLong("currentMessageCost") - j3;
        if (optLong >= 60000) {
            PKN.LJIILIIL(">=60s", "filters", "anr_cmsg_wall", jSONObject);
        } else if (optLong >= 10000) {
            PKN.LJIILIIL(">=10s", "filters", "anr_cmsg_wall", jSONObject);
        } else if (optLong >= 5000) {
            PKN.LJIILIIL(">=5s", "filters", "anr_cmsg_wall", jSONObject);
        } else if (optLong > 0) {
            PKN.LJIILIIL(">0", "filters", "anr_cmsg_wall", jSONObject);
        } else {
            PKN.LJIILIIL("<=0", "filters", "anr_cmsg_wall", jSONObject);
        }
        pkn.LIZ("anr_to_dump_cost", String.valueOf(j3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        if (r4.equals(r1) == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIZILJ(X.PKN r14, org.json.JSONObject r15) {
        /*
            r10 = r14
            org.json.JSONObject r2 = r10.LIZ
            boolean r0 = LIZJ(r2)
            java.lang.String r4 = "mainStackFromTrace"
            java.lang.String r3 = ""
            if (r0 == 0) goto L1d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1d
            java.lang.String r0 = "data"
            java.lang.String r0 = r2.optString(r0)     // Catch: org.json.JSONException -> L1d
            r1.<init>(r0)     // Catch: org.json.JSONException -> L1d
            java.lang.String r2 = r1.optString(r4, r3)     // Catch: org.json.JSONException -> L1d
            goto L1e
        L1d:
            r2 = r3
        L1e:
            r0 = r15
            if (r0 == 0) goto Lb5
            java.lang.String r12 = r0.optString(r4, r3)
        L25:
            r15 = 1
            if (r2 == r3) goto L44
            if (r12 == r3) goto L44
        L2b:
            r9 = 0
            if (r12 != r3) goto L52
            if (r2 != r3) goto L52
        L30:
            r0 = 1
        L31:
            if (r0 != 0) goto L44
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = X.PKP.LJIILLIIL
            java.lang.String r11 = X.JBR.LJFF(r1, r0, r2, r1)
            java.lang.String r13 = "JavaStack"
            r14 = 0
            LJIJI(r10, r11, r12, r13, r14, r15)
            r15 = 0
        L44:
            if (r12 == r3) goto Lb8
            java.lang.String r2 = ""
            java.lang.String r3 = "NativeStack"
            r4 = 1
            r0 = r10
            r1 = r12
            r5 = r15
            LJIJI(r0, r1, r2, r3, r4, r5)
            return r12
        L52:
            java.lang.String r0 = "\n"
            r8 = 0
            if (r12 == r3) goto Lb0
            java.lang.String[] r4 = r12.split(r0)
        L5b:
            if (r2 == r3) goto L61
            java.lang.String[] r8 = r2.split(r0)
        L61:
            if (r8 == 0) goto Lb2
            if (r4 == 0) goto Lb2
            r1 = 0
        L66:
            int r0 = r4.length
            java.lang.String r6 = "\\("
            java.lang.String r7 = "("
            java.lang.String r5 = "  at "
            if (r1 >= r0) goto Lae
            r0 = r4[r1]
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto Lab
            r4 = r4[r1]
            boolean r0 = r4.contains(r7)
            if (r0 == 0) goto L85
            java.lang.String[] r0 = r4.split(r6)
            r4 = r0[r9]
        L85:
            r1 = 0
        L86:
            int r0 = r8.length
            if (r1 >= r0) goto La9
            r0 = r8[r1]
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto La6
            r1 = r8[r1]
            boolean r0 = r1.contains(r7)
            if (r0 == 0) goto L9f
            java.lang.String[] r0 = r1.split(r6)
            r1 = r0[r9]
        L9f:
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto Lb2
            goto L30
        La6:
            int r1 = r1 + 1
            goto L86
        La9:
            r1 = r3
            goto L9f
        Lab:
            int r1 = r1 + 1
            goto L66
        Lae:
            r4 = r3
            goto L85
        Lb0:
            r4 = r8
            goto L5b
        Lb2:
            r0 = 0
            goto L31
        Lb5:
            r12 = r3
            goto L25
        Lb8:
            java.lang.String r1 = "anr_replace_mainstack"
            java.lang.String r0 = "OnlyJavaStack"
            r10.LJFF(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKO.LJIIZILJ(X.PKN, org.json.JSONObject):java.lang.String");
    }

    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        List<ICrashCallback> list = PKZ.LJFF.LIZ.getList(CrashType.ANR);
        if (list.size() > 0) {
            Iterator<ICrashCallback> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onCrash(CrashType.ANR, str, null);
                } catch (Throwable th) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th);
                }
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) PKZ.LJFF.LJ;
        if (copyOnWriteArrayList.size() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!PJC.LJII(jSONObject)) {
                    jSONObject2.put("all_thread_stacks", jSONObject);
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject2.put("data", str2);
                }
                jSONObject2.toString();
            } catch (Throwable unused) {
            }
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC64309PLt) it2.next()).LIZ();
                } catch (Throwable th2) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th2);
                }
            }
        }
    }

    public static void LJFF(long j, long j2, boolean z) {
        boolean z2;
        boolean z3;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        LJIIJ = currentTimeMillis;
        Context context = PK0.LIZ;
        JSONObject jSONObject = new JSONObject();
        PJC.LJIIJ(jSONObject, "current_message", PIX.LIZ());
        PJC.LJIIJ(jSONObject, "history_message", PIX.LIZJ());
        PJC.LJIIJ(jSONObject, "pending_messages", PIX.LIZLLL(SystemClock.uptimeMillis()));
        long currentTimeMillis2 = System.currentTimeMillis();
        String LJ2 = PKW.LJ(C16880lQ.LLJJJJ().getThread().getStackTrace());
        long currentTimeMillis3 = System.currentTimeMillis();
        String LJJIIJ = C78596Usy.LJJIIJ(PK0.LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("npth/killHistory/proc/");
        LIZ2.append(Process.myPid());
        LIZ2.append("/trace_");
        LIZ2.append(currentTimeMillis);
        LIZ2.append("/");
        File file = new File(LJJIIJ, X1D.LIZIZ(LIZ2));
        LIZ = file;
        file.mkdirs();
        long currentTimeMillis4 = System.currentTimeMillis();
        PK8.LJIILLIIL(new File(LIZ, "looper_message.txt"), jSONObject);
        long currentTimeMillis5 = System.currentTimeMillis();
        File file2 = new File(LIZ, "main_stack.txt");
        try {
            file2.createNewFile();
        } catch (IOException unused) {
        }
        try {
            PK8.LJIILJJIL(file2, LJ2, false);
        } catch (Throwable unused2) {
        }
        long currentTimeMillis6 = System.currentTimeMillis();
        File file3 = new File(LIZ, "trace.txt");
        LIZIZ = file3;
        C64263PJz.LIZ("anr_trace", file3.getAbsolutePath());
        if (!Header.LJIIIZ()) {
            NativeTools.LJIILJJIL().LIZIZ(file3.getAbsolutePath(), false);
        }
        long currentTimeMillis7 = System.currentTimeMillis();
        C64263PJz.LIZ("after_trace", file3.getAbsolutePath());
        C1XY.LIZJ(LIZ);
        long currentTimeMillis8 = System.currentTimeMillis();
        try {
            PKN LJIIJJI2 = LJIIJJI();
            PJC.LIZIZ(LJIIJJI2.LIZ, jSONObject);
            C64264PKa.LJ(context, LJIIJJI2.LIZ);
            LJIIJJI2.LJIIJJI("is_background", Boolean.valueOf(PKP.LIZIZ()));
            LJIIJJI2.LIZIZ("npth_trace_cost", String.valueOf(currentTimeMillis7 - currentTimeMillis));
            JSONObject LIZIZ2 = C64278PKo.LIZIZ(LJ2);
            JSONObject jSONObject2 = null;
            LJIIL(LIZIZ2, null, true);
            if (file3.length() < 500) {
                jSONObject2 = PKW.LIZIZ(null);
            }
            LJIIJJI2.LJIIJJI("all_thread_stacks", jSONObject2);
            LJIIJJI2.LJIIJJI("crash_time", Long.valueOf(currentTimeMillis));
            if (!z) {
                LJIIJJI2.LIZ("anr_info_time", C77123UOp.LJJII().format(new Date(j2)));
                LJIIJJI2.LIZ("anrinfo_to_begin_dump_cost", String.valueOf(currentTimeMillis - j2));
            } else {
                LJIIJJI2.LIZ("anr_sig_time", C77123UOp.LJJII().format(new Date(j)));
                LJIIJJI2.LIZ("sig_to_begin_dump_cost", String.valueOf(currentTimeMillis - j));
            }
            LJIIJJI2.LIZ("crash_time", C77123UOp.LJJII().format(new Date(currentTimeMillis)));
            LJIIJJI2.LIZ("dump_loop_msg_cost", String.valueOf(currentTimeMillis2 - currentTimeMillis));
            LJIIJJI2.LIZ("dump_main_stack_cost", String.valueOf(currentTimeMillis3 - currentTimeMillis2));
            LJIIJJI2.LIZ("make_trace_dir_cost", String.valueOf(currentTimeMillis4 - currentTimeMillis3));
            LJIIJJI2.LIZ("write_loop_msg_cost", String.valueOf(currentTimeMillis5 - currentTimeMillis4));
            LJIIJJI2.LIZ("write_main_stack_cost", String.valueOf(currentTimeMillis6 - currentTimeMillis5));
            LJIIJJI2.LIZ("dump_trace_cost", String.valueOf(currentTimeMillis7 - currentTimeMillis6));
            LJIIJJI2.LIZ("dump_native_files_cost", String.valueOf(currentTimeMillis8 - currentTimeMillis7));
            LJIIJJI2.LJIIJJI("data", LIZIZ2.toString());
            C64268PKe LIZLLL2 = C64268PKe.LIZLLL();
            CrashType crashType = CrashType.ANR;
            PKN LIZ3 = LIZLLL2.LIZ(crashType, LJIIJJI2);
            LIZ3.LJIIJJI("logcat", C78897Uxp.LJIJJLI(LIZ));
            long j3 = LJ;
            if (j3 <= 0) {
                LIZ3.LIZIZ("last_anr_interval", LiveGiftNewGifterBadgeSetting.DEFAULT);
            } else {
                LIZ3.LIZIZ("last_anr_interval", String.valueOf(currentTimeMillis - j3));
            }
            LIZ3.LJIIJJI("alive_pids", PKQ.LIZLLL());
            LIZ3.LJIIJJI("crash_uuid", PK0.LJFF(currentTimeMillis, crashType, false, false));
            JSONObject optJSONObject = LIZ3.LIZ.optJSONObject("filters");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                LIZ3.LJIIJJI("filters", optJSONObject);
            }
            try {
                optJSONObject.put("crash_length", PKP.LJFF(currentTimeMillis));
                optJSONObject.put("disable_looper_monitor", String.valueOf(PJA.LIZIZ()));
                optJSONObject.put("memory_leak", String.valueOf(PKN.LJIIJ()));
                if (new PLM(C78596Usy.LJJ(PK0.LIZJ())).LIZ() > 960) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                optJSONObject.put("fd_leak", String.valueOf(z2));
                if (new PLP(new File(C78596Usy.LJIJI(PK0.LIZ, PK0.LIZJ()), "threads.txt")).LIZ() > 350) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                optJSONObject.put("threads_leak", String.valueOf(z3));
                optJSONObject.put("is_64_runtime", String.valueOf(NativeTools.LJIILJJIL().LJJIIZ()));
                if (PKZ.LIZJ()) {
                    str = "true";
                } else {
                    str = "false";
                }
                optJSONObject.put("crash_after_crash", str);
                optJSONObject.put("from_file", String.valueOf(C64278PKo.LIZJ));
                optJSONObject.put("last_resume_activity", String.valueOf(C64269PKf.LIZLLL().LJIIJ));
                optJSONObject.put("start_uuid", PK0.LIZJ());
                optJSONObject.put("has_signal", String.valueOf(z));
            } catch (Throwable unused3) {
            }
            LJIIIZ = LIZ3;
            PK8.LJIILLIIL(new File(LIZ, "origin_json.txt"), LIZ3.LIZ);
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LJIIL(org.json.JSONObject r5, java.lang.String r6, boolean r7) {
        /*
            java.lang.String r2 = "at InvalidStack.NoStackAvailable(Invalid.java:1).\n"
            java.lang.String r1 = "mainStackFromTrace"
            r3 = 1
            r4 = 0
            if (r5 != 0) goto L25
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r0 = "thread_number"
            r5.put(r0, r3)     // Catch: org.json.JSONException -> L1e
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L1e
            if (r0 == 0) goto L1c
        L18:
            r5.put(r1, r2)     // Catch: org.json.JSONException -> L1e
            goto L1e
        L1c:
            r2 = r6
            goto L18
        L1e:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L42
            goto L3e
        L25:
            java.lang.String r0 = r5.optString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L42
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L40
        L35:
            X.PJC.LJIIJ(r5, r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L42
        L3e:
            r2 = 1
            goto L43
        L40:
            r2 = r6
            goto L35
        L42:
            r2 = 0
        L43:
            java.lang.String r1 = "pid"
            int r0 = android.os.Process.myPid()     // Catch: org.json.JSONException -> L6f
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L6f
            java.lang.String r1 = "package"
            android.content.Context r0 = X.PK0.LIZ     // Catch: org.json.JSONException -> L6f
            java.lang.String r0 = r0.getPackageName()     // Catch: org.json.JSONException -> L6f
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L6f
            java.lang.String r0 = "is_remote_process"
            r5.put(r0, r4)     // Catch: org.json.JSONException -> L6f
            java.lang.String r1 = "is_new_stack"
            r0 = 10
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L6f
            if (r7 != 0) goto L6a
            java.lang.String r0 = "not_current"
            r5.put(r0, r3)     // Catch: org.json.JSONException -> L6f
        L6a:
            java.lang.String r0 = "invalid"
            r5.put(r0, r2)     // Catch: org.json.JSONException -> L6f
        L6f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKO.LJIIL(org.json.JSONObject, java.lang.String, boolean):org.json.JSONObject");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:7|(2:9|23)|46|(2:47|48)|(4:(13:50|51|52|53|55|56|57|58|60|61|62|63|65)|62|63|65)|77|51|52|53|55|56|57|58|60|61) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:7|(2:9|23)|46|47|48|(13:50|51|52|53|55|56|57|58|60|61|62|63|65)|77|51|52|53|55|56|57|58|60|61|62|63|65) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0095, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0096, code lost:
    
        r1 = r6;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0074, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(java.io.File r16, java.lang.String r17, long r18, boolean r20) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKO.LJIIJ(java.io.File, java.lang.String, long, boolean):void");
    }

    public static boolean LJIILL(String str, JSONArray jSONArray, JSONObject jSONObject, PKN pkn) {
        PKY pky;
        boolean z;
        boolean z2 = false;
        try {
            pky = new PKY();
            pky.LIZ.LJIILL = str;
            z = !LIZJ(jSONObject);
        } catch (Throwable unused) {
        }
        if (jSONArray != null) {
            try {
            } catch (Throwable unused2) {
                z2 = z;
            }
            if (!PJC.LJI(jSONArray)) {
                Pair<JSONObject, JSONObject> LJIIJ2 = PKP.LJIIJ(jSONArray, pky, true);
                JSONObject jSONObject2 = (JSONObject) LJIIJ2.first;
                JSONObject jSONObject3 = (JSONObject) LJIIJ2.second;
                String LJIIZILJ = LJIIZILJ(pkn, jSONObject2);
                if (!z || LJIIZILJ == "") {
                    z2 = z;
                }
                if (jSONObject3 != null) {
                    PJC.LJIIJ(jSONObject, "all_thread_stacks", jSONObject3);
                }
                return z2;
            }
        }
        pkn.LJFF("anr_replace_mainstack", "OnlyJavaStack");
        return z;
    }

    public static boolean LJIJJ(JSONObject jSONObject, File file, File file2, PK7 pk7, long j) {
        String LJFF2 = C63986P9i.LJFF(C63986P9i.LJI(), jSONObject.optJSONObject("header"));
        boolean LJ2 = PJA.LJ();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("filters");
            if (optJSONObject != null) {
                optJSONObject.put("enable_simplify_request", String.valueOf(LJ2));
            }
        } catch (Throwable unused) {
        }
        if (!LJ2) {
            if (pk7 != null) {
                return C63986P9i.LJIIJ(CrashType.ANR.getName(), LJFF2, jSONObject.toString(), file, new PK7(file2, true), pk7, new PK7(PJ7.LIZIZ(), false), C64263PJz.LJ(j), PKQ.LJ(jSONObject.optJSONArray("alive_pids"))).LIZ();
            }
            return C63986P9i.LJIIJ(CrashType.ANR.getName(), LJFF2, jSONObject.toString(), file, new PK7(file2, true), new PK7(PJ7.LIZIZ(), false), C64263PJz.LJ(j), PKQ.LJ(jSONObject.optJSONArray("alive_pids"))).LIZ();
        }
        ArrayList arrayList = new ArrayList();
        try {
            File[] listFiles = file2.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    String name = file3.getName();
                    String[] strArr = LJIIL;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (strArr[i].equals(name)) {
                                break;
                            }
                            i++;
                        } else {
                            arrayList.add(file3);
                            break;
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        ArrayList arrayList2 = new ArrayList();
        if (pk7 != null) {
            arrayList2.add(pk7);
        }
        if (arrayList.size() > 0) {
            arrayList2.add(new PK7((File[]) arrayList.toArray(new File[arrayList.size()]), true));
        }
        PK7 LJ3 = C64263PJz.LJ(j);
        if (LJ3 != null) {
            arrayList2.add(LJ3);
        }
        PK7 LJ4 = PKQ.LJ(jSONObject.optJSONArray("alive_pids"));
        if (LJ4 != null) {
            arrayList2.add(LJ4);
        }
        if (arrayList2.size() > 0) {
            return C63986P9i.LJIIJ(CrashType.ANR.getName(), LJFF2, jSONObject.toString(), file, (PK7[]) arrayList2.toArray(new PK7[arrayList2.size()])).LIZ();
        }
        return C63986P9i.LJIIJ(CrashType.ANR.getName(), LJFF2, jSONObject.toString(), file, null).LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044 A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #0 {Exception -> 0x0049, blocks: (B:18:0x0017, B:8:0x0033, B:10:0x0044), top: B:17:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0017 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(X.PKN r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            java.lang.String r4 = "data"
            r1 = 0
            org.json.JSONObject r3 = r5.LIZ     // Catch: org.json.JSONException -> Lf
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L10
            java.lang.String r0 = r3.optString(r4)     // Catch: org.json.JSONException -> L10
            r2.<init>(r0)     // Catch: org.json.JSONException -> L10
            goto L15
        Lf:
            r3 = r1
        L10:
            r0 = 0
            org.json.JSONObject r2 = LJIIL(r1, r1, r0)
        L15:
            if (r9 == 0) goto L33
            java.lang.String r0 = "mainStackFromTrace"
            r2.put(r0, r6)     // Catch: java.lang.Exception -> L49
            java.lang.String r1 = "crash_lib_uuid"
            com.bytedance.crash.util.NativeTools r0 = com.bytedance.crash.util.NativeTools.LJIILJJIL()     // Catch: java.lang.Exception -> L49
            r0.getClass()     // Catch: java.lang.Exception -> L49
            org.json.JSONArray r0 = com.bytedance.crash.util.NativeTools.LJJIFFI(r6)     // Catch: java.lang.Exception -> L49
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L49
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L49
            r3.put(r4, r0)     // Catch: java.lang.Exception -> L49
        L33:
            java.lang.String r1 = "main_stack_2nd"
            java.lang.String r0 = "\n"
            java.lang.String[] r0 = r7.split(r0)     // Catch: java.lang.Exception -> L49
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Exception -> L49
            r5.LIZJ(r1, r0)     // Catch: java.lang.Exception -> L49
            if (r10 == 0) goto L49
            java.lang.String r0 = "anr_replace_mainstack"
            r5.LJFF(r0, r8)     // Catch: java.lang.Exception -> L49
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKO.LJIJI(X.PKN, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public static void LJIILJJIL(File file, File file2, String str, boolean z, long j, long j2, long j3, JSONObject jSONObject, String str2, JSONArray jSONArray) {
        String str3;
        String str4;
        String str5;
        JSONObject optJSONObject;
        String str6 = str;
        String str7 = str2;
        long currentTimeMillis = System.currentTimeMillis();
        C64263PJz.LIZ("pack_upload_anr", CardStruct.IStatusCode.DEFAULT);
        PKN pkn = new PKN(jSONObject);
        pkn.LJIIJJI("crash_time", Long.valueOf(j));
        if (j2 != -1) {
            pkn.LJIIJJI("app_start_time", Long.valueOf(j2));
        }
        pkn.LJIIJJI("anr_time", Long.valueOf(j3));
        pkn.LJIIJJI("is_current_process", Boolean.TRUE);
        if (!TextUtils.isEmpty(str6)) {
            pkn.LJIIJJI("process_name", str6);
        } else {
            str6 = jSONObject.optString("process_name");
        }
        pkn.LIZ("crash_time", C77123UOp.LJJII().format(new Date(j)));
        pkn.LIZ("anr_info_time", C77123UOp.LJJII().format(new Date(j3)));
        pkn.LIZ("anr_upload_time", C77123UOp.LJJII().format(new Date(currentTimeMillis)));
        if (file2 != null && new File(file2, "silent_anr").exists()) {
            pkn.LJFF("no_dump_anr_info", "true");
        }
        PKY pky = new PKY();
        PK0.LIZ.getPackageName();
        pky.LIZ.LJIILL = str6;
        boolean z2 = !LIZJ(jSONObject);
        if (jSONArray != null && !PJC.LJI(jSONArray)) {
            Pair<JSONObject, JSONObject> LJIIJ2 = PKP.LJIIJ(jSONArray, pky, true);
            JSONObject jSONObject2 = (JSONObject) LJIIJ2.first;
            Object obj = LJIIJ2.second;
            String LJIIZILJ = LJIIZILJ(pkn, jSONObject2);
            if (z2 && LJIIZILJ != "") {
                z2 = false;
            }
            if (obj != null) {
                PJC.LJIIJ(jSONObject, "all_thread_stacks", obj);
            }
        } else {
            pkn.LJFF("anr_replace_mainstack", "OnlyJavaStack");
        }
        LJIILLIIL(pkn);
        if (TextUtils.isEmpty(str7) && jSONObject.has("enable_silent_anr") && jSONObject.optBoolean("enable_silent_anr")) {
            str7 = "silent anr no anr info";
        }
        if (TextUtils.isEmpty(str7)) {
            str3 = "invalid";
        } else {
            str3 = str7;
        }
        PJC.LJIIJ(jSONObject, "anr_info", str3);
        if (!TextUtils.isEmpty(str7) && !str7.equals("silent anr no anr info")) {
            try {
                PJC.LJIIJ(jSONObject, "anr_info", PKP.LIZLLL(str7, pky));
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
            }
        } else {
            pky.LJI.LIZIZ("anr_reason", "silent anr");
        }
        if (PKP.LJIILIIL > 0) {
            pkn.LIZ("anr_time_from_info", C77123UOp.LJJII().format(new Date(PKP.LJIILIIL)));
            long j4 = LIZLLL;
            long j5 = PKP.LJIILIIL;
            if (j4 > j5) {
                pkn.LIZ("anr_to_sig_cost", String.valueOf(LIZLLL - j5));
            }
        }
        LIZIZ(pkn, j);
        LJIJ(pkn);
        if (TextUtils.isEmpty(str7) || z || z2) {
            PKN.LJIILIIL(String.valueOf(jSONObject.optJSONObject("header").opt("aid")), "filters", "aid", jSONObject);
            PJC.LJIIJ(jSONObject.optJSONObject("header"), "aid", 2010);
        }
        pkn.LJFF("is_current_process", String.valueOf(true));
        pkn.LJFF("crash_after_crash", String.valueOf(z));
        String str8 = pky.LIZ.LJIILLIIL;
        if (str8 == null) {
            str8 = "";
        }
        PKN.LJIILIIL(str8, "features_str", "top_cpu_process_name", pkn.LIZ);
        PJC.LJIIJ(jSONObject, "anr_atribute", pky.LJ());
        pky.LIZLLL(jSONObject.optJSONObject("filters"));
        pky.LIZ(jSONObject);
        pkn.LJ((j - PK0.LIZJ) / 1000, "use_time");
        pkn.LJ(PKP.LJIIL, "dstate_count");
        pkn.LJ(PKP.LJIIJJI, "thread_all_count");
        JSONArray optJSONArray = jSONObject.optJSONArray("history_message");
        if (optJSONArray != null) {
            long[] LJI2 = PKP.LJI(optJSONArray);
            pkn.LJ(LJI2[0], "history_message_cpu_avg");
            pkn.LJ(LJI2[1], "history_message_wall_avg");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("features_num");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("features_str");
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
            pkn.LJIIJJI("features_num", optJSONObject2);
        }
        if (optJSONObject3 == null) {
            optJSONObject3 = new JSONObject();
            pkn.LJIIJJI("features_str", optJSONObject3);
        }
        pky.LIZIZ(optJSONObject2);
        pky.LIZJ(optJSONObject3);
        PKB.LIZJ().LIZIZ();
        List<String> LIZ2 = PKB.LIZJ().LIZ(j, str6);
        pkn.LIZJ("alogFiles", LIZ2);
        try {
            Pair<Long, Long> LIZLLL2 = C64265PKb.LIZLLL(new File(file2, "os_memory.txt"), null);
            if (LIZLLL2 != null) {
                C64265PKb.LIZ(jSONObject.optJSONObject("data"), ((Long) LIZLLL2.first).longValue(), ((Long) LIZLLL2.second).longValue());
            }
        } catch (Throwable unused) {
        }
        File file3 = new File(file2, "result_body.json");
        PK8.LJIILLIIL(file3, jSONObject);
        if (!PJA.LJFF()) {
            PK8.LIZJ(new File(file2, "os_memory.txt"));
        }
        File file4 = LJFF;
        if (file4 != null) {
            PK8.LIZJ(file4);
            str4 = null;
            LJFF = null;
            LJIIIZ = null;
            LIZIZ = null;
        } else {
            str4 = null;
        }
        try {
            if (!jSONObject.has("dump_tags")) {
                PK0.LJIIIZ.getImportTags(pkn.LJII().optJSONObject("filters"), JSONObjectProtectorUtils.getLong(jSONObject, "app_start_time"), str6);
            }
        } catch (Exception unused2) {
        }
        try {
            file3 = file;
            JSONObject optJSONObject4 = pkn.LIZ.optJSONObject("activity_trace");
            if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("last_resume_activity")) != null) {
                str4 = optJSONObject.optString("name");
            }
            UC0.LJJJJ(file2, CrashType.ANR, j, str4, TextUtils.isEmpty(str7));
            new File(file3, "has_report_service").createNewFile();
        } catch (Throwable unused3) {
        }
        PK0.LJIIIZ.addPluginVersion(jSONObject);
        C78857UxB.LJIL(jSONObject, file2);
        File LJIIIIZZ2 = LJIIIIZZ(j);
        if (LJIIIIZZ2 != null) {
            try {
                JSONObject optJSONObject5 = jSONObject.optJSONObject("filters");
                if (optJSONObject5 != null) {
                    optJSONObject5.put("has_minidump", true);
                }
            } catch (Throwable unused4) {
            }
        }
        if (LJIJJ(jSONObject, LJIIIIZZ2, file2, null, j)) {
            PK8.LIZJ(file3);
            if (LJIIIIZZ2 != null) {
                PK8.LIZJ(LJIIIIZZ2);
            }
            LJ(str6, LIZ2);
            if (!PKZ.LIZJ()) {
                PK8.LIZJ(C78596Usy.LJIJ(PK0.LIZ));
            }
            str5 = "success";
        } else {
            str5 = "failed";
        }
        C64263PJz.LIZ("upload_anr", str5);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(62:1|(1:3)|4|(1:6)|7|(1:9)(1:155)|10|11|12|13|(2:15|(1:17)(1:(1:19)(1:20)))|21|(1:25)|26|(3:28|(1:30)|31)|32|(1:34)(1:152)|35|(1:41)|42|(1:44)(1:151)|45|(1:150)(2:49|50)|51|(1:146)(2:54|55)|(38:130|131|(1:143)(1:135)|136|138|139|60|(2:62|(1:64))|65|(1:129)|69|(1:128)|71|(1:73)|74|(1:76)|(1:78)|79|(1:81)(1:127)|82|83|84|85|(1:125)|89|(1:91)|93|94|95|(1:97)|99|(3:116|117|(1:119))|(1:102)(1:115)|(2:104|(1:106))|(1:108)|(1:110)(1:114)|111|112)|59|60|(0)|65|(0)|129|69|(0)|71|(0)|74|(0)|(0)|79|(0)(0)|82|83|84|85|(1:87)|123|125|89|(0)|93|94|95|(0)|99|(0)|(0)(0)|(0)|(0)|(0)(0)|111|112) */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x030e A[Catch: all -> 0x0316, TRY_LEAVE, TryCatch #5 {all -> 0x0316, blocks: (B:84:0x02d6, B:87:0x02de, B:89:0x0308, B:91:0x030e, B:123:0x02ea, B:125:0x02f5), top: B:83:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0321 A[Catch: Exception -> 0x0334, TRY_LEAVE, TryCatch #6 {Exception -> 0x0334, blocks: (B:95:0x0319, B:97:0x0321), top: B:94:0x0319 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(java.io.File r24, java.io.File r25, java.lang.String r26, java.lang.String r27, boolean r28, long r29, long r31, long r33, org.json.JSONObject r35, java.lang.String r36, X.PKN r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKO.LJIILIIL(java.io.File, java.io.File, java.lang.String, java.lang.String, boolean, long, long, long, org.json.JSONObject, java.lang.String, X.PKN, boolean, boolean):void");
    }
}
