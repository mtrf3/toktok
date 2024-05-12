package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62562cu {
    public List<String> LIZ = new ArrayList();

    public final boolean LIZ() {
        List<String> list = this.LIZ;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseImageUrlModel{mUrls=");
        return C1NE.LIZIZ(LIZ, this.LIZ, '}', LIZ);
    }

    public C62562cu(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                this.LIZ.add(str);
            }
        }
    }
}
