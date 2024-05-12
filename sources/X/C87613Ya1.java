package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Ya1, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87613Ya1 {
    public final java.util.Set<C87612Ya0> LIZ;
    public final java.util.Set<C87612Ya0> LIZIZ;
    public C87614Ya2 LIZJ;
    public final C87612Ya0 LIZLLL;

    public C87613Ya1(C87612Ya0 node) {
        o.LJIIIZ(node, "node");
        this.LIZLLL = node;
        this.LIZ = new LinkedHashSet();
        this.LIZIZ = new LinkedHashSet();
    }

    public final void LIZ(InterfaceC88472Yns<? super C41875Gc3, C76800UCe> interfaceC88472Yns) {
        C87614Ya2 c87614Ya2 = this.LIZJ;
        if (c87614Ya2 != null) {
            C87614Ya2.LJFF(c87614Ya2.LIZIZ, interfaceC88472Yns);
        } else {
            o.LJIJI("net");
            throw null;
        }
    }

    public final void LIZJ(AbstractC41869Gbx abstractC41869Gbx) {
        C87614Ya2 c87614Ya2 = this.LIZJ;
        if (c87614Ya2 != null) {
            c87614Ya2.LJII(abstractC41869Gbx);
        } else {
            o.LJIJI("net");
            throw null;
        }
    }

    public final void LIZIZ(C42360Gjs exception, C41875Gc3 happenTime) {
        o.LJIIIZ(exception, "exception");
        o.LJIIIZ(happenTime, "happenTime");
        C87614Ya2 c87614Ya2 = this.LIZJ;
        if (c87614Ya2 != null) {
            c87614Ya2.LJII(new C41851Gbf(this.LIZLLL.LJII, exception, happenTime));
            C87614Ya2 c87614Ya22 = this.LIZJ;
            if (c87614Ya22 != null) {
                c87614Ya22.LJI.LJIIJJI(exception, happenTime);
                return;
            } else {
                o.LJIJI("net");
                throw null;
            }
        }
        o.LJIJI("net");
        throw null;
    }

    public final void LIZLLL(Object obj, boolean z, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        C87614Ya2 c87614Ya2 = this.LIZJ;
        if (c87614Ya2 != null) {
            c87614Ya2.LJII(new C41852Gbg(this.LIZLLL.LJII, obj, z, happenTime));
            Iterator<C87612Ya0> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZLLL();
            }
            return;
        }
        o.LJIJI("net");
        throw null;
    }
}
