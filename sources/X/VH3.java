package X;

import android.text.TextUtils;
import java.util.List;

/* loaded from: classes15.dex */
public class VH3 extends VH4 {
    @Override // X.VH4
    public final boolean LIZ(String str, List<String> list) {
        if (list == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        return list.contains(str);
    }
}
