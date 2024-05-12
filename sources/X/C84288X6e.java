package X;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.X6e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84288X6e extends AbstractC65781Prl implements InterfaceC88472Yns<List<Object>, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Collection<Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84288X6e(int i, int i2, Collection<Object> collection) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = collection;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<Object> list) {
        List<Object> modifyListState = list;
        o.LJIIIZ(modifyListState, "$this$modifyListState");
        int i = this.LJLIL;
        modifyListState.removeAll(modifyListState.subList(i, this.LJLILLLLZI + i));
        modifyListState.addAll(this.LJLIL, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
