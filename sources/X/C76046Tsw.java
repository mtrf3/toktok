package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tsw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76046Tsw extends F9E implements InterfaceC28306B9a {
    public final String LJLIL;
    public EnumC76042Tss LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI)};
    }

    public C76046Tsw(String str, EnumC76042Tss expandState, int i) {
        o.LJIIIZ(expandState, "expandState");
        this.LJLIL = str;
        this.LJLILLLLZI = expandState;
        this.LJLJI = i;
    }
}
