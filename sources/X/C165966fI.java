package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6fI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165966fI extends AbstractC166316fr<C166396fz> {
    public final C166246fk LIZIZ;
    public C166396fz LIZJ;

    @Override // X.InterfaceC166366fw
    public final void LIZ() {
        LIZJ(new C166186fe());
        LIZJ(new C166206fg());
        LIZJ(new C166216fh());
        LIZJ(new AbstractC166306fq<C166396fz>() { // from class: X.6fJ
            @Override // X.AbstractC166306fq
            public final int LIZIZ() {
                return 40;
            }

            @Override // X.AbstractC166306fq
            public final Object LIZLLL(C166286fo c166286fo, C166336ft c166336ft) {
                return C48841JEv.LJI(new C166416g1((C166396fz) c166286fo, this, null), c166336ft);
            }
        });
        LIZJ(new AbstractC166306fq<C166396fz>() { // from class: X.6fK
            @Override // X.AbstractC166306fq
            public final int LIZIZ() {
                return 70;
            }

            @Override // X.AbstractC166306fq
            public final Object LIZLLL(C166286fo c166286fo, C166336ft c166336ft) {
                return C48841JEv.LJI(new C166426g2((C166396fz) c166286fo, this, null), c166336ft);
            }
        });
    }

    public final C166286fo LIZLLL() {
        C166396fz c166396fz = this.LIZJ;
        if (c166396fz != null) {
            return c166396fz;
        }
        o.LJIJI("dataContext");
        throw null;
    }

    public C165966fI(C166246fk cacheManager) {
        o.LJIIIZ(cacheManager, "cacheManager");
        this.LIZIZ = cacheManager;
    }
}
