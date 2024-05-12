package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Hj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C81393Hj extends TBS implements InterfaceC88471Ynr<List<? extends C3QL>, List<? extends C3QL>, OSZ<? extends List<? extends C3QL>, ? extends List<? extends C3QL>>> {
    public C81393Hj(Object obj) {
        super(2, obj, C3QE.class, "getSearchContentActionList", "getSearchContentActionList(Ljava/util/List;Ljava/util/List;)Lkotlin/Pair;", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final OSZ<? extends List<? extends C3QL>, ? extends List<? extends C3QL>> invoke(List<? extends C3QL> list, List<? extends C3QL> list2) {
        List<? extends C3QL> p0 = list;
        List<? extends C3QL> p1 = list2;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        this.receiver.getClass();
        java.util.Set LJZI = ORZ.LJZI(p0, ORZ.LLJJ(p1));
        return new OSZ<>(ORZ.LLJI(ORZ.LLILIL(p0, LJZI)), ORZ.LLJI(ORZ.LLILIL(p1, LJZI)));
    }
}
