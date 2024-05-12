package X;

import android.view.View;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.KzQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53516KzQ {
    public final View LIZ;
    public final String LIZIZ;
    public final Integer LIZJ = null;
    public final Integer LIZLLL = null;
    public final int LJ;
    public final int LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53516KzQ)) {
            return false;
        }
        C53516KzQ c53516KzQ = (C53516KzQ) obj;
        return o.LJ(this.LIZ, c53516KzQ.LIZ) && o.LJ(this.LIZIZ, c53516KzQ.LIZIZ) && o.LJ(this.LIZJ, c53516KzQ.LIZJ) && o.LJ(this.LIZLLL, c53516KzQ.LIZLLL) && this.LJ == c53516KzQ.LJ && this.LJFF == c53516KzQ.LJFF && this.LJI == c53516KzQ.LJI;
    }

    public final int hashCode() {
        View view = this.LIZ;
        int hashCode = (view == null ? 0 : view.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        return ((((((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MovingReminderAnimationData(view=");
        LIZ.append(this.LIZ);
        LIZ.append(", reminderText=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", starIconRes=");
        LIZ.append(this.LIZJ);
        LIZ.append(", endIconRes=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", gravity=");
        LIZ.append(this.LJ);
        LIZ.append(", paddingStart=");
        LIZ.append(this.LJFF);
        LIZ.append(", paddingEnd=");
        return b0.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public C53516KzQ(View view, String str, int i, int i2, int i3) {
        this.LIZ = view;
        this.LIZIZ = str;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
    }
}
