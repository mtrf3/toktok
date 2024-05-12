package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: X.NqS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60604NqS extends QKR {
    public final Context LJ;

    public C60604NqS(Context context) {
        super(true, false);
        this.LJ = context;
    }

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        try {
            Bundle bundle = C16880lQ.LLLLLLLLL(this.LJ.getPackageManager(), this.LJ.getPackageName(), 128).metaData;
            if (bundle != null) {
                jSONObject.put("appkey", bundle.getString("UMENG_APPKEY"));
                return true;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            return true;
        }
    }
}
