package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QJc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66788QJc {
    public final QIF LIZ;

    public C66788QJc(QIF qif) {
        this.LIZ = qif;
    }

    public final void LIZ(JSONObject jSONObject, C48852JFg c48852JFg) {
        Object obj;
        int i;
        if (c48852JFg.LJLIL) {
            jSONObject.put(WM7.SCENE_SERVICE, 2);
        }
        jSONObject.put("device_platform", "android");
        boolean booleanValue = PCK.LIZ.LIZIZ(new Object[0]).booleanValue();
        if (booleanValue) {
            obj = "Harmony";
        } else {
            obj = "Android";
        }
        try {
            jSONObject.put("os", obj);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (booleanValue) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("os_api", C58323Mul.LIZ("hw_sc.build.os.apiversion"));
                jSONObject2.put("os_version", C58323Mul.LIZ("hw_sc.build.platform.version"));
                jSONObject2.put("release_type", C58323Mul.LIZ("hw_sc.build.os.releasetype"));
            } catch (Throwable unused) {
            }
            try {
                jSONObject.put("harmony", jSONObject2);
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        jSONObject.put("git_hash", "93d850b");
        jSONObject.put("sdk_version_code", C66831QKt.LIZ);
        jSONObject.put("sdk_target_version", 30);
        jSONObject.put("req_id", QJJ.LIZ.LIZIZ(new Object[0]));
        jSONObject.put("sdk_version", "4.3.1-rc.24-tt");
        jSONObject.put("guest_mode", this.LIZ.LJIJI ? 1 : 0);
        jSONObject.put("sdk_flavor", "i18nInner");
        QIF qif = this.LIZ;
        if (C48847JFb.LIZ(qif.LIZJ, qif).getBoolean("is_migrate", false)) {
            QIF qif2 = this.LIZ;
            String string = C48847JFb.LIZ(qif2.LIZJ, qif2).getString("old_did", null);
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            try {
                jSONObject.put("old_did", string);
            } catch (JSONException e3) {
                C16880lQ.LLLLIIL(e3);
            }
        }
        Context context = this.LIZ.LIZJ;
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0);
            if (LLLLLLZ != null) {
                jSONObject.put("apk_first_install_time", LLLLLLZ.firstInstallTime);
                if ((LLLLLLZ.applicationInfo.flags & 1) == 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("is_system_app", i);
            }
        } catch (Throwable unused2) {
        }
        QJI qji = (QJI) JFZ.LIZ(QJI.class, String.valueOf(this.LIZ.LIZ));
        if (qji != null) {
            qji.LJ();
        }
        QIF qif3 = this.LIZ;
        C66808QJw LIZLLL = C66789QJd.LIZIZ().LIZLLL(qif3.LIZ);
        C66809QJx LIZ = C66789QJd.LIZIZ().LIZ(qif3.LIZ);
        if (c48852JFg.LJLIL) {
            LIZLLL.LJLJL = 2;
            LIZ.LJLJJLL = 2;
        } else if (qif3.LJIJI) {
            LIZLLL.LJLJL = 1;
            LIZ.LJLJJLL = 1;
        } else {
            LIZLLL.LJLJL = 0;
            LIZ.LJLJJLL = 0;
        }
        if (qji != null) {
            LIZLLL.LJLJJLL = qji.LIZIZ() ? 1 : 0;
            LIZ.LJLJJL = qji.LIZIZ() ? 1 : 0;
        }
    }
}
