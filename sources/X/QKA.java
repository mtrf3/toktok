package X;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes12.dex */
public class QKA extends PthreadThread {
    public int LJLIL;
    public final /* synthetic */ QKD LJLILLLLZI;

    public final void LJFF() {
        int i;
        QKF qkf;
        int i2;
        Pair<String, Boolean> LIZ;
        boolean z;
        int i3;
        if (QKD.LJIJJLI) {
            return;
        }
        DeviceRegisterManager.getAppTraitCallback();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (QKD.LJJI <= 0) {
                QKD.LJJI = currentTimeMillis;
            }
            this.LJLILLLLZI.LJIIIZ = currentTimeMillis;
            if (C2NU.LIZ.LIZIZ()) {
                String LJ = QK9.LJ(this.LJLILLLLZI.LJFF);
                if (!C38354F3m.LJ(LJ)) {
                    this.LJLILLLLZI.LJII.put("user_agent", LJ);
                }
                if (!C38354F3m.LJ(this.LJLILLLLZI.LJIIJJI)) {
                    QKD qkd = this.LJLILLLLZI;
                    qkd.LJII.put("app_track", qkd.LJIIJJI);
                }
                JSONObject jSONObject = new JSONObject(new JSONTokener(this.LJLILLLLZI.LJII.toString()));
                jSONObject.put("req_id", DeviceRegisterManager.getRequestId());
                if (this.LJLILLLLZI.LIZIZ) {
                    jSONObject.put(WM7.SCENE_SERVICE, 2);
                }
                jSONObject.put("device_platform", "android");
                C66851QLn.LJII(jSONObject);
                try {
                    Bundle bundle = new Bundle();
                    Bundle bundle2 = QKD.LJIJI;
                    synchronized (bundle2) {
                        bundle.putAll(bundle2);
                    }
                    if (bundle.size() > 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (String str : bundle.keySet()) {
                            jSONObject2.put(str, C16880lQ.LLJJIII(bundle, str));
                        }
                        jSONObject.put("custom", jSONObject2);
                    }
                    if (!TextUtils.isEmpty(null)) {
                        jSONObject.put("app_trait", (Object) null);
                    }
                    String str2 = V1B.LJLJI;
                    String str3 = V1B.LJLJJI;
                    if (!this.LJLILLLLZI.LIZIZ && !DeviceRegisterManager.isNewUserMode(this.LJLILLLLZI.LJFF) && !DeviceRegisterManager.isTouristMode() && (LIZ = C39247Fal.LIZ(this.LJLILLLLZI.LJFF)) != null) {
                        Object obj = LIZ.second;
                        if (obj != null && ((Boolean) obj).booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        jSONObject.put("gaid_limited", i3);
                        jSONObject.put("google_aid", LIZ.first);
                    }
                    if (!C38354F3m.LJ(str2)) {
                        jSONObject.put("app_language", str2);
                    }
                    if (!C38354F3m.LJ(str3)) {
                        jSONObject.put("app_region", str3);
                    }
                } catch (Throwable unused) {
                }
                QKD qkd2 = this.LJLILLLLZI;
                qkd2.getClass();
                try {
                    PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(qkd2.LJFF.getPackageManager(), qkd2.LJFF.getPackageName(), 0);
                    if (LLLLLLZ != null) {
                        jSONObject.put("apk_first_install_time", LLLLLLZ.firstInstallTime);
                        if ((LLLLLLZ.applicationInfo.flags & 1) == 1) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        jSONObject.put("is_system_app", i2);
                    }
                } catch (Throwable unused2) {
                }
                jSONObject.put("sdk_version", "3.9.16-bugfix.4");
                jSONObject.put("sdk_flavor", "global");
                if (DeviceRegisterManager.isTouristMode()) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("guest_mode", i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("magic_tag", "ss_app_log");
                jSONObject3.put("header", jSONObject);
                jSONObject3.put("_gen_time", System.currentTimeMillis());
                QKD.LJIJJLI = true;
                QKD.LJJII.set(Boolean.TRUE);
                boolean LJ2 = LJ(jSONObject3.toString(), jSONObject);
                if (LJ2) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (QKD.LJJI > 0) {
                        QIV.LJ(QIU.register, QIL.total_success, currentTimeMillis2 - QKD.LJJI);
                        QKD.LJJI = 0L;
                    }
                    QKD qkd3 = this.LJLILLLLZI;
                    QKH qkh = qkd3.LJIILLIIL;
                    if (qkh != null && (qkf = qkd3.LJIILJJIL) != null) {
                        qkf.LIZ(qkh);
                    }
                    QIV.LJ(QIU.register, QIL.success, currentTimeMillis2 - currentTimeMillis);
                }
                Object obj2 = QKD.LJIIZILJ;
                synchronized (obj2) {
                    QKD.LJIJJLI = false;
                    try {
                        obj2.notifyAll();
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                QKD.LJIJJ = true;
                QKD.LJJII.remove();
                if (!LJ2) {
                    String LIZJ = ((JFK) this.LJLILLLLZI.LJ).LIZJ();
                    QKD qkd4 = this.LJLILLLLZI;
                    boolean LJ3 = C38354F3m.LJ(LIZJ);
                    qkd4.getClass();
                    QKD.LIZ(false, LJ3);
                    return;
                }
                return;
            }
            QIV.LIZ(QIU.register, QIL.f_no_network);
            this.LJLILLLLZI.LIZIZ();
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:27|(1:29)(1:97)|30|(2:94|(13:96|37|(5:84|85|86|(1:88)(1:91)|(12:90|42|(1:44)|45|(1:49)|50|(1:83)(1:54)|55|126|140|66|67))|41|42|(0)|45|(2:47|49)|50|(1:52)|83|55|126))(1:35)|36|37|(1:39)|84|85|86|(0)(0)|(0)|41|42|(0)|45|(0)|50|(0)|83|55|126) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00d8, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QKA.LIZLLL():void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            LIZLLL();
            throw null;
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QKA(C66816QKe c66816QKe) {
        super("DeviceRegisterThread");
        this.LJLILLLLZI = c66816QKe;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f1, code lost:
    
        if (r11 != false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(org.json.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QKA.LJI(org.json.JSONObject):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[Catch: all -> 0x012b, TryCatch #4 {all -> 0x012b, blocks: (B:12:0x0028, B:14:0x003e, B:16:0x0042, B:20:0x011e, B:21:0x0052, B:23:0x0063, B:55:0x00f5, B:57:0x0105, B:69:0x0122, B:78:0x0123, B:79:0x012a, B:28:0x0074, B:30:0x007a, B:31:0x008a, B:32:0x00be, B:38:0x00da, B:40:0x00e8, B:47:0x00e0, B:52:0x0098, B:74:0x00a9), top: B:11:0x0028, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123 A[Catch: all -> 0x012b, TryCatch #4 {all -> 0x012b, blocks: (B:12:0x0028, B:14:0x003e, B:16:0x0042, B:20:0x011e, B:21:0x0052, B:23:0x0063, B:55:0x00f5, B:57:0x0105, B:69:0x0122, B:78:0x0123, B:79:0x012a, B:28:0x0074, B:30:0x007a, B:31:0x008a, B:32:0x00be, B:38:0x00da, B:40:0x00e8, B:47:0x00e0, B:52:0x0098, B:74:0x00a9), top: B:11:0x0028, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(java.lang.String r23, org.json.JSONObject r24) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QKA.LJ(java.lang.String, org.json.JSONObject):boolean");
    }
}
