package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes9.dex */
public final class IQS {
    public final List<InterfaceC46330IGg> LIZ = new LinkedList();
    public final java.util.Map<Integer, List<C48881JGj>> LIZIZ = new HashMap();

    public final IWF LIZ() {
        int i = 4;
        if (C00F.LIZ(31744, 4, "player_search_max_player_cnt", false) != 4) {
            int LIZ = C00F.LIZ(31744, 4, "player_search_max_player_cnt", false);
            if (LIZ > 0 && LIZ <= 4) {
                i = LIZ;
            }
            if (((LinkedList) this.LIZ).size() >= i) {
                InterfaceC46330IGg interfaceC46330IGg = (InterfaceC46330IGg) ListProtector.get(this.LIZ, 0);
                interfaceC46330IGg.LJJIIZ();
                interfaceC46330IGg.release();
                ListProtector.remove(this.LIZ, 0);
            }
        } else if (((LinkedList) this.LIZ).size() >= 4) {
            InterfaceC46330IGg interfaceC46330IGg2 = (InterfaceC46330IGg) ListProtector.get(this.LIZ, ((LinkedList) r1).size() - 1);
            interfaceC46330IGg2.LJJIIZ();
            interfaceC46330IGg2.release();
            ListProtector.remove(this.LIZ, ((LinkedList) r1).size() - 1);
        }
        IWF iwf = new IWF();
        ((LinkedList) this.LIZ).add(iwf);
        return iwf;
    }
}
