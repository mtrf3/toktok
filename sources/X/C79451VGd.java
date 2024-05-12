package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.Arg3;
import kotlin.jvm.internal.o;

/* renamed from: X.VGd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79451VGd {
    public final Integer LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;
    public final Arg3 LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C79451VGd() {
        this((Integer) null, (Long) (0 == true ? 1 : 0), (Arg3) (0 == true ? 1 : 0), 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79451VGd)) {
            return false;
        }
        C79451VGd c79451VGd = (C79451VGd) obj;
        return o.LJ(this.LIZ, c79451VGd.LIZ) && o.LJ(this.LIZIZ, c79451VGd.LIZIZ) && o.LJ(this.LIZJ, c79451VGd.LIZJ) && o.LJ(this.LIZLLL, c79451VGd.LIZLLL);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.LIZIZ;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Arg3 arg3 = this.LIZLLL;
        return hashCode3 + (arg3 != null ? arg3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectMsg(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", arg1=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", arg2=");
        LIZ.append(this.LIZJ);
        LIZ.append(", arg3=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C79451VGd(java.lang.Integer r6, java.lang.Long r7, com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.Arg3 r8, int r9) {
        /*
            r5 = this;
            r0 = r9 & 1
            if (r0 == 0) goto L9
            r0 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L9:
            r0 = r9 & 2
            r3 = 0
            if (r0 == 0) goto L13
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
        L13:
            r0 = r9 & 4
            r2 = 0
            if (r0 == 0) goto L25
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
        L1c:
            r0 = r9 & 8
            if (r0 == 0) goto L21
            r8 = r2
        L21:
            r5.<init>(r6, r7, r1, r8)
            return
        L25:
            r1 = r2
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79451VGd.<init>(java.lang.Integer, java.lang.Long, com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.Arg3, int):void");
    }

    public C79451VGd(Integer num, Long l, Long l2, Arg3 arg3) {
        this.LIZ = num;
        this.LIZIZ = l;
        this.LIZJ = l2;
        this.LIZLLL = arg3;
    }
}
