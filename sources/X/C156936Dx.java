package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6Dx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156936Dx implements InterfaceC115514g7<Object, C6E7> {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C156956Dz.INSTANCE);
    public C6E7 LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro LIZJ;

    public C156936Dx(InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZJ = interfaceC65784Pro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.6E7] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0I6] */
    @Override // X.InterfaceC115514g7
    public final C6E7 LIZ(Object thisRef, InterfaceC74236TBo property) {
        o.LJIIIZ(thisRef, "thisRef");
        o.LJIIIZ(property, "property");
        C6E7 c6e7 = this.LIZIZ;
        if (c6e7 == null) {
            C82622Wbi c82622Wbi = (C82622Wbi) this.LIZJ.invoke();
            C6E7 c6e72 = null;
            if (c82622Wbi != null) {
                c6e72 = (C0I6) c82622Wbi.LJIIIIZZ(null, C6E7.class);
            }
            this.LIZIZ = c6e72;
            if (c6e72 == null) {
                return this.LIZ.getValue();
            }
            return c6e72;
        }
        return c6e7;
    }
}
