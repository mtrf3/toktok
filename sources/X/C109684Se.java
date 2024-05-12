package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4Se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109684Se {
    public EnumC109724Si LIZ;
    public C4T2 LIZIZ;
    public final java.util.Map<EnumC97443s4, Boolean> LIZJ;
    public final java.util.Map<EnumC97443s4, Boolean> LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public EnumC109754Sl LJII;

    public C109684Se() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109684Se)) {
            return false;
        }
        C109684Se c109684Se = (C109684Se) obj;
        return this.LIZ == c109684Se.LIZ && o.LJ(this.LIZIZ, c109684Se.LIZIZ) && o.LJ(this.LIZJ, c109684Se.LIZJ) && o.LJ(this.LIZLLL, c109684Se.LIZLLL) && this.LJ == c109684Se.LJ && this.LJFF == c109684Se.LJFF && this.LJI == c109684Se.LJI && this.LJII == c109684Se.LJII;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PageStatus(pageType=");
        LIZ.append(this.LIZ);
        LIZ.append(", pageMode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", pageEmptyStatus=");
        LIZ.append(this.LIZJ);
        LIZ.append(", fragmentHasShowStatus=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", currentActivePagePosition=");
        LIZ.append(this.LJ);
        LIZ.append(", selectedCount=");
        LIZ.append(this.LJFF);
        LIZ.append(", unreadCountInTitle=");
        LIZ.append(this.LJI);
        LIZ.append(", currentAction=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return this.LJII.hashCode() + ((((((C12400eC.LIZ(this.LIZLLL, C12400eC.LIZ(this.LIZJ, (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31, 31), 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31);
    }

    public C109684Se(Object obj) {
        EnumC109724Si pageType = EnumC109724Si.STRANGER_AND_FILTERED;
        C4T3 pageMode = C4T3.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        EnumC109754Sl currentAction = EnumC109754Sl.NONE;
        o.LJIIIZ(pageType, "pageType");
        o.LJIIIZ(pageMode, "pageMode");
        o.LJIIIZ(currentAction, "currentAction");
        this.LIZ = pageType;
        this.LIZIZ = pageMode;
        this.LIZJ = linkedHashMap;
        this.LIZLLL = linkedHashMap2;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = 0;
        this.LJII = currentAction;
    }

    public final void LIZ(EnumC109724Si enumC109724Si) {
        o.LJIIIZ(enumC109724Si, "<set-?>");
        this.LIZ = enumC109724Si;
    }
}
