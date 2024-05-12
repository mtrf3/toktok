package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199927sy {
    public final String LIZ;
    public final int LIZIZ;
    public final MCR LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final Integer LJFF;
    public final boolean LJI;
    public final InterfaceC88472Yns<Integer, Boolean> LJII;
    public final java.util.Map<String, String> LJIIIIZZ;

    public C199927sy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199927sy)) {
            return false;
        }
        C199927sy c199927sy = (C199927sy) obj;
        return o.LJ(this.LIZ, c199927sy.LIZ) && this.LIZIZ == c199927sy.LIZIZ && o.LJ(this.LIZJ, c199927sy.LIZJ) && this.LIZLLL == c199927sy.LIZLLL && this.LJ == c199927sy.LJ && o.LJ(this.LJFF, c199927sy.LJFF) && this.LJI == c199927sy.LJI && o.LJ(this.LJII, c199927sy.LJII) && o.LJ(this.LJIIIIZZ, c199927sy.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        MCR mcr = this.LIZJ;
        int hashCode2 = (((((hashCode + (mcr == null ? 0 : mcr.hashCode())) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        Integer num = this.LJFF;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        InterfaceC88472Yns<Integer, Boolean> interfaceC88472Yns = this.LJII;
        return this.LJIIIIZZ.hashCode() + ((i2 + (interfaceC88472Yns != null ? interfaceC88472Yns.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowMutualRelationConfig(enterFrom=");
        LIZ.append(this.LIZ);
        LIZ.append(", orientation=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", avatarUnion=");
        LIZ.append(this.LIZJ);
        LIZ.append(", avatarLabelInterval=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", labelFont=");
        LIZ.append(this.LJ);
        LIZ.append(", labelColor=");
        LIZ.append(this.LJFF);
        LIZ.append(", nicknameClickable=");
        LIZ.append(this.LJI);
        LIZ.append(", onClickNickname=");
        LIZ.append(this.LJII);
        LIZ.append(", eventExtra=");
        return C15890jp.LIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public /* synthetic */ C199927sy(int i) {
        this("", 0, null, C7MY.LIZIZ(8), 51, null, false, null, C113554cx.LJJJLIIL());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C199927sy(String enterFrom, int i, MCR mcr, int i2, int i3, Integer num, boolean z, InterfaceC88472Yns<? super Integer, Boolean> interfaceC88472Yns, java.util.Map<String, String> eventExtra) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(eventExtra, "eventExtra");
        this.LIZ = enterFrom;
        this.LIZIZ = i;
        this.LIZJ = mcr;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = num;
        this.LJI = z;
        this.LJII = interfaceC88472Yns;
        this.LJIIIIZZ = eventExtra;
    }
}
