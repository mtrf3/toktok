package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AnZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27301AnZ {
    public static final String LIZ(Object obj, String separator) {
        List<Region> list;
        String str;
        o.LJIIIZ(separator, "separator");
        if (!(obj instanceof List) || (list = (List) obj) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Region region : list) {
            if (region == null || ((str = region.code) == null && (str = region.name) == null)) {
                str = "";
            }
            arrayList.add(str);
        }
        return ORZ.LLD(arrayList, separator, null, null, C27300AnY.LJLIL, 30);
    }
}
