package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9I1, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9I1 extends F9E {
    public final C9IF LJLIL;
    public final InterfaceC65350Pko<? extends UIContentAssem> LJLILLLLZI;
    public final EnumC234329Ho LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C9I1(EnumC234329Ho maxStyle, C9IF type, C65776Prg c65776Prg) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(maxStyle, "maxStyle");
        this.LJLIL = type;
        this.LJLILLLLZI = c65776Prg;
        this.LJLJI = maxStyle;
    }
}
