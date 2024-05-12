package X;

import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import kotlin.jvm.internal.o;

/* renamed from: X.SZl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72309SZl<T> implements C8BG<T>, InterfaceC70422pa {
    public final PowerPageSource<T> LJLIL;
    public XKS LJLILLLLZI;
    public OSZ<? extends T, ? extends T> LJLJI;
    public final XIF LJLJJI;

    @Override // X.C8BG
    public final void LIZLLL(SZP type, A2G<T> value, boolean z) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(value, "value");
    }

    @Override // X.C8BG
    public final void refresh() {
        XKS xks = this.LJLILLLLZI;
        if (xks != null) {
            xks.LJJIJIL(null);
        }
        XKX.LIZLLL(this, null, null, new C72312SZo(this, null), 3);
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLJJI;
    }

    public C72309SZl(AbstractC72278SYg pageSource) {
        o.LJIIIZ(pageSource, "pageSource");
        this.LJLIL = pageSource;
        this.LJLJI = new OSZ<>(null, null);
        this.LJLJJI = EXZ.LIZ;
    }

    @Override // X.C8BG
    public final void LIZ(T t) {
        XKS xks = this.LJLILLLLZI;
        if (xks != null) {
            xks.LJJIJIL(null);
        }
        XKX.LIZLLL(this, null, null, new C72311SZn(this, t, null), 3);
    }

    @Override // X.C8BG
    public final void LIZIZ(T t) {
        XKS xks = this.LJLILLLLZI;
        if (xks != null) {
            xks.LJJIJIL(null);
        }
        XKX.LIZLLL(this, null, null, new C72310SZm(this, t, null), 3);
    }

    @Override // X.C8BG
    public final void LIZJ(SZP type) {
        o.LJIIIZ(type, "type");
        int i = C72308SZk.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                refresh();
                return;
            }
            LIZIZ(null);
            return;
        }
        LIZ(null);
    }
}
