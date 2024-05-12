package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.CMo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31206CMo {
    public final java.util.Map<Integer, List<AbstractC31208CMq>> LIZ;

    public C31206CMo() {
        HashMap hashMap = new HashMap();
        this.LIZ = hashMap;
        hashMap.put(0, new CopyOnWriteArrayList());
        hashMap.put(1, new CopyOnWriteArrayList());
        hashMap.put(2, new CopyOnWriteArrayList());
    }

    public final void LIZ(AbstractC31208CMq abstractC31208CMq) {
        if (abstractC31208CMq.getClass().getAnnotation(InterfaceC30950CCs.class) != null) {
            ((List) ((HashMap) this.LIZ).get(2)).add(abstractC31208CMq);
        } else {
            ((List) ((HashMap) this.LIZ).get(1)).add(abstractC31208CMq);
        }
    }

    public final void LIZIZ(int i) {
        List list = (List) ((HashMap) this.LIZ).get(Integer.valueOf(i));
        if (list != null) {
            while (list.size() > 0) {
                AbstractC31208CMq abstractC31208CMq = (AbstractC31208CMq) ListProtector.remove(list, 0);
                if (abstractC31208CMq != null) {
                    abstractC31208CMq.start();
                }
            }
        }
    }
}
