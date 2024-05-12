package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ias, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46898Ias {
    public int LIZ;
    public Object LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final boolean LIZ(Object obj) {
        if (obj != null) {
            try {
                switch (this.LIZJ) {
                    case 1:
                        this.LIZIZ = Integer.valueOf(CastIntegerProtector.parseInt(obj.toString()));
                        break;
                    case 2:
                        this.LIZIZ = Long.valueOf(CastLongProtector.parseLong(obj.toString()));
                        break;
                    case 3:
                        this.LIZIZ = Float.valueOf(CastFloatProtector.parseFloat(obj.toString()));
                        break;
                    case 4:
                        this.LIZIZ = obj.toString();
                        break;
                    case 5:
                        this.LIZIZ = new JSONObject((String) obj);
                        break;
                    case 6:
                        this.LIZIZ = new JSONArray((String) obj);
                        break;
                }
            } catch (Exception unused) {
            }
        }
        if (this.LIZIZ != null) {
            return true;
        }
        return false;
    }
}
