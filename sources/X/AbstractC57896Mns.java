package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mns, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC57896Mns {
    public static final EnumC58046MqI[] LJFF = {EnumC58046MqI.CONTACT, EnumC58046MqI.FACEBOOK};
    public final EnumC58046MqI[] LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;

    public int LIZIZ(boolean z) {
        return 0;
    }

    public final List<C57900Mnw> LIZ() {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            EnumC58046MqI[] enumC58046MqIArr = this.LIZ;
            ArrayList arrayList = new ArrayList(enumC58046MqIArr.length);
            for (EnumC58046MqI enumC58046MqI : enumC58046MqIArr) {
                arrayList.add(new C57900Mnw(enumC58046MqI, this, this.LIZIZ));
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    public AbstractC57896Mns(EnumC58046MqI[] enumC58046MqIArr, boolean z, boolean z2, boolean z3, InterfaceC65784Pro interfaceC65784Pro, int i) {
        enumC58046MqIArr = (i & 1) != 0 ? LJFF : enumC58046MqIArr;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        z3 = (i & 8) != 0 ? false : z3;
        interfaceC65784Pro = (i & 16) != 0 ? C34430DfG.LJLIL : interfaceC65784Pro;
        this.LIZ = enumC58046MqIArr;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = interfaceC65784Pro;
    }
}
