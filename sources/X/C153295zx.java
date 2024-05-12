package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5zx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153295zx implements InterfaceC115514g7<Object, InterfaceC153185zm> {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C153315zz.INSTANCE);
    public InterfaceC153185zm LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro LIZJ;

    public C153295zx(InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZJ = interfaceC65784Pro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.5zm] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0I6] */
    @Override // X.InterfaceC115514g7
    public final InterfaceC153185zm LIZ(Object thisRef, InterfaceC74236TBo property) {
        o.LJIIIZ(thisRef, "thisRef");
        o.LJIIIZ(property, "property");
        InterfaceC153185zm interfaceC153185zm = this.LIZIZ;
        if (interfaceC153185zm == null) {
            C82622Wbi c82622Wbi = (C82622Wbi) this.LIZJ.invoke();
            InterfaceC153185zm interfaceC153185zm2 = null;
            if (c82622Wbi != null) {
                interfaceC153185zm2 = (C0I6) c82622Wbi.LJIIIIZZ(null, InterfaceC153185zm.class);
            }
            this.LIZIZ = interfaceC153185zm2;
            if (interfaceC153185zm2 == null) {
                return this.LIZ.getValue();
            }
            return interfaceC153185zm2;
        }
        return interfaceC153185zm;
    }
}
