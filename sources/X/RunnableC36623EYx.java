package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.common.util.NetworkUtils;
import org.json.JSONObject;

/* renamed from: X.EYx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RunnableC36623EYx implements Runnable {
    public final String[] LJLIL;

    public final void LIZ() {
        String[] strArr = this.LJLIL;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        try {
            String str = strArr[0];
            String str2 = strArr[1];
            String str3 = strArr[2];
            String str4 = strArr[3];
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Logger.debug();
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("did", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("id", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("url", str4);
            }
            if (!"success".equals(new JSONObject(NetworkUtils.executePost(-1, str, jSONObject.toString().getBytes("UTF-8"), EnumC36624EYy.GZIP, "application/json")).optString("message"))) {
                return;
            }
            Logger.debug();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC36623EYx(String[] strArr) {
        this.LJLIL = strArr;
    }
}
