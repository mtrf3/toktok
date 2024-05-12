package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TAZ implements InterfaceC65778Pri, Serializable {
    public final Class LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final Object receiver;

    public InterfaceC36731EbH getOwner() {
        Class cls = this.LJLIL;
        if (cls == null) {
            return null;
        }
        if (this.LJLJJI) {
            C65352Pkq.LIZ.getClass();
            return new C65353Pkr(cls, "");
        }
        return C65352Pkq.LIZ(cls);
    }

    public int hashCode() {
        int i;
        int i2;
        Object obj = this.receiver;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Class cls = this.LJLIL;
        if (cls != null) {
            i3 = cls.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, (i4 + i3) * 31, 31), 31);
        if (this.LJLJJI) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((LJ + i2) * 31) + this.LJLJJL) * 31) + this.LJLJJLL;
    }

    public String toString() {
        C65352Pkq.LIZ.getClass();
        return C65351Pkp.LIZ(this);
    }

    @Override // X.InterfaceC65778Pri
    public int getArity() {
        return this.LJLJJL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TAZ)) {
            return false;
        }
        TAZ taz = (TAZ) obj;
        if (this.LJLJJI == taz.LJLJJI && this.LJLJJL == taz.LJLJJL && this.LJLJJLL == taz.LJLJJLL && o.LJ(this.receiver, taz.receiver) && o.LJ(this.LJLIL, taz.LJLIL) && this.LJLILLLLZI.equals(taz.LJLILLLLZI) && this.LJLJI.equals(taz.LJLJI)) {
            return true;
        }
        return false;
    }

    public TAZ(int i, Class cls, String str, String str2, int i2) {
        this(i, AbstractC74233TBl.NO_RECEIVER, cls, str, str2, i2);
    }

    public TAZ(int i, Object obj, Class cls, String str, String str2, int i2) {
        boolean z;
        this.receiver = obj;
        this.LJLIL = cls;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        if ((i2 & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJI = z;
        this.LJLJJL = i;
        this.LJLJJLL = i2 >> 1;
    }
}
