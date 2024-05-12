package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HRq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44078HRq {
    public static final List LIZ(Aweme aweme, List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "urlList");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String LIZ = C41823GbD.LIZ(aweme, (String) it.next());
            if (LIZ != null) {
                LJ.add(LIZ);
            }
        }
        return LJ;
    }
}
