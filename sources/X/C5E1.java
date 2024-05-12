package X;

import java.util.List;

/* renamed from: X.5E1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5E1 extends F9E {
    public final List<C1290754t> LJLIL;
    public final List<C1290754t> LJLILLLLZI;
    public final List<C1290754t> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C5E1(List<C1290754t> list, List<C1290754t> list2, List<C1290754t> list3) {
        C00F.LJ(list, "removed", list2, "add", list3, "all");
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = list3;
    }
}
