package X;

import java.util.List;

/* renamed from: X.Mkr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC57709Mkr<T> {
    public static final /* synthetic */ int LIZ = 0;

    public final List<T> LIZ() {
        if (this instanceof C57708Mkq) {
            return ((C57708Mkq) this).LIZJ;
        }
        if (this instanceof C57710Mks) {
            return ((C57710Mks) this).LIZIZ;
        }
        if (this instanceof C57714Mkw) {
            return null;
        }
        throw new C162476Zf();
    }

    public final String toString() {
        String LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LoadResult -> ");
        if (this instanceof C57708Mkq) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Success, hasMore: true, data size: ");
            LIZ3.append(((C57708Mkq) this).LIZJ.size());
            LIZIZ = X1D.LIZIZ(LIZ3);
        } else if (this instanceof C57714Mkw) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Fail, exception message: ");
            LIZ4.append(((C57714Mkw) this).LIZIZ.getMessage());
            LIZIZ = X1D.LIZIZ(LIZ4);
        } else if (this instanceof C57710Mks) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("Complete, data size: ");
            LIZ5.append(((C57710Mks) this).LIZIZ.size());
            LIZIZ = X1D.LIZIZ(LIZ5);
        } else {
            throw new C162476Zf();
        }
        LIZ2.append(LIZIZ);
        return X1D.LIZIZ(LIZ2);
    }
}
