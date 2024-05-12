package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.3sE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97543sE extends AbstractC97583sI {
    public final InterfaceC97573sH LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return this.LIZJ.hashCode() + (this.LIZIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UiType2(title=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", eventPopUpType=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    @Override // X.AbstractC97583sI
    public final String LIZ() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C97543sE)) {
            return false;
        }
        C97543sE c97543sE = (C97543sE) obj;
        if (o.LJ(this.LIZIZ, c97543sE.LIZIZ) && o.LJ(this.LIZJ, c97543sE.LIZJ)) {
            return true;
        }
        return false;
    }

    public C97543sE(C97553sF c97553sF, String str) {
        super(str);
        this.LIZIZ = c97553sF;
        this.LIZJ = str;
    }
}
