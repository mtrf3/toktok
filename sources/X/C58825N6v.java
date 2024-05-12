package X;

import kotlin.jvm.internal.o;

/* renamed from: X.N6v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58825N6v {
    public Object LIZ;
    public Object LIZIZ;
    public Object LIZJ;

    public C58825N6v(int i) {
        if (i != 1) {
            this.LIZ = N66.LIZ;
            XLL LIZ = C79853Bl.LIZ(0, 0, null, 7);
            this.LIZIZ = LIZ;
            this.LIZJ = new C79883Bo(LIZ);
        }
    }

    public final Object LIZ(N62 n62, InterfaceC67352kd interfaceC67352kd) {
        if (!(n62 instanceof N65)) {
            if (n62 instanceof N61) {
                if (!o.LJ(this.LIZ, N65.LIZ) && !o.LJ(this.LIZ, N64.LIZ)) {
                    return C76800UCe.LIZ;
                }
            } else if (!(n62 instanceof N64) && !(n62 instanceof N63) && !(n62 instanceof N66)) {
                throw new C162476Zf();
            }
        }
        this.LIZ = n62;
        Object emit = ((C3BJ) this.LIZIZ).emit(n62, interfaceC67352kd);
        if (emit == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return emit;
        }
        return C76800UCe.LIZ;
    }
}
