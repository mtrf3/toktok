package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sn8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73138Sn8 implements InterfaceC48038ItG, InterfaceC73592SuS {
    public static final C73138Sn8 LJLIL = new C73138Sn8();
    public static final C73138Sn8 LJLILLLLZI = new C73138Sn8();

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIJ(it, "it");
        return new C163586bS(it);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        OSZ it = (OSZ) obj;
        o.LJIIJ(it, "it");
        if (it.getSecond() != null) {
            return true;
        }
        return false;
    }
}
