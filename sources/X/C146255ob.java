package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5ob, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146255ob<T, V> implements InterfaceC115514g7 {
    public final /* synthetic */ WMH LIZ;

    public C146255ob(WMH wmh) {
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
            return (T) interfaceC151215wb.br0(C151065wM.class);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
