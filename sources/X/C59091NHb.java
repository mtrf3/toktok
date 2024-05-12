package X;

import android.view.View;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.NHb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59091NHb {
    public final int LIZ;
    public final CharSequence LIZIZ;
    public final InterfaceC88472Yns<View, C76800UCe> LIZJ;
    public final InterfaceC88472Yns<View, C76800UCe> LIZLLL;
    public int LJ;

    public C59091NHb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59091NHb)) {
            return false;
        }
        C59091NHb c59091NHb = (C59091NHb) obj;
        return this.LIZ == c59091NHb.LIZ && o.LJ(this.LIZIZ, c59091NHb.LIZIZ) && o.LJ(this.LIZJ, c59091NHb.LIZJ) && o.LJ(this.LIZLLL, c59091NHb.LIZLLL) && this.LJ == c59091NHb.LJ;
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ * 31)) * 31;
        InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns = this.LIZJ;
        int hashCode2 = (hashCode + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode())) * 31;
        InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns2 = this.LIZLLL;
        return ((hashCode2 + (interfaceC88472Yns2 != null ? interfaceC88472Yns2.hashCode() : 0)) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ButtonInfo(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", text=");
        LIZ.append((Object) this.LIZIZ);
        LIZ.append(", onViewCustomAction=");
        LIZ.append(this.LIZJ);
        LIZ.append(", onActionClick=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", textWidth=");
        return b0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C59091NHb(CharSequence text, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        o.LJIIIZ(text, "text");
        this.LIZ = 1;
        this.LIZIZ = text;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = interfaceC88472Yns2;
        this.LJ = -2;
    }
}
