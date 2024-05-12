package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.VuZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81243VuZ {
    public final View LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81243VuZ)) {
            return false;
        }
        C81243VuZ c81243VuZ = (C81243VuZ) obj;
        return o.LJ(this.LIZ, c81243VuZ.LIZ) && this.LIZIZ == c81243VuZ.LIZIZ && this.LIZJ == c81243VuZ.LIZJ && o.LJ(this.LIZLLL, c81243VuZ.LIZLLL) && o.LJ(this.LJ, c81243VuZ.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        View view = this.LIZ;
        if (view == null) {
            hashCode = 0;
        } else {
            hashCode = view.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.LIZIZ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i + i3) * 31;
        if (!this.LIZJ) {
            i2 = 0;
        }
        return this.LJ.hashCode() + C1JX.LIZLLL(this.LIZLLL, (i4 + i2) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordSpeedGroupViewParams(anchorView=");
        LIZ.append(this.LIZ);
        LIZ.append(", isDuet=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isUgcTemplateFromAnchor=");
        LIZ.append(this.LIZJ);
        LIZ.append(", hideAnimEndCallback=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", onTouchUpOutsideCallback=");
        return C06540Nm.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public /* synthetic */ C81243VuZ(View view, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i) {
        this((i & 1) != 0 ? null : view, false, false, interfaceC65784Pro, interfaceC65784Pro2);
    }

    public C81243VuZ(View view, boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> hideAnimEndCallback, InterfaceC65784Pro<C76800UCe> onTouchUpOutsideCallback) {
        o.LJIIIZ(hideAnimEndCallback, "hideAnimEndCallback");
        o.LJIIIZ(onTouchUpOutsideCallback, "onTouchUpOutsideCallback");
        this.LIZ = view;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = hideAnimEndCallback;
        this.LJ = onTouchUpOutsideCallback;
    }
}
