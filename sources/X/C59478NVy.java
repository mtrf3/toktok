package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NVy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59478NVy<T> implements InterfaceC59479NVz<T> {
    public T LIZ;
    public InterfaceC48224IwG LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final String LJ;
    public final InterfaceC113454cn<T> LJFF;
    public final T LJI;

    @Override // X.InterfaceC59479NVz
    public final T getValue() {
        InterfaceC48224IwG interfaceC48224IwG;
        if (!this.LIZJ && !this.LIZLLL && (interfaceC48224IwG = this.LIZIZ) != null) {
            interfaceC48224IwG.LIZ(this);
            this.LIZJ = true;
        }
        T t = this.LIZ;
        if (t != null) {
            return t;
        }
        return this.LJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Param(");
        LIZ.append(this.LJFF);
        LIZ.append("){key: ");
        LIZ.append(this.LJ);
        LIZ.append(", value: ");
        LIZ.append(getValue());
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC59479NVz
    public final String getKey() {
        return this.LJ;
    }

    @Override // X.InterfaceC59479NVz
    public final void LIZ(InterfaceC48224IwG interfaceC48224IwG) {
        this.LIZIZ = interfaceC48224IwG;
    }

    public final void LIZLLL(T t) {
        this.LIZ = t;
        this.LIZLLL = true;
    }

    @Override // X.InterfaceC59479NVz
    public final <R> void LIZIZ(Class<R> inputType, R r) {
        T invoke;
        o.LJIIJ(inputType, "inputType");
        InterfaceC88471Ynr<R, String, T> LIZIZ = this.LJFF.LIZIZ(inputType);
        if (LIZIZ != null && (invoke = LIZIZ.invoke(r, this.LJ)) != null) {
            LIZLLL(invoke);
        }
    }

    @Override // X.InterfaceC59479NVz
    public final <R> R LIZJ(Class<R> cls, R r) {
        T t;
        InterfaceC88473Ynt<R, String, T, R> LIZ = this.LJFF.LIZ(cls);
        if (LIZ != null && (t = this.LIZ) != null) {
            return LIZ.invoke(r, this.LJ, t);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C59478NVy(String str, C113444cm type, Object obj) {
        o.LJIIJ(type, "type");
        this.LJ = str;
        this.LJFF = type;
        this.LJI = obj;
    }
}
