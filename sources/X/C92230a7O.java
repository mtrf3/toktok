package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a7O, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92230a7O extends F9E implements InterfaceC91961a33 {
    public final List<InterfaceC91961a33> LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C92230a7O(List<? extends InterfaceC91961a33> list, String type) {
        o.LJIIIZ(type, "type");
        this.LJLIL = list;
        this.LJLILLLLZI = type;
    }
}
