package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WnZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83357WnZ extends AbstractC83369Wnl {
    public final String LIZJ;
    public EnumC82847WfL LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("text: ");
        LIZ.append(this.LIZJ);
        LIZ.append(" \nstatus: ");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC83369Wnl
    public final EnumC83358Wna LIZ() {
        return EnumC83358Wna.USER_TEXT;
    }

    public C83357WnZ(String text, String str, int i) {
        EnumC82847WfL status;
        if ((i & 2) != 0) {
            status = EnumC82847WfL.DEFAULT;
        } else {
            status = null;
        }
        str = (i & 4) != 0 ? null : str;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(status, "status");
        this.LIZJ = text;
        this.LIZLLL = status;
        this.LJ = str;
    }
}
