package X;

import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.Mq1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58029Mq1<T> implements C8BG<T> {
    public final XKW LJLIL;
    public InterfaceC70422pa LJLILLLLZI;
    public PowerPageSource<T> LJLJI;
    public XKS LJLJJI;
    public T LJLJJL;
    public C72808Sho<InterfaceC57784Mm4> LJLJJLL;

    @Override // X.C8BG
    public final void LIZIZ(T t) {
    }

    @Override // X.C8BG
    public final void LIZJ(SZP type) {
        o.LJIIIZ(type, "type");
    }

    @Override // X.C8BG
    public final void refresh() {
        XKS xks = this.LJLJJI;
        if (xks != null) {
            xks.LJJIJIL(null);
        }
        InterfaceC70422pa interfaceC70422pa = this.LJLILLLLZI;
        if (interfaceC70422pa != null) {
            XKX.LIZLLL(interfaceC70422pa, this.LJLIL, null, new C58027Mpz(this, null), 2);
        } else {
            o.LJIJI("loaderScope");
            throw null;
        }
    }

    public C58029Mq1(int i) {
        XIA ioDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = ioDispatcher;
    }

    @Override // X.C8BG
    public final void LIZ(T t) {
        XKS xks = this.LJLJJI;
        if (xks != null) {
            xks.LJJIJIL(null);
        }
        InterfaceC70422pa interfaceC70422pa = this.LJLILLLLZI;
        if (interfaceC70422pa != null) {
            XKX.LIZLLL(interfaceC70422pa, this.LJLIL, null, new C58028Mq0(this, t, null), 2);
        } else {
            o.LJIJI("loaderScope");
            throw null;
        }
    }

    @Override // X.C8BG
    public final void LIZLLL(SZP type, A2G<T> value, boolean z) {
        T t;
        Collection<? extends InterfaceC57784Mm4> collection;
        C72808Sho<InterfaceC57784Mm4> c72808Sho;
        o.LJIIIZ(type, "type");
        o.LJIIIZ(value, "value");
        if (z) {
            if (value instanceof A2V) {
                collection = ((A2V) value).LIZLLL;
            } else if (value instanceof A2H) {
                collection = ((A2H) value).LIZIZ;
            } else {
                collection = C61878OQg.INSTANCE;
            }
            int i = SZQ.LIZ[type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (c72808Sho = this.LJLJJLL) != null) {
                        c72808Sho.LJIILLIIL(collection);
                    }
                } else {
                    C72808Sho<InterfaceC57784Mm4> c72808Sho2 = this.LJLJJLL;
                    if (c72808Sho2 != null) {
                        c72808Sho2.LIZLLL(0, collection);
                    }
                }
            } else {
                C72808Sho<InterfaceC57784Mm4> c72808Sho3 = this.LJLJJLL;
                if (c72808Sho3 != null) {
                    c72808Sho3.LJ(collection);
                }
            }
        }
        if (value instanceof A2V) {
            int i2 = SZQ.LIZ[type.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        t = ((A2V) value).LIZJ;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    "not supported prev".toString();
                    throw new IllegalStateException("not supported prev");
                }
            } else {
                t = ((A2V) value).LIZJ;
            }
            this.LJLJJL = t;
            return;
        }
        if (!(value instanceof A2I)) {
        }
    }
}
