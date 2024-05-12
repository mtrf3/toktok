package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.util.List;

/* loaded from: classes15.dex */
public class VH2 extends VH4 {
    public VH2(VH3 vh3) {
        this.LIZ = vh3;
    }

    @Override // X.VH4
    public final boolean LIZ(String str, List<String> list) {
        if (list == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        if (list.size() != 2) {
            return this.LIZ.LIZ(str, list);
        }
        try {
            float parseFloat = CastFloatProtector.parseFloat(str);
            float parseFloat2 = CastFloatProtector.parseFloat((String) ListProtector.get(list, 0));
            float parseFloat3 = CastFloatProtector.parseFloat((String) ListProtector.get(list, 1));
            if (parseFloat2 >= parseFloat3 || (Math.abs(parseFloat2 % 1.0f) - 0.0f <= 1.0E-4f && Math.abs(parseFloat3 % 1.0f) - 0.0f <= 1.0E-4f)) {
                return this.LIZ.LIZ(str, list);
            }
            if (parseFloat < parseFloat2 || parseFloat > parseFloat3) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return this.LIZ.LIZ(str, list);
        }
    }
}
