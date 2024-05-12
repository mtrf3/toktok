package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes9.dex */
public final class IQP {
    public final List<InterfaceC46330IGg> LIZ = new LinkedList();

    public final IWF LIZ() {
        if (((LinkedList) this.LIZ).size() >= 8) {
            InterfaceC46330IGg interfaceC46330IGg = (InterfaceC46330IGg) ListProtector.get(this.LIZ, ((LinkedList) r1).size() - 1);
            interfaceC46330IGg.LJJIIZ();
            interfaceC46330IGg.release();
            ListProtector.remove(this.LIZ, ((LinkedList) r1).size() - 1);
        }
        IWF iwf = new IWF();
        ((LinkedList) this.LIZ).add(iwf);
        return iwf;
    }
}
