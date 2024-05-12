package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FsI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40334FsI {
    public static final /* synthetic */ int LIZ = 0;

    public static AbstractC40333FsH LIZ(EnumC40336FsK type, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(type, "type");
        int i = C40335FsJ.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return C86793Y4n.LJIIJJI(C40332FsG.class, interfaceC88472Yns);
            }
            return C86793Y4n.LJIIJJI(C40331FsF.class, interfaceC88472Yns);
        }
        return C86793Y4n.LJIIJJI(C40183Fpr.class, interfaceC88472Yns);
    }
}
