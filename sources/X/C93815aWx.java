package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aWx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93815aWx {
    public final AbstractC94370afu LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93815aWx)) {
            return false;
        }
        C93815aWx c93815aWx = (C93815aWx) obj;
        return o.LJ(this.LIZ, c93815aWx.LIZ) && this.LIZIZ == c93815aWx.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommandCardData(command=");
        LIZ.append(this.LIZ);
        LIZ.append(", editMode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i;
        AbstractC94370afu abstractC94370afu = this.LIZ;
        if (abstractC94370afu != null) {
            i = abstractC94370afu.LIZIZ();
        } else {
            i = 0;
        }
        int i2 = i * 31;
        boolean z = this.LIZIZ;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return i2 + i3;
    }

    public C93815aWx(AbstractC94370afu command, boolean z) {
        o.LJIIIZ(command, "command");
        this.LIZ = command;
        this.LIZIZ = z;
    }
}
