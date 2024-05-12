package X;

/* renamed from: X.UtN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78621UtN extends XKW {
    public abstract AbstractC78621UtN LJJIJIL();

    @Override // X.XKW
    public String toString() {
        String str;
        AbstractC78621UtN abstractC78621UtN;
        AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
        if (this == abstractC78621UtN2) {
            str = "Dispatchers.Main";
        } else {
            str = null;
            try {
                abstractC78621UtN = abstractC78621UtN2.LJJIJIL();
            } catch (UnsupportedOperationException unused) {
                abstractC78621UtN = null;
            }
            if (this == abstractC78621UtN) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LJLLJ(getClass()));
            LIZ.append('@');
            LIZ.append(C65314PkE.LJI(this));
            return X1D.LIZIZ(LIZ);
        }
        return str;
    }
}
