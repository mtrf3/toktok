package X;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class E7P {
    public String LIZ;
    public String LIZIZ;
    public String[] LIZJ;

    public final void LIZ(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        String optString = jSONObject.optString("main_play_url");
        this.LIZ = optString;
        if (!TextUtils.isEmpty(optString)) {
            arrayList.add(this.LIZ);
        }
        String optString2 = jSONObject.optString("backup_play_url");
        this.LIZIZ = optString2;
        if (!TextUtils.isEmpty(optString2)) {
            arrayList.add(this.LIZIZ);
        }
        String[] strArr = new String[arrayList.size()];
        this.LIZJ = strArr;
        arrayList.toArray(strArr);
    }
}
