package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QH3 {
    public static final long LIZLLL = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public static QH3 LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new QH3(JSONObjectProtectorUtils.getString(jSONObject, "token"), JSONObjectProtectorUtils.getString(jSONObject, "appVersion"), JSONObjectProtectorUtils.getLong(jSONObject, "timestamp"));
            } catch (JSONException unused) {
                return null;
            }
        }
        return new QH3(str, null, 0L);
    }

    public QH3(String str, String str2, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
    }
}
