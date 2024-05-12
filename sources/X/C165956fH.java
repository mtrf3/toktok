package X;

import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.6fH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165956fH extends AbstractC166316fr<C166396fz> {
    public final C166246fk LIZIZ;
    public C166396fz LIZJ;

    @Override // X.InterfaceC166366fw
    public final void LIZ() {
        LIZJ(new C166186fe());
        if (e1.LIZ(31744, "vc_extract_over_upload", true, false)) {
            LIZJ(new AbstractC166226fi() { // from class: X.6ff
                @Override // X.AbstractC166306fq
                public final int LIZIZ() {
                    return 10;
                }

                @Override // X.AbstractC166306fq
                public final Object LIZLLL(C166286fo c166286fo, C166336ft c166336ft) {
                    return C48841JEv.LJI(new C166456g5((C166396fz) c166286fo, this, null), c166336ft);
                }
            });
        } else {
            LIZJ(new C166206fg());
        }
        LIZJ(new C166216fh());
    }

    public final C166286fo LIZLLL() {
        C166396fz c166396fz = this.LIZJ;
        if (c166396fz != null) {
            return c166396fz;
        }
        o.LJIJI("dataContext");
        throw null;
    }

    public C165956fH(C166246fk cacheManager) {
        o.LJIIIZ(cacheManager, "cacheManager");
        this.LIZIZ = cacheManager;
    }
}
