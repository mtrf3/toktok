package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QL7 extends PthreadThread {
    public final LinkedList<AbstractC66846QLi> LJLIL;
    public final Context LJLILLLLZI;
    public final JSONObject LJLJI;
    public final AtomicBoolean LJLJJI;
    public final List<QJ5> LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public QLP LJLJLJ;
    public volatile long LJLJLLL;
    public long LJLL;
    public final AtomicLong LJLLI;
    public volatile long LJLLILLLL;
    public int LJLLJ;
    public volatile JSONObject LJLLL;
    public volatile long LJLLLL;
    public final ConcurrentHashMap<String, String> LJLLLLLL;
    public final ConcurrentHashMap<String, String> LJLZ;
    public final QLC LJZ;

    public final synchronized void LJIIIIZZ() {
    }

    public final void LJFF() {
        QL6 LIZLLL = QL6.LIZLLL(this.LJLILLLLZI);
        synchronized (LIZLLL) {
            SQLiteDatabase sQLiteDatabase = LIZLLL.LIZ;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("timestamp <= ? OR retry_count > ");
                LIZ.append(AppLog.sLogRetryMaxCount);
                try {
                    LIZLLL.LIZ.delete("queue", X1D.LIZIZ(LIZ), new String[]{String.valueOf(System.currentTimeMillis() - AppLog.sLogExpireTime)});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0014, code lost:
    
        if (r6 == null) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0037 -> B:4:0x0016). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0072 -> B:4:0x0016). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0077 -> B:4:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL7.LJI():void");
    }

    public final boolean LJII() {
        try {
            return !C38354F3m.LJ(this.LJLJI.optString("device_id", ""));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL7.LJIIL():boolean");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJI();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static List<Long> LJIIIZ(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("event_v3");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(Long.valueOf(JSONArrayProtectorUtils.getJSONObject(optJSONArray, i).optLong("tea_event_index", 0L)));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("event");
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        arrayList.add(Long.valueOf(JSONArrayProtectorUtils.getJSONObject(optJSONArray2, i2).optLong("tea_event_index", 0L)));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static List<String> LJIIJ(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONArray optJSONArray = new JSONObject(str).optJSONArray("terminate");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String optString = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i).optString("session_id", "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(optString);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public final void LIZLLL(long j) {
        QLP LJFF;
        if (j > 0 && (LJFF = QL6.LIZLLL(this.LJLILLLLZI).LJFF(j)) != null) {
            LJIILJJIL(LJFF, null, false, 0L, true, false);
            C66840QLc c66840QLc = new C66840QLc();
            c66840QLc.LIZ = LJFF.LIZ;
            synchronized (this.LJLIL) {
                this.LJLIL.add(c66840QLc);
            }
        }
    }

    public final boolean LJ(C66841QLd c66841QLd) {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        String format = AppLog.getDateFormat().format(new Date(System.currentTimeMillis()));
        if (format.equals(AppLog.getDateFormat().format(Long.valueOf(this.LJLJLLL)))) {
            return true;
        }
        try {
            jSONObject = new JSONObject(c66841QLd.LIZIZ);
        } catch (Throwable unused) {
        }
        if (jSONObject.isNull("terminate") || (optJSONArray = jSONObject.optJSONArray("terminate")) == null || optJSONArray.length() <= 0 || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
            return true;
        }
        String optString = optJSONObject.optString("datetime");
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        int optInt = optJSONObject.optInt("duration");
        Date parse = AppLog.sDateTimeFormat.parse(optString);
        if (parse == null || format.equals(AppLog.getDateFormat().format(parse))) {
            return true;
        }
        if (format.equals(AppLog.getDateFormat().format(new Date((optInt * 1000) + parse.getTime())))) {
            return true;
        }
        if (jSONObject.isNull("event") && jSONObject.isNull("event_v3") && jSONObject.isNull("log_data") && jSONObject.isNull("item_impression") && jSONObject.isNull("launch")) {
            return false;
        }
        QL6 LIZLLL = QL6.LIZLLL(this.LJLILLLLZI);
        jSONObject.remove("terminate");
        String jSONObject2 = jSONObject.toString();
        c66841QLd.LIZIZ = jSONObject2;
        LIZLLL.LJIIZILJ(c66841QLd.LIZ, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("terminate", optJSONArray);
        jSONObject3.put("magic_tag", "ss_app_log");
        if (!jSONObject.isNull("time_sync")) {
            jSONObject3.put("time_sync", jSONObject.optJSONObject("time_sync"));
        }
        jSONObject3.put("header", jSONObject.optJSONObject("header"));
        jSONObject3.put("_gen_time", jSONObject.optLong("_gen_time"));
        LIZLLL.LJIIIIZZ(jSONObject3.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        if (0 != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJIIJJI(X.AbstractC66846QLi r17) {
        /*
            r16 = this;
            r8 = r16
            r1 = r17
            monitor-enter(r8)
            boolean r0 = com.ss.android.common.applog.AppLog.isTouristMode()     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L13
            boolean r0 = com.ss.android.common.applog.AppLog.isEnableEventInTouristMode()     // Catch: java.lang.Throwable -> Lc7
            if (r0 != 0) goto L13
            monitor-exit(r8)
            return
        L13:
            boolean r0 = r1 instanceof X.QLT     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L44
            X.QLT r1 = (X.QLT) r1     // Catch: java.lang.Throwable -> Lc7
            boolean r0 = r1.LJ     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L2a
            X.QLP r9 = r1.LIZ     // Catch: java.lang.Throwable -> Lc7
            r10 = 0
            r11 = 1
            long r12 = r1.LIZLLL     // Catch: java.lang.Throwable -> Lc7
            r14 = 0
            r15 = r11
            r8.LJIILJJIL(r9, r10, r11, r12, r14, r15)     // Catch: java.lang.Throwable -> Lc7
            goto Lc5
        L2a:
            X.QLP r9 = r1.LIZ     // Catch: java.lang.Throwable -> Lc7
            X.QLP r10 = r1.LIZIZ     // Catch: java.lang.Throwable -> Lc7
            boolean r11 = r1.LIZJ     // Catch: java.lang.Throwable -> Lc7
            long r12 = r1.LIZLLL     // Catch: java.lang.Throwable -> Lc7
            r14 = 1
            r15 = 0
            r8.LJIILJJIL(r9, r10, r11, r12, r14, r15)     // Catch: java.lang.Throwable -> Lc7
            X.QLP r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> Lc7
            r8.LJIILLIIL(r0)     // Catch: java.lang.Throwable -> Lc7
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc7
            r8.LJLL = r0     // Catch: java.lang.Throwable -> Lc7
            goto Lc5
        L44:
            boolean r0 = r1 instanceof X.C66840QLc     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L50
            X.QLc r1 = (X.C66840QLc) r1     // Catch: java.lang.Throwable -> Lc7
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> Lc7
            r8.LIZLLL(r0)     // Catch: java.lang.Throwable -> Lc7
            goto Lc5
        L50:
            boolean r0 = r1 instanceof X.QLY     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto Lc5
            X.QLY r1 = (X.QLY) r1     // Catch: java.lang.Throwable -> Lc7
            X.QLG r2 = r1.LIZ     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto Lc5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc7
            r1.<init>()     // Catch: java.lang.Throwable -> Lc7
            org.json.JSONObject r0 = r8.LJLJI     // Catch: java.lang.Throwable -> Lc7
            X.QK9.LIZ(r0, r1)     // Catch: java.lang.Throwable -> Lc7
            android.content.Context r0 = r8.LJLILLLLZI     // Catch: java.lang.Throwable -> Lc7
            X.QLB r0 = X.QLB.LIZJ(r0)     // Catch: java.lang.Throwable -> Lc7
            android.util.Pair r1 = r0.LIZLLL(r2, r1)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Lc5
            java.lang.Object r0 = r1.first     // Catch: java.lang.Throwable -> Lc7
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> Lc7
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r2 = r1.second     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lc7
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto Lc5
            android.content.Context r0 = r8.LJLILLLLZI     // Catch: java.lang.Throwable -> Lc7
            X.QL6 r7 = X.QL6.LIZLLL(r0)     // Catch: java.lang.Throwable -> Lc7
            r6 = 0
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lc7
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> Lc5 java.lang.Throwable -> Lc7
            if (r0 == 0) goto Lc5
            java.lang.String[] r0 = com.ss.android.common.applog.AppLog.APPLOG_URL()     // Catch: java.lang.Throwable -> La3
            int r1 = r8.LJIILIIL(r2, r0)     // Catch: java.lang.Throwable -> La3
            r0 = -1
            if (r1 != r0) goto L9d
            goto Lc5
        L9d:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto La6
            r6 = 1
            goto La9
        La3:
            if (r6 == 0) goto La6
            goto La9
        La6:
            X.QIL r0 = X.QIL.f_net     // Catch: java.lang.Throwable -> Lc7
            goto Lab
        La9:
            X.QIL r0 = X.QIL.success     // Catch: java.lang.Throwable -> Lc7
        Lab:
            X.QIV.LIZJ(r2, r0)     // Catch: java.lang.Throwable -> Lc7
            r2 = 1
            long r0 = r4 - r2
            X.QLd r1 = r7.LJ(r0)     // Catch: java.lang.Throwable -> Lc7
            boolean r0 = r7.LJIIL(r4, r6)     // Catch: java.lang.Throwable -> Lc7
            if (r6 != 0) goto Lc5
            if (r0 == 0) goto Lc5
            java.lang.String r1 = r1.LIZIZ     // Catch: java.lang.Throwable -> Lc7
            X.QIL r0 = X.QIL.f_expire     // Catch: java.lang.Throwable -> Lc7
            X.QIV.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> Lc7
        Lc5:
            monitor-exit(r8)
            return
        Lc7:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL7.LJIIJJI(X.QLi):void");
    }

    public final synchronized void LJIILL(JSONObject jSONObject) {
        try {
            for (String str : QJL.LIZ) {
                this.LJLJI.put(str, jSONObject.opt(str));
            }
        } catch (Exception unused) {
        }
    }

    public final void LJIILLIIL(QLP qlp) {
        if (AppLog.isFixSessionLost() && qlp == null) {
            return;
        }
        this.LJLJLJ = qlp;
        SharedPreferences LIZIZ = F9J.LIZIZ(this.LJLILLLLZI, 0, "applog_stats");
        this.LJLJLLL = LIZIZ.getLong("latest_forground_session_time", 0L);
        if (qlp != null && !qlp.LJII) {
            this.LJLJLLL = qlp.LIZJ;
            LIZIZ.edit().putLong("latest_forground_session_time", this.LJLJLLL).apply();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x024b, code lost:
    
        if (com.ss.android.common.applog.AppLog.sUserIdIsolateCallback.LIZ(java.lang.String.valueOf(r18)) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (new java.util.Random().nextInt(10000) < r8.LIZ) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILIIL(java.lang.String r23, java.lang.String[] r24) {
        /*
            Method dump skipped, instructions count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL7.LJIILIIL(java.lang.String, java.lang.String[]):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0268, code lost:
    
        if (r8 == false) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0275  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(X.QLP r23, X.QLP r24, boolean r25, long r26, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QL7.LJIILJJIL(X.QLP, X.QLP, boolean, long, boolean, boolean):void");
    }

    public QL7(Context context, JSONObject jSONObject, LinkedList<AbstractC66846QLi> linkedList, AtomicBoolean atomicBoolean, List<QJ5> list, QLP qlp, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        super("LogReaper");
        new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        this.LJLJJLL = 0L;
        this.LJLJL = 0L;
        this.LJLL = 0L;
        this.LJLLI = new AtomicLong();
        this.LJLLILLLL = 60000L;
        this.LJLLJ = 1;
        this.LJLLL = null;
        this.LJLLLL = 120000L;
        this.LJLILLLLZI = context;
        this.LJLJI = jSONObject;
        this.LJLIL = linkedList;
        this.LJLJJI = atomicBoolean;
        this.LJLJJL = list;
        LJIILLIIL(qlp);
        this.LJLLLLLL = concurrentHashMap;
        this.LJLZ = concurrentHashMap2;
        this.LJZ = new QLC(context);
        for (String str : AppLog.APPLOG_URL()) {
            QLM qlm = this.LJZ.LIZIZ;
            synchronized (qlm) {
                if (!C38354F3m.LJ(str) && !((HashMap) qlm.LIZIZ).containsKey(str)) {
                    QLU qlu = new QLU();
                    SharedPreferences LIZIZ = F9J.LIZIZ(qlm.LIZJ.LIZ, 0, "applog_stats");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append("_downgrade_time");
                    if (System.currentTimeMillis() - LIZIZ.getLong(X1D.LIZIZ(LIZ), 0L) < 10800000) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str);
                        LIZ2.append("_downgrade_index");
                        qlu.LIZ = LIZIZ.getInt(X1D.LIZIZ(LIZ2), 0);
                    } else {
                        SharedPreferences.Editor edit = LIZIZ.edit();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(str);
                        LIZ3.append("_downgrade_time");
                        SharedPreferences.Editor remove = edit.remove(X1D.LIZIZ(LIZ3));
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(str);
                        LIZ4.append("_downgrade_index");
                        remove.remove(X1D.LIZIZ(LIZ4)).commit();
                    }
                    ((HashMap) qlm.LIZIZ).put(str, qlu);
                }
            }
        }
    }
}
