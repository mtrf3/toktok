package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EfP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC36987EfP implements InterfaceC37002Efe {
    public final boolean LIZ;
    public final String LIZIZ;
    public final InterfaceC36990EfS LIZJ;

    @Override // X.InterfaceC37002Efe
    public final List<C36760Ebk> LIZ(String str) {
        if (this.LIZ) {
            return this.LIZJ.LIZ(str);
        }
        return null;
    }

    @Override // X.InterfaceC37002Efe
    public final void LIZJ(String pageUrl) {
        o.LJIIJ(pageUrl, "pageUrl");
        if (this.LIZ) {
            this.LIZJ.LIZJ(pageUrl);
        }
    }

    @Override // X.InterfaceC37002Efe
    public final C36760Ebk LIZIZ(C36758Ebi c36758Ebi, InterfaceC36765Ebp listener) {
        o.LJIIJ(listener, "listener");
        if (this.LIZ) {
            return this.LIZJ.LIZIZ(c36758Ebi, listener);
        }
        return this.LIZJ.LIZLLL(c36758Ebi, listener);
    }

    @Override // X.InterfaceC37002Efe
    public final C36760Ebk LIZLLL(C36758Ebi c36758Ebi, InterfaceC36765Ebp listener) {
        o.LJIIJ(listener, "listener");
        return this.LIZJ.LIZLLL(c36758Ebi, listener);
    }

    public AbstractC36987EfP(String business, C36769Ebt c36769Ebt, C36735EbL c36735EbL) {
        o.LJIIJ(business, "business");
        this.LIZIZ = business;
        this.LIZJ = c36769Ebt;
        this.LIZ = true;
    }
}
