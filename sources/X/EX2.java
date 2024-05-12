package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EX2 implements InterfaceC31943CgF {
    public final /* synthetic */ EX0 LIZ;

    public EX2(EX0 ex0) {
        this.LIZ = ex0;
    }

    @Override // X.InterfaceC31943CgF
    public final void LIZ(java.util.Map<String, Object> data) {
        o.LJIIIZ(data, "data");
        this.LIZ.LIZ(data);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("callback params = ");
        LIZ.append(data);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIJ(msg, "msg");
    }
}
