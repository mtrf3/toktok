package com.bytedance.applog.et_verify;

import X.AbstractC39028FTk;
import X.C16880lQ;
import X.InterfaceC66743QHj;
import X.QHO;
import X.QHP;
import X.QI3;
import X.RunnableC39007FSp;
import Y.ARunnableS10S1200000_11;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.i0;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public class EventVerify implements Runnable, InterfaceC66743QHj {
    public static volatile String LJLJJLL;
    public static AbstractC39028FTk<EventVerify> globalInstance = new QHO();
    public volatile boolean LJLIL;
    public volatile Context LJLJI;
    public List<String> LJLJJI;
    public final QI3 appLogInstance;
    public volatile long LJLILLLLZI = 200;
    public final BlockingQueue<QHP> LJLJJL = new LinkedBlockingQueue();

    /* JADX WARN: Can't wrap try/catch for region: R(9:7|(1:9)|10|(13:23|24|(4:27|(1:86)(7:29|(3:33|(4:36|(3:38|(4:41|(2:47|(4:51|52|53|55))|56|39)|64)(1:66)|65|34)|67)|68|(3:(3:77|(2:80|78)|81)|82|83)|85|82|83)|84|25)|87|88|(4:91|(3:93|94|95)(1:97)|96|89)|98|99|(2:101|(1:103)(1:115))(1:116)|104|105|(3:107|108|110)(1:114)|21)|16|17|18|20|21) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void com_bytedance_applog_et_verify_EventVerify__run$___twin___() {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.et_verify.EventVerify.com_bytedance_applog_et_verify_EventVerify__run$___twin___():void");
    }

    @Override // java.lang.Runnable
    public void run() {
        com_bytedance_applog_et_verify_EventVerify_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public static EventVerify global() {
        return globalInstance.LIZIZ(new Object[0]);
    }

    @Override // X.InterfaceC66743QHj
    public boolean isEnable() {
        return this.LJLIL;
    }

    public EventVerify(QI3 qi3) {
        this.appLogInstance = qi3;
    }

    public static void com_bytedance_applog_et_verify_EventVerify_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(EventVerify eventVerify) {
        boolean LIZ;
        try {
            eventVerify.com_bytedance_applog_et_verify_EventVerify__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public void setEventVerifyInterval(long j) {
        if (j >= 0) {
            this.LJLILLLLZI = j;
        }
    }

    @Override // X.InterfaceC66743QHj
    public void setEventVerifyUrl(String str) {
        LJLJJLL = i0.LJFF(str, "/service/2/app_log_test/");
    }

    public void setSpecialKeys(List<String> list) {
        this.LJLJJI = new CopyOnWriteArrayList(list);
    }

    public void loginEtWithScheme(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri parse = UriProtector.parse(str);
                String queryParameter = UriProtector.getQueryParameter(parse, "report_interval");
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        setEventVerifyInterval(CastLongProtector.parseLong(queryParameter));
                    } catch (NumberFormatException unused) {
                    }
                }
                Uri.Builder buildUpon = UriProtector.parse(UriProtector.getQueryParameter(parse, "callback_url")).buildUpon();
                buildUpon.appendQueryParameter("app_id", this.appLogInstance.LJIIIZ);
                buildUpon.appendQueryParameter("device_id", this.appLogInstance.LIZJ());
                buildUpon.appendQueryParameter("device_model", Build.MODEL);
                new RunnableC39007FSp((Runnable) new ARunnableS10S1200000_11(this, buildUpon.build().toString(), context, 0)).LIZ();
                return;
            } catch (Throwable th) {
                this.appLogInstance.LJJIZ.LIZJ(6, "login et", th, new Object[0]);
                return;
            }
        }
        this.appLogInstance.LJJIZ.LIZJ(6, "login et", new RuntimeException("scheme is null"), new Object[0]);
    }

    @Override // X.InterfaceC66743QHj
    public void putEvent(String str, JSONArray jSONArray) {
        if (!this.LJLIL || TextUtils.isEmpty(str) || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.LJLJJL.add(new QHP(str, jSONArray));
    }

    public synchronized void setEnable(boolean z, Context context) {
        if (context != null) {
            if (this.LJLJI == null) {
                if (C16880lQ.LLLLL(context) != null) {
                    context = C16880lQ.LLLLL(context);
                }
                this.LJLJI = context;
            }
        }
        if (this.LJLIL == z) {
            return;
        }
        this.LJLIL = z;
        if (this.LJLIL) {
            new RunnableC39007FSp((Runnable) this).LIZ();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(17:6|7|8|9|(1:11)(1:46)|12|13|(5:15|(1:17)|18|(1:20)|21)(6:36|(1:38)|39|(1:41)|42|(1:44))|22|(1:24)|25|(1:27)|28|(1:30)(1:35)|31|32|33)|49|9|(0)(0)|12|13|(0)(0)|22|(0)|25|(0)|28|(0)(0)|31|32|33) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[Catch: JSONException -> 0x00d5, TryCatch #0 {JSONException -> 0x00d5, blocks: (B:13:0x002d, B:15:0x0037, B:17:0x003d, B:18:0x0044, B:20:0x0052, B:21:0x005c, B:24:0x009b, B:25:0x00a0, B:27:0x00ac, B:28:0x00b1, B:30:0x00b9, B:31:0x00bf, B:36:0x006a, B:38:0x007a, B:41:0x0084, B:44:0x0090), top: B:12:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b A[Catch: JSONException -> 0x00d5, TryCatch #0 {JSONException -> 0x00d5, blocks: (B:13:0x002d, B:15:0x0037, B:17:0x003d, B:18:0x0044, B:20:0x0052, B:21:0x005c, B:24:0x009b, B:25:0x00a0, B:27:0x00ac, B:28:0x00b1, B:30:0x00b9, B:31:0x00bf, B:36:0x006a, B:38:0x007a, B:41:0x0084, B:44:0x0090), top: B:12:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac A[Catch: JSONException -> 0x00d5, TryCatch #0 {JSONException -> 0x00d5, blocks: (B:13:0x002d, B:15:0x0037, B:17:0x003d, B:18:0x0044, B:20:0x0052, B:21:0x005c, B:24:0x009b, B:25:0x00a0, B:27:0x00ac, B:28:0x00b1, B:30:0x00b9, B:31:0x00bf, B:36:0x006a, B:38:0x007a, B:41:0x0084, B:44:0x0090), top: B:12:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9 A[Catch: JSONException -> 0x00d5, TryCatch #0 {JSONException -> 0x00d5, blocks: (B:13:0x002d, B:15:0x0037, B:17:0x003d, B:18:0x0044, B:20:0x0052, B:21:0x005c, B:24:0x009b, B:25:0x00a0, B:27:0x00ac, B:28:0x00b1, B:30:0x00b9, B:31:0x00bf, B:36:0x006a, B:38:0x007a, B:41:0x0084, B:44:0x0090), top: B:12:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[Catch: JSONException -> 0x00d5, TryCatch #0 {JSONException -> 0x00d5, blocks: (B:13:0x002d, B:15:0x0037, B:17:0x003d, B:18:0x0044, B:20:0x0052, B:21:0x005c, B:24:0x009b, B:25:0x00a0, B:27:0x00ac, B:28:0x00b1, B:30:0x00b9, B:31:0x00bf, B:36:0x006a, B:38:0x007a, B:41:0x0084, B:44:0x0090), top: B:12:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void putEvent(java.lang.String r12, java.lang.String r13, java.lang.String r14, long r15, long r17, long r19, long r21, org.json.JSONObject r23) {
        /*
            r11 = this;
            java.lang.String r4 = "ab_sdk_version"
            java.lang.String r8 = "nt"
            boolean r0 = r11.LJLIL
            if (r0 != 0) goto L9
            return
        L9:
            if (r23 == 0) goto L15
            java.lang.String r0 = r23.toString()
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L15
            r3.<init>(r0)     // Catch: org.json.JSONException -> L15
            goto L1a
        L15:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L1a:
            java.lang.String r1 = "event_v3"
            boolean r0 = r1.equals(r12)
            java.lang.String r7 = "event"
            if (r0 == 0) goto L2b
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r5 = r1
            goto L2d
        L2b:
            r5 = r7
            r6 = r3
        L2d:
            boolean r2 = r1.equals(r12)     // Catch: org.json.JSONException -> Ld5
            r9 = 0
            r0 = r21
            if (r2 == 0) goto L6a
            boolean r2 = r3.has(r8)     // Catch: org.json.JSONException -> Ld5
            if (r2 == 0) goto L44
            int r2 = r3.optInt(r8)     // Catch: org.json.JSONException -> Ld5
            r6.put(r8, r2)     // Catch: org.json.JSONException -> Ld5
        L44:
            r3.remove(r8)     // Catch: org.json.JSONException -> Ld5
            java.lang.String r2 = "_event_v3"
            r3.remove(r2)     // Catch: org.json.JSONException -> Ld5
            boolean r2 = r3.has(r4)     // Catch: org.json.JSONException -> Ld5
            if (r2 == 0) goto L5c
            java.lang.String r2 = r3.optString(r4)     // Catch: org.json.JSONException -> Ld5
            r6.put(r4, r2)     // Catch: org.json.JSONException -> Ld5
            r3.remove(r4)     // Catch: org.json.JSONException -> Ld5
        L5c:
            r6.put(r7, r13)     // Catch: org.json.JSONException -> Ld5
            java.lang.String r2 = "params"
            r6.put(r2, r3)     // Catch: org.json.JSONException -> Ld5
            java.lang.String r2 = "local_time_ms"
            r6.put(r2, r0)     // Catch: org.json.JSONException -> Ld5
            goto L95
        L6a:
            java.lang.String r2 = "category"
            r6.put(r2, r12)     // Catch: org.json.JSONException -> Ld5
            java.lang.String r2 = "tag"
            r6.put(r2, r13)     // Catch: org.json.JSONException -> Ld5
            boolean r2 = android.text.TextUtils.isEmpty(r14)     // Catch: org.json.JSONException -> Ld5
            if (r2 != 0) goto L7f
            java.lang.String r2 = "label"
            r6.put(r2, r14)     // Catch: org.json.JSONException -> Ld5
        L7f:
            r2 = r15
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L8a
            java.lang.String r4 = "value"
            r6.put(r4, r2)     // Catch: org.json.JSONException -> Ld5
        L8a:
            r2 = r17
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L95
            java.lang.String r4 = "ext_value"
            r6.put(r4, r2)     // Catch: org.json.JSONException -> Ld5
        L95:
            r2 = r19
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 <= 0) goto La0
            java.lang.String r4 = "user_id"
            r6.put(r4, r2)     // Catch: org.json.JSONException -> Ld5
        La0:
            X.QI3 r2 = r11.appLogInstance     // Catch: org.json.JSONException -> Ld5
            java.lang.String r3 = r2.LJI()     // Catch: org.json.JSONException -> Ld5
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> Ld5
            if (r2 != 0) goto Lb1
            java.lang.String r2 = "user_unique_id"
            r6.put(r2, r3)     // Catch: org.json.JSONException -> Ld5
        Lb1:
            java.lang.String r4 = "session_id"
            X.QI3 r3 = r11.appLogInstance     // Catch: org.json.JSONException -> Ld5
            X.QI4 r2 = r3.LJIILIIL     // Catch: org.json.JSONException -> Ld5
            if (r2 == 0) goto Ld3
            X.QI4 r2 = r3.LJIILIIL     // Catch: org.json.JSONException -> Ld5
            X.QI5 r2 = r2.LJLLI     // Catch: org.json.JSONException -> Ld5
            java.lang.String r2 = r2.LJ     // Catch: org.json.JSONException -> Ld5
        Lbf:
            r6.put(r4, r2)     // Catch: org.json.JSONException -> Ld5
            java.lang.String r4 = "datetime"
            java.text.SimpleDateFormat r3 = X.QI2.LJZI     // Catch: org.json.JSONException -> Ld5
            java.util.Date r2 = new java.util.Date     // Catch: org.json.JSONException -> Ld5
            r2.<init>(r0)     // Catch: org.json.JSONException -> Ld5
            java.lang.String r0 = r3.format(r2)     // Catch: org.json.JSONException -> Ld5
            r6.put(r4, r0)     // Catch: org.json.JSONException -> Ld5
            goto Ld5
        Ld3:
            r2 = 0
            goto Lbf
        Ld5:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            r2.put(r6)
            java.util.concurrent.BlockingQueue<X.QHP> r1 = r11.LJLJJL
            X.QHP r0 = new X.QHP
            r0.<init>(r5, r2)
            r1.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.et_verify.EventVerify.putEvent(java.lang.String, java.lang.String, java.lang.String, long, long, long, long, org.json.JSONObject):void");
    }
}
