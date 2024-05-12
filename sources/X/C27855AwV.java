package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AwV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27855AwV {
    public static boolean LIZ(List list) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = ((ShopOrderNew) it.next()).productType;
            if (num != null && num.intValue() == 1) {
                return true;
            }
        }
        return false;
    }
}
