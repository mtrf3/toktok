package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113444cm<T> implements InterfaceC113454cn<T> {
    public final java.util.Map<Class<?>, InterfaceC88471Ynr<?, String, ?>> LIZ;
    public final java.util.Map<Class<?>, InterfaceC88473Ynt<?, String, ?, ?>> LIZIZ;
    public final Class<T> LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ParamType: ");
        LIZ.append(C16880lQ.LJLLILLLL(this.LIZJ));
        return X1D.LIZIZ(LIZ);
    }

    public C113444cm(Class<T> type) {
        o.LJIIJ(type, "type");
        this.LIZJ = type;
        this.LIZ = new LinkedHashMap();
        this.LIZIZ = new LinkedHashMap();
    }

    @Override // X.InterfaceC113454cn
    public final <R> InterfaceC88473Ynt<R, String, T, R> LIZ(Class<R> cls) {
        Object LIZ;
        Object obj = null;
        try {
            LIZ = (InterfaceC88473Ynt) ((LinkedHashMap) this.LIZIZ).get(cls);
            if (LIZ != null) {
                C65777Prh.LJ(3, LIZ);
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (InterfaceC88473Ynt) obj;
    }

    @Override // X.InterfaceC113454cn
    public final <R> InterfaceC88471Ynr<R, String, T> LIZIZ(Class<R> inputType) {
        Object LIZ;
        o.LJIIJ(inputType, "inputType");
        Object obj = null;
        try {
            LIZ = (InterfaceC88471Ynr) ((LinkedHashMap) this.LIZ).get(inputType);
            if (LIZ != null) {
                C65777Prh.LJ(2, LIZ);
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (InterfaceC88471Ynr) obj;
    }

    public final <R> void LIZJ(Class<R> cls, InterfaceC88473Ynt<? super R, ? super String, ? super T, ? extends R> builder) {
        o.LJIIJ(builder, "builder");
        this.LIZIZ.put(cls, builder);
    }

    public final <R> void LIZLLL(Class<R> cls, InterfaceC88471Ynr<? super R, ? super String, ? extends T> parser) {
        o.LJIIJ(parser, "parser");
        this.LIZ.put(cls, parser);
    }
}
