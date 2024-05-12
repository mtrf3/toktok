package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8O, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92292a8O extends F9E implements InterfaceC87283bg {
    public final String LJLIL;
    public final EnumC92072a4q LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C92292a8O(String str, EnumC92072a4q pinSetMode, String str2) {
        o.LJIIIZ(pinSetMode, "pinSetMode");
        this.LJLIL = str;
        this.LJLILLLLZI = pinSetMode;
        this.LJLJI = str2;
    }
}
