package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.QZw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67224QZw {
    public final Bundle LIZ;

    public final Bundle LJI() {
        Bundle bundle = new Bundle(this.LIZ);
        for (String str : this.LIZ.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public C67224QZw(Bundle bundle) {
        this.LIZ = new Bundle(bundle);
    }

    public static boolean LJFF(Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return true;
        }
        return false;
    }

    public final boolean LIZ(String str) {
        String LJ = LJ(str);
        if ("1".equals(LJ) || Boolean.parseBoolean(LJ)) {
            return true;
        }
        return false;
    }

    public final Integer LIZIZ(String str) {
        String LJ = LJ(str);
        if (!TextUtils.isEmpty(LJ)) {
            try {
                return Integer.valueOf(CastIntegerProtector.parseInt(LJ));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public final JSONArray LIZJ(String str) {
        String LJ = LJ(str);
        if (!TextUtils.isEmpty(LJ)) {
            try {
                return new JSONArray(LJ);
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public final String LJ(String str) {
        String replace;
        Bundle bundle = this.LIZ;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (this.LIZ.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final String LIZLLL(Resources resources, String str, String str2) {
        int identifier;
        String[] strArr;
        String LJ = LJ(str2);
        if (!TextUtils.isEmpty(LJ)) {
            return LJ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str2);
        LIZ.append("_loc_key");
        String LJ2 = LJ(X1D.LIZIZ(LIZ));
        String str3 = null;
        if (TextUtils.isEmpty(LJ2) || (identifier = resources.getIdentifier(LJ2, "string", str)) == 0) {
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str2);
        LIZ2.append("_loc_args");
        JSONArray LIZJ = LIZJ(X1D.LIZIZ(LIZ2));
        if (LIZJ == null) {
            strArr = null;
        } else {
            int length = LIZJ.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = LIZJ.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            str3 = resources.getString(identifier, strArr);
            return str3;
        } catch (MissingFormatArgumentException unused) {
            return str3;
        }
    }
}
