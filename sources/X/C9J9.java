package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9J9, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9J9 extends F9E {
    public final Object LJLIL;
    public final InterfaceC65350Pko<? extends UIContentAssem> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C9J9(C9JT entrance, C65776Prg c65776Prg) {
        o.LJIIIZ(entrance, "entrance");
        this.LJLIL = entrance;
        this.LJLILLLLZI = c65776Prg;
    }
}
