package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.3sD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97533sD extends AbstractC97583sI {
    public final InterfaceC97573sH LIZIZ;
    public final InterfaceC97573sH LIZJ;
    public final InterfaceC97573sH LIZLLL;
    public final String LJ;

    public final int hashCode() {
        return this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + (this.LIZIZ.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UiType1(title=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", description=");
        LIZ.append(this.LIZJ);
        LIZ.append(", buttonText=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", eventPopUpType=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    @Override // X.AbstractC97583sI
    public final String LIZ() {
        return this.LJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C97533sD)) {
            return false;
        }
        C97533sD c97533sD = (C97533sD) obj;
        if (o.LJ(this.LIZIZ, c97533sD.LIZIZ) && o.LJ(this.LIZJ, c97533sD.LIZJ) && o.LJ(this.LIZLLL, c97533sD.LIZLLL) && o.LJ(this.LJ, c97533sD.LJ)) {
            return true;
        }
        return false;
    }

    public C97533sD(C97553sF c97553sF, C97553sF c97553sF2, InterfaceC97573sH interfaceC97573sH, String str) {
        super(str);
        this.LIZIZ = c97553sF;
        this.LIZJ = c97553sF2;
        this.LIZLLL = interfaceC97573sH;
        this.LJ = str;
    }
}
