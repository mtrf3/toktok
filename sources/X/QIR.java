package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIR extends QKR {
    public final Context LJ;
    public final QIF LJFF;

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        int i;
        String packageName = this.LJ.getPackageName();
        if (TextUtils.isEmpty(this.LJFF.LJ)) {
            jSONObject.put("package", packageName);
        } else {
            jSONObject.put("package", this.LJFF.LJ);
            jSONObject.put("real_package_name", packageName);
        }
        try {
            jSONObject.put("app_version", this.LJFF.LJ());
            jSONObject.put("app_version_minor", this.LJFF.LJIILLIIL.LIZIZ);
            jSONObject.put("version_code", this.LJFF.LJFF());
            jSONObject.put("update_version_code", this.LJFF.LIZLLL());
            jSONObject.put("manifest_version_code", this.LJFF.LIZIZ());
            if (!TextUtils.isEmpty(this.LJFF.LJFF)) {
                jSONObject.put("app_name", this.LJFF.LJFF);
            }
            if (!TextUtils.isEmpty(this.LJFF.LJII)) {
                jSONObject.put("tweaked_channel", this.LJFF.LJII);
            }
            try {
                ApplicationInfo applicationInfo = C16880lQ.LLLLLLZ(this.LJ.getPackageManager(), packageName, 0).applicationInfo;
                if (applicationInfo != null && (i = applicationInfo.labelRes) > 0) {
                    jSONObject.put("display_name", this.LJ.getString(i));
                    return true;
                }
                return true;
            } catch (Throwable unused) {
                return true;
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    public QIR(Context context, QIF qif) {
        super(false, false);
        this.LJ = context;
        this.LJFF = qif;
    }
}
