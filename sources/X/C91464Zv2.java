package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Zv2, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91464Zv2 extends F9E implements C33Q {
    public final EnumC91294ZsI LJLIL;
    public final List<InterfaceC57784Mm4> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91464Zv2(EnumC91294ZsI status, List<? extends InterfaceC57784Mm4> powerItems) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(powerItems, "powerItems");
        this.LJLIL = status;
        this.LJLILLLLZI = powerItems;
    }
}
