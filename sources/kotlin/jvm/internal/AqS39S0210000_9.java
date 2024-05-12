package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C221018lt;
import X.C54262LRi;
import X.C76800UCe;
import X.C87277YNd;
import X.InterfaceC65784Pro;
import X.LVG;
import X.LVL;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class AqS39S0210000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS39S0210000_9 aqS39S0210000_9) {
        List<Integer> list;
        ArrayList arrayList = new ArrayList();
        int[] iArr = (int[]) aqS39S0210000_9.l0;
        boolean z = aqS39S0210000_9.z2;
        for (int i : iArr) {
            LVL.LJLIL.getClass();
            NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) LVL.LJJI().get(Integer.valueOf(C87277YNd.LJIJJLI(i)));
            if (noticeInboxFilterGroups != null && (list = noticeInboxFilterGroups.groups) != null && !z) {
                arrayList.addAll(list);
            } else {
                arrayList.add(Integer.valueOf(i));
            }
        }
        C54262LRi c54262LRi = new C54262LRi(1);
        LVG lvg = (LVG) aqS39S0210000_9.l1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            LVL.LJLIL.getClass();
            LVL.LJJ(intValue, lvg, c54262LRi);
        }
        c54262LRi.post();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clearNoticeCount end ");
        LIZ.append(c54262LRi);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS39S0210000_9 aqS39S0210000_9) {
        SmartRoute buildRoute;
        if (!aqS39S0210000_9.z2 && (buildRoute = SmartRouter.buildRoute((Context) aqS39S0210000_9.l0, ((Uri.Builder) aqS39S0210000_9.l1).toString())) != null) {
            buildRoute.open();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS39S0210000_9(LVG lvg, boolean z, int[] iArr, int i) {
        super(0);
        this.$t = i;
        this.l0 = iArr;
        this.z2 = z;
        this.l1 = lvg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS39S0210000_9(boolean z, Context context, Uri.Builder builder, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = context;
        this.l1 = builder;
    }
}
