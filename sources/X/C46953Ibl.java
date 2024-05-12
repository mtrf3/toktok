package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.Ibl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46953Ibl extends AbstractC46959Ibr {
    public InterfaceC46926IbK LIZ() {
        C46946Ibe c46946Ibe = new C46946Ibe(this.LIZ);
        List<? extends InterfaceC46969Ic1> list = this.LIZIZ;
        c46946Ibe.LIZIZ = list;
        c46946Ibe.LIZJ = this.LIZJ;
        c46946Ibe.LIZLLL = this.LIZLLL;
        if (list != null && !list.isEmpty()) {
            c46946Ibe.LJ = new C46958Ibq[list.size()];
            for (int i = 0; i < list.size(); i++) {
                InterfaceC46969Ic1 interfaceC46969Ic1 = (InterfaceC46969Ic1) ListProtector.get(list, i);
                c46946Ibe.LJ[i] = new C46958Ibq(interfaceC46969Ic1.getBitRate(), interfaceC46969Ic1.getNetworkLower() * 8000.0d, 8000.0d * interfaceC46969Ic1.getNetworkUpper());
            }
        }
        return c46946Ibe;
    }

    public C46953Ibl(InterfaceC46949Ibh interfaceC46949Ibh) {
        super(interfaceC46949Ibh);
    }
}
