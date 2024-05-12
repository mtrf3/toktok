package X;

/* renamed from: X.Mlu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC57774Mlu<T> {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new C57775Mlv();
    }

    public final String toString() {
        String LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PageResult -> ");
        if (this instanceof C57983MpH) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Success, hasMore: true, data size: ");
            LIZ3.append(((C57983MpH) this).LIZLLL.size());
            LIZIZ = X1D.LIZIZ(LIZ3);
        } else if (this instanceof C57777Mlx) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Fail, exception message: ");
            LIZ4.append(((C57777Mlx) this).LIZIZ.getMessage());
            LIZIZ = X1D.LIZIZ(LIZ4);
        } else if (this instanceof C57776Mlw) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("Complete, data size: ");
            LIZ5.append(((C57776Mlw) this).LIZIZ.size());
            LIZIZ = X1D.LIZIZ(LIZ5);
        } else {
            throw new C162476Zf();
        }
        LIZ2.append(LIZIZ);
        return X1D.LIZIZ(LIZ2);
    }
}
