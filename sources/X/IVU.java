package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import defpackage.b0;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IVU implements Serializable {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimVideoFrameOffset{frame=");
        LIZ.append(this.LJLIL);
        LIZ.append(", time=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", offset=");
        return b0.LIZJ(LIZ, this.LJLJI, '}', LIZ);
    }

    public int getFrame() {
        return this.LJLIL;
    }

    public int getOffset() {
        return this.LJLJI;
    }

    public int getTime() {
        return this.LJLILLLLZI;
    }

    public static IVU[] fromJSON(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            IVU[] ivuArr = new IVU[length];
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                ivuArr[i] = new IVU(jSONObject.optInt("frame", 0), jSONObject.optInt("time", 0), jSONObject.optInt("offset", 0));
            }
            return ivuArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void setFrame(int i) {
        this.LJLIL = i;
    }

    public void setOffset(int i) {
        this.LJLJI = i;
    }

    public void setTime(int i) {
        this.LJLILLLLZI = i;
    }

    public IVU(int i, int i2, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }
}
