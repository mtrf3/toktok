package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.VGt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79467VGt extends AbstractC79468VGu {
    @Override // X.AbstractC79468VGu
    public final boolean LIZ(String str, List<String> list) {
        if (list == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        return list.contains(str);
    }
}
