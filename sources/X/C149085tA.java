package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5tA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149085tA<T, V> implements InterfaceC115514g7 {
    public final /* synthetic */ WMH LIZ;

    public C149085tA(WMH wmh) {
        this.LIZ = wmh;
    }

    @Override // X.InterfaceC115514g7
    public final T LIZ(Object obj, InterfaceC74236TBo<?> interfaceC74236TBo) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(interfaceC74236TBo, "<anonymous parameter 1>");
        WMH wmh = this.LIZ;
        if (wmh.mActivity == null) {
            return null;
        }
        C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(wmh);
        if (LJJLIIIJJI != null) {
            InterfaceC151215wb interfaceC151215wb = (InterfaceC151215wb) LJJLIIIJJI.LJIIIIZZ(null, InterfaceC151215wb.class);
            if (interfaceC151215wb == null) {
                return null;
            }
            return (T) interfaceC151215wb.br0(InterfaceC150895w5.class);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
