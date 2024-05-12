package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RvE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71092RvE extends F9E implements C33Q {
    public final AbstractC72932td<OSZ<C71076Ruy, List<Object>>> LJLIL;

    public C71092RvE() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C71092RvE(AbstractC72932td<? extends OSZ<C71076Ruy, ? extends List<? extends Object>>> contentData) {
        o.LJIIIZ(contentData, "contentData");
        this.LJLIL = contentData;
    }

    public /* synthetic */ C71092RvE(int i) {
        this(C33X.LIZ);
    }
}
