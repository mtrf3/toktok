package X;

import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS32S1000000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mmw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57838Mmw {
    public final Fragment LIZ;
    public final ActivityC45651qj LIZIZ;
    public final AbstractC57896Mns LIZJ;
    public final InterfaceC88472Yns<C57819Mmd, C76800UCe> LIZLLL;
    public final Integer LJ;
    public final C26421AYn LJFF;
    public final InterfaceC88472Yns<AbstractC57828Mmm<?>, C76800UCe> LJI;

    public C57838Mmw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57838Mmw)) {
            return false;
        }
        C57838Mmw c57838Mmw = (C57838Mmw) obj;
        return o.LJ(this.LIZ, c57838Mmw.LIZ) && o.LJ(this.LIZIZ, c57838Mmw.LIZIZ) && o.LJ(this.LIZJ, c57838Mmw.LIZJ) && o.LJ(this.LIZLLL, c57838Mmw.LIZLLL) && o.LJ(this.LJ, c57838Mmw.LJ) && o.LJ(this.LJFF, c57838Mmw.LJFF) && o.LJ(this.LJI, c57838Mmw.LJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Fragment fragment = this.LIZ;
        int i = 0;
        if (fragment == null) {
            hashCode = 0;
        } else {
            hashCode = fragment.hashCode();
        }
        int i2 = hashCode * 31;
        ActivityC45651qj activityC45651qj = this.LIZIZ;
        if (activityC45651qj == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = activityC45651qj.hashCode();
        }
        int LIZIZ = QZY.LIZIZ(this.LIZLLL, (this.LIZJ.hashCode() + ((i2 + hashCode2) * 31)) * 31, 31);
        Integer num = this.LJ;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i3 = (LIZIZ + hashCode3) * 31;
        C26421AYn c26421AYn = this.LJFF;
        if (c26421AYn == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c26421AYn.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        InterfaceC88472Yns<AbstractC57828Mmm<?>, C76800UCe> interfaceC88472Yns = this.LJI;
        if (interfaceC88472Yns != null) {
            i = interfaceC88472Yns.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthCardAdapterConfig(fragment=");
        LIZ.append(this.LIZ);
        LIZ.append(", hostActivity=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", strategy=");
        LIZ.append(this.LIZJ);
        LIZ.append(", configTracker=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", titleRes=");
        LIZ.append(this.LJ);
        LIZ.append(", footer=");
        LIZ.append(this.LJFF);
        LIZ.append(", onCellAction=");
        return C249109q6.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C57838Mmw(Fragment fragment, AbstractC57896Mns strategy, AqS32S1000000_9 aqS32S1000000_9, C26421AYn c26421AYn, AqS175S0100000_9 aqS175S0100000_9) {
        Integer valueOf = Integer.valueOf(R.string.puu);
        o.LJIIIZ(strategy, "strategy");
        this.LIZ = fragment;
        this.LIZIZ = null;
        this.LIZJ = strategy;
        this.LIZLLL = aqS32S1000000_9;
        this.LJ = valueOf;
        this.LJFF = c26421AYn;
        this.LJI = aqS175S0100000_9;
    }
}
