package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class F30 implements Cloneable {
    public List LJLIL = new ArrayList(16);

    public final Object clone() {
        F30 f30 = (F30) super.clone();
        f30.LJLIL = new ArrayList(this.LJLIL);
        return f30;
    }

    public final InterfaceC61858OPm LIZ(String str) {
        for (int i = 0; i < ((ArrayList) this.LJLIL).size(); i++) {
            InterfaceC61858OPm interfaceC61858OPm = (InterfaceC61858OPm) ListProtector.get(this.LJLIL, i);
            if (interfaceC61858OPm.getName().equalsIgnoreCase(str)) {
                return interfaceC61858OPm;
            }
        }
        return null;
    }
}
