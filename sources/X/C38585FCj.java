package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FCj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38585FCj extends F9E {
    public final List<String> LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public C38585FCj(List<String> urlList, boolean z, boolean z2) {
        o.LJIIIZ(urlList, "urlList");
        this.LJLIL = urlList;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }
}
