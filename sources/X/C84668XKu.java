package X;

import defpackage.q;

/* renamed from: X.XKu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84668XKu implements XL7 {
    public final boolean LJLIL;

    @Override // X.XL7
    public final XL4 getList() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Empty{");
        if (this.LJLIL) {
            str = "Active";
        } else {
            str = "New";
        }
        return q.LIZIZ(LIZ, str, '}', LIZ);
    }

    @Override // X.XL7
    public final boolean isActive() {
        return this.LJLIL;
    }

    public C84668XKu(boolean z) {
        this.LJLIL = z;
    }
}
