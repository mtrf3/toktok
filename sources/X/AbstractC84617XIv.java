package X;

import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.XIv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC84617XIv<T> implements InterfaceC115514g7 {
    public static final XJ0 LIZJ = new XJ0();
    public static long LIZLLL = -1;
    public static long LJ = -1;
    public final InterfaceC115514g7<Object, T> LIZ;
    public T LIZIZ;

    public abstract void LIZJ();

    static {
        C36381bm.LJIL.LIZLLL(new C84616XIu());
    }

    public boolean LIZLLL() {
        return o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ());
    }

    public AbstractC84617XIv(C214358b9 c214358b9) {
        this.LIZ = c214358b9;
    }

    @Override // X.InterfaceC115514g7
    public final T LIZ(Object obj, InterfaceC74236TBo<?> property) {
        o.LJIIIZ(property, "property");
        if (!LIZLLL()) {
            return this.LIZ.LIZ(obj, property);
        }
        LIZJ();
        T t = this.LIZIZ;
        if (t != null) {
            return t;
        }
        T LIZ = this.LIZ.LIZ(obj, property);
        this.LIZIZ = LIZ;
        return LIZ;
    }
}
