package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import defpackage.i0;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QH9 {
    public static final List<String> LJIILJJIL = Collections.singletonList("ConfigManager");
    public final Context LIZ;
    public final QIN LIZIZ;
    public final SharedPreferences LIZJ;
    public final SharedPreferences LIZLLL;
    public final SharedPreferences LJ;
    public volatile String LJFF;
    public volatile JSONObject LJI;
    public final HashSet<String> LJII = new HashSet<>();
    public final HashSet<String> LJIIIIZZ = new HashSet<>();
    public long LJIIIZ;
    public volatile QHA LJIIJ;
    public final QHN LJIIJJI;
    public final QI3 LJIIL;
    public QI4 LJIILIIL;

    public final long LIZ() {
        long j = this.LJIIIZ;
        if (j >= 10000 && j <= LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            return j;
        }
        return this.LJ.getLong("batch_event_interval", 60000L);
    }

    public final String LIZIZ() {
        String str = this.LJFF;
        if (TextUtils.isEmpty(str)) {
            synchronized (this) {
                str = this.LIZJ.getString("external_ab_version", "");
                this.LJFF = str;
            }
        }
        return str;
    }

    public final JSONObject LIZJ() {
        String string = this.LJ.getString("log_back", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (Throwable th) {
            this.LJIIL.LJJIZ.LJIILL(null, "json parse to logback failed", th, new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        X.C66735QHb.LIZ = r1.processName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r7 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL() {
        /*
            r9 = this;
            X.QIN r5 = r9.LIZIZ
            int r0 = r5.LJII
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L1f
            android.content.Context r2 = r9.LIZ
            java.lang.String r1 = X.C66735QHb.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L29
        L12:
            java.lang.String r0 = ":"
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L27
            r0 = 1
        L1d:
            r5.LJII = r0
        L1f:
            X.QIN r0 = r9.LIZIZ
            int r0 = r0.LJII
            if (r0 != r3) goto L26
            r4 = 1
        L26:
            return r4
        L27:
            r0 = 2
            goto L1d
        L29:
            int r6 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = "activity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r2, r0)     // Catch: java.lang.Exception -> L52
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Exception -> L52
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Exception -> L52
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L52
        L3d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L56
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L52
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L52
            int r0 = r1.pid     // Catch: java.lang.Exception -> L52
            if (r0 != r6) goto L3d
            java.lang.String r0 = r1.processName     // Catch: java.lang.Exception -> L52
            X.C66735QHb.LIZ = r0     // Catch: java.lang.Exception -> L52
            goto L56
        L52:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L56:
            r8 = 0
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L9b
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L9b
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L9b
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Exception -> L9b
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L9b
            r1.append(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L9b
            r2.<init>(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = "iso-8859-1"
            r6.<init>(r2, r0)     // Catch: java.lang.Exception -> L9b
            r7.<init>(r6)     // Catch: java.lang.Exception -> L9b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r1.<init>()     // Catch: java.lang.Throwable -> L96
        L86:
            int r0 = r7.read()     // Catch: java.lang.Throwable -> L96
            if (r0 <= 0) goto L91
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L96
            r1.append(r0)     // Catch: java.lang.Throwable -> L96
            goto L86
        L91:
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            if (r7 == 0) goto L9b
        L98:
            r7.close()
        L9b:
            X.C66735QHb.LIZ = r8
            X.QHg r2 = X.QIX.LJIJJ()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "getProcessName, "
            r1.<init>(r0)
            java.lang.String r0 = X.C66735QHb.LIZ
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r2.LJIIL(r1, r0)
            java.lang.String r1 = X.C66735QHb.LIZ
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QH9.LIZLLL():boolean");
    }

    public final void LJFF(String str) {
        this.LJIIL.LJJIZ.LJIJI(0, LJIILJJIL, i0.LJFF("setExternalAbVersion, ", str), new Object[0]);
        this.LIZJ.edit().putString("external_ab_version", str).apply();
        this.LJFF = null;
    }

    public final void LJI(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject LIZJ = LIZJ();
        if (LIZJ != null) {
            QB0.LIZIZ(jSONObject, LIZJ);
            jSONObject = LIZJ;
        }
        this.LJ.edit().putString("log_back", jSONObject.toString()).apply();
    }

    public final void LJ(QHA qha, boolean z) {
        QI4 qi4;
        if (this.LJ.getBoolean("ignore_event_priority", false)) {
            return;
        }
        this.LJIIJ = qha;
        if (z && (qi4 = this.LJIILIIL) != null && qi4.LJLJLLL != null) {
            qi4.LJLJLLL.sendEmptyMessage(17);
        }
        QI0.LIZIZ("priority_config", new QHD(this, qha));
    }

    public QH9(QI3 qi3, Context context, QIN qin) {
        this.LJIIL = qi3;
        this.LIZ = context;
        this.LIZIZ = qin;
        this.LJ = F9J.LIZIZ(context, 0, qin.LJJ);
        this.LIZJ = F9J.LIZIZ(context, 0, C66745QHl.LIZIZ(qi3, "header_custom"));
        this.LIZLLL = F9J.LIZIZ(context, 0, C66745QHl.LIZIZ(qi3, "last_sp_session"));
        this.LJIIJJI = new QHN(qi3, this, LIZ());
        if (qi3.LJJI) {
            QHA qha = new QHA();
            SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, C66745QHl.LIZIZ(qi3, "priority_list"));
            qha.LIZ = LIZIZ.getInt("priority_version", 0);
            qha.LIZIZ = LIZIZ.getInt("base_interval", 5);
            String string = LIZIZ.getString("priorities", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    QHB.LIZ(qi3, this, qha, new JSONArray(string));
                } catch (JSONException e) {
                    qi3.LJJIZ.LJIILL(QHB.LIZ, "parseEventPriorityFromLocal failed", e, new Object[0]);
                }
            }
            LJ(qha, false);
        }
    }
}
