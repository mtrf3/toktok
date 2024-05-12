package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6Dw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156926Dw implements InterfaceC115514g7<Object, InterfaceC153275zv> {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C156946Dy.INSTANCE);
    public InterfaceC153275zv LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro LIZJ;

    public C156926Dw(InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZJ = interfaceC65784Pro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.5zv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0I6] */
    @Override // X.InterfaceC115514g7
    public final InterfaceC153275zv LIZ(Object thisRef, InterfaceC74236TBo property) {
        o.LJIIIZ(thisRef, "thisRef");
        o.LJIIIZ(property, "property");
        InterfaceC153275zv interfaceC153275zv = this.LIZIZ;
        if (interfaceC153275zv == null) {
            C82622Wbi c82622Wbi = (C82622Wbi) this.LIZJ.invoke();
            InterfaceC153275zv interfaceC153275zv2 = null;
            if (c82622Wbi != null) {
                interfaceC153275zv2 = (C0I6) c82622Wbi.LJIIIIZZ(null, InterfaceC153275zv.class);
            }
            this.LIZIZ = interfaceC153275zv2;
            if (interfaceC153275zv2 == null) {
                return this.LIZ.getValue();
            }
            return interfaceC153275zv2;
        }
        return interfaceC153275zv;
    }
}
