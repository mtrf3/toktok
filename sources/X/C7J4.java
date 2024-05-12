package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7J4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7J4 extends F9E {
    public final EnumC183687Iu LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public C7J4(EnumC183687Iu statePassingAssem, String str, boolean z) {
        o.LJIIIZ(statePassingAssem, "statePassingAssem");
        this.LJLIL = statePassingAssem;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }
}
