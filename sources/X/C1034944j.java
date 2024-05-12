package X;

import kotlin.jvm.internal.o;

/* renamed from: X.44j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1034944j {
    public final String LIZ;
    public final boolean LIZIZ;
    public final EnumC1036244w LIZJ;
    public final boolean LIZLLL;
    public final Long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1034944j)) {
            return false;
        }
        C1034944j c1034944j = (C1034944j) obj;
        return o.LJ(this.LIZ, c1034944j.LIZ) && this.LIZIZ == c1034944j.LIZIZ && this.LIZJ == c1034944j.LIZJ && this.LIZLLL == c1034944j.LIZLLL && o.LJ(this.LJ, c1034944j.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        EnumC1036244w enumC1036244w = this.LIZJ;
        int hashCode2 = (((i2 + (enumC1036244w == null ? 0 : enumC1036244w.hashCode())) * 31) + (this.LIZLLL ? 1 : 0)) * 31;
        Long l = this.LJ;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoTypingEvent(conversationId=");
        LIZ.append(this.LIZ);
        LIZ.append(", isTyping=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cancelReason=");
        LIZ.append(this.LIZJ);
        LIZ.append(", fromEnterChat=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", typingRemainTime=");
        return JBR.LJ(LIZ, this.LJ, ')', LIZ);
    }

    public C1034944j(String conversationId, boolean z, EnumC1036244w enumC1036244w, boolean z2, Long l) {
        o.LJIIIZ(conversationId, "conversationId");
        this.LIZ = conversationId;
        this.LIZIZ = z;
        this.LIZJ = enumC1036244w;
        this.LIZLLL = z2;
        this.LJ = l;
    }
}
