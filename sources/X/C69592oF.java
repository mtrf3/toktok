package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2oF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69592oF implements InterfaceC69602oG {
    public static final C69592oF LJLIL = new C69592oF();
    public static final XLM LJLILLLLZI;
    public static final C79863Bm LJLJI;

    static {
        XLM LIZ = V8H.LIZ(null);
        LJLILLLLZI = LIZ;
        LJLJI = V1M.LIZLLL(LIZ);
    }

    @Override // X.InterfaceC69602oG
    public final void onChange(EnumC111394Yt enumC111394Yt, EnumC111394Yt enumC111394Yt2) {
        String str;
        LJLILLLLZI.setValue(enumC111394Yt2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("net_status change: ");
        if (enumC111394Yt2 != null) {
            str = enumC111394Yt2.name();
        } else {
            str = null;
        }
        LIZ.append(str);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }
}
