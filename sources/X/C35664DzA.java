package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.DzA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35664DzA {
    public final String LIZ;
    public final boolean LIZIZ;
    public final EnumC35665DzB LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35664DzA)) {
            return false;
        }
        C35664DzA c35664DzA = (C35664DzA) obj;
        return o.LJ(this.LIZ, c35664DzA.LIZ) && this.LIZIZ == c35664DzA.LIZIZ && this.LIZJ == c35664DzA.LIZJ && o.LJ(this.LIZLLL, c35664DzA.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (this.LIZJ.hashCode() + ((hashCode + i) * 31)) * 31;
        Integer num = this.LIZLLL;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MutiCodeSchedulerRegister(tag=");
        LIZ.append(this.LIZ);
        LIZ.append(", regist=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mutiScheduletype=");
        LIZ.append(this.LIZJ);
        LIZ.append(", extra=");
        return s0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C35664DzA(boolean z, EnumC35665DzB mutiScheduletype, Integer num) {
        o.LJIIIZ(mutiScheduletype, "mutiScheduletype");
        this.LIZ = "IBEPreloadSparse";
        this.LIZIZ = z;
        this.LIZJ = mutiScheduletype;
        this.LIZLLL = num;
    }
}
