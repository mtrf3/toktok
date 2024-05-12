package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OU2 extends QKR {
    public final Context LJ;

    public OU2(Context context) {
        super(true, false);
        this.LJ = context;
    }

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        Signature[] signatureArr;
        Signature signature;
        byte[] byteArray;
        String str = null;
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(this.LJ.getPackageManager(), this.LJ.getPackageName(), 64);
            if (LLLLLLZ != null && (signatureArr = LLLLLLZ.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null && (byteArray = signature.toByteArray()) != null) {
                if (byteArray.length != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(byteArray);
                    str = C73040SlY.LJIIIZ(messageDigest.digest());
                    if (str != null) {
                        jSONObject.put("sig_hash", str);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
