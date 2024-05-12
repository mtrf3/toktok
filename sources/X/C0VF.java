package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0VF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VF {
    public final C08440Uu LIZ;
    public final C08370Un LIZIZ;
    public final List<C08410Ur<C0V4>> LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final InterfaceC23370vt LJI;
    public final EnumC23500w6 LJII;
    public final InterfaceC13480fw LJIIIIZZ;
    public final long LJIIIZ;

    public C0VF() {
        throw null;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LJIIIZ) + ((this.LJIIIIZZ.hashCode() + ((this.LJII.hashCode() + ((this.LJI.hashCode() + ((C07250Qf.LIZ(this.LJ, (AnonymousClass391.LIZIZ(this.LIZJ, C67981Qm9.LIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31) + this.LIZLLL) * 31, 31) + this.LJFF) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextLayoutInput(text=");
        LIZ.append((Object) this.LIZ);
        LIZ.append(", style=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", placeholders=");
        LIZ.append(this.LIZJ);
        LIZ.append(", maxLines=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", softWrap=");
        LIZ.append(this.LJ);
        LIZ.append(", overflow=");
        int i = this.LJFF;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = "Invalid";
        }
        LIZ.append((Object) str);
        LIZ.append(", density=");
        LIZ.append(this.LJI);
        LIZ.append(", layoutDirection=");
        LIZ.append(this.LJII);
        LIZ.append(", fontFamilyResolver=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", constraints=");
        LIZ.append((Object) C23360vs.LJIIJ(this.LJIIIZ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VF)) {
            return false;
        }
        C0VF c0vf = (C0VF) obj;
        if (o.LJ(this.LIZ, c0vf.LIZ) && o.LJ(this.LIZIZ, c0vf.LIZIZ) && o.LJ(this.LIZJ, c0vf.LIZJ) && this.LIZLLL == c0vf.LIZLLL && this.LJ == c0vf.LJ && this.LJFF == c0vf.LJFF && o.LJ(this.LJI, c0vf.LJI) && this.LJII == c0vf.LJII && o.LJ(this.LJIIIIZZ, c0vf.LJIIIIZZ) && C23360vs.LIZIZ(this.LJIIIZ, c0vf.LJIIIZ)) {
            return true;
        }
        return false;
    }

    public C0VF(C08440Uu c08440Uu, C08370Un c08370Un, List list, int i, boolean z, int i2, InterfaceC23370vt interfaceC23370vt, EnumC23500w6 enumC23500w6, InterfaceC13480fw interfaceC13480fw, long j) {
        this.LIZ = c08440Uu;
        this.LIZIZ = c08370Un;
        this.LIZJ = list;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = i2;
        this.LJI = interfaceC23370vt;
        this.LJII = enumC23500w6;
        this.LJIIIIZZ = interfaceC13480fw;
        this.LJIIIZ = j;
    }
}
