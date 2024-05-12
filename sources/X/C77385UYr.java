package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UYr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77385UYr implements InterfaceC77388UYu {
    public final /* synthetic */ C82622Wbi LIZ;

    public C77385UYr(C82622Wbi c82622Wbi) {
        this.LIZ = c82622Wbi;
    }

    @Override // X.InterfaceC77388UYu
    public final void LIZ(C83683Qe c83683Qe, Object obj, boolean z) {
        List list;
        if (((HashMap) this.LIZ.LJIIIZ).size() != 0 && !((HashSet) this.LIZ.LJIIJ).contains(c83683Qe) && (list = (List) ((HashMap) this.LIZ.LJIIIZ).get(c83683Qe)) != null && list.size() > 0) {
            if (list.size() == 1) {
                ((InterfaceC77386UYs) ListProtector.get(list, 0)).LIZ((Class) c83683Qe.LIZ, obj, z);
                return;
            }
            Iterator it = new ArrayList(list).iterator();
            while (it.hasNext()) {
                ((InterfaceC77386UYs) it.next()).LIZ((Class) c83683Qe.LIZ, obj, z);
            }
        }
    }
}
