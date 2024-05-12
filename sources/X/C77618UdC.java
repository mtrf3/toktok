package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UdC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77618UdC {
    public final String LIZ;
    public final CharSequence LIZIZ;
    public final C63129Oq5 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77618UdC)) {
            return false;
        }
        C77618UdC c77618UdC = (C77618UdC) obj;
        return o.LJ(this.LIZ, c77618UdC.LIZ) && o.LJ(this.LIZIZ, c77618UdC.LIZIZ) && o.LJ(this.LIZJ, c77618UdC.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KycIncentiveUIData(time=");
        LIZ.append(this.LIZ);
        LIZ.append(", content=");
        LIZ.append((Object) this.LIZIZ);
        LIZ.append(", bgRes=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C77618UdC(String time, CharSequence charSequence, C77696UeS c77696UeS) {
        o.LJIIIZ(time, "time");
        this.LIZ = time;
        this.LIZIZ = charSequence;
        this.LIZJ = c77696UeS;
    }
}
