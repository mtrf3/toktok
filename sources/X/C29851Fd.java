package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29851Fd extends F9E {
    public final Class<?> LJLIL;
    public final List<Class<? extends C0I6>> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C29851Fd(Class<?> cls, List<? extends Class<? extends C0I6>> totalApiClassList) {
        o.LJIIIZ(totalApiClassList, "totalApiClassList");
        this.LJLIL = cls;
        this.LJLILLLLZI = totalApiClassList;
    }
}
