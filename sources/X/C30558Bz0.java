package X;

import android.app.Dialog;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Bz0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30558Bz0 implements Comparable<C30558Bz0> {
    public final Dialog LJLIL;
    public final EnumC30559Bz1 LJLILLLLZI;
    public final long LJLJI;
    public final InterfaceC30406BwY LJLJJI;
    public final String LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30558Bz0)) {
            return false;
        }
        C30558Bz0 c30558Bz0 = (C30558Bz0) obj;
        return o.LJ(this.LJLIL, c30558Bz0.LJLIL) && this.LJLILLLLZI == c30558Bz0.LJLILLLLZI && this.LJLJI == c30558Bz0.LJLJI && o.LJ(this.LJLJJI, c30558Bz0.LJLJJI) && o.LJ(this.LJLJJL, c30558Bz0.LJLJJL);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LJLJI, (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31, 31);
        InterfaceC30406BwY interfaceC30406BwY = this.LJLJJI;
        int i = 0;
        if (interfaceC30406BwY == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC30406BwY.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        String str = this.LJLJJL;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DialogWithTimestamp(toShowDialog=");
        LIZ.append(this.LJLIL);
        LIZ.append(", priority=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", index=");
        LIZ.append(this.LJLJI);
        LIZ.append(", callBack=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", dialogTag=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C30558Bz0 c30558Bz0) {
        C30558Bz0 other = c30558Bz0;
        o.LJIIIZ(other, "other");
        if (this.LJLILLLLZI.getPriorityInt() == other.LJLILLLLZI.getPriorityInt()) {
            return (int) (this.LJLJI - other.LJLJI);
        }
        return other.LJLILLLLZI.getPriorityInt() - this.LJLILLLLZI.getPriorityInt();
    }

    public C30558Bz0(Dialog dialog, EnumC30559Bz1 priority, long j, InterfaceC30406BwY interfaceC30406BwY, String str) {
        o.LJIIIZ(priority, "priority");
        this.LJLIL = dialog;
        this.LJLILLLLZI = priority;
        this.LJLJI = j;
        this.LJLJJI = interfaceC30406BwY;
        this.LJLJJL = str;
    }
}
