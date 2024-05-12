package X;

import android.view.View;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.Tvl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76221Tvl<D> extends AbstractC76213Tvd<D> implements InterfaceC76075TtP {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;

    @Override // X.InterfaceC76075TtP
    public final C41081jM LJJJJZI() {
        return (C41081jM) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC76075TtP
    public final View LJJJLL() {
        return (View) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC76075TtP
    public final C47121t6 LJJLL() {
        return (C47121t6) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC76075TtP
    public final C2A7 LLLLLLLZIL() {
        return (C2A7) this.LJLJI.getValue();
    }

    public final C31597Caf N() {
        return (C31597Caf) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC76075TtP
    public final C47121t6 k() {
        return (C47121t6) this.LJLIL.getValue();
    }

    public AbstractC76221Tvl(View view) {
        super(view);
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLIL = C221108m2.LIZ(enumC221088m0, new AqS163S0100000_13(view, 28));
        this.LJLILLLLZI = C221108m2.LIZ(enumC221088m0, new AqS163S0100000_13(view, 26));
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS163S0100000_13(view, 25));
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, new AqS163S0100000_13(view, 27));
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS163S0100000_13(view, 29));
        this.LJLJJLL = C221108m2.LIZ(enumC221088m0, new AqS163S0100000_13(view, 30));
    }
}
