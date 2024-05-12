package X;

import java.lang.reflect.Type;

/* renamed from: X.Pnc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65524Pnc {
    public final Type[] LIZ;
    public final boolean LIZIZ;

    public final boolean LIZ(Type type) {
        for (Type type2 : this.LIZ) {
            boolean isSubtypeOf = AbstractC65516PnU.of(type2).isSubtypeOf(type);
            boolean z = this.LIZIZ;
            if (isSubtypeOf == z) {
                return z;
            }
        }
        return !this.LIZIZ;
    }

    public final boolean LIZIZ(Type type) {
        AbstractC65516PnU<?> of = AbstractC65516PnU.of(type);
        for (Type type2 : this.LIZ) {
            boolean isSubtypeOf = of.isSubtypeOf(type2);
            boolean z = this.LIZIZ;
            if (isSubtypeOf == z) {
                return z;
            }
        }
        return !this.LIZIZ;
    }

    public C65524Pnc(Type[] typeArr, boolean z) {
        this.LIZ = typeArr;
        this.LIZIZ = z;
    }
}
