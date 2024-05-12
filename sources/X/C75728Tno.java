package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tno, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75728Tno extends F9E {
    public final InterfaceC75179Tex LJLIL;
    public final EnumC75419Tip LJLILLLLZI;
    public final EnumC75419Tip LJLJI;
    public final int LJLJJI;

    public /* synthetic */ C75728Tno() {
        throw null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Integer.valueOf(this.LJLJJI)};
    }

    public C75728Tno(InterfaceC75179Tex window, EnumC75419Tip oldState, EnumC75419Tip newState, int i) {
        o.LJIIIZ(window, "window");
        o.LJIIIZ(oldState, "oldState");
        o.LJIIIZ(newState, "newState");
        this.LJLIL = window;
        this.LJLILLLLZI = oldState;
        this.LJLJI = newState;
        this.LJLJJI = i;
    }
}
