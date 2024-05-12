package X;

import defpackage.b0;

/* renamed from: X.4c2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112984c2 implements InterfaceC113014c5 {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C112984c2) && this.LIZ == ((C112984c2) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadState(progress=");
        return b0.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C112984c2(int i) {
        this.LIZ = i;
    }
}
