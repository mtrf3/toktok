package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OoU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63030OoU {
    public final String LIZ;
    public final CharSequence LIZIZ;
    public final C63031OoV LIZJ;
    public final C63031OoV LIZLLL;
    public final C63031OoV LJ;
    public final C63035OoZ LJFF;
    public final InterfaceC65784Pro<C76800UCe> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63030OoU)) {
            return false;
        }
        C63030OoU c63030OoU = (C63030OoU) obj;
        return o.LJ(this.LIZ, c63030OoU.LIZ) && o.LJ(this.LIZIZ, c63030OoU.LIZIZ) && o.LJ(this.LIZJ, c63030OoU.LIZJ) && o.LJ(this.LIZLLL, c63030OoU.LIZLLL) && o.LJ(this.LJ, c63030OoU.LJ) && o.LJ(this.LJFF, c63030OoU.LJFF) && o.LJ(this.LJI, c63030OoU.LJI);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        C63031OoV c63031OoV = this.LIZJ;
        int hashCode2 = (hashCode + (c63031OoV == null ? 0 : c63031OoV.hashCode())) * 31;
        C63031OoV c63031OoV2 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (c63031OoV2 == null ? 0 : c63031OoV2.hashCode())) * 31;
        C63031OoV c63031OoV3 = this.LJ;
        int hashCode4 = (hashCode3 + (c63031OoV3 == null ? 0 : c63031OoV3.hashCode())) * 31;
        C63035OoZ c63035OoZ = this.LJFF;
        int hashCode5 = (hashCode4 + (c63035OoZ == null ? 0 : c63035OoZ.hashCode())) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJI;
        return hashCode5 + (interfaceC65784Pro != null ? interfaceC65784Pro.hashCode() : 0);
    }

    public C63030OoU() {
        this("", "", null, null, null, null, null);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AppealDialogViewState(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", message=");
        LIZ.append((Object) this.LIZIZ);
        LIZ.append(", firstButtonState=");
        LIZ.append(this.LIZJ);
        LIZ.append(", secondButtonState=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", thirdButtonState=");
        LIZ.append(this.LJ);
        LIZ.append(", linkState=");
        LIZ.append(this.LJFF);
        LIZ.append(", dialogShowEventTracker=");
        return C06540Nm.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public C63030OoU(String title, CharSequence message, C63031OoV c63031OoV, C63031OoV c63031OoV2, C63031OoV c63031OoV3, C63035OoZ c63035OoZ, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(message, "message");
        this.LIZ = title;
        this.LIZIZ = message;
        this.LIZJ = c63031OoV;
        this.LIZLLL = c63031OoV2;
        this.LJ = c63031OoV3;
        this.LJFF = c63035OoZ;
        this.LJI = interfaceC65784Pro;
    }
}
