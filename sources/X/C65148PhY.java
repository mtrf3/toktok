package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.PhY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65148PhY extends AbstractC65069PgH {
    public final AbstractC73946T0k LIZ = null;
    public final boolean LIZIZ;

    public C65148PhY(boolean z) {
        this.LIZIZ = z;
    }

    @Override // X.AbstractC65069PgH
    public final InterfaceC65014PfO<?, ?> LIZ(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        Class<?> LJFF = C65139PhP.LJFF(type);
        if (LJFF == AbstractC73547Stj.class) {
            return new C73409SrV(Void.class, this.LIZ, this.LIZIZ, false, true, false, false, false, true);
        }
        boolean z5 = true;
        if (LJFF == AbstractC73745Swv.class) {
            z = true;
        } else {
            z = false;
        }
        if (LJFF == AbstractC73638SvC.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (LJFF == AbstractC73635Sv9.class) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (LJFF != AbstractC73672Svk.class && !z && !z2 && !z3) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (!z) {
                if (!z2) {
                    if (z3) {
                        str = "Maybe";
                    } else {
                        str = "Observable";
                    }
                } else {
                    str = "Single";
                }
            } else {
                str = "Flowable";
            }
            StringBuilder LIZLLL = C06540Nm.LIZLLL(str, " return type must be parameterized as ", str, "<Foo> or ", str);
            LIZLLL.append("<? extends Foo>");
            throw new IllegalStateException(X1D.LIZIZ(LIZLLL));
        }
        Type LJ = C65139PhP.LJ(0, (ParameterizedType) type);
        Class<?> LJFF2 = C65139PhP.LJFF(LJ);
        if (LJFF2 == C64797Pbt.class) {
            if (LJ instanceof ParameterizedType) {
                LJ = C65139PhP.LJ(0, (ParameterizedType) LJ);
                z5 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (LJFF2 == C65149PhZ.class) {
            if (LJ instanceof ParameterizedType) {
                LJ = C65139PhP.LJ(0, (ParameterizedType) LJ);
            } else {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
        } else {
            z5 = false;
            z4 = true;
            return new C73409SrV(LJ, this.LIZ, this.LIZIZ, z5, z4, z, z2, z3, false);
        }
        z4 = false;
        return new C73409SrV(LJ, this.LIZ, this.LIZIZ, z5, z4, z, z2, z3, false);
    }
}
