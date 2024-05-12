package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.aEb, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92677aEb extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public final /* synthetic */ List<Integer> LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92677aEb(List<Integer> list, int i) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        ListProtector.set(this.LJLIL, this.LJLILLLLZI, Integer.valueOf(num.intValue()));
        return C76800UCe.LIZ;
    }
}
