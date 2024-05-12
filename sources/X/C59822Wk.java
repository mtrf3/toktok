package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Wk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59822Wk {
    public static List LIZ(List list, List list2) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            ArrayList arrayList2 = (ArrayList) list2;
            if (arrayList2.isEmpty() || C78996UzQ.LJJI(aweme, list2) < 0) {
                arrayList2.add(aweme);
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }
}
