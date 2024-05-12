package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.URi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77194URi implements URK {
    @Override // X.USJ
    public final Object LIZ(C77208URw c77208URw, InterfaceC67352kd<? super URP> interfaceC67352kd) {
        List LLIIIZ;
        EnumC77147UPn enumC77147UPn = c77208URw.LJLILLLLZI.LJLILLLLZI;
        UST ust = c77208URw.LJLIL.LJ.LIZJ;
        if (o.LJ(ust, USV.LIZ)) {
            LLIIIZ = C47261Igj.LJJIJ(enumC77147UPn);
        } else if (ust instanceof USM) {
            LLIIIZ = ORZ.LLIIIZ(ORZ.LLIIIJ(enumC77147UPn, ((USM) ust).LIZ), C47261Igj.LJJIJ(enumC77147UPn));
        } else {
            throw new C162476Zf();
        }
        return URP.L(c77208URw.LJLILLLLZI, true, null, null, LLIIIZ, false, null, null, 118);
    }
}
