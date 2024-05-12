package X;

import java.lang.reflect.Method;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.PnZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65521PnZ<T> extends C65523Pnb<T> {
    public final /* synthetic */ AbstractC65516PnU LJLJJI;

    @Override // X.C40633Fx7
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJI);
        LIZ.append(".");
        LIZ.append(super.toString());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C40633Fx7
    public final AbstractC65516PnU<T> LIZ() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65521PnZ(AbstractC65516PnU abstractC65516PnU, Method method) {
        super(method);
        this.LJLJJI = abstractC65516PnU;
    }
}
