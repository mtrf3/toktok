package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Az9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28019Az9 extends F9E {
    public final /* synthetic */ int LJLIL = 0;
    public final int LJLILLLLZI;
    public final Object LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        switch (this.LJLIL) {
            case 0:
                return new Object[]{Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
            default:
                return new Object[]{this.LJLJI, Integer.valueOf(this.LJLILLLLZI)};
        }
    }

    public C28019Az9(int i, String style) {
        o.LJIIIZ(style, "style");
        this.LJLILLLLZI = i;
        this.LJLJI = style;
    }

    public C28019Az9(InterfaceC55235Lm3 interfaceC55235Lm3, int i) {
        this.LJLJI = interfaceC55235Lm3;
        this.LJLILLLLZI = i;
    }
}
