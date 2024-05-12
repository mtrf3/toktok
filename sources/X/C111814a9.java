package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4a9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111814a9 extends F9E {
    public final List<C111784a6> LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public C111814a9(List<C111784a6> reactionGroupList, int i) {
        o.LJIIIZ(reactionGroupList, "reactionGroupList");
        this.LJLIL = reactionGroupList;
        this.LJLILLLLZI = i;
    }
}
