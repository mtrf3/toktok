package X;

import kotlin.jvm.internal.o;

/* renamed from: X.37k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C788037k implements InterfaceC789938d {
    public final C72582t4 LIZ;

    public C788037k(C72582t4 context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    @Override // X.InterfaceC789738b
    public final Object LIZ(Object obj, C3CS c3cs) {
        boolean z;
        long longValue = ((Number) obj).longValue();
        try {
            int LIZIZ = this.LIZ.LIZLLL.LJIJI().LIZIZ(longValue);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("delete version: ");
            LIZ.append(longValue);
            LIZ.append(" row, delete row cnt: ");
            LIZ.append(LIZIZ);
            C69542oA.LIZIZ("UserOperator", X1D.LIZIZ(LIZ));
            z = true;
        } catch (Throwable th) {
            C69542oA.LIZ("UserOperator", "delete old version fail", th);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
