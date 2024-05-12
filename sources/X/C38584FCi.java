package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FCi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38584FCi extends F9E {
    public final List<String> LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public C38584FCi(List<String> urlList, boolean z, boolean z2) {
        o.LJIIIZ(urlList, "urlList");
        this.LJLIL = urlList;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }
}
