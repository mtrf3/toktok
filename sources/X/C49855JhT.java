package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.JhT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49855JhT extends AbstractC49861JhZ {
    public final C49847JhL LIZJ;

    public final C49847JhL LIZ() {
        Iterator<InterfaceC88472Yns<C49851JhP, C76800UCe>> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            InterfaceC88472Yns<C49851JhP, C76800UCe> next = it.next();
            C49847JhL c49847JhL = this.LIZJ;
            C49851JhP c49851JhP = new C49851JhP(c49847JhL.LJI, c49847JhL, next);
            C49847JhL c49847JhL2 = this.LIZJ;
            C49849JhN c49849JhN = new C49849JhN(c49851JhP.LIZIZ, c49851JhP.LJFF, c49851JhP, false);
            C49849JhN c49849JhN2 = c49847JhL2.LIZIZ;
            if (c49849JhN2 == null) {
                c49847JhL2.LIZ = c49849JhN;
            } else {
                c49849JhN2.LJIJI(c49849JhN);
            }
            c49847JhL2.LIZIZ = c49849JhN;
        }
        return this.LIZJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49855JhT(C49847JhL streamRoot) {
        super(streamRoot);
        o.LJIIIZ(streamRoot, "streamRoot");
        this.LIZJ = streamRoot;
    }
}
