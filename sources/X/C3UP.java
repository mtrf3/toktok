package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3UP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UP extends C3UX {
    public final Integer LJ;
    public final Long LJFF;

    public C3UP() {
        this((Integer) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3UP)) {
            return false;
        }
        C3UP c3up = (C3UP) obj;
        return o.LJ(this.LJ, c3up.LJ) && o.LJ(this.LJFF, c3up.LJFF);
    }

    public final int hashCode() {
        Integer num = this.LJ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.LJFF;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    @Override // X.C3UX
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnterStickerInputPanelEventKey(type=");
        LIZ.append(this.LJ);
        LIZ.append(", stickerSetId=");
        return JBR.LJ(LIZ, this.LJFF, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3UP(java.lang.Integer r8, java.lang.Long r9) {
        /*
            r7 = this;
            java.lang.String r2 = "im_enter_sticker_input_panel_performance"
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r8)
            r0 = 95
            r1.append(r0)
            r1.append(r9)
            java.lang.String r3 = X.X1D.LIZIZ(r1)
            r4 = 0
            r5 = 0
            r6 = 12
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r1.LJ = r8
            r1.LJFF = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3UP.<init>(java.lang.Integer, java.lang.Long):void");
    }

    public /* synthetic */ C3UP(Integer num, int i) {
        this((i & 1) != 0 ? null : num, (Long) null);
    }
}
