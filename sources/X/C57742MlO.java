package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MlO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57742MlO extends F9E {
    public final String LJLIL;
    public final List<String> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C57742MlO(String formatString, List<String> nameList) {
        o.LJIIIZ(formatString, "formatString");
        o.LJIIIZ(nameList, "nameList");
        this.LJLIL = formatString;
        this.LJLILLLLZI = nameList;
    }
}
