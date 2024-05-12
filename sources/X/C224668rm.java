package X;

import android.text.Spanned;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.8rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224668rm {
    public final InterfaceC224678rn LIZ;
    public final Spanned LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C224668rm)) {
            return false;
        }
        C224668rm c224668rm = (C224668rm) obj;
        return o.LJ(this.LIZ, c224668rm.LIZ) && o.LJ(this.LIZIZ, c224668rm.LIZIZ) && this.LIZJ == c224668rm.LIZJ;
    }

    public final int hashCode() {
        return ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownState(touch=");
        LIZ.append(this.LIZ);
        LIZ.append(", charSequence=");
        LIZ.append((Object) this.LIZIZ);
        LIZ.append(", off=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C224668rm(InterfaceC224678rn touch, Spanned charSequence, int i) {
        o.LJIIIZ(touch, "touch");
        o.LJIIIZ(charSequence, "charSequence");
        this.LIZ = touch;
        this.LIZIZ = charSequence;
        this.LIZJ = i;
    }
}
