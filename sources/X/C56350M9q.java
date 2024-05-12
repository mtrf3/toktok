package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.M9q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56350M9q {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
        boolean LJIJI = C54838Lfe.LJIJI(c55723Ltv.LJIL().LJI());
        if (!c55723Ltv.LIZ().shouldShowShootingEntrance(false, false)) {
            return false;
        }
        if ((!c55723Ltv.LJIILJJIL().LIZIZ() && !LJIJI) || !c55723Ltv.LIZ().canShowStoryCell()) {
            return false;
        }
        return true;
    }

    public static List LIZIZ(SkylightDataResponse skylightDataResponse) {
        List<SkylightData> dataList;
        ArrayList arrayList = new ArrayList();
        if (skylightDataResponse != null && (dataList = skylightDataResponse.getDataList()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (SkylightData skylightData : dataList) {
                if (skylightData.getBizType() == 1) {
                    arrayList2.add(skylightData);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C116094h3 LIZJ = LIZJ((SkylightData) it.next());
                if (LIZJ != null) {
                    arrayList.add(LIZJ);
                }
            }
        }
        return arrayList;
    }

    public static C116094h3 LIZJ(SkylightData skylightData) {
        o.LJIIIZ(skylightData, "skylightData");
        if (skylightData.getBizType() == 1) {
            return new C116094h3(skylightData);
        }
        return null;
    }
}
