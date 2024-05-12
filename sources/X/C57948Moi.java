package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Moi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57948Moi extends F9E {
    public final List<InterfaceC57861MnJ> LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57948Moi(List<? extends InterfaceC57861MnJ> processorList, int i) {
        o.LJIIIZ(processorList, "processorList");
        this.LJLIL = processorList;
        this.LJLILLLLZI = i;
    }
}
