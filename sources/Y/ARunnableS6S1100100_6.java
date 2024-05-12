package Y;

import X.C09900aA;
import X.C16880lQ;
import X.C38354F3m;
import X.FAK;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.ss.android.common.applog.AppLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS6S1100100_6 implements Runnable {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$1() {
        if (C38354F3m.LJ(this.s0)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_event_v3", 1);
            jSONObject.put("event_v3_reserved_field_time_stamp", this.j2);
            Bundle bundle = (Bundle) this.l1;
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, C16880lQ.LLJJIII((Bundle) this.l1, str));
                }
            }
            String abSDKVersion = AppLog.getAbSDKVersion();
            if (!TextUtils.isEmpty(abSDKVersion)) {
                jSONObject.put("ab_sdk_version", abSDKVersion);
            }
        } catch (Throwable unused) {
        }
        AppLog.onEvent((Context) null, "event_v3", this.s0, (String) null, 0L, 0L, jSONObject);
    }

    public final void LIZ$0() {
        BlockHelper.tryBlock();
        try {
            ((JSONObject) this.l1).put("_event_v3", 1);
            ((JSONObject) this.l1).put("event_v3_reserved_field_time_stamp", this.j2);
            String abSDKVersion = AppLog.getAbSDKVersion();
            if (!TextUtils.isEmpty(abSDKVersion)) {
                ((JSONObject) this.l1).put("ab_sdk_version", abSDKVersion);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        AppLog.onEvent((Context) null, "event_v3", this.s0, (String) null, 0L, 0L, (JSONObject) this.l1);
    }

    public final void LIZ$2() {
        BlockHelper.tryBlock();
        if (C38354F3m.LJ(this.s0)) {
            return;
        }
        JSONObject jSONObject = (JSONObject) this.l1;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("_event_v3", 1);
            jSONObject.put("event_v3_reserved_field_time_stamp", this.j2);
            String abSDKVersion = AppLog.getAbSDKVersion();
            if (!TextUtils.isEmpty(abSDKVersion)) {
                jSONObject.put("ab_sdk_version", abSDKVersion);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        AppLog.onEvent((Context) null, "event_v3", this.s0, (String) null, 0L, 0L, jSONObject);
    }

    public static final void run$0(ARunnableS6S1100100_6 aRunnableS6S1100100_6) {
        boolean LIZ;
        try {
            aRunnableS6S1100100_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S1100100_6 aRunnableS6S1100100_6) {
        boolean LIZ;
        try {
            aRunnableS6S1100100_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS6S1100100_6 aRunnableS6S1100100_6) {
        boolean LIZ;
        try {
            FAK fak = (FAK) aRunnableS6S1100100_6.l1;
            String str = aRunnableS6S1100100_6.s0;
            long j = aRunnableS6S1100100_6.j2;
            if (fak.LJIIL()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(str, j);
                    jSONObject.put("metric", jSONObject2);
                    C09900aA.LJFF("satellite_event_name_v3", null, jSONObject);
                } catch (Throwable unused) {
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS6S1100100_6 aRunnableS6S1100100_6) {
        boolean LIZ;
        try {
            aRunnableS6S1100100_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS6S1100100_6 aRunnableS6S1100100_6) {
        boolean LIZ;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aspect", aRunnableS6S1100100_6.s0);
            jSONObject.put("cost", aRunnableS6S1100100_6.j2);
            IEventMonitor iEventMonitor = (IEventMonitor) aRunnableS6S1100100_6.l1;
            if (iEventMonitor != null) {
                iEventMonitor.monitorCommonLog("rasp_time_monitor", jSONObject);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS6S1100100_6(java.lang.String r2, long r3, org.json.JSONObject r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r2
            r0.l1 = r5
            r0.j2 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r5
            r0.j2 = r3
            r0.s0 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS6S1100100_6.<init>(java.lang.String, long, org.json.JSONObject, int):void");
    }

    public ARunnableS6S1100100_6(long j, Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.j2 = j;
        this.l1 = obj;
    }
}
