package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ny2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61074Ny2 extends F9E {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final String LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public C61074Ny2(float f, String str, InterfaceC65784Pro onHideCallback, InterfaceC65784Pro onShowCallback) {
        o.LJIIIZ(onHideCallback, "onHideCallback");
        o.LJIIIZ(onShowCallback, "onShowCallback");
        this.LJLIL = f;
        this.LJLILLLLZI = 1.0f;
        this.LJLJI = str;
        this.LJLJJI = onHideCallback;
        this.LJLJJL = onShowCallback;
    }
}
