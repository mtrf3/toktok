package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EqL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37665EqL implements EX0 {
    public final /* synthetic */ AbstractC37663EqJ LIZ;
    public final /* synthetic */ InterfaceC37673EqT LIZIZ;

    @Override // X.EX0
    public final void LIZ(java.util.Map<String, ? extends Object> data) {
        o.LJIIJ(data, "data");
        Object obj = data.get("code");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null && num.intValue() != 1) {
            InterfaceC37673EqT interfaceC37673EqT = this.LIZIZ;
            Object LIZIZ = this.LIZ.LIZIZ().LIZIZ(this.LIZ.LIZ.getClass(), data);
            if (LIZIZ != null) {
                interfaceC37673EqT.LIZ(LIZIZ);
                return;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        InterfaceC37673EqT interfaceC37673EqT2 = this.LIZIZ;
        Object LIZIZ2 = this.LIZ.LIZIZ().LIZIZ(this.LIZ.LIZ.getClass(), data);
        if (LIZIZ2 != null) {
            interfaceC37673EqT2.LIZ(LIZIZ2);
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    public C37665EqL(AbstractC37663EqJ abstractC37663EqJ, InterfaceC37673EqT interfaceC37673EqT) {
        this.LIZ = abstractC37663EqJ;
        this.LIZIZ = interfaceC37673EqT;
    }
}
