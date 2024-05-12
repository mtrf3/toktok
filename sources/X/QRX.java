package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.push.settings.LocalFrequencySettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QRX {
    public final QR6 LIZ;
    public volatile boolean LIZIZ;
    public volatile AtomicBoolean LIZJ = new AtomicBoolean(false);

    public QRX(QR6 qr6) {
        this.LIZ = qr6;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:3|4|(1:6)(1:67)|7|(1:66)(1:15)|(3:53|(2:55|(1:63))|37)|21|22|23|(1:25)(1:45)|26|27|28|(7:30|31|(1:33)|34|35|36|37)|42|31|(0)|34|35|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01cc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01cd, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x021f, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0245, code lost:
    
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d7 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:23:0x015d, B:26:0x016e, B:28:0x01b5, B:30:0x01c7, B:31:0x01d1, B:33:0x01d7, B:34:0x01e1, B:44:0x01cd), top: B:22:0x015d, outer: #2, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZJ(boolean r24) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QRX.LIZJ(boolean):void");
    }

    public final void LIZ(Context context, int i, String str) {
        QRM.LJFF().LIZLLL(i, str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request UPDATE_SENDER_URL failed: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (this.LIZJ.compareAndSet(false, true)) {
            QRG.LIZIZ().getClass();
            LIZLLL(context, QRG.LIZJ().LJIILIIL(), false);
        }
    }

    public final void LIZLLL(Context context, String str, boolean z) {
        boolean LJFF = C67007QRn.LJI(context).LJFF(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryRegisterServerPush ");
        LIZ.append(str);
        LIZ.append(" hasSupport = ");
        LIZ.append(LJFF);
        X1D.LIZIZ(LIZ);
        boolean z2 = false;
        if (z && !LJFF) {
            QRG.LIZIZ().getClass();
            str = QRG.LIZJ().LJIILIIL();
            if (!C67007QRn.LJI(context).LJFF(str)) {
                QRM.LJFF().LJIIIIZZ(str, false);
                return;
            }
        }
        C1JX.LJIIIIZZ("tryRegisterAllSelectedPush: the senders = ", str);
        if (z && LJFF) {
            z2 = true;
        }
        C67007QRn.LJ(str, z2);
        QRM.LJFF().LJIIIIZZ(str, ((QRP) this.LIZ).LIZ(context));
    }

    public final void LIZIZ(String str, Application application, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str)) {
            LIZ(application, 304, str);
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!TextUtils.equals("success", jSONObject.optString("message"))) {
            LIZ(application, 302, str);
            return;
        }
        QRM qrm = QRM.LJIIIIZZ;
        jSONObject.optJSONObject("frontier_setting");
        qrm.getClass();
        JSONArray optJSONArray = jSONObject.optJSONArray("channels");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i);
                    String optString = jSONObject2.optString("id");
                    String optString2 = jSONObject2.optString("name");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        arrayList.add(new QS9(jSONObject2));
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            QRM.LJIIIIZZ.LIZJ().getClass();
            if (!C79004UzY.LJJIFFI(arrayList)) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    QS9 qs9 = (QS9) it.next();
                    if (qs9 != null) {
                        try {
                            if (qs9.LIZIZ) {
                                C67013QRt.LIZ.LIZLLL(application, qs9);
                            } else if (!TextUtils.equals(qs9.LIZJ, "push")) {
                                C67013QRt.LIZ.LIZ(application, qs9);
                            }
                        } catch (Exception e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                    }
                }
            }
        }
        String optString3 = jSONObject.optString("allow_push_list");
        if (TextUtils.isEmpty(optString3)) {
            LIZ(application, 303, str);
            return;
        }
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) PT6.LIZ(application, LocalFrequencySettings.class);
        localFrequencySettings.LJI(System.currentTimeMillis());
        localFrequencySettings.LJJIJIIJI(str3);
        localFrequencySettings.LIZ(str4);
        localFrequencySettings.LJJIJLIJ(str5);
        localFrequencySettings.LJIILLIIL(str6);
        localFrequencySettings.LJJIII(str2);
        try {
        } catch (Exception e3) {
            C16880lQ.LLLLIIL(e3);
        }
        if (new JSONArray(optString3).length() > 0) {
            QRM.LJFF().LJII();
            this.LIZJ.set(true);
            LIZLLL(QM0.LIZ, optString3, true);
        }
        LIZ(application, 303, str);
        this.LIZJ.set(true);
        LIZLLL(QM0.LIZ, optString3, true);
    }
}
