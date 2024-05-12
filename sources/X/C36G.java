package X;

import Y.IDComparatorS29S0000000_1;
import Y.IDComparatorS334S0100000_1;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.36G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36G {
    public boolean LIZ;
    public List<String> LIZIZ;

    public final List<ActivityStatus> LIZ(List<ActivityStatus> list, boolean z) {
        Integer num;
        List<ActivityStatus> LLILII;
        C34B.LJI("MUFActivityStatusSortingManager", "sortActivityStatusList");
        if (z) {
            return ORZ.LLILII(new IDComparatorS29S0000000_1(1), list);
        }
        synchronized (this) {
            List<String> list2 = this.LIZIZ;
            if (list2 == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("repo_name_muf_activity_status");
                LIZ.append((Object) C80763Ey.LIZ(false));
                String[] stringArray = Keva.getRepo(X1D.LIZIZ(LIZ)).getStringArray("key_sorting", new String[0]);
                o.LJIIIIZZ(stringArray, "getRepo(repoName).getStr…mptyArray()\n            )");
                list2 = ORY.LJJZZIII(stringArray);
            }
            this.LIZIZ = list2;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sorted uid list size ");
            List<String> list3 = this.LIZIZ;
            if (list3 != null) {
                num = Integer.valueOf(list3.size());
            } else {
                num = null;
            }
            LIZ2.append(num);
            C34B.LJI("MUFActivityStatusSortingManager", X1D.LIZIZ(LIZ2));
            LLILII = ORZ.LLILII(new IDComparatorS334S0100000_1(list2, 0), list);
        }
        return LLILII;
    }
}
