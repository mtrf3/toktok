package X;

/* renamed from: X.ZtP, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91363ZtP implements InterfaceC47122IeU {
    public final /* synthetic */ String LIZ;

    public C91363ZtP(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC47122IeU
    public final void LIZ(C47121IeT c47121IeT) {
        Long l;
        Long l2;
        int i = c47121IeT.LIZ;
        if (i != 2) {
            if (i != 3) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Preload failed associated with special key(");
            LIZ.append(this.LIZ);
            LIZ.append(')');
            X1D.LIZIZ(LIZ);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("preload success, key(");
        LIZ2.append(this.LIZ);
        LIZ2.append("), preloadSize(");
        C47106IeE c47106IeE = c47121IeT.LIZIZ;
        String str = null;
        if (c47106IeE != null) {
            l = Long.valueOf(c47106IeE.LJ);
        } else {
            l = null;
        }
        LIZ2.append(C91149Zpx.LIZJ(l));
        LIZ2.append("), mediaSize(");
        C47106IeE c47106IeE2 = c47121IeT.LIZIZ;
        if (c47106IeE2 != null) {
            l2 = Long.valueOf(c47106IeE2.LIZLLL);
        } else {
            l2 = null;
        }
        LIZ2.append(C91149Zpx.LIZJ(l2));
        LIZ2.append("), path(");
        C47106IeE c47106IeE3 = c47121IeT.LIZIZ;
        if (c47106IeE3 != null) {
            str = c47106IeE3.LIZJ;
        }
        LIZ2.append(str);
        LIZ2.append(')');
        X1D.LIZIZ(LIZ2);
    }
}
