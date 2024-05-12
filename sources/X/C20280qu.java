package X;

/* renamed from: X.0qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20280qu {
    public final EnumC18560o8 LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20280qu)) {
            return false;
        }
        C20280qu c20280qu = (C20280qu) obj;
        return this.LIZ == c20280qu.LIZ && C10370av.LIZIZ(this.LIZIZ, c20280qu.LIZIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectionHandleInfo(handle=");
        LIZ.append(this.LIZ);
        LIZ.append(", position=");
        LIZ.append((Object) C10370av.LJIIIIZZ(this.LIZIZ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public C20280qu(EnumC18560o8 enumC18560o8, long j) {
        this.LIZ = enumC18560o8;
        this.LIZIZ = j;
    }
}
